package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
import java.util.List;

public final class AppContentCardRef extends j implements AppContentCard {
    AppContentCardRef(ArrayList<DataHolder> arrayList, int i) {
        super(arrayList, 0, i);
    }

    public /* synthetic */ Object a() {
        return o();
    }

    public List<AppContentAction> c() {
        return h.a(this.c_, this.c, "card_actions", this.d_);
    }

    public List<AppContentAnnotation> d() {
        return h.b(this.c_, this.c, "card_annotations", this.d_);
    }

    public int describeContents() {
        return 0;
    }

    public List<AppContentCondition> e() {
        return h.c(this.c_, this.c, "card_conditions", this.d_);
    }

    public boolean equals(Object obj) {
        return AppContentCardEntity.a(this, obj);
    }

    public String f() {
        return e("card_content_description");
    }

    public int g() {
        return c("card_current_steps");
    }

    public String h() {
        return e("card_description");
    }

    public int hashCode() {
        return AppContentCardEntity.a(this);
    }

    public Bundle i() {
        return h.d(this.c_, this.c, "card_data", this.d_);
    }

    public String j() {
        return e("card_id");
    }

    public String k() {
        return e("card_subtitle");
    }

    public String l() {
        return e("card_title");
    }

    public int m() {
        return c("card_total_steps");
    }

    public String n() {
        return e("card_type");
    }

    public AppContentCard o() {
        return new AppContentCardEntity(this);
    }

    public String toString() {
        return AppContentCardEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((AppContentCardEntity) ((AppContentCard) a())).writeToParcel(parcel, i);
    }
}
