package com.wxh.NewServer.Controller;

import com.wxh.NewServer.MyEntity.TotalInfo;
import com.wxh.NewServer.MyEntity.TransJson;
import com.wxh.NewServer.Entity.UserSystem;
import com.wxh.NewServer.Exception.AjaxResponse;
import com.wxh.NewServer.Service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")
public class User_SystemController {

    private UserService service;
    public User_SystemController(UserService service){
        this.service = service;
    }

    //登录验证
    @GetMapping(value = "/login")
    public TotalInfo loginVerify(@RequestParam String username, @RequestParam String password){
        UserSystem user_system = new UserSystem();
        user_system.setUsername(username);
        user_system.setPassword(password);
        TransJson transJson = service.loginVerification(user_system);
        List<Object> list=new ArrayList<>();
        list.add(transJson);
        List<AjaxResponse> infoList=new ArrayList<>();
        infoList.add(AjaxResponse.success(list));
        return new TotalInfo(infoList);
    }

}
