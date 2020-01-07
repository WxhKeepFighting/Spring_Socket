package com.wxh.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MissionController {

    @GetMapping("/mission/{id}")
    public void findAll(@PathVariable Integer id){
    }
}
