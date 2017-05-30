package org.a.a.c.c;

import org.a.a.e;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;

class n$a extends n implements HttpEntityEnclosingRequest {
    private HttpEntity a;

    public n$a(HttpEntityEnclosingRequest httpEntityEnclosingRequest) {
        super(httpEntityEnclosingRequest, null);
        this.a = httpEntityEnclosingRequest.getEntity();
    }

    public boolean expectContinue() {
        Header firstHeader = getFirstHeader(e.w);
        return firstHeader != null && "100-continue".equalsIgnoreCase(firstHeader.getValue());
    }

    public HttpEntity getEntity() {
        return this.a;
    }

    public void setEntity(HttpEntity httpEntity) {
        this.a = httpEntity;
    }
}
