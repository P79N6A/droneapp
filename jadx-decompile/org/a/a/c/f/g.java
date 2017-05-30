package org.a.a.c.f;

import java.util.StringTokenizer;
import org.a.a.a.b;

@b
public class g implements d {
    private static final int a = 36;
    private static final int b = 1;
    private static final int c = 26;
    private static final int d = 38;
    private static final int e = 700;
    private static final int f = 72;
    private static final int g = 128;
    private static final char h = '-';
    private static final String i = "xn--";

    private int a(char c) {
        if (c >= 'A' && c <= 'Z') {
            return c - 65;
        }
        if (c >= 'a' && c <= 'z') {
            return c - 97;
        }
        if (c >= '0' && c <= '9') {
            return (c - 48) + 26;
        }
        throw new IllegalArgumentException("illegal digit: " + c);
    }

    private int a(int i, int i2, boolean z) {
        int i3 = z ? i / 700 : i / 2;
        int i4 = (i3 / i2) + i3;
        i3 = 0;
        while (i4 > 455) {
            i4 /= 35;
            i3 += 36;
        }
        return i3 + ((i4 * 36) / (i4 + 38));
    }

    public String a(String str) {
        StringBuilder stringBuilder = new StringBuilder(str.length());
        StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (stringBuilder.length() > 0) {
                stringBuilder.append('.');
            }
            if (nextToken.startsWith(i)) {
                nextToken = b(nextToken.substring(4));
            }
            stringBuilder.append(nextToken);
        }
        return stringBuilder.toString();
    }

    protected String b(String str) {
        int i;
        int i2 = 72;
        StringBuilder stringBuilder = new StringBuilder(str.length());
        int lastIndexOf = str.lastIndexOf(45);
        if (lastIndexOf != -1) {
            stringBuilder.append(str.subSequence(0, lastIndexOf));
            str = str.substring(lastIndexOf + 1);
            lastIndexOf = 128;
            i = 0;
        } else {
            lastIndexOf = 128;
            i = 0;
        }
        while (str.length() > 0) {
            int i3 = 36;
            int i4 = 1;
            int i5 = i;
            while (str.length() != 0) {
                char charAt = str.charAt(0);
                str = str.substring(1);
                int a = a(charAt);
                i5 += a * i4;
                int i6 = i3 <= i2 + 1 ? 1 : i3 >= i2 + 26 ? 26 : i3 - i2;
                if (a < i6) {
                    break;
                }
                i4 *= 36 - i6;
                i3 += 36;
            }
            i2 = a(i5 - i, stringBuilder.length() + 1, i == 0);
            lastIndexOf += i5 / (stringBuilder.length() + 1);
            i = i5 % (stringBuilder.length() + 1);
            stringBuilder.insert(i, (char) lastIndexOf);
            i++;
        }
        return stringBuilder.toString();
    }
}
