package com.google.android.gms.games.appcontent;

import android.os.Parcel;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class AppContentTupleEntity extends AbstractSafeParcelable implements AppContentTuple {
    public static final g CREATOR = new g();
    private final int a;
    private final String b;
    private final String c;

    AppContentTupleEntity(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public AppContentTupleEntity(AppContentTuple appContentTuple) {
        this.a = 1;
        this.b = appContentTuple.c();
        this.c = appContentTuple.d();
    }

    static int a(AppContentTuple appContentTuple) {
        return c.a(new Object[]{appContentTuple.c(), appContentTuple.d()});
    }

    static boolean a(AppContentTuple appContentTuple, Object obj) {
        if (!(obj instanceof AppContentTuple)) {
            return false;
        }
        if (appContentTuple == obj) {
            return true;
        }
        AppContentTuple appContentTuple2 = (AppContentTuple) obj;
        return c.a(appContentTuple2.c(), appContentTuple.c()) && c.a(appContentTuple2.d(), appContentTuple.d());
    }

    static String b(AppContentTuple appContentTuple) {
        return c.a(appContentTuple).a("Name", appContentTuple.c()).a("Value", appContentTuple.d()).toString();
    }

    public /* synthetic */ Object a() {
        return f();
    }

    public boolean b() {
        return true;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    public int e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return a(this, obj);
    }

    public AppContentTuple f() {
        return this;
    }

    public int hashCode() {
        return a(this);
    }

    public String toString() {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        g.a(this, parcel, i);
    }
}
