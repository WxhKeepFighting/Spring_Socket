package com.wxh.NewServer.Service;

import com.wxh.NewServer.DAO.ServiceRepository;
import com.wxh.NewServer.Exception.CustomException;
import com.wxh.NewServer.Exception.CustomExceptionType;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class FWService {

    private ServiceRepository repository;

    public FWService(ServiceRepository repository){
        this.repository = repository;
    }

    public void update(com.wxh.NewServer.Entity.Service  service) throws CustomException {
        int i = repository.updateBymission_id(service.getStatus(), service.getEtime(), service.getEpic(), service.getId());
        if (i <= 0){
            throw new CustomException(CustomExceptionType.USER_INPUT_ERROR,"结束签到失败");
        }
    }

    public void save(com.wxh.NewServer.Entity.Service service) throws CustomException {
        com.wxh.NewServer.Entity.Service save = repository.save(service);
        if (save == null){
            throw new CustomException(CustomExceptionType.USER_INPUT_ERROR, "开始签到失败");
        }
    }

}
