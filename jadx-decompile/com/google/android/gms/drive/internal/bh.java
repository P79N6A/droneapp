package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.Contents;

public class bh implements Creator<CloseContentsRequest> {
    static void a(CloseContentsRequest closeContentsRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, closeContentsRequest.a);
        b.a(parcel, 2, closeContentsRequest.b, i, false);
        b.a(parcel, 3, closeContentsRequest.c, false);
        b.a(parcel, 4, closeContentsRequest.d);
        b.a(parcel, a);
    }

    public CloseContentsRequest a(Parcel parcel) {
        Boolean bool = null;
        int i = 0;
        int b = a.b(parcel);
        Contents contents = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            Boolean bool2;
            Contents contents2;
            int g;
            int a = a.a(parcel);
            int i3;
            switch (a.a(a)) {
                case 1:
                    i3 = i;
                    bool2 = bool;
                    contents2 = contents;
                    g = a.g(parcel, a);
                    a = i3;
                    break;
                case 2:
                    g = i2;
                    Boolean bool3 = bool;
                    contents2 = (Contents) a.a(parcel, a, Contents.CREATOR);
                    a = i;
                    bool2 = bool3;
                    break;
                case 3:
                    contents2 = contents;
                    g = i2;
                    i3 = i;
                    bool2 = a.d(parcel, a);
                    a = i3;
                    break;
                case 4:
                    a = a.g(parcel, a);
                    bool2 = bool;
                    contents2 = contents;
                    g = i2;
                    break;
                default:
                    a.b(parcel, a);
                    a = i;
                    bool2 = bool;
                    contents2 = contents;
                    g = i2;
                    break;
            }
            i2 = g;
            contents = contents2;
            bool = bool2;
            i = a;
        }
        if (parcel.dataPosition() == b) {
            return new CloseContentsRequest(i2, contents, bool, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public CloseContentsRequest[] a(int i) {
        return new CloseContentsRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
