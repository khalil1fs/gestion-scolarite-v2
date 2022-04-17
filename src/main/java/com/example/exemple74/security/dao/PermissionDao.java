package com.example.exemple74.security.dao;

import com.example.exemple74.security.bean.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionDao extends JpaRepository<Permission,Long> {

    public Permission findByName(String name);

}
