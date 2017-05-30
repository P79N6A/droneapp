package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.tagmanager.af;
import com.google.android.gms.tagmanager.aj;

public class apq {
    private final Context a;
    private final String b;
    private final aj c;
    private final af d;

    public apq(Context context, aj ajVar, af afVar, String str) {
        this.a = context.getApplicationContext();
        this.c = ajVar;
        this.d = afVar;
        this.b = str;
    }

    public app a(dv dvVar, dy dyVar) {
        return new app(this.a, this.b, dvVar, dyVar, this.c, this.d);
    }
}
