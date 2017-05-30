package com.google.android.gms.internal;

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
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

public class aqn implements apm {
    private final a a;
    private final SSLSocketFactory b;

    public interface a {
        String a(String str);
    }

    public aqn() {
        this(null);
    }

    public aqn(a aVar) {
        this(aVar, null);
    }

    public aqn(a aVar, SSLSocketFactory sSLSocketFactory) {
        this.a = aVar;
        this.b = sSLSocketFactory;
    }

    private HttpURLConnection a(URL url, abd<?> com_google_android_gms_internal_abd_) {
        HttpURLConnection a = a(url);
        int r = com_google_android_gms_internal_abd_.r();
        a.setConnectTimeout(r);
        a.setReadTimeout(r);
        a.setUseCaches(false);
        a.setDoInput(true);
        if (UriUtil.HTTPS_SCHEME.equals(url.getProtocol()) && this.b != null) {
            ((HttpsURLConnection) a).setSSLSocketFactory(this.b);
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

    static void a(HttpURLConnection httpURLConnection, abd<?> com_google_android_gms_internal_abd_) {
        switch (com_google_android_gms_internal_abd_.a()) {
            case -1:
                byte[] k = com_google_android_gms_internal_abd_.k();
                if (k != null) {
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.addRequestProperty("Content-Type", com_google_android_gms_internal_abd_.j());
                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                    dataOutputStream.write(k);
                    dataOutputStream.close();
                    return;
                }
                return;
            case 0:
                httpURLConnection.setRequestMethod("GET");
                return;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                b(httpURLConnection, com_google_android_gms_internal_abd_);
                return;
            case 2:
                httpURLConnection.setRequestMethod(l.a);
                b(httpURLConnection, com_google_android_gms_internal_abd_);
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
                b(httpURLConnection, com_google_android_gms_internal_abd_);
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    private static void b(HttpURLConnection httpURLConnection, abd<?> com_google_android_gms_internal_abd_) {
        byte[] o = com_google_android_gms_internal_abd_.o();
        if (o != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.addRequestProperty("Content-Type", com_google_android_gms_internal_abd_.n());
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.write(o);
            dataOutputStream.close();
        }
    }

    protected HttpURLConnection a(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    public HttpResponse a(abd<?> com_google_android_gms_internal_abd_, Map<String, String> map) {
        String a;
        String c = com_google_android_gms_internal_abd_.c();
        HashMap hashMap = new HashMap();
        hashMap.putAll(com_google_android_gms_internal_abd_.g());
        hashMap.putAll(map);
        if (this.a != null) {
            a = this.a.a(c);
            if (a == null) {
                String str = "URL blocked by rewriter: ";
                a = String.valueOf(c);
                throw new IOException(a.length() != 0 ? str.concat(a) : new String(str));
            }
        }
        a = c;
        HttpURLConnection a2 = a(new URL(a), (abd) com_google_android_gms_internal_abd_);
        for (String a3 : hashMap.keySet()) {
            a2.addRequestProperty(a3, (String) hashMap.get(a3));
        }
        a(a2, (abd) com_google_android_gms_internal_abd_);
        ProtocolVersion protocolVersion = new ProtocolVersion("HTTP", 1, 1);
        if (a2.getResponseCode() == -1) {
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        }
        HttpResponse basicHttpResponse = new BasicHttpResponse(new BasicStatusLine(protocolVersion, a2.getResponseCode(), a2.getResponseMessage()));
        basicHttpResponse.setEntity(a(a2));
        for (Entry entry : a2.getHeaderFields().entrySet()) {
            if (entry.getKey() != null) {
                basicHttpResponse.addHeader(new BasicHeader((String) entry.getKey(), (String) ((List) entry.getValue()).get(0)));
            }
        }
        return basicHttpResponse;
    }
}
