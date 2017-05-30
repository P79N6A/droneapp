package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import org.a.a.e;

class cp implements k {
    private final String a;
    private final Context b;
    private final b c;
    private final a d;

    public interface a {
        void a(z zVar);

        void b(z zVar);

        void c(z zVar);
    }

    interface b {
        HttpURLConnection a(URL url);
    }

    cp(Context context, a aVar) {
        this(new b() {
            public HttpURLConnection a(URL url) {
                return (HttpURLConnection) url.openConnection();
            }
        }, context, aVar);
    }

    cp(b bVar, Context context, a aVar) {
        this.c = bVar;
        this.b = context.getApplicationContext();
        this.d = aVar;
        this.a = a("GoogleTagManager", "4.00", VERSION.RELEASE, a(Locale.getDefault()), Build.MODEL, Build.ID);
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

    URL a(z zVar) {
        try {
            return new URL(zVar.c());
        } catch (MalformedURLException e) {
            aw.a("Error trying to parse the GTM url.");
            return null;
        }
    }

    public void a(List<z> list) {
        Throwable th;
        InputStream inputStream;
        Object obj;
        Throwable th2;
        Object obj2;
        IOException iOException;
        int min = Math.min(list.size(), 40);
        Object obj3 = 1;
        int i = 0;
        while (i < min) {
            Object obj4;
            z zVar = (z) list.get(i);
            URL a = a(zVar);
            if (a == null) {
                aw.b("No destination: discarding hit.");
                this.d.b(zVar);
                obj4 = obj3;
            } else {
                try {
                    HttpURLConnection a2 = this.c.a(a);
                    if (obj3 != null) {
                        try {
                            bb.b(this.b);
                            obj3 = null;
                        } catch (Throwable th3) {
                            th = th3;
                            inputStream = null;
                            obj = obj3;
                            th2 = th;
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException e) {
                                    obj2 = obj;
                                    iOException = e;
                                }
                            }
                            a2.disconnect();
                            throw th2;
                        }
                    }
                    a2.setRequestProperty(e.Y, this.a);
                    int responseCode = a2.getResponseCode();
                    InputStream inputStream2 = a2.getInputStream();
                    if (responseCode != 200) {
                        try {
                            aw.b("Bad response: " + responseCode);
                            this.d.c(zVar);
                        } catch (Throwable th32) {
                            th = th32;
                            inputStream = inputStream2;
                            obj = obj3;
                            th2 = th;
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            a2.disconnect();
                            throw th2;
                        }
                    }
                    this.d.a(zVar);
                    if (inputStream2 != null) {
                        inputStream2.close();
                    }
                    a2.disconnect();
                    obj4 = obj3;
                } catch (IOException e2) {
                    iOException = e2;
                    obj2 = obj3;
                    String str = "Exception sending hit: ";
                    String valueOf = String.valueOf(iOException.getClass().getSimpleName());
                    aw.b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                    aw.b(iOException.getMessage());
                    this.d.c(zVar);
                    obj4 = obj2;
                    i++;
                    obj3 = obj4;
                }
            }
            i++;
            obj3 = obj4;
        }
    }

    public boolean a() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.b.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        aw.e("...no network connectivity");
        return false;
    }
}
