package com.microservicepractice.department.Repository;

import com.microservicepractice.department.Entity.Department;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends MongoRepository<Department, Long> {

}
