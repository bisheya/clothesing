package com.xzh.clothes.UserModule;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
public interface UserMapper {
    public Integer addUser(UserDo userDo);
    public List<UserDo> queryUser(@Param(value = "userName") String userName,@Param(value = "userPhone") String userPhone);
    public Integer deleteUser(String userName,String userPhone);
}
