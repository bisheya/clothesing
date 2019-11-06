package com.xzh.clothes.UserModule;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

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
     List<UserDo> queryUser(@Param(value = "userName") String userName,@Param(value = "userPhone") String userPhone);
     /**
      ɾ���û�
      */
     Integer deleteUser( String  userName );
     /**
      �û���¼
      */
     UserDo  selectUser(@Param(value = "userName") String userName,@Param(value = "userPass") String userPass);
     /**
      �û��޸���Ϣ
      */
     Integer  updateUser(UserDo userDo);


}
