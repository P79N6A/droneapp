package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.tagmanager.e;
import com.tencent.mm.sdk.message.RMsgInfoDB;
import java.util.HashMap;
import java.util.Map;

class wi$3 implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ wi e;

    wi$3(wi wiVar, String str, String str2, String str3, String str4) {
        this.e = wiVar;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public void run() {
        Map hashMap = new HashMap();
        hashMap.put(e.b, "precacheCanceled");
        hashMap.put("src", this.a);
        if (!TextUtils.isEmpty(this.b)) {
            hashMap.put("cachedSrc", this.b);
        }
        hashMap.put("type", wi.a(this.e, this.c));
        hashMap.put("reason", this.c);
        if (!TextUtils.isEmpty(this.d)) {
            hashMap.put(RMsgInfoDB.TABLE, this.d);
        }
        wi.a(this.e, "onPrecacheEvent", hashMap);
    }
}
