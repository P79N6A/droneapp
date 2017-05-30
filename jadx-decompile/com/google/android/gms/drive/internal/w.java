package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.DriveFileRange;
import java.util.List;

public class w implements Creator<OnDownloadProgressResponse> {
    static void a(OnDownloadProgressResponse onDownloadProgressResponse, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, onDownloadProgressResponse.a);
        b.a(parcel, 2, onDownloadProgressResponse.b);
        b.a(parcel, 3, onDownloadProgressResponse.c);
        b.a(parcel, 4, onDownloadProgressResponse.d);
        b.c(parcel, 5, onDownloadProgressResponse.e, false);
        b.a(parcel, a);
    }

    public OnDownloadProgressResponse a(Parcel parcel) {
        long j = 0;
        int i = 0;
        int b = a.b(parcel);
        List list = null;
        long j2 = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i2 = a.g(parcel, a);
                    break;
                case 2:
                    j2 = a.i(parcel, a);
                    break;
                case 3:
                    j = a.i(parcel, a);
                    break;
                case 4:
                    i = a.g(parcel, a);
                    break;
                case 5:
                    list = a.c(parcel, a, DriveFileRange.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new OnDownloadProgressResponse(i2, j2, j, i, list);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public OnDownloadProgressResponse[] a(int i) {
        return new OnDownloadProgressResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
