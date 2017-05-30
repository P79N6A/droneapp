package com.google.android.gms.auth.api.credentials.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.PasswordSpecification;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class GeneratePasswordRequest extends AbstractSafeParcelable {
    public static final Creator<GeneratePasswordRequest> CREATOR = new i();
    final int a;
    private final PasswordSpecification b;

    GeneratePasswordRequest(int i, PasswordSpecification passwordSpecification) {
        this.a = i;
        this.b = passwordSpecification;
    }

    public PasswordSpecification a() {
        return this.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.a(this, parcel, i);
    }
}
