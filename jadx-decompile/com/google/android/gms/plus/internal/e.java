package com.google.android.gms.plus.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.plus.b$a;
import com.google.android.gms.plus.internal.model.people.PersonEntity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

public class e extends w<d> {
    private com.google.android.gms.plus.a.a.a a;
    private final PlusSession e;

    static final class a implements b$a {
        private final Status a;
        private final String b;
        private final com.google.android.gms.plus.a.a.b c;

        public a(Status status, DataHolder dataHolder, String str) {
            this.a = status;
            this.b = str;
            this.c = dataHolder != null ? new com.google.android.gms.plus.a.a.b(dataHolder) : null;
        }

        public Status a() {
            return this.a;
        }

        public void b() {
            if (this.c != null) {
                this.c.b();
            }
        }

        public com.google.android.gms.plus.a.a.b c() {
            return this.c;
        }

        public String d() {
            return this.b;
        }
    }

    static final class b extends a {
        private final com.google.android.gms.internal.ahl.b<b$a> a;

        public b(com.google.android.gms.internal.ahl.b<b$a> bVar) {
            this.a = bVar;
        }

        public void a(DataHolder dataHolder, String str) {
            Status status = new Status(dataHolder.e(), null, dataHolder.f() != null ? (PendingIntent) dataHolder.f().getParcelable("pendingIntent") : null);
            if (!(status.f() || dataHolder == null)) {
                if (!dataHolder.h()) {
                    dataHolder.close();
                }
                dataHolder = null;
            }
            this.a.a(new a(status, dataHolder, str));
        }
    }

    static final class c extends a {
        private final com.google.android.gms.internal.ahl.b<Status> a;

        public c(com.google.android.gms.internal.ahl.b<Status> bVar) {
            this.a = bVar;
        }

        public void a(int i, Bundle bundle) {
            this.a.a(new Status(i, null, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
        }
    }

    public e(Context context, Looper looper, s sVar, PlusSession plusSession, com.google.android.gms.common.api.g.b bVar, com.google.android.gms.common.api.g.c cVar) {
        super(context, looper, 2, sVar, bVar, cVar);
        this.e = plusSession;
    }

    public static boolean b(Set<Scope> set) {
        return (set == null || set.isEmpty()) ? false : (set.size() == 1 && set.contains(new Scope("plus_one_placeholder_scope"))) ? false : true;
    }

    public ad a(com.google.android.gms.internal.ahl.b<b$a> bVar, int i, String str) {
        F();
        Object bVar2 = new b(bVar);
        try {
            return ((d) G()).a(bVar2, 1, i, -1, str);
        } catch (RemoteException e) {
            bVar2.a(DataHolder.b(8), null);
            return null;
        }
    }

    public ad a(com.google.android.gms.internal.ahl.b<b$a> bVar, String str) {
        return a(bVar, 0, str);
    }

    protected d a(IBinder iBinder) {
        return com.google.android.gms.plus.internal.d.a.a(iBinder);
    }

    protected String a() {
        return "com.google.android.gms.plus.service.START";
    }

    protected void a(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (i == 0 && bundle != null && bundle.containsKey("loaded_person")) {
            this.a = PersonEntity.a(bundle.getByteArray("loaded_person"));
        }
        super.a(i, iBinder, bundle, i2);
    }

    public void a(com.google.android.gms.internal.ahl.b<b$a> bVar) {
        F();
        Object bVar2 = new b(bVar);
        try {
            ((d) G()).a(bVar2, 2, 1, -1, null);
        } catch (RemoteException e) {
            bVar2.a(DataHolder.b(8), null);
        }
    }

    public void a(com.google.android.gms.internal.ahl.b<b$a> bVar, Collection<String> collection) {
        F();
        b bVar2 = new b(bVar);
        try {
            ((d) G()).a(bVar2, new ArrayList(collection));
        } catch (RemoteException e) {
            bVar2.a(DataHolder.b(8), null);
        }
    }

    public void a(com.google.android.gms.internal.ahl.b<b$a> bVar, String[] strArr) {
        a((com.google.android.gms.internal.ahl.b) bVar, Arrays.asList(strArr));
    }

    protected /* synthetic */ IInterface b(IBinder iBinder) {
        return a(iBinder);
    }

    protected String b() {
        return "com.google.android.gms.plus.internal.IPlusService";
    }

    public void b(com.google.android.gms.internal.ahl.b<Status> bVar) {
        F();
        j();
        Object cVar = new c(bVar);
        try {
            ((d) G()).b(cVar);
        } catch (RemoteException e) {
            cVar.a(8, null);
        }
    }

    protected Bundle c() {
        Bundle k = this.e.k();
        k.putStringArray("request_visible_actions", this.e.d());
        k.putString("auth_package", this.e.f());
        return k;
    }

    public String h() {
        F();
        try {
            return ((d) G()).a();
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public com.google.android.gms.plus.a.a.a i() {
        F();
        return this.a;
    }

    public void j() {
        F();
        try {
            this.a = null;
            ((d) G()).b();
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public boolean v() {
        return b(J().a(com.google.android.gms.plus.c.c));
    }
}
