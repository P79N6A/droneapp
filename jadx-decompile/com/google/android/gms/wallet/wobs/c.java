package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

public class c implements Creator<LabelValueRow> {
    static void a(LabelValueRow labelValueRow, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, labelValueRow.a());
        b.a(parcel, 2, labelValueRow.a, false);
        b.a(parcel, 3, labelValueRow.b, false);
        b.c(parcel, 4, labelValueRow.c, false);
        b.a(parcel, a);
    }

    public LabelValueRow a(Parcel parcel) {
        String str = null;
        int b = a.b(parcel);
        int i = 0;
        ArrayList a = com.google.android.gms.common.util.b.a();
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int a2 = a.a(parcel);
            switch (a.a(a2)) {
                case 1:
                    i = a.g(parcel, a2);
                    break;
                case 2:
                    str2 = a.q(parcel, a2);
                    break;
                case 3:
                    str = a.q(parcel, a2);
                    break;
                case 4:
                    a = a.c(parcel, a2, LabelValue.CREATOR);
                    break;
                default:
                    a.b(parcel, a2);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new LabelValueRow(i, str2, str, a);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public LabelValueRow[] a(int i) {
        return new LabelValueRow[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
