package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;
import java.security.MessageDigest;

public class ca extends aqg {
    private byte[] a(String str, byte[] bArr) {
        MessageDigest instance = MessageDigest.getInstance(str);
        instance.update(bArr);
        return instance.digest();
    }

    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        d.b(eaVarArr != null);
        d.b(eaVarArr.length >= 1);
        if (eaVarArr[0] == ee.e) {
            return ee.e;
        }
        byte[] bytes;
        String d = aqf.d(eaVarArr[0]);
        String str = "MD5";
        if (eaVarArr.length > 1) {
            str = eaVarArr[1] == ee.e ? "MD5" : aqf.d(eaVarArr[1]);
        }
        Object obj = "text";
        if (eaVarArr.length > 2) {
            obj = eaVarArr[2] == ee.e ? "text" : aqf.d(eaVarArr[2]);
        }
        if ("text".equals(obj)) {
            bytes = d.getBytes();
        } else if ("base16".equals(obj)) {
            bytes = aop.a(d);
        } else {
            String str2 = "Hash: Unknown input format: ";
            str = String.valueOf(obj);
            throw new RuntimeException(str.length() != 0 ? str2.concat(str) : new String(str2));
        }
        try {
            return new ej(aop.a(a(str, bytes)));
        } catch (Throwable e) {
            str2 = "Hash: Unknown algorithm: ";
            str = String.valueOf(str);
            throw new RuntimeException(str.length() != 0 ? str2.concat(str) : new String(str2), e);
        }
    }
}
