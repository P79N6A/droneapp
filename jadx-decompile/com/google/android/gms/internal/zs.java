package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.zn.a;
import com.tencent.mm.sdk.platformtools.Util;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@aaa
public class zs extends abq {
    private final a a;
    private final AdResponseParcel b;
    private final abi.a c;
    private final zu d;
    private final Object e;
    private Future<abi> f;

    public zs(Context context, q qVar, abi.a aVar, ro roVar, a aVar2, un unVar) {
        this(aVar, aVar2, new zu(context, qVar, new acc(context), roVar, aVar, unVar));
    }

    zs(abi.a aVar, a aVar2, zu zuVar) {
        this.e = new Object();
        this.c = aVar;
        this.b = aVar.b;
        this.a = aVar2;
        this.d = zuVar;
    }

    private abi a(int i) {
        return new abi(this.c.a.c, null, null, i, null, null, this.b.l, this.b.k, this.c.a.i, false, null, null, null, null, null, this.b.i, this.c.d, this.b.g, this.c.f, this.b.n, this.b.o, this.c.h, null, null, null, null, this.c.b.F, this.c.b.G, null, null, this.b.N);
    }

    public void a() {
        abi com_google_android_gms_internal_abi;
        int i;
        try {
            synchronized (this.e) {
                this.f = abu.a(this.d);
            }
            com_google_android_gms_internal_abi = (abi) this.f.get(Util.MILLSECONDS_OF_MINUTE, TimeUnit.MILLISECONDS);
            i = -2;
        } catch (TimeoutException e) {
            b.d("Timed out waiting for native ad.");
            this.f.cancel(true);
            i = 2;
            com_google_android_gms_internal_abi = null;
        } catch (ExecutionException e2) {
            com_google_android_gms_internal_abi = null;
            i = 0;
        } catch (InterruptedException e3) {
            com_google_android_gms_internal_abi = null;
            i = 0;
        } catch (CancellationException e4) {
            com_google_android_gms_internal_abi = null;
            i = 0;
        }
        if (com_google_android_gms_internal_abi == null) {
            com_google_android_gms_internal_abi = a(i);
        }
        abv.a.post(new 1(this, com_google_android_gms_internal_abi));
    }

    public void b() {
        synchronized (this.e) {
            if (this.f != null) {
                this.f.cancel(true);
            }
        }
    }
}
