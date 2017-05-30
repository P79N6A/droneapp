package com.xiaomi.market.sdk;

import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

public class c {
    private static final String TAG = "MarketConnection";
    protected static final String r = "http";
    private static final int s = 10000;
    private static final int t = 10000;
    private static final int u = 30000;
    protected boolean A;
    protected boolean B;
    protected boolean C;
    protected boolean D;
    protected boolean E;
    protected JSONObject v;
    protected URL w;
    protected h x;
    protected String y;
    protected boolean z;

    public c(String str) {
        this(str, false);
    }

    public c(String str, String str2) {
        this(c(str, str2), false);
    }

    public c(String str, boolean z) {
        URL url;
        try {
            url = new URL(str);
        } catch (MalformedURLException e) {
            Log.e(TAG, "URL error: " + e);
            url = null;
        }
        a(url);
        this.E = z;
    }

    private g a(int i) {
        if (i == 200) {
            return g.OK;
        }
        Log.e(TAG, "Network Error : " + i);
        return g.SERVER_ERROR;
    }

    private g a(String str, String str2, boolean z, boolean z2, i iVar) {
        HttpURLConnection a;
        BufferedInputStream bufferedInputStream;
        Object e;
        Throwable th;
        HttpURLConnection httpURLConnection;
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (s.DEBUG) {
                Log.d(TAG, "hosted connection url: " + str3);
            }
            try {
                URL url = new URL(str3);
                try {
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) url.openConnection();
                    try {
                        httpURLConnection2.setConnectTimeout(10000);
                        if (s.n(XiaomiUpdateAgent.getContext())) {
                            httpURLConnection2.setReadTimeout(10000);
                        } else {
                            httpURLConnection2.setReadTimeout(30000);
                        }
                        if (z) {
                            httpURLConnection2.setRequestMethod("GET");
                            httpURLConnection2.setDoOutput(false);
                        } else {
                            httpURLConnection2.setRequestMethod("POST");
                            httpURLConnection2.setDoOutput(true);
                        }
                        try {
                            a = a(httpURLConnection2);
                            try {
                                a.connect();
                                if (!(z || TextUtils.isEmpty(str2))) {
                                    OutputStream outputStream = a.getOutputStream();
                                    outputStream.write(str2.getBytes());
                                    if (s.DEBUG) {
                                        Log.d(TAG, "[post]" + str2);
                                    }
                                    outputStream.close();
                                }
                                g a2 = a(a.getResponseCode());
                                if (a2 == g.OK && iVar != null) {
                                    try {
                                        bufferedInputStream = new BufferedInputStream(a.getInputStream(), 8192);
                                        try {
                                            byte[] bArr = new byte[1024];
                                            while (true) {
                                                int read = bufferedInputStream.read(bArr, 0, 1024);
                                                if (read <= 0) {
                                                    break;
                                                }
                                                iVar.write(bArr, 0, read);
                                            }
                                            iVar.flush();
                                            if (bufferedInputStream != null) {
                                                bufferedInputStream.close();
                                            }
                                        } catch (Exception e2) {
                                            e = e2;
                                        }
                                    } catch (Exception e3) {
                                        e = e3;
                                        bufferedInputStream = null;
                                        try {
                                            Log.e(TAG, "Connection Exception for " + url.getHost() + " : read file stream error " + e);
                                            iVar.reset();
                                            if (bufferedInputStream != null) {
                                                bufferedInputStream.close();
                                            }
                                            if (a != null) {
                                                a.disconnect();
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            if (bufferedInputStream != null) {
                                                bufferedInputStream.close();
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        bufferedInputStream = null;
                                        if (bufferedInputStream != null) {
                                            bufferedInputStream.close();
                                        }
                                        throw th;
                                    }
                                }
                                if (a == null) {
                                    return a2;
                                }
                                a.disconnect();
                                return a2;
                            } catch (Exception e4) {
                                e = e4;
                                httpURLConnection = a;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } catch (d e5) {
                            g gVar = e5.F;
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            return gVar;
                        }
                    } catch (Exception e6) {
                        Exception exception = e6;
                        httpURLConnection = httpURLConnection2;
                        e = exception;
                    } catch (Throwable th5) {
                        a = httpURLConnection2;
                        th = th5;
                    }
                } catch (Exception e7) {
                    e = e7;
                    httpURLConnection = null;
                    try {
                        Log.e(TAG, "Connection Exception for " + url.getHost() + " :" + e);
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        a = httpURLConnection;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    a = null;
                }
            } catch (MalformedURLException e8) {
                Log.e(TAG, " URL error :" + e8);
            }
        }
        return g.NETWORK_ERROR;
        if (a != null) {
            a.disconnect();
        }
        throw th;
    }

    private void a(URL url) {
        this.z = true;
        this.A = false;
        this.B = true;
        this.C = true;
        this.D = true;
        if (b(url)) {
            this.w = url;
        }
    }

    public static String c(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        Object substring;
        if (str.charAt(str.length() - 1) == '/') {
            substring = str.substring(0, str.length() - 1);
        }
        if (str2.charAt(0) == '/') {
            str2 = str2.substring(1);
        }
        return new StringBuilder(String.valueOf(substring)).append("/").append(str2).toString();
    }

    protected g a(i iVar) {
        if (this.w == null) {
            return g.URL_ERROR;
        }
        if (!s.m(XiaomiUpdateAgent.getContext())) {
            return g.NETWORK_ERROR;
        }
        if (this.x == null) {
            getClass();
            this.x = new h(this);
        }
        h hVar = this.x;
        try {
            String url;
            h a = a(this.x);
            String url2 = this.w.toString();
            if (this.A && !a.isEmpty()) {
                CharSequence query = this.w.getQuery();
                url = this.w.toString();
                url2 = TextUtils.isEmpty(query) ? new StringBuilder(String.valueOf(url)).append("?").append(a.toString()).toString() : new StringBuilder(String.valueOf(url)).append("&").append(a.toString()).toString();
            }
            try {
                url = a(url2, a);
                if (s.DEBUG) {
                    Log.d(TAG, "connection url: " + url);
                }
                String str = "";
                if (!this.A) {
                    str = a.toString();
                }
                long currentTimeMillis = System.currentTimeMillis();
                g a2 = a(url, str, this.A, false, iVar);
                if (!s.DEBUG) {
                    return a2;
                }
                Log.d(TAG, "Time(ms) spent in request: " + (System.currentTimeMillis() - currentTimeMillis) + ", " + url);
                return a2;
            } catch (d e) {
                return e.F;
            }
        } catch (d e2) {
            return e2.F;
        }
    }

    protected h a(h hVar) {
        return hVar;
    }

    protected String a(String str, h hVar) {
        return str;
    }

    protected HttpURLConnection a(HttpURLConnection httpURLConnection) {
        return httpURLConnection;
    }

    public void a(boolean z) {
        this.A = z;
    }

    public g b(File file) {
        if (file == null) {
            throw new IllegalArgumentException();
        }
        try {
            i eVar = new e(this, file);
            g a = a(eVar);
            try {
                eVar.close();
                if (a != g.OK) {
                    Log.e(TAG, "Connection failed : " + a);
                    file.delete();
                }
            } catch (IOException e) {
            }
            return a;
        } catch (FileNotFoundException e2) {
            Log.e(TAG, "File not found: " + e2);
            throw e2;
        }
    }

    public void b(boolean z) {
        this.z = z;
    }

    protected boolean b(URL url) {
        return url != null && TextUtils.equals(url.getProtocol(), "http");
    }

    public void c(boolean z) {
        this.B = z;
    }

    public void d(boolean z) {
        this.C = z;
    }

    public JSONObject e() {
        return this.v;
    }

    public void e(boolean z) {
        this.D = z;
    }

    public String f() {
        return this.y;
    }

    public h g() {
        return this.x;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.xiaomi.market.sdk.g h() {
        /*
        r5 = this;
        r1 = new java.io.ByteArrayOutputStream;
        r1.<init>();
        r0 = new com.xiaomi.market.sdk.f;
        r0.<init>(r5, r1);
        r0 = r5.a(r0);
        r2 = com.xiaomi.market.sdk.g.OK;	 Catch:{ JSONException -> 0x0036 }
        if (r0 != r2) goto L_0x0021;
    L_0x0012:
        r2 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0036 }
        r3 = r1.toString();	 Catch:{ JSONException -> 0x0036 }
        r2.<init>(r3);	 Catch:{ JSONException -> 0x0036 }
        r5.v = r2;	 Catch:{ JSONException -> 0x0036 }
    L_0x001d:
        r1.close();	 Catch:{ IOException -> 0x005a }
    L_0x0020:
        return r0;
    L_0x0021:
        r2 = "MarketConnection";
        r3 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x0036 }
        r4 = "Connection failed : ";
        r3.<init>(r4);	 Catch:{ JSONException -> 0x0036 }
        r3 = r3.append(r0);	 Catch:{ JSONException -> 0x0036 }
        r3 = r3.toString();	 Catch:{ JSONException -> 0x0036 }
        android.util.Log.e(r2, r3);	 Catch:{ JSONException -> 0x0036 }
        goto L_0x001d;
    L_0x0036:
        r0 = move-exception;
        r2 = "MarketConnection";
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0053 }
        r4 = "JSON error: ";
        r3.<init>(r4);	 Catch:{ all -> 0x0053 }
        r0 = r3.append(r0);	 Catch:{ all -> 0x0053 }
        r0 = r0.toString();	 Catch:{ all -> 0x0053 }
        android.util.Log.e(r2, r0);	 Catch:{ all -> 0x0053 }
        r0 = com.xiaomi.market.sdk.g.RESULT_ERROR;	 Catch:{ all -> 0x0053 }
        r1.close();	 Catch:{ IOException -> 0x0051 }
        goto L_0x0020;
    L_0x0051:
        r1 = move-exception;
        goto L_0x0020;
    L_0x0053:
        r0 = move-exception;
        r1.close();	 Catch:{ IOException -> 0x0058 }
    L_0x0057:
        throw r0;
    L_0x0058:
        r1 = move-exception;
        goto L_0x0057;
    L_0x005a:
        r1 = move-exception;
        goto L_0x0020;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.market.sdk.c.h():com.xiaomi.market.sdk.g");
    }

    public g i() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        g a = a(new f(this, byteArrayOutputStream));
        if (a == g.OK) {
            this.y = byteArrayOutputStream.toString();
        } else {
            Log.e(TAG, "Connection failed : " + a);
        }
        try {
            byteArrayOutputStream.close();
        } catch (IOException e) {
        }
        return a;
    }
}
