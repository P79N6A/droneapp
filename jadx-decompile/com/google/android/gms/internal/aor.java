package com.google.android.gms.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.util.h;
import com.google.android.gms.tagmanager.af;
import com.google.android.gms.tagmanager.aj;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

public class aor {
    private final Context a;
    private final di b;
    private final ExecutorService c;
    private final ScheduledExecutorService d;
    private final aj e;
    private final af f;

    public aor(Context context, aj ajVar, af afVar) {
        this(context, ajVar, afVar, new di(context), apz.a(), apz.b());
    }

    aor(Context context, aj ajVar, af afVar, di diVar, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.a = ((Context) d.a(context)).getApplicationContext();
        this.e = (aj) d.a(ajVar);
        this.f = (af) d.a(afVar);
        this.b = (di) d.a(diVar);
        this.c = (ExecutorService) d.a(executorService);
        this.d = (ScheduledExecutorService) d.a(scheduledExecutorService);
    }

    public aoq a(String str, @Nullable String str2, @Nullable String str3) {
        return new aoq(str, str2, str3, new apq(this.a, this.e, this.f, str), this.b, this.c, this.d, this.e, h.d(), new aos(this.a, str));
    }
}
