package com.fimi.soul.biz.camera.entity;

import com.fimi.soul.biz.camera.e;
import com.fimi.soul.biz.e.b;
import com.fimi.soul.utils.am;
import java.util.Map;

public class X11ApWifiConfig {
    private int ApChannel = 4;
    private String ApESSID = "amba_TEST";
    private String ApIP = e.a();
    private String ApSSID = "AMBA";

    public static X11ApWifiConfig build(String str) {
        X11ApWifiConfig x11ApWifiConfig = new X11ApWifiConfig();
        try {
            Map a = am.a(str);
            x11ApWifiConfig.setApSSID((String) a.get(b.b));
            x11ApWifiConfig.setApIP((String) a.get("LOCAL_IP"));
            x11ApWifiConfig.setApChannel(Integer.parseInt((String) a.get("AP_CHANNEL")));
        } catch (Exception e) {
        }
        return x11ApWifiConfig;
    }

    public int getApChannel() {
        return this.ApChannel;
    }

    public String getApESSID() {
        return this.ApESSID;
    }

    public String getApIP() {
        return this.ApIP;
    }

    public String getApSSID() {
        return this.ApSSID;
    }

    public void setApChannel(int i) {
        this.ApChannel = i;
    }

    public void setApESSID(String str) {
        this.ApESSID = str;
    }

    public void setApIP(String str) {
        this.ApIP = str;
    }

    public void setApSSID(String str) {
        this.ApSSID = str;
    }
}
