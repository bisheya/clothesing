package com.xzh.clothes.UserModule;

import com.xzh.clothes.command.Message;
import org.springframework.beans.factory.annotation.Autowired;
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
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public Integer addUser(UserDo userDo){
        return userMapper.addUser(userDo);
    }

    @Override
    public List<UserDo> queryUser(String userName, Date beginTime, Date endTime){
        return userMapper.queryUser(userName,beginTime,endTime);
    }

    @Override
    public Integer deleteUser(String userName){
        return userMapper.deleteUser(userName);
    }

    @Override
    public UserDo selectUser(String userName, String userPass){
        return  userMapper.selectUser(userName,userPass);
    }

    @Override
    public Integer updateUser(UserDo userDo) {
        return userMapper.updateUser(userDo);
    }

    @Override
    public Integer updateBirthday(UserDo userDo) {
        return userMapper.updateBirthday(userDo);
    }

}
