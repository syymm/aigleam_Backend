package com.example.aigleam.mapper;

import com.example.aigleam.data.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select * from user where username = #{username}")
    User selectUserByUsername(String username);
}
