package com.microservicesPOC.UserManagementSys.Controller;


import com.microservicesPOC.UserManagementSys.Entity.User;
import com.microservicesPOC.UserManagementSys.Service.UserService;
import com.microservicesPOC.UserManagementSys.ValueObject.ResponseTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("")
    public String saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUser(@PathVariable Long id) {
        return userService.getUserWithDep(id);
    }

    @GetMapping("/findAll")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }

    @DeleteMapping("/remove/{id}")
    public void delete(@PathVariable Long id) {
        userService.delete(id);

    }


}
