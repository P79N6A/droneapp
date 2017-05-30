package com.google.zxing.client.result;

import com.google.zxing.Result;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Vector;
import org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor;

final class VCardResultParser extends ResultParser {
    private VCardResultParser() {
    }

    private static String decodeQuotedPrintable(String str, String str2) {
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer(length);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            switch (charAt) {
                case '\n':
                case '\r':
                    break;
                case '=':
                    if (i >= length - 2) {
                        break;
                    }
                    charAt = str.charAt(i + 1);
                    if (!(charAt == l.a || charAt == '\n')) {
                        try {
                            byteArrayOutputStream.write((toHexValue(charAt) * 16) + toHexValue(str.charAt(i + 2)));
                        } catch (IllegalArgumentException e) {
                        }
                        i += 2;
                        break;
                    }
                default:
                    maybeAppendFragment(byteArrayOutputStream, str2, stringBuffer);
                    stringBuffer.append(charAt);
                    break;
            }
            i++;
        }
        maybeAppendFragment(byteArrayOutputStream, str2, stringBuffer);
        return stringBuffer.toString();
    }

    private static String formatAddress(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer(length);
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == ';') {
                stringBuffer.append(l.c);
            } else {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString().trim();
    }

    private static void formatNames(String[] strArr) {
        if (strArr != null) {
            for (int i = 0; i < strArr.length; i++) {
                String str = strArr[i];
                String[] strArr2 = new String[5];
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    int indexOf = str.indexOf(59, i3);
                    if (indexOf <= 0) {
                        break;
                    }
                    strArr2[i2] = str.substring(i3, indexOf);
                    i2++;
                    i3 = indexOf + 1;
                }
                strArr2[i2] = str.substring(i3);
                StringBuffer stringBuffer = new StringBuffer(100);
                maybeAppendComponent(strArr2, 3, stringBuffer);
                maybeAppendComponent(strArr2, 1, stringBuffer);
                maybeAppendComponent(strArr2, 2, stringBuffer);
                maybeAppendComponent(strArr2, 0, stringBuffer);
                maybeAppendComponent(strArr2, 4, stringBuffer);
                strArr[i] = stringBuffer.toString().trim();
            }
        }
    }

    private static boolean isLikeVCardDate(String str) {
        return (str == null || ResultParser.isStringOfDigits(str, 8)) ? true : str.length() == 10 && str.charAt(4) == SignatureVisitor.SUPER && str.charAt(7) == SignatureVisitor.SUPER && ResultParser.isSubstringOfDigits(str, 0, 4) && ResultParser.isSubstringOfDigits(str, 5, 2) && ResultParser.isSubstringOfDigits(str, 8, 2);
    }

    static String matchSingleVCardPrefixedField(String str, String str2, boolean z) {
        String[] matchVCardPrefixedField = matchVCardPrefixedField(str, str2, z);
        return matchVCardPrefixedField == null ? null : matchVCardPrefixedField[0];
    }

    private static String[] matchVCardPrefixedField(String str, String str2, boolean z) {
        Vector vector = null;
        int i = 0;
        int length = str2.length();
        while (i < length) {
            int indexOf = str2.indexOf(str, i);
            if (indexOf < 0) {
                break;
            } else if (indexOf <= 0 || str2.charAt(indexOf - 1) == '\n') {
                i = str.length() + indexOf;
                if (str2.charAt(i) == ':' || str2.charAt(i) == ';') {
                    int i2;
                    String str3;
                    String substring;
                    Vector vector2;
                    int i3;
                    indexOf = i;
                    while (str2.charAt(indexOf) != ':') {
                        indexOf++;
                    }
                    Object obj = null;
                    if (indexOf > i) {
                        int i4 = i + 1;
                        i2 = i;
                        str3 = null;
                        while (i4 <= indexOf) {
                            if (str2.charAt(i4) == ';' || str2.charAt(i4) == ':') {
                                Object obj2;
                                substring = str2.substring(i2 + 1, i4);
                                int indexOf2 = substring.indexOf(61);
                                if (indexOf2 >= 0) {
                                    String substring2 = substring.substring(0, indexOf2);
                                    substring = substring.substring(indexOf2 + 1);
                                    if (substring2.equalsIgnoreCase("ENCODING")) {
                                        if (substring.equalsIgnoreCase("QUOTED-PRINTABLE")) {
                                            obj2 = 1;
                                            obj = obj2;
                                            i2 = i4;
                                        }
                                    } else if (substring2.equalsIgnoreCase("CHARSET")) {
                                        str3 = substring;
                                        obj2 = obj;
                                        obj = obj2;
                                        i2 = i4;
                                    }
                                }
                                obj2 = obj;
                                obj = obj2;
                                i2 = i4;
                            }
                            i4++;
                        }
                    } else {
                        str3 = null;
                    }
                    i2 = indexOf + 1;
                    indexOf = i2;
                    while (true) {
                        indexOf = str2.indexOf(10, indexOf);
                        if (indexOf < 0) {
                            break;
                        } else if (indexOf >= str2.length() - 1 || (str2.charAt(indexOf + 1) != l.c && str2.charAt(indexOf + 1) != '\t')) {
                            if (obj == null || (str2.charAt(indexOf - 1) != SignatureVisitor.INSTANCEOF && str2.charAt(indexOf - 2) != SignatureVisitor.INSTANCEOF)) {
                                break;
                            }
                            indexOf++;
                        } else {
                            indexOf += 2;
                        }
                    }
                    if (indexOf < 0) {
                        vector2 = vector;
                        i3 = length;
                    } else if (indexOf > i2) {
                        if (vector == null) {
                            vector = new Vector(1);
                        }
                        if (str2.charAt(indexOf - 1) == l.a) {
                            indexOf--;
                        }
                        substring = str2.substring(i2, indexOf);
                        if (z) {
                            substring = substring.trim();
                        }
                        vector.addElement(obj != null ? decodeQuotedPrintable(substring, str3) : stripContinuationCRLF(substring));
                        r9 = indexOf + 1;
                        vector2 = vector;
                        i3 = r9;
                    } else {
                        r9 = indexOf + 1;
                        vector2 = vector;
                        i3 = r9;
                    }
                    i = i3;
                    vector = vector2;
                }
            } else {
                i = indexOf + 1;
            }
        }
        return (vector == null || vector.isEmpty()) ? null : ResultParser.toStringArray(vector);
    }

    private static void maybeAppendComponent(String[] strArr, int i, StringBuffer stringBuffer) {
        if (strArr[i] != null) {
            stringBuffer.append(l.c);
            stringBuffer.append(strArr[i]);
        }
    }

    private static void maybeAppendFragment(ByteArrayOutputStream byteArrayOutputStream, String str, StringBuffer stringBuffer) {
        if (byteArrayOutputStream.size() > 0) {
            String str2;
            byte[] toByteArray = byteArrayOutputStream.toByteArray();
            if (str == null) {
                str2 = new String(toByteArray);
            } else {
                try {
                    str2 = new String(toByteArray, str);
                } catch (UnsupportedEncodingException e) {
                    str2 = new String(toByteArray);
                }
            }
            byteArrayOutputStream.reset();
            stringBuffer.append(str2);
        }
    }

    public static AddressBookParsedResult parse(Result result) {
        int i = 0;
        String text = result.getText();
        if (text == null || !text.startsWith("BEGIN:VCARD")) {
            return null;
        }
        String[] matchVCardPrefixedField = matchVCardPrefixedField("FN", text, true);
        if (matchVCardPrefixedField == null) {
            matchVCardPrefixedField = matchVCardPrefixedField("N", text, true);
            formatNames(matchVCardPrefixedField);
        }
        String[] matchVCardPrefixedField2 = matchVCardPrefixedField("TEL", text, true);
        String[] matchVCardPrefixedField3 = matchVCardPrefixedField("EMAIL", text, true);
        String matchSingleVCardPrefixedField = matchSingleVCardPrefixedField("NOTE", text, false);
        String[] matchVCardPrefixedField4 = matchVCardPrefixedField("ADR", text, true);
        if (matchVCardPrefixedField4 != null) {
            while (i < matchVCardPrefixedField4.length) {
                matchVCardPrefixedField4[i] = formatAddress(matchVCardPrefixedField4[i]);
                i++;
            }
        }
        String matchSingleVCardPrefixedField2 = matchSingleVCardPrefixedField("ORG", text, true);
        String matchSingleVCardPrefixedField3 = matchSingleVCardPrefixedField("BDAY", text, true);
        if (!isLikeVCardDate(matchSingleVCardPrefixedField3)) {
            matchSingleVCardPrefixedField3 = null;
        }
        return new AddressBookParsedResult(matchVCardPrefixedField, null, matchVCardPrefixedField2, matchVCardPrefixedField3, matchSingleVCardPrefixedField, matchVCardPrefixedField4, matchSingleVCardPrefixedField2, matchSingleVCardPrefixedField3, matchSingleVCardPrefixedField("TITLE", text, true), matchSingleVCardPrefixedField("URL", text, true));
    }

    private static String stripContinuationCRLF(String str) {
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer(length);
        Object obj = null;
        for (int i = 0; i < length; i++) {
            if (obj == null) {
                char charAt = str.charAt(i);
                switch (charAt) {
                    case '\n':
                        obj = 1;
                        break;
                    case '\r':
                        obj = null;
                        break;
                    default:
                        stringBuffer.append(charAt);
                        obj = null;
                        break;
                }
            }
            obj = null;
        }
        return stringBuffer.toString();
    }

    private static int toHexValue(char c) {
        if (c >= '0' && c <= '9') {
            return c - 48;
        }
        if (c >= 'A' && c <= 'F') {
            return (c - 65) + 10;
        }
        if (c >= 'a' && c <= 'f') {
            return (c - 97) + 10;
        }
        throw new IllegalArgumentException();
    }
}
