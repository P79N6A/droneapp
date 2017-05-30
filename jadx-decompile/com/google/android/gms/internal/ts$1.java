package com.google.android.gms.internal;

import java.util.Comparator;

class ts$1 implements Comparator<tv$a> {
    final /* synthetic */ ts a;

    ts$1(ts tsVar) {
        this.a = tsVar;
    }

    public int a(tv$a com_google_android_gms_internal_tv_a, tv$a com_google_android_gms_internal_tv_a2) {
        int i = com_google_android_gms_internal_tv_a.c - com_google_android_gms_internal_tv_a2.c;
        return i != 0 ? i : (int) (com_google_android_gms_internal_tv_a.a - com_google_android_gms_internal_tv_a2.a);
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return a((tv$a) obj, (tv$a) obj2);
    }
}
