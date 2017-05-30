package com.google.android.gms.internal;

import android.content.Context;
import android.support.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.api.model.GetAccountInfoUser;
import com.google.firebase.auth.api.model.ProviderUserInfo;
import com.google.firebase.auth.api.model.VerifyAssertionRequest;
import java.util.ArrayList;
import java.util.List;

public class ft extends com.google.android.gms.common.api.u<com.google.android.gms.internal.gb.a> {

    static final class a extends ge<com.google.firebase.auth.b, gj> {
        @NonNull
        private String n;
        @NonNull
        private String o;

        public a(@NonNull String str, @NonNull String str2) {
            super(2);
            this.n = com.google.android.gms.common.internal.d.a(str, "email cannot be null or empty");
            this.o = com.google.android.gms.common.internal.d.a(str2, "password cannot be null or empty");
        }

        public void a() {
            this.e.c(this.n, this.o, this.b);
        }

        public void b() {
            com.google.firebase.auth.n a = ft.b(this.c, this.i);
            ((gj) this.f).a(this.h, a);
            b(new gl(a));
        }
    }

    static final class b extends ge<Void, gr> {
        public b() {
            super(5);
        }

        public void a() {
            this.e.g(this.d.n(), this.b);
        }

        public void b() {
            ((gr) this.f).a();
            b(null);
        }
    }

    static final class c extends ge<com.google.firebase.auth.t, gj> {
        @NonNull
        private final String n;

        public c(@NonNull String str) {
            super(3);
            this.n = com.google.android.gms.common.internal.d.a(str, "email cannot be null or empty");
        }

        public void a() {
            this.e.c(this.n, this.b);
        }

        public void b() {
            b(new gp(this.j));
        }
    }

    static final class d extends ge<com.google.firebase.auth.o, gj> {
        @NonNull
        private final String n;

        public d(@NonNull String str) {
            super(1);
            this.n = com.google.android.gms.common.internal.d.a(str, "refresh token cannot be null");
        }

        public void a() {
            this.e.a(this.n, this.b);
        }

        public void b() {
            this.h.a(this.n);
            ((gj) this.f).a(this.h, this.d);
            b(new com.google.firebase.auth.o(this.h.c()));
        }
    }

    static final class e extends ge<com.google.firebase.auth.b, gj> {
        @NonNull
        private final com.google.firebase.auth.c n;

        public e(@NonNull com.google.firebase.auth.c cVar) {
            super(2);
            this.n = (com.google.firebase.auth.c) com.google.android.gms.common.internal.d.a(cVar, "credential cannot be null");
        }

        public void a() {
            this.e.a(this.n.b(), this.n.c(), this.d.n(), this.b);
        }

        public void b() {
            com.google.firebase.auth.n a = ft.b(this.c, this.i);
            ((gj) this.f).a(this.h, a);
            b(new gl(a));
        }
    }

    static final class f extends ge<com.google.firebase.auth.b, gj> {
        @NonNull
        private final VerifyAssertionRequest n;

        public f(@NonNull com.google.firebase.auth.a aVar) {
            super(2);
            com.google.android.gms.common.internal.d.a(aVar, "credential cannot be null");
            this.n = gk.a(aVar);
        }

        public void a() {
            this.e.a(this.d.n(), this.n, this.b);
        }

        public void b() {
            com.google.firebase.auth.n a = ft.b(this.c, this.i);
            ((gj) this.f).a(this.h, a);
            b(new gl(a));
        }
    }

    private class g<ResultT, CallbackT> extends aiv<fu, ResultT> implements gd<ResultT> {
        final /* synthetic */ ft a;
        private ge<ResultT, CallbackT> b;
        private com.google.android.gms.g.g<ResultT> c;

        public g(ft ftVar, ge<ResultT, CallbackT> geVar) {
            this.a = ftVar;
            this.b = geVar;
            this.b.a((gd) this);
        }

        protected /* synthetic */ void a(com.google.android.gms.common.api.a.c cVar, com.google.android.gms.g.g gVar) {
            a((fu) cVar, gVar);
        }

