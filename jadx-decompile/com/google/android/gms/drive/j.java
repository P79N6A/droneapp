package com.google.android.gms.drive;

import android.text.TextUtils;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.drive.internal.bt;

public class j {
    public static final int a = 65536;
    public static final int b = 0;
    public static final int c = 1;
    private final String d;
    private final boolean e;
    private final int f;

    public static class a {
        protected String a;
        protected boolean b;
        protected int c = 0;

        public a a(int i) {
            if (j.b(i)) {
                this.c = i;
                return this;
            }
            throw new IllegalArgumentException("Unrecognized value for conflict strategy: " + i);
        }

        public a a(String str) {
            if (j.a(str)) {
                this.a = str;
                return this;
            }
            throw new IllegalArgumentException(String.format("trackingTag must not be null nor empty, and the length must be <= the maximum length (%s)", new Object[]{Integer.valueOf(65536)}));
        }

        public a a(boolean z) {
            this.b = z;
            return this;
        }

        protected void a() {
            if (this.c == 1 && !this.b) {
                throw new IllegalStateException("Cannot use CONFLICT_STRATEGY_KEEP_REMOTE without requesting completion notifications");
            }
        }

        public j b() {
            a();
            return new j(this.a, this.b, this.c);
        }
    }

    public j(String str, boolean z, int i) {
        this.d = str;
        this.e = z;
        this.f = i;
    }

    public static boolean a(int i) {
        switch (i) {
            case 1:
                return true;
            default:
                return false;
        }
    }

    public static boolean a(String str) {
        return !TextUtils.isEmpty(str) && str.length() <= 65536;
    }

    public static boolean b(int i) {
        switch (i) {
            case 0:
            case 1:
                return true;
            default:
                return false;
        }
    }

    public String a() {
        return this.d;
    }

    public void a(g gVar) {
        bt btVar = (bt) gVar.a(b.a);
        if (b() && !btVar.m()) {
            throw new IllegalStateException("Application must define an exported DriveEventService subclass in AndroidManifest.xml to be notified on completion");
        }
    }

    public boolean b() {
        return this.e;
    }

    public int c() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        j jVar = (j) obj;
        return c.a(this.d, jVar.d) && this.f == jVar.f && this.e == jVar.e;
    }

    public int hashCode() {
        return c.a(new Object[]{this.d, Integer.valueOf(this.f), Boolean.valueOf(this.e)});
    }
}
