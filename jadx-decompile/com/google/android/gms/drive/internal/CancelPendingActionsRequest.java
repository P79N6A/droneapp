package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public class CancelPendingActionsRequest extends AbstractSafeParcelable {
    public static final Creator<CancelPendingActionsRequest> CREATOR = new bd();
    final int a;
    final List<String> b;

    CancelPendingActionsRequest(int i, List<String> list) {
        this.a = i;
        this.b = list;
    }

    public CancelPendingActionsRequest(List<String> list) {
        this(1, list);
    }

    public void writeToParcel(Parcel parcel, int i) {
        bd.a(this, parcel, i);
    }
}
