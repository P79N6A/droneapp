package com.google.android.gms.vision.text.internal.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class TextRecognizerOptions extends AbstractSafeParcelable {
    public static final h CREATOR = new h();
    final int a;

    public TextRecognizerOptions() {
        this.a = 1;
    }

    public TextRecognizerOptions(int i) {
        this.a = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        h.a(this, parcel, i);
    }
}
