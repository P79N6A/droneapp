package org.a.a.c.c;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.a.a.d.b;
import org.apache.http.HttpRequest;
import org.apache.http.client.methods.AbortableHttpRequest;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ConnectionReleaseTrigger;
import org.apache.http.message.AbstractHttpMessage;
import org.apache.http.message.HeaderGroup;
import org.apache.http.params.HttpParams;

public abstract class a extends AbstractHttpMessage implements Cloneable, f, HttpRequest, AbortableHttpRequest {
    private final AtomicBoolean a = new AtomicBoolean(false);
    private final AtomicReference<b> b = new AtomicReference(null);

    protected a() {
    }

    public void a() {
        this.b.set(null);
    }

    public void a(b bVar) {
        if (!this.a.get()) {
            this.b.set(bVar);
        }
    }

    public void abort() {
        if (this.a.compareAndSet(false, true)) {
            b bVar = (b) this.b.getAndSet(null);
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    public void b() {
        b bVar = (b) this.b.getAndSet(null);
        if (bVar != null) {
            bVar.a();
        }
        this.a.set(false);
    }

    public Object clone() {
        a aVar = (a) super.clone();
        aVar.headergroup = (HeaderGroup) org.a.a.c.f.a.a(this.headergroup);
        aVar.params = (HttpParams) org.a.a.c.f.a.a(this.params);
        return aVar;
    }

    public boolean isAborted() {
        return this.a.get();
    }

    @Deprecated
    public void setConnectionRequest(ClientConnectionRequest clientConnectionRequest) {
        a(new 1(this, clientConnectionRequest));
    }

    @Deprecated
    public void setReleaseTrigger(ConnectionReleaseTrigger connectionReleaseTrigger) {
        a(new 2(this, connectionReleaseTrigger));
    }
}
