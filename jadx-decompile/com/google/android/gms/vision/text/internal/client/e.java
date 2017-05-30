package com.google.android.gms.vision.text.internal.client;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class e implements Creator<RecognitionOptions> {
    static void a(RecognitionOptions recognitionOptions, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, recognitionOptions.a);
        b.a(parcel, 2, recognitionOptions.b, i, false);
        b.a(parcel, a);
    }

    public RecognitionOptions a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        Rect rect = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    rect = (Rect) a.a(parcel, a, Rect.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new RecognitionOptions(i, rect);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public RecognitionOptions[] a(int i) {
        return new RecognitionOptions[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
