package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class h implements Creator<ParticipantResult> {
    static void a(ParticipantResult participantResult, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, participantResult.b(), false);
        b.a(parcel, 2, participantResult.c());
        b.a(parcel, 3, participantResult.d());
        b.a(parcel, 1000, participantResult.a());
        b.a(parcel, a);
    }

    public ParticipantResult a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        String str = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    str = a.q(parcel, a);
                    break;
                case 2:
                    i2 = a.g(parcel, a);
                    break;
                case 3:
                    i = a.g(parcel, a);
                    break;
                case 1000:
                    i3 = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ParticipantResult(i3, str, i2, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public ParticipantResult[] a(int i) {
        return new ParticipantResult[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
