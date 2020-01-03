package com.wxh.NewServer.DAO;

import com.wxh.NewServer.Entity.UserVolunteer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserVolunteerRepository extends JpaRepository<UserVolunteer, String> {
}
