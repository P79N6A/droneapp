package com.google.android.gms.auth.api.credentials.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class h implements Creator<DeleteRequest> {
    static void a(DeleteRequest deleteRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, deleteRequest.a(), i, false);
        b.a(parcel, 1000, deleteRequest.a);
        b.a(parcel, a);
    }

    public DeleteRequest a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        Credential credential = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    credential = (Credential) a.a(parcel, a, Credential.CREATOR);
                    break;
                case 1000:
                    i = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new DeleteRequest(i, credential);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public DeleteRequest[] a(int i) {
        return new DeleteRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
