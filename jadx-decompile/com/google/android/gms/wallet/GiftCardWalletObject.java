package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

public final class GiftCardWalletObject extends AbstractSafeParcelable {
    public static final Creator<GiftCardWalletObject> CREATOR = new l();
    final int a;
    CommonWalletObject b;
    String c;
    String d;
    String e;
    long f;
    String g;
    long h;
    String i;

    GiftCardWalletObject() {
        this.b = CommonWalletObject.a().a();
        this.a = 1;
    }

    GiftCardWalletObject(int i, CommonWalletObject commonWalletObject, String str, String str2, String str3, long j, String str4, long j2, String str5) {
        this.b = CommonWalletObject.a().a();
        this.a = i;
        this.b = commonWalletObject;
        this.c = str;
        this.d = str2;
        this.f = j;
        this.g = str4;
        this.h = j2;
        this.i = str5;
        this.e = str3;
    }

    public int a() {
        return this.a;
    }

    public String b() {
        return this.b.c();
    }

    public void writeToParcel(Parcel parcel, int i) {
        l.a(this, parcel, i);
    }
}
