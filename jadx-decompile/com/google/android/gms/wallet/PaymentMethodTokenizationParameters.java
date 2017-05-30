package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class PaymentMethodTokenizationParameters extends AbstractSafeParcelable {
    public static final Creator<PaymentMethodTokenizationParameters> CREATOR = new v();
    int a;
    Bundle b;
    private final int c;

    public final class a {
        final /* synthetic */ PaymentMethodTokenizationParameters a;

        private a(PaymentMethodTokenizationParameters paymentMethodTokenizationParameters) {
            this.a = paymentMethodTokenizationParameters;
        }

        public a a(int i) {
            this.a.a = i;
            return this;
        }

        public a a(String str, String str2) {
            d.a(str, "Tokenization parameter name must not be empty");
            d.a(str2, "Tokenization parameter value must not be empty");
            this.a.b.putString(str, str2);
            return this;
        }

        public PaymentMethodTokenizationParameters a() {
            return this.a;
        }
    }

    private PaymentMethodTokenizationParameters() {
        this.b = new Bundle();
        this.c = 1;
    }

    PaymentMethodTokenizationParameters(int i, int i2, Bundle bundle) {
        this.b = new Bundle();
        this.c = i;
        this.a = i2;
        this.b = bundle;
    }

    public static a a() {
        PaymentMethodTokenizationParameters paymentMethodTokenizationParameters = new PaymentMethodTokenizationParameters();
        paymentMethodTokenizationParameters.getClass();
        return new a();
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.a;
    }

    public Bundle d() {
        return new Bundle(this.b);
    }

    public void writeToParcel(Parcel parcel, int i) {
        v.a(this, parcel, i);
    }
}
