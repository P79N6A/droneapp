package com.google.firebase.auth.api.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.gc;
import com.google.android.gms.internal.om;
import java.util.List;

public class GetAccountInfoUser extends AbstractSafeParcelable {
    public static final Creator<GetAccountInfoUser> CREATOR = new b();
    @gc
    public final int a;
    @om(a = "localId")
    private String b;
    @om(a = "email")
    private String c;
    @om(a = "emailVerified")
    private boolean d;
    @om(a = "displayName")
    private String e;
    @om(a = "photoUrl")
    private String f;
    @om(a = "providerUserInfo")
    private ProviderUserInfoList g;
    @om(a = "passwordHash")
    private String h;

    public GetAccountInfoUser() {
        this.a = 1;
        this.g = new ProviderUserInfoList();
    }

    GetAccountInfoUser(int i, String str, String str2, boolean z, String str3, String str4, ProviderUserInfoList providerUserInfoList, String str5) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = str3;
        this.f = str4;
        this.g = providerUserInfoList == null ? ProviderUserInfoList.b() : ProviderUserInfoList.a(providerUserInfoList);
        this.h = str5;
    }

    @Nullable
    public String a() {
        return this.c;
    }

    public boolean b() {
        return this.d;
    }

    @NonNull
    public String c() {
        return this.b;
    }

    @Nullable
    public String d() {
        return this.e;
    }

    @Nullable
    public String e() {
        return this.f;
    }

    @Nullable
    public Uri f() {
        return !TextUtils.isEmpty(this.f) ? Uri.parse(this.f) : null;
    }

    @Nullable
    public String g() {
        return this.h;
    }

    @NonNull
    public List<ProviderUserInfo> h() {
        return this.g.a();
    }

    public ProviderUserInfoList i() {
        return this.g;
    }

    public void writeToParcel(Parcel parcel, int i) {
        b.a(this, parcel, i);
    }
}
