package com.wxh.NewServer.Controller;

import com.alibaba.fastjson.JSON;
import com.wxh.NewServer.Entity.TransJson;
import com.wxh.NewServer.Entity.User_system;
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
    public List<AjaxResponse>loginVerify(@RequestParam String username, @RequestParam String password){
        User_system user_system = new User_system();
        List<AjaxResponse> list = new ArrayList<>();
        user_system.setUsername(username);
        user_system.setPassword(password);
        TransJson transJson = service.loginVerification(user_system);
        String string = JSON.toJSONString(transJson);
        System.out.println(string);
        list.add(AjaxResponse.success(string));
        return list;
    }

}
