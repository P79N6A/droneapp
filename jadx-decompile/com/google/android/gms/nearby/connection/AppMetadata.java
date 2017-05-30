package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public final class AppMetadata extends AbstractSafeParcelable {
    public static final Creator<AppMetadata> CREATOR = new d();
    private final int a;
    private final List<AppIdentifier> b;

    AppMetadata(int i, List<AppIdentifier> list) {
        this.a = i;
        this.b = (List) d.a(list, "Must specify application identifiers");
        d.a(list.size(), "Application identifiers cannot be empty");
    }

    public AppMetadata(List<AppIdentifier> list) {
        this(1, list);
    }

    public int a() {
        return this.a;
    }

    public List<AppIdentifier> b() {
        return this.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        d.a(this, parcel, i);
    }
}
