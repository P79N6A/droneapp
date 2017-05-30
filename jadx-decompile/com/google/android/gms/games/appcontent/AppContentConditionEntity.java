package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class AppContentConditionEntity extends AbstractSafeParcelable implements AppContentCondition {
    public static final d CREATOR = new d();
    private final int a;
    private final String b;
    private final String c;
    private final String d;
    private final Bundle e;

    AppContentConditionEntity(int i, String str, String str2, String str3, Bundle bundle) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = bundle;
    }

    public AppContentConditionEntity(AppContentCondition appContentCondition) {
        this.a = 1;
        this.b = appContentCondition.c();
        this.c = appContentCondition.d();
        this.d = appContentCondition.e();
        this.e = appContentCondition.f();
    }

    static int a(AppContentCondition appContentCondition) {
        return c.a(new Object[]{appContentCondition.c(), appContentCondition.d(), appContentCondition.e(), appContentCondition.f()});
    }

    static boolean a(AppContentCondition appContentCondition, Object obj) {
        if (!(obj instanceof AppContentCondition)) {
            return false;
        }
        if (appContentCondition == obj) {
            return true;
        }
        AppContentCondition appContentCondition2 = (AppContentCondition) obj;
        return c.a(appContentCondition2.c(), appContentCondition.c()) && c.a(appContentCondition2.d(), appContentCondition.d()) && c.a(appContentCondition2.e(), appContentCondition.e()) && c.a(appContentCondition2.f(), appContentCondition.f());
    }

    static String b(AppContentCondition appContentCondition) {
        return c.a(appContentCondition).a("DefaultValue", appContentCondition.c()).a("ExpectedValue", appContentCondition.d()).a("Predicate", appContentCondition.e()).a("PredicateParameters", appContentCondition.f()).toString();
    }

    public /* synthetic */ Object a() {
        return h();
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

    public String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        return a(this, obj);
    }

    public Bundle f() {
        return this.e;
    }

    public int g() {
        return this.a;
    }

    public AppContentCondition h() {
        return this;
    }

    public int hashCode() {
        return a(this);
    }

    public String toString() {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        d.a(this, parcel, i);
    }
}
