package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

@TargetApi(14)
class tp$a implements ActivityLifecycleCallbacks {
    @Nullable
    private Activity a;
    private Context b;
    private final Object c = new Object();
    private boolean d = true;
    private boolean e = false;
    private List<tp$b> f = new ArrayList();
    private Runnable g;
    private boolean h = false;
    private long i;

    tp$a() {
    }

    private void a(Activity activity) {
        synchronized (this.c) {
            if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.a = activity;
            }
        }
    }

    @Nullable
    public Activity a() {
        return this.a;
    }

    public void a(Application application, Context context) {
        if (!this.h) {
            application.registerActivityLifecycleCallbacks(this);
            if (context instanceof Activity) {
                a((Activity) context);
            }
            this.b = context;
            this.i = ((Long) uf.ap.c()).longValue();
            this.h = true;
        }
    }

    public void a(tp$b com_google_android_gms_internal_tp_b) {
        this.f.add(com_google_android_gms_internal_tp_b);
    }

    @Nullable
    public Context b() {
        return this.b;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityDestroyed(android.app.Activity r3) {
        /*
        r2 = this;
        r1 = r2.c;
        monitor-enter(r1);
        r0 = r2.a;	 Catch:{ all -> 0x0016 }
        if (r0 != 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r1);	 Catch:{ all -> 0x0016 }
    L_0x0008:
        return;
    L_0x0009:
        r0 = r2.a;	 Catch:{ all -> 0x0016 }
        r0 = r0.equals(r3);	 Catch:{ all -> 0x0016 }
        if (r0 == 0) goto L_0x0014;
    L_0x0011:
        r0 = 0;
        r2.a = r0;	 Catch:{ all -> 0x0016 }
    L_0x0014:
        monitor-exit(r1);	 Catch:{ all -> 0x0016 }
        goto L_0x0008;
    L_0x0016:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0016 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.tp$a.onActivityDestroyed(android.app.Activity):void");
    }

    public void onActivityPaused(Activity activity) {
        a(activity);
        this.e = true;
        if (this.g != null) {
            abv.a.removeCallbacks(this.g);
        }
        Handler handler = abv.a;
        Runnable anonymousClass1 = new Runnable(this) {
            final /* synthetic */ tp$a a;

            {
                this.a = r1;
            }

            public void run() {
                synchronized (this.a.c) {
                    if (this.a.d && this.a.e) {
                        this.a.d = false;
                        abr.a("App went background");
                        for (tp$b a : this.a.f) {
                            try {
                                a.a(false);
                            } catch (Throwable e) {
                                abr.b("OnForegroundStateChangedListener threw exception.", e);
                            }
                        }
                    } else {
                        abr.a("App is still foreground");
                    }
                }
            }
        };
        this.g = anonymousClass1;
        handler.postDelayed(anonymousClass1, this.i);
    }

    public void onActivityResumed(Activity activity) {
        boolean z = false;
        a(activity);
        this.e = false;
        if (!this.d) {
            z = true;
        }
        this.d = true;
        if (this.g != null) {
            abv.a.removeCallbacks(this.g);
        }
        synchronized (this.c) {
            if (z) {
                for (tp$b a : this.f) {
                    try {
                        a.a(true);
                    } catch (Throwable e) {
                        abr.b("OnForegroundStateChangedListener threw exception.", e);
                    }
                }
            } else {
                abr.a("App is still foreground.");
            }
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        a(activity);
    }

    public void onActivityStopped(Activity activity) {
    }
}
