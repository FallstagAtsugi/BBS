package com.example.BBS.mapper;

import com.example.BBS.entity.Entity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public  interface BbsMapper {

    public  List<Entity> selectAll();

}
