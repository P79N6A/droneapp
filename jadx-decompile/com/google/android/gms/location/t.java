package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.location.internal.ClientIdentity;
import java.util.List;

public class t implements Creator<ActivityTransitionRequest> {
    static void a(ActivityTransitionRequest activityTransitionRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.c(parcel, 1, activityTransitionRequest.b(), false);
        b.a(parcel, 2, activityTransitionRequest.c(), false);
        b.c(parcel, 3, activityTransitionRequest.d(), false);
        b.a(parcel, 1000, activityTransitionRequest.a());
        b.a(parcel, a);
    }

    public ActivityTransitionRequest a(Parcel parcel) {
        List list = null;
        int b = a.b(parcel);
        int i = 0;
        String str = null;
        List list2 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    list2 = a.c(parcel, a, ActivityTransition.CREATOR);
                    break;
                case 2:
                    str = a.q(parcel, a);
                    break;
                case 3:
                    list = a.c(parcel, a, ClientIdentity.CREATOR);
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
            return new ActivityTransitionRequest(i, list2, str, list);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public ActivityTransitionRequest[] a(int i) {
        return new ActivityTransitionRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
