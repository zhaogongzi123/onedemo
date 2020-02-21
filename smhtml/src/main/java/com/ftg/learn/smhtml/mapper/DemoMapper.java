package com.ftg.learn.smhtml.mapper;

import com.ftg.learn.smhtml.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DemoMapper {

    @Select("select * from dept")
    public List<Dept> show();

}
