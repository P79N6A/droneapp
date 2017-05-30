package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.common.internal.d;
import java.util.Iterator;
import java.util.LinkedList;

@aaa
class wr {
    private final LinkedList<a> a = new LinkedList();
    private AdRequestParcel b;
    private final String c;
    private final int d;
    private boolean e;

    wr(AdRequestParcel adRequestParcel, String str, int i) {
        d.a((Object) adRequestParcel);
        d.a((Object) str);
        this.b = adRequestParcel;
        this.c = str;
        this.d = i;
    }

    AdRequestParcel a() {
        return this.b;
    }

    a a(@Nullable AdRequestParcel adRequestParcel) {
        if (adRequestParcel != null) {
            this.b = adRequestParcel;
        }
        return (a) this.a.remove();
    }

    void a(wm wmVar) {
        a aVar = new a(this, wmVar);
        this.a.add(aVar);
        aVar.a();
    }

    void a(wm wmVar, AdRequestParcel adRequestParcel) {
        this.a.add(new a(this, wmVar, adRequestParcel));
    }

    int b() {
        return this.d;
    }

    String c() {
        return this.c;
    }

    int d() {
        return this.a.size();
    }

    int e() {
        Iterator it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            i = ((a) it.next()).e ? i + 1 : i;
        }
        return i;
    }

    void f() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a();
        }
    }

    void g() {
        this.e = true;
    }

    boolean h() {
        return this.e;
    }
}
