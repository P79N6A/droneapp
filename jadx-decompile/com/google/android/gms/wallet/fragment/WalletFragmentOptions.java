package com.google.android.gms.wallet.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import com.google.android.gms.R;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class WalletFragmentOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<WalletFragmentOptions> CREATOR = new h();
    final int a;
    private int b;
    private int c;
    private WalletFragmentStyle d;
    private int e;

    public final class a {
        final /* synthetic */ WalletFragmentOptions a;

        private a(WalletFragmentOptions walletFragmentOptions) {
            this.a = walletFragmentOptions;
        }

        public a a(int i) {
            this.a.b = i;
            return this;
        }

        public a a(WalletFragmentStyle walletFragmentStyle) {
            this.a.d = walletFragmentStyle;
            return this;
        }

        public WalletFragmentOptions a() {
            return this.a;
        }

        public a b(int i) {
            this.a.c = i;
            return this;
        }

        public a c(int i) {
            this.a.d = new WalletFragmentStyle().a(i);
            return this;
        }

        public a d(int i) {
            this.a.e = i;
            return this;
        }
    }

    private WalletFragmentOptions() {
        this.a = 1;
        this.b = 3;
        this.d = new WalletFragmentStyle();
    }

    WalletFragmentOptions(int i, int i2, int i3, WalletFragmentStyle walletFragmentStyle, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = walletFragmentStyle;
        this.e = i4;
    }

    public static a a() {
        WalletFragmentOptions walletFragmentOptions = new WalletFragmentOptions();
        walletFragmentOptions.getClass();
        return new a();
    }

    public static WalletFragmentOptions a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.WalletFragmentOptions);
        int i = obtainStyledAttributes.getInt(R.styleable.WalletFragmentOptions_appTheme, 0);
        int i2 = obtainStyledAttributes.getInt(R.styleable.WalletFragmentOptions_environment, 1);
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.WalletFragmentOptions_fragmentStyle, 0);
        int i3 = obtainStyledAttributes.getInt(R.styleable.WalletFragmentOptions_fragmentMode, 1);
        obtainStyledAttributes.recycle();
        WalletFragmentOptions walletFragmentOptions = new WalletFragmentOptions();
        walletFragmentOptions.c = i;
        walletFragmentOptions.b = i2;
        walletFragmentOptions.d = new WalletFragmentStyle().a(resourceId);
        walletFragmentOptions.d.a(context);
        walletFragmentOptions.e = i3;
        return walletFragmentOptions;
    }

    public void a(Context context) {
        if (this.d != null) {
            this.d.a(context);
        }
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public WalletFragmentStyle d() {
        return this.d;
    }

    public int e() {
        return this.e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        h.a(this, parcel, i);
    }
}
