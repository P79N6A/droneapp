package com.xiaomi.mistatistic.sdk.controller;

import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.media.SystemMediaRouteProvider;
import android.text.TextUtils;
import com.facebook.common.util.UriUtil;
import com.fimi.soul.media.player.FimiMediaMeta;
import com.fimi.soul.utils.a.b.a;
import com.google.android.gms.location.places.d;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.mistatistic.sdk.BuildSetting;
import com.xiaomi.mistatistic.sdk.MiStatInterface;
import com.xiaomi.mistatistic.sdk.data.HttpEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONObject;

public class j {
    private static j a = new j();
    private HttpEventFilter b;
    private boolean c = false;
    private List d = new LinkedList();
    private Handler e = new k(this, Looper.getMainLooper());

    private j() {
    }

    public static j a() {
        return a;
    }

    private void a(JSONObject jSONObject) {
        if (jSONObject.has(UriUtil.DATA_SCHEME)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(UriUtil.DATA_SCHEME);
            int optInt = jSONObject2.optInt(FimiMediaMeta.IJKM_KEY_SAMPLE_RATE, 10000);
            int optInt2 = jSONObject2.optInt("delay", 300000);
            long optLong = jSONObject2.optLong("ban_time", 0);
            s.b(a.a(), "rt_upload_rate", optInt);
            s.b(a.a(), "rt_upload_delay", (long) optInt2);
            s.b(a.a(), "rt_ban_time", System.currentTimeMillis() + optLong);
        }
    }

    private String e() {
        return BuildSetting.isTest() ? "http://10.99.168.145:8097/realtime_network" : "https://data.mistat.xiaomi.com/realtime_network";
    }

    private boolean f() {
        Map hashMap = new HashMap();
        synchronized (this.d) {
            for (HttpEvent httpEvent : this.d) {
                CharSequence url = httpEvent.getUrl();
                if (!TextUtils.isEmpty(url)) {
                    if (hashMap.containsKey(url)) {
                        ((List) hashMap.get(url)).add(httpEvent);
                    } else {
                        hashMap.put(url, new ArrayList());
                        ((List) hashMap.get(url)).add(httpEvent);
                    }
                }
            }
            if (hashMap.isEmpty()) {
                return false;
            }
            JSONArray jSONArray = new JSONArray();
            for (String str : hashMap.keySet()) {
                JSONArray jSONArray2 = new JSONArray();
                for (HttpEvent toJSON : (List) hashMap.get(str)) {
                    jSONArray2.put(toJSON.toJSON());
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", str);
                jSONObject.put(UriUtil.DATA_SCHEME, jSONArray2);
                jSONArray.put(jSONObject);
            }
            boolean a = a(jSONArray.toString());
            return a;
        }
    }

    public void a(HttpEventFilter httpEventFilter) {
        this.b = httpEventFilter;
    }

    public void a(HttpEvent httpEvent) {
        if (!httpEvent.getUrl().equals(e()) || this.c) {
            if (!(this.b == null || httpEvent.getUrl().equals(e()))) {
                httpEvent = this.b.onEvent(httpEvent);
            }
            if (httpEvent != null && !TextUtils.isEmpty(httpEvent.getUrl())) {
                synchronized (this.d) {
                    this.d.add(httpEvent);
                    if (this.d.size() > 100) {
                        this.d.remove(0);
                    }
                }
                if (!this.e.hasMessages(d.bp) && !httpEvent.getUrl().equals(e())) {
                    this.e.sendEmptyMessageDelayed(d.bp, d());
                }
            }
        }
    }

    public boolean a(String str) {
        List arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("app_id", a.b()));
        arrayList.add(new BasicNameValuePair("app_package", a.a().getPackageName()));
        arrayList.add(new BasicNameValuePair("device_uuid", g.a(a.a())));
        arrayList.add(new BasicNameValuePair("device_os", SystemMediaRouteProvider.PACKAGE_NAME + VERSION.SDK_INT));
        arrayList.add(new BasicNameValuePair("device_model", Build.MODEL));
        arrayList.add(new BasicNameValuePair(Constants.EXTRA_KEY_APP_VERSION, a.e()));
        arrayList.add(new BasicNameValuePair("app_channel", a.d()));
        arrayList.add(new BasicNameValuePair(a.i, String.valueOf(System.currentTimeMillis())));
        arrayList.add(new BasicNameValuePair("net_value", str));
        Object a = q.a(a.a(), e(), arrayList);
        new o().a("http data complete, result=" + a);
        if (!TextUtils.isEmpty(a)) {
            JSONObject jSONObject = new JSONObject(a);
            if ("ok".equals(jSONObject.getString("status"))) {
                a(jSONObject);
                return true;
            }
        }
        return false;
    }

    public List b() {
        List linkedList;
        synchronized (this.d) {
            linkedList = new LinkedList(this.d);
        }
        return linkedList;
    }

    public boolean c() {
        return System.currentTimeMillis() > s.a(a.a(), "rt_ban_time", 0) && Math.random() * 10000.0d <= ((double) s.a(a.a(), "rt_upload_rate", 10000));
    }

    public long d() {
        return s.a(a.a(), "rt_upload_delay", (long) MiStatInterface.MIN_UPLOAD_INTERVAL);
    }
}
