package com.google.android.gms.games.achievement;

import android.content.Intent;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.m;

public interface c {

    public interface a extends k, m {
        a c();
    }

    public interface b extends m {
        String b();
    }

    Intent a(g gVar);

    i<a> a(g gVar, boolean z);

    void a(g gVar, String str);

    void a(g gVar, String str, int i);

    i<b> b(g gVar, String str);

    i<b> b(g gVar, String str, int i);

    void c(g gVar, String str);

    void c(g gVar, String str, int i);

    i<b> d(g gVar, String str);

    i<b> d(g gVar, String str, int i);
}
