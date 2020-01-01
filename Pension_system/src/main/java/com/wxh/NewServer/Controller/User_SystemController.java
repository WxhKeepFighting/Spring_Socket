package com.wxh.NewServer.Controller;

import com.wxh.NewServer.Entity.User_system;
import com.wxh.NewServer.Exception.AjaxResponse;
import com.wxh.NewServer.Service.UserService;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
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
    public List<AjaxResponse> loginVerify(@RequestParam String username, @RequestParam String password){
        User_system user_system = new User_system();
        List<AjaxResponse> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");
        list1.add("5");
        user_system.setUsername(username);
        user_system.setPassword(password);
        service.loginVerification(user_system);
        list.add(AjaxResponse.success(list1));
        return list;
    }

}
