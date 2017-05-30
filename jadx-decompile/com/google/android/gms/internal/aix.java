package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.w;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public class aix {
    private static final ahn<?>[] b = new ahn[0];
    final Set<ahn<?>> a;
    private final b c;
    private final Map<d<?>, f> d;
    private final f e;
    private c f;

    interface c {
        void a();
    }

    interface b {
        void a(ahn<?> com_google_android_gms_internal_ahn_);
    }

    private static class a implements DeathRecipient, b {
        private final WeakReference<ahn<?>> a;
        private final WeakReference<w> b;
        private final WeakReference<IBinder> c;

        private a(ahn<?> com_google_android_gms_internal_ahn_, w wVar, IBinder iBinder) {
            this.b = new WeakReference(wVar);
            this.a = new WeakReference(com_google_android_gms_internal_ahn_);
            this.c = new WeakReference(iBinder);
        }

        private void a() {
            ahn com_google_android_gms_internal_ahn = (ahn) this.a.get();
            w wVar = (w) this.b.get();
            if (!(wVar == null || com_google_android_gms_internal_ahn == null)) {
                wVar.a(com_google_android_gms_internal_ahn.f().intValue());
            }
            IBinder iBinder = (IBinder) this.c.get();
            if (iBinder != null) {
                iBinder.unlinkToDeath(this, 0);
            }
        }

        public void a(ahn<?> com_google_android_gms_internal_ahn_) {
            a();
        }

        public void binderDied() {
            a();
        }
    }

    public aix(f fVar) {
        this.a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.c = new b(this) {
            final /* synthetic */ aix a;

            {
                this.a = r1;
            }

            public void a(ahn<?> com_google_android_gms_internal_ahn_) {
                this.a.a.remove(com_google_android_gms_internal_ahn_);
                if (!(com_google_android_gms_internal_ahn_.f() == null || null == null)) {
                    null.a(com_google_android_gms_internal_ahn_.f().intValue());
                }
                if (this.a.f != null && this.a.a.isEmpty()) {
                    this.a.f.a();
                }
            }
        };
        this.f = null;
        this.d = null;
        this.e = fVar;
    }

    public aix(Map<d<?>, f> map) {
        this.a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.c = /* anonymous class already generated */;
        this.f = null;
        this.d = map;
        this.e = null;
    }

    private static void a(ahn<?> com_google_android_gms_internal_ahn_, w wVar, IBinder iBinder) {
        if (com_google_android_gms_internal_ahn_.i()) {
            com_google_android_gms_internal_ahn_.a(new a(com_google_android_gms_internal_ahn_, wVar, iBinder));
        } else if (iBinder == null || !iBinder.isBinderAlive()) {
            com_google_android_gms_internal_ahn_.a(null);
            com_google_android_gms_internal_ahn_.a();
            wVar.a(com_google_android_gms_internal_ahn_.f().intValue());
        } else {
            Object aVar = new a(com_google_android_gms_internal_ahn_, wVar, iBinder);
            com_google_android_gms_internal_ahn_.a(aVar);
            try {
                iBinder.linkToDeath(aVar, 0);
            } catch (RemoteException e) {
                com_google_android_gms_internal_ahn_.a();
                wVar.a(com_google_android_gms_internal_ahn_.f().intValue());
            }
        }
    }

    public void a() {
        for (ahn com_google_android_gms_internal_ahn : (ahn[]) this.a.toArray(b)) {
            com_google_android_gms_internal_ahn.a(null);
            if (com_google_android_gms_internal_ahn.f() != null) {
                IBinder x;
                com_google_android_gms_internal_ahn.k();
                if (this.e != null) {
                    x = this.e.x();
                } else if (this.d != null) {
                    x = ((f) this.d.get(((com.google.android.gms.internal.ahl.a) com_google_android_gms_internal_ahn).g())).x();
                } else {
                    Log.wtf("UnconsumedApiCalls", "Could not get service broker binder", new Exception());
                    x = null;
                }
                a(com_google_android_gms_internal_ahn, null, x);
                this.a.remove(com_google_android_gms_internal_ahn);
            } else if (com_google_android_gms_internal_ahn.j()) {
                this.a.remove(com_google_android_gms_internal_ahn);
            }
        }
    }

    void a(ahn<? extends m> com_google_android_gms_internal_ahn__extends_com_google_android_gms_common_api_m) {
        this.a.add(com_google_android_gms_internal_ahn__extends_com_google_android_gms_common_api_m);
        com_google_android_gms_internal_ahn__extends_com_google_android_gms_common_api_m.a(this.c);
    }

    public void a(c cVar) {
        if (this.a.isEmpty()) {
            cVar.a();
        }
        this.f = cVar;
    }

    public void a(PrintWriter printWriter) {
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.a.size());
    }

    public void b() {
        for (ahn d : (ahn[]) this.a.toArray(b)) {
            d.d(new Status(8, "The connection to Google Play services was lost"));
        }
    }

    public boolean c() {
        for (ahn i : (ahn[]) this.a.toArray(b)) {
            if (!i.i()) {
                return true;
            }
        }
        return false;
    }
}
