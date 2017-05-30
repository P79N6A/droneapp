package com.google.android.gms.internal;

import com.facebook.common.util.UriUtil;
import java.net.URI;

public class hp {
    private final String a;
    private final String b;
    private final boolean c;

    public hp(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public static URI a(String str, boolean z, String str2, String str3) {
        String str4 = z ? "wss" : "ws";
        String valueOf = String.valueOf("v");
        String valueOf2 = String.valueOf("5");
        str4 = new StringBuilder(((((String.valueOf(str4).length() + 13) + String.valueOf(str).length()) + String.valueOf(str2).length()) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()).append(str4).append("://").append(str).append("/.ws?ns=").append(str2).append("&").append(valueOf).append("=").append(valueOf2).toString();
        if (str3 != null) {
            str4 = String.valueOf(str4);
            valueOf = String.valueOf("&ls=");
            str4 = new StringBuilder(((String.valueOf(str4).length() + 0) + String.valueOf(valueOf).length()) + String.valueOf(str3).length()).append(str4).append(valueOf).append(str3).toString();
        }
        return URI.create(str4);
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public boolean c() {
        return this.c;
    }

    public String toString() {
        String str = this.c ? "s" : "";
        String str2 = this.a;
        return new StringBuilder((String.valueOf(str).length() + 7) + String.valueOf(str2).length()).append(UriUtil.HTTP_SCHEME).append(str).append("://").append(str2).toString();
    }
}
