package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.request.k.a;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.p.b;
import com.google.android.gms.common.internal.p.c;
import com.google.android.gms.internal.aaa;

@aaa
public class e extends p<k> {
    final int a;

    public e(Context context, Looper looper, b bVar, c cVar, int i) {
        super(context, looper, 8, bVar, cVar, null);
        this.a = i;
    }

    protected k a(IBinder iBinder) {
        return a.a(iBinder);
    }

    protected String a() {
        return "com.google.android.gms.ads.service.START";
    }

    protected /* synthetic */ IInterface b(IBinder iBinder) {
        return a(iBinder);
    }

    protected String b() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    public k b_() {
        return (k) super.G();
    }
}
