package com.google.android.gms.internal;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.zn.a;

@aaa
public abstract class zm extends abq {
    protected final a a;
    protected final Context b;
    protected final Object c = new Object();
    protected final Object d = new Object();
    protected final abi.a e;
    protected AdResponseParcel f;

    protected zm(Context context, abi.a aVar, a aVar2) {
        super(true);
        this.b = context;
        this.e = aVar;
        this.f = aVar.b;
        this.a = aVar2;
    }

    protected abstract abi a(int i);

    public void a() {
        int a;
        synchronized (this.c) {
            b.a("AdRendererBackgroundTask started.");
            int i = this.e.e;
            try {
                a(SystemClock.elapsedRealtime());
            } catch (a e) {
                a = e.a();
                if (a == 3 || a == -1) {
                    b.c(e.getMessage());
                } else {
                    b.d(e.getMessage());
                }
                if (this.f == null) {
                    this.f = new AdResponseParcel(a);
                } else {
                    this.f = new AdResponseParcel(a, this.f.k);
                }
                abv.a.post(new 1(this));
                i = a;
            }
            abv.a.post(new 2(this, a(i)));
        }
    }

    protected abstract void a(long j);

    protected void a(abi com_google_android_gms_internal_abi) {
        this.a.b(com_google_android_gms_internal_abi);
    }

    public void b() {
    }
}
