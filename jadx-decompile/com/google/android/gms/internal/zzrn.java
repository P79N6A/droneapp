package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.util.ArrayMap;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

public final class zzrn extends Fragment implements aik {
    private static WeakHashMap<FragmentActivity, WeakReference<zzrn>> a = new WeakHashMap();
    private Map<String, aij> b = new ArrayMap();
    private int c = 0;
    private Bundle d;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.zzrn a(android.support.v4.app.FragmentActivity r3) {
        /*
        r0 = a;
        r0 = r0.get(r3);
        r0 = (java.lang.ref.WeakReference) r0;
        if (r0 == 0) goto L_0x0013;
    L_0x000a:
        r0 = r0.get();
        r0 = (com.google.android.gms.internal.zzrn) r0;
        if (r0 == 0) goto L_0x0013;
    L_0x0012:
        return r0;
    L_0x0013:
        r0 = r3.getSupportFragmentManager();	 Catch:{ ClassCastException -> 0x0048 }
        r1 = "SupportLifecycleFragmentImpl";
        r0 = r0.findFragmentByTag(r1);	 Catch:{ ClassCastException -> 0x0048 }
        r0 = (com.google.android.gms.internal.zzrn) r0;	 Catch:{ ClassCastException -> 0x0048 }
        if (r0 == 0) goto L_0x0027;
    L_0x0021:
        r1 = r0.isRemoving();
        if (r1 == 0) goto L_0x003d;
    L_0x0027:
        r0 = new com.google.android.gms.internal.zzrn;
        r0.<init>();
        r1 = r3.getSupportFragmentManager();
        r1 = r1.beginTransaction();
        r2 = "SupportLifecycleFragmentImpl";
        r1 = r1.add(r0, r2);
        r1.commitAllowingStateLoss();
    L_0x003d:
        r1 = a;
        r2 = new java.lang.ref.WeakReference;
        r2.<init>(r0);
        r1.put(r3, r2);
        goto L_0x0012;
    L_0x0048:
        r0 = move-exception;
        r1 = new java.lang.IllegalStateException;
        r2 = "Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl";
        r1.<init>(r2, r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzrn.a(android.support.v4.app.FragmentActivity):com.google.android.gms.internal.zzrn");
    }

    private void b(final String str, @NonNull final aij com_google_android_gms_internal_aij) {
        if (this.c > 0) {
            new Handler(Looper.getMainLooper()).post(new Runnable(this) {
                final /* synthetic */ zzrn c;

                public void run() {
                    if (this.c.c >= 1) {
                        com_google_android_gms_internal_aij.a(this.c.d != null ? this.c.d.getBundle(str) : null);
                    }
                    if (this.c.c >= 2) {
                        com_google_android_gms_internal_aij.b();
                    }
                    if (this.c.c >= 3) {
                        com_google_android_gms_internal_aij.a();
                    }
                    if (this.c.c >= 4) {
                        com_google_android_gms_internal_aij.f();
                    }
                }
            });
        }
    }

    public /* synthetic */ Activity a() {
        return b();
    }

    public <T extends aij> T a(String str, Class<T> cls) {
        return (aij) cls.cast(this.b.get(str));
    }

    public void a(String str, @NonNull aij com_google_android_gms_internal_aij) {
        if (this.b.containsKey(str)) {
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 59).append("LifecycleCallback with tag ").append(str).append(" already added to this fragment.").toString());
        }
        this.b.put(str, com_google_android_gms_internal_aij);
        b(str, com_google_android_gms_internal_aij);
    }

    public FragmentActivity b() {
        return getActivity();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (aij a : this.b.values()) {
            a.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (aij a : this.b.values()) {
            a.a(i, i2, intent);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.c = 1;
        this.d = bundle;
        for (Entry entry : this.b.entrySet()) {
            ((aij) entry.getValue()).a(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public void onDestroy() {
        super.onStop();
        this.c = 4;
        for (aij f : this.b.values()) {
            f.f();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Entry entry : this.b.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((aij) entry.getValue()).b(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public void onStart() {
        super.onStop();
        this.c = 2;
        for (aij b : this.b.values()) {
            b.b();
        }
    }

    public void onStop() {
        super.onStop();
        this.c = 3;
        for (aij a : this.b.values()) {
            a.a();
        }
    }
}
