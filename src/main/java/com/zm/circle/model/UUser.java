package com.zm.circle.model;

import java.util.Date;

public class UUser {
    private String id;

    private String openid;

    private String sessionkey;

    private String sessionid;

    private String username;

    private String password;

    private String name;

    private String tel;

    private Byte status;

    private Date createTime;

    private String portrait;

    public UUser(String id, String openid, String sessionkey, String sessionid, String username, String password, String name, String tel, Byte status, Date createTime, String portrait) {
        this.id = id;
        this.openid = openid;
        this.sessionkey = sessionkey;
        this.sessionid = sessionid;
        this.username = username;
        this.password = password;
        this.name = name;
        this.tel = tel;
        this.status = status;
        this.createTime = createTime;
        this.portrait = portrait;
    }

    public String getId() {
        return id;
    }

    public String getOpenid() {
        return openid;
    }

    public String getSessionkey() {
        return sessionkey;
    }

    public String getSessionid() {
        return sessionid;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }

    public Byte getStatus() {
        return status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public String getPortrait() {
        return portrait;
    }
}