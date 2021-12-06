package com.microservicesPOC.UserManagementSys.ValueObject;

import com.microservicesPOC.UserManagementSys.Entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplateVO {

    @Autowired
    private User user;

    @Autowired
    private Department department;
}
