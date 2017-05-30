package com.google.firebase.auth.api.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.gc;
import com.google.android.gms.internal.om;

public class ProviderUserInfo extends AbstractSafeParcelable {
    public static final Creator<ProviderUserInfo> CREATOR = new e();
    @gc
    public final int a;
    @om(a = "federatedId")
    private String b;
    @om(a = "displayName")
    private String c;
    @om(a = "photoUrl")
    private String d;
    @om(a = "providerId")
    private String e;

    public ProviderUserInfo() {
        this.a = 1;
    }

    ProviderUserInfo(int i, String str, String str2, String str3, String str4) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public String a() {
        return this.b;
    }

    @Nullable
    public String b() {
        return this.c;
    }

    @Nullable
    public String c() {
        return this.d;
    }

    @Nullable
    public Uri d() {
        return !TextUtils.isEmpty(this.d) ? Uri.parse(this.d) : null;
    }

    public String e() {
        return this.e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        e.a(this, parcel, i);
    }
}
