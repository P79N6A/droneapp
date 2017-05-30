package com.google.firebase.appindexing;

import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.d;
import com.google.firebase.appindexing.a.e;
import com.google.firebase.appindexing.internal.Thing.Metadata;

public interface g {
    public static final int a = 1000;
    public static final int b = 256;
    public static final int c = 5;
    public static final int d = 20;
    public static final int e = 100;
    public static final int f = 20000;
    public static final int g = 30000;

    public static class a extends e<a> {
        public a() {
            this("Thing");
        }

        public a(@NonNull String str) {
            super(str);
        }
    }

    public interface b {
        public static final Metadata a = new a().a();

        public static final class a {
            private static final com.google.android.gms.internal.rh.a a = new com.google.android.gms.internal.rh.a();
            private boolean b = a.a;
            private int c = a.b;
            private String d = a.c;

            public a a(int i) {
                d.b(i >= 0, "Negative score values are invalid. Value: " + i);
                this.c = i;
                return this;
            }

            public a a(boolean z) {
                this.b = z;
                return this;
            }

            public Metadata a() {
                return new Metadata(this.b, this.c, this.d);
            }
        }
    }
}
