package com.google.android.gms.games.a;

import android.content.Intent;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.k;

public interface m {

    public interface a extends k, com.google.android.gms.common.api.m {
        b c();
    }

    public interface b extends com.google.android.gms.common.api.m {
        e c();
    }

    public interface c extends k, com.google.android.gms.common.api.m {
        a c();

        f d();
    }

    public interface d extends k, com.google.android.gms.common.api.m {
        n c();
    }

    Intent a(g gVar);

    Intent a(g gVar, String str);

    Intent a(g gVar, String str, int i);

    Intent a(g gVar, String str, int i, int i2);

    i<c> a(g gVar, f fVar, int i, int i2);

    i<c> a(g gVar, String str, int i, int i2, int i3);

    i<c> a(g gVar, String str, int i, int i2, int i3, boolean z);

    i<a> a(g gVar, String str, boolean z);

    i<a> a(g gVar, boolean z);

    void a(g gVar, String str, long j);

    void a(g gVar, String str, long j, String str2);

    i<b> b(g gVar, String str, int i, int i2);

    i<c> b(g gVar, String str, int i, int i2, int i3);

    i<c> b(g gVar, String str, int i, int i2, int i3, boolean z);

    i<d> b(g gVar, String str, long j);

    i<d> b(g gVar, String str, long j, String str2);
}
