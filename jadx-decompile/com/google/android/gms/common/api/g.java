package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.util.ArrayMap;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.a.h;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.ahj;
import com.google.android.gms.internal.aho;
import com.google.android.gms.internal.ahy;
import com.google.android.gms.internal.aih;
import com.google.android.gms.internal.ail;
import com.google.android.gms.internal.ait;
import com.google.android.gms.internal.aiw;
import com.google.android.gms.internal.aoj;
import com.google.android.gms.internal.aok;
import com.google.android.gms.internal.aom;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public abstract class g {
    public static final int a = 1;
    public static final int b = 2;
    private static final Set<g> c = Collections.newSetFromMap(new WeakHashMap());

    public interface b {
        public static final int b = 1;
        public static final int c = 2;

        void a(int i);

        void a(@Nullable Bundle bundle);
    }

    public interface c {
        void a(@NonNull ConnectionResult connectionResult);
    }

    public static final class a {
        private Account a;
        private final Set<Scope> b;
        private final Set<Scope> c;
        private int d;
        private View e;
        private String f;
        private String g;
        private final Map<a<?>, com.google.android.gms.common.internal.s.a> h;
        private final Context i;
        private final Map<a<?>, com.google.android.gms.common.api.a.a> j;
        private aih k;
        private int l;
        private c m;
        private Looper n;
        private com.google.android.gms.common.b o;
        private com.google.android.gms.common.api.a.b<? extends aok, aom> p;
        private final ArrayList<b> q;
        private final ArrayList<c> r;

        public a(@NonNull Context context) {
            this.b = new HashSet();
            this.c = new HashSet();
            this.h = new ArrayMap();
            this.j = new ArrayMap();
            this.l = -1;
            this.o = com.google.android.gms.common.b.a();
            this.p = aoj.c;
            this.q = new ArrayList();
            this.r = new ArrayList();
            this.i = context;
            this.n = context.getMainLooper();
            this.f = context.getPackageName();
            this.g = context.getClass().getName();
        }

        public a(@NonNull Context context, @NonNull b bVar, @NonNull c cVar) {
            this(context);
            d.a((Object) bVar, (Object) "Must provide a connected listener");
            this.q.add(bVar);
            d.a((Object) cVar, (Object) "Must provide a connection failed listener");
            this.r.add(cVar);
        }

        private static <C extends f, O> C a(com.google.android.gms.common.api.a.b<C, O> bVar, Object obj, Context context, Looper looper, s sVar, b bVar2, c cVar) {
            return bVar.a(context, looper, sVar, obj, bVar2, cVar);
        }

        private a a(@NonNull aih com_google_android_gms_internal_aih, int i, @Nullable c cVar) {
            d.b(i >= 0, "clientId must be non-negative");
            this.l = i;
            this.m = cVar;
            this.k = com_google_android_gms_internal_aih;
            return this;
        }

        private static <C extends h, O> i a(a.i<C, O> iVar, Object obj, Context context, Looper looper, s sVar, b bVar, c cVar) {
            return new i(context, looper, iVar.b(), bVar, cVar, sVar, iVar.b(obj));
        }

        private <O extends com.google.android.gms.common.api.a.a> void a(a<O> aVar, O o, int i, Scope... scopeArr) {
            boolean z = true;
            int i2 = 0;
            if (i != 1) {
                if (i == 2) {
                    z = false;
                } else {
                    throw new IllegalArgumentException("Invalid resolution mode: '" + i + "', use a constant from GoogleApiClient.ResolutionMode");
                }
            }
            Set hashSet = new HashSet(aVar.a().a(o));
            int length = scopeArr.length;
            while (i2 < length) {
                hashSet.add(scopeArr[i2]);
                i2++;
            }
            this.h.put(aVar, new com.google.android.gms.common.internal.s.a(hashSet, z));
        }

        private void a(g gVar) {
            ahj.a(this.k).a(this.l, gVar, this.m);
        }

        private g d() {
            s b = b();
            a aVar = null;
            Map g = b.g();
            Map arrayMap = new ArrayMap();
            Map arrayMap2 = new ArrayMap();
            ArrayList arrayList = new ArrayList();
            a aVar2 = null;
            for (a aVar3 : this.j.keySet()) {
                a aVar32;
                f a;
                a aVar4;
                Object obj = this.j.get(aVar32);
                int i = 0;
                if (g.get(aVar32) != null) {
                    i = ((com.google.android.gms.common.internal.s.a) g.get(aVar32)).b ? 1 : 2;
                }
                arrayMap.put(aVar32, Integer.valueOf(i));
                b com_google_android_gms_internal_aho = new aho(aVar32, i);
                arrayList.add(com_google_android_gms_internal_aho);
                a aVar5;
                if (aVar32.e()) {
                    a.i c = aVar32.c();
                    aVar5 = c.a() == 1 ? aVar32 : aVar2;
                    a = a(c, obj, this.i, this.n, b, com_google_android_gms_internal_aho, (c) com_google_android_gms_internal_aho);
                    aVar4 = aVar5;
                } else {
                    com.google.android.gms.common.api.a.b b2 = aVar32.b();
                    aVar5 = b2.a() == 1 ? aVar32 : aVar2;
                    a = a(b2, obj, this.i, this.n, b, com_google_android_gms_internal_aho, (c) com_google_android_gms_internal_aho);
                    aVar4 = aVar5;
                }
                arrayMap2.put(aVar32.d(), a);
                if (!a.h_()) {
                    aVar32 = aVar;
                } else if (aVar != null) {
                    String valueOf = String.valueOf(aVar32.f());
                    String valueOf2 = String.valueOf(aVar.f());
                    throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 21) + String.valueOf(valueOf2).length()).append(valueOf).append(" cannot be used with ").append(valueOf2).toString());
                }
                aVar2 = aVar4;
                aVar = aVar32;
            }
            if (aVar != null) {
                if (aVar2 != null) {
                    valueOf = String.valueOf(aVar.f());
                    valueOf2 = String.valueOf(aVar2.f());
                    throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 21) + String.valueOf(valueOf2).length()).append(valueOf).append(" cannot be used with ").append(valueOf2).toString());
                }
                d.a(this.a == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", aVar.f());
                d.a(this.b.equals(this.c), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", aVar.f());
            }
            return new ahy(this.i, new ReentrantLock(), this.n, b, this.o, this.p, arrayMap, this.q, this.r, arrayMap2, this.l, ahy.a(arrayMap2.values(), true), arrayList);
        }

        public a a() {
            return a("<<default account>>");
        }

        public a a(int i) {
            this.d = i;
            return this;
        }

        public a a(@NonNull Handler handler) {
            d.a((Object) handler, (Object) "Handler must not be null");
            this.n = handler.getLooper();
            return this;
        }

        public a a(@NonNull FragmentActivity fragmentActivity, int i, @Nullable c cVar) {
            return a(new aih(fragmentActivity), i, cVar);
        }

        public a a(@NonNull FragmentActivity fragmentActivity, @Nullable c cVar) {
            return a(fragmentActivity, 0, cVar);
        }

        public a a(@NonNull View view) {
            d.a((Object) view, (Object) "View must not be null");
            this.e = view;
            return this;
        }

        public a a(@NonNull Scope scope) {
            d.a((Object) scope, (Object) "Scope must not be null");
            this.b.add(scope);
            return this;
        }

        public a a(@NonNull a<? extends com.google.android.gms.common.api.a.a.c> aVar) {
            d.a((Object) aVar, (Object) "Api must not be null");
            this.j.put(aVar, null);
            Collection a = aVar.a().a(null);
            this.c.addAll(a);
            this.b.addAll(a);
            return this;
        }

        public <O extends com.google.android.gms.common.api.a.a.a> a a(@NonNull a<O> aVar, @NonNull O o) {
            d.a((Object) aVar, (Object) "Api must not be null");
            d.a((Object) o, (Object) "Null options are not permitted for this Api");
            this.j.put(aVar, o);
            Collection a = aVar.a().a(o);
            this.c.addAll(a);
            this.b.addAll(a);
            return this;
        }

        public <O extends com.google.android.gms.common.api.a.a.a> a a(@NonNull a<O> aVar, @NonNull O o, Scope... scopeArr) {
            d.a((Object) aVar, (Object) "Api must not be null");
            d.a((Object) o, (Object) "Null options are not permitted for this Api");
            this.j.put(aVar, o);
            a(aVar, o, 1, scopeArr);
            return this;
        }

        public a a(@NonNull a<? extends com.google.android.gms.common.api.a.a.c> aVar, Scope... scopeArr) {
            d.a((Object) aVar, (Object) "Api must not be null");
            this.j.put(aVar, null);
            a(aVar, null, 1, scopeArr);
            return this;
        }

        public a a(@NonNull b bVar) {
            d.a((Object) bVar, (Object) "Listener must not be null");
            this.q.add(bVar);
            return this;
        }

        public a a(@NonNull c cVar) {
            d.a((Object) cVar, (Object) "Listener must not be null");
            this.r.add(cVar);
            return this;
        }

        public a a(String str) {
            this.a = str == null ? null : new Account(str, "com.google");
            return this;
        }

        public s b() {
            aom com_google_android_gms_internal_aom = aom.a;
            if (this.j.containsKey(aoj.g)) {
                com_google_android_gms_internal_aom = (aom) this.j.get(aoj.g);
            }
            return new s(this.a, this.b, this.h, this.d, this.e, this.f, this.g, com_google_android_gms_internal_aom);
        }

        public g c() {
            d.b(!this.j.isEmpty(), "must call addApi() to add at least one API");
            g d = d();
            synchronized (g.c) {
                g.c.add(d);
            }
            if (this.l >= 0) {
                a(d);
            }
            return d;
        }
    }

    public static Set<g> a() {
        Set<g> set;
        synchronized (c) {
            set = c;
        }
        return set;
    }

    public static void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        synchronized (c) {
            String concat = String.valueOf(str).concat("  ");
            int i = 0;
            for (g gVar : c) {
                int i2 = i + 1;
                printWriter.append(str).append("GoogleApiClient#").println(i);
                gVar.b(concat, fileDescriptor, printWriter, strArr);
                i = i2;
            }
        }
    }

    public abstract ConnectionResult a(long j, @NonNull TimeUnit timeUnit);

    @NonNull
    public <C extends f> C a(@NonNull a.d<C> dVar) {
        throw new UnsupportedOperationException();
    }

    public <A extends com.google.android.gms.common.api.a.c, R extends m, T extends com.google.android.gms.internal.ahl.a<R, A>> T a(@NonNull T t) {
        throw new UnsupportedOperationException();
    }

    public <L> ail<L> a(@NonNull L l) {
        throw new UnsupportedOperationException();
    }

    public void a(int i) {
        throw new UnsupportedOperationException();
    }

    public abstract void a(@NonNull FragmentActivity fragmentActivity);

    public abstract void a(@NonNull b bVar);

    public abstract void a(@NonNull c cVar);

    public void a(aiw com_google_android_gms_internal_aiw) {
        throw new UnsupportedOperationException();
    }

    public boolean a(@NonNull a<?> aVar) {
        throw new UnsupportedOperationException();
    }

    public boolean a(ait com_google_android_gms_internal_ait) {
        throw new UnsupportedOperationException();
    }

    public Context b() {
        throw new UnsupportedOperationException();
    }

    public <A extends com.google.android.gms.common.api.a.c, T extends com.google.android.gms.internal.ahl.a<? extends m, A>> T b(@NonNull T t) {
        throw new UnsupportedOperationException();
    }

    public void b(aiw com_google_android_gms_internal_aiw) {
        throw new UnsupportedOperationException();
    }

    public abstract void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract boolean b(@NonNull a<?> aVar);

    public abstract boolean b(@NonNull b bVar);

    public abstract boolean b(@NonNull c cVar);

    public Looper c() {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public abstract ConnectionResult c(@NonNull a<?> aVar);

    public abstract void c(@NonNull b bVar);

    public abstract void c(@NonNull c cVar);

    public void d() {
        throw new UnsupportedOperationException();
    }

    public abstract void e();

    public abstract ConnectionResult f();

    public abstract void g();

    public abstract void h();

    public abstract i<Status> i();

    public abstract boolean j();

    public abstract boolean k();
}
