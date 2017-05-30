package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.fimi.soul.entity.User;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

@Deprecated
public final class PlaceLocalization extends AbstractSafeParcelable {
    public static final o CREATOR = new o();
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final List<String> f;

    public PlaceLocalization(int i, String str, String str2, String str3, String str4, List<String> list) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = list;
    }

    public static PlaceLocalization a(String str, String str2, String str3, String str4, List<String> list) {
        return new PlaceLocalization(0, str, str2, str3, str4, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceLocalization)) {
            return false;
        }
        PlaceLocalization placeLocalization = (PlaceLocalization) obj;
        return c.a(this.b, placeLocalization.b) && c.a(this.c, placeLocalization.c) && c.a(this.d, placeLocalization.d) && c.a(this.e, placeLocalization.e) && c.a(this.f, placeLocalization.f);
    }

    public int hashCode() {
        return c.a(this.b, this.c, this.d, this.e);
    }

    public String toString() {
        return c.a((Object) this).a(User.FN_NAME, this.b).a("address", this.c).a("internationalPhoneNumber", this.d).a("regularOpenHours", this.e).a("attributions", this.f).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        o oVar = CREATOR;
        o.a(this, parcel, i);
    }
}
