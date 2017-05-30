package com.google.android.gms.internal;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class do {
    private String a = "https://www.google-analytics.com";

    private String b(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8").replaceAll("\\+", "%20");
        } catch (UnsupportedEncodingException e) {
            String str2 = "Cannot encode the string: ";
            String valueOf = String.valueOf(str);
            aph.a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return "";
        }
    }

    public String a(dd ddVar) {
        String str = this.a;
        String valueOf = String.valueOf("/gtm/android?");
        String f = ddVar.e() ? ddVar.f() : b(ddVar);
        return new StringBuilder(((String.valueOf(str).length() + 0) + String.valueOf(valueOf).length()) + String.valueOf(f).length()).append(str).append(valueOf).append(f).toString();
    }

    public void a(String str) {
        this.a = str;
        String str2 = "The Ctfe server endpoint was changed to: ";
        String valueOf = String.valueOf(str);
        aph.c(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }

    String b(dd ddVar) {
        if (ddVar == null) {
            return "";
        }
        String trim = !ddVar.g().trim().equals("") ? ddVar.g().trim() : "-1";
        StringBuilder stringBuilder = new StringBuilder();
        if (ddVar.c() != null) {
            stringBuilder.append(ddVar.c());
        } else {
            stringBuilder.append("id");
        }
        stringBuilder.append("=").append(b(ddVar.a())).append("&").append("pv").append("=").append(b(trim)).append("&").append("rv=5.0");
        if (ddVar.e()) {
            stringBuilder.append("&gtm_debug=x");
        }
        return stringBuilder.toString();
    }
}
