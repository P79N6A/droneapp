package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;

public final class ChangesAvailableEvent extends AbstractSafeParcelable implements DriveEvent {
    public static final Creator<ChangesAvailableEvent> CREATOR = new d();
    final int a;
    final String b;
    final ChangesAvailableOptions c;

    ChangesAvailableEvent(int i, String str, ChangesAvailableOptions changesAvailableOptions) {
        this.a = i;
        this.b = str;
        this.c = changesAvailableOptions;
    }

    public int a() {
        return 4;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ChangesAvailableEvent changesAvailableEvent = (ChangesAvailableEvent) obj;
        return c.a(this.c, changesAvailableEvent.c) && c.a(this.b, changesAvailableEvent.b);
    }

    public int hashCode() {
        return c.a(new Object[]{this.c, this.b});
    }

    public String toString() {
        return String.format(Locale.US, "ChangesAvailableEvent [changesAvailableOptions=%s]", new Object[]{this.c});
    }

    public void writeToParcel(Parcel parcel, int i) {
        d.a(this, parcel, i);
    }
}
