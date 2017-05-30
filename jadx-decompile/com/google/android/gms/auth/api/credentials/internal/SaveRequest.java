package com.google.android.gms.auth.api.credentials.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class SaveRequest extends AbstractSafeParcelable {
    public static final Creator<SaveRequest> CREATOR = new l();
    final int a;
    private final Credential b;

    SaveRequest(int i, Credential credential) {
        this.a = i;
        this.b = credential;
    }

    public SaveRequest(Credential credential) {
        this(1, credential);
    }

    public Credential a() {
        return this.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        l.a(this, parcel, i);
    }
}
