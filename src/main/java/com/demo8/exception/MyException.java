package com.demo8.exception;

/**
 * 自定义异常类
 */
public class MyException extends Exception {

    //  存储异常信息
    private String message;

    //  构造
    public MyException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
