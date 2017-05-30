package com.google.android.gms.internal;

import android.net.Uri;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class apn {
    private static apn a;
    private volatile a b;
    private volatile String c;
    private volatile String d;

    enum a {
        NONE,
        CONTAINER
    }

    apn() {
        e();
    }

    public static apn a() {
        apn com_google_android_gms_internal_apn;
        synchronized (apn.class) {
            if (a == null) {
                a = new apn();
            }
            com_google_android_gms_internal_apn = a;
        }
        return com_google_android_gms_internal_apn;
    }

    public boolean a(String str) {
        return b() && d().equals(str);
    }

    public synchronized boolean a(String str, Uri uri) {
        boolean z = false;
        synchronized (this) {
            String decode;
            try {
                decode = URLDecoder.decode(uri.toString(), "UTF-8");
                String queryParameter;
                if (decode.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\S+")) {
                    queryParameter = uri.getQueryParameter("id");
                    String queryParameter2 = uri.getQueryParameter("gtm_auth");
                    String queryParameter3 = uri.getQueryParameter("gtm_preview");
                    if (!str.equals(queryParameter)) {
                        aph.b("Preview fails (container doesn't match the container specified by the asset)");
                    } else if (queryParameter == null || queryParameter.length() <= 0) {
                        queryParameter = "Bad preview url: ";
                        decode = String.valueOf(decode);
                        aph.b(decode.length() != 0 ? queryParameter.concat(decode) : new String(queryParameter));
                    } else {
                        if (queryParameter3 == null || queryParameter3.length() != 0) {
                            if (queryParameter3 == null || queryParameter3.length() <= 0 || queryParameter2 == null || queryParameter2.length() <= 0) {
                                queryParameter = "Bad preview url: ";
                                decode = String.valueOf(decode);
                                aph.b(decode.length() != 0 ? queryParameter.concat(decode) : new String(queryParameter));
                            } else {
                                this.b = a.CONTAINER;
                                this.d = uri.getQuery();
                                this.c = queryParameter;
                            }
                        } else if (!queryParameter.equals(this.c) || this.b == a.NONE) {
                            aph.b("Error in exiting preview mode. The container is not in preview.");
                        } else {
                            decode = "Exit preview mode for container: ";
                            String valueOf = String.valueOf(this.c);
                            aph.d(valueOf.length() != 0 ? decode.concat(valueOf) : new String(decode));
                            this.b = a.NONE;
                            this.c = null;
                            this.d = null;
                        }
                        z = true;
                    }
                } else {
                    queryParameter = "Bad preview url: ";
                    decode = String.valueOf(decode);
                    aph.b(decode.length() != 0 ? queryParameter.concat(decode) : new String(queryParameter));
                }
            } catch (UnsupportedEncodingException e) {
                decode = String.valueOf(e);
                aph.b(new StringBuilder(String.valueOf(decode).length() + 32).append("Error decoding the preview url: ").append(decode).toString());
            }
        }
        return z;
    }

    public boolean b() {
        return this.b == a.CONTAINER;
    }

    public String c() {
        return this.d;
    }

    public String d() {
        return this.c;
    }

    void e() {
        this.b = a.NONE;
        this.d = null;
        this.c = null;
    }
}
