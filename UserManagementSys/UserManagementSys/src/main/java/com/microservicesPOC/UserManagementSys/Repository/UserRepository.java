package com.microservicesPOC.UserManagementSys.Repository;

import com.microservicesPOC.UserManagementSys.Entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, Long> {
}
