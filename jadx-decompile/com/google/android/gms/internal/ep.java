package com.google.android.gms.internal;

import com.google.android.gms.wallet.e;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

class ep implements eq {
    private HttpURLConnection a;

    ep() {
    }

    private InputStream a(HttpURLConnection httpURLConnection) {
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == 200) {
            return httpURLConnection.getInputStream();
        }
        String str = "Bad response: " + responseCode;
        if (responseCode == e.j) {
            throw new FileNotFoundException(str);
        } else if (responseCode == it.a.a.e.d) {
            throw new es(str);
        } else {
            throw new IOException(str);
        }
    }

    private void b(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public InputStream a(String str) {
        this.a = b(str);
        return a(this.a);
    }

    public void a() {
        b(this.a);
    }

    HttpURLConnection b(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setReadTimeout(20000);
        httpURLConnection.setConnectTimeout(20000);
        return httpURLConnection;
    }
}
