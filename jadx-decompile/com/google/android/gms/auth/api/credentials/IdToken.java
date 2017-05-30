package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.internal.b;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class IdToken extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<IdToken> CREATOR = new h();
    final int a;
    @NonNull
    private final String b;
    @NonNull
    private final String c;

    IdToken(int i, @NonNull String str, @NonNull String str2) {
        b.a(str);
        d.b(!TextUtils.isEmpty(str2), "id token string cannot be null or empty");
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public IdToken(@NonNull String str, @NonNull String str2) {
        this(1, str, str2);
    }

    @NonNull
    public String a() {
        return this.b;
    }

    @NonNull
    public String b() {
        return this.c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        h.a(this, parcel, i);
    }
}
