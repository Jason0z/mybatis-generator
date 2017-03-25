package com.zm.circle.model;

import java.util.Date;

public class LLetter {
    private String id;

    private String from;

    private String to;

    private String title;

    private Date createTime;

    private Date sendTime;

    private Date readTime;

    private Byte status;

    private byte[] content;

    public LLetter(String id, String from, String to, String title, Date createTime, Date sendTime, Date readTime, Byte status, byte[] content) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.title = title;
        this.createTime = createTime;
        this.sendTime = sendTime;
        this.readTime = readTime;
        this.status = status;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getTitle() {
        return title;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public Date getReadTime() {
        return readTime;
    }

    public Byte getStatus() {
        return status;
    }

    public byte[] getContent() {
        return content;
    }
}