package com.microservicesPOC.UserManagementSys.ValueObject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private Long did;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}
