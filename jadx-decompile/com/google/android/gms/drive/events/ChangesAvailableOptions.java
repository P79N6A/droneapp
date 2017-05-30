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

public final class ChangesAvailableOptions extends AbstractSafeParcelable {
    public static final Creator<ChangesAvailableOptions> CREATOR = new f();
    final int a;
    final int b;
    final boolean c;
    final List<DriveSpace> d;
    private final Set<DriveSpace> e;

    ChangesAvailableOptions(int i, int i2, boolean z, List<DriveSpace> list) {
        this(i, i2, z, list, list == null ? null : new HashSet(list));
    }

    private ChangesAvailableOptions(int i, int i2, boolean z, List<DriveSpace> list, Set<DriveSpace> set) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = list;
        this.e = set;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ChangesAvailableOptions changesAvailableOptions = (ChangesAvailableOptions) obj;
        return c.a(this.e, changesAvailableOptions.e) && this.b == changesAvailableOptions.b && this.c == changesAvailableOptions.c;
    }

    public int hashCode() {
        return c.a(new Object[]{this.e, Integer.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    public String toString() {
        return String.format(Locale.US, "ChangesAvailableOptions[ChangesSizeLimit=%d, Repeats=%s, Spaces=%s]", new Object[]{Integer.valueOf(this.b), Boolean.valueOf(this.c), this.d});
    }

    public void writeToParcel(Parcel parcel, int i) {
        f.a(this, parcel, i);
    }
}
