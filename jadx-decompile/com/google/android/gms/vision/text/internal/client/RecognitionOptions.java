package com.google.android.gms.vision.text.internal.client;

import android.graphics.Rect;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class RecognitionOptions extends AbstractSafeParcelable {
    public static final e CREATOR = new e();
    final int a;
    public final Rect b;

    public RecognitionOptions() {
        this.a = 1;
        this.b = new Rect();
    }

    public RecognitionOptions(int i, Rect rect) {
        this.a = i;
        this.b = rect;
    }

    public void writeToParcel(Parcel parcel, int i) {
        e.a(this, parcel, i);
    }
}
