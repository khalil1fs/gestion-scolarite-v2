package com.example.exemple74.security.dao;

import com.example.exemple74.security.bean.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoleDao extends JpaRepository<Role,Long> {

    Role findByAuthority(String authority);

    int deleteByAuthority(String authority);

    List<Role> findAllByUsersUsername(String username);

}
