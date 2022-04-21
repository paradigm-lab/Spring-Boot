package com.SpringFramework.service;

import com.SpringFramework.entity.Department;
import com.SpringFramework.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        departmentRepository.save(department);
        return null;
    }
}
