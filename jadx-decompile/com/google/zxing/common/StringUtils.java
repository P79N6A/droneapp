package com.google.zxing.common;

import com.google.zxing.DecodeHintType;
import java.util.Hashtable;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;
import org.codehaus.jackson.smile.SmileConstants;

public final class StringUtils {
    private static final boolean ASSUME_SHIFT_JIS;
    private static final String EUC_JP = "EUC_JP";
    private static final String ISO88591 = "ISO8859_1";
    private static final String PLATFORM_DEFAULT_ENCODING = System.getProperty("file.encoding");
    public static final String SHIFT_JIS = "SJIS";
    private static final String UTF8 = "UTF-8";

    static {
        boolean z = SHIFT_JIS.equalsIgnoreCase(PLATFORM_DEFAULT_ENCODING) || EUC_JP.equalsIgnoreCase(PLATFORM_DEFAULT_ENCODING);
        ASSUME_SHIFT_JIS = z;
    }

    private StringUtils() {
    }

    public static String guessEncoding(byte[] bArr, Hashtable hashtable) {
        if (hashtable != null) {
            String str = (String) hashtable.get(DecodeHintType.CHARACTER_SET);
            if (str != null) {
                return str;
            }
        }
        if (bArr.length > 3 && bArr[0] == (byte) -17 && bArr[1] == (byte) -69 && bArr[2] == (byte) -65) {
            return "UTF-8";
        }
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        Object obj = null;
        Object obj2 = null;
        int i3 = 0;
        Object obj3 = null;
        int i4 = 0;
        Object obj4 = 1;
        Object obj5 = 1;
        Object obj6 = 1;
        while (i3 < length && (obj6 != null || obj5 != null || obj4 != null)) {
            Object obj7;
            int i5;
            Object obj8;
            int i6 = bArr[i3] & 255;
            if (i6 < 128 || i6 > Opcodes.ATHROW) {
                obj7 = i > 0 ? null : obj4;
                if (i6 >= 192 && i6 <= 253) {
                    int i7 = i;
                    i = i6;
                    while ((i & 64) != 0) {
                        i <<= 1;
                        i7++;
                    }
                    i = i7;
                    i7 = 1;
                }
            } else if (i > 0) {
                i--;
                obj7 = obj4;
            } else {
                obj7 = obj4;
            }
            if ((i6 == Opcodes.MONITORENTER || i6 == Opcodes.MONITOREXIT) && i3 < length - 1) {
                i5 = bArr[i3 + 1] & 255;
                if (i5 <= Opcodes.ATHROW && ((i6 == Opcodes.MONITORENTER && i5 >= 160) || (i6 == Opcodes.MONITOREXIT && i5 >= 128))) {
                    obj = 1;
                }
            }
            if (i6 >= 127 && i6 <= Opcodes.IF_ICMPEQ) {
                obj6 = null;
            }
            if (i6 >= Opcodes.IF_ICMPLT && i6 <= 223 && obj3 == null) {
                i2++;
            }
            obj4 = (obj3 == null && ((i6 >= 240 && i6 <= 255) || i6 == 128 || i6 == 160)) ? null : obj5;
            if ((i6 < 129 || i6 > Opcodes.IF_ICMPEQ) && (i6 < 224 || i6 > 239)) {
                obj5 = obj4;
                i5 = i4;
                obj8 = null;
            } else if (obj3 != null) {
                obj5 = obj4;
                i5 = i4;
                obj8 = null;
            } else if (i3 >= bArr.length - 1) {
                obj5 = null;
                i5 = i4;
                i4 = 1;
            } else {
                i6 = bArr[i3 + 1] & 255;
                if (i6 < 64 || i6 > SmileConstants.INT_MARKER_END_OF_STRING) {
                    obj4 = null;
                } else {
                    i4++;
                }
                obj5 = obj4;
                i5 = i4;
                i4 = 1;
            }
            i3++;
            obj3 = obj8;
            i4 = i5;
            obj4 = obj7;
        }
        if (i > 0) {
            obj4 = null;
        }
        return (obj5 == null || !ASSUME_SHIFT_JIS) ? (obj4 == null || obj2 == null) ? (obj5 == null || (i4 < 3 && i2 * 20 <= length)) ? (obj != null || obj6 == null) ? PLATFORM_DEFAULT_ENCODING : ISO88591 : SHIFT_JIS : "UTF-8" : SHIFT_JIS;
    }
}
