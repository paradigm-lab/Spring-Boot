package com.SpringFramework.service;

import com.SpringFramework.entity.Department;

import java.util.List;

public interface DepartmentService {
   public Department saveDepartment(Department department);
   public List<Department> fetchDepartmentList();
}
