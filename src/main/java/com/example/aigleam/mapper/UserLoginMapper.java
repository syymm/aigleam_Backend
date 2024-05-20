package com.example.aigleam.mapper;

import com.example.aigleam.data.UserLoginData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;



@Mapper
public interface UserLoginMapper {

    @Select("SELECT * FROM user WHERE username = #{username}")
    UserLoginData getUserByUsername(String username);

}
