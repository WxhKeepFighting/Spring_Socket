package com.wxh.NewServer.Controller;

import com.alibaba.fastjson.JSONObject;
import com.wxh.NewServer.Exception.AjaxResponse;
import com.wxh.NewServer.Service.MissionRestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@CrossOrigin("*")
@Slf4j
public class ServiceController {


//    //开始服务
//    @PostMapping(value = "/service/startService")
//    public @ResponseBody AjaxResponse startService(@RequestBody JSONObject jsonObject){
//        service.startService(jsonObject);
//        return AjaxResponse.success();
//    }
//
//    //结束服务
//    @PutMapping(value = "/service/endService")
//    public @ResponseBody AjaxResponse endService(@RequestBody JSONObject jsonObject){
//        service.endService(jsonObject);
//        return AjaxResponse.success();
//    }
//
//    //服务统计
//    public @ResponseBody AjaxResponse rankList(){
//
//        return AjaxResponse.success();
//    }

}
