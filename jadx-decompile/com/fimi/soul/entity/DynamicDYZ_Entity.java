package com.fimi.soul.entity;

import java.io.Serializable;

public class DynamicDYZ_Entity implements Serializable {
    private String encryptKey;
    private String encryptValue;
    private long endDate;
    private int id;
    private long insertDate;
    private double latitude;
    private double logitude;
    private int radius;
    private String remarks;
    private long startDate;
    private int status;
    private int type;

    public String getEncryptKey() {
        return this.encryptKey;
    }

    public String getEncryptValue() {
        return this.encryptValue;
    }

    public long getEndDate() {
        return this.endDate;
    }

    public int getId() {
        return this.id;
    }

    public long getInsertDate() {
        return this.insertDate;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLogitude() {
        return this.logitude;
    }

    public int getRadius() {
        return this.radius;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public long getStartDate() {
        return this.startDate;
    }

    public int getStatus() {
        return this.status;
    }

    public int getType() {
        return this.type;
    }

    public void setEncryptKey(String str) {
        this.encryptKey = str;
    }

    public void setEncryptValue(String str) {
        this.encryptValue = str;
    }

    public void setEndDate(long j) {
        this.endDate = j;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setInsertDate(long j) {
        this.insertDate = j;
    }

    public void setLatitude(double d) {
        this.latitude = d;
    }

    public void setLogitude(double d) {
        this.logitude = d;
    }

    public void setRadius(int i) {
        this.radius = i;
    }

    public void setRemarks(String str) {
        this.remarks = str;
    }

    public void setStartDate(long j) {
        this.startDate = j;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setType(int i) {
        this.type = i;
    }

    public String toString() {
        return "DynamicDYZ_Entity{encryptValue='" + this.encryptValue + '\'' + ", logitude=" + this.logitude + ", endDate=" + this.endDate + ", latitude=" + this.latitude + ", insertDate=" + this.insertDate + ", id=" + this.id + ", radius=" + this.radius + ", encryptKey='" + this.encryptKey + '\'' + ", type=" + this.type + ", startDate=" + this.startDate + ", status=" + this.status + ", remarks='" + this.remarks + '\'' + '}';
    }
}
