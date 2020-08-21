package com.demo2.domain;

import java.io.Serializable;

/**
 * 封装 bean 中包含 bean 类型的参数
 */
public class Account implements Serializable {
    private String username;
    private User user;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", user=" + user +
                '}';
    }
}
