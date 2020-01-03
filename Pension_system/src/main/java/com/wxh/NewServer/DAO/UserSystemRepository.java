package com.wxh.NewServer.DAO;

import com.wxh.NewServer.Entity.UserSystem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSystemRepository extends JpaRepository<UserSystem, String> {
    UserSystem findByUsernameAndPassword(String username, String password);
}
