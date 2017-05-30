package com.google.android.gms.internal;

import android.support.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.d;
import com.google.firebase.auth.api.model.CreateAuthUriResponse;
import com.google.firebase.auth.api.model.GetAccountInfoUser;
import com.google.firebase.auth.api.model.GetTokenResponse;
import com.google.firebase.auth.n;
import com.google.firebase.b;

abstract class ge<SuccessT, CallbackT> {
    protected final int a;
    protected final a b = new a();
    protected b c;
    protected n d;
    protected ga e;
    protected CallbackT f;
    protected gd<SuccessT> g;
    protected GetTokenResponse h;
    protected GetAccountInfoUser i;
    protected CreateAuthUriResponse j;
    boolean k;
    SuccessT l;
    Status m;
    private boolean n;

    private class a extends com.google.android.gms.internal.fz.a {
        final /* synthetic */ ge a;

        private a(ge geVar) {
            this.a = geVar;
        }

        public void a() {
            d.a(this.a.a == 4, "Unexpected response type " + this.a.a);
            this.a.d();
        }

        public void a(@NonNull Status status) {
            this.a.a(status);
        }

        public void a(@NonNull CreateAuthUriResponse createAuthUriResponse) {
            d.a(this.a.a == 3, "Unexpected response type " + this.a.a);
            this.a.j = createAuthUriResponse;
            this.a.d();
        }

        public void a(@NonNull GetTokenResponse getTokenResponse) {
            boolean z = true;
            if (this.a.a != 1) {
                z = false;
            }
            d.a(z, "Unexpected response type: " + this.a.a);
            this.a.h = getTokenResponse;
            this.a.d();
        }

        public void a(@NonNull GetTokenResponse getTokenResponse, @NonNull GetAccountInfoUser getAccountInfoUser) {
            d.a(this.a.a == 2, "Unexpected response type: " + this.a.a);
            this.a.h = getTokenResponse;
            this.a.i = getAccountInfoUser;
            this.a.d();
        }

        public void b() {
            d.a(this.a.a == 5, "Unexpected response type " + this.a.a);
            this.a.d();
        }

        public void c() {
            d.a(this.a.a == 6, "Unexpected response type " + this.a.a);
            this.a.d();
        }
    }

    public ge(int i) {
        this.a = i;
    }

    private void d() {
        b();
        d.a(this.n, "no success or failure set on method implementation");
    }

    public ge<SuccessT, CallbackT> a(gd<SuccessT> gdVar) {
        this.g = gdVar;
        return this;
    }

    public ge<SuccessT, CallbackT> a(n nVar) {
        this.d = (n) d.a(nVar, "firebaseUser cannot be null");
        return this;
    }

    public ge<SuccessT, CallbackT> a(b bVar) {
        this.c = (b) d.a(bVar, "firebaseApp cannot be null");
        return this;
    }

    public ge<SuccessT, CallbackT> a(CallbackT callbackT) {
        this.f = d.a(callbackT, "external callback cannot be null");
        return this;
    }

    protected abstract void a();

    public void a(Status status) {
        this.n = true;
        this.k = false;
        this.m = status;
        this.g.a(null, status);
    }

    public void a(ga gaVar) {
        this.e = gaVar;
        a();
    }

    public abstract void b();

    public void b(SuccessT successT) {
        this.n = true;
        this.k = true;
        this.l = successT;
        this.g.a(successT, null);
    }

    public void c() {
        b(null);
    }
}
