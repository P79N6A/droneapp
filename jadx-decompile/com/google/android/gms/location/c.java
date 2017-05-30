package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.List;

public class c implements Creator<ActivityRecognitionResult> {
    public static final int a = 0;

    static void a(ActivityRecognitionResult activityRecognitionResult, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.c(parcel, 1, activityRecognitionResult.a, false);
        b.a(parcel, 2, activityRecognitionResult.b);
        b.a(parcel, 3, activityRecognitionResult.c);
        b.a(parcel, 4, activityRecognitionResult.d);
        b.a(parcel, 5, activityRecognitionResult.e, false);
        b.a(parcel, 1000, activityRecognitionResult.e());
        b.a(parcel, a);
    }

    public ActivityRecognitionResult a(Parcel parcel) {
        long j = 0;
        Bundle bundle = null;
        int i = 0;
        int b = a.b(parcel);
        long j2 = 0;
        List list = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    list = a.c(parcel, a, DetectedActivity.CREATOR);
                    break;
                case 2:
                    j2 = a.i(parcel, a);
                    break;
                case 3:
                    j = a.i(parcel, a);
                    break;
                case 4:
                    i = a.g(parcel, a);
                    break;
                case 5:
                    bundle = a.s(parcel, a);
                    break;
                case 1000:
                    i2 = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ActivityRecognitionResult(i2, list, j2, j, i, bundle);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public ActivityRecognitionResult[] a(int i) {
        return new ActivityRecognitionResult[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
