package com.google.android.gms.internal;

import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.auth.api.proxy.b.a;
import com.google.android.gms.common.api.Status;

class afa implements a {
    private Status a;
    private ProxyResponse b;

    public afa(ProxyResponse proxyResponse) {
        this.b = proxyResponse;
        this.a = Status.a;
    }

    public afa(Status status) {
        this.a = status;
    }

    public Status a() {
        return this.a;
    }

    public ProxyResponse b() {
        return this.b;
    }
}
