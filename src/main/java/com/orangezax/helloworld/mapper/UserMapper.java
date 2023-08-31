package com.orangezax.helloworld.mapper;

import com.orangezax.helloworld.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from user")
    public List<UserInfo> find();

}
