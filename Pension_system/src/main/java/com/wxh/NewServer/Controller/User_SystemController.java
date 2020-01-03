package com.wxh.NewServer.Controller;

import com.wxh.NewServer.Exception.AjaxResponse;
import com.wxh.NewServer.Generator.UserSystem;
import com.wxh.NewServer.Service.UserSystemRestService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@CrossOrigin("*")
public class User_SystemController {

    @Resource(name = "userSystemMybatisRestServiceImpl")
    UserSystemRestService userSystemRestService;

    //登录验证
    @GetMapping(value = "/login")
    public @ResponseBody AjaxResponse loginVerify(@RequestParam String username, @RequestParam String password){
        UserSystem user_system = new UserSystem();
        user_system.setsId(username);
        user_system.setsPassword(password);
//        user_system.loginVerification(user_system);
        return AjaxResponse.success();
    }

    @GetMapping(value = "/users/{id}")
    public void findOne(@PathVariable String id){
        UserSystem userSystem = userSystemRestService.getUserSystem(id);
        System.out.println("-------"+userSystem);
    }

}
