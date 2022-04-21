package com.SpringFramework.controller;

import com.SpringFramework.entity.Department;
import com.SpringFramework.service.DepartmentService;
import com.SpringFramework.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentServiceImpl departmentService;

    @RequestMapping(value = "/departments", method = RequestMethod.POST)
    public Department saveDepartment(@RequestBody Department department) {

        return departmentService.saveDepartment(department);
    }
}
