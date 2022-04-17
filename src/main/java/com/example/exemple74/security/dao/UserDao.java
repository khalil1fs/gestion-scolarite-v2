package com.example.exemple74.security.dao;

import com.example.exemple74.security.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Long> {

    User findByUsername(String username);

    int deleteByUsername(String username);

    User findByEmail(String email);

}
