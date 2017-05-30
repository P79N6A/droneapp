package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class OnDeviceUsagePreferenceResponse extends AbstractSafeParcelable {
    public static final Creator<OnDeviceUsagePreferenceResponse> CREATOR = new v();
    final int a;
    final FileUploadPreferencesImpl b;

    OnDeviceUsagePreferenceResponse(int i, FileUploadPreferencesImpl fileUploadPreferencesImpl) {
        this.a = i;
        this.b = fileUploadPreferencesImpl;
    }

    public FileUploadPreferencesImpl a() {
        return this.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        v.a(this, parcel, i);
    }
}
