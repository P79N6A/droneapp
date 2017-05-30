package com.google.android.gms.internal;

import android.util.Base64;
import com.google.android.gms.common.internal.d;

public class bw extends aqg {
    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        String str;
        int i = 1;
        d.b(eaVarArr != null);
        d.b(eaVarArr.length >= 1);
        String d = aqf.d(eaVarArr[0]);
        Object obj = "text";
        if (eaVarArr.length > 1) {
            obj = aqf.d(eaVarArr[1]);
        }
        Object obj2 = "base16";
        if (eaVarArr.length > 2) {
            obj2 = aqf.d(eaVarArr[2]);
        }
        if (eaVarArr.length <= 3 || !aqf.a(eaVarArr[3])) {
            i = 0;
        }
        i = i != 0 ? 3 : 2;
        String a;
        try {
            byte[] bytes;
            if ("text".equals(obj)) {
                bytes = d.getBytes();
            } else if ("base16".equals(obj)) {
                bytes = aop.a(d);
            } else if ("base64".equals(obj)) {
                bytes = Base64.decode(d, i);
            } else if ("base64url".equals(obj)) {
                bytes = Base64.decode(d, i | 8);
            } else {
                String str2 = "Encode: unknown input format: ";
                String valueOf = String.valueOf(obj);
                throw new UnsupportedOperationException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
            if ("base16".equals(obj2)) {
                a = aop.a(bytes);
            } else if ("base64".equals(obj2)) {
                a = Base64.encodeToString(bytes, i);
            } else if ("base64url".equals(obj2)) {
                a = Base64.encodeToString(bytes, i | 8);
            } else {
                str = "Encode: unknown output format: ";
                a = String.valueOf(obj2);
                throw new RuntimeException(a.length() != 0 ? str.concat(a) : new String(str));
            }
            return new ej(a);
        } catch (IllegalArgumentException e) {
            str = "Encode: invalid input:";
            a = String.valueOf(obj);
            throw new RuntimeException(a.length() != 0 ? str.concat(a) : new String(str));
        }
    }
}
