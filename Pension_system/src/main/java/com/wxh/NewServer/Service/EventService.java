package com.wxh.NewServer.Service;

import com.wxh.NewServer.DAO.EventRepository;
import com.wxh.NewServer.Entity.Event;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class EventService {

    private EventRepository repository;
    public EventService(EventRepository repository){
        this.repository = repository;
    }

    public void save(Event event){
        repository.save(event);
    }
}
