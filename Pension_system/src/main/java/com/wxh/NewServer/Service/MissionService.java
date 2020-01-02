package com.wxh.NewServer.Service;

import com.wxh.NewServer.DAO.MissionRepository;
import com.wxh.NewServer.Entity.Mission;
import com.wxh.NewServer.Exception.CustomException;
import com.wxh.NewServer.Exception.CustomExceptionType;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class MissionService {
    private MissionRepository repository;
    public MissionService(MissionRepository repository){
        this.repository = repository;
    }

    public void save(Mission mission) throws CustomException{
        Mission save = repository.save(mission);
        if (save == null){
            throw new CustomException(CustomExceptionType.USER_INPUT_ERROR, "开始签到失败");
        }
    }

    public void update(Mission mission) throws CustomException {
        int i = repository.updateByMid(mission.getStatus(), mission.getMid());
        if (i<=0){
            throw new CustomException(CustomExceptionType.USER_INPUT_ERROR, "结束签到失败");
        }
    }
}
