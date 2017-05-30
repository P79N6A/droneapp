package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;

public final class AppContentConditionRef extends j implements AppContentCondition {
    AppContentConditionRef(ArrayList<DataHolder> arrayList, int i) {
        super(arrayList, 4, i);
    }

    public /* synthetic */ Object a() {
        return g();
    }

    public String c() {
        return e("condition_default_value");
    }

    public String d() {
        return e("condition_expected_value");
    }

    public int describeContents() {
        return 0;
    }

    public String e() {
        return e("condition_predicate");
    }

    public boolean equals(Object obj) {
        return AppContentConditionEntity.a(this, obj);
    }

    public Bundle f() {
        return h.d(this.c_, this.c, "condition_predicate_parameters", this.d_);
    }

    public AppContentCondition g() {
        return new AppContentConditionEntity(this);
    }

    public int hashCode() {
        return AppContentConditionEntity.a(this);
    }

    public String toString() {
        return AppContentConditionEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((AppContentConditionEntity) ((AppContentCondition) a())).writeToParcel(parcel, i);
    }
}
