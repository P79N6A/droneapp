package com.google.android.gms.auth.api.credentials.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class DeleteRequest extends AbstractSafeParcelable {
    public static final Creator<DeleteRequest> CREATOR = new h();
    final int a;
    private final Credential b;

    DeleteRequest(int i, Credential credential) {
        this.a = i;
        this.b = credential;
    }

    public DeleteRequest(Credential credential) {
        this(1, credential);
    }

    public Credential a() {
        return this.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        h.a(this, parcel, i);
    }
}
