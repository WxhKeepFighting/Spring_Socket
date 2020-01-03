package com.wxh.NewServer.Controller;

import com.alibaba.fastjson.JSONObject;
import com.wxh.NewServer.Entity.Event;
import com.wxh.NewServer.MyEntity.TotalInfo;
import com.wxh.NewServer.Exception.AjaxResponse;
import com.wxh.NewServer.Service.AllService;
import com.wxh.NewServer.Service.EventService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")
public class ServiceController {

    @Resource
    private AllService service;
    @Resource
    private EventService eventService;

    //开始服务
    @PostMapping(value = "/service/startService")
    public TotalInfo startService(@RequestBody JSONObject jsonObject){
        service.startService(jsonObject);
        List<AjaxResponse> infoList=new ArrayList<>();
        infoList.add(AjaxResponse.success());
        return new TotalInfo(infoList);
    }

    //结束服务
    @PutMapping(value = "/service/endService")
    public TotalInfo endService(@RequestBody JSONObject jsonObject){
        service.endService(jsonObject);
        List<AjaxResponse> infoList=new ArrayList<>();
        infoList.add(AjaxResponse.success());
        return new TotalInfo(infoList);
    }

    //查询所有事件
    @GetMapping(value = "/events")
    public TotalInfo findAllEvents(){
        List<Event> all = eventService.findAll();
        List<Object> list = new ArrayList<>(all);
        List<AjaxResponse> responseList = new ArrayList<>();
        responseList.add(AjaxResponse.success(list));
        return new TotalInfo(responseList);
    }

    //服务统计
    @GetMapping(value = "/rank")
    public AjaxResponse rankList(){

        return AjaxResponse.success();
    }

}
