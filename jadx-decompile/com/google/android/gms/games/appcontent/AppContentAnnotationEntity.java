package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class AppContentAnnotationEntity extends AbstractSafeParcelable implements AppContentAnnotation {
    public static final b CREATOR = new b();
    private final int a;
    private final String b;
    private final Uri c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final int h;
    private final int i;
    private final Bundle j;

    AppContentAnnotationEntity(int i, String str, Uri uri, String str2, String str3, String str4, String str5, int i2, int i3, Bundle bundle) {
        this.a = i;
        this.b = str;
        this.e = str3;
        this.g = str5;
        this.h = i2;
        this.c = uri;
        this.i = i3;
        this.f = str4;
        this.j = bundle;
        this.d = str2;
    }

    public AppContentAnnotationEntity(AppContentAnnotation appContentAnnotation) {
        this.a = 4;
        this.b = appContentAnnotation.c();
        this.e = appContentAnnotation.d();
        this.g = appContentAnnotation.e();
        this.h = appContentAnnotation.f();
        this.c = appContentAnnotation.g();
        this.i = appContentAnnotation.i();
        this.f = appContentAnnotation.j();
        this.j = appContentAnnotation.h();
        this.d = appContentAnnotation.k();
    }

    static int a(AppContentAnnotation appContentAnnotation) {
        return c.a(new Object[]{appContentAnnotation.c(), appContentAnnotation.d(), appContentAnnotation.e(), Integer.valueOf(appContentAnnotation.f()), appContentAnnotation.g(), Integer.valueOf(appContentAnnotation.i()), appContentAnnotation.j(), appContentAnnotation.h(), appContentAnnotation.k()});
    }

    static boolean a(AppContentAnnotation appContentAnnotation, Object obj) {
        if (!(obj instanceof AppContentAnnotation)) {
            return false;
        }
        if (appContentAnnotation == obj) {
            return true;
        }
        AppContentAnnotation appContentAnnotation2 = (AppContentAnnotation) obj;
        return c.a(appContentAnnotation2.c(), appContentAnnotation.c()) && c.a(appContentAnnotation2.d(), appContentAnnotation.d()) && c.a(appContentAnnotation2.e(), appContentAnnotation.e()) && c.a(Integer.valueOf(appContentAnnotation2.f()), Integer.valueOf(appContentAnnotation.f())) && c.a(appContentAnnotation2.g(), appContentAnnotation.g()) && c.a(Integer.valueOf(appContentAnnotation2.i()), Integer.valueOf(appContentAnnotation.i())) && c.a(appContentAnnotation2.j(), appContentAnnotation.j()) && c.a(appContentAnnotation2.h(), appContentAnnotation.h()) && c.a(appContentAnnotation2.k(), appContentAnnotation.k());
    }

    static String b(AppContentAnnotation appContentAnnotation) {
        return c.a(appContentAnnotation).a("Description", appContentAnnotation.c()).a("Id", appContentAnnotation.d()).a("ImageDefaultId", appContentAnnotation.e()).a("ImageHeight", Integer.valueOf(appContentAnnotation.f())).a("ImageUri", appContentAnnotation.g()).a("ImageWidth", Integer.valueOf(appContentAnnotation.i())).a("LayoutSlot", appContentAnnotation.j()).a("Modifiers", appContentAnnotation.h()).a("Title", appContentAnnotation.k()).toString();
    }

    public /* synthetic */ Object a() {
        return m();
    }

    public boolean b() {
        return true;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.e;
    }

    public String e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        return a(this, obj);
    }

    public int f() {
        return this.h;
    }

    public Uri g() {
        return this.c;
    }

    public Bundle h() {
        return this.j;
    }

    public int hashCode() {
        return a(this);
    }

    public int i() {
        return this.i;
    }

    public String j() {
        return this.f;
    }

    public String k() {
        return this.d;
    }

    public int l() {
        return this.a;
    }

    public AppContentAnnotation m() {
        return this;
    }

    public String toString() {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        b.a(this, parcel, i);
    }
}
