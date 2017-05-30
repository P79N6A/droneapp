package com.android.volley.toolbox;

import com.android.volley.n;
import com.facebook.common.util.UriUtil;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.a.a.c.c.h;
import org.a.a.c.c.i;
import org.a.a.c.c.l;
import org.a.a.c.c.o;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.StatusLine;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

public class j implements i {
    private static final String a = "Content-Type";
    private final a b;
    private final SSLSocketFactory c;

    public interface a {
        String a(String str);
    }

    public j() {
        this(null);
    }

    public j(a aVar) {
        this(aVar, null);
    }

    public j(a aVar, SSLSocketFactory sSLSocketFactory) {
        this.b = aVar;
        this.c = sSLSocketFactory;
    }

    private HttpURLConnection a(URL url, n<?> nVar) {
        HttpURLConnection a = a(url);
        int y = nVar.y();
        a.setConnectTimeout(y);
        a.setReadTimeout(y);
        a.setUseCaches(false);
        a.setDoInput(true);
        if (UriUtil.HTTPS_SCHEME.equals(url.getProtocol()) && this.c != null) {
            ((HttpsURLConnection) a).setSSLSocketFactory(this.c);
        }
        return a;
    }

    private static HttpEntity a(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        HttpEntity basicHttpEntity = new BasicHttpEntity();
        try {
            inputStream = httpURLConnection.getInputStream();
        } catch (IOException e) {
            inputStream = httpURLConnection.getErrorStream();
        }
        basicHttpEntity.setContent(inputStream);
        basicHttpEntity.setContentLength((long) httpURLConnection.getContentLength());
        basicHttpEntity.setContentEncoding(httpURLConnection.getContentEncoding());
        basicHttpEntity.setContentType(httpURLConnection.getContentType());
        return basicHttpEntity;
    }

    static void a(HttpURLConnection httpURLConnection, n<?> nVar) {
        switch (nVar.a()) {
            case -1:
                byte[] r = nVar.r();
                if (r != null) {
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.addRequestProperty("Content-Type", nVar.q());
                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                    dataOutputStream.write(r);
                    dataOutputStream.close();
                    return;
                }
                return;
            case 0:
                httpURLConnection.setRequestMethod("GET");
                return;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                b(httpURLConnection, nVar);
                return;
            case 2:
                httpURLConnection.setRequestMethod(l.a);
                b(httpURLConnection, nVar);
                return;
            case 3:
                httpURLConnection.setRequestMethod("DELETE");
                return;
            case 4:
                httpURLConnection.setRequestMethod(h.a);
                return;
            case 5:
                httpURLConnection.setRequestMethod(i.a);
                return;
            case 6:
                httpURLConnection.setRequestMethod(o.a);
                return;
            case 7:
                httpURLConnection.setRequestMethod("PATCH");
                b(httpURLConnection, nVar);
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    private static boolean a(int i, int i2) {
        return (i == 4 || ((100 <= i2 && i2 < 200) || i2 == 204 || i2 == 304)) ? false : true;
    }

    private static void b(HttpURLConnection httpURLConnection, n<?> nVar) {
        byte[] v = nVar.v();
        if (v != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.addRequestProperty("Content-Type", nVar.u());
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.write(v);
            dataOutputStream.close();
        }
    }

    protected HttpURLConnection a(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    public HttpResponse a(n<?> nVar, Map<String, String> map) {
        String a;
        String g = nVar.g();
        HashMap hashMap = new HashMap();
        hashMap.putAll(nVar.n());
        hashMap.putAll(map);
        if (this.b != null) {
            a = this.b.a(g);
            if (a == null) {
                throw new IOException("URL blocked by rewriter: " + g);
            }
        }
        a = g;
        HttpURLConnection a2 = a(new URL(a), (n) nVar);
        for (String a3 : hashMap.keySet()) {
            a2.addRequestProperty(a3, (String) hashMap.get(a3));
        }
        a(a2, (n) nVar);
        ProtocolVersion protocolVersion = new ProtocolVersion("HTTP", 1, 1);
        if (a2.getResponseCode() == -1) {
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        }
        StatusLine basicStatusLine = new BasicStatusLine(protocolVersion, a2.getResponseCode(), a2.getResponseMessage());
        HttpResponse basicHttpResponse = new BasicHttpResponse(basicStatusLine);
        if (a(nVar.a(), basicStatusLine.getStatusCode())) {
            basicHttpResponse.setEntity(a(a2));
        }
        for (Entry entry : a2.getHeaderFields().entrySet()) {
            if (entry.getKey() != null) {
                basicHttpResponse.addHeader(new BasicHeader((String) entry.getKey(), (String) ((List) entry.getValue()).get(0)));
            }
        }
        return basicHttpResponse;
    }
}
