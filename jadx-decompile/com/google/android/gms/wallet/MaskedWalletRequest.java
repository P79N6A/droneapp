package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.CountrySpecification;
import java.util.ArrayList;
import java.util.Collection;

public final class MaskedWalletRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<MaskedWalletRequest> CREATOR = new r();
    String a;
    boolean b;
    boolean c;
    boolean d;
    String e;
    String f;
    String g;
    Cart h;
    boolean i;
    boolean j;
    CountrySpecification[] k;
    boolean l;
    boolean m;
    ArrayList<CountrySpecification> n;
    PaymentMethodTokenizationParameters o;
    ArrayList<Integer> p;
    String q;
    private final int r;

    public final class a {
        final /* synthetic */ MaskedWalletRequest a;

        private a(MaskedWalletRequest maskedWalletRequest) {
            this.a = maskedWalletRequest;
        }

        public a a(int i) {
            if (this.a.p == null) {
                this.a.p = new ArrayList();
            }
            this.a.p.add(Integer.valueOf(i));
            return this;
        }

        public a a(CountrySpecification countrySpecification) {
            if (this.a.n == null) {
                this.a.n = new ArrayList();
            }
            this.a.n.add(countrySpecification);
            return this;
        }

        public a a(Cart cart) {
            this.a.h = cart;
            return this;
        }

        public a a(PaymentMethodTokenizationParameters paymentMethodTokenizationParameters) {
            this.a.o = paymentMethodTokenizationParameters;
            return this;
        }

        public a a(String str) {
            this.a.a = str;
            return this;
        }

        public a a(Collection<CountrySpecification> collection) {
            if (collection != null) {
                if (this.a.n == null) {
                    this.a.n = new ArrayList();
                }
                this.a.n.addAll(collection);
            }
            return this;
        }

        public a a(boolean z) {
            this.a.b = z;
            return this;
        }

        public MaskedWalletRequest a() {
            return this.a;
        }

        public a b(String str) {
            this.a.e = str;
            return this;
        }

        public a b(Collection<Integer> collection) {
            if (collection != null) {
                if (this.a.p == null) {
                    this.a.p = new ArrayList();
                }
                this.a.p.addAll(collection);
            }
            return this;
        }

        public a b(boolean z) {
            this.a.c = z;
            return this;
        }

        public a c(String str) {
            this.a.f = str;
            return this;
        }

        @Deprecated
        public a c(boolean z) {
            this.a.d = z;
            return this;
        }

        public a d(String str) {
            this.a.g = str;
            return this;
        }

        @Deprecated
        public a d(boolean z) {
            this.a.j = z;
            return this;
        }

        public a e(boolean z) {
            this.a.l = z;
            return this;
        }

        public a f(boolean z) {
            this.a.m = z;
            return this;
        }
    }

    MaskedWalletRequest() {
        this.r = 3;
        this.l = true;
        this.m = true;
    }

    MaskedWalletRequest(int i, String str, boolean z, boolean z2, boolean z3, String str2, String str3, String str4, Cart cart, boolean z4, boolean z5, CountrySpecification[] countrySpecificationArr, boolean z6, boolean z7, ArrayList<CountrySpecification> arrayList, PaymentMethodTokenizationParameters paymentMethodTokenizationParameters, ArrayList<Integer> arrayList2, String str5) {
        this.r = i;
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = cart;
        this.i = z4;
        this.j = z5;
        this.k = countrySpecificationArr;
        this.l = z6;
        this.m = z7;
        this.n = arrayList;
        this.o = paymentMethodTokenizationParameters;
        this.p = arrayList2;
        this.q = str5;
    }

    public static a a() {
        MaskedWalletRequest maskedWalletRequest = new MaskedWalletRequest();
        maskedWalletRequest.getClass();
        return new a();
    }

    public int b() {
        return this.r;
    }

    public String c() {
        return this.a;
    }

    public boolean d() {
        return this.b;
    }

    public boolean e() {
        return this.c;
    }

    @Deprecated
    public boolean f() {
        return this.d;
    }

    public String g() {
        return this.e;
    }

    public String h() {
        return this.f;
    }

    public String i() {
        return this.g;
    }

    public Cart j() {
        return this.h;
    }

    @Deprecated
    public boolean k() {
        return this.j;
    }

    public CountrySpecification[] l() {
        return this.k;
    }

    public boolean m() {
        return this.l;
    }

    public boolean n() {
        return this.m;
    }

    public ArrayList<CountrySpecification> o() {
        return this.n;
    }

    public PaymentMethodTokenizationParameters p() {
        return this.o;
    }

    public ArrayList<Integer> q() {
        return this.p;
    }

    public void writeToParcel(Parcel parcel, int i) {
        r.a(this, parcel, i);
    }
}
