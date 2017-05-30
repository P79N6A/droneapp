package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.common.l;

@aaa
public class ue {
    private final Object a = new Object();
    private boolean b = false;
    @Nullable
    private SharedPreferences c = null;

    public <T> T a(ub<T> ubVar) {
        synchronized (this.a) {
            if (this.b) {
                return acj.a(new 1(this, ubVar));
            }
            T b = ubVar.b();
            return b;
        }
    }

    public void a(Context context) {
        synchronized (this.a) {
            if (this.b) {
                return;
            }
            Context l = l.l(context);
            if (l == null) {
                return;
            }
            this.c = u.o().a(l);
            this.b = true;
        }
    }
}
