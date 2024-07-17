package com.fan.aigleam.service;

import com.fan.aigleam.domain.ResponseResult;
import com.fan.aigleam.domain.User;

public interface LoginServcie {
    ResponseResult login(User user);
}
