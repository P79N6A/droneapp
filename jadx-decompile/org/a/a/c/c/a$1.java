package org.a.a.c.c;

import org.a.a.d.b;
import org.apache.http.conn.ClientConnectionRequest;

class a$1 implements b {
    final /* synthetic */ ClientConnectionRequest a;
    final /* synthetic */ a b;

    a$1(a aVar, ClientConnectionRequest clientConnectionRequest) {
        this.b = aVar;
        this.a = clientConnectionRequest;
    }

    public boolean a() {
        this.a.abortRequest();
        return true;
    }
}