        protected void a(fu fuVar, com.google.android.gms.g.g<ResultT> gVar) {
            this.c = gVar;
            this.b.a(fuVar.o_());
        }

        public final void a(ResultT resultT, Status status) {
            com.google.android.gms.common.internal.d.a(this.c, "doExecute must be called before onComplete");
            if (status != null) {
                this.c.a(fw.a(status));
            } else {
                this.c.a((Object) resultT);
            }
        }
    }

    static final class h extends ge<Void, gj> {
        @NonNull
        private final VerifyAssertionRequest n;

        public h(@NonNull com.google.firebase.auth.a aVar) {
            super(2);
            com.google.android.gms.common.internal.d.a(aVar, "credential cannot be null");
            this.n = gk.a(aVar);
        }

        public void a() {
            this.e.a(this.n, this.b);
        }

        public void b() {
            com.google.firebase.auth.n a = ft.b(this.c, this.i);
            if (this.d.a().equalsIgnoreCase(a.a())) {
                ((gj) this.f).a(this.h, a);
                c();
                return;
            }
            a(gq.a());
        }
    }

    static final class i extends ge<Void, gj> {
        @NonNull
        private final String n;
        @NonNull
        private final String o;

        public i(@NonNull String str, @NonNull String str2) {
            super(2);
            this.n = com.google.android.gms.common.internal.d.a(str, "email cannot be null or empty");
            this.o = com.google.android.gms.common.internal.d.a(str2, "password cannot be null or empty");
        }

        public void a() {
            this.e.d(this.n, this.o, this.b);
        }

        public void b() {
            com.google.firebase.auth.n a = ft.b(this.c, this.i);
            if (this.d.a().equalsIgnoreCase(a.a())) {
                ((gj) this.f).a(this.h, a);
                c();
                return;
            }
            a(gq.a());
        }
    }

    static final class j extends ge<Void, gj> {
        public j() {
            super(2);
        }

        public void a() {
            this.e.f(this.d.n(), this.b);
        }

        public void b() {
            ((gj) this.f).a(this.h, ft.b(this.c, this.i, this.d.i()));
            b(null);
        }
    }

    static final class k extends ge<Void, gj> {
        @NonNull
        private String n;

        public k(@NonNull String str) {
            super(6);
            this.n = com.google.android.gms.common.internal.d.a(str, "token cannot be null or empty");
        }

        public void a() {
            this.e.h(this.n, this.b);
        }

        public void b() {
            c();
        }
    }

    static final class l extends ge<Void, gj> {
        @NonNull
        private String n;

        public l(@NonNull String str) {
            super(4);
            this.n = com.google.android.gms.common.internal.d.a(str, "email cannot be null or empty");
        }

        public void a() {
            this.e.d(this.n, this.b);
        }

        public void b() {
            c();
        }
    }

    static final class m extends ge<com.google.firebase.auth.b, gj> {
        public m() {
            super(2);
        }

        public void a() {
            this.e.a(this.b);
        }

        public void b() {
            com.google.firebase.auth.n a = ft.b(this.c, this.i, true);
            ((gj) this.f).a(this.h, a);
            b(new gl(a));
        }
    }

    static final class n extends ge<com.google.firebase.auth.b, gj> {
        @NonNull
        private final VerifyAssertionRequest n;

        public n(@NonNull com.google.firebase.auth.a aVar) {
            super(2);
            com.google.android.gms.common.internal.d.a(aVar, "credential cannot be null");
            this.n = gk.a(aVar);
        }

        public void a() {
            this.e.a(this.n, this.b);
        }

        public void b() {
            com.google.firebase.auth.n a = ft.b(this.c, this.i);
            ((gj) this.f).a(this.h, a);
            b(new gl(a));
        }
    }

    static final class o extends ge<com.google.firebase.auth.b, gj> {
        @NonNull
        private final String n;

        public o(@NonNull String str) {
            super(2);
            this.n = com.google.android.gms.common.internal.d.a(str, "token cannot be null or empty");
        }

        public void a() {
            this.e.b(this.n, this.b);
        }

