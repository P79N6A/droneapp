package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.MainThread;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.f;
import com.google.android.gms.measurement.AppMeasurement$b;
import com.google.android.gms.measurement.AppMeasurement$c;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;

public class d extends b {
    private a a;
    private AppMeasurement$b b;
    private final Set<AppMeasurement$c> c = new CopyOnWriteArraySet();
    private boolean d;

    @MainThread
    @TargetApi(14)
    private class a implements ActivityLifecycleCallbacks {
        final /* synthetic */ d a;

        private a(d dVar) {
            this.a = dVar;
        }

        private boolean a(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            this.a.a("auto", "_ldl", (Object) str);
            return true;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            try {
                this.a.w().E().a("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent != null) {
                    Uri data = intent.getData();
                    if (data != null && data.isHierarchical()) {
                        if (bundle == null) {
                            Bundle a = this.a.s().a(data);
                            if (a != null) {
                                this.a.a("auto", "_cmp", a);
                            }
                        }
                        String queryParameter = data.getQueryParameter("referrer");
                        if (!TextUtils.isEmpty(queryParameter)) {
                            if (queryParameter.contains("gclid")) {
                                this.a.w().D().a("Activity created with referrer", queryParameter);
                                a(queryParameter);
                                return;
                            }
                            this.a.w().D().a("Activity created with data 'referrer' param without gclid");
                        }
                    }
                }
            } catch (Throwable th) {
                this.a.w().f().a("Throwable caught in onActivityCreated", th);
            }
        }

        public void onActivityDestroyed(Activity activity) {
        }

        @MainThread
        public void onActivityPaused(Activity activity) {
            this.a.u().g();
        }

