package com.google.android.gms.common.internal;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public abstract class DowngradeableSafeParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    private static final Object a = new Object();
    private static ClassLoader b = null;
    private static Integer c = null;
    private boolean d = false;

    private static boolean a(Class<?> cls) {
        boolean z = false;
        try {
            z = SafeParcelable.NULL.equals(cls.getField("NULL").get(null));
        } catch (NoSuchFieldException e) {
        } catch (IllegalAccessException e2) {
        }
        return z;
    }

    protected static boolean a_(String str) {
        ClassLoader k_ = k_();
        if (k_ == null) {
            return true;
        }
        try {
            return a(k_.loadClass(str));
        } catch (Exception e) {
            return false;
        }
    }

    protected static ClassLoader k_() {
        synchronized (a) {
        }
        return null;
    }

    protected static Integer l_() {
        synchronized (a) {
        }
        return null;
    }

    protected boolean m_() {
        return false;
    }
}
