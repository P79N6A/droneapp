package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class d implements Creator<ChangesAvailableEvent> {
    static void a(ChangesAvailableEvent changesAvailableEvent, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, changesAvailableEvent.a);
        b.a(parcel, 2, changesAvailableEvent.b, false);
        b.a(parcel, 3, changesAvailableEvent.c, i, false);
        b.a(parcel, a);
    }

    public ChangesAvailableEvent a(Parcel parcel) {
        ChangesAvailableOptions changesAvailableOptions = null;
        int b = a.b(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    str = a.q(parcel, a);
                    break;
                case 3:
                    changesAvailableOptions = (ChangesAvailableOptions) a.a(parcel, a, ChangesAvailableOptions.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ChangesAvailableEvent(i, str, changesAvailableOptions);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public ChangesAvailableEvent[] a(int i) {
        return new ChangesAvailableEvent[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
