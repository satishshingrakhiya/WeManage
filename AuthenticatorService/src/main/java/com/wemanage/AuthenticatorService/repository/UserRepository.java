package com.wemanage.AuthenticatorService.repository;

import com.wemanage.AuthenticatorService.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    public User findByUsernameAndPassword(String userName, String password);
}
