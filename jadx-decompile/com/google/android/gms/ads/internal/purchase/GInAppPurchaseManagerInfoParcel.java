package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.c.e.a;
import com.google.android.gms.c.f;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.yx;

@aaa
public final class GInAppPurchaseManagerInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final a CREATOR = new a();
    public final int a;
    public final k b;
    public final yx c;
    public final Context d;
    public final j e;

    GInAppPurchaseManagerInfoParcel(int i, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4) {
        this.a = i;
        this.b = (k) f.a(a.a(iBinder));
        this.c = (yx) f.a(a.a(iBinder2));
        this.d = (Context) f.a(a.a(iBinder3));
        this.e = (j) f.a(a.a(iBinder4));
    }

    public GInAppPurchaseManagerInfoParcel(Context context, k kVar, yx yxVar, j jVar) {
        this.a = 2;
        this.d = context;
        this.b = kVar;
        this.c = yxVar;
        this.e = jVar;
    }

    public static GInAppPurchaseManagerInfoParcel a(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
            bundleExtra.setClassLoader(GInAppPurchaseManagerInfoParcel.class.getClassLoader());
            return (GInAppPurchaseManagerInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
        } catch (Exception e) {
            return null;
        }
    }

    public static void a(Intent intent, GInAppPurchaseManagerInfoParcel gInAppPurchaseManagerInfoParcel) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", gInAppPurchaseManagerInfoParcel);
        intent.putExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", bundle);
    }

    IBinder a() {
        return f.a(this.e).asBinder();
    }

    IBinder b() {
        return f.a(this.b).asBinder();
    }

    IBinder c() {
        return f.a(this.c).asBinder();
    }

    IBinder d() {
        return f.a(this.d).asBinder();
    }

    public void writeToParcel(Parcel parcel, int i) {
        a.a(this, parcel, i);
    }
}
