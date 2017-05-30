package org.a.a.n;

import java.util.List;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.protocol.HttpProcessor;

public class d {
    private b<HttpRequestInterceptor> a;
    private b<HttpResponseInterceptor> b;

    d() {
    }

    public static d a() {
        return new d();
    }

    private b<HttpRequestInterceptor> c() {
        if (this.a == null) {
            this.a = new b();
        }
        return this.a;
    }

    private b<HttpResponseInterceptor> d() {
        if (this.b == null) {
            this.b = new b();
        }
        return this.b;
    }

    public d a(HttpRequestInterceptor httpRequestInterceptor) {
        if (httpRequestInterceptor != null) {
            c().a((Object) httpRequestInterceptor);
        }
        return this;
    }

    public d a(HttpResponseInterceptor httpResponseInterceptor) {
        if (httpResponseInterceptor != null) {
            d().a((Object) httpResponseInterceptor);
        }
        return this;
    }

    public d a(HttpRequestInterceptor... httpRequestInterceptorArr) {
        if (httpRequestInterceptorArr != null) {
            c().a((Object[]) httpRequestInterceptorArr);
        }
        return this;
    }

    public d a(HttpResponseInterceptor... httpResponseInterceptorArr) {
        if (httpResponseInterceptorArr != null) {
            d().a((Object[]) httpResponseInterceptorArr);
        }
        return this;
    }

    public d b(HttpRequestInterceptor httpRequestInterceptor) {
        if (httpRequestInterceptor != null) {
            c().b((Object) httpRequestInterceptor);
        }
        return this;
    }

    public d b(HttpResponseInterceptor httpResponseInterceptor) {
        if (httpResponseInterceptor != null) {
            d().b((Object) httpResponseInterceptor);
        }
        return this;
    }

    public d b(HttpRequestInterceptor... httpRequestInterceptorArr) {
        if (httpRequestInterceptorArr != null) {
            c().b((Object[]) httpRequestInterceptorArr);
        }
        return this;
    }

    public d b(HttpResponseInterceptor... httpResponseInterceptorArr) {
        if (httpResponseInterceptorArr != null) {
            d().b((Object[]) httpResponseInterceptorArr);
        }
        return this;
    }

    public HttpProcessor b() {
        List list = null;
        List a = this.a != null ? this.a.a() : null;
        if (this.b != null) {
            list = this.b.a();
        }
        return new f(a, list);
    }

    public d c(HttpRequestInterceptor httpRequestInterceptor) {
        return b(httpRequestInterceptor);
    }

    public d c(HttpResponseInterceptor httpResponseInterceptor) {
        return b(httpResponseInterceptor);
    }

    public d c(HttpRequestInterceptor... httpRequestInterceptorArr) {
        return b(httpRequestInterceptorArr);
    }

    public d c(HttpResponseInterceptor... httpResponseInterceptorArr) {
        return b(httpResponseInterceptorArr);
    }
}
