package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.List;

public class z implements Creator<RealtimeDocumentSyncRequest> {
    static void a(RealtimeDocumentSyncRequest realtimeDocumentSyncRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, realtimeDocumentSyncRequest.a);
        b.b(parcel, 2, realtimeDocumentSyncRequest.b, false);
        b.b(parcel, 3, realtimeDocumentSyncRequest.c, false);
        b.a(parcel, a);
    }

    public RealtimeDocumentSyncRequest a(Parcel parcel) {
        List list = null;
        int b = a.b(parcel);
        int i = 0;
        List list2 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    list2 = a.E(parcel, a);
                    break;
                case 3:
                    list = a.E(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new RealtimeDocumentSyncRequest(i, list2, list);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public RealtimeDocumentSyncRequest[] a(int i) {
        return new RealtimeDocumentSyncRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
