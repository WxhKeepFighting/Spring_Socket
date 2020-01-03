package com.wxh.NewServer.Service;

import com.alibaba.fastjson.JSONObject;
import com.wxh.NewServer.DAO.EventRepository;
import com.wxh.NewServer.Entity.Mission;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

@Service
@Transactional
public class AllService {

    @Resource
    private FWService fwService;
    @Resource
    private MissionService missionService;
    @Resource
    private EventRepository eventRepository;

    //开始服务
    public void startService(JSONObject jsonObject){

        Mission mission = new Mission();
        com.wxh.NewServer.Entity.Service service = new com.wxh.NewServer.Entity.Service();

        String volunteer_id = jsonObject.getString("volunteer_id");
        String service_stime = jsonObject.getString("service_stime");
        String event_id = jsonObject.getString("event_id");
        String applicant_id = jsonObject.getString("applicant_id");
        String service_spic = jsonObject.getString("service_spic");
        String mission_id = jsonObject.getString("mission_id");
        String status = jsonObject.getString("status");

        mission.setMid(mission_id);
        mission.setStatus(status);
        mission.setAid(applicant_id);
        mission.setVid(volunteer_id);
        mission.setEid(event_id);

        service.setMid(mission_id);
        service.setSpic(service_spic);
        service.setStime(service_stime);
        service.setStatus(status);

        missionService.save(mission);
        fwService.save(service);
    }

    //结束服务
    public void endService(JSONObject jsonObject){
        Mission mission = new Mission();
        com.wxh.NewServer.Entity.Service service = new com.wxh.NewServer.Entity.Service();

        String volunteer_id = jsonObject.getString("volunteer_id");
        String service_etime = jsonObject.getString("service_etime");
        String event_id = jsonObject.getString("event_id");
        String applicant_id = jsonObject.getString("applicant_id");
        String service_epic = jsonObject.getString("service_epic");
        String mission_id = jsonObject.getString("mission_id");
        String status = jsonObject.getString("status");

        mission.setMid(mission_id);
        mission.setStatus(status);
        mission.setAid(applicant_id);
        mission.setVid(volunteer_id);
        mission.setEid(event_id);

        service.setMid(mission_id);
        service.setEpic(service_epic);
        service.setEtime(service_etime);
        service.setStatus(status);

        fwService.update(service);
        missionService.update(mission);
    }

    //统计志愿者信息
    public void Statistics(){

    }

}
