package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;

public final class AppContentCardEntity extends AbstractSafeParcelable implements AppContentCard {
    public static final c CREATOR = new c();
    private final int a;
    private final ArrayList<AppContentActionEntity> b;
    private final ArrayList<AppContentAnnotationEntity> c;
    private final ArrayList<AppContentConditionEntity> d;
    private final String e;
    private final int f;
    private final String g;
    private final Bundle h;
    private final String i;
    private final String j;
    private final int k;
    private final String l;
    private final String m;

    AppContentCardEntity(int i, ArrayList<AppContentActionEntity> arrayList, ArrayList<AppContentAnnotationEntity> arrayList2, ArrayList<AppContentConditionEntity> arrayList3, String str, int i2, String str2, Bundle bundle, String str3, String str4, int i3, String str5, String str6) {
        this.a = i;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = str;
        this.f = i2;
        this.g = str2;
        this.h = bundle;
        this.m = str6;
        this.i = str3;
        this.j = str4;
        this.k = i3;
        this.l = str5;
    }

    public AppContentCardEntity(AppContentCard appContentCard) {
        int i;
        int i2 = 0;
        this.a = 4;
        this.e = appContentCard.f();
        this.f = appContentCard.g();
        this.g = appContentCard.h();
        this.h = appContentCard.i();
        this.m = appContentCard.j();
        this.j = appContentCard.l();
        this.i = appContentCard.k();
        this.k = appContentCard.m();
        this.l = appContentCard.n();
        List c = appContentCard.c();
        int size = c.size();
        this.b = new ArrayList(size);
        for (i = 0; i < size; i++) {
            this.b.add((AppContentActionEntity) ((AppContentAction) c.get(i)).a());
        }
        c = appContentCard.d();
        size = c.size();
        this.c = new ArrayList(size);
        for (i = 0; i < size; i++) {
            this.c.add((AppContentAnnotationEntity) ((AppContentAnnotation) c.get(i)).a());
        }
        List e = appContentCard.e();
        int size2 = e.size();
        this.d = new ArrayList(size2);
        while (i2 < size2) {
            this.d.add((AppContentConditionEntity) ((AppContentCondition) e.get(i2)).a());
            i2++;
        }
    }

    static int a(AppContentCard appContentCard) {
        return c.a(new Object[]{appContentCard.c(), appContentCard.d(), appContentCard.e(), appContentCard.f(), Integer.valueOf(appContentCard.g()), appContentCard.h(), appContentCard.i(), appContentCard.j(), appContentCard.k(), appContentCard.l(), Integer.valueOf(appContentCard.m()), appContentCard.n()});
    }

    static boolean a(AppContentCard appContentCard, Object obj) {
        if (!(obj instanceof AppContentCard)) {
            return false;
        }
        if (appContentCard == obj) {
            return true;
        }
        AppContentCard appContentCard2 = (AppContentCard) obj;
        return c.a(appContentCard2.c(), appContentCard.c()) && c.a(appContentCard2.d(), appContentCard.d()) && c.a(appContentCard2.e(), appContentCard.e()) && c.a(appContentCard2.f(), appContentCard.f()) && c.a(Integer.valueOf(appContentCard2.g()), Integer.valueOf(appContentCard.g())) && c.a(appContentCard2.h(), appContentCard.h()) && c.a(appContentCard2.i(), appContentCard.i()) && c.a(appContentCard2.j(), appContentCard.j()) && c.a(appContentCard2.k(), appContentCard.k()) && c.a(appContentCard2.l(), appContentCard.l()) && c.a(Integer.valueOf(appContentCard2.m()), Integer.valueOf(appContentCard.m())) && c.a(appContentCard2.n(), appContentCard.n());
    }

    static String b(AppContentCard appContentCard) {
        return c.a(appContentCard).a("Actions", appContentCard.c()).a("Annotations", appContentCard.d()).a("Conditions", appContentCard.e()).a("ContentDescription", appContentCard.f()).a("CurrentSteps", Integer.valueOf(appContentCard.g())).a("Description", appContentCard.h()).a("Extras", appContentCard.i()).a("Id", appContentCard.j()).a("Subtitle", appContentCard.k()).a("Title", appContentCard.l()).a("TotalSteps", Integer.valueOf(appContentCard.m())).a("Type", appContentCard.n()).toString();
    }

    public /* synthetic */ Object a() {
        return p();
    }

    public boolean b() {
        return true;
    }

    public List<AppContentAction> c() {
        return new ArrayList(this.b);
    }

    public List<AppContentAnnotation> d() {
        return new ArrayList(this.c);
    }

    public List<AppContentCondition> e() {
        return new ArrayList(this.d);
    }

    public boolean equals(Object obj) {
        return a(this, obj);
    }

    public String f() {
        return this.e;
    }

    public int g() {
        return this.f;
    }

    public String h() {
        return this.g;
    }

    public int hashCode() {
        return a(this);
    }

    public Bundle i() {
        return this.h;
    }

    public String j() {
        return this.m;
    }

    public String k() {
        return this.i;
    }

    public String l() {
        return this.j;
    }

    public int m() {
        return this.k;
    }

    public String n() {
        return this.l;
    }

    public int o() {
        return this.a;
    }

    public AppContentCard p() {
        return this;
    }

    public String toString() {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        c.a(this, parcel, i);
    }
}
