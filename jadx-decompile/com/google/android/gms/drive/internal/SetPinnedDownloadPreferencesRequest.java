package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class SetPinnedDownloadPreferencesRequest extends AbstractSafeParcelable {
    public static final Creator<SetPinnedDownloadPreferencesRequest> CREATOR = new ar();
    final int a;
    final ParcelableTransferPreferences b;

    SetPinnedDownloadPreferencesRequest(int i, ParcelableTransferPreferences parcelableTransferPreferences) {
        this.a = i;
        this.b = parcelableTransferPreferences;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ar.a(this, parcel, i);
    }
}
