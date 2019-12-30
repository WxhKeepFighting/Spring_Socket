package com.wxh.NewServer.Service;

import com.wxh.NewServer.DAO.ServiceRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class FWService {

    private ServiceRepository repository;

    public FWService(ServiceRepository repository){
        this.repository = repository;
    }

    public void endService(com.wxh.NewServer.Entity.Service  service){
        repository.updateBymission_id(service.getStatus(),service.getEtime(),service.getEpic(),service.getId());
    }

    public void startService(com.wxh.NewServer.Entity.Service service){
        repository.save(service);
    }

}
