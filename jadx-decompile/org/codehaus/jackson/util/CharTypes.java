package org.codehaus.jackson.util;

import java.util.Arrays;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;

public final class CharTypes {
    private static final byte[] HEX_BYTES;
    private static final char[] HEX_CHARS = "0123456789ABCDEF".toCharArray();
    static final int[] sHexValues = new int[128];
    static final int[] sInputCodes;
    static final int[] sInputCodesComment = new int[256];
    static final int[] sInputCodesJsNames;
    static final int[] sInputCodesUtf8;
    static final int[] sInputCodesUtf8JsNames;
    static final int[] sOutputEscapes128;

    static {
        int i;
        int length = HEX_CHARS.length;
        HEX_BYTES = new byte[length];
        for (i = 0; i < length; i++) {
            HEX_BYTES[i] = (byte) HEX_CHARS[i];
        }
        int[] iArr = new int[256];
        for (i = 0; i < 32; i++) {
            iArr[i] = -1;
        }
        iArr[34] = 1;
        iArr[92] = 1;
        sInputCodes = iArr;
        Object obj = new int[sInputCodes.length];
        System.arraycopy(sInputCodes, 0, obj, 0, sInputCodes.length);
        for (length = 128; length < 256; length++) {
            i = (length & 224) == 192 ? 2 : (length & 240) == 224 ? 3 : (length & 248) == 240 ? 4 : -1;
            obj[length] = i;
        }
        sInputCodesUtf8 = obj;
        iArr = new int[256];
        Arrays.fill(iArr, -1);
        for (i = 33; i < 256; i++) {
            if (Character.isJavaIdentifierPart((char) i)) {
                iArr[i] = 0;
            }
        }
        iArr[64] = 0;
        iArr[35] = 0;
        iArr[42] = 0;
        iArr[45] = 0;
        iArr[43] = 0;
        sInputCodesJsNames = iArr;
        Object obj2 = new int[256];
        System.arraycopy(sInputCodesJsNames, 0, obj2, 0, sInputCodesJsNames.length);
        Arrays.fill(obj2, 128, 128, 0);
        sInputCodesUtf8JsNames = obj2;
        System.arraycopy(sInputCodesUtf8, 128, sInputCodesComment, 128, 128);
        Arrays.fill(sInputCodesComment, 0, 32, -1);
        sInputCodesComment[9] = 0;
        sInputCodesComment[10] = 10;
        sInputCodesComment[13] = 13;
        sInputCodesComment[42] = 42;
        iArr = new int[128];
        for (i = 0; i < 32; i++) {
            iArr[i] = -1;
        }
        iArr[34] = 34;
        iArr[92] = 92;
        iArr[8] = 98;
        iArr[9] = Opcodes.INEG;
        iArr[12] = 102;
        iArr[10] = 110;
        iArr[13] = 114;
        sOutputEscapes128 = iArr;
        Arrays.fill(sHexValues, -1);
        for (i = 0; i < 10; i++) {
            sHexValues[i + 48] = i;
        }
        for (i = 0; i < 6; i++) {
            sHexValues[i + 97] = i + 10;
            sHexValues[i + 65] = i + 10;
        }
    }

    public static void appendQuoted(StringBuilder stringBuilder, String str) {
        int[] iArr = sOutputEscapes128;
        char length = iArr.length;
        int length2 = str.length();
        for (int i = 0; i < length2; i++) {
            char charAt = str.charAt(i);
            if (charAt >= length || iArr[charAt] == 0) {
                stringBuilder.append(charAt);
            } else {
                stringBuilder.append(l.f);
                int i2 = iArr[charAt];
                if (i2 < 0) {
                    stringBuilder.append('u');
                    stringBuilder.append('0');
                    stringBuilder.append('0');
                    i2 = -(i2 + 1);
                    stringBuilder.append(HEX_CHARS[i2 >> 4]);
                    stringBuilder.append(HEX_CHARS[i2 & 15]);
                } else {
                    stringBuilder.append((char) i2);
                }
            }
        }
    }

    public static int charToHex(int i) {
        return i > 127 ? -1 : sHexValues[i];
    }

    public static byte[] copyHexBytes() {
        return (byte[]) HEX_BYTES.clone();
    }

    public static char[] copyHexChars() {
        return (char[]) HEX_CHARS.clone();
    }

    public static final int[] get7BitOutputEscapes() {
        return sOutputEscapes128;
    }

    public static final int[] getInputCodeComment() {
        return sInputCodesComment;
    }

    public static final int[] getInputCodeLatin1() {
        return sInputCodes;
    }

    public static final int[] getInputCodeLatin1JsNames() {
        return sInputCodesJsNames;
    }

    public static final int[] getInputCodeUtf8() {
        return sInputCodesUtf8;
    }

    public static final int[] getInputCodeUtf8JsNames() {
        return sInputCodesUtf8JsNames;
    }
}
