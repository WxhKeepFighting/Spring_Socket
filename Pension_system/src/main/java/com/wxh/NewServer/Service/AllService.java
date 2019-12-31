package com.wxh.NewServer.Service;

import com.alibaba.fastjson.JSONObject;
import com.wxh.NewServer.Entity.Mission;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class AllService {

    private FWService fwService;
    private MissionService missionService;

    public AllService(FWService fwService, MissionService missionService){
        this.fwService = fwService;
        this.missionService = missionService;
    }
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

        mission.setMission_id(mission_id);
        mission.setStatus(status);
        mission.setApplicant_id(applicant_id);
        mission.setVolunteer_id(volunteer_id);
        mission.setEvent_id(event_id);

        service.setId(mission_id);
        service.setSpic(service_spic);
        service.setStime(service_stime);
        service.setStatus(status);

        missionService.save(mission);
        fwService.save(service);
    }

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

        mission.setMission_id(mission_id);
        mission.setStatus(status);
        mission.setApplicant_id(applicant_id);
        mission.setVolunteer_id(volunteer_id);
        mission.setEvent_id(event_id);

        service.setId(mission_id);
        service.setEpic(service_epic);
        service.setEtime(service_etime);
        service.setStatus(status);

        fwService.update(service);
        missionService.update(mission);
    }
}
