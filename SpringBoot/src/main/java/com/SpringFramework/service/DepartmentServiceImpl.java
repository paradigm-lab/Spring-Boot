package com.SpringFramework.service;

import com.SpringFramework.entity.Department;
import com.SpringFramework.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        departmentRepository.save(department);
        return null;
    }

    @Override
    public List<Department> fetchDepartmentList() {

        return departmentRepository.findAll();
    }
}