        public void b() {
            com.google.firebase.auth.n a = ft.b(this.c, this.i);
            ((gj) this.f).a(this.h, a);
            b(new gl(a));
        }
    }

    static final class p extends ge<com.google.firebase.auth.b, gj> {
        @NonNull
        private String n;
        @NonNull
        private String o;

        public p(String str, String str2) {
            super(2);
            this.n = com.google.android.gms.common.internal.d.a(str, "email cannot be null or empty");
            this.o = com.google.android.gms.common.internal.d.a(str2, "password cannot be null or empty");
        }

        public void a() {
            this.e.d(this.n, this.o, this.b);
        }

        public void b() {
            com.google.firebase.auth.n a = ft.b(this.c, this.i);
            ((gj) this.f).a(this.h, a);
            b(new gl(a));
        }
    }

    static final class q extends ge<com.google.firebase.auth.b, gj> {
        public q() {
            super(2);
        }

        public void a() {
            this.e.e(this.d.n(), this.b);
        }

        public void b() {
            com.google.firebase.auth.n a = ft.b(this.c, this.i);
            ((gj) this.f).a(this.h, a);
            b(new gl(a));
        }
    }

    static final class r extends ge<com.google.firebase.auth.b, gj> {
        @NonNull
        private String n;

        public r(@NonNull String str) {
            super(2);
            this.n = com.google.android.gms.common.internal.d.a(str, "provider cannot be null or empty");
        }

        public void a() {
            this.e.e(this.n, this.d.n(), this.b);
        }

        public void b() {
            com.google.firebase.auth.n a = ft.b(this.c, this.i);
            ((gj) this.f).a(this.h, a);
            b(new gl(a));
        }
    }

    static final class s extends ge<Void, gj> {
        @NonNull
        private final String n;

        public s(String str) {
            super(2);
            this.n = com.google.android.gms.common.internal.d.a(str, "email cannot be null or empty");
        }

        public void a() {
            this.e.a(this.d.n(), this.n, this.b);
        }

        public void b() {
            ((gj) this.f).a(this.h, ft.b(this.c, this.i));
            c();
        }
    }

    static final class t extends ge<Void, gj> {
        @NonNull
        private final String n;

        public t(@NonNull String str) {
            super(2);
            this.n = com.google.android.gms.common.internal.d.a(str, "password cannot be null or empty");
        }

        public void a() {
            this.e.b(this.d.n(), this.n, this.b);
        }

        public void b() {
            ((gj) this.f).a(this.h, ft.b(this.c, this.i));
            c();
        }
    }

    static final class u extends ge<Void, gj> {
        @NonNull
        private final UserProfileChangeRequest n;

        public u(UserProfileChangeRequest userProfileChangeRequest) {
            super(2);
            this.n = (UserProfileChangeRequest) com.google.android.gms.common.internal.d.a(userProfileChangeRequest, "request cannot be null");
        }

        public void a() {
            this.e.a(this.d.n(), this.n, this.b);
        }

        public void b() {
            ((gj) this.f).a(this.h, ft.b(this.c, this.i));
            c();
        }
    }

    ft(@NonNull Context context, @NonNull com.google.android.gms.internal.gb.a aVar) {
        super(context, gb.b, aVar);
    }

    @NonNull
    private com.google.android.gms.g.f<com.google.firebase.auth.b> a(@NonNull com.google.firebase.b bVar, @NonNull com.google.firebase.auth.a aVar, @NonNull com.google.firebase.auth.n nVar, @NonNull gj gjVar) {
        com.google.android.gms.common.internal.d.a(bVar);
        com.google.android.gms.common.internal.d.a(aVar);
        com.google.android.gms.common.internal.d.a(nVar);
        com.google.android.gms.common.internal.d.a(gjVar);
        List j = nVar.j();
        return (j == null || !j.contains(aVar.a())) ? b(a(new f(aVar).a(bVar).a(nVar).a((Object) gjVar))) : com.google.android.gms.g.i.a(fw.a(new Status(17015)));
    }

