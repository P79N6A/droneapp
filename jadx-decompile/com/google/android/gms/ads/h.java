package com.google.android.gms.ads;

import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.client.c;
import com.google.android.gms.ads.internal.client.q;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.aaa;

@aaa
public final class h {
    private final Object a = new Object();
    @Nullable
    private c b;
    @Nullable
    private a c;

    public static abstract class a {
        public void a() {
        }
    }

    public c a() {
        c cVar;
        synchronized (this.a) {
            cVar = this.b;
        }
        return cVar;
    }

    public void a(a aVar) {
        d.a((Object) aVar, (Object) "VideoLifecycleCallbacks may not be null.");
        synchronized (this.a) {
            this.c = aVar;
            if (this.b == null) {
                return;
            }
            try {
                this.b.a(new q(aVar));
            } catch (Throwable e) {
                b.b("Unable to call setVideoLifecycleCallbacks on video controller.", e);
            }
        }
    }

    public void a(c cVar) {
        synchronized (this.a) {
            this.b = cVar;
            if (this.c != null) {
                a(this.c);
            }
        }
    }

    @Nullable
    public a b() {
        a aVar;
        synchronized (this.a) {
            aVar = this.c;
        }
        return aVar;
    }

    public boolean c() {
        boolean z;
        synchronized (this.a) {
            z = this.b != null;
        }
        return z;
    }

    public float d() {
        float f = 0.0f;
        synchronized (this.a) {
            if (this.b == null) {
            } else {
                try {
                    f = this.b.g();
                } catch (Throwable e) {
                    b.b("Unable to call getAspectRatio on video controller.", e);
                }
            }
        }
        return f;
    }
}
