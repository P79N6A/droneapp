package com.google.android.gms.plus;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.util.v;
import com.google.android.gms.plus.internal.PlusCommonExtras;
import com.google.android.gms.plus.internal.PlusSession;
import com.google.android.gms.plus.internal.e;

class c$1 extends b<e, c$a> {
    c$1() {
    }

    public int a() {
        return 2;
    }

    public e a(Context context, Looper looper, s sVar, c$a com_google_android_gms_plus_c_a, g.b bVar, c cVar) {
        if (com_google_android_gms_plus_c_a == null) {
            com_google_android_gms_plus_c_a = new c$a();
        }
        return new e(context, looper, sVar, new PlusSession(sVar.c().name, v.a(sVar.f()), (String[]) com_google_android_gms_plus_c_a.b.toArray(new String[0]), new String[0], context.getPackageName(), context.getPackageName(), null, new PlusCommonExtras()), bVar, cVar);
    }
}
