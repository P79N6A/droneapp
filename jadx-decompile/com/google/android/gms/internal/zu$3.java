package com.google.android.gms.internal;

import com.facebook.common.util.UriUtil;
import com.google.android.gms.ads.internal.formats.f;
import java.util.Map;

class zu$3 implements vt {
    final /* synthetic */ f a;
    final /* synthetic */ zu b;

    zu$3(zu zuVar, f fVar) {
        this.b = zuVar;
        this.a = fVar;
    }

    public void a(acy com_google_android_gms_internal_acy, Map<String, String> map) {
        zu.a(this.b, this.a, (String) map.get(UriUtil.LOCAL_ASSET_SCHEME));
    }
}
