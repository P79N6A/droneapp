package com.android.volley.toolbox;

import com.android.volley.n;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
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
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

public class g implements i {
    private static final String b = "Content-Type";
    protected final HttpClient a;

    public static final class a extends HttpEntityEnclosingRequestBase {
        public static final String a = "PATCH";

        public a(String str) {
            setURI(URI.create(str));
        }

        public a(URI uri) {
            setURI(uri);
        }

        public String getMethod() {
            return "PATCH";
        }
    }

    public g(HttpClient httpClient) {
        this.a = httpClient;
    }

    private static List<NameValuePair> a(Map<String, String> map) {
        List<NameValuePair> arrayList = new ArrayList(map.size());
        for (String str : map.keySet()) {
            arrayList.add(new BasicNameValuePair(str, (String) map.get(str)));
        }
        return arrayList;
    }

    private static void a(HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase, n<?> nVar) {
        byte[] v = nVar.v();
        if (v != null) {
            httpEntityEnclosingRequestBase.setEntity(new ByteArrayEntity(v));
        }
    }

    private static void a(HttpUriRequest httpUriRequest, Map<String, String> map) {
        for (String str : map.keySet()) {
            httpUriRequest.setHeader(str, (String) map.get(str));
        }
    }

    static HttpUriRequest b(n<?> nVar, Map<String, String> map) {
        HttpEntityEnclosingRequestBase httpPost;
        switch (nVar.a()) {
            case -1:
                byte[] r = nVar.r();
                if (r == null) {
                    return new HttpGet(nVar.g());
                }
                HttpUriRequest httpPost2 = new HttpPost(nVar.g());
                httpPost2.addHeader("Content-Type", nVar.q());
                httpPost2.setEntity(new ByteArrayEntity(r));
                return httpPost2;
            case 0:
                return new HttpGet(nVar.g());
            case 1:
                httpPost = new HttpPost(nVar.g());
                httpPost.addHeader("Content-Type", nVar.u());
                a(httpPost, (n) nVar);
                return httpPost;
            case 2:
                httpPost = new HttpPut(nVar.g());
                httpPost.addHeader("Content-Type", nVar.u());
                a(httpPost, (n) nVar);
                return httpPost;
            case 3:
                return new HttpDelete(nVar.g());
            case 4:
                return new HttpHead(nVar.g());
            case 5:
                return new HttpOptions(nVar.g());
            case 6:
                return new HttpTrace(nVar.g());
            case 7:
                httpPost = new a(nVar.g());
                httpPost.addHeader("Content-Type", nVar.u());
                a(httpPost, (n) nVar);
                return httpPost;
            default:
                throw new IllegalStateException("Unknown request method.");
        }
    }

    public HttpResponse a(n<?> nVar, Map<String, String> map) {
        HttpUriRequest b = b(nVar, map);
        a(b, (Map) map);
        a(b, nVar.n());
        a(b);
        HttpParams params = b.getParams();
        int y = nVar.y();
        HttpConnectionParams.setConnectionTimeout(params, 5000);
        HttpConnectionParams.setSoTimeout(params, y);
        return this.a.execute(b);
    }

    protected void a(HttpUriRequest httpUriRequest) {
    }
}
