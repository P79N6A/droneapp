package com.google.android.gms.internal;

import com.facebook.common.util.UriUtil;
import com.google.android.gms.ads.internal.util.client.b;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import org.a.a.e;

@aaa
public class acq {
    public HttpURLConnection a(String str, int i) {
        String protocol;
        URL url = new URL(str);
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (i3 <= 20) {
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(i);
                openConnection.setReadTimeout(i);
                if (openConnection instanceof HttpURLConnection) {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                    httpURLConnection.setInstanceFollowRedirects(false);
                    if (httpURLConnection.getResponseCode() / 100 == 3) {
                        String headerField = httpURLConnection.getHeaderField(e.H);
                        if (headerField != null) {
                            URL url2 = new URL(url, headerField);
                            protocol = url2.getProtocol();
                            if (protocol != null) {
                                if (!protocol.equals(UriUtil.HTTP_SCHEME) && !protocol.equals(UriUtil.HTTPS_SCHEME)) {
                                    break;
                                }
                                String str2 = "Redirecting to ";
                                protocol = String.valueOf(headerField);
                                b.a(protocol.length() != 0 ? str2.concat(protocol) : new String(str2));
                                httpURLConnection.disconnect();
                                i2 = i3;
                                url = url2;
                            } else {
                                throw new IOException("Protocol is null");
                            }
                        }
                        throw new IOException("Missing Location header in redirect");
                    }
                    return httpURLConnection;
                }
                throw new IOException("Invalid protocol.");
            }
            throw new IOException("Too many redirects (20)");
        }
        String str3 = "Unsupported scheme: ";
        String valueOf = String.valueOf(protocol);
        throw new IOException(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
    }
}
