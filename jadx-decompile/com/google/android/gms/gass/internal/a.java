package com.google.android.gms.gass.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.p.b;
import com.google.android.gms.common.internal.p.c;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class a {

    static class a implements b, c {
        protected b a;
        private final String b;
        private final String c;
        private final LinkedBlockingQueue<com.google.android.gms.internal.df.a> d;
        private final HandlerThread e = new HandlerThread("GassClient");

        public a(Context context, String str, String str2) {
            this.b = str;
            this.c = str2;
            this.e.start();
            this.a = new b(context, this.e.getLooper(), this, this);
            this.d = new LinkedBlockingQueue();
            c();
        }

        public com.google.android.gms.internal.df.a a() {
            return b(2000);
        }

        public void a(int i) {
            try {
                this.d.put(new com.google.android.gms.internal.df.a());
            } catch (InterruptedException e) {
            }
        }

        public void a(Bundle bundle) {
            e b = b();
            if (b != null) {
                try {
                    this.d.put(b.a(new GassRequestParcel(this.b, this.c)).b());
                } catch (Throwable th) {
                } finally {
                    d();
                    this.e.quit();
                }
            }
        }

        public void a(ConnectionResult connectionResult) {
            try {
                this.d.put(new com.google.android.gms.internal.df.a());
            } catch (InterruptedException e) {
            }
        }

        protected e b() {
            try {
                return this.a.h();
            } catch (IllegalStateException e) {
                return null;
            } catch (DeadObjectException e2) {
                return null;
            }
        }

        public com.google.android.gms.internal.df.a b(int i) {
            com.google.android.gms.internal.df.a aVar;
            try {
                aVar = (com.google.android.gms.internal.df.a) this.d.poll((long) i, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                aVar = null;
            }
            return aVar == null ? new com.google.android.gms.internal.df.a() : aVar;
        }

        protected void c() {
            this.a.A();
        }

        public void d() {
            if (this.a == null) {
                return;
            }
            if (this.a.t() || this.a.u()) {
                this.a.f();
            }
        }
    }

    public static com.google.android.gms.internal.df.a a(Context context, String str, String str2) {
        return new a(context, str, str2).a();
    }
}
