package com.google.android.gms.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.common.util.s;

@aaa
public class zn {
    public abx a(Context context, a aVar, abi.a aVar2, ro roVar, @Nullable acy com_google_android_gms_internal_acy, xq xqVar, a aVar3, un unVar) {
        AdResponseParcel adResponseParcel = aVar2.b;
        abx zrVar = adResponseParcel.h ? new zr(context, aVar2, xqVar, aVar3, unVar, com_google_android_gms_internal_acy) : (adResponseParcel.t || (aVar instanceof q)) ? (adResponseParcel.t && (aVar instanceof q)) ? new zs(context, (q) aVar, aVar2, roVar, aVar3, unVar) : new zp(aVar2, aVar3) : adResponseParcel.p ? new zl(context, aVar2, com_google_android_gms_internal_acy, aVar3) : (((Boolean) uf.ab.c()).booleanValue() && s.h() && !s.j() && com_google_android_gms_internal_acy != null && com_google_android_gms_internal_acy.k().e) ? new zq(context, aVar2, com_google_android_gms_internal_acy, aVar3) : new zo(context, aVar2, com_google_android_gms_internal_acy, aVar3);
        String str = "AdRenderer: ";
        String valueOf = String.valueOf(zrVar.getClass().getName());
        b.a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        zrVar.e();
        return zrVar;
    }

    public abx a(Context context, abi.a aVar, aau com_google_android_gms_internal_aau) {
        abx com_google_android_gms_internal_abb = new abb(context, aVar, com_google_android_gms_internal_aau);
        String str = "AdRenderer: ";
        String valueOf = String.valueOf(com_google_android_gms_internal_abb.getClass().getName());
        b.a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        com_google_android_gms_internal_abb.e();
        return com_google_android_gms_internal_abb;
    }
}
