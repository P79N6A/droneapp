package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.yx.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@aaa
public class d extends a {
    private String a;
    private Context b;
    private String c;
    private ArrayList<String> d;

    public d(String str, ArrayList<String> arrayList, Context context, String str2) {
        this.c = str;
        this.d = arrayList;
        this.a = str2;
        this.b = context;
    }

    protected int a(int i) {
        return i == 0 ? 1 : i == 1 ? 2 : i == 4 ? 3 : 0;
    }

    public String a() {
        return this.c;
    }

    Map<String, String> b() {
        String packageName = this.b.getPackageName();
        Object obj = "";
        try {
            obj = this.b.getPackageManager().getPackageInfo(packageName, 0).versionName;
        } catch (Throwable e) {
            b.d("Error to retrieve app version", e);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - u.i().d().a();
        Map<String, String> hashMap = new HashMap();
        hashMap.put("sessionid", u.i().a());
        hashMap.put("appid", packageName);
        hashMap.put("osversion", String.valueOf(VERSION.SDK_INT));
        hashMap.put("sdkversion", this.a);
        hashMap.put("appversion", obj);
        hashMap.put("timestamp", String.valueOf(elapsedRealtime));
        return hashMap;
    }

    public void b(int i) {
        if (i == 1) {
            c();
        }
        Map b = b();
        b.put("status", String.valueOf(i));
        b.put("sku", this.c);
        List linkedList = new LinkedList();
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            linkedList.add(u.e().a((String) it.next(), b));
        }
        u.e().a(this.b, this.a, linkedList);
    }

    void c() {
        try {
            this.b.getClassLoader().loadClass("com.google.ads.conversiontracking.IAPConversionReporter").getDeclaredMethod("reportWithProductId", new Class[]{Context.class, String.class, String.class, Boolean.TYPE}).invoke(null, new Object[]{this.b, this.c, "", Boolean.valueOf(true)});
        } catch (ClassNotFoundException e) {
            b.d("Google Conversion Tracking SDK 1.2.0 or above is required to report a conversion.");
        } catch (NoSuchMethodException e2) {
            b.d("Google Conversion Tracking SDK 1.2.0 or above is required to report a conversion.");
        } catch (Throwable e3) {
            b.d("Fail to report a conversion.", e3);
        }
    }

    public void c(int i) {
        if (i == 0) {
            c();
        }
        Map b = b();
        b.put("google_play_status", String.valueOf(i));
        b.put("sku", this.c);
        b.put("status", String.valueOf(a(i)));
        List linkedList = new LinkedList();
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            linkedList.add(u.e().a((String) it.next(), b));
        }
        u.e().a(this.b, this.a, linkedList);
    }
}
