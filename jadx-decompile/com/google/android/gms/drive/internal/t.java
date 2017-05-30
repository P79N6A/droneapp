package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.ChangeSequenceNumber;
import com.google.android.gms.drive.DriveId;
import java.util.List;

public class t implements Creator<OnChangesResponse> {
    static void a(OnChangesResponse onChangesResponse, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, onChangesResponse.a);
        b.a(parcel, 2, onChangesResponse.b, i, false);
        b.c(parcel, 3, onChangesResponse.c, false);
        b.a(parcel, 4, onChangesResponse.d, i, false);
        b.a(parcel, 5, onChangesResponse.e);
        b.a(parcel, a);
    }

    public OnChangesResponse a(Parcel parcel) {
        boolean z = false;
        ChangeSequenceNumber changeSequenceNumber = null;
        int b = a.b(parcel);
        List list = null;
        DataHolder dataHolder = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    dataHolder = (DataHolder) a.a(parcel, a, DataHolder.CREATOR);
                    break;
                case 3:
                    list = a.c(parcel, a, DriveId.CREATOR);
                    break;
                case 4:
                    changeSequenceNumber = (ChangeSequenceNumber) a.a(parcel, a, ChangeSequenceNumber.CREATOR);
                    break;
                case 5:
                    z = a.c(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new OnChangesResponse(i, dataHolder, list, changeSequenceNumber, z);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public OnChangesResponse[] a(int i) {
        return new OnChangesResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