    @NonNull
    private com.google.android.gms.g.f<com.google.firebase.auth.b> a(@NonNull com.google.firebase.b bVar, @NonNull com.google.firebase.auth.c cVar, @NonNull com.google.firebase.auth.n nVar, @NonNull gj gjVar) {
        return b(a(new e(cVar).a(bVar).a(nVar).a((Object) gjVar)));
    }

    @NonNull
    private com.google.android.gms.g.f<com.google.firebase.auth.b> a(@NonNull com.google.firebase.b bVar, @NonNull String str, @NonNull com.google.firebase.auth.n nVar, @NonNull gj gjVar) {
        return b(a(new r(str).a(bVar).a(nVar).a((Object) gjVar)));
    }

    private <ResultT, CallbackT> g<ResultT, CallbackT> a(ge<ResultT, CallbackT> geVar) {
        return new g(this, geVar);
    }

    @NonNull
    private com.google.android.gms.g.f<com.google.firebase.auth.b> b(@NonNull com.google.firebase.b bVar, @NonNull com.google.firebase.auth.n nVar, @NonNull gj gjVar) {
        return b(a(new q().a(bVar).a(nVar).a((Object) gjVar)));
    }

    @NonNull
    private static go b(@NonNull com.google.firebase.b bVar, @NonNull GetAccountInfoUser getAccountInfoUser) {
        return b(bVar, getAccountInfoUser, false);
    }

    @NonNull
    private static go b(@NonNull com.google.firebase.b bVar, @NonNull GetAccountInfoUser getAccountInfoUser, boolean z) {
        com.google.android.gms.common.internal.d.a(bVar);
        com.google.android.gms.common.internal.d.a(getAccountInfoUser);
        List arrayList = new ArrayList();
        arrayList.add(new gm(getAccountInfoUser, com.google.firebase.auth.j.a));
        List h = getAccountInfoUser.h();
        if (!(h == null || h.isEmpty())) {
            for (int i = 0; i < h.size(); i++) {
                arrayList.add(new gm((ProviderUserInfo) h.get(i)));
            }
        }
        go goVar = new go(bVar, arrayList);
        go goVar2 = (go) goVar.b(z);
        return goVar;
    }

    @NonNull
    public com.google.android.gms.g.f<Void> a(@NonNull com.google.firebase.auth.n nVar, @NonNull gr grVar) {
        return b(a(new b().a(nVar).a((Object) grVar)));
    }

    public com.google.android.gms.g.f<com.google.firebase.auth.b> a(@NonNull com.google.firebase.b bVar, @NonNull gj gjVar) {
        return b(a(new m().a(bVar).a((Object) gjVar)));
    }

    public com.google.android.gms.g.f<com.google.firebase.auth.b> a(@NonNull com.google.firebase.b bVar, @NonNull com.google.firebase.auth.a aVar, @NonNull gj gjVar) {
        return b(a(new n(aVar).a(bVar).a((Object) gjVar)));
    }

    @NonNull
    public com.google.android.gms.g.f<Void> a(@NonNull com.google.firebase.b bVar, @NonNull com.google.firebase.auth.n nVar, @NonNull gj gjVar) {
        return a(a(new j().a(bVar).a(nVar).a((Object) gjVar)));
    }

    public com.google.android.gms.g.f<Void> a(@NonNull com.google.firebase.b bVar, @NonNull com.google.firebase.auth.n nVar, @NonNull UserProfileChangeRequest userProfileChangeRequest, @NonNull gj gjVar) {
        return b(a(new u(userProfileChangeRequest).a(bVar).a(nVar).a((Object) gjVar)));
    }

    public com.google.android.gms.g.f<Void> a(@NonNull com.google.firebase.b bVar, @NonNull com.google.firebase.auth.n nVar, @NonNull com.google.firebase.auth.a aVar, @NonNull gj gjVar) {
        return b(a(new h(aVar).a(bVar).a(nVar).a((Object) gjVar)));
    }

    public com.google.android.gms.g.f<com.google.firebase.auth.o> a(@NonNull com.google.firebase.b bVar, @NonNull com.google.firebase.auth.n nVar, @NonNull String str, @NonNull gj gjVar) {
        return a(a(new d(str).a(bVar).a(nVar).a((Object) gjVar)));
    }

