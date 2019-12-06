package com.wxh.NewServer.Service;

import com.wxh.NewServer.DAO.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class FWService {
    @Autowired
    private ServiceRepository repository;
    public FWService(){}
    public int update(com.wxh.NewServer.Entity.Service  service){
        return repository.updateBymission_id(service.getService_status(),service.getService_etime(),service.getService_epic(),service.getMission_id());
    }
}
