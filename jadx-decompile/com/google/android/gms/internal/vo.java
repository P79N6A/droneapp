package com.google.android.gms.internal;

import com.fimi.soul.entity.User;
import com.google.android.gms.ads.internal.util.client.b;
import com.xiaomi.market.sdk.j;
import java.util.Map;

@aaa
public final class vo implements vt {
    private final vp a;

    public vo(vp vpVar) {
        this.a = vpVar;
    }

    public void a(acy com_google_android_gms_internal_acy, Map<String, String> map) {
        String str = (String) map.get(User.FN_NAME);
        if (str == null) {
            b.d("App event with no name parameter.");
        } else {
            this.a.a(str, (String) map.get(j.ag));
        }
    }
}
