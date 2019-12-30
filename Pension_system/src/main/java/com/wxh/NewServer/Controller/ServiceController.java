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
    public @ResponseBody AjaxResponse startService(@RequestBody Service service){
        fwService.startService(service);
        return AjaxResponse.success();
    }

    //结束服务
    @PutMapping(value = "/service/end")
    public @ResponseBody AjaxResponse endService(@RequestBody Service service){
        fwService.endService(service);
        return AjaxResponse.success();
    }

}
