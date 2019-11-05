package com.xzh.clothes.UserModule;

import com.xzh.clothes.command.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：xiaonuolen
 * @date ：Created in 2019/11/5 10:02
 * @description：
 * @modified By：
 * @version: $
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    public Integer addUser(UserDo userDo){
        return userMapper.addUser(userDo);

    }
    public List<UserDo> queryUser(String userName, String userPhone){

        return userMapper.queryUser(userName,userPhone);
    }
    public Integer deleteUser(String userName, String userPhone){


        return userMapper.deleteUser(userName,userPhone);
    }
}
