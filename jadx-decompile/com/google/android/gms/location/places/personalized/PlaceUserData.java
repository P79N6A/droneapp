package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

@Deprecated
public class PlaceUserData extends AbstractSafeParcelable {
    public static final f CREATOR = new f();
    final int a;
    private final String b;
    private final String c;
    private final List<PlaceAlias> d;

    PlaceUserData(int i, String str, String str2, List<PlaceAlias> list) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = list;
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public List<PlaceAlias> c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceUserData)) {
            return false;
        }
        PlaceUserData placeUserData = (PlaceUserData) obj;
        return this.b.equals(placeUserData.b) && this.c.equals(placeUserData.c) && this.d.equals(placeUserData.d);
    }

    public int hashCode() {
        return c.a(this.b, this.c, this.d);
    }

    public String toString() {
        return c.a((Object) this).a("accountName", this.b).a("placeId", this.c).a("placeAliases", this.d).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        f.a(this, parcel, i);
    }
}
