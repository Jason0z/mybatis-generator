package com.zm.circle.model;

import java.util.Date;

public class LogUser {
    private String id;

    private String method;

    private String content;

    private Date createTime;

    public LogUser(String id, String method, String content, Date createTime) {
        this.id = id;
        this.method = method;
        this.content = content;
        this.createTime = createTime;
    }

    public String getId() {
        return id;
    }

    public String getMethod() {
        return method;
    }

    public String getContent() {
        return content;
    }

    public Date getCreateTime() {
        return createTime;
    }
}