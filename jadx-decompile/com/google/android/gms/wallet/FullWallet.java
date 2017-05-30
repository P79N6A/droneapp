package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

public final class FullWallet extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<FullWallet> CREATOR = new j();
    String a;
    String b;
    ProxyCard c;
    String d;
    Address e;
    Address f;
    String[] g;
    UserAddress h;
    UserAddress i;
    InstrumentInfo[] j;
    PaymentMethodToken k;
    private final int l;

    private FullWallet() {
        this.l = 1;
    }

    FullWallet(int i, String str, String str2, ProxyCard proxyCard, String str3, Address address, Address address2, String[] strArr, UserAddress userAddress, UserAddress userAddress2, InstrumentInfo[] instrumentInfoArr, PaymentMethodToken paymentMethodToken) {
        this.l = i;
        this.a = str;
        this.b = str2;
        this.c = proxyCard;
        this.d = str3;
        this.e = address;
        this.f = address2;
        this.g = strArr;
        this.h = userAddress;
        this.i = userAddress2;
        this.j = instrumentInfoArr;
        this.k = paymentMethodToken;
    }

    public int a() {
        return this.l;
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public ProxyCard d() {
        return this.c;
    }

    public String e() {
        return this.d;
    }

    public String[] f() {
        return this.g;
    }

    public UserAddress g() {
        return this.h;
    }

    public UserAddress h() {
        return this.i;
    }

    public InstrumentInfo[] i() {
        return this.j;
    }

    public PaymentMethodToken j() {
        return this.k;
    }

    public void writeToParcel(Parcel parcel, int i) {
        j.a(this, parcel, i);
    }
}
