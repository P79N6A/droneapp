package com.google.android.gms.nearby.messages;

import android.support.annotation.Nullable;
import com.google.android.gms.common.api.a.a.d;

public class g implements d {
    @Nullable
    public final String a;
    public final boolean b;
    public final int c;
    public final String d;

    public static class a {
        private int a = -1;

        public a a(int i) {
            this.a = i;
            return this;
        }

        public g a() {
            return new g();
        }
    }

    private g(a aVar) {
        this.a = null;
        this.b = false;
        this.c = aVar.a;
        this.d = null;
    }
}
