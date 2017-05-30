package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class d {

    public static final class a {
        final h a;
        g b;
        a c;
        String d;
        int e;
        ArrayList<String> f;
        Bundle g;

        private a(h hVar) {
            this.d = null;
            this.e = -1;
            this.f = new ArrayList();
            this.a = (h) com.google.android.gms.common.internal.d.a(hVar, "Must provide a RoomUpdateListener");
        }

        public a a(int i) {
            boolean z = i == -1 || i > 0;
            com.google.android.gms.common.internal.d.b(z, "Variant must be a positive integer or Room.ROOM_VARIANT_ANY");
            this.e = i;
            return this;
        }

        public a a(Bundle bundle) {
            this.g = bundle;
            return this;
        }

        public a a(a aVar) {
            this.c = aVar;
            return this;
        }

        public a a(g gVar) {
            this.b = gVar;
            return this;
        }

        public a a(String str) {
            com.google.android.gms.common.internal.d.a(str);
            this.d = str;
            return this;
        }

        public a a(ArrayList<String> arrayList) {
            com.google.android.gms.common.internal.d.a(arrayList);
            this.f.addAll(arrayList);
            return this;
        }

        public a a(String... strArr) {
            com.google.android.gms.common.internal.d.a(strArr);
            this.f.addAll(Arrays.asList(strArr));
            return this;
        }

        public d a() {
            return new e(this);
        }
    }

    protected d() {
    }

    public static Bundle a(int i, int i2, long j) {
        Bundle bundle = new Bundle();
        bundle.putInt(com.google.android.gms.games.multiplayer.d.i, i);
        bundle.putInt(com.google.android.gms.games.multiplayer.d.j, i2);
        bundle.putLong(com.google.android.gms.games.multiplayer.d.d, j);
        return bundle;
    }

    public static a a(h hVar) {
        return new a(hVar);
    }

    public abstract h a();

    public abstract String b();

    public abstract g c();

    public abstract a d();

    public abstract int e();

    public abstract String[] f();

    public abstract Bundle g();
}
