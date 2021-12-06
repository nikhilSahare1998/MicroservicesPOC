package com.microservicepractice.department.Service;

import com.microservicepractice.department.Entity.Department;
import com.microservicepractice.department.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }


    public Department getDep(Long dId) {
        return departmentRepository.findById(dId).orElse(new Department());
    }

    public List<Department> getAllDepartment() {
        return departmentRepository.findAll();
    }


    public String delete(Long dId) {
        departmentRepository.deleteById(dId);
        return "department deleted successfully";
    }
}
