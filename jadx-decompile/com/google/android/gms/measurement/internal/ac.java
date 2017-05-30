package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.annotation.WorkerThread;
import com.baidu.tts.loopj.AsyncHttpClient;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.util.e;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ac extends b {

    @WorkerThread
    interface a {
        void a(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map);
    }

    @WorkerThread
    private static class b implements Runnable {
        private final a a;
        private final int b;
        private final Throwable c;
        private final byte[] d;
        private final String e;
        private final Map<String, List<String>> f;

        private b(String str, a aVar, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
            d.a(aVar);
            this.a = aVar;
            this.b = i;
            this.c = th;
            this.d = bArr;
            this.e = str;
            this.f = map;
        }

        public void run() {
            this.a.a(this.e, this.b, this.c, this.d, this.f);
        }
    }

    @WorkerThread
    private class c implements Runnable {
        final /* synthetic */ ac a;
        private final URL b;
        private final byte[] c;
        private final a d;
        private final String e;
        private final Map<String, String> f;

        public c(ac acVar, String str, URL url, byte[] bArr, Map<String, String> map, a aVar) {
            this.a = acVar;
            d.a(str);
            d.a(url);
            d.a(aVar);
            this.b = url;
            this.c = bArr;
            this.d = aVar;
            this.e = str;
            this.f = map;
        }

        public void run() {
            HttpURLConnection a;
            OutputStream outputStream;
            Throwable e;
            Map map;
            int i;
            HttpURLConnection httpURLConnection;
            Throwable th;
            Map map2;
            this.a.i();
            int i2 = 0;
            try {
                this.a.a(this.e);
                a = this.a.a(this.b);
                try {
                    if (this.f != null) {
                        for (Entry entry : this.f.entrySet()) {
                            a.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    if (this.c != null) {
                        byte[] a2 = this.a.s().a(this.c);
                        this.a.w().E().a("Uploading data. size", Integer.valueOf(a2.length));
                        a.setDoOutput(true);
                        a.addRequestProperty("Content-Encoding", AsyncHttpClient.ENCODING_GZIP);
                        a.setFixedLengthStreamingMode(a2.length);
                        a.connect();
                        outputStream = a.getOutputStream();
                        try {
                            outputStream.write(a2);
                            outputStream.close();
                        } catch (IOException e2) {
                            e = e2;
                            map = null;
                            i = 0;
                            httpURLConnection = a;
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (IOException e3) {
                                    this.a.w().f().a("Error closing HTTP compressed POST connection output stream", e3);
                                }
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            this.a.g();
                            this.a.v().a(new b(this.e, this.d, i, e, null, map));
                        } catch (Throwable th2) {
                            th = th2;
                            map2 = null;
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (IOException e32) {
                                    this.a.w().f().a("Error closing HTTP compressed POST connection output stream", e32);
                                }
                            }
                            if (a != null) {
                                a.disconnect();
                            }
                            this.a.g();
                            this.a.v().a(new b(this.e, this.d, i2, null, null, map2));
                            throw th;
                        }
                    }
                    i2 = a.getResponseCode();
                    map2 = a.getHeaderFields();
                } catch (IOException e4) {
                    e = e4;
                    map = null;
                    i = i2;
                    outputStream = null;
                    httpURLConnection = a;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    this.a.g();
                    this.a.v().a(new b(this.e, this.d, i, e, null, map));
                } catch (Throwable th3) {
                    th = th3;
                    map2 = null;
                    outputStream = null;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (a != null) {
                        a.disconnect();
                    }
                    this.a.g();
                    this.a.v().a(new b(this.e, this.d, i2, null, null, map2));
                    throw th;
                }
                try {
                    byte[] a3 = this.a.a(a);
                    if (a != null) {
                        a.disconnect();
                    }
                    this.a.g();
                    this.a.v().a(new b(this.e, this.d, i2, null, a3, map2));
                } catch (IOException e5) {
                    e = e5;
                    map = map2;
                    i = i2;
                    outputStream = null;
                    httpURLConnection = a;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    this.a.g();
                    this.a.v().a(new b(this.e, this.d, i, e, null, map));
                } catch (Throwable th32) {
                    th = th32;
                    outputStream = null;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (a != null) {
                        a.disconnect();
                    }
                    this.a.g();
                    this.a.v().a(new b(this.e, this.d, i2, null, null, map2));
                    throw th;
                }
            } catch (IOException e6) {
                e = e6;
                map = null;
                i = 0;
                outputStream = null;
                httpURLConnection = null;
                if (outputStream != null) {
                    outputStream.close();
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                this.a.g();
                this.a.v().a(new b(this.e, this.d, i, e, null, map));
            } catch (Throwable th322) {
                th = th322;
                map2 = null;
                a = null;
                outputStream = null;
                if (outputStream != null) {
                    outputStream.close();
                }
                if (a != null) {
                    a.disconnect();
                }
                this.a.g();
                this.a.v().a(new b(this.e, this.d, i2, null, null, map2));
                throw th;
            }
        }
    }

    public ac(aj ajVar) {
        super(ajVar);
    }

    @WorkerThread
    private byte[] a(HttpURLConnection httpURLConnection) {
        InputStream inputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            inputStream = httpURLConnection.getInputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            byte[] toByteArray = byteArrayOutputStream.toByteArray();
            return toByteArray;
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    @WorkerThread
    protected HttpURLConnection a(URL url) {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setConnectTimeout((int) y().H());
            httpURLConnection.setReadTimeout((int) y().I());
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw new IOException("Failed to obtain HTTP connection");
    }

    protected void a(String str) {
    }

    @WorkerThread
    public void a(String str, URL url, Map<String, String> map, a aVar) {
        j();
        c();
        d.a(url);
        d.a(aVar);
        v().b(new c(this, str, url, null, map, aVar));
    }

    @WorkerThread
    public void a(String str, URL url, byte[] bArr, Map<String, String> map, a aVar) {
        j();
        c();
        d.a(url);
        d.a(bArr);
        d.a(aVar);
        v().b(new c(this, str, url, bArr, map, aVar));
    }

    protected void e() {
    }

    public boolean f() {
        NetworkInfo activeNetworkInfo;
        c();
        try {
            activeNetworkInfo = ((ConnectivityManager) q().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException e) {
            activeNetworkInfo = null;
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    protected void g() {
    }

    public /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    public /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    public /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    public /* bridge */ /* synthetic */ o k() {
        return super.k();
    }

    public /* bridge */ /* synthetic */ d l() {
        return super.l();
    }

    public /* bridge */ /* synthetic */ z m() {
        return super.m();
    }

    public /* bridge */ /* synthetic */ s n() {
        return super.n();
    }

    public /* bridge */ /* synthetic */ e o() {
        return super.o();
    }

    public /* bridge */ /* synthetic */ e p() {
        return super.p();
    }

    public /* bridge */ /* synthetic */ Context q() {
        return super.q();
    }

    public /* bridge */ /* synthetic */ q r() {
        return super.r();
    }

    public /* bridge */ /* synthetic */ m s() {
        return super.s();
    }

    public /* bridge */ /* synthetic */ ah t() {
        return super.t();
    }

    public /* bridge */ /* synthetic */ g u() {
        return super.u();
    }

    public /* bridge */ /* synthetic */ ai v() {
        return super.v();
    }

    public /* bridge */ /* synthetic */ ab w() {
        return super.w();
    }

    public /* bridge */ /* synthetic */ af x() {
        return super.x();
    }

    public /* bridge */ /* synthetic */ p y() {
        return super.y();
    }
}
