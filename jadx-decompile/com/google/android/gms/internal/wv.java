package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.d;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Future;

@aaa
public class wv {
    private wu a(Context context, VersionInfoParcel versionInfoParcel, a<wu> aVar, ro roVar, d dVar) {
        wu wwVar = new ww(context, versionInfoParcel, roVar, dVar);
        aVar.a = wwVar;
        wwVar.a(new 2(this, aVar));
        return wwVar;
    }

    public Future<wu> a(Context context, VersionInfoParcel versionInfoParcel, String str, ro roVar, d dVar) {
        Future aVar = new a(null);
        abv.a.post(new 1(this, context, versionInfoParcel, aVar, roVar, dVar, str));
        return aVar;
    }
}
