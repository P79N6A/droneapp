package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.c.f;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.tagmanager.ModuleDescriptor;
import com.google.android.gms.internal.akb;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tagmanager.al.a;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

final class l {
    private static volatile akb a;
    private static volatile ak b;
    private static final Map<String, c> c = new HashMap();
    private static final Map<String, d> d = new HashMap();

    private l() {
    }

    static IBinder a(Context context) {
        try {
            return a.asInterface(d(context).a("com.google.android.gms.tagmanager.TagManagerServiceProviderImpl")).getService(f.a((Object) context), e(context), a()).asBinder();
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        } catch (Throwable e2) {
            throw new RuntimeException(e2);
        }
    }

    static af a() {
        return new 2();
    }

    static void a(Intent intent, Context context) {
        ak c = c(context);
        synchronized (l.class) {
            try {
                c.previewIntent(intent, f.a((Object) context), f.a(a.a()), e(context), a());
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        }
    }

    private static Object b(String str, Class<?> cls) {
        Object obj = null;
        Object obj2 = null;
        try {
            Class cls2 = Class.forName(str);
            for (Object equals : cls2.getInterfaces()) {
                if (equals.equals(cls)) {
                    obj = 1;
                    break;
                }
            }
            if (obj == null) {
                String valueOf = String.valueOf(cls.getCanonicalName());
                Log.e("GoogleTagManagerAPI", new StringBuilder((String.valueOf(str).length() + 30) + String.valueOf(valueOf).length()).append(str).append(" doesn't implement ").append(valueOf).append(" interface.").toString());
            } else {
                try {
                    obj2 = cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (NoSuchMethodException e) {
                    Log.e("GoogleTagManagerAPI", String.valueOf(str).concat(" doesn't have a valid no-arg constructor"));
                } catch (SecurityException e2) {
                    Log.e("GoogleTagManagerAPI", String.valueOf(str).concat(" doesn't have an accessible no-arg constructor"));
                } catch (InvocationTargetException e3) {
                    Log.e("GoogleTagManagerAPI", String.valueOf(str).concat(" construction threw an exception."));
                } catch (InstantiationException e4) {
                    Log.e("GoogleTagManagerAPI", String.valueOf(str).concat(" is an abstract class."));
                } catch (IllegalAccessException e5) {
                    Log.e("GoogleTagManagerAPI", String.valueOf(str).concat(" doesn't have an accessible no-arg constructor"));
                }
            }
        } catch (ClassNotFoundException e6) {
            Log.e("GoogleTagManagerAPI", String.valueOf(str).concat(" can't be found in the application."));
        }
        return obj2;
    }

    static void b(Context context) {
        ak c = c(context);
        synchronized (l.class) {
            try {
                c.initialize(f.a((Object) context), e(context), a());
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        }
    }

    private static ak c(Context context) {
        ak akVar = b;
        if (akVar == null) {
            synchronized (l.class) {
                akVar = b;
                if (akVar == null) {
                    try {
                        akVar = ak.a.asInterface(d(context).a("com.google.android.gms.tagmanager.TagManagerApiImpl"));
                        b = akVar;
                    } catch (Throwable e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        return akVar;
    }

    private static akb d(Context context) {
        akb com_google_android_gms_internal_akb = a;
        if (com_google_android_gms_internal_akb == null) {
            synchronized (l.class) {
                com_google_android_gms_internal_akb = a;
                if (a == null) {
                    com_google_android_gms_internal_akb = akb.a(context, akb.c, ModuleDescriptor.MODULE_ID);
                    a = com_google_android_gms_internal_akb;
                }
            }
        }
        return com_google_android_gms_internal_akb;
    }

    private static aj e(Context context) {
        return new 1(AppMeasurement.getInstance(context));
    }
}
