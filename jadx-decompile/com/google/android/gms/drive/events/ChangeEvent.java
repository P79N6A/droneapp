package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.Locale;

public final class ChangeEvent extends AbstractSafeParcelable implements ResourceEvent {
    public static final Creator<ChangeEvent> CREATOR = new c();
    final int a;
    final DriveId b;
    final int c;

    ChangeEvent(int i, DriveId driveId, int i2) {
        this.a = i;
        this.b = driveId;
        this.c = i2;
    }

    public int a() {
        return 1;
    }

    public DriveId b() {
        return this.b;
    }

    public boolean c() {
        return (this.c & 1) != 0;
    }

    public boolean d() {
        return (this.c & 2) != 0;
    }

    public boolean e() {
        return (this.c & 4) != 0;
    }

    public String toString() {
        return String.format(Locale.US, "ChangeEvent [id=%s,changeFlags=%x]", new Object[]{this.b, Integer.valueOf(this.c)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        c.a(this, parcel, i);
    }
}
