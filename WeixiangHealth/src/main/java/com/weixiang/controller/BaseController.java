package com.weixiang.controller;

import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

class Result<T> {
    private int status;
    private String message;
    private T data;

    public Result(int status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

/**
 * Created by lzq on 16/6/17.
 */
public class BaseController {

    @Autowired
    protected HttpServletRequest request;


    @Autowired
    protected HttpServletResponse response;

    @Autowired
    protected HttpSession session;
}
