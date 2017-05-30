package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
import java.util.List;

public final class AppContentSectionRef extends j implements AppContentSection {
    private final int d;

    AppContentSectionRef(ArrayList<DataHolder> arrayList, int i, int i2) {
        super(arrayList, 0, i);
        this.d = i2;
    }

    public /* synthetic */ Object a() {
        return p();
    }

    public /* synthetic */ List c() {
        return m();
    }

    public /* synthetic */ List d() {
        return n();
    }

    public int describeContents() {
        return 0;
    }

    public /* synthetic */ List e() {
        return o();
    }

    public boolean equals(Object obj) {
        return AppContentSectionEntity.a(this, obj);
    }

    public String f() {
        return e("section_card_type");
    }

    public String g() {
        return e("section_content_description");
    }

    public Bundle h() {
        return h.d(this.c_, this.c, "section_data", this.d_);
    }

    public int hashCode() {
        return AppContentSectionEntity.a(this);
    }

    public String i() {
        return e("section_id");
    }

    public String j() {
        return e("section_subtitle");
    }

    public String k() {
        return e("section_title");
    }

    public String l() {
        return e("section_type");
    }

    public ArrayList<AppContentAction> m() {
        return h.a(this.c_, this.c, "section_actions", this.d_);
    }

    public ArrayList<AppContentAnnotation> n() {
        return h.b(this.c_, this.c, "section_annotations", this.d_);
    }

    public ArrayList<AppContentCard> o() {
        ArrayList<AppContentCard> arrayList = new ArrayList(this.d);
        for (int i = 0; i < this.d; i++) {
            arrayList.add(new AppContentCardRef(this.c, this.d_ + i));
        }
        return arrayList;
    }

    public AppContentSection p() {
        return new AppContentSectionEntity(this);
    }

    public String toString() {
        return AppContentSectionEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((AppContentSectionEntity) ((AppContentSection) a())).writeToParcel(parcel, i);
    }
}
