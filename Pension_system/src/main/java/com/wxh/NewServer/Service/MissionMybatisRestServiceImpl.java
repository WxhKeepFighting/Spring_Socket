package com.wxh.NewServer.Service;

import com.wxh.NewServer.Generator.Mission;
import com.wxh.NewServer.Generator.MissionDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class MissionMybatisRestServiceImpl implements MissionRestService {

    @Resource
    protected MissionDao missionDao;
    @Override
    public Mission saveMission(Mission mission) {
        missionDao.insert(mission);
        return null;
    }

    @Override
    public void deleteMission(Integer id) {
        missionDao.deleteByPrimaryKey(id);
    }

    @Override
    public void updateMission(Mission mission) {
        missionDao.updateByPrimaryKeySelective(mission);
    }

    @Override
    public Mission getMission(Integer id) {
        Mission mission = missionDao.selectByPrimaryKey(id);
        return mission;
    }

    @Override
    public List<Mission> getAll() {
        List<Mission> missions = missionDao.selectByExample(null);
        return missions;
    }
}
