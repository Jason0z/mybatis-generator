package com.zm.circle.model;

import java.util.Date;

public class UUserCircle {
    private String id;

    private String userId;

    private String circleId;

    private Byte role;

    private String approver;

    private Date createTime;

    public UUserCircle(String id, String userId, String circleId, Byte role, String approver, Date createTime) {
        this.id = id;
        this.userId = userId;
        this.circleId = circleId;
        this.role = role;
        this.approver = approver;
        this.createTime = createTime;
    }

    public String getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public String getCircleId() {
        return circleId;
    }

    public Byte getRole() {
        return role;
    }

    public String getApprover() {
        return approver;
    }

    public Date getCreateTime() {
        return createTime;
    }
}