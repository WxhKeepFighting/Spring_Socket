package com.wxh.NewServer.Controller;

import com.wxh.NewServer.Service.MissionRestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class MissionController {

    @Resource(name = "missionMybatisRestServiceImpl")
    MissionRestService missionRestService;
}
