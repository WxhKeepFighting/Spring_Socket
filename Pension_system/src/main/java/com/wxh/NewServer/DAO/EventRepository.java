package com.wxh.NewServer.DAO;

import com.wxh.NewServer.Entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, String> {
}
