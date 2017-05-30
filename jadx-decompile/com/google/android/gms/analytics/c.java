package com.google.android.gms.analytics;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.annotation.RequiresPermission;
import android.util.Log;
import com.google.android.gms.analytics.internal.ao;
import com.google.android.gms.analytics.internal.f;
import com.google.android.gms.analytics.internal.n;
import com.google.android.gms.analytics.internal.o;
import com.google.android.gms.analytics.internal.q;
import com.google.android.gms.analytics.internal.r;
import com.google.android.gms.analytics.internal.v;
import com.google.android.gms.common.internal.d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class c extends h {
    private static List<Runnable> b = new ArrayList();
    private boolean c;
    private Set<a> d = new HashSet();
    private boolean e;
    private boolean f;
    private volatile boolean g;
    private boolean h;

    interface a {
        void a(Activity activity);

        void b(Activity activity);
    }

    @TargetApi(14)
    class b implements ActivityLifecycleCallbacks {
        final /* synthetic */ c a;

        b(c cVar) {
            this.a = cVar;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            this.a.b(activity);
        }

        public void onActivityStopped(Activity activity) {
            this.a.d(activity);
        }
    }

    public c(v vVar) {
        super(vVar);
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    public static c a(Context context) {
        return v.a(context).k();
    }

    public static void d() {
        synchronized (c.class) {
            if (b != null) {
                for (Runnable run : b) {
                    run.run();
                }
                b = null;
            }
        }
    }

    private r p() {
        return k().i();
    }

    private q q() {
        return k().l();
    }

    public g a(int i) {
        g gVar;
        synchronized (this) {
            gVar = new g(k(), null, null);
            if (i > 0) {
                o oVar = (o) new n(k()).a(i);
                if (oVar != null) {
                    gVar.a(oVar);
                }
            }
            gVar.E();
        }
        return gVar;
    }

    public g a(String str) {
        g gVar;
        synchronized (this) {
            gVar = new g(k(), str, null);
            gVar.E();
        }
        return gVar;
    }

    public void a() {
        b();
        this.c = true;
    }

    public void a(Activity activity) {
        if (!this.e) {
            b(activity);
        }
    }

    @TargetApi(14)
    public void a(Application application) {
        if (VERSION.SDK_INT >= 14 && !this.e) {
            application.registerActivityLifecycleCallbacks(new b(this));
            this.e = true;
        }
    }

    void a(a aVar) {
        this.d.add(aVar);
        Context b = k().b();
        if (b instanceof Application) {
            a((Application) b);
        }
    }

    @Deprecated
    public void a(e eVar) {
        f.a(eVar);
        if (!this.h) {
            String str = (String) ao.c.a();
            Log.i((String) ao.c.a(), new StringBuilder(String.valueOf(str).length() + 112).append("GoogleAnalytics.setLogger() is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.").append(str).append(" DEBUG").toString());
            this.h = true;
        }
    }

    public void a(boolean z) {
        this.f = z;
    }

    void b() {
        q q = q();
        if (q.d()) {
            g().a(q.e());
        }
        if (q.h()) {
            a(q.i());
        }
        if (q.d()) {
            e a = f.a();
            if (a != null) {
                a.a(q.e());
            }
        }
    }

    public void b(int i) {
        p().a(i);
    }

    void b(Activity activity) {
        for (a a : this.d) {
            a.a(activity);
        }
    }

    void b(a aVar) {
        this.d.remove(aVar);
    }

    public void b(boolean z) {
        this.g = z;
        if (this.g) {
            p().c();
        }
    }

    public void c(Activity activity) {
        if (!this.e) {
            d(activity);
        }
    }

    public boolean c() {
        return this.c;
    }

    void d(Activity activity) {
        for (a b : this.d) {
            b.b(activity);
        }
    }

    public boolean e() {
        return this.f;
    }

    public boolean f() {
        return this.g;
    }

    @Deprecated
    public e g() {
        return f.a();
    }

    public String h() {
        d.c("getClientId can not be called from the main thread");
        return k().p().b();
    }

    public void i() {
        p().d();
    }

    void j() {
        p().e();
    }
}
