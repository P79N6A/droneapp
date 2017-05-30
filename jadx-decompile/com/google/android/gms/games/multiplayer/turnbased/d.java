package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import java.util.ArrayList;

public abstract class d {

    public static final class a {
        int a;
        ArrayList<String> b;
        Bundle c;
        int d;

        private a() {
            this.a = -1;
            this.b = new ArrayList();
            this.c = null;
            this.d = 2;
        }

        public a a(int i) {
            boolean z = i == -1 || i > 0;
            com.google.android.gms.common.internal.d.b(z, "Variant must be a positive integer or TurnBasedMatch.MATCH_VARIANT_ANY");
            this.a = i;
            return this;
        }

        public a a(Bundle bundle) {
            this.c = bundle;
            return this;
        }

        public a a(String str) {
            com.google.android.gms.common.internal.d.a(str);
            this.b.add(str);
            return this;
        }

        public a a(ArrayList<String> arrayList) {
            com.google.android.gms.common.internal.d.a(arrayList);
            this.b.addAll(arrayList);
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

    public static a e() {
        return new a();
    }

    public abstract int a();

    public abstract int b();

    public abstract String[] c();

    public abstract Bundle d();
}
