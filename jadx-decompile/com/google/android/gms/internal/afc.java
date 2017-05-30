package com.google.android.gms.internal;

import android.app.Service;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.IBinder;
import com.google.android.gms.c.e;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.ad;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.media.f;
import com.google.android.gms.cast.framework.s;
import com.google.android.gms.cast.framework.t;
import com.google.android.gms.cast.framework.u;
import com.google.android.gms.cast.framework.y;
import com.google.android.gms.cast.framework.z;
import com.google.android.gms.cast.internal.m;
import com.google.android.gms.internal.aff.a;
import java.util.Map;

public class afc {
    private static final m a = new m("CastDynamiteModule");

    private static IBinder a(Context context, String str) {
        Throwable e;
        try {
            return (IBinder) context.getClassLoader().loadClass(str).newInstance();
        } catch (InstantiationException e2) {
            e = e2;
            throw new RuntimeException(e);
        } catch (IllegalAccessException e3) {
            e = e3;
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e4) {
            e = e4;
            throw new RuntimeException(e);
        }
    }

    public static f a(Service service, e eVar, e eVar2, CastMediaOptions castMediaOptions) {
        try {
            return a(service.getApplicationContext()).a(com.google.android.gms.c.f.a((Object) service), eVar, eVar2, castMediaOptions);
        } catch (Throwable e) {
            a.a(e, "Unable to call %s on %s.", "newMediaNotificationServiceImpl", aff.class.getSimpleName());
            return null;
        }
    }

    public static t a(Context context, CastOptions castOptions, afh com_google_android_gms_internal_afh, Map<String, IBinder> map) {
        try {
            return a(context).a(com.google.android.gms.c.f.a(context.getApplicationContext()), castOptions, com_google_android_gms_internal_afh, map);
        } catch (Throwable e) {
            a.a(e, "Unable to call %s on %s.", "newCastContextImpl", aff.class.getSimpleName());
            return null;
        }
    }

    public static u a(Context context, CastOptions castOptions, e eVar, s sVar) {
        try {
            return a(context).a(castOptions, eVar, sVar);
        } catch (Throwable e) {
            a.a(e, "Unable to call %s on %s.", "newCastSessionImpl", aff.class.getSimpleName());
            return null;
        }
    }

    public static y a(Service service, e eVar, e eVar2) {
        try {
            return a(service.getApplicationContext()).a(com.google.android.gms.c.f.a((Object) service), eVar, eVar2);
        } catch (Throwable e) {
            a.a(e, "Unable to call %s on %s.", "newReconnectionServiceImpl", aff.class.getSimpleName());
            return null;
        }
    }

    public static z a(Context context, String str, String str2, ad adVar) {
        try {
            return a(context).a(str, str2, adVar);
        } catch (Throwable e) {
            a.a(e, "Unable to call %s on %s.", "newSessionImpl", aff.class.getSimpleName());
            return null;
        }
    }

    private static aff a(Context context) {
        if (!a()) {
            return b(context);
        }
        try {
            return a.a(akb.a(context, akb.a, "com.google.android.gms.cast.framework.dynamite").a("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl"));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static afo a(Context context, AsyncTask<Uri, Long, Bitmap> asyncTask, afp com_google_android_gms_internal_afp, int i, int i2, boolean z, long j, int i3, int i4, int i5) {
        try {
            return a(context.getApplicationContext()).a(com.google.android.gms.c.f.a((Object) asyncTask), com_google_android_gms_internal_afp, i, i2, z, j, i3, i4, i5);
        } catch (Throwable e) {
            a.a(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", aff.class.getSimpleName());
            return null;
        }
    }

    static boolean a() {
        return true;
    }

    private static aff b(Context context) {
        return a.a(a(context, "com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl"));
    }
}
