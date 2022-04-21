package com.SpringFramework.controller;

import com.SpringFramework.entity.Department;
import com.SpringFramework.service.DepartmentService;
import com.SpringFramework.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentServiceImpl departmentService;

    @RequestMapping(value = "/departments", method = RequestMethod.POST)
    public Department saveDepartment(@RequestBody Department department) {

        return departmentService.saveDepartment(department);
    }

    @RequestMapping(value = "/departments", method = RequestMethod.GET)
    public List<Department> fetchDepartmentList() {

        return departmentService.fetchDepartmentList();
    }

    @RequestMapping(value = "/departments/{id}", method = RequestMethod.GET)
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId) {

        return departmentService.fetchDepartmentById(departmentId);
    }

}
