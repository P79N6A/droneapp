package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;

public final class AppContentActionEntity extends AbstractSafeParcelable implements AppContentAction {
    public static final a CREATOR = new a();
    private final int a;
    private final ArrayList<AppContentConditionEntity> b;
    private final String c;
    private final Bundle d;
    private final String e;
    private final String f;
    private final AppContentAnnotationEntity g;
    private final String h;

    AppContentActionEntity(int i, ArrayList<AppContentConditionEntity> arrayList, String str, Bundle bundle, String str2, String str3, AppContentAnnotationEntity appContentAnnotationEntity, String str4) {
        this.a = i;
        this.g = appContentAnnotationEntity;
        this.b = arrayList;
        this.c = str;
        this.d = bundle;
        this.f = str3;
        this.h = str4;
        this.e = str2;
    }

    public AppContentActionEntity(AppContentAction appContentAction) {
        this.a = 5;
        this.g = (AppContentAnnotationEntity) appContentAction.c().a();
        this.c = appContentAction.e();
        this.d = appContentAction.f();
        this.f = appContentAction.g();
        this.h = appContentAction.h();
        this.e = appContentAction.i();
        List d = appContentAction.d();
        int size = d.size();
        this.b = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            this.b.add((AppContentConditionEntity) ((AppContentCondition) d.get(i)).a());
        }
    }

    static int a(AppContentAction appContentAction) {
        return c.a(new Object[]{appContentAction.c(), appContentAction.d(), appContentAction.e(), appContentAction.f(), appContentAction.g(), appContentAction.h(), appContentAction.i()});
    }

    static boolean a(AppContentAction appContentAction, Object obj) {
        if (!(obj instanceof AppContentAction)) {
            return false;
        }
        if (appContentAction == obj) {
            return true;
        }
        AppContentAction appContentAction2 = (AppContentAction) obj;
        return c.a(appContentAction2.c(), appContentAction.c()) && c.a(appContentAction2.d(), appContentAction.d()) && c.a(appContentAction2.e(), appContentAction.e()) && c.a(appContentAction2.f(), appContentAction.f()) && c.a(appContentAction2.g(), appContentAction.g()) && c.a(appContentAction2.h(), appContentAction.h()) && c.a(appContentAction2.i(), appContentAction.i());
    }

    static String b(AppContentAction appContentAction) {
        return c.a(appContentAction).a("Annotation", appContentAction.c()).a("Conditions", appContentAction.d()).a("ContentDescription", appContentAction.e()).a("Extras", appContentAction.f()).a("Id", appContentAction.g()).a("OverflowText", appContentAction.h()).a("Type", appContentAction.i()).toString();
    }

    public /* synthetic */ Object a() {
        return k();
    }

    public boolean b() {
        return true;
    }

    public AppContentAnnotation c() {
        return this.g;
    }

    public List<AppContentCondition> d() {
        return new ArrayList(this.b);
    }

    public String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        return a(this, obj);
    }

    public Bundle f() {
        return this.d;
    }

    public String g() {
        return this.f;
    }

    public String h() {
        return this.h;
    }

    public int hashCode() {
        return a(this);
    }

    public String i() {
        return this.e;
    }

    public int j() {
        return this.a;
    }

    public AppContentAction k() {
        return this;
    }

    public String toString() {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        a.a(this, parcel, i);
    }
}
