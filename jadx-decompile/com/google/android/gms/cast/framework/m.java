package com.google.android.gms.cast.framework;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.c.e;
import com.google.android.gms.common.internal.d;

public abstract class m {
    private final Context a;
    private final String b;
    private final a c = new a();

    private class a extends com.google.android.gms.cast.framework.ac.a {
        final /* synthetic */ m a;

        private a(m mVar) {
            this.a = mVar;
        }

        public int a() {
            return 9683208;
        }

        public e a(String str) {
            j a = this.a.a(str);
            return a == null ? null : a.u();
        }

        public boolean b() {
            return this.a.c();
        }

        public String c() {
            return this.a.b();
        }
    }

    protected m(Context context, String str) {
        this.a = ((Context) d.a((Object) context)).getApplicationContext();
        this.b = d.a(str);
    }

    public final Context a() {
        return this.a;
    }

    public abstract j a(String str);

    public final String b() {
        return this.b;
    }

    public abstract boolean c();

    public IBinder d() {
        return this.c;
    }
}
