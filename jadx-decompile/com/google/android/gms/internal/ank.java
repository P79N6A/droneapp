package com.google.android.gms.internal;

import java.net.URI;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

public class ank implements apm {
    protected final HttpClient a;

    public static final class a extends HttpEntityEnclosingRequestBase {
        public a(String str) {
            setURI(URI.create(str));
        }

        public String getMethod() {
            return "PATCH";
        }
    }

    public ank(HttpClient httpClient) {
        this.a = httpClient;
    }

    private static void a(HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase, abd<?> com_google_android_gms_internal_abd_) {
        byte[] o = com_google_android_gms_internal_abd_.o();
        if (o != null) {
            httpEntityEnclosingRequestBase.setEntity(new ByteArrayEntity(o));
        }
    }

    private static void a(HttpUriRequest httpUriRequest, Map<String, String> map) {
        for (String str : map.keySet()) {
            httpUriRequest.setHeader(str, (String) map.get(str));
        }
    }

    static HttpUriRequest b(abd<?> com_google_android_gms_internal_abd_, Map<String, String> map) {
        HttpEntityEnclosingRequestBase httpPost;
        switch (com_google_android_gms_internal_abd_.a()) {
            case -1:
                byte[] k = com_google_android_gms_internal_abd_.k();
                if (k == null) {
                    return new HttpGet(com_google_android_gms_internal_abd_.c());
                }
                HttpUriRequest httpPost2 = new HttpPost(com_google_android_gms_internal_abd_.c());
                httpPost2.addHeader("Content-Type", com_google_android_gms_internal_abd_.j());
                httpPost2.setEntity(new ByteArrayEntity(k));
                return httpPost2;
            case 0:
                return new HttpGet(com_google_android_gms_internal_abd_.c());
            case 1:
                httpPost = new HttpPost(com_google_android_gms_internal_abd_.c());
                httpPost.addHeader("Content-Type", com_google_android_gms_internal_abd_.n());
                a(httpPost, (abd) com_google_android_gms_internal_abd_);
                return httpPost;
            case 2:
                httpPost = new HttpPut(com_google_android_gms_internal_abd_.c());
                httpPost.addHeader("Content-Type", com_google_android_gms_internal_abd_.n());
                a(httpPost, (abd) com_google_android_gms_internal_abd_);
                return httpPost;
            case 3:
                return new HttpDelete(com_google_android_gms_internal_abd_.c());
            case 4:
                return new HttpHead(com_google_android_gms_internal_abd_.c());
            case 5:
                return new HttpOptions(com_google_android_gms_internal_abd_.c());
            case 6:
                return new HttpTrace(com_google_android_gms_internal_abd_.c());
            case 7:
                httpPost = new a(com_google_android_gms_internal_abd_.c());
                httpPost.addHeader("Content-Type", com_google_android_gms_internal_abd_.n());
                a(httpPost, (abd) com_google_android_gms_internal_abd_);
                return httpPost;
            default:
                throw new IllegalStateException("Unknown request method.");
        }
    }

    public HttpResponse a(abd<?> com_google_android_gms_internal_abd_, Map<String, String> map) {
        HttpUriRequest b = b(com_google_android_gms_internal_abd_, map);
        a(b, (Map) map);
        a(b, com_google_android_gms_internal_abd_.g());
        a(b);
        HttpParams params = b.getParams();
        int r = com_google_android_gms_internal_abd_.r();
        HttpConnectionParams.setConnectionTimeout(params, 5000);
        HttpConnectionParams.setSoTimeout(params, r);
        return this.a.execute(b);
    }

    protected void a(HttpUriRequest httpUriRequest) {
    }
}
