package com.fimi.soul.biz.modifyRealyWiFiConfigure;

import java.io.Serializable;

public class Fwap implements Serializable {
    private String key;
    private String ssid;

    public String getKey() {
        return this.key;
    }

    public String getSsid() {
        return this.ssid;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setSsid(String str) {
        this.ssid = str;
    }
}
