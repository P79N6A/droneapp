package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class SetFileUploadPreferencesRequest extends AbstractSafeParcelable {
    public static final Creator<SetFileUploadPreferencesRequest> CREATOR = new aq();
    final int a;
    final FileUploadPreferencesImpl b;

    SetFileUploadPreferencesRequest(int i, FileUploadPreferencesImpl fileUploadPreferencesImpl) {
        this.a = i;
        this.b = fileUploadPreferencesImpl;
    }

    public SetFileUploadPreferencesRequest(FileUploadPreferencesImpl fileUploadPreferencesImpl) {
        this(1, fileUploadPreferencesImpl);
    }

    public void writeToParcel(Parcel parcel, int i) {
        aq.a(this, parcel, i);
    }
}
