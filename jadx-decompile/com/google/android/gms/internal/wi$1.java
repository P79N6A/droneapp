package com.google.android.gms.internal;

import com.google.android.gms.tagmanager.e;
import java.util.HashMap;
import java.util.Map;

class wi$1 implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ boolean e;
    final /* synthetic */ wi f;

    wi$1(wi wiVar, String str, String str2, int i, int i2, boolean z) {
        this.f = wiVar;
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = z;
    }

    public void run() {
        Map hashMap = new HashMap();
        hashMap.put(e.b, "precacheProgress");
        hashMap.put("src", this.a);
        hashMap.put("cachedSrc", this.b);
        hashMap.put("bytesLoaded", Integer.toString(this.c));
        hashMap.put("totalBytes", Integer.toString(this.d));
        hashMap.put("cacheReady", this.e ? "1" : "0");
        wi.a(this.f, "onPrecacheEvent", hashMap);
    }
}
