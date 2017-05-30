package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class e implements Creator<SafeParcelResponse> {
    static void a(SafeParcelResponse safeParcelResponse, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, safeParcelResponse.a());
        b.a(parcel, 2, safeParcelResponse.b(), false);
        b.a(parcel, 3, safeParcelResponse.f(), i, false);
        b.a(parcel, a);
    }

    public SafeParcelResponse a(Parcel parcel) {
        FieldMappingDictionary fieldMappingDictionary = null;
        int b = a.b(parcel);
        int i = 0;
        Parcel parcel2 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    parcel2 = a.F(parcel, a);
                    break;
                case 3:
                    fieldMappingDictionary = (FieldMappingDictionary) a.a(parcel, a, FieldMappingDictionary.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new SafeParcelResponse(i, parcel2, fieldMappingDictionary);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public SafeParcelResponse[] a(int i) {
        return new SafeParcelResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
