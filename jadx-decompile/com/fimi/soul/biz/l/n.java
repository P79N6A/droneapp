package com.fimi.soul.biz.l;

import android.content.Context;
import android.text.TextUtils;
import com.fimi.soul.biz.m.l;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.utils.NetUtil;
import com.fimi.soul.utils.ao;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

public class n implements l {
    private Context a;
    private String b;

    public n(Context context) {
        this.a = context;
    }

    public PlaneMsg a(String str, String str2) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("ssid", str + ",pwd=" + str2));
        Object a = NetUtil.a(this.b + "action/setWifi", arrayList, this.a, true);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            if (!TextUtils.isEmpty(a) && a.contains("ok")) {
                planeMsg.setSuccess(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return planeMsg;
    }

    public String a() {
        return this.b;
    }

    public void a(String str) {
        this.b = str;
    }

    public PlaneMsg b() {
        String a = NetUtil.a(this.b + "dir.log", new ArrayList(), this.a, true);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            if (!TextUtils.isEmpty(a)) {
                planeMsg.setData(ao.c(a));
                planeMsg.setSuccess(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return planeMsg;
    }

    public PlaneMsg c() {
        CharSequence a = NetUtil.a(this.b + "action/getDir", new ArrayList(), this.a, true);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            if (!TextUtils.isEmpty(a)) {
                planeMsg.setSuccess(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return planeMsg;
    }

    public PlaneMsg d() {
        Object a = NetUtil.a(this.b + "action/reboot", new ArrayList(), this.a, true);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            if (!TextUtils.isEmpty(a) && a.contains("ok")) {
                planeMsg.setSuccess(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return planeMsg;
    }
}
