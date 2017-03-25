package com.zm.circle.model;

import java.util.Date;

public class PPost {
    private String id;

    private String pid;

    private String circleId;

    private String title;

    private Long price;

    private Long flower;

    private Integer level;

    private String createUser;

    private Date createTime;

    private String content;

    public PPost(String id, String pid, String circleId, String title, Long price, Long flower, Integer level, String createUser, Date createTime, String content) {
        this.id = id;
        this.pid = pid;
        this.circleId = circleId;
        this.title = title;
        this.price = price;
        this.flower = flower;
        this.level = level;
        this.createUser = createUser;
        this.createTime = createTime;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public String getPid() {
        return pid;
    }

    public String getCircleId() {
        return circleId;
    }

    public String getTitle() {
        return title;
    }

    public Long getPrice() {
        return price;
    }

    public Long getFlower() {
        return flower;
    }

    public Integer getLevel() {
        return level;
    }

    public String getCreateUser() {
        return createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public String getContent() {
        return content;
    }
}