package com.wxh.NewServer.Controller;

import com.wxh.NewServer.Entity.User_system;
import com.wxh.NewServer.Exception.AjaxResponse;
import com.wxh.NewServer.Service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class User_SystemController {

    private UserService service;
    public User_SystemController(UserService service){
        this.service = service;
    }

    //登录验证
    @GetMapping(value = "/login")
    public @ResponseBody AjaxResponse loginVerify(@RequestParam String username, @RequestParam String password){
        User_system user_system = new User_system();
        user_system.setUsername(username);
        user_system.setPassword(password);
        service.loginVerification(user_system);
        return AjaxResponse.success();
    }

}
