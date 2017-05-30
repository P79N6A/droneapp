package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.events.internal.TransferProgressData;
import java.util.List;

public final class TransferStateEvent extends AbstractSafeParcelable implements DriveEvent {
    public static final Creator<TransferStateEvent> CREATOR = new r();
    final int a;
    final String b;
    final List<TransferProgressData> c;

    TransferStateEvent(int i, String str, List<TransferProgressData> list) {
        this.a = i;
        this.b = str;
        this.c = list;
    }

    public int a() {
        return 7;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        TransferStateEvent transferStateEvent = (TransferStateEvent) obj;
        return c.a(this.b, transferStateEvent.b) && c.a(this.c, transferStateEvent.c);
    }

    public int hashCode() {
        return c.a(new Object[]{this.b, this.c});
    }

    public String toString() {
        return String.format("TransferStateEvent[%s]", new Object[]{TextUtils.join("','", this.c)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        r.a(this, parcel, i);
    }
}
