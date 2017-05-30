package com.google.android.gms.drive.events;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.List;

public class g implements Creator<CompletionEvent> {
    static void a(CompletionEvent completionEvent, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, completionEvent.e);
        b.a(parcel, 2, completionEvent.f, i, false);
        b.a(parcel, 3, completionEvent.g, false);
        b.a(parcel, 4, completionEvent.h, i, false);
        b.a(parcel, 5, completionEvent.i, i, false);
        b.a(parcel, 6, completionEvent.j, i, false);
        b.b(parcel, 7, completionEvent.k, false);
        b.a(parcel, 8, completionEvent.l);
        b.a(parcel, 9, completionEvent.m, false);
        b.a(parcel, a);
    }

    public CompletionEvent a(Parcel parcel) {
        int i = 0;
        IBinder iBinder = null;
        int b = a.b(parcel);
        List list = null;
        MetadataBundle metadataBundle = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        ParcelFileDescriptor parcelFileDescriptor2 = null;
        String str = null;
        DriveId driveId = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i2 = a.g(parcel, a);
                    break;
                case 2:
                    driveId = (DriveId) a.a(parcel, a, DriveId.CREATOR);
                    break;
                case 3:
                    str = a.q(parcel, a);
                    break;
                case 4:
                    parcelFileDescriptor2 = (ParcelFileDescriptor) a.a(parcel, a, ParcelFileDescriptor.CREATOR);
                    break;
                case 5:
                    parcelFileDescriptor = (ParcelFileDescriptor) a.a(parcel, a, ParcelFileDescriptor.CREATOR);
                    break;
                case 6:
                    metadataBundle = (MetadataBundle) a.a(parcel, a, MetadataBundle.CREATOR);
                    break;
                case 7:
                    list = a.E(parcel, a);
                    break;
                case 8:
                    i = a.g(parcel, a);
                    break;
                case 9:
                    iBinder = a.r(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new CompletionEvent(i2, driveId, str, parcelFileDescriptor2, parcelFileDescriptor, metadataBundle, list, i, iBinder);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public CompletionEvent[] a(int i) {
        return new CompletionEvent[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
