package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor;

public class ax extends aqg {
    private static byte a(String str, int i) {
        if (i + 3 > str.length() || str.charAt(i) != '%') {
            throw new UnsupportedEncodingException();
        }
        String substring = str.substring(i + 1, i + 3);
        if (substring.charAt(0) == SignatureVisitor.EXTENDS || substring.charAt(0) == SignatureVisitor.SUPER) {
            throw new UnsupportedEncodingException();
        }
        try {
            return (byte) Integer.parseInt(substring, 16);
        } catch (NumberFormatException e) {
            throw new UnsupportedEncodingException();
        }
    }

    static String a(String str, String str2) {
        Charset forName = Charset.forName("UTF-8");
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt != '%') {
                stringBuilder.append((char) charAt);
                i++;
            } else {
                byte a = a(str, i);
                int i2 = i + 3;
                if ((a & 128) != 0) {
                    int i3 = 0;
                    while (((a << i3) & 128) != 0) {
                        i3++;
                    }
                    if (i3 < 2 || i3 > 4) {
                        throw new UnsupportedEncodingException();
                    }
                    byte[] bArr = new byte[i3];
                    bArr[0] = a;
                    int i4 = 1;
                    while (i4 < i3) {
                        byte a2 = a(str, i2);
                        int i5 = i2 + 3;
                        if ((a2 & 192) != 128) {
                            throw new UnsupportedEncodingException();
                        }
                        bArr[i4] = a2;
                        i4++;
                        i2 = i5;
                    }
                    CharSequence decode = forName.decode(ByteBuffer.wrap(bArr));
                    if (decode.length() != 1 || str2.indexOf(decode.charAt(0)) == -1) {
                        stringBuilder.append(decode);
                        i = i2;
                    } else {
                        stringBuilder.append(str.substring(i, i2));
                        i = i2;
                    }
                } else if (str2.indexOf(a) == -1) {
                    stringBuilder.append((char) a);
                    i = i2;
                } else {
                    stringBuilder.append(str.substring(i2 - 3, i2));
                    i = i2;
                }
            }
        }
        return stringBuilder.toString();
    }

    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        d.b(eaVarArr != null);
        try {
            return new ej(a(aqf.d(eaVarArr.length > 0 ? (ea) d.a(eaVarArr[0]) : ee.e), "#;/?:@&=+$,"));
        } catch (UnsupportedEncodingException e) {
            return ee.e;
        }
    }
}
