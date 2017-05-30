package com.google.android.gms.maps.a;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.c.f;
import com.google.android.gms.common.c;
import com.google.android.gms.common.e;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.maps.a.x.a;
import com.google.android.gms.maps.model.j;

public class v {
    private static Context a;
    private static x b;

    public static x a(Context context) {
        d.a(context);
        if (b != null) {
            return b;
        }
        b(context);
        b = c(context);
        try {
            b.a(f.a(d(context).getResources()), e.b);
            return b;
        } catch (RemoteException e) {
            throw new j(e);
        }
    }

    private static <T> T a(Class<?> cls) {
        String str;
        String valueOf;
        try {
            return cls.newInstance();
        } catch (InstantiationException e) {
            str = "Unable to instantiate the dynamic class ";
            valueOf = String.valueOf(cls.getName());
            throw new IllegalStateException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        } catch (IllegalAccessException e2) {
            str = "Unable to call the default constructor of ";
            valueOf = String.valueOf(cls.getName());
            throw new IllegalStateException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    }

    private static <T> T a(ClassLoader classLoader, String str) {
        try {
            return a(((ClassLoader) d.a(classLoader)).loadClass(str));
        } catch (ClassNotFoundException e) {
            String str2 = "Unable to find dynamic class ";
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
    }

    public static boolean a() {
        return false;
    }

    private static Class<?> b() {
        try {
            return Class.forName("com.google.android.gms.maps.internal.CreatorImpl");
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    private static void b(Context context) {
        int a = e.a(context);
        switch (a) {
            case 0:
                return;
            default:
                throw new c(a);
        }
    }

    private static x c(Context context) {
        if (a()) {
            Log.i(v.class.getSimpleName(), "Making Creator statically");
            return (x) a(b());
        }
        Log.i(v.class.getSimpleName(), "Making Creator dynamically");
        return a.a((IBinder) a(d(context).getClassLoader(), "com.google.android.gms.maps.internal.CreatorImpl"));
    }

    private static Context d(Context context) {
        if (a == null) {
            if (a()) {
                a = context.getApplicationContext();
            } else {
                a = e.d(context);
            }
        }
        return a;
    }
}
