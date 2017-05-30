package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.Contents;

public class u implements Creator<OnContentsResponse> {
    static void a(OnContentsResponse onContentsResponse, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, onContentsResponse.a);
        b.a(parcel, 2, onContentsResponse.b, i, false);
        b.a(parcel, 3, onContentsResponse.c);
        b.a(parcel, a);
    }

    public OnContentsResponse a(Parcel parcel) {
        boolean z = false;
        int b = a.b(parcel);
        Contents contents = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            Contents contents2;
            int g;
            boolean z2;
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    boolean z3 = z;
                    contents2 = contents;
                    g = a.g(parcel, a);
                    z2 = z3;
                    break;
                case 2:
                    g = i;
                    Contents contents3 = (Contents) a.a(parcel, a, Contents.CREATOR);
                    z2 = z;
                    contents2 = contents3;
                    break;
                case 3:
                    z2 = a.c(parcel, a);
                    contents2 = contents;
                    g = i;
                    break;
                default:
                    a.b(parcel, a);
                    z2 = z;
                    contents2 = contents;
                    g = i;
                    break;
            }
            i = g;
            contents = contents2;
            z = z2;
        }
        if (parcel.dataPosition() == b) {
            return new OnContentsResponse(i, contents, z);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public OnContentsResponse[] a(int i) {
        return new OnContentsResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
