package com.google.android.gms.location.places.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.m;
import com.google.android.gms.location.places.y;
import java.util.Locale;

public class k extends w<f> {
    private final PlacesParams a;
    private final Locale e;

    public static class a extends b<k, m> {
        public /* synthetic */ f a(Context context, Looper looper, s sVar, Object obj, g.b bVar, c cVar) {
            return a(context, looper, sVar, (m) obj, bVar, cVar);
        }

        public k a(Context context, Looper looper, s sVar, m mVar, g.b bVar, c cVar) {
            m a = mVar == null ? new com.google.android.gms.location.places.m.a().a() : mVar;
            String packageName = context.getPackageName();
            if (a.a != null) {
                packageName = a.a;
            }
            return new k(context, looper, sVar, bVar, cVar, packageName, a);
        }
    }

    private k(Context context, Looper looper, s sVar, g.b bVar, c cVar, String str, m mVar) {
        super(context, looper, 67, sVar, bVar, cVar);
        this.e = Locale.getDefault();
        String str2 = null;
        if (sVar.b() != null) {
            str2 = sVar.b().name;
        }
        this.a = new PlacesParams(str, this.e, str2, mVar.b, mVar.c);
    }

    protected f a(IBinder iBinder) {
        return com.google.android.gms.location.places.internal.f.a.a(iBinder);
    }

    protected String a() {
        return "com.google.android.gms.location.places.PlaceDetectionApi";
    }

    public void a(y yVar, PlaceFilter placeFilter) {
        if (placeFilter == null) {
            placeFilter = PlaceFilter.d();
        }
        ((f) G()).a(placeFilter, this.a, (i) yVar);
    }

    public void a(y yVar, PlaceReport placeReport) {
        d.a(placeReport);
        ((f) G()).a(placeReport, this.a, (i) yVar);
    }

    protected /* synthetic */ IInterface b(IBinder iBinder) {
        return a(iBinder);
    }

    protected String b() {
        return "com.google.android.gms.location.places.internal.IGooglePlaceDetectionService";
    }
}
