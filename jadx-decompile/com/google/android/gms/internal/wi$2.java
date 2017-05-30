package com.google.android.gms.internal;

import com.google.android.gms.tagmanager.e;
import java.util.HashMap;
import java.util.Map;

class wi$2 implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ int c;
    final /* synthetic */ wi d;

    wi$2(wi wiVar, String str, String str2, int i) {
        this.d = wiVar;
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public void run() {
        Map hashMap = new HashMap();
        hashMap.put(e.b, "precacheComplete");
        hashMap.put("src", this.a);
        hashMap.put("cachedSrc", this.b);
        hashMap.put("totalBytes", Integer.toString(this.c));
        wi.a(this.d, "onPrecacheEvent", hashMap);
    }
}
