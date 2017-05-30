package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.a;
import com.google.android.gms.analytics.internal.v;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.adx;
import java.util.ListIterator;

public class h extends o<h> {
    private final v b;
    private boolean c;

    public h(v vVar) {
        super(vVar.h(), vVar.d());
        this.b = vVar;
    }

    protected void a(l lVar) {
        adx com_google_android_gms_internal_adx = (adx) lVar.b(adx.class);
        if (TextUtils.isEmpty(com_google_android_gms_internal_adx.b())) {
            com_google_android_gms_internal_adx.b(this.b.p().b());
        }
        if (this.c && TextUtils.isEmpty(com_google_android_gms_internal_adx.d())) {
            a o = this.b.o();
            com_google_android_gms_internal_adx.d(o.c());
            com_google_android_gms_internal_adx.a(o.b());
        }
    }

    public void b(String str) {
        d.a(str);
        c(str);
        n().add(new i(this.b, str));
    }

    public void c(String str) {
        Uri a = i.a(str);
        ListIterator listIterator = n().listIterator();
        while (listIterator.hasNext()) {
            if (a.equals(((r) listIterator.next()).a())) {
                listIterator.remove();
            }
        }
    }

    public void c(boolean z) {
        this.c = z;
    }

    v k() {
        return this.b;
    }

    public l l() {
        l a = m().a();
        a.a(this.b.q().c());
        a.a(this.b.r().b());
        b(a);
        return a;
    }
}
