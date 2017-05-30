package com.google.android.gms.c;

import android.os.IBinder;
import com.google.android.gms.c.e.a;
import java.lang.reflect.Field;

public final class f<T> extends a {
    private final T a;

    private f(T t) {
        this.a = t;
    }

    public static <T> e a(T t) {
        return new f(t);
    }

    public static <T> T a(e eVar) {
        if (eVar instanceof f) {
            return ((f) eVar).a;
        }
        IBinder asBinder = eVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        if (declaredFields.length == 1) {
            Field field = declaredFields[0];
            if (field.isAccessible()) {
                throw new IllegalArgumentException("IObjectWrapper declared field not private!");
            }
            field.setAccessible(true);
            try {
                return field.get(asBinder);
            } catch (Throwable e) {
                throw new IllegalArgumentException("Binder object is null.", e);
            } catch (Throwable e2) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
            }
        }
        throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
    }
}
