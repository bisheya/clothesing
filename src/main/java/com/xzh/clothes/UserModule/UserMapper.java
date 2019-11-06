package com.xzh.clothes.UserModule;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
public interface UserMapper {
     /**
      增加用户
      */
     Integer addUser(UserDo userDo);
     /**
      查询用户
      */
     List<UserDo> queryUser(@Param(value = "userName") String userName,@Param(value = "userPhone") String userPhone);
     /**
      删除用户
      */
     Integer deleteUser( String  userName );
     /**
      用户登录
      */
     UserDo  selectUser(@Param(value = "userName") String userName,@Param(value = "userPass") String userPass);
     /**
      用户修改信息
      */
     Integer  updateUser(UserDo userDo);


}
