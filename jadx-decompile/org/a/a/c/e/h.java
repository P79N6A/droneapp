package org.a.a.c.e;

import com.baidu.tts.loopj.AsyncHttpClient;
import java.util.Locale;
import org.a.a.a.b;
import org.a.a.c.b.f;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.protocol.HttpContext;

@b
public class h implements HttpResponseInterceptor {
    public static final String a = "http.client.response.uncompressed";

    public void process(HttpResponse httpResponse, HttpContext httpContext) {
        int i = 1;
        HttpEntity entity = httpResponse.getEntity();
        if (entity != null && entity.getContentLength() != 0) {
            Header contentEncoding = entity.getContentEncoding();
            if (contentEncoding != null) {
                HeaderElement[] elements = contentEncoding.getElements();
                if (0 < elements.length) {
                    HeaderElement headerElement = elements[0];
                    String toLowerCase = headerElement.getName().toLowerCase(Locale.ENGLISH);
                    if (AsyncHttpClient.ENCODING_GZIP.equals(toLowerCase) || "x-gzip".equals(toLowerCase)) {
                        httpResponse.setEntity(new f(httpResponse.getEntity()));
                    } else if ("deflate".equals(toLowerCase)) {
                        httpResponse.setEntity(new org.a.a.c.b.b(httpResponse.getEntity()));
                    } else if (!"identity".equals(toLowerCase)) {
                        throw new HttpException("Unsupported Content-Coding: " + headerElement.getName());
                    } else {
                        return;
                    }
                }
                i = 0;
                if (i != 0) {
                    httpResponse.removeHeaders("Content-Length");
                    httpResponse.removeHeaders("Content-Encoding");
                    httpResponse.removeHeaders("Content-MD5");
                }
            }
        }
    }
}
