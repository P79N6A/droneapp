package com.google.android.gms.internal;

import org.json.JSONObject;

class ww$1 implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ JSONObject b;
    final /* synthetic */ ww c;

    ww$1(ww wwVar, String str, JSONObject jSONObject) {
        this.c = wwVar;
        this.a = str;
        this.b = jSONObject;
    }

    public void run() {
        ww.a(this.c).a(this.a, this.b);
    }
}
