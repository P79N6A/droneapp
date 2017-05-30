package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.d;

public final class ail<L> {
    private final a a;
    private volatile L b;
    private final b<L> c;

    public interface c<L> {
        void a();

        void a(L l);
    }

    private final class a extends Handler {
        final /* synthetic */ ail a;

        public a(ail com_google_android_gms_internal_ail, Looper looper) {
            this.a = com_google_android_gms_internal_ail;
            super(looper);
        }

        public void handleMessage(Message message) {
            boolean z = true;
            if (message.what != 1) {
                z = false;
            }
            d.b(z);
            this.a.b((c) message.obj);
        }
    }

    public static final class b<L> {
        private final L a;
        private final String b;

        private b(L l, String str) {
            this.a = l;
            this.b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b.equals(bVar.b);
        }

        public int hashCode() {
            return (System.identityHashCode(this.a) * 31) + this.b.hashCode();
        }
    }

    ail(@NonNull Looper looper, @NonNull L l, @NonNull String str) {
        this.a = new a(this, looper);
        this.b = d.a(l, "Listener must not be null");
        this.c = new b(l, d.a(str));
    }

    public void a() {
        this.b = null;
    }

    public void a(c<? super L> cVar) {
        d.a(cVar, "Notifier must not be null");
        this.a.sendMessage(this.a.obtainMessage(1, cVar));
    }

    @NonNull
    public b<L> b() {
        return this.c;
    }

    void b(c<? super L> cVar) {
        Object obj = this.b;
        if (obj == null) {
            cVar.a();
            return;
        }
        try {
            cVar.a(obj);
        } catch (RuntimeException e) {
            cVar.a();
            throw e;
        }
    }
}
