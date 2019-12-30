package com.wxh.NewServer.Controller;

import com.wxh.NewServer.Entity.Service;
import com.wxh.NewServer.Exception.AjaxResponse;
import com.wxh.NewServer.Service.FWService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class ServiceController {

    private FWService fwService;
    public ServiceController(FWService service){
        this.fwService = service;
    }

    //开始服务
    @PostMapping(value = "/service/start")
    public @ResponseBody AjaxResponse startService(@RequestParam String id, @RequestParam String stime, @RequestParam String spic, @RequestParam String status){
        Service service = new Service();
        service.setId(id);
        service.setSpic(spic);
        service.setStatus(status);
        service.setStime(stime);
        fwService.startService(service);
        return AjaxResponse.success();
    }

    //结束服务
    @PutMapping(value = "/service/end")
    public @ResponseBody AjaxResponse endService(@RequestParam String id, @RequestParam String etime, @RequestParam String epic, @RequestParam String status){
        Service service = new Service();
        service.setId(id);
        service.setEpic(epic);
        service.setEtime(etime);
        service.setStatus(status);
        fwService.endService(service);
        return AjaxResponse.success();
    }

}
