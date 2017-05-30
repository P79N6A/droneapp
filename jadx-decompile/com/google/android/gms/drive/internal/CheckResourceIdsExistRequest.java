package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public class CheckResourceIdsExistRequest extends AbstractSafeParcelable {
    public static final Creator<CheckResourceIdsExistRequest> CREATOR = new bf();
    private final int a;
    private final List<String> b;

    CheckResourceIdsExistRequest(int i, List<String> list) {
        this.a = i;
        this.b = list;
    }

    public int a() {
        return this.a;
    }

    public List<String> b() {
        return this.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        bf.a(this, parcel, i);
    }
}
