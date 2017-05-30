package org.a.a.i.f;

import org.a.a.a.b;
import org.apache.http.HttpException;
import org.apache.http.HttpResponse;

@b
public class n extends HttpException {
    private static final long serialVersionUID = -8646722842745617323L;
    private final HttpResponse a;

    public n(String str, HttpResponse httpResponse) {
        super(str);
        this.a = httpResponse;
    }

    public HttpResponse a() {
        return this.a;
    }
}
