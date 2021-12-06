package com.microservicepractice.department.Entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Getter
@Setter
@Document(collection = "Department")
public class Department {
    @Id
    private Long did;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;

}
