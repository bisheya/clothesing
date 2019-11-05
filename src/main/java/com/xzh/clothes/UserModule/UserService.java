package com.xzh.clothes.UserModule;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：xiaonuolen
 * @date ：Created in 2019/11/5 10:02
 * @description：
 * @modified By：
 * @version: $
 */
public interface UserService {
    public Integer addUser(UserDo userDo);
    public List<UserDo> queryUser(String userName, String userPhone);
    public Integer deleteUser(String userName,String userPhone);
}
