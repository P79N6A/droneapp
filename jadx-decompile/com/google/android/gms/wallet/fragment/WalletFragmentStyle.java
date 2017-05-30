package com.google.android.gms.wallet.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.google.android.gms.R;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class WalletFragmentStyle extends AbstractSafeParcelable {
    public static final Creator<WalletFragmentStyle> CREATOR = new i();
    final int a;
    Bundle b;
    int c;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
        public static final int a = 4;
        public static final int b = 5;
        public static final int c = 6;
        @Deprecated
        public static final int d = 1;
        @Deprecated
        public static final int e = 2;
        @Deprecated
        public static final int f = 3;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
        public static final int a = 5;
        public static final int b = 6;
        public static final int c = 7;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
        public static final int a = 0;
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 3;
        public static final int e = 4;
        public static final int f = 5;
        public static final int g = -1;
        public static final int h = -2;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
        @Deprecated
        public static final int a = 1;
        @Deprecated
        public static final int b = 2;
        public static final int c = 3;
    }

    public WalletFragmentStyle() {
        this.a = 1;
        this.b = new Bundle();
        this.b.putInt("buyButtonAppearanceDefault", 4);
        this.b.putInt("maskedWalletDetailsLogoImageTypeDefault", 3);
    }

    WalletFragmentStyle(int i, Bundle bundle, int i2) {
        this.a = i;
        this.b = bundle;
        this.c = i2;
    }

    private static int a(long j, DisplayMetrics displayMetrics) {
        int i = (int) (j >>> 32);
        int i2 = (int) j;
        switch (i) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 5;
                break;
            case 128:
                return TypedValue.complexToDimensionPixelSize(i2, displayMetrics);
            case 129:
                return i2;
            default:
                throw new IllegalStateException("Unexpected unit or type: " + i);
        }
        return Math.round(TypedValue.applyDimension(i, Float.intBitsToFloat(i2), displayMetrics));
    }

    private static long a(int i, int i2) {
        return (((long) i) << 32) | (((long) i2) & 4294967295L);
    }

    private static long a(TypedValue typedValue) {
        switch (typedValue.type) {
            case 5:
                return a(128, typedValue.data);
            case 16:
                return o(typedValue.data);
            default:
                throw new IllegalArgumentException("Unexpected dimension type: " + typedValue.type);
        }
    }

    private void a(TypedArray typedArray, int i, String str) {
        if (!this.b.containsKey(str)) {
            TypedValue peekValue = typedArray.peekValue(i);
            if (peekValue != null) {
                this.b.putLong(str, a(peekValue));
            }
        }
    }

    private void a(TypedArray typedArray, int i, String str, String str2) {
        if (!this.b.containsKey(str) && !this.b.containsKey(str2)) {
            TypedValue peekValue = typedArray.peekValue(i);
            if (peekValue == null) {
                return;
            }
            if (peekValue.type < 28 || peekValue.type > 31) {
                this.b.putInt(str2, peekValue.resourceId);
            } else {
                this.b.putInt(str, peekValue.data);
            }
        }
    }

    private void b(TypedArray typedArray, int i, String str) {
        if (!this.b.containsKey(str)) {
            TypedValue peekValue = typedArray.peekValue(i);
            if (peekValue != null) {
                this.b.putInt(str, peekValue.data);
            }
        }
    }

    private static long c(int i, float f) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return a(i, Float.floatToIntBits(f));
            default:
                throw new IllegalArgumentException("Unrecognized unit: " + i);
        }
    }

    private static long o(int i) {
        if (i >= 0) {
            return c(0, (float) i);
        }
        if (i == -1 || i == -2) {
            return a(129, i);
        }
        throw new IllegalArgumentException("Unexpected dimension value: " + i);
    }

    public int a(String str, DisplayMetrics displayMetrics, int i) {
        return this.b.containsKey(str) ? a(this.b.getLong(str), displayMetrics) : i;
    }

    public WalletFragmentStyle a(int i) {
        this.c = i;
        return this;
    }

    public WalletFragmentStyle a(int i, float f) {
        this.b.putLong("buyButtonHeight", c(i, f));
        return this;
    }

    public void a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(this.c <= 0 ? R.style.WalletFragmentDefaultStyle : this.c, R.styleable.WalletFragmentStyle);
        a(obtainStyledAttributes, R.styleable.WalletFragmentStyle_buyButtonWidth, "buyButtonWidth");
        a(obtainStyledAttributes, R.styleable.WalletFragmentStyle_buyButtonHeight, "buyButtonHeight");
        b(obtainStyledAttributes, R.styleable.WalletFragmentStyle_buyButtonText, "buyButtonText");
        b(obtainStyledAttributes, R.styleable.WalletFragmentStyle_buyButtonAppearance, "buyButtonAppearance");
        b(obtainStyledAttributes, R.styleable.WalletFragmentStyle_maskedWalletDetailsTextAppearance, "maskedWalletDetailsTextAppearance");
        b(obtainStyledAttributes, R.styleable.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance, "maskedWalletDetailsHeaderTextAppearance");
        a(obtainStyledAttributes, R.styleable.WalletFragmentStyle_maskedWalletDetailsBackground, "maskedWalletDetailsBackgroundColor", "maskedWalletDetailsBackgroundResource");
        b(obtainStyledAttributes, R.styleable.WalletFragmentStyle_maskedWalletDetailsButtonTextAppearance, "maskedWalletDetailsButtonTextAppearance");
        a(obtainStyledAttributes, R.styleable.WalletFragmentStyle_maskedWalletDetailsButtonBackground, "maskedWalletDetailsButtonBackgroundColor", "maskedWalletDetailsButtonBackgroundResource");
        b(obtainStyledAttributes, R.styleable.WalletFragmentStyle_maskedWalletDetailsLogoTextColor, "maskedWalletDetailsLogoTextColor");
        b(obtainStyledAttributes, R.styleable.WalletFragmentStyle_maskedWalletDetailsLogoImageType, "maskedWalletDetailsLogoImageType");
        obtainStyledAttributes.recycle();
    }

    public WalletFragmentStyle b(int i) {
        this.b.putInt("buyButtonText", i);
        return this;
    }

    public WalletFragmentStyle b(int i, float f) {
        this.b.putLong("buyButtonWidth", c(i, f));
        return this;
    }

    public WalletFragmentStyle c(int i) {
        this.b.putLong("buyButtonHeight", o(i));
        return this;
    }

    public WalletFragmentStyle d(int i) {
        this.b.putLong("buyButtonWidth", o(i));
        return this;
    }

    public WalletFragmentStyle e(int i) {
        this.b.putInt("buyButtonAppearance", i);
        return this;
    }

    public WalletFragmentStyle f(int i) {
        this.b.putInt("maskedWalletDetailsTextAppearance", i);
        return this;
    }

    public WalletFragmentStyle g(int i) {
        this.b.putInt("maskedWalletDetailsHeaderTextAppearance", i);
        return this;
    }

    public WalletFragmentStyle h(int i) {
        this.b.remove("maskedWalletDetailsBackgroundResource");
        this.b.putInt("maskedWalletDetailsBackgroundColor", i);
        return this;
    }

    public WalletFragmentStyle i(int i) {
        this.b.remove("maskedWalletDetailsBackgroundColor");
        this.b.putInt("maskedWalletDetailsBackgroundResource", i);
        return this;
    }

    public WalletFragmentStyle j(int i) {
        this.b.putInt("maskedWalletDetailsButtonTextAppearance", i);
        return this;
    }

    public WalletFragmentStyle k(int i) {
        this.b.remove("maskedWalletDetailsButtonBackgroundResource");
        this.b.putInt("maskedWalletDetailsButtonBackgroundColor", i);
        return this;
    }

    public WalletFragmentStyle l(int i) {
        this.b.remove("maskedWalletDetailsButtonBackgroundColor");
        this.b.putInt("maskedWalletDetailsButtonBackgroundResource", i);
        return this;
    }

    public WalletFragmentStyle m(int i) {
        this.b.putInt("maskedWalletDetailsLogoImageType", i);
        return this;
    }

    @Deprecated
    public WalletFragmentStyle n(int i) {
        this.b.putInt("maskedWalletDetailsLogoTextColor", i);
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.a(this, parcel, i);
    }
}
