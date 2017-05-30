package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public class AccountChangeEventsResponse extends AbstractSafeParcelable {
    public static final Creator<AccountChangeEventsResponse> CREATOR = new h();
    final int a;
    final List<AccountChangeEvent> b;

    AccountChangeEventsResponse(int i, List<AccountChangeEvent> list) {
        this.a = i;
        this.b = (List) d.a((Object) list);
    }

    public AccountChangeEventsResponse(List<AccountChangeEvent> list) {
        this.a = 1;
        this.b = (List) d.a((Object) list);
    }

    public List<AccountChangeEvent> a() {
        return this.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        h.a(this, parcel, i);
    }
}
