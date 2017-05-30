package org.a.a.n;

import java.util.List;
import org.a.a.a.d;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpRequestInterceptorList;
import org.apache.http.protocol.HttpResponseInterceptorList;

@d
public final class f implements HttpProcessor {
    private final HttpRequestInterceptor[] a;
    private final HttpResponseInterceptor[] b;

    public f(List<HttpRequestInterceptor> list, List<HttpResponseInterceptor> list2) {
        if (list != null) {
            this.a = (HttpRequestInterceptor[]) list.toArray(new HttpRequestInterceptor[list.size()]);
        } else {
            this.a = new HttpRequestInterceptor[0];
        }
        if (list2 != null) {
            this.b = (HttpResponseInterceptor[]) list2.toArray(new HttpResponseInterceptor[list2.size()]);
        } else {
            this.b = new HttpResponseInterceptor[0];
        }
    }

    @Deprecated
    public f(HttpRequestInterceptorList httpRequestInterceptorList, HttpResponseInterceptorList httpResponseInterceptorList) {
        int i;
        int i2 = 0;
        if (httpRequestInterceptorList != null) {
            int requestInterceptorCount = httpRequestInterceptorList.getRequestInterceptorCount();
            this.a = new HttpRequestInterceptor[requestInterceptorCount];
            for (i = 0; i < requestInterceptorCount; i++) {
                this.a[i] = httpRequestInterceptorList.getRequestInterceptor(i);
            }
        } else {
            this.a = new HttpRequestInterceptor[0];
        }
        if (httpResponseInterceptorList != null) {
            i = httpResponseInterceptorList.getResponseInterceptorCount();
            this.b = new HttpResponseInterceptor[i];
            while (i2 < i) {
                this.b[i2] = httpResponseInterceptorList.getResponseInterceptor(i2);
                i2++;
            }
            return;
        }
        this.b = new HttpResponseInterceptor[0];
    }

    public f(HttpRequestInterceptor... httpRequestInterceptorArr) {
        this(httpRequestInterceptorArr, null);
    }

    public f(HttpRequestInterceptor[] httpRequestInterceptorArr, HttpResponseInterceptor[] httpResponseInterceptorArr) {
        if (httpRequestInterceptorArr != null) {
            int length = httpRequestInterceptorArr.length;
            this.a = new HttpRequestInterceptor[length];
            System.arraycopy(httpRequestInterceptorArr, 0, this.a, 0, length);
        } else {
            this.a = new HttpRequestInterceptor[0];
        }
        if (httpResponseInterceptorArr != null) {
            length = httpResponseInterceptorArr.length;
            this.b = new HttpResponseInterceptor[length];
            System.arraycopy(httpResponseInterceptorArr, 0, this.b, 0, length);
            return;
        }
        this.b = new HttpResponseInterceptor[0];
    }

    public f(HttpResponseInterceptor... httpResponseInterceptorArr) {
        this(null, httpResponseInterceptorArr);
    }

    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        for (HttpRequestInterceptor process : this.a) {
            process.process(httpRequest, httpContext);
        }
    }

    public void process(HttpResponse httpResponse, HttpContext httpContext) {
        for (HttpResponseInterceptor process : this.b) {
            process.process(httpResponse, httpContext);
        }
    }
}
