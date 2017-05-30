package org.a.a.i.b;

import org.a.a.a.c;
import org.a.a.e;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.impl.client.RequestWrapper;

@Deprecated
@c
public class p extends RequestWrapper implements HttpEntityEnclosingRequest {
    private HttpEntity a;
    private boolean b;

    public p(HttpEntityEnclosingRequest httpEntityEnclosingRequest) {
        super(httpEntityEnclosingRequest);
        setEntity(httpEntityEnclosingRequest.getEntity());
    }

    public boolean expectContinue() {
        Header firstHeader = getFirstHeader(e.w);
        return firstHeader != null && "100-continue".equalsIgnoreCase(firstHeader.getValue());
    }

    public HttpEntity getEntity() {
        return this.a;
    }

    public boolean isRepeatable() {
        return this.a == null || this.a.isRepeatable() || !this.b;
    }

    public void setEntity(HttpEntity httpEntity) {
        this.a = httpEntity != null ? new a(this, httpEntity) : null;
        this.b = false;
    }
}
