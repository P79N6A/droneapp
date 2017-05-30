package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public class AliasedPlace extends AbstractSafeParcelable {
    public static final a CREATOR = new a();
    final int a;
    private final String b;
    private final List<String> c;

    AliasedPlace(int i, @NonNull String str, @NonNull List<String> list) {
        this.a = i;
        this.b = str;
        this.c = list;
    }

    public String a() {
        return this.b;
    }

    public List<String> b() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AliasedPlace)) {
            return false;
        }
        AliasedPlace aliasedPlace = (AliasedPlace) obj;
        return this.b.equals(aliasedPlace.b) && this.c.equals(aliasedPlace.c);
    }

    public int hashCode() {
        return c.a(new Object[]{this.b, this.c});
    }

    public String toString() {
        return c.a(this).a("placeId", this.b).a("placeAliases", this.c).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        a.a(this, parcel, i);
    }
}
