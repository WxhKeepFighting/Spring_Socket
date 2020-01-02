package com.wxh.NewServer.Service;

import com.wxh.NewServer.Generator.Mission;

import java.util.List;

public interface MissionRestService {
    Mission saveMission(Mission mission);
    void deleteMission(Integer id);
    void updateMission(Mission mission);
    Mission getMission(Integer id);
    List<Mission> getAll();
}
