package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Parcel;
import android.util.DisplayMetrics;
import com.fimi.kernel.a;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.j;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;

@aaa
public class AdSizeParcel extends AbstractSafeParcelable {
    public static final z CREATOR = new z();
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;
    public final int g;
    public final AdSizeParcel[] h;
    public final boolean i;
    public final boolean j;
    public boolean k;

    public AdSizeParcel() {
        this(5, "interstitial_mb", 0, 0, true, 0, 0, null, false, false, false);
    }

    AdSizeParcel(int i, String str, int i2, int i3, boolean z, int i4, int i5, AdSizeParcel[] adSizeParcelArr, boolean z2, boolean z3, boolean z4) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = i4;
        this.g = i5;
        this.h = adSizeParcelArr;
        this.i = z2;
        this.j = z3;
        this.k = z4;
    }

    public AdSizeParcel(Context context, d dVar) {
        this(context, new d[]{dVar});
    }

    public AdSizeParcel(Context context, d[] dVarArr) {
        int i;
        int i2;
        d dVar = dVarArr[0];
        this.a = 5;
        this.e = false;
        this.j = dVar.e();
        if (this.j) {
            this.f = d.c.b();
            this.c = d.c.a();
        } else {
            this.f = dVar.b();
            this.c = dVar.a();
        }
        boolean z = this.f == -1;
        boolean z2 = this.c == -2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (z) {
            if (ac.a().c(context) && ac.a().d(context)) {
                this.g = a(displayMetrics) - ac.a().e(context);
            } else {
                this.g = a(displayMetrics);
            }
            double d = (double) (((float) this.g) / displayMetrics.density);
            i = (int) d;
            if (d - ((double) ((int) d)) >= 0.01d) {
                i++;
            }
            i2 = i;
        } else {
            i = this.f;
            this.g = ac.a().a(displayMetrics, this.f);
            i2 = i;
        }
        i = z2 ? c(displayMetrics) : this.c;
        this.d = ac.a().a(displayMetrics, i);
        if (z || z2) {
            this.b = i2 + "x" + i + "_as";
        } else if (this.j) {
            this.b = "320x50_mb";
        } else {
            this.b = dVar.toString();
        }
        if (dVarArr.length > 1) {
            this.h = new AdSizeParcel[dVarArr.length];
            for (int i3 = 0; i3 < dVarArr.length; i3++) {
                this.h[i3] = new AdSizeParcel(context, dVarArr[i3]);
            }
        } else {
            this.h = null;
        }
        this.i = false;
        this.k = false;
    }

    public AdSizeParcel(AdSizeParcel adSizeParcel, AdSizeParcel[] adSizeParcelArr) {
        this(5, adSizeParcel.b, adSizeParcel.c, adSizeParcel.d, adSizeParcel.e, adSizeParcel.f, adSizeParcel.g, adSizeParcelArr, adSizeParcel.i, adSizeParcel.j, adSizeParcel.k);
    }

    public static int a(DisplayMetrics displayMetrics) {
        return displayMetrics.widthPixels;
    }

    public static AdSizeParcel a() {
        return new AdSizeParcel(5, "reward_mb", 0, 0, true, 0, 0, null, false, false, false);
    }

    public static AdSizeParcel a(Context context) {
        return new AdSizeParcel(5, "320x50_mb", 0, 0, false, 0, 0, null, true, false, false);
    }

    public static int b(DisplayMetrics displayMetrics) {
        return (int) (((float) c(displayMetrics)) * displayMetrics.density);
    }

    private static int c(DisplayMetrics displayMetrics) {
        int i = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
        return i <= 400 ? 32 : i <= a.e ? 50 : 90;
    }

    public void a(boolean z) {
        this.k = z;
    }

    public d b() {
        return j.a(this.f, this.c, this.b);
    }

    public void writeToParcel(Parcel parcel, int i) {
        z.a(this, parcel, i);
    }
}
