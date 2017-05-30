package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
import java.util.List;

public final class AppContentActionRef extends j implements AppContentAction {
    AppContentActionRef(ArrayList<DataHolder> arrayList, int i) {
        super(arrayList, 1, i);
    }

    public /* synthetic */ Object a() {
        return j();
    }

    public AppContentAnnotation c() {
        List b = h.b(this.c_, this.c, "action_annotation", this.d_);
        return b.size() == 1 ? (AppContentAnnotation) b.get(0) : null;
    }

    public List<AppContentCondition> d() {
        return h.c(this.c_, this.c, "action_conditions", this.d_);
    }

    public int describeContents() {
        return 0;
    }

    public String e() {
        return e("action_content_description");
    }

    public boolean equals(Object obj) {
        return AppContentActionEntity.a(this, obj);
    }

    public Bundle f() {
        return h.d(this.c_, this.c, "action_data", this.d_);
    }

    public String g() {
        return e("action_id");
    }

    public String h() {
        return e("overflow_text");
    }

    public int hashCode() {
        return AppContentActionEntity.a(this);
    }

    public String i() {
        return e("action_type");
    }

    public AppContentAction j() {
        return new AppContentActionEntity(this);
    }

    public String toString() {
        return AppContentActionEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((AppContentActionEntity) ((AppContentAction) a())).writeToParcel(parcel, i);
    }
}
