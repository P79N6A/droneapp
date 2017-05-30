package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.n;
import com.xiaomi.mipush.sdk.Constants;

public class MessageEventParcelable extends AbstractSafeParcelable implements n {
    public static final Creator<MessageEventParcelable> CREATOR = new ac();
    final int a;
    private final int b;
    private final String c;
    private final byte[] d;
    private final String e;

    MessageEventParcelable(int i, int i2, String str, byte[] bArr, String str2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = bArr;
        this.e = str2;
    }

    public int a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public byte[] c() {
        return this.d;
    }

    public String d() {
        return this.e;
    }

    public String toString() {
        int i = this.b;
        String str = this.c;
        String valueOf = String.valueOf(this.d == null ? "null" : Integer.valueOf(this.d.length));
        return new StringBuilder((String.valueOf(str).length() + 43) + String.valueOf(valueOf).length()).append("MessageEventParcelable[").append(i).append(Constants.ACCEPT_TIME_SEPARATOR_SP).append(str).append(", size=").append(valueOf).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        ac.a(this, parcel, i);
    }
}
