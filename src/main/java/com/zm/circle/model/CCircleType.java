package com.zm.circle.model;

public class CCircleType {
    private String id;

    private String name;

    private String note;

    private String config;

    public CCircleType(String id, String name, String note, String config) {
        this.id = id;
        this.name = name;
        this.note = note;
        this.config = config;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNote() {
        return note;
    }

    public String getConfig() {
        return config;
    }
}