package com.wxh.NewServer.Service;

import com.wxh.NewServer.DAO.MissionRepository;
import com.wxh.NewServer.DAO.ServiceRepository;
import com.wxh.NewServer.DAO.User_SystemRepository;
import com.wxh.NewServer.Entity.Mission;
import com.wxh.NewServer.Entity.TransJson;
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

    public TransJson loginVerification(User_system user_system) throws CustomException {
        //用户查询
        User_system user = repository.findByUsernameAndPassword(user_system.getUsername(), user_system.getPassword());
        System.out.println(user);
        if (user == null){
            //如果没查询到则抛出异常
            throw new CustomException(CustomExceptionType.USER_INPUT_ERROR, "请输入正确的用户名和密码");
        }else {
            //查询成功，在验证是否存在未完成的服务
            Mission mission = missionRepository.findByStatusAndVid("1", user.getUsername());
            System.out.println("任务为"+mission);
            if (mission == null){
                //查询失败，不存在未完成任务
                return null;
            }else {
                System.out.println("存在未完成的任务");
                //存在未完成的任务，将开始服务的信息给传过去
                String mid = mission.getMid();
                String vid = mission.getVid();
                String eid = mission.getEid();
                String status = mission.getStatus();
                String aid = mission.getAid();

                com.wxh.NewServer.Entity.Service service = serviceRepository.findByMid(mid);
                String stime = service.getStime();
                String spic = service.getSpic();

                TransJson transJson = new TransJson();
                transJson.setApplicant_id(aid);
                transJson.setEvent_id(eid);
                transJson.setMission_id(mid);
                transJson.setVolunteer_id(vid);
                transJson.setStatus(status);
                transJson.setService_stime(stime);
                transJson.setService_spic(spic);
                return transJson;

            }
        }
    }
}
