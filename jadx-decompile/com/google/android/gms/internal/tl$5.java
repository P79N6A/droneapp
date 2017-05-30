package com.google.android.gms.internal;

import com.google.android.gms.internal.acr.c;
import org.json.JSONObject;

class tl$5 implements c<wy> {
    final /* synthetic */ JSONObject a;
    final /* synthetic */ tl b;

    tl$5(tl tlVar, JSONObject jSONObject) {
        this.b = tlVar;
        this.a = jSONObject;
    }

    public void a(wy wyVar) {
        wyVar.a("AFMA_updateActiveView", this.a);
    }

    public /* synthetic */ void a(Object obj) {
        a((wy) obj);
    }
}
