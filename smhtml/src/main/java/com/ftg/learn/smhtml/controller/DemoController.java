package com.ftg.learn.smhtml.controller;

import com.ftg.learn.smhtml.pojo.Dept;
import com.ftg.learn.smhtml.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/dept")

public class DemoController {


    @Autowired
    DeptService deptService;

    @PostMapping("/showDept")
    public Map<String,Object> showall(){
        Map<String,Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("data", deptService.showAll());
        return map;//转
    }



}
