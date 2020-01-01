package com.wxh.NewServer.DAO;

import com.wxh.NewServer.Entity.User_system;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface User_SystemRepository extends JpaRepository<User_system, String> {
    User_system findByUsernameAndPassword(String username,String password);
}
