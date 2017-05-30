package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveSpace;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public final class TransferStateOptions extends AbstractSafeParcelable {
    public static final Creator<TransferStateOptions> CREATOR = new t();
    final int a;
    final List<DriveSpace> b;
    private final Set<DriveSpace> c;

    TransferStateOptions(int i, List<DriveSpace> list) {
        this(i, list, list == null ? null : new HashSet(list));
    }

    private TransferStateOptions(int i, List<DriveSpace> list, Set<DriveSpace> set) {
        this.a = i;
        this.b = list;
        this.c = set;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return c.a(this.c, ((TransferStateOptions) obj).c);
    }

    public int hashCode() {
        return c.a(new Object[]{this.c});
    }

    public String toString() {
        return String.format(Locale.US, "TransferStateOptions[Spaces=%s]", new Object[]{this.b});
    }

    public void writeToParcel(Parcel parcel, int i) {
        t.a(this, parcel, i);
    }
}
