package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.DriveId;
import java.util.List;

public class s implements Creator<LoadRealtimeRequest> {
    static void a(LoadRealtimeRequest loadRealtimeRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, loadRealtimeRequest.a);
        b.a(parcel, 2, loadRealtimeRequest.b, i, false);
        b.a(parcel, 3, loadRealtimeRequest.c);
        b.b(parcel, 4, loadRealtimeRequest.d, false);
        b.a(parcel, 5, loadRealtimeRequest.e);
        b.a(parcel, 6, loadRealtimeRequest.f, i, false);
        b.a(parcel, 7, loadRealtimeRequest.g, false);
        b.a(parcel, a);
    }

    public LoadRealtimeRequest a(Parcel parcel) {
        boolean z = false;
        String str = null;
        int b = a.b(parcel);
        DataHolder dataHolder = null;
        List list = null;
        boolean z2 = false;
        DriveId driveId = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    driveId = (DriveId) a.a(parcel, a, DriveId.CREATOR);
                    break;
                case 3:
                    z2 = a.c(parcel, a);
                    break;
                case 4:
                    list = a.E(parcel, a);
                    break;
                case 5:
                    z = a.c(parcel, a);
                    break;
                case 6:
                    dataHolder = (DataHolder) a.a(parcel, a, DataHolder.CREATOR);
                    break;
                case 7:
                    str = a.q(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new LoadRealtimeRequest(i, driveId, z2, list, z, dataHolder, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public LoadRealtimeRequest[] a(int i) {
        return new LoadRealtimeRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
