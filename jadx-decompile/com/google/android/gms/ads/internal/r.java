package com.google.android.gms.ads.internal;

import android.os.Handler;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abv;
import com.tencent.mm.sdk.platformtools.Util;
import java.lang.ref.WeakReference;

@aaa
public class r {
    private final a a;
    private final Runnable b;
    @Nullable
    private AdRequestParcel c;
    private boolean d;
    private boolean e;
    private long f;

    public static class a {
        private final Handler a;

        public a(Handler handler) {
            this.a = handler;
        }

        public void a(Runnable runnable) {
            this.a.removeCallbacks(runnable);
        }

        public boolean a(Runnable runnable, long j) {
            return this.a.postDelayed(runnable, j);
        }
    }

    public r(a aVar) {
        this(aVar, new a(abv.a));
    }

    r(a aVar, a aVar2) {
        this.d = false;
        this.e = false;
        this.f = 0;
        this.a = aVar2;
        final WeakReference weakReference = new WeakReference(aVar);
        this.b = new Runnable(this) {
            final /* synthetic */ r b;

            public void run() {
                this.b.d = false;
                a aVar = (a) weakReference.get();
                if (aVar != null) {
                    aVar.c(this.b.c);
                }
            }
        };
    }

    public void a() {
        this.d = false;
        this.a.a(this.b);
    }

    public void a(AdRequestParcel adRequestParcel) {
        this.c = adRequestParcel;
    }

    public void a(AdRequestParcel adRequestParcel, long j) {
        if (this.d) {
            b.d("An ad refresh is already scheduled.");
            return;
        }
        this.c = adRequestParcel;
        this.d = true;
        this.f = j;
        if (!this.e) {
            b.c("Scheduling ad refresh " + j + " milliseconds from now.");
            this.a.a(this.b, j);
        }
    }

    public void b() {
        this.e = true;
        if (this.d) {
            this.a.a(this.b);
        }
    }

    public void b(AdRequestParcel adRequestParcel) {
        a(adRequestParcel, (long) Util.MILLSECONDS_OF_MINUTE);
    }

    public void c() {
        this.e = false;
        if (this.d) {
            this.d = false;
            a(this.c, this.f);
        }
    }

    public boolean d() {
        return this.d;
    }
}
