package com.SpringFramework.controller;

import com.SpringFramework.entity.Department;
import com.SpringFramework.error.DepartmentNotFoundException;
import com.SpringFramework.service.DepartmentService;
import com.SpringFramework.service.DepartmentServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @RequestMapping(value = "/departments", method = RequestMethod.POST)
    public Department saveDepartment(@Valid @RequestBody Department department) {
        LOGGER.info("Inside SaveDepartment of DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @RequestMapping(value = "/departments", method = RequestMethod.GET)
    public List<Department> fetchDepartmentList() {
        LOGGER.info("Inside fetchDepartmentList of DepartmentController");
        return departmentService.fetchDepartmentList();
    }

    @RequestMapping(value = "/departments/{id}", method = RequestMethod.GET)
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId) throws DepartmentNotFoundException {

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
