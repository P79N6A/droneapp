package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class FullWalletRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<FullWalletRequest> CREATOR = new k();
    String a;
    String b;
    Cart c;
    private final int d;

    public final class a {
        final /* synthetic */ FullWalletRequest a;

        private a(FullWalletRequest fullWalletRequest) {
            this.a = fullWalletRequest;
        }

        public a a(Cart cart) {
            this.a.c = cart;
            return this;
        }

        public a a(String str) {
            this.a.a = str;
            return this;
        }

        public FullWalletRequest a() {
            return this.a;
        }

        public a b(String str) {
            this.a.b = str;
            return this;
        }
    }

    FullWalletRequest() {
        this.d = 1;
    }

    FullWalletRequest(int i, String str, String str2, Cart cart) {
        this.d = i;
        this.a = str;
        this.b = str2;
        this.c = cart;
    }

    public static a a() {
        FullWalletRequest fullWalletRequest = new FullWalletRequest();
        fullWalletRequest.getClass();
        return new a();
    }

    public int b() {
        return this.d;
    }

    public String c() {
        return this.a;
    }

    public String d() {
        return this.b;
    }

    public Cart e() {
        return this.c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        k.a(this, parcel, i);
    }
}
