package com.fimi.soul.entity;

public class BatteryUpdateSize {
    private String batteryId;
    private int batteryUpdateSize;
    private int messageHintSize;

    public String getBatteryId() {
        return this.batteryId;
    }

    public int getBatteryUpdateSize() {
        return this.batteryUpdateSize;
    }

    public int getMessageHintSize() {
        return this.messageHintSize;
    }

    public void setBatteryId(String str) {
        this.batteryId = str;
    }

    public void setBatteryUpdateSize(int i) {
        this.batteryUpdateSize = i;
    }

    public void setMessageHintSize(int i) {
        this.messageHintSize = i;
    }

    public String toString() {
        return "BatteryUpdateSize{batteryId='" + this.batteryId + '\'' + ", batteryUpdateSize=" + this.batteryUpdateSize + ", messageHintSize=" + this.messageHintSize + '}';
    }
}
