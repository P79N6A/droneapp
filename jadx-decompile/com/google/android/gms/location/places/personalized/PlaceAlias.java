package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.tencent.mm.sdk.contact.RContact;

@Deprecated
public class PlaceAlias extends AbstractSafeParcelable {
    public static final d CREATOR = new d();
    public static final PlaceAlias a = new PlaceAlias(0, "Home");
    public static final PlaceAlias b = new PlaceAlias(0, "Work");
    final int c;
    private final String d;

    PlaceAlias(int i, String str) {
        this.c = i;
        this.d = str;
    }

    public String a() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceAlias)) {
            return false;
        }
        return c.a(this.d, ((PlaceAlias) obj).d);
    }

    public int hashCode() {
        return c.a(this.d);
    }

    public String toString() {
        return c.a((Object) this).a(RContact.COL_ALIAS, this.d).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        d.a(this, parcel, i);
    }
}
