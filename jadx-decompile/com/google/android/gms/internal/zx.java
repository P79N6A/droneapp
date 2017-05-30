package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.ads.internal.formats.c;
import com.google.android.gms.ads.internal.formats.e;
import com.google.android.gms.ads.internal.formats.i;
import com.google.android.gms.internal.zu.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import org.json.JSONObject;

@aaa
public class zx implements a<e> {
    private final boolean a;
    private final boolean b;

    public zx(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public /* synthetic */ i.a a(zu zuVar, JSONObject jSONObject) {
        return b(zuVar, jSONObject);
    }

    public e b(zu zuVar, JSONObject jSONObject) {
        List<aco> a = zuVar.a(jSONObject, com.fimi.kernel.a.b, true, this.a, this.b);
        Future a2 = zuVar.a(jSONObject, "secondary_image", false, this.a);
        Future b = zuVar.b(jSONObject);
        List arrayList = new ArrayList();
        for (aco com_google_android_gms_internal_aco : a) {
            arrayList.add((c) com_google_android_gms_internal_aco.get());
        }
        return new e(jSONObject.getString("headline"), arrayList, jSONObject.getString("body"), (uu) a2.get(), jSONObject.getString("call_to_action"), jSONObject.getString("advertiser"), (com.google.android.gms.ads.internal.formats.a) b.get(), new Bundle());
    }
}
