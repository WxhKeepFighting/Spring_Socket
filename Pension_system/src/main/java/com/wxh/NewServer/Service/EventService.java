package com.wxh.NewServer.Service;

import com.wxh.NewServer.DAO.EventRepository;
import com.wxh.NewServer.Entity.Event;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EventService {

    @Resource
    private EventRepository repository;

    //保存事件
    public void save(Event event){
        repository.save(event);
    }

    //查询所有事件
    public List<Event> findAll(){
        List<Event> list = repository.findAll();
        return list;
    }
    
}
