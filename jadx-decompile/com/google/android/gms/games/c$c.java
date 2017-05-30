package com.google.android.gms.games;

import android.os.Bundle;
import com.google.android.gms.common.api.a.a.d;
import java.util.ArrayList;

public final class c$c implements d {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final int e;
    public final String f;
    public final ArrayList<String> g;
    public final boolean h;
    public final boolean i;

    public static final class a {
        boolean a;
        boolean b;
        int c;
        boolean d;
        int e;
        String f;
        ArrayList<String> g;
        boolean h;
        boolean i;

        private a() {
            this.a = false;
            this.b = true;
            this.c = 17;
            this.d = false;
            this.e = 4368;
            this.f = null;
            this.g = new ArrayList();
            this.h = false;
            this.i = false;
        }

        public a a(int i) {
            this.e = i;
            return this;
        }

        public a a(boolean z) {
            this.b = z;
            this.c = 17;
            return this;
        }

        public a a(boolean z, int i) {
            this.b = z;
            this.c = i;
            return this;
        }

        public c$c a() {
            return new c$c();
        }

        public a b(boolean z) {
            this.h = z;
            return this;
        }
    }

    private c$c() {
        this.a = false;
        this.b = true;
        this.c = 17;
        this.d = false;
        this.e = 4368;
        this.f = null;
        this.g = new ArrayList();
        this.h = false;
        this.i = false;
    }

    private c$c(a aVar) {
        this.a = false;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = false;
        this.e = aVar.e;
        this.f = null;
        this.g = aVar.g;
        this.h = aVar.h;
        this.i = false;
    }

    public static a b() {
        return new a();
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.games.key.isHeadless", this.a);
        bundle.putBoolean("com.google.android.gms.games.key.showConnectingPopup", this.b);
        bundle.putInt("com.google.android.gms.games.key.connectingPopupGravity", this.c);
        bundle.putBoolean("com.google.android.gms.games.key.retryingSignIn", this.d);
        bundle.putInt("com.google.android.gms.games.key.sdkVariant", this.e);
        bundle.putString("com.google.android.gms.games.key.forceResolveAccountKey", this.f);
        bundle.putStringArrayList("com.google.android.gms.games.key.proxyApis", this.g);
        bundle.putBoolean("com.google.android.gms.games.key.requireGooglePlus", this.h);
        bundle.putBoolean("com.google.android.gms.games.key.unauthenticated", this.i);
        return bundle;
    }
}
