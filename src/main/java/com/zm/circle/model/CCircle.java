package com.zm.circle.model;

public class CCircle {
    private String id;

    private String name;

    private Byte type;

    private String note;

    private String config;

    public CCircle(String id, String name, Byte type, String note, String config) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.note = note;
        this.config = config;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Byte getType() {
        return type;
    }

    public String getNote() {
        return note;
    }

    public String getConfig() {
        return config;
    }
}