package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.auth.api.proxy.b;
import com.google.android.gms.auth.api.proxy.b.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.d;

public class aez implements b {
    public i<a> a(g gVar, final ProxyRequest proxyRequest) {
        d.a(gVar);
        d.a(proxyRequest);
        return gVar.b(new aey(this, gVar) {
            final /* synthetic */ aez b;

            protected void a(Context context, aex com_google_android_gms_internal_aex) {
                com_google_android_gms_internal_aex.a(new aeu(this) {
                    final /* synthetic */ AnonymousClass1 a;

                    {
                        this.a = r1;
                    }

                    public void a(ProxyResponse proxyResponse) {
                        this.a.b(new afa(proxyResponse));
                    }
                }, proxyRequest);
            }
        });
    }
}
