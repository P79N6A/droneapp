package com.google.android.gms.wallet.fragment;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

public final class WalletFragmentInitParams extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<WalletFragmentInitParams> CREATOR = new g();
    final int a;
    private String b;
    private MaskedWalletRequest c;
    private int d;
    private MaskedWallet e;

    public final class a {
        final /* synthetic */ WalletFragmentInitParams a;

        private a(WalletFragmentInitParams walletFragmentInitParams) {
            this.a = walletFragmentInitParams;
        }

        public a a(int i) {
            this.a.d = i;
            return this;
        }

        public a a(MaskedWallet maskedWallet) {
            this.a.e = maskedWallet;
            return this;
        }

        public a a(MaskedWalletRequest maskedWalletRequest) {
            this.a.c = maskedWalletRequest;
            return this;
        }

        public a a(String str) {
            this.a.b = str;
            return this;
        }

        public WalletFragmentInitParams a() {
            boolean z = true;
            boolean z2 = (this.a.e != null && this.a.c == null) || (this.a.e == null && this.a.c != null);
            d.a(z2, "Exactly one of MaskedWallet or MaskedWalletRequest is required");
            if (this.a.d < 0) {
                z = false;
            }
            d.a(z, "masked wallet request code is required and must be non-negative");
            return this.a;
        }
    }

    private WalletFragmentInitParams() {
        this.a = 1;
        this.d = -1;
    }

    WalletFragmentInitParams(int i, String str, MaskedWalletRequest maskedWalletRequest, int i2, MaskedWallet maskedWallet) {
        this.a = i;
        this.b = str;
        this.c = maskedWalletRequest;
        this.d = i2;
        this.e = maskedWallet;
    }

    public static a a() {
        WalletFragmentInitParams walletFragmentInitParams = new WalletFragmentInitParams();
        walletFragmentInitParams.getClass();
        return new a();
    }

    public String b() {
        return this.b;
    }

    public MaskedWalletRequest c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public MaskedWallet e() {
        return this.e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        g.a(this, parcel, i);
    }
}
