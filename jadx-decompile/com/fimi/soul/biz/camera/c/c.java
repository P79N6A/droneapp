package com.fimi.soul.biz.camera.c;

import com.fimi.kernel.utils.n;
import com.fimi.soul.biz.camera.e;
import com.fimi.soul.biz.camera.entity.X11DeviceInfo;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.biz.camera.entity.X11SystemConfig;
import com.fimi.soul.biz.camera.entity.X11SystemConfigOption;
import com.google.gson.internal.LinkedTreeMap;
import com.xiaomi.mipush.sdk.Constants;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class c extends a {
    int a = 0;
    long b;
    private String c;
    private c d = c.Max;
    private a e = a.Total;
    private String f;
    private String g;

    public enum a {
        Total,
        Photo,
        Video
    }

    public enum b {
        PowerStandby,
        PowerOff
    }

    public enum c {
        Max,
        Current,
        Status
    }

    public enum d {
        Jump,
        Fast,
        Normal,
        Slow
    }

    public c(com.fimi.soul.biz.camera.c cVar) {
        super(cVar);
    }

    private void a(Map<String, String> map, X11SystemConfig x11SystemConfig) {
        x11SystemConfig.setCameraTimeLock((String) map.get(e.by));
        x11SystemConfig.setVideoStandard((String) map.get(e.bB));
        x11SystemConfig.setAppStatus((String) map.get(e.bC));
        x11SystemConfig.setStreamOutType((String) map.get(e.bD));
        x11SystemConfig.setSaveLowResolution(e((String) map.get(e.bE)));
        x11SystemConfig.setVideoResolution((String) map.get(e.bF));
        x11SystemConfig.setVideoQuality((String) map.get(e.bH));
        x11SystemConfig.setTimelapseVideo(e((String) map.get(e.bI)));
        x11SystemConfig.setCaptureMode((String) map.get(e.bJ));
        x11SystemConfig.setPhotoSize((String) map.get(e.bK));
        x11SystemConfig.setPhotoStamp((String) map.get(e.bL));
        x11SystemConfig.setPhotoQuality((String) map.get(e.bM));
        x11SystemConfig.setTimelapsePhoto(e((String) map.get(e.bN)));
        x11SystemConfig.setVideoStamp((String) map.get(e.bG));
        x11SystemConfig.setVideoSrt((String) map.get(e.bO));
        x11SystemConfig.setVideoLoopBack((String) map.get(e.bP));
        x11SystemConfig.setVideoMode((String) map.get(e.bQ));
        x11SystemConfig.setSDState((String) map.get(e.bR));
        x11SystemConfig.setImage_format((String) map.get(e.bS));
        x11SystemConfig.setRavl(Integer.parseInt((String) map.get(e.bz)));
        x11SystemConfig.setCur_time(Long.parseLong((String) map.get(e.bA)));
    }

    private boolean e(String str) {
        return "on".equals(str);
    }

    public void a(a aVar) {
        String str;
        this.e = aVar;
        switch (aVar) {
            case Total:
                str = "total";
                break;
            case Photo:
                str = e.cl;
                break;
            case Video:
                str = "video";
                break;
            default:
                str = null;
                break;
        }
        a(6, null, str);
    }

    public void a(b bVar) {
        String str = null;
        switch (bVar) {
            case PowerStandby:
                str = "cam_stb";
                break;
            case PowerOff:
                str = "cam_off";
                break;
        }
        a(12, str);
    }

    public void a(c cVar) {
        String str;
        this.d = cVar;
        switch (cVar) {
            case Max:
                str = "max";
                break;
            case Current:
                str = "current";
                break;
            case Status:
                str = "status";
                break;
            default:
                str = null;
                break;
        }
        a(15, null, str);
    }

    public void a(d dVar, int i) {
        String str = null;
        switch (dVar) {
            case Jump:
                str = "jump";
                break;
            case Fast:
                str = "fast";
                break;
            case Normal:
                str = "normal";
                break;
            case Slow:
                str = "slow";
                break;
        }
        a(14, i + "", str);
    }

    public void a(String str) {
        a(9, str);
    }

    public void a(String str, String str2) {
        this.f = str;
        this.g = str2;
        a(2, str2, str);
    }

    public void a(boolean z, X11RespCmd x11RespCmd) {
        super.a(z, x11RespCmd);
        if (z) {
            X11SystemConfig i = a().i();
            long cur_time;
            int parseInt;
            switch (x11RespCmd.getMsg_id()) {
                case 2:
                    if (e.bJ.equals(this.f)) {
                        i.setCaptureMode(this.g);
                    }
                    cur_time = i.getCur_time();
                    if ((i.getRavl() != 0 || Math.abs(cur_time - this.b) > 5000) && this.a < 3) {
                        m();
                        this.a++;
                        return;
                    }
                    return;
                case 3:
                    if (x11RespCmd.getParam() != null) {
                        try {
                            List<LinkedTreeMap> list = (List) x11RespCmd.getParam();
                            Map hashMap = new HashMap();
                            for (LinkedTreeMap linkedTreeMap : list) {
                                for (String str : linkedTreeMap.keySet()) {
                                    hashMap.put(str, linkedTreeMap.get(str));
                                }
                            }
                            a(hashMap, i);
                            if (e.ck.contains(i.getAppStatus())) {
                                a().a(com.fimi.soul.biz.camera.c.a.Recoding);
                            }
                            if (e.cl.contains(i.getAppStatus())) {
                                a().a(com.fimi.soul.biz.camera.c.a.ContinueCapturing);
                            }
                            if (e.cj.contains(i.getAppStatus())) {
                                a().a(com.fimi.soul.biz.camera.c.a.IDLE);
                            }
                            if (e.cm.contains(i.getAppStatus())) {
                                a().a(com.fimi.soul.biz.camera.c.a.Normal);
                                return;
                            }
                            return;
                        } catch (Exception e) {
                            return;
                        }
                    }
                    return;
                case 5:
                    try {
                        cur_time = Long.parseLong(x11RespCmd.getParam().toString());
                        if (e.cy.equals(this.c)) {
                            i.setFreeKBSpace(cur_time);
                        }
                        if (e.cz.equals(this.c)) {
                            i.setTotalKBSpace(cur_time);
                            c(e.cy);
                            return;
                        }
                        return;
                    } catch (Exception e2) {
                        return;
                    }
                case 6:
                    parseInt = Integer.parseInt(x11RespCmd.getParam().toString());
                    switch (this.e) {
                        case Total:
                            i.setTotalFileNumbers(parseInt);
                            return;
                        case Photo:
                            i.setPhotoFileNumbers(parseInt);
                            return;
                        case Video:
                            i.setVideoFileNumbers(parseInt);
                            return;
                        default:
                            return;
                    }
                case 9:
                    if (x11RespCmd.getParam() != null) {
                        String obj = x11RespCmd.getParam().toString();
                        X11SystemConfigOption x11SystemConfigOption = new X11SystemConfigOption();
                        x11SystemConfigOption.setType(obj);
                        x11SystemConfigOption.setPermission(x11RespCmd.getPermission());
                        x11SystemConfigOption.setOptions(x11RespCmd.getOptions());
                        i.getSystemConfigOptions().put(obj, x11SystemConfigOption);
                        return;
                    }
                    return;
                case 11:
                    X11DeviceInfo x11DeviceInfo = i.getX11DeviceInfo();
                    x11DeviceInfo.setBrand(x11RespCmd.getBrand());
                    x11DeviceInfo.setApiVersion(x11RespCmd.getApi_ver());
                    x11DeviceInfo.setModel(x11RespCmd.getModel());
                    x11DeviceInfo.setFirmwareVersion(x11RespCmd.getFw_ver());
                    x11DeviceInfo.setAppType(x11RespCmd.getApp_type());
                    x11DeviceInfo.setLogo(x11RespCmd.getLogo());
                    x11DeviceInfo.setChip(x11RespCmd.getChip());
                    x11DeviceInfo.setHttp(x11RespCmd.getHttp());
                    k();
                    return;
                case 13:
                    i.setBatteryLevel(Integer.parseInt(x11RespCmd.getParam().toString()));
                    i.setPowerSourceType(x11RespCmd.getType());
                    return;
                case 15:
                    parseInt = Integer.parseInt(x11RespCmd.getParam().toString());
                    switch (this.d) {
                        case Max:
                            i.setMaxZoomInfo(parseInt);
                            return;
                        case Current:
                            i.setCurrentZoomInfo(parseInt);
                            return;
                        default:
                            return;
                    }
                case 18:
                    i.setDvVersion(n.n(x11RespCmd.getParam().toString()) + "");
                    e();
                    return;
                case 19:
                    String[] split = x11RespCmd.getParam().toString().split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    int parseInt2 = Integer.parseInt(split[0]);
                    parseInt = Integer.parseInt(split[1]);
                    i.setRemainVideoRecordMinutes(parseInt2);
                    i.setRemainPhotoTakeNumbers(parseInt);
                    return;
                case 259:
                    this.a = 0;
                    m();
                    return;
                default:
                    return;
            }
        }
    }

    public void b() {
        a(3);
    }

    public void b(int i) {
        a(16, i + "");
    }

    public void b(String str) {
        a(4, str);
    }

    public void c() {
        a(4, "D:");
    }

    public void c(String str) {
        this.c = str;
        a(5, null, str);
    }

    public void d() {
        a(11);
    }

    public void d(String str) {
        a(261, str, "TCP");
    }

    public void e() {
        a(259, "none_force");
    }

    public void f() {
        a(260);
    }

    public void g() {
        a(2, "live", "dv_mode");
    }

    public void h() {
        a(2, e.ck, "dv_mode");
    }

    public void i() {
    }

    public void j() {
        a(17);
    }

    public void k() {
        a(18);
    }

    public void l() {
        a(19);
    }

    public void m() {
        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        this.b = new Date().getTime();
        a(e.by, format);
    }
}