        @MainThread
        public void onActivityResumed(Activity activity) {
            this.a.u().f();
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    protected d(aj ajVar) {
        super(ajVar);
    }

    private String A() {
        return "com.google.android.gms.tagmanager.TagManagerService";
    }

    private void a(String str, String str2, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        a(str, str2, p().a(), bundle, z, z2, z3, str3);
    }

    @WorkerThread
    private void a(String str, String str2, Object obj, long j) {
        com.google.android.gms.common.internal.d.a(str);
        com.google.android.gms.common.internal.d.a(str2);
        j();
        h();
        c();
        if (!this.n.E()) {
            w().D().a("User property not set since app measurement is disabled");
        } else if (this.n.b()) {
            w().D().a("Setting user property (FE)", str2, obj);
            o().a(new UserAttributeParcel(str2, j, obj, str));
        }
    }

    @WorkerThread
    private void b(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        com.google.android.gms.common.internal.d.a(str);
        com.google.android.gms.common.internal.d.a(str2);
        com.google.android.gms.common.internal.d.a(bundle);
        j();
        c();
        if (this.n.E()) {
            if (!this.d) {
                this.d = true;
                z();
            }
            boolean l = m.l(str2);
            if (z && this.b != null && !l) {
                w().D().a("Passing event to registered event handler (FE)", str2, bundle);
                this.b.a(str, str2, bundle, j);
                return;
            } else if (this.n.b()) {
                int c = s().c(str2);
                if (c != 0) {
                    this.n.o().a(c, "_ev", s().a(str2, y().c(), true), str2 != null ? str2.length() : 0);
                    return;
                }
                bundle.putString("_o", str);
                Bundle a = s().a(str2, bundle, f.a((Object) "_o"), z3);
                Bundle a2 = z2 ? a(a) : a;
                w().D().a("Logging event (FE)", str2, a2);
                o().a(new EventParcel(str2, new EventParams(a2), str, j), str3);
                for (AppMeasurement$c a3 : this.c) {
                    a3.a(str, str2, new Bundle(a2), j);
                }
                return;
            } else {
                return;
            }
        }
        w().D().a("Event not sent since app measurement is disabled");
    }

    @WorkerThread
    private void c(boolean z) {
        j();
        h();
        c();
        w().D().a("Setting app measurement enabled (FE)", Boolean.valueOf(z));
        x().b(z);
        o().g();
    }

    @WorkerThread
    private void z() {
        try {
            a(Class.forName(A()));
        } catch (ClassNotFoundException e) {
            w().C().a("Tag Manager is not found and thus will not be used");
        }
    }

    Bundle a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object b = s().b(str, bundle.get(str));
                if (b == null) {
                    w().z().a("Param value can't be null", str);
                } else {
                    s().a(bundle2, str, b);
                }
            }
        }
        return bundle2;
    }

    public void a(final long j) {
        h();
        v().a(new Runnable(this) {
            final /* synthetic */ d b;

            public void run() {
                this.b.x().h.a(j);
                this.b.w().D().a("Minimum session duration set", Long.valueOf(j));
            }
        });
    }

    @WorkerThread
    public void a(AppMeasurement$b appMeasurement$b) {
        j();
        h();
        c();
        if (!(appMeasurement$b == null || appMeasurement$b == this.b)) {
            com.google.android.gms.common.internal.d.a(this.b == null, "EventInterceptor already set.");
        }
        this.b = appMeasurement$b;
    }

    public void a(AppMeasurement$c appMeasurement$c) {
        h();
        c();
        com.google.android.gms.common.internal.d.a(appMeasurement$c);
        if (!this.c.add(appMeasurement$c)) {
            w().z().a("OnEventListener already registered");
        }
    }

    @WorkerThread
    public void a(Class<?> cls) {
        try {
            cls.getDeclaredMethod("initialize", new Class[]{Context.class}).invoke(null, new Object[]{q()});
        } catch (Exception e) {
            w().z().a("Failed to invoke Tag Manager's initialize() method", e);
        }
    }

    protected void a(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        final Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        final String str4 = str;
        final String str5 = str2;
        final long j2 = j;
        final boolean z4 = z;
        final boolean z5 = z2;
        final boolean z6 = z3;
        final String str6 = str3;
        v().a(new Runnable(this) {
            final /* synthetic */ d i;

            public void run() {
                this.i.b(str4, str5, j2, bundle2, z4, z5, z6, str6);
            }
        });
    }

    void a(String str, String str2, long j, Object obj) {
        final String str3 = str;
        final String str4 = str2;
        final Object obj2 = obj;
        final long j2 = j;
        v().a(new Runnable(this) {
            final /* synthetic */ d e;

            public void run() {
                this.e.a(str3, str4, obj2, j2);
            }
        });
    }

    public void a(String str, String str2, Bundle bundle) {
        h();
        boolean z = this.b == null || m.l(str2);
        a(str, str2, bundle, true, z, false, null);
    }

    public void a(String str, String str2, Bundle bundle, long j) {
        h();
        a(str, str2, j, bundle, false, true, true, null);
    }

    public void a(String str, String str2, Bundle bundle, boolean z) {
        h();
        boolean z2 = this.b == null || m.l(str2);
        a(str, str2, bundle, true, z2, z, null);
    }

    public void a(String str, String str2, Object obj) {
        int i = 0;
        com.google.android.gms.common.internal.d.a(str);
        long a = p().a();
        int e = s().e(str2);
        String a2;
        if (e != 0) {
            a2 = s().a(str2, y().d(), true);
            if (str2 != null) {
                i = str2.length();
            }
            this.n.o().a(e, "_ev", a2, i);
        } else if (obj != null) {
            e = s().c(str2, obj);
            if (e != 0) {
                a2 = s().a(str2, y().d(), true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i = String.valueOf(obj).length();
                }
                this.n.o().a(e, "_ev", a2, i);
                return;
            }
            Object d = s().d(str2, obj);
            if (d != null) {
                a(str, str2, a, d);
            }
        } else {
            a(str, str2, a, null);
        }
    }

    public void a(final boolean z) {
        c();
        h();
        v().a(new Runnable(this) {
            final /* synthetic */ d b;

            public void run() {
                this.b.c(z);
            }
        });
    }

    public List<UserAttributeParcel> b(final boolean z) {
        h();
        c();
        w().D().a("Fetching user attributes (FE)");
        final AtomicReference atomicReference = new AtomicReference();
        synchronized (atomicReference) {
            this.n.h().a(new Runnable(this) {
                final /* synthetic */ d c;

                public void run() {
                    this.c.o().a(atomicReference, z);
                }
            });
            try {
                atomicReference.wait(5000);
            } catch (InterruptedException e) {
                w().z().a("Interrupted waiting for get user properties", e);
            }
        }
        List<UserAttributeParcel> list = (List) atomicReference.get();
        if (list != null) {
            return list;
        }
        w().z().a("Timed out waiting for get user properties");
        return Collections.emptyList();
    }

    public void b(final long j) {
        h();
        v().a(new Runnable(this) {
            final /* synthetic */ d b;

            public void run() {
                this.b.x().i.a(j);
                this.b.w().D().a("Session timeout duration set", Long.valueOf(j));
            }
        });
    }

    protected void e() {
    }

    @TargetApi(14)
    public void f() {
        if (q().getApplicationContext() instanceof Application) {
            Application application = (Application) q().getApplicationContext();
            if (this.a == null) {
                this.a = new a();
            }
            application.unregisterActivityLifecycleCallbacks(this.a);
            application.registerActivityLifecycleCallbacks(this.a);
            w().E().a("Registered activity lifecycle callback");
        }
    }

    @WorkerThread
    public void g() {
        j();
        h();
        c();
        if (this.n.b()) {
            o().z();
            String D = x().D();
            if (!TextUtils.isEmpty(D) && !D.equals(n().g())) {
                Bundle bundle = new Bundle();
                bundle.putString("_po", D);
                a("auto", "_ou", bundle);
            }
        }
    }

    public /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    public /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    public /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    public /* bridge */ /* synthetic */ o k() {
        return super.k();
    }

    public /* bridge */ /* synthetic */ d l() {
        return super.l();
    }

    public /* bridge */ /* synthetic */ z m() {
        return super.m();
    }

    public /* bridge */ /* synthetic */ s n() {
        return super.n();
    }

    public /* bridge */ /* synthetic */ e o() {
        return super.o();
    }

    public /* bridge */ /* synthetic */ e p() {
        return super.p();
    }

    public /* bridge */ /* synthetic */ Context q() {
        return super.q();
    }

    public /* bridge */ /* synthetic */ q r() {
        return super.r();
    }

    public /* bridge */ /* synthetic */ m s() {
        return super.s();
    }

    public /* bridge */ /* synthetic */ ah t() {
        return super.t();
    }

    public /* bridge */ /* synthetic */ g u() {
        return super.u();
    }

    public /* bridge */ /* synthetic */ ai v() {
        return super.v();
    }

    public /* bridge */ /* synthetic */ ab w() {
        return super.w();
    }

    public /* bridge */ /* synthetic */ af x() {
        return super.x();
    }

    public /* bridge */ /* synthetic */ p y() {
        return super.y();
    }
}
