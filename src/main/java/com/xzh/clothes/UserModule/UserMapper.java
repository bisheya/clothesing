package com.xzh.clothes.UserModule;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


import java.util.Date;
import java.util.List;

@Mapper
public interface UserMapper {
     /**
      �����û�
      */
     Integer addUser(UserDo userDo);
     /**
      ��ѯ�û�
      */
     List<UserDo> queryUser(@Param(value = "userName") String userName,@Param(value = "beginTime") Date beginTime,@Param(value = "endTime") Date endTime);
     /**
      ɾ���û�
      */
     Integer deleteUser(@Param(value = "userName") String  userName );
     /**
      �û���¼
      */
     UserDo  selectUser(@Param(value = "userName") String userName,@Param(value = "userPass") String userPass);
     /**
      �û��޸���Ϣ
      */
     Integer  updateUser(UserDo userDo);

     Integer  updateBirthday(UserDo userDo);

}
