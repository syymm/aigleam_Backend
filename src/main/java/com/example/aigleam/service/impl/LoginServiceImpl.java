package com.example.aigleam.service.impl;

import com.example.aigleam.data.Result;
import com.example.aigleam.data.User;
import com.example.aigleam.data.UserData;
import com.example.aigleam.service.LoginService;
import com.example.aigleam.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    AuthenticationManager authenticationManager;



    public Result login(UserData userData) {


        UsernamePasswordAuthenticationToken authenticationToken;
        authenticationToken = new UsernamePasswordAuthenticationToken(userData.getUsername(), userData.getPassword());


        Authentication authenticate = authenticationManager.authenticate(authenticationToken);


        if(Objects.isNull(authenticate)){
            throw new RuntimeException("登录失败");
        }

        User user = (User) authenticate.getPrincipal();
        String userid = user.getId().toString();
        String jwt = JwtUtil.createJWT(userid);
        Map<String, String> map = new HashMap<>();
        map.put("token",jwt);

        return new Result(map,200,"登陆成功");
    }
}

