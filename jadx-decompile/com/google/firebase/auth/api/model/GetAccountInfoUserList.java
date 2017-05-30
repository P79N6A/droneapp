package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.gc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GetAccountInfoUserList extends AbstractSafeParcelable {
    public static final Creator<GetAccountInfoUserList> CREATOR = new c();
    @gc
    public final int a;
    private List<GetAccountInfoUser> b;

    public GetAccountInfoUserList() {
        this.a = 1;
        this.b = new ArrayList();
    }

    GetAccountInfoUserList(int i, List<GetAccountInfoUser> list) {
        this.a = i;
        this.b = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
    }

    public List<GetAccountInfoUser> a() {
        return this.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        c.a(this, parcel, i);
    }
}
