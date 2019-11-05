package com.xzh.clothes.command;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

/**
 * @author ：xiaonuolen
 * @date ：Created in 2019/11/5 11:37
 * @description：
 * @modified By：
 * @version: $
 */
public class Message implements Serializable {
    private int state;//0 成功 1 失败
    private String message;
    private Object data;

    public Message(Integer state, String message, Object data) {
        this.state = state;
        this.message = message;
        this.data = data;
    }

    public Message() {
    }

    @Override
    public String toString() {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("state",state);
        jsonObject.put("message",message);
        jsonObject.put("data",data);
        return jsonObject.toString();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
