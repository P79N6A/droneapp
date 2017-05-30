package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.DriveId;

public class c implements Creator<ChangeEvent> {
    static void a(ChangeEvent changeEvent, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, changeEvent.a);
        b.a(parcel, 2, changeEvent.b, i, false);
        b.a(parcel, 3, changeEvent.c);
        b.a(parcel, a);
    }

    public ChangeEvent a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        DriveId driveId = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            DriveId driveId2;
            int g;
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    int i3 = i;
                    driveId2 = driveId;
                    g = a.g(parcel, a);
                    a = i3;
                    break;
                case 2:
                    g = i2;
                    DriveId driveId3 = (DriveId) a.a(parcel, a, DriveId.CREATOR);
                    a = i;
                    driveId2 = driveId3;
                    break;
                case 3:
                    a = a.g(parcel, a);
                    driveId2 = driveId;
                    g = i2;
                    break;
                default:
                    a.b(parcel, a);
                    a = i;
                    driveId2 = driveId;
                    g = i2;
                    break;
            }
            i2 = g;
            driveId = driveId2;
            i = a;
        }
        if (parcel.dataPosition() == b) {
            return new ChangeEvent(i2, driveId, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public ChangeEvent[] a(int i) {
        return new ChangeEvent[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
