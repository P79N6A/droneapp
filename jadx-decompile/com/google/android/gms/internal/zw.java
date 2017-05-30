package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.ads.internal.formats.c;
import com.google.android.gms.ads.internal.formats.d;
import com.google.android.gms.ads.internal.formats.i;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.zu.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;

@aaa
public class zw implements a<d> {
    private final boolean a;
    private final boolean b;

    public zw(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    private acy a(aco<acy> com_google_android_gms_internal_aco_com_google_android_gms_internal_acy) {
        Throwable e;
        try {
            return (acy) com_google_android_gms_internal_aco_com_google_android_gms_internal_acy.get((long) ((Integer) uf.bO.c()).intValue(), TimeUnit.SECONDS);
        } catch (Throwable e2) {
            b.d("InterruptedException occurred while waiting for video to load", e2);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e3) {
            e2 = e3;
            b.d("Exception occurred while waiting for video to load", e2);
        } catch (TimeoutException e4) {
            e2 = e4;
            b.d("Exception occurred while waiting for video to load", e2);
        } catch (CancellationException e5) {
            e2 = e5;
            b.d("Exception occurred while waiting for video to load", e2);
        }
        return null;
    }

    public /* synthetic */ i.a a(zu zuVar, JSONObject jSONObject) {
        return b(zuVar, jSONObject);
    }

    public d b(zu zuVar, JSONObject jSONObject) {
        List<aco> a = zuVar.a(jSONObject, com.fimi.kernel.a.b, true, this.a, this.b);
        Future a2 = zuVar.a(jSONObject, "app_icon", true, this.a);
        aco a3 = zuVar.a(jSONObject, "video");
        Future b = zuVar.b(jSONObject);
        List arrayList = new ArrayList();
        for (aco com_google_android_gms_internal_aco : a) {
            arrayList.add((c) com_google_android_gms_internal_aco.get());
        }
        acy a4 = a(a3);
        return new d(jSONObject.getString("headline"), arrayList, jSONObject.getString("body"), (uu) a2.get(), jSONObject.getString("call_to_action"), jSONObject.optDouble("rating", -1.0d), jSONObject.optString("store"), jSONObject.optString(com.google.firebase.a.a.b.x), (com.google.android.gms.ads.internal.formats.a) b.get(), new Bundle(), a4 != null ? a4.z() : null, a4 != null ? a4.b() : null);
    }
}
