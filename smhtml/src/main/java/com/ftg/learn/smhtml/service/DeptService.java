package com.ftg.learn.smhtml.service;


import com.ftg.learn.smhtml.mapper.DemoMapper;
import com.ftg.learn.smhtml.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptService {

    @Autowired
    DemoMapper demoMapper ;

    public List<Dept> showAll(){
        return demoMapper.show();
    }

}
