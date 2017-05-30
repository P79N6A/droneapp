package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a.c;
import com.google.android.gms.common.api.m;
import com.google.android.gms.internal.ahl.a;

public interface ahz {
    <A extends c, R extends m, T extends a<R, A>> T a(T t);

    void a();

    void a(int i);

    void a(Bundle bundle);

    void a(ConnectionResult connectionResult, com.google.android.gms.common.api.a<?> aVar, int i);

    <A extends c, T extends a<? extends m, A>> T b(T t);

    boolean b();

    void c();
}
