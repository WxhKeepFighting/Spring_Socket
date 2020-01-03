package com.wxh.NewServer.Controller;

import com.wxh.NewServer.Generator.Mission;
import com.wxh.NewServer.Service.MissionRestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
public class MissionController {

    @Resource(name = "missionMybatisRestServiceImpl")
    MissionRestService missionRestService;

    @GetMapping("/mission/{id}")
    public void findAll(@PathVariable Integer id){
        Mission mission = missionRestService.getMission(id);
        System.out.println(mission);
    }
}
