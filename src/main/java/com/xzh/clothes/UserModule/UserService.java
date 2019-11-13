package com.xzh.clothes.UserModule;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author ：xiaonuolen
 * @date ：Created in 2019/11/5 10:02
 * @description：
 * @modified By：
 * @version: $
 */
public interface UserService {
     Integer addUser(UserDo userDo);
     List<UserDo> queryUser(String userName, Date beginTime, Date endTime);
     Integer deleteUser(String userName);
     UserDo selectUser(String userName, String userPass);
     Integer updateUser(UserDo userDo);
}
