package com.microservicesPOC.UserManagementSys.Service;

import com.microservicesPOC.UserManagementSys.Entity.User;
import com.microservicesPOC.UserManagementSys.Repository.UserRepository;
import com.microservicesPOC.UserManagementSys.ValueObject.Department;
import com.microservicesPOC.UserManagementSys.ValueObject.ResponseTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public String saveUser(User user) {
        userRepository.save(user);
        return "User added";
    }

    public ResponseTemplateVO getUserWithDep(Long id) {
        ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO();
        User user = userRepository.findById(id).orElse(new User());
        Department department =
                restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments" + user.getDId()
                        , Department.class);
        responseTemplateVO.setUser(user);
        responseTemplateVO.setDepartment(department);
        return responseTemplateVO;
    }

    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    public void delete(@PathVariable Long id) {
        userRepository.deleteById(id);
    }

}

