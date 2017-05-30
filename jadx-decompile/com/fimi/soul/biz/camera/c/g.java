package com.fimi.soul.biz.camera.c;

import com.fimi.soul.biz.camera.c;
import com.fimi.soul.biz.camera.e;
import com.fimi.soul.biz.camera.entity.X11ApWifiConfig;
import com.fimi.soul.biz.camera.entity.X11RespCmd;

public class g extends a {
    private X11ApWifiConfig a = null;

    public g(c cVar) {
        super(cVar);
    }

    public void a(X11ApWifiConfig x11ApWifiConfig) {
        String format = String.format("AP_SSID=%s\\nLOCAL_IP=%s\\nESSID=%s\\nAP_CHANNEL=%d", new Object[]{x11ApWifiConfig.getApSSID(), x11ApWifiConfig.getApIP(), x11ApWifiConfig.getApESSID(), Integer.valueOf(x11ApWifiConfig.getApChannel())});
        this.a = x11ApWifiConfig;
        a((int) e.Z, format);
    }

    public void a(boolean z, X11RespCmd x11RespCmd) {
        super.a(z, x11RespCmd);
        switch (x11RespCmd.getMsg_id()) {
            case e.Z /*1538*/:
                a().a(this.a);
                return;
            default:
                return;
        }
    }

    public void b() {
        a((int) e.Y);
    }

    public void b(X11ApWifiConfig x11ApWifiConfig) {
        a((int) e.aa);
    }
}
