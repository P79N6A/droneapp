package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.MainThread;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class aij {
    protected final aik d;

    protected aij(aik com_google_android_gms_internal_aik) {
        this.d = com_google_android_gms_internal_aik;
    }

    protected static aik b(Activity activity) {
        return b(new aih(activity));
    }

    protected static aik b(aih com_google_android_gms_internal_aih) {
        return com_google_android_gms_internal_aih.a() ? zzrn.a(com_google_android_gms_internal_aih.c()) : zzrc.a(com_google_android_gms_internal_aih.b());
    }

    @MainThread
    public void a() {
    }

    @MainThread
    public void a(int i, int i2, Intent intent) {
    }

    @MainThread
    public void a(Bundle bundle) {
    }

    @MainThread
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @MainThread
    public void b() {
    }

    @MainThread
    public void b(Bundle bundle) {
    }

    public Activity e() {
        return this.d.a();
    }

    @MainThread
    public void f() {
    }
}
