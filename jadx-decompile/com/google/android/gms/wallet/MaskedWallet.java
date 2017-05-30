package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

public final class MaskedWallet extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<MaskedWallet> CREATOR = new q();
    String a;
    String b;
    String[] c;
    String d;
    Address e;
    Address f;
    LoyaltyWalletObject[] g;
    OfferWalletObject[] h;
    UserAddress i;
    UserAddress j;
    InstrumentInfo[] k;
    private final int l;

    public final class a {
        final /* synthetic */ MaskedWallet a;

        private a(MaskedWallet maskedWallet) {
            this.a = maskedWallet;
        }

        public a a(UserAddress userAddress) {
            this.a.i = userAddress;
            return this;
        }

        public a a(String str) {
            this.a.a = str;
            return this;
        }

        public a a(InstrumentInfo[] instrumentInfoArr) {
            this.a.k = instrumentInfoArr;
            return this;
        }

        @Deprecated
        public a a(LoyaltyWalletObject[] loyaltyWalletObjectArr) {
            this.a.g = loyaltyWalletObjectArr;
            return this;
        }

        @Deprecated
        public a a(OfferWalletObject[] offerWalletObjectArr) {
            this.a.h = offerWalletObjectArr;
            return this;
        }

        public a a(String[] strArr) {
            this.a.c = strArr;
            return this;
        }

        public MaskedWallet a() {
            return this.a;
        }

        public a b(UserAddress userAddress) {
            this.a.j = userAddress;
            return this;
        }

        public a b(String str) {
            this.a.b = str;
            return this;
        }

        public a c(String str) {
            this.a.d = str;
            return this;
        }
    }

    private MaskedWallet() {
        this.l = 2;
    }

    MaskedWallet(int i, String str, String str2, String[] strArr, String str3, Address address, Address address2, LoyaltyWalletObject[] loyaltyWalletObjectArr, OfferWalletObject[] offerWalletObjectArr, UserAddress userAddress, UserAddress userAddress2, InstrumentInfo[] instrumentInfoArr) {
        this.l = i;
        this.a = str;
        this.b = str2;
        this.c = strArr;
        this.d = str3;
        this.e = address;
        this.f = address2;
        this.g = loyaltyWalletObjectArr;
        this.h = offerWalletObjectArr;
        this.i = userAddress;
        this.j = userAddress2;
        this.k = instrumentInfoArr;
    }

    public static a a() {
        MaskedWallet maskedWallet = new MaskedWallet();
        maskedWallet.getClass();
        return new a();
    }

    public static a a(MaskedWallet maskedWallet) {
        d.a((Object) maskedWallet);
        return a().a(maskedWallet.c()).b(maskedWallet.d()).a(maskedWallet.e()).a(maskedWallet.f()).c(maskedWallet.g()).a(maskedWallet.h()).a(maskedWallet.i()).a(maskedWallet.j()).b(maskedWallet.k());
    }

    public int b() {
        return this.l;
    }

    public String c() {
        return this.a;
    }

    public String d() {
        return this.b;
    }

    public String[] e() {
        return this.c;
    }

    public InstrumentInfo[] f() {
        return this.k;
    }

    public String g() {
        return this.d;
    }

    @Deprecated
    public LoyaltyWalletObject[] h() {
        return this.g;
    }

    @Deprecated
    public OfferWalletObject[] i() {
        return this.h;
    }

    public UserAddress j() {
        return this.i;
    }

    public UserAddress k() {
        return this.j;
    }

    public void writeToParcel(Parcel parcel, int i) {
        q.a(this, parcel, i);
    }
}
