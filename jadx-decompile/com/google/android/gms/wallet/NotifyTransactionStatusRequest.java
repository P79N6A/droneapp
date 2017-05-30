package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
public final class NotifyTransactionStatusRequest extends AbstractSafeParcelable {
    public static final Creator<NotifyTransactionStatusRequest> CREATOR = new s();
    final int a;
    String b;
    int c;
    String d;

    NotifyTransactionStatusRequest() {
        this.a = 1;
    }

    NotifyTransactionStatusRequest(int i, String str, int i2, String str2) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = str2;
    }

    public static a a() {
        NotifyTransactionStatusRequest notifyTransactionStatusRequest = new NotifyTransactionStatusRequest();
        notifyTransactionStatusRequest.getClass();
        return new a(notifyTransactionStatusRequest, null);
    }

    public int b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public int d() {
        return this.c;
    }

    public String e() {
        return this.d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        s.a(this, parcel, i);
    }
}
