package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.c;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.m;

public class ahl {

    public interface b<R> {
        void a(R r);

        void c(Status status);
    }

    public static abstract class a<R extends m, A extends c> extends ahn<R> implements b<R> {
        private final d<A> a;
        private final com.google.android.gms.common.api.a<?> b;

        @Deprecated
        protected a(d<A> dVar, g gVar) {
            super((g) com.google.android.gms.common.internal.d.a((Object) gVar, (Object) "GoogleApiClient must not be null"));
            this.a = (d) com.google.android.gms.common.internal.d.a((Object) dVar);
            this.b = null;
        }

        protected a(com.google.android.gms.common.api.a<?> aVar, g gVar) {
            super((g) com.google.android.gms.common.internal.d.a((Object) gVar, (Object) "GoogleApiClient must not be null"));
            this.a = aVar.d();
            this.b = aVar;
        }

        private void a(RemoteException remoteException) {
            c(new Status(8, remoteException.getLocalizedMessage(), null));
        }

        protected abstract void a(A a);

        protected void a(R r) {
        }

        public /* synthetic */ void a(Object obj) {
            super.b((m) obj);
        }

        public final void b(A a) {
            try {
                a((c) a);
            } catch (RemoteException e) {
                a(e);
                throw e;
            } catch (RemoteException e2) {
                a(e2);
            }
        }

        public final void c(Status status) {
            com.google.android.gms.common.internal.d.b(!status.f(), "Failed result must not be success");
            m b = b(status);
            b(b);
            a(b);
        }

        public final d<A> g() {
            return this.a;
        }

        public final com.google.android.gms.common.api.a<?> h() {
            return this.b;
        }
    }
}
