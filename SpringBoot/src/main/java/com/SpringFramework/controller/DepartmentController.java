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

    @RequestMapping(value = "/departments/{id}", method = RequestMethod.DELETE)
    public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
        departmentService.deleteDepartmentById(departmentId);
        return "Department deleted Successfully!!";
    }

    @RequestMapping(value = "/departments/{id}", method = RequestMethod.PUT)
    public Department updateDepartment(@PathVariable("id") Long departmentId, @RequestBody Department department) {
        return departmentService.updateDepartment(departmentId, department);
    }

    @RequestMapping(value = "/departments/name/{name}", method = RequestMethod.GET)
    public Department fetchDepartmentByName(@PathVariable("name") String departmentName) {

        return departmentService.fetchDepartmentByName(departmentName);
    }

}
