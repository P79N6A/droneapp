package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.apf.a;
import com.google.android.gms.tagmanager.af;
import com.google.android.gms.tagmanager.aj;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public final class apy extends a {
    private final Map<String, aoq> a;
    private final ExecutorService b;
    private final aor c;
    private final aj d;

    public apy(Context context, aj ajVar, af afVar) {
        this(ajVar, new aor(context, ajVar, afVar), apz.a());
    }

    apy(aj ajVar, aor com_google_android_gms_internal_aor, ExecutorService executorService) {
        this.a = new HashMap(1);
        d.a(ajVar);
        this.d = ajVar;
        this.c = com_google_android_gms_internal_aor;
        this.b = executorService;
    }

    public void a() {
        this.a.clear();
    }

    public void a(String str, Bundle bundle, String str2, long j, boolean z) {
        final aow com_google_android_gms_internal_aow = new aow(str, bundle, str2, new Date(j), z, this.d);
        this.b.execute(new Runnable(this) {
            final /* synthetic */ apy b;

            public void run() {
                if (this.b.a.isEmpty()) {
                    aph.a("TagManagerBackend emit called without loaded container.");
                    return;
                }
                for (aoq a : this.b.a.values()) {
                    a.a(com_google_android_gms_internal_aow);
                }
            }
        });
    }

    public void a(String str, @Nullable String str2, @Nullable String str3) {
        a(str, str2, str3, null);
    }

    public void a(String str, @Nullable String str2, @Nullable String str3, @Nullable ape com_google_android_gms_internal_ape) {
        final String str4 = str;
        final String str5 = str2;
        final String str6 = str3;
        final ape com_google_android_gms_internal_ape2 = com_google_android_gms_internal_ape;
        this.b.execute(new Runnable(this) {
            final /* synthetic */ apy e;

            public void run() {
                boolean z = true;
                try {
                    if (!this.e.a.containsKey(str4)) {
                        this.e.a.put(str4, this.e.c.a(str4, str5, str6));
                    }
                } catch (Throwable th) {
                    z = false;
                }
                try {
                    if (com_google_android_gms_internal_ape2 != null) {
                        com_google_android_gms_internal_ape2.a(z, str4);
                    }
                } catch (Throwable e) {
                    aph.a("Error relaying callback", e);
                }
            }
        });
    }

    public void b() {
        this.b.execute(new Runnable(this) {
            final /* synthetic */ apy a;

            {
                this.a = r1;
            }

            public void run() {
                if (this.a.a.isEmpty()) {
                    aph.b("TagManagerBackend dispatch called without loaded container.");
                    return;
                }
                for (aoq a : this.a.a.values()) {
                    a.a();
                }
            }
        });
    }
}