    public com.google.android.gms.g.f<Void> a(@NonNull com.google.firebase.b bVar, @NonNull com.google.firebase.auth.n nVar, @NonNull String str, @NonNull String str2, @NonNull gj gjVar) {
        return b(a(new i(str, str2).a(bVar).a(nVar).a((Object) gjVar)));
    }

    public com.google.android.gms.g.f<com.google.firebase.auth.t> a(@NonNull com.google.firebase.b bVar, @NonNull String str) {
        return a(a(new c(str).a(bVar)));
    }

    public com.google.android.gms.g.f<com.google.firebase.auth.b> a(@NonNull com.google.firebase.b bVar, @NonNull String str, @NonNull gj gjVar) {
        return b(a(new o(str).a(bVar).a((Object) gjVar)));
    }

    public com.google.android.gms.g.f<com.google.firebase.auth.b> a(@NonNull com.google.firebase.b bVar, @NonNull String str, @NonNull String str2, @NonNull gj gjVar) {
        return b(a(new a(str, str2).a(bVar).a((Object) gjVar)));
    }

    public com.google.android.gms.g.f<com.google.firebase.auth.b> b(@NonNull com.google.firebase.b bVar, @NonNull com.google.firebase.auth.n nVar, @NonNull com.google.firebase.auth.a aVar, @NonNull gj gjVar) {
        com.google.android.gms.common.internal.d.a(bVar);
        com.google.android.gms.common.internal.d.a(aVar);
        com.google.android.gms.common.internal.d.a(nVar);
        com.google.android.gms.common.internal.d.a(gjVar);
        return com.google.firebase.auth.c.class.isAssignableFrom(aVar.getClass()) ? a(bVar, (com.google.firebase.auth.c) aVar, nVar, gjVar) : a(bVar, aVar, nVar, gjVar);
    }

    public com.google.android.gms.g.f<Void> b(@NonNull com.google.firebase.b bVar, @NonNull com.google.firebase.auth.n nVar, @NonNull String str, @NonNull gj gjVar) {
        return b(a(new s(str).a(bVar).a(nVar).a((Object) gjVar)));
    }

    public com.google.android.gms.g.f<Void> b(@NonNull com.google.firebase.b bVar, @NonNull String str) {
        return b(a(new l(str).a(bVar)));
    }

    public com.google.android.gms.g.f<com.google.firebase.auth.b> b(@NonNull com.google.firebase.b bVar, @NonNull String str, @NonNull String str2, @NonNull gj gjVar) {
        return b(a(new p(str, str2).a(bVar).a((Object) gjVar)));
    }

    public com.google.android.gms.g.f<Void> c(@NonNull com.google.firebase.b bVar, @NonNull com.google.firebase.auth.n nVar, @NonNull String str, @NonNull gj gjVar) {
        return b(a(new t(str).a(bVar).a(nVar).a((Object) gjVar)));
    }

    public com.google.android.gms.g.f<Void> c(@NonNull com.google.firebase.b bVar, @NonNull String str) {
        return b(a(new k(str).a(bVar)));
    }

    public com.google.android.gms.g.f<com.google.firebase.auth.b> d(@NonNull com.google.firebase.b bVar, @NonNull com.google.firebase.auth.n nVar, @NonNull String str, @NonNull gj gjVar) {
        com.google.android.gms.common.internal.d.a(bVar);
        com.google.android.gms.common.internal.d.a(str);
        com.google.android.gms.common.internal.d.a(nVar);
        com.google.android.gms.common.internal.d.a(gjVar);
        List j = nVar.j();
        if ((j != null && !j.contains(str)) || nVar.i()) {
            return com.google.android.gms.g.i.a(fw.a(new Status(17016, str)));
        }
        Object obj = -1;
        switch (str.hashCode()) {
            case 1216985755:
                if (str.equals(com.google.firebase.auth.d.a)) {
                    obj = null;
                    break;
                }
                break;
        }
        switch (obj) {
            case null:
                return b(bVar, nVar, gjVar);
            default:
                return a(bVar, str, nVar, gjVar);
        }
    }
}
