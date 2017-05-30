package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import com.google.android.gms.c.e;
import com.google.android.gms.c.f;
import com.google.android.gms.internal.tc.a;
import com.tencent.mm.sdk.platformtools.LocaleUtil;

public final class ta extends a {
    private final rn a;
    private final ro b;
    private final qs c;
    private boolean d = false;

    public ta(String str, Context context, boolean z) {
        this.a = rn.a(str, context, z);
        this.b = new ro(this.a);
        this.c = z ? null : qs.c(context);
    }

    private e a(e eVar, e eVar2, boolean z) {
        try {
            Uri uri = (Uri) f.a(eVar);
            Context context = (Context) f.a(eVar2);
            return f.a(z ? this.b.a(uri, context) : this.b.b(uri, context));
        } catch (rp e) {
            return null;
        }
    }

    public e a(e eVar, e eVar2) {
        return a(eVar, eVar2, true);
    }

    public String a() {
        return LocaleUtil.MALAY;
    }

    public String a(e eVar, String str) {
        return this.a.a((Context) f.a(eVar), str);
    }

    public void a(String str) {
        this.b.a(str);
    }

    public void a(String str, String str2) {
        this.b.a(str, str2);
    }

    public boolean a(e eVar) {
        return this.b.a((Uri) f.a(eVar));
    }

    public boolean a(String str, boolean z) {
        if (this.c == null) {
            return false;
        }
        this.c.a(new com.google.android.gms.ads.a.a.a(str, z));
        this.d = true;
        return true;
    }

    public e b(e eVar, e eVar2) {
        return a(eVar, eVar2, false);
    }

    public boolean b(e eVar) {
        return this.b.c((Uri) f.a(eVar));
    }

    public String c(e eVar) {
        Context context = (Context) f.a(eVar);
        String a = this.a.a(context);
        if (this.c == null || !this.d) {
            return a;
        }
        String a2 = this.c.a(a, this.c.a(context));
        this.d = false;
        return a2;
    }

    public void d(e eVar) {
        this.b.a((MotionEvent) f.a(eVar));
    }
}
