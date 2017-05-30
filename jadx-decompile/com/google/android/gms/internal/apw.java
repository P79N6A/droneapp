package com.google.android.gms.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import org.a.a.c.c.h;
import org.a.a.c.c.l;
import org.a.a.e;

class apw implements aov {
    private final String a;
    private final Context b;
    private final b c;
    private final a d;

    public interface a {
        void a(aoy com_google_android_gms_internal_aoy);

        void b(aoy com_google_android_gms_internal_aoy);

        void c(aoy com_google_android_gms_internal_aoy);
    }

    interface b {
        HttpURLConnection a(URL url);
    }

    apw(Context context, a aVar) {
        this(new b() {
            public HttpURLConnection a(URL url) {
                return (HttpURLConnection) url.openConnection();
            }
        }, context, aVar);
    }

    apw(b bVar, Context context, a aVar) {
        this.c = bVar;
        this.b = context.getApplicationContext();
        this.d = aVar;
        this.a = a("GoogleTagManager", "5.01", VERSION.RELEASE, a(Locale.getDefault()), Build.MODEL, Build.ID);
    }

    static String a(Locale locale) {
        if (locale == null || locale.getLanguage() == null || locale.getLanguage().length() == 0) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(locale.getLanguage().toLowerCase());
        if (!(locale.getCountry() == null || locale.getCountry().length() == 0)) {
            stringBuilder.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER).append(locale.getCountry().toLowerCase());
        }
        return stringBuilder.toString();
    }

    String a(String str, String str2, String str3, String str4, String str5, String str6) {
        return String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[]{str, str2, str3, str4, str5, str6});
    }

    URL a(aoy com_google_android_gms_internal_aoy) {
        try {
            return new URL(com_google_android_gms_internal_aoy.c());
        } catch (MalformedURLException e) {
            aph.a("Error trying to parse the GTM url.");
            return null;
        }
    }

    public void a(List<aoy> list) {
        Throwable th;
        InputStream inputStream;
        IOException iOException;
        int min = Math.min(list.size(), 40);
        Object obj = 1;
        int i = 0;
        while (i < min) {
            Object obj2;
            aoy com_google_android_gms_internal_aoy = (aoy) list.get(i);
            URL a = a(com_google_android_gms_internal_aoy);
            String d = com_google_android_gms_internal_aoy.d();
            Map e = com_google_android_gms_internal_aoy.e();
            String f = com_google_android_gms_internal_aoy.f();
            if (a == null) {
                aph.b("No destination: discarding hit.");
                this.d.b(com_google_android_gms_internal_aoy);
                obj2 = obj;
            } else {
                String valueOf;
                try {
                    Object obj3;
                    HttpURLConnection a2 = this.c.a(a);
                    if (obj != null) {
                        try {
                            apj.b(this.b);
                            obj3 = null;
                        } catch (Throwable th2) {
                            obj3 = obj;
                            th = th2;
                            inputStream = null;
                            if (inputStream == null) {
                                try {
                                    inputStream.close();
                                } catch (IOException e2) {
                                    iOException = e2;
                                    obj = obj3;
                                }
                            }
                            a2.disconnect();
                            throw th;
                        }
                    }
                    obj3 = obj;
                    try {
                        a2.setRequestProperty(e.Y, this.a);
                        if (e != null) {
                            for (Entry entry : e.entrySet()) {
                                a2.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                            }
                        }
                        if (d == null) {
                            aph.b(String.format("Hit %d retrieved from the store has null HTTP method.", new Object[]{Long.valueOf(com_google_android_gms_internal_aoy.a())}));
                            this.d.b(com_google_android_gms_internal_aoy);
                            a2.disconnect();
                            obj2 = obj3;
                        } else if (d.equals("GET") || d.equals(h.a) || d.equals("POST") || d.equals(l.a)) {
                            obj = -1;
                            switch (d.hashCode()) {
                                case 70454:
                                    if (d.equals("GET")) {
                                        obj = null;
                                        break;
                                    }
                                    break;
                                case 79599:
                                    if (d.equals(l.a)) {
                                        obj = 3;
                                        break;
                                    }
                                    break;
                                case 2213344:
                                    if (d.equals(h.a)) {
                                        obj = 1;
                                        break;
                                    }
                                    break;
                                case 2461856:
                                    if (d.equals("POST")) {
                                        obj = 2;
                                        break;
                                    }
                                    break;
                            }
                            switch (obj) {
                                case null:
                                case 1:
                                    if (f != null) {
                                        aph.b(String.format("Body of %s hit is ignored: %s.", new Object[]{d, f}));
                                    }
                                    a2.setRequestMethod(d);
                                    break;
                                case 2:
                                case 3:
                                    a2.setRequestMethod(d);
                                    if (f != null) {
                                        a2.setDoOutput(true);
                                        byte[] bytes = f.getBytes(Charset.forName("UTF-8"));
                                        a2.setFixedLengthStreamingMode(bytes.length);
                                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(a2.getOutputStream());
                                        bufferedOutputStream.write(bytes);
                                        bufferedOutputStream.flush();
                                        bufferedOutputStream.close();
                                        break;
                                    }
                                    break;
                            }
                            int responseCode = a2.getResponseCode();
                            inputStream = a2.getInputStream();
                            if (responseCode != 200) {
                                try {
                                    valueOf = String.valueOf(a);
                                    aph.b(new StringBuilder(String.valueOf(valueOf).length() + 39).append("Bad response received for ").append(valueOf).append(": ").append(responseCode).toString());
                                    this.d.c(com_google_android_gms_internal_aoy);
                                } catch (Throwable th3) {
                                    th = th3;
                                    if (inputStream == null) {
                                        inputStream.close();
                                    }
                                    a2.disconnect();
                                    throw th;
                                }
                            }
                            String valueOf2 = String.valueOf(a);
                            aph.d(new StringBuilder((String.valueOf(valueOf2).length() + 23) + String.valueOf(d).length()).append("Hit sent to ").append(valueOf2).append("(method = ").append(d).append(")").toString());
                            this.d.a(com_google_android_gms_internal_aoy);
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            a2.disconnect();
                            obj2 = obj3;
                        } else {
                            aph.b(String.format("Unrecongnized HTTP method %s. Supported methods are GET, HEAD, PUT and/or POST", new Object[]{d}));
                            this.d.b(com_google_android_gms_internal_aoy);
                            a2.disconnect();
                            obj2 = obj3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        inputStream = null;
                        if (inputStream == null) {
                            inputStream.close();
                        }
                        a2.disconnect();
                        throw th;
                    }
                } catch (IOException e3) {
                    iOException = e3;
                    String valueOf3 = String.valueOf(a);
                    valueOf = String.valueOf(iOException.getClass().getSimpleName());
                    aph.b(new StringBuilder((String.valueOf(valueOf3).length() + 27) + String.valueOf(valueOf).length()).append("Exception sending hit to ").append(valueOf3).append(": ").append(valueOf).toString());
                    aph.b(iOException.getMessage());
                    this.d.c(com_google_android_gms_internal_aoy);
                    obj2 = obj;
                    i++;
                    obj = obj2;
                }
            }
            i++;
            obj = obj2;
        }
    }

    public boolean a() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.b.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        aph.d("...no network connectivity");
        return false;
    }
}
