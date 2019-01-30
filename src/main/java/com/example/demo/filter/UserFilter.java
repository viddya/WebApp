package com.example.demo.filter;

import java.io.Serializable;


public class UserFilter implements Serializable {

    protected Long userId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
