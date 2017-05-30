package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class LineItem extends AbstractSafeParcelable {
    public static final Creator<LineItem> CREATOR = new o();
    String a;
    String b;
    String c;
    String d;
    int e;
    String f;
    private final int g;

    public final class a {
        final /* synthetic */ LineItem a;

        private a(LineItem lineItem) {
            this.a = lineItem;
        }

        public a a(int i) {
            this.a.e = i;
            return this;
        }

        public a a(String str) {
            this.a.a = str;
            return this;
        }

        public LineItem a() {
            return this.a;
        }

        public a b(String str) {
            this.a.b = str;
            return this;
        }

        public a c(String str) {
            this.a.c = str;
            return this;
        }

        public a d(String str) {
            this.a.d = str;
            return this;
        }

        public a e(String str) {
            this.a.f = str;
            return this;
        }
    }

    public interface b {
        public static final int a = 0;
        public static final int b = 1;
        public static final int c = 2;
    }

    LineItem() {
        this.g = 1;
        this.e = 0;
    }

    LineItem(int i, String str, String str2, String str3, String str4, int i2, String str5) {
        this.g = i;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i2;
        this.f = str5;
    }

    public static a a() {
        LineItem lineItem = new LineItem();
        lineItem.getClass();
        return new a();
    }

    public int b() {
        return this.g;
    }

    public String c() {
        return this.a;
    }

    public String d() {
        return this.b;
    }

    public String e() {
        return this.c;
    }

    public String f() {
        return this.d;
    }

    public int g() {
        return this.e;
    }

    public String h() {
        return this.f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        o.a(this, parcel, i);
    }
}
