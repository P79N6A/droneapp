package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.gc;
import com.google.android.gms.internal.om;

public class VerifyAssertionRequest extends AbstractSafeParcelable {
    public static final Creator<VerifyAssertionRequest> CREATOR = new h();
    @gc
    public final int a;
    @om(a = "requestUri")
    private String b;
    @om(a = "idToken")
    private String c;
    @gc
    private String d;
    @gc
    private String e;
    @gc
    private String f;
    @Nullable
    @gc
    private String g;
    @om(a = "postBody")
    private String h;
    @om(a = "oauthTokenSecret")
    private String i;
    @om(a = "returnSecureToken")
    private boolean j;

    public VerifyAssertionRequest() {
        this.a = 2;
        this.j = true;
    }

    VerifyAssertionRequest(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = z;
    }

    public VerifyAssertionRequest(@Nullable String str, @Nullable String str2, String str3, @Nullable String str4, @Nullable String str5) {
        this.a = 2;
        this.b = "http://localhost";
        this.d = str;
        this.e = str2;
        this.i = str5;
        this.j = true;
        if (TextUtils.isEmpty(this.d) && TextUtils.isEmpty(this.e)) {
            throw new IllegalArgumentException("Both idToken, and accessToken cannot be null");
        }
        this.f = d.a(str3);
        this.g = str4;
        StringBuilder stringBuilder = new StringBuilder();
        if (!TextUtils.isEmpty(this.d)) {
            stringBuilder.append("id_token").append("=").append(this.d).append("&");
        }
        if (!TextUtils.isEmpty(this.e)) {
            stringBuilder.append("access_token").append("=").append(this.e).append("&");
        }
        if (!TextUtils.isEmpty(this.g)) {
            stringBuilder.append("identifier").append("=").append(this.g).append("&");
        }
        if (!TextUtils.isEmpty(this.i)) {
            stringBuilder.append("oauth_token_secret").append("=").append(this.i).append("&");
        }
        stringBuilder.append("providerId").append("=").append(this.f);
        this.h = stringBuilder.toString();
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public String c() {
        return this.d;
    }

    public String d() {
        return this.e;
    }

    public String e() {
        return this.f;
    }

    public String f() {
        return this.i;
    }

    public boolean g() {
        return this.j;
    }

    @Nullable
    public String h() {
        return this.g;
    }

    public String i() {
        return this.h;
    }

    public void writeToParcel(Parcel parcel, int i) {
        h.a(this, parcel, i);
    }
}
