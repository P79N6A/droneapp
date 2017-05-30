package com.google.android.gms.internal;

import com.google.android.gms.common.util.o;
import java.io.InputStream;

class abz$1 implements acc$a<String> {
    final /* synthetic */ String a;
    final /* synthetic */ abz b;

    abz$1(abz com_google_android_gms_internal_abz, String str) {
        this.b = com_google_android_gms_internal_abz;
        this.a = str;
    }

    public String a() {
        String str = "Error getting a response from: ";
        String valueOf = String.valueOf(this.a);
        abr.d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        return null;
    }

    public String a(InputStream inputStream) {
        String str;
        try {
            str = new String(o.a(inputStream, true), "UTF-8");
            String str2 = this.a;
            abr.a(new StringBuilder((String.valueOf(str2).length() + 49) + String.valueOf(str).length()).append("Response received from server. \nURL: ").append(str2).append("\n Response: ").append(str).toString());
            return str;
        } catch (Throwable e) {
            Throwable th = e;
            String str3 = "Error connecting to url: ";
            str = String.valueOf(this.a);
            abr.d(str.length() != 0 ? str3.concat(str) : new String(str3), th);
            return null;
        }
    }

    public /* synthetic */ Object b() {
        return a();
    }

    public /* synthetic */ Object b(InputStream inputStream) {
        return a(inputStream);
    }
}
