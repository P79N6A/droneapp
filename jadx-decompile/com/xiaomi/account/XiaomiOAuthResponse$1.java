package com.xiaomi.account;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class XiaomiOAuthResponse$1 implements Creator<XiaomiOAuthResponse> {
    XiaomiOAuthResponse$1() {
    }

    public XiaomiOAuthResponse createFromParcel(Parcel parcel) {
        return new XiaomiOAuthResponse(parcel);
    }

    public XiaomiOAuthResponse[] newArray(int i) {
        return new XiaomiOAuthResponse[i];
    }
}
