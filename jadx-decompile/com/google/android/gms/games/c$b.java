package com.google.android.gms.games;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.games.internal.d;

abstract class c$b extends b<d, c$c> {
    private c$b() {
    }

    public int a() {
        return 1;
    }

    public d a(Context context, Looper looper, s sVar, c$c com_google_android_gms_games_c_c, g.b bVar, c cVar) {
        return new d(context, looper, sVar, com_google_android_gms_games_c_c == null ? new c$c() : com_google_android_gms_games_c_c, bVar, cVar);
    }
}
