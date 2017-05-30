package com.google.android.gms.fitness.result;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class h implements Creator<FileUriResult> {
    static void a(FileUriResult fileUriResult, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, fileUriResult.b(), i, false);
        b.a(parcel, 2, fileUriResult.a(), i, false);
        b.a(parcel, 1000, fileUriResult.c());
        b.a(parcel, a);
    }

    public FileUriResult a(Parcel parcel) {
        Status status = null;
        int b = a.b(parcel);
        int i = 0;
        Uri uri = null;
        while (parcel.dataPosition() < b) {
            int i2;
            Status status2;
            Uri uri2;
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i2 = i;
                    Uri uri3 = (Uri) a.a(parcel, a, Uri.CREATOR);
                    status2 = status;
                    uri2 = uri3;
                    break;
                case 2:
                    status2 = (Status) a.a(parcel, a, Status.CREATOR);
                    uri2 = uri;
                    i2 = i;
                    break;
                case 1000:
                    Status status3 = status;
                    uri2 = uri;
                    i2 = a.g(parcel, a);
                    status2 = status3;
                    break;
                default:
                    a.b(parcel, a);
                    status2 = status;
                    uri2 = uri;
                    i2 = i;
                    break;
            }
            i = i2;
            uri = uri2;
            status = status2;
        }
        if (parcel.dataPosition() == b) {
            return new FileUriResult(i, uri, status);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public FileUriResult[] a(int i) {
        return new FileUriResult[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
