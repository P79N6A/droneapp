package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.f;
import java.util.Set;

public final class UserDataType extends AbstractSafeParcelable {
    public static final z CREATOR = new z();
    public static final UserDataType a = a("test_type", 1);
    public static final UserDataType b = a("labeled_place", 6);
    public static final UserDataType c = a("here_content", 7);
    public static final Set<UserDataType> d = f.a(a, b, c);
    final int e;
    final String f;
    final int g;

    UserDataType(int i, String str, int i2) {
        d.a(str);
        this.e = i;
        this.f = str;
        this.g = i2;
    }

    private static UserDataType a(String str, int i) {
        return new UserDataType(0, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserDataType)) {
            return false;
        }
        UserDataType userDataType = (UserDataType) obj;
        return this.f.equals(userDataType.f) && this.g == userDataType.g;
    }

    public int hashCode() {
        return this.f.hashCode();
    }

    public String toString() {
        return this.f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        z.a(this, parcel, i);
    }
}
