package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.c.e;
import com.google.android.gms.c.f;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.aph;
import com.google.android.gms.internal.apl;
import com.google.android.gms.internal.apx;
import com.google.android.gms.tagmanager.ak.a;

@DynamiteApi
public class TagManagerApiImpl extends a {
    private apx a;

    public void initialize(e eVar, aj ajVar, af afVar) {
        this.a = apx.a((Context) f.a(eVar), ajVar, afVar);
        this.a.a();
    }

    @Deprecated
    public void preview(Intent intent, e eVar) {
        aph.b("Deprecated. Please use previewIntent instead.");
    }

    public void previewIntent(Intent intent, e eVar, e eVar2, aj ajVar, af afVar) {
        Context context = (Context) f.a(eVar);
        Context context2 = (Context) f.a(eVar2);
        this.a = apx.a(context, ajVar, afVar);
        new apl(intent, context, context2, this.a).a();
    }
}
