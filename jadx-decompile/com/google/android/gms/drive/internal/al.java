package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.query.internal.FilterHolder;

public class al implements Creator<OpenFileIntentSenderRequest> {
    static void a(OpenFileIntentSenderRequest openFileIntentSenderRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, openFileIntentSenderRequest.a);
        b.a(parcel, 2, openFileIntentSenderRequest.b, false);
        b.a(parcel, 3, openFileIntentSenderRequest.c, false);
        b.a(parcel, 4, openFileIntentSenderRequest.d, i, false);
        b.a(parcel, 5, openFileIntentSenderRequest.e, i, false);
        b.a(parcel, a);
    }

    public OpenFileIntentSenderRequest a(Parcel parcel) {
        FilterHolder filterHolder = null;
        int b = a.b(parcel);
        int i = 0;
        DriveId driveId = null;
        String[] strArr = null;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    str = a.q(parcel, a);
                    break;
                case 3:
                    strArr = a.C(parcel, a);
                    break;
                case 4:
                    driveId = (DriveId) a.a(parcel, a, DriveId.CREATOR);
                    break;
                case 5:
                    filterHolder = (FilterHolder) a.a(parcel, a, FilterHolder.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new OpenFileIntentSenderRequest(i, str, strArr, driveId, filterHolder);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public OpenFileIntentSenderRequest[] a(int i) {
        return new OpenFileIntentSenderRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
