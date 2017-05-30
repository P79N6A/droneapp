package com.google.android.gms.games.video;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class VideoConfiguration extends AbstractSafeParcelable {
    public static final Creator<VideoConfiguration> CREATOR = new d();
    public static final int a = 3;
    public static final int b = 2;
    public static final int c = 1;
    public static final int d = 0;
    public static final int e = -1;
    public static final int f = 4;
    public static final int g = -1;
    public static final int h = 0;
    public static final int i = 1;
    public static final int j = 2;
    private final int k;
    private final int l;
    private final int m;
    private final String n;
    private final String o;
    private final String p;
    private final String q;
    private final boolean r;

    public static final class a {
        private int a;
        private int b;
        private boolean c = true;
        private String d = null;
        private String e = null;
        private String f = null;
        private String g = null;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public a a(int i) {
            this.a = i;
            return this;
        }

        public VideoConfiguration a() {
            return new VideoConfiguration(this.a, this.b, null, null, null, null, this.c);
        }

        public a b(int i) {
            this.b = i;
            return this;
        }
    }

    public VideoConfiguration(int i, int i2, int i3, String str, String str2, String str3, String str4, boolean z) {
        boolean z2 = true;
        this.k = i;
        d.b(a(i2, false));
        d.b(b(i3, false));
        this.l = i2;
        this.m = i3;
        this.r = z;
        if (i3 == 1) {
            this.o = str2;
            this.n = str;
            this.p = str3;
            this.q = str4;
            return;
        }
        d.b(str2 == null, "Stream key should be null when not streaming");
        d.b(str == null, "Stream url should be null when not streaming");
        d.b(str3 == null, "Stream title should be null when not streaming");
        if (str4 != null) {
            z2 = false;
        }
        d.b(z2, "Stream description should be null when not streaming");
        this.o = null;
        this.n = null;
        this.p = null;
        this.q = null;
    }

    private VideoConfiguration(int i, int i2, String str, String str2, String str3, String str4, boolean z) {
        this(2, i, i2, str, str2, str3, str4, z);
    }

    public static boolean a(int i, boolean z) {
        switch (i) {
            case -1:
                return z;
            case 0:
            case 1:
            case 2:
            case 3:
                return true;
            default:
                return false;
        }
    }

    public static boolean b(int i, boolean z) {
        switch (i) {
            case -1:
                return z;
            case 0:
            case 1:
                return true;
            default:
                return false;
        }
    }

    public int a() {
        return this.k;
    }

    public int b() {
        return this.l;
    }

    public int c() {
        return this.m;
    }

    public String d() {
        return this.o;
    }

    public String e() {
        return this.n;
    }

    public String f() {
        return this.p;
    }

    public String g() {
        return this.q;
    }

    public boolean h() {
        return this.r;
    }

    public void writeToParcel(Parcel parcel, int i) {
        d.a(this, parcel, i);
    }
}
