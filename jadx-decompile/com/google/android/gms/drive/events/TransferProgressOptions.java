package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;

public final class TransferProgressOptions extends AbstractSafeParcelable {
    public static final Creator<TransferProgressOptions> CREATOR = new q();
    final int a;
    final int b;

    TransferProgressOptions(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return c.a(Integer.valueOf(this.b), Integer.valueOf(((TransferProgressOptions) obj).b));
    }

    public int hashCode() {
        return c.a(new Object[]{Integer.valueOf(this.b)});
    }

    public String toString() {
        return String.format(Locale.US, "TransferProgressOptions[type=%d]", new Object[]{Integer.valueOf(this.b)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        q.a(this, parcel, i);
    }
}
