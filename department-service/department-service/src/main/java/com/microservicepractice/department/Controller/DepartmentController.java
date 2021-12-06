package com.microservicepractice.department.Controller;


import com.microservicepractice.department.Entity.Department;
import com.microservicepractice.department.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {


    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/save")
    public Department saveDepartment(@RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/get/{dId}")
    public Department getDep(@PathVariable Long dId) {
        return departmentService.getDep(dId);
    }

    @GetMapping("/findAll")
    public List<Department> getAllDepartment() {
        return departmentService.getAllDepartment();
    }

    @DeleteMapping("/delete/{dId}")
    public String delete(@PathVariable Long dId) {
        departmentService.delete(dId);
        return "department deleted successfully";
    }

}
