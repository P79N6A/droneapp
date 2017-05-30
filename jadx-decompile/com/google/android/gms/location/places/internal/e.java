package com.google.android.gms.location.places.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.support.annotation.Nullable;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.location.places.AddPlaceRequest;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.m;
import com.google.android.gms.location.places.y;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;
import java.util.Locale;

public class e extends w<g> {
    private final PlacesParams a;
    private final Locale e;

    public static class a extends b<e, m> {
        public e a(Context context, Looper looper, s sVar, m mVar, g.b bVar, c cVar) {
            m a = mVar == null ? new com.google.android.gms.location.places.m.a().a() : mVar;
            String packageName = context.getPackageName();
            if (a.a != null) {
                packageName = a.a;
            }
            return new e(context, looper, sVar, bVar, cVar, packageName, a);
        }
    }

    private e(Context context, Looper looper, s sVar, g.b bVar, c cVar, String str, m mVar) {
        super(context, looper, 65, sVar, bVar, cVar);
        this.e = Locale.getDefault();
        String str2 = null;
        if (sVar.b() != null) {
            str2 = sVar.b().name;
        }
        this.a = new PlacesParams(str, this.e, str2, mVar.b, mVar.c);
    }

    protected g a(IBinder iBinder) {
        return com.google.android.gms.location.places.internal.g.a.a(iBinder);
    }

    protected String a() {
        return "com.google.android.gms.location.places.GeoDataApi";
    }

    public void a(com.google.android.gms.location.places.s sVar, String str) {
        d.a(str, "placeId cannot be null");
        ((g) G()).a(str, this.a, (h) sVar);
    }

    public void a(com.google.android.gms.location.places.s sVar, String str, int i, int i2, int i3) {
        boolean z = true;
        d.a(str, "fifeUrl cannot be null");
        d.b(i > 0, "width should be > 0");
        if (i <= 0) {
            z = false;
        }
        d.b(z, "height should be > 0");
        ((g) G()).a(str, i, i2, i3, this.a, (h) sVar);
    }

    public void a(y yVar, AddPlaceRequest addPlaceRequest) {
        d.a(addPlaceRequest, "userAddedPlace == null");
        ((g) G()).a(addPlaceRequest, this.a, (i) yVar);
    }

    public void a(y yVar, String str, @Nullable LatLngBounds latLngBounds, @Nullable AutocompleteFilter autocompleteFilter) {
        d.a(yVar, "callback == null");
        ((g) G()).a(str == null ? "" : str, latLngBounds, autocompleteFilter == null ? new com.google.android.gms.location.places.AutocompleteFilter.a().a() : autocompleteFilter, this.a, (i) yVar);
    }

    public void a(y yVar, List<String> list) {
        ((g) G()).b(list, this.a, yVar);
    }

    protected /* synthetic */ IInterface b(IBinder iBinder) {
        return a(iBinder);
    }

    protected String b() {
        return "com.google.android.gms.location.places.internal.IGooglePlacesService";
    }
}
