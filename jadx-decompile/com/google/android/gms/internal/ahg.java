package com.google.android.gms.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.v4.util.ArrayMap;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.r;
import com.google.android.gms.g.g;
import java.util.Map;

public abstract class ahg {
    public final int a;
    public final int b;

    private static abstract class a extends ahg {
        protected final SparseArray<Map<com.google.android.gms.internal.ail.b<?>, aiq>> c;
        protected final g<Void> d;

        public a(int i, int i2, g<Void> gVar, SparseArray<Map<com.google.android.gms.internal.ail.b<?>, aiq>> sparseArray) {
            super(i, i2);
            this.c = sparseArray;
            this.d = gVar;
        }

        private void a(RemoteException remoteException) {
            a(new Status(8, remoteException.getLocalizedMessage(), null));
        }

        public void a(SparseArray<aix> sparseArray) {
        }

        public void a(@NonNull Status status) {
            this.d.a(new r(status));
        }

        public final void a(com.google.android.gms.common.api.a.c cVar) {
            try {
                b(cVar);
            } catch (RemoteException e) {
                a(e);
                throw e;
            } catch (RemoteException e2) {
                a(e2);
            }
        }

        public boolean a() {
            this.d.a(new r(Status.e));
            return true;
        }

        protected abstract void b(com.google.android.gms.common.api.a.c cVar);
    }

    public static class b<A extends com.google.android.gms.internal.ahl.a<? extends m, com.google.android.gms.common.api.a.c>> extends ahg {
        protected final A c;

        public b(int i, int i2, A a) {
            super(i, i2);
            this.c = a;
        }

        public void a(SparseArray<aix> sparseArray) {
            aix com_google_android_gms_internal_aix = (aix) sparseArray.get(this.a);
            if (com_google_android_gms_internal_aix != null) {
                com_google_android_gms_internal_aix.a(this.c);
            }
        }

        public void a(@NonNull Status status) {
            this.c.c(status);
        }

        public void a(com.google.android.gms.common.api.a.c cVar) {
            this.c.b(cVar);
        }

        public boolean a() {
            return this.c.j();
        }
    }

    public static final class c extends a {
        public final aip<com.google.android.gms.common.api.a.c> e;
        public final aiy<com.google.android.gms.common.api.a.c> f;

        public c(int i, aiq com_google_android_gms_internal_aiq, g<Void> gVar, SparseArray<Map<com.google.android.gms.internal.ail.b<?>, aiq>> sparseArray) {
            super(i, 3, gVar, sparseArray);
            this.e = com_google_android_gms_internal_aiq.a;
            this.f = com_google_android_gms_internal_aiq.b;
        }

        public /* bridge */ /* synthetic */ boolean a() {
            return super.a();
        }

        public void b(com.google.android.gms.common.api.a.c cVar) {
            this.e.a(cVar, this.d);
            Map map = (Map) this.c.get(this.a);
            if (map == null) {
                map = new ArrayMap(1);
                this.c.put(this.a, map);
            }
            String valueOf = String.valueOf(this.e.a());
            Log.d("reg", new StringBuilder(String.valueOf(valueOf).length() + 12).append("registered: ").append(valueOf).toString());
            if (this.e.a() != null) {
                map.put(this.e.a(), new aiq(this.e, this.f));
            }
        }
    }

    public static final class d<TResult> extends ahg {
        private static final Status e = new Status(8, "Connection to Google Play services was lost while executing the API call.");
        private final aiv<com.google.android.gms.common.api.a.c, TResult> c;
        private final g<TResult> d;

        public d(int i, int i2, aiv<com.google.android.gms.common.api.a.c, TResult> com_google_android_gms_internal_aiv_com_google_android_gms_common_api_a_c__TResult, g<TResult> gVar) {
            super(i, i2);
            this.d = gVar;
            this.c = com_google_android_gms_internal_aiv_com_google_android_gms_common_api_a_c__TResult;
        }

        public void a(@NonNull Status status) {
            if (status.i() == 8) {
                this.d.a(new com.google.firebase.c(status.c()));
            } else {
                this.d.a(new com.google.firebase.a(status.c()));
            }
        }

        public void a(com.google.android.gms.common.api.a.c cVar) {
            try {
                this.c.a(cVar, this.d);
            } catch (DeadObjectException e) {
                a(e);
                throw e;
            } catch (RemoteException e2) {
                a(e);
            }
        }
    }

    public static final class e extends a {
        public final aiy<com.google.android.gms.common.api.a.c> e;

        public e(int i, aiy<com.google.android.gms.common.api.a.c> com_google_android_gms_internal_aiy_com_google_android_gms_common_api_a_c, g<Void> gVar, SparseArray<Map<com.google.android.gms.internal.ail.b<?>, aiq>> sparseArray) {
            super(i, 4, gVar, sparseArray);
            this.e = com_google_android_gms_internal_aiy_com_google_android_gms_common_api_a_c;
        }

        public /* bridge */ /* synthetic */ boolean a() {
            return super.a();
        }

        public void b(com.google.android.gms.common.api.a.c cVar) {
            Map map = (Map) this.c.get(this.a);
            if (map == null || this.e.a() == null) {
                Log.wtf("UnregisterListenerTask", "Received call to unregister a listener without a matching registration call.", new Exception());
                this.d.a(new r(Status.c));
                return;
            }
            map.remove(this.e.a());
            this.e.a(cVar, this.d);
        }
    }

    public ahg(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public void a(SparseArray<aix> sparseArray) {
    }

    public abstract void a(@NonNull Status status);

    public abstract void a(com.google.android.gms.common.api.a.c cVar);

    public boolean a() {
        return true;
    }
}
