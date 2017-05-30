package com.fimi.soul.biz.modifyRealyWiFiConfigure;

import com.fimi.kernel.b.d.c;
import com.fimi.kernel.utils.x;
import com.fimi.soul.biz.e.d;
import com.fimi.soul.utils.ad;

public class ModifyRelayWiFi {
    private volatile String password;
    private volatile String ssid;

    private static class CreatemidifyRelayWiFi {
        private static final ModifyRelayWiFi MMIDIFY_RELAY_WI_FI = new ModifyRelayWiFi();

        private CreatemidifyRelayWiFi() {
        }
    }

    public static ModifyRelayWiFi getInstance() {
        return CreatemidifyRelayWiFi.MMIDIFY_RELAY_WI_FI;
    }

    public String getPassword() {
        return this.password;
    }

    public String getSsid() {
        return this.ssid;
    }

    public void sendModifyCongigure() {
        x.b(new Runnable() {
            public void run() {
                CommadBean commadBean = new CommadBean();
                commadBean.setType("0");
                commadBean.setData("fwdap");
                commadBean.setName("modify");
                Fwap fwap = new Fwap();
                fwap.setKey(ModifyRelayWiFi.this.password);
                fwap.setSsid(ModifyRelayWiFi.this.ssid);
                c o = d.a().o();
                ChangeWifiPAs changeWifiPAs = new ChangeWifiPAs();
                changeWifiPAs.setmCommadBean(commadBean);
                changeWifiPAs.setmFwap(fwap);
                o.a(ad.a(changeWifiPAs).getBytes());
            }
        });
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public void setSsid(String str) {
        this.ssid = str;
    }
}
