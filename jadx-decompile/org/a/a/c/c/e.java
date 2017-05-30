package org.a.a.c.c;

import org.a.a.a.c;
import org.a.a.c.f.a;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;

@c
public abstract class e extends m implements HttpEntityEnclosingRequest {
    private HttpEntity a;

    public Object clone() {
        e eVar = (e) super.clone();
        if (this.a != null) {
            eVar.a = (HttpEntity) a.a(this.a);
        }
        return eVar;
    }

    public boolean expectContinue() {
        Header firstHeader = getFirstHeader(org.a.a.e.w);
        return firstHeader != null && "100-continue".equalsIgnoreCase(firstHeader.getValue());
    }

    public HttpEntity getEntity() {
        return this.a;
    }

    public void setEntity(HttpEntity httpEntity) {
        this.a = httpEntity;
    }
}
