package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.h;
import com.google.android.gms.internal.gc;
import com.google.android.gms.internal.om;
import com.xiaomi.mistatistic.sdk.MiStatInterface;

public class GetTokenResponse extends AbstractSafeParcelable {
    public static final Creator<GetTokenResponse> CREATOR = new d();
    @gc
    public final int a;
    @om(a = "refresh_token")
    private String b;
    @om(a = "access_token")
    private String c;
    @om(a = "expires_in")
    private Long d;
    @om(a = "token_type")
    private String e;
    @om(a = "issued_at")
    private Long f;

    public GetTokenResponse() {
        this.a = 1;
        this.f = Long.valueOf(System.currentTimeMillis());
    }

    GetTokenResponse(int i, String str, String str2, Long l, String str3, Long l2) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = l;
        this.e = str3;
        this.f = l2;
    }

    public void a(@NonNull String str) {
        this.b = d.a(str);
    }

    public boolean a() {
        return h.d().a() + MiStatInterface.MIN_UPLOAD_INTERVAL < this.f.longValue() + (this.d.longValue() * 1000);
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public long d() {
        return this.d == null ? 0 : this.d.longValue();
    }

    @Nullable
    public String e() {
        return this.e;
    }

    public long f() {
        return this.f.longValue();
    }

    public void writeToParcel(Parcel parcel, int i) {
        d.a(this, parcel, i);
    }
}
