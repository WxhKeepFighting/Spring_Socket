package com.wxh.NewServer.Service;

import com.wxh.NewServer.DAO.MissionRepository;
import com.wxh.NewServer.DAO.ServiceRepository;
import com.wxh.NewServer.DAO.User_SystemRepository;
import com.wxh.NewServer.Entity.Mission;
import com.wxh.NewServer.Entity.User_system;
import com.wxh.NewServer.Exception.CustomException;
import com.wxh.NewServer.Exception.CustomExceptionType;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserService {

    private User_SystemRepository repository;
    private MissionRepository missionRepository;
    private ServiceRepository serviceRepository;

    public UserService(User_SystemRepository repository, MissionRepository missionRepository, ServiceRepository serviceRepository){

        this.repository = repository;
        this.missionRepository = missionRepository;
        this.serviceRepository = serviceRepository;

    }

    public Object loginVerification(User_system user_system) throws CustomException {
        //用户查询
        User_system user = repository.findByUsernameAndPassword(user_system.getUsername(), user_system.getPassword());
        if (user == null){
            //如果没查询到则抛出异常
            throw new CustomException(CustomExceptionType.USER_INPUT_ERROR, "请输入正确的用户名和密码");
        }else {
            //查询成功，在验证是否存在未完成的服务
            Mission mission = missionRepository.findByMission_idAndStatusEquals(user.getUsername(), "1");
            if (mission == null){
                //查询失败，不存在未完成任务
                return null;
            }else {
                //存在未完成的任务，将开始服务的信息给传过去
                Mission byStatus = missionRepository.findByStatus("1");
                
            }
        }

    }
}
