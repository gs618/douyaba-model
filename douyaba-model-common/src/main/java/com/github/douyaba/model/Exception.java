package com.github.douyaba.model;

/**
 * @author sgao
 */
public class Exception extends Protocol<Integer, String> {

    public Integer getCode() {
        return getHead();
    }

    public String getMessage() {
        return getBody();
    }

    public Exception setCode(Integer code) {
        setHead(code);
        return this;
    }

    public Exception setMessage(String message) {
        setBody(message);
        return this;
    }
}
