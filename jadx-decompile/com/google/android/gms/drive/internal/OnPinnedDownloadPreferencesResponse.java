package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class OnPinnedDownloadPreferencesResponse extends AbstractSafeParcelable {
    public static final Creator<OnPinnedDownloadPreferencesResponse> CREATOR = new ae();
    final int a;
    final ParcelableTransferPreferences b;

    OnPinnedDownloadPreferencesResponse(int i, ParcelableTransferPreferences parcelableTransferPreferences) {
        this.a = i;
        this.b = parcelableTransferPreferences;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ae.a(this, parcel, i);
    }
}
