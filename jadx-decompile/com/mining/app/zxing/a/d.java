package com.mining.app.zxing.a;

import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class d {
    private static final String a = d.class.getSimpleName();
    private static final Object b = c();
    private static final Method c = a(b);

    static {
        if (b == null) {
            Log.v(a, "This device does supports control of a flashlight");
        } else {
            Log.v(a, "This device does not support control of a flashlight");
        }
    }

    private d() {
    }

    private static Class<?> a(String str) {
        Class<?> cls = null;
        try {
            cls = Class.forName(str);
        } catch (ClassNotFoundException e) {
        } catch (Throwable e2) {
            Log.w(a, "Unexpected error while finding class " + str, e2);
        }
        return cls;
    }

    private static Object a(Method method, Object obj, Object... objArr) {
        Object obj2 = null;
        try {
            obj2 = method.invoke(obj, objArr);
        } catch (Throwable e) {
            Log.w(a, "Unexpected error while invoking " + method, e);
        } catch (InvocationTargetException e2) {
            Log.w(a, "Unexpected error while invoking " + method, e2.getCause());
        } catch (Throwable e3) {
            Log.w(a, "Unexpected error while invoking " + method, e3);
        }
        return obj2;
    }

    private static Method a(Class<?> cls, String str, Class<?>... clsArr) {
        Method method = null;
        try {
            method = cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
        } catch (Throwable e2) {
            Log.w(a, "Unexpected error while finding method " + str, e2);
        }
        return method;
    }

    private static Method a(Object obj) {
        if (obj == null) {
            return null;
        }
        return a(obj.getClass(), "setFlashlightEnabled", Boolean.TYPE);
    }

    public static void a() {
        a(true);
    }

    private static void a(boolean z) {
        if (b != null) {
            a(c, b, Boolean.valueOf(z));
        }
    }

    public static void b() {
        a(false);
    }

    private static Object c() {
        Class a = a("android.os.ServiceManager");
        if (a == null) {
            return null;
        }
        Method a2 = a(a, "getService", String.class);
        if (a2 == null || a(a2, null, "hardware") == null) {
            return null;
        }
        Class a3 = a("android.os.IHardwareService$Stub");
        if (a3 == null) {
            return null;
        }
        Method a4 = a(a3, "asInterface", IBinder.class);
        if (a4 == null) {
            return null;
        }
        return a(a4, null, r1);
    }
}
