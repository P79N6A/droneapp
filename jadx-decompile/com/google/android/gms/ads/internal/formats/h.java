package com.google.android.gms.ads.internal.formats;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import com.google.android.gms.ads.internal.formats.i.a;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.c.f;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.acy;
import com.google.android.gms.internal.ro;
import com.google.android.gms.internal.xu;
import com.google.android.gms.internal.xv;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

@aaa
public class h extends j {
    @Nullable
    private xu a;
    @Nullable
    private xv b;
    private final q c;
    @Nullable
    private i d;
    private boolean e;
    private Object f;

    private h(Context context, q qVar, ro roVar, a aVar) {
        super(context, qVar, null, roVar, null, aVar, null, null);
        this.e = false;
        this.f = new Object();
        this.c = qVar;
    }

    public h(Context context, q qVar, ro roVar, xu xuVar, a aVar) {
        this(context, qVar, roVar, aVar);
        this.a = xuVar;
    }

    public h(Context context, q qVar, ro roVar, xv xvVar, a aVar) {
        this(context, qVar, roVar, aVar);
        this.b = xvVar;
    }

    @Nullable
    public b a(OnClickListener onClickListener) {
        return null;
    }

    public void a() {
        d.b("recordImpression must be called on the main UI thread.");
        synchronized (this.f) {
            a(true);
            if (this.d != null) {
                this.d.a();
                this.c.B();
            } else {
                try {
                    if (this.a != null && !this.a.j()) {
                        this.a.i();
                        this.c.B();
                    } else if (!(this.b == null || this.b.h())) {
                        this.b.g();
                        this.c.B();
                    }
                } catch (Throwable e) {
                    b.d("Failed to call recordImpression", e);
                }
            }
        }
    }

    public void a(View view, Map<String, WeakReference<View>> map) {
        synchronized (this.f) {
            try {
                if (this.a != null) {
                    this.a.c(f.a((Object) view));
                } else if (this.b != null) {
                    this.b.c(f.a((Object) view));
                }
            } catch (Throwable e) {
                b.d("Failed to call untrackView", e);
            }
        }
    }

    public void a(View view, Map<String, WeakReference<View>> map, OnTouchListener onTouchListener, OnClickListener onClickListener) {
        synchronized (this.f) {
            this.e = true;
            try {
                if (this.a != null) {
                    this.a.b(f.a((Object) view));
                } else if (this.b != null) {
                    this.b.b(f.a((Object) view));
                }
            } catch (Throwable e) {
                b.d("Failed to call prepareAd", e);
            }
            this.e = false;
        }
    }

    public void a(View view, Map<String, WeakReference<View>> map, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        d.b("performClick must be called on the main UI thread.");
        synchronized (this.f) {
            if (this.d != null) {
                this.d.a(view, (Map) map, jSONObject, jSONObject2, jSONObject3);
                this.c.e();
            } else {
                try {
                    if (!(this.a == null || this.a.k())) {
                        this.a.a(f.a((Object) view));
                        this.c.e();
                    }
                    if (!(this.b == null || this.b.i())) {
                        this.b.a(f.a((Object) view));
                        this.c.e();
                    }
                } catch (Throwable e) {
                    b.d("Failed to call performClick", e);
                }
            }
        }
    }

    public void a(@Nullable i iVar) {
        synchronized (this.f) {
            this.d = iVar;
        }
    }

    public boolean b() {
        boolean z;
        synchronized (this.f) {
            z = this.e;
        }
        return z;
    }

    public i c() {
        i iVar;
        synchronized (this.f) {
            iVar = this.d;
        }
        return iVar;
    }

    @Nullable
    public acy d() {
        return null;
    }
}
