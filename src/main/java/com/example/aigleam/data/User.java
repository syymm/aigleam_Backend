package com.example.aigleam.data;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

@Data
@JsonSerialize
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User implements UserDetails {

    private int id;
    private String username;
    private String password;

    // 用户权限列表
    private Collection<? extends GrantedAuthority> authorities;

    public User() {
        // 默认权限
        this.authorities = Collections.singletonList(new SimpleGrantedAuthority("ROLE_USER"));
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;  // 这里可以根据实际情况进行调整
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;  // 这里可以根据实际情况进行调整
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;  // 这里可以根据实际情况进行调整
    }

    @Override
    public boolean isEnabled() {
        return true;  // 这里可以根据实际情况进行调整
    }
}
