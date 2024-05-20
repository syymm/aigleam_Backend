package com.example.aigleam.mapper;

import com.example.aigleam.data.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM user WHERE username = #{username}")
    User getUserByUsername(String username);
}
