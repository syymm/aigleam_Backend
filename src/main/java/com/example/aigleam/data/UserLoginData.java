package com.example.aigleam.data;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserLoginData implements Serializable {

    private static final long serialVersionUID = 1L;

    private String username;
    private String password;
}
