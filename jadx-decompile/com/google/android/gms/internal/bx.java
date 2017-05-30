package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bx extends aqg {
    private static final Pattern a = Pattern.compile("(.+)/(.+)/(.+)");

    private static String a(Cipher cipher, String str, SecretKeySpec secretKeySpec, IvParameterSpec ivParameterSpec) {
        if (str == null || str.length() == 0) {
            throw new RuntimeException("Encrypt: empty input string");
        }
        try {
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return aop.a(cipher.doFinal(str.getBytes()));
        } catch (Exception e) {
            String str2 = "Encrypt: ";
            String valueOf = String.valueOf(e.getMessage());
            throw new RuntimeException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
    }

    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        String valueOf;
        d.b(eaVarArr != null);
        d.b(eaVarArr.length >= 3);
        String d = aqf.d(eaVarArr[0]);
        String d2 = aqf.d(eaVarArr[1]);
        String d3 = aqf.d(eaVarArr[2]);
        Object d4 = eaVarArr.length < 4 ? "AES/CBC/NoPadding" : aqf.d(eaVarArr[3]);
        Matcher matcher = a.matcher(d4);
        if (matcher.matches()) {
            try {
                return new ej(a(Cipher.getInstance(d4), d, new SecretKeySpec(d2.getBytes(), matcher.group(1)), new IvParameterSpec(d3.getBytes())));
            } catch (NoSuchAlgorithmException e) {
                d = "Encrypt: invalid transformation:";
                valueOf = String.valueOf(d4);
                throw new RuntimeException(valueOf.length() == 0 ? d.concat(valueOf) : new String(d));
            } catch (NoSuchPaddingException e2) {
                d = "Encrypt: invalid transformation:";
                valueOf = String.valueOf(d4);
                if (valueOf.length() == 0) {
                }
                throw new RuntimeException(valueOf.length() == 0 ? d.concat(valueOf) : new String(d));
            }
        }
        d = "Encrypt: invalid transformation:";
        valueOf = String.valueOf(d4);
        throw new RuntimeException(valueOf.length() != 0 ? d.concat(valueOf) : new String(d));
    }
}
