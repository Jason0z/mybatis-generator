package com.zm.circle.model;

import java.util.Date;

public class RRecord {
    private String id;

    private String a;

    private String b;

    private String fid;

    private Long amount;

    private Byte type;

    private Byte source;

    private String note;

    private Date createTime;

    public RRecord(String id, String a, String b, String fid, Long amount, Byte type, Byte source, String note, Date createTime) {
        this.id = id;
        this.a = a;
        this.b = b;
        this.fid = fid;
        this.amount = amount;
        this.type = type;
        this.source = source;
        this.note = note;
        this.createTime = createTime;
    }

    public String getId() {
        return id;
    }

    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public String getFid() {
        return fid;
    }

    public Long getAmount() {
        return amount;
    }

    public Byte getType() {
        return type;
    }

    public Byte getSource() {
        return source;
    }

    public String getNote() {
        return note;
    }

    public Date getCreateTime() {
        return createTime;
    }
}