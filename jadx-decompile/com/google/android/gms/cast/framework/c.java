package com.google.android.gms.cast.framework;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.media.MediaRouteSelector;
import android.support.v7.media.MediaRouter;
import android.view.KeyEvent;
import com.google.android.gms.c.e;
import com.google.android.gms.c.f;
import com.google.android.gms.cast.internal.m;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.util.s;
import com.google.android.gms.internal.afc;
import com.google.android.gms.internal.afd;
import com.google.android.gms.internal.afm;
import com.google.android.gms.internal.zznv;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class c {
    public static final String a = "com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME";
    private static final m b = new m("CastContext");
    private static a c;
    private static c d;
    private final Context e;
    private final t f;
    private final k g;
    private final q h;
    private final CastOptions i;
    private afm j = new afm(MediaRouter.getInstance(this.e));

    @TargetApi(14)
    private static class a implements ActivityLifecycleCallbacks {
        private Context a;

        public a(Context context) {
            this.a = context.getApplicationContext();
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
            c.a(this.a).b(activity);
        }

        public void onActivityResumed(Activity activity) {
            c.a(this.a).a(activity);
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    private c(Context context, CastOptions castOptions, List<m> list) {
        w d;
        aa c;
        k kVar = null;
        this.e = context.getApplicationContext();
        this.i = castOptions;
        Map hashMap = new HashMap();
        afd com_google_android_gms_internal_afd = new afd(this.e, castOptions, this.j);
        hashMap.put(com_google_android_gms_internal_afd.b(), com_google_android_gms_internal_afd.d());
        if (list != null) {
            for (Object obj : list) {
                d.a(obj, (Object) "Additional SessionProvider must not be null.");
                String a = d.a(obj.b(), (Object) "Category for SessionProvider must not be null or empty string.");
                d.b(!hashMap.containsKey(a), String.format("SessionProvider for category %s already added", new Object[]{a}));
                hashMap.put(a, obj.d());
            }
        }
        this.f = afc.a(this.e, castOptions, this.j, hashMap);
        try {
            d = this.f.d();
        } catch (Throwable e) {
            b.a(e, "Unable to call %s on %s.", "getDiscoveryManagerImpl", t.class.getSimpleName());
            d = null;
        }
        this.h = d == null ? null : new q(d);
        try {
            c = this.f.c();
        } catch (Throwable e2) {
            b.a(e2, "Unable to call %s on %s.", "getSessionManagerImpl", t.class.getSimpleName());
            c = null;
        }
        if (c != null) {
            kVar = new k(c);
        }
        this.g = kVar;
    }

    public static c a(@NonNull Context context) {
        d.b("getSharedInstance must be called from the main thread.");
        if (d == null) {
            i b = b(context.getApplicationContext());
            d = new c(context, b.a(context.getApplicationContext()), b.b(context.getApplicationContext()));
            if (s.d()) {
                c = new a(context.getApplicationContext());
                ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(c);
            }
        }
        return d;
    }

    private boolean a(d dVar, double d, boolean z) {
        IllegalStateException e;
        double d2 = 1.0d;
        if (z) {
            try {
                double h = dVar.h() + d;
                if (h <= 1.0d) {
                    d2 = h;
                }
                dVar.a(d2);
            } catch (IOException e2) {
                e = e2;
                b.e("Unable to call CastSession.setVolume(double).", e);
                return true;
            } catch (IllegalStateException e3) {
                e = e3;
                b.e("Unable to call CastSession.setVolume(double).", e);
                return true;
            }
        }
        return true;
    }

    private static i b(Context context) {
        Throwable e;
        try {
            String string = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString(a);
            if (string != null) {
                return (i) Class.forName(string).newInstance();
            }
            throw new IllegalStateException("The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME.");
        } catch (NameNotFoundException e2) {
            e = e2;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (ClassNotFoundException e3) {
            e = e3;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (NullPointerException e4) {
            e = e4;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (InstantiationException e5) {
            e = e5;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (IllegalAccessException e6) {
            e = e6;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        }
    }

    public CastOptions a() {
        d.b("getCastOptions must be called from the main thread.");
        return this.i;
    }

    public void a(Activity activity) {
        d.b("onActivityResumed must be called from the main thread.");
        try {
            this.f.a(f.a((Object) activity));
        } catch (Throwable e) {
            b.a(e, "Unable to call %s on %s.", "onActivityResumed", t.class.getSimpleName());
        }
    }

    public void a(@NonNull FragmentActivity fragmentActivity, Bundle bundle) {
        if (!s.d()) {
            zznv.a(fragmentActivity, bundle);
        }
    }

    public void a(a aVar) {
        d.b("addAppVisibilityListener must be called from the main thread.");
        d.a((Object) aVar);
        try {
            this.f.a(new n(aVar));
        } catch (Throwable e) {
            b.a(e, "Unable to call %s on %s.", "addVisibilityChangeListener", t.class.getSimpleName());
        }
    }

    public void a(f fVar) {
        d.b("addCastStateListener must be called from the main thread.");
        d.a((Object) fVar);
        this.g.a(fVar);
    }

    public boolean a(KeyEvent keyEvent) {
        d.b("onDispatchVolumeKeyEventBeforeJellyBean must be called from the main thread.");
        if (s.e()) {
            return false;
        }
        d b = this.g.b();
        if (b == null || !b.o()) {
            return false;
        }
        double i = a().i();
        boolean z = keyEvent.getAction() == 0;
        switch (keyEvent.getKeyCode()) {
            case 24:
                return a(b, i, z);
            case 25:
                return a(b, -i, z);
            default:
                return false;
        }
    }

    public k b() {
        d.b("getSessionManager must be called from the main thread.");
        return this.g;
    }

    public void b(Activity activity) {
        d.b("onActivityPaused must be called from the main thread.");
        try {
            this.f.b(f.a((Object) activity));
        } catch (Throwable e) {
            b.a(e, "Unable to call %s on %s.", "onActivityPaused", t.class.getSimpleName());
        }
    }

    public void b(a aVar) {
        d.b("removeAppVisibilityListener must be called from the main thread.");
        if (aVar != null) {
            try {
                this.f.b(new n(aVar));
            } catch (Throwable e) {
                b.a(e, "Unable to call %s on %s.", "addVisibilityChangeListener", t.class.getSimpleName());
            }
        }
    }

    public void b(f fVar) {
        d.b("addCastStateListener must be called from the main thread.");
        if (fVar != null) {
            this.g.b(fVar);
        }
    }

    public MediaRouteSelector c() {
        d.b("getMergedSelector must be called from the main thread.");
        try {
            return MediaRouteSelector.fromBundle(this.f.a());
        } catch (Throwable e) {
            b.a(e, "Unable to call %s on %s.", "getMergedSelectorAsBundle", t.class.getSimpleName());
            return null;
        }
    }

    public boolean d() {
        boolean z = false;
        d.b("isAppVisible must be called from the main thread.");
        try {
            z = this.f.b();
        } catch (Throwable e) {
            b.a(e, "Unable to call %s on %s.", "isApplicationVisible", t.class.getSimpleName());
        }
        return z;
    }

    public q e() {
        d.b("getDiscoveryManager must be called from the main thread.");
        return this.h;
    }

    public e f() {
        try {
            return this.f.f();
        } catch (Throwable e) {
            b.a(e, "Unable to call %s on %s.", "getWrappedThis", t.class.getSimpleName());
            return null;
        }
    }
}
