package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public class RealtimeDocumentSyncRequest extends AbstractSafeParcelable {
    public static final Creator<RealtimeDocumentSyncRequest> CREATOR = new z();
    final int a;
    final List<String> b;
    final List<String> c;

    RealtimeDocumentSyncRequest(int i, List<String> list, List<String> list2) {
        this.a = i;
        this.b = (List) d.a(list);
        this.c = (List) d.a(list2);
    }

    public void writeToParcel(Parcel parcel, int i) {
        z.a(this, parcel, i);
    }
}
