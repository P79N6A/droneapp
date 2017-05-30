package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ProviderUserInfoList extends AbstractSafeParcelable {
    public static final Creator<ProviderUserInfoList> CREATOR = new f();
    public final int a;
    private List<ProviderUserInfo> b;

    public ProviderUserInfoList() {
        this.a = 1;
        this.b = new ArrayList();
    }

    ProviderUserInfoList(int i, List<ProviderUserInfo> list) {
        this.a = i;
        if (list == null || list.isEmpty()) {
            this.b = Collections.emptyList();
        } else {
            this.b = Collections.unmodifiableList(list);
        }
    }

    public static ProviderUserInfoList a(ProviderUserInfoList providerUserInfoList) {
        Collection a = providerUserInfoList.a();
        ProviderUserInfoList providerUserInfoList2 = new ProviderUserInfoList();
        if (a != null) {
            providerUserInfoList2.a().addAll(a);
        }
        return providerUserInfoList2;
    }

    public static ProviderUserInfoList b() {
        return new ProviderUserInfoList();
    }

    public List<ProviderUserInfo> a() {
        return this.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        f.a(this, parcel, i);
    }
}
