package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.internal.d;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.c.a;

final class al implements a {
    private final String e;
    private final a f;

    al(String str, a aVar) {
        this.e = (String) d.a(str);
        this.f = (a) d.a(aVar);
    }

    public void a(Channel channel) {
        this.f.a(channel);
    }

    public void a(Channel channel, int i, int i2) {
        this.f.a(channel, i, i2);
    }

    public void b(Channel channel, int i, int i2) {
        this.f.b(channel, i, i2);
    }

    public void c(Channel channel, int i, int i2) {
        this.f.c(channel, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al)) {
            return false;
        }
        al alVar = (al) obj;
        return this.f.equals(alVar.f) && this.e.equals(alVar.e);
    }

    public int hashCode() {
        return (this.e.hashCode() * 31) + this.f.hashCode();
    }
}
