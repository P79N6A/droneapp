package com.google.android.gms.c;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.l;

public abstract class h<T> {
    private final String a;
    private T b;

    public static class a extends Exception {
        public a(String str) {
            super(str);
        }

        public a(String str, Throwable th) {
            super(str, th);
        }
    }

    protected h(String str) {
        this.a = str;
    }

    protected final T b(Context context) {
        if (this.b == null) {
            d.a((Object) context);
            Context l = l.l(context);
            if (l == null) {
                throw new a("Could not get remote context.");
            }
            try {
                this.b = b((IBinder) l.getClassLoader().loadClass(this.a).newInstance());
            } catch (Throwable e) {
                throw new a("Could not load creator class.", e);
            } catch (Throwable e2) {
                throw new a("Could not instantiate creator.", e2);
            } catch (Throwable e22) {
                throw new a("Could not access creator.", e22);
            }
        }
        return this.b;
    }

    protected abstract T b(IBinder iBinder);
}
