package com.google.android.gms.internal;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a.c;
import com.google.android.gms.common.api.m;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

public interface aig {

    public interface a {
        void a(int i, boolean z);

        void a(Bundle bundle);

        void a(ConnectionResult connectionResult);
    }

    ConnectionResult a(long j, TimeUnit timeUnit);

    @Nullable
    ConnectionResult a(@NonNull com.google.android.gms.common.api.a<?> aVar);

    <A extends c, R extends m, T extends com.google.android.gms.internal.ahl.a<R, A>> T a(@NonNull T t);

    void a();

    void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    boolean a(ait com_google_android_gms_internal_ait);

    ConnectionResult b();

    <A extends c, T extends com.google.android.gms.internal.ahl.a<? extends m, A>> T b(@NonNull T t);

    void c();

    boolean d();

    boolean e();

    void f();

    void g();
}
