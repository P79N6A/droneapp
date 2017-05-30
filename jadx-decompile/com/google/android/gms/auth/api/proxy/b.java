package com.google.android.gms.auth.api.proxy;

import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;

public interface b {

    public interface a extends m {
        ProxyResponse b();
    }

    i<a> a(g gVar, ProxyRequest proxyRequest);
}
