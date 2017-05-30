package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;

public final class AppContentSectionEntity extends AbstractSafeParcelable implements AppContentSection {
    public static final f CREATOR = new f();
    private final int a;
    private final ArrayList<AppContentActionEntity> b;
    private final ArrayList<AppContentCardEntity> c;
    private final String d;
    private final Bundle e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final ArrayList<AppContentAnnotationEntity> k;

    AppContentSectionEntity(int i, ArrayList<AppContentActionEntity> arrayList, ArrayList<AppContentCardEntity> arrayList2, String str, Bundle bundle, String str2, String str3, String str4, String str5, String str6, ArrayList<AppContentAnnotationEntity> arrayList3) {
        this.a = i;
        this.b = arrayList;
        this.k = arrayList3;
        this.c = arrayList2;
        this.j = str6;
        this.d = str;
        this.e = bundle;
        this.i = str5;
        this.f = str2;
        this.g = str3;
        this.h = str4;
    }

    public AppContentSectionEntity(AppContentSection appContentSection) {
        int i;
        int i2 = 0;
        this.a = 5;
        this.j = appContentSection.f();
        this.d = appContentSection.g();
        this.e = appContentSection.h();
        this.i = appContentSection.i();
        this.f = appContentSection.j();
        this.g = appContentSection.k();
        this.h = appContentSection.l();
        List c = appContentSection.c();
        int size = c.size();
        this.b = new ArrayList(size);
        for (i = 0; i < size; i++) {
            this.b.add((AppContentActionEntity) ((AppContentAction) c.get(i)).a());
        }
        c = appContentSection.e();
        size = c.size();
        this.c = new ArrayList(size);
        for (i = 0; i < size; i++) {
            this.c.add((AppContentCardEntity) ((AppContentCard) c.get(i)).a());
        }
        List d = appContentSection.d();
        int size2 = d.size();
        this.k = new ArrayList(size2);
        while (i2 < size2) {
            this.k.add((AppContentAnnotationEntity) ((AppContentAnnotation) d.get(i2)).a());
            i2++;
        }
    }

    static int a(AppContentSection appContentSection) {
        return c.a(new Object[]{appContentSection.c(), appContentSection.d(), appContentSection.e(), appContentSection.f(), appContentSection.g(), appContentSection.h(), appContentSection.i(), appContentSection.j(), appContentSection.k(), appContentSection.l()});
    }

    static boolean a(AppContentSection appContentSection, Object obj) {
        if (!(obj instanceof AppContentSection)) {
            return false;
        }
        if (appContentSection == obj) {
            return true;
        }
        AppContentSection appContentSection2 = (AppContentSection) obj;
        return c.a(appContentSection2.c(), appContentSection.c()) && c.a(appContentSection2.d(), appContentSection.d()) && c.a(appContentSection2.e(), appContentSection.e()) && c.a(appContentSection2.f(), appContentSection.f()) && c.a(appContentSection2.g(), appContentSection.g()) && c.a(appContentSection2.h(), appContentSection.h()) && c.a(appContentSection2.i(), appContentSection.i()) && c.a(appContentSection2.j(), appContentSection.j()) && c.a(appContentSection2.k(), appContentSection.k()) && c.a(appContentSection2.l(), appContentSection.l());
    }

    static String b(AppContentSection appContentSection) {
        return c.a(appContentSection).a("Actions", appContentSection.c()).a("Annotations", appContentSection.d()).a("Cards", appContentSection.e()).a("CardType", appContentSection.f()).a("ContentDescription", appContentSection.g()).a("Extras", appContentSection.h()).a("Id", appContentSection.i()).a("Subtitle", appContentSection.j()).a("Title", appContentSection.k()).a("Type", appContentSection.l()).toString();
    }

    public /* synthetic */ Object a() {
        return n();
    }

    public boolean b() {
        return true;
    }

    public List<AppContentAction> c() {
        return new ArrayList(this.b);
    }

    public List<AppContentAnnotation> d() {
        return new ArrayList(this.k);
    }

    public List<AppContentCard> e() {
        return new ArrayList(this.c);
    }

    public boolean equals(Object obj) {
        return a(this, obj);
    }

    public String f() {
        return this.j;
    }

    public String g() {
        return this.d;
    }

    public Bundle h() {
        return this.e;
    }

    public int hashCode() {
        return a(this);
    }

    public String i() {
        return this.i;
    }

    public String j() {
        return this.f;
    }

    public String k() {
        return this.g;
    }

    public String l() {
        return this.h;
    }

    public int m() {
        return this.a;
    }

    public AppContentSection n() {
        return this;
    }

    public String toString() {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        f.a(this, parcel, i);
    }
}
