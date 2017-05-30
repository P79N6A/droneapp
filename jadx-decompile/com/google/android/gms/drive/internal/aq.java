package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class aq implements Creator<SetFileUploadPreferencesRequest> {
    static void a(SetFileUploadPreferencesRequest setFileUploadPreferencesRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, setFileUploadPreferencesRequest.a);
        b.a(parcel, 2, setFileUploadPreferencesRequest.b, i, false);
        b.a(parcel, a);
    }

    public SetFileUploadPreferencesRequest a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        FileUploadPreferencesImpl fileUploadPreferencesImpl = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    fileUploadPreferencesImpl = (FileUploadPreferencesImpl) a.a(parcel, a, FileUploadPreferencesImpl.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new SetFileUploadPreferencesRequest(i, fileUploadPreferencesImpl);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public SetFileUploadPreferencesRequest[] a(int i) {
        return new SetFileUploadPreferencesRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
