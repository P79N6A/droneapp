package org.codehaus.jackson.io;

import com.fimi.soul.utils.m;
import org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor;

public final class NumberOutput {
    private static int BILLION = 1000000000;
    static final char[] FULL_TRIPLETS = new char[4000];
    static final byte[] FULL_TRIPLETS_B = new byte[4000];
    static final char[] LEADING_TRIPLETS = new char[4000];
    private static long MAX_INT_AS_LONG = 2147483647L;
    private static int MILLION = 1000000;
    private static long MIN_INT_AS_LONG = -2147483648L;
    private static final char NULL_CHAR = '\u0000';
    static final String SMALLEST_LONG = String.valueOf(Long.MIN_VALUE);
    private static long TEN_BILLION_L = 10000000000L;
    private static long THOUSAND_L = 1000;
    static final String[] sSmallIntStrs = new String[]{"0", "1", "2", "3", "4", "5", "6", m.l, m.m, m.n, "10"};
    static final String[] sSmallIntStrs2 = new String[]{"-1", "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10"};

    static {
        int i = 0;
        int i2 = 0;
        while (i < 10) {
            char c = (char) (i + 48);
            char c2 = i == 0 ? '\u0000' : c;
            int i3 = 0;
            while (i3 < 10) {
                char c3 = (char) (i3 + 48);
                char c4 = (i == 0 && i3 == 0) ? '\u0000' : c3;
                int i4 = i2;
                for (i2 = 0; i2 < 10; i2++) {
                    char c5 = (char) (i2 + 48);
                    LEADING_TRIPLETS[i4] = c2;
                    LEADING_TRIPLETS[i4 + 1] = c4;
                    LEADING_TRIPLETS[i4 + 2] = c5;
                    FULL_TRIPLETS[i4] = c;
                    FULL_TRIPLETS[i4 + 1] = c3;
                    FULL_TRIPLETS[i4 + 2] = c5;
                    i4 += 4;
                }
                i3++;
                i2 = i4;
            }
            i++;
        }
        for (int i5 = 0; i5 < 4000; i5++) {
            FULL_TRIPLETS_B[i5] = (byte) FULL_TRIPLETS[i5];
        }
    }

    private static int calcLongStrLength(long j) {
        int i = 10;
        for (long j2 = TEN_BILLION_L; j >= j2 && i != 19; j2 = (j2 << 1) + (j2 << 3)) {
            i++;
        }
        return i;
    }

    private static int outputFullTriplet(int i, byte[] bArr, int i2) {
        int i3 = i << 2;
        int i4 = i2 + 1;
        int i5 = i3 + 1;
        bArr[i2] = FULL_TRIPLETS_B[i3];
        i3 = i4 + 1;
        int i6 = i5 + 1;
        bArr[i4] = FULL_TRIPLETS_B[i5];
        i4 = i3 + 1;
        bArr[i3] = FULL_TRIPLETS_B[i6];
        return i4;
    }

    private static int outputFullTriplet(int i, char[] cArr, int i2) {
        int i3 = i << 2;
        int i4 = i2 + 1;
        int i5 = i3 + 1;
        cArr[i2] = FULL_TRIPLETS[i3];
        i3 = i4 + 1;
        int i6 = i5 + 1;
        cArr[i4] = FULL_TRIPLETS[i5];
        i4 = i3 + 1;
        cArr[i3] = FULL_TRIPLETS[i6];
        return i4;
    }

    public static int outputInt(int i, byte[] bArr, int i2) {
        if (i < 0) {
            if (i == Integer.MIN_VALUE) {
                return outputLong((long) i, bArr, i2);
            }
            int i3 = i2 + 1;
            bArr[i2] = (byte) 45;
            i = -i;
            i2 = i3;
        }
        if (i >= MILLION) {
            Object obj = i >= BILLION ? 1 : null;
            if (obj != null) {
                i -= BILLION;
                if (i >= BILLION) {
                    i -= BILLION;
                    i3 = i2 + 1;
                    bArr[i2] = (byte) 50;
                    i2 = i3;
                } else {
                    i3 = i2 + 1;
                    bArr[i2] = (byte) 49;
                    i2 = i3;
                }
            }
            i3 = i / 1000;
            int i4 = i3 / 1000;
            return outputFullTriplet(i - (i3 * 1000), bArr, outputFullTriplet(i3 - (i4 * 1000), bArr, obj != null ? outputFullTriplet(i4, bArr, i2) : outputLeadingTriplet(i4, bArr, i2)));
        } else if (i >= 1000) {
            i3 = i / 1000;
            return outputFullTriplet(i - (i3 * 1000), bArr, outputLeadingTriplet(i3, bArr, i2));
        } else if (i >= 10) {
            return outputLeadingTriplet(i, bArr, i2);
        } else {
            i3 = i2 + 1;
            bArr[i2] = (byte) (i + 48);
            return i3;
        }
    }

    public static int outputInt(int i, char[] cArr, int i2) {
        if (i < 0) {
            if (i == Integer.MIN_VALUE) {
                return outputLong((long) i, cArr, i2);
            }
            int i3 = i2 + 1;
            cArr[i2] = SignatureVisitor.SUPER;
            i = -i;
            i2 = i3;
        }
        if (i >= MILLION) {
            Object obj = i >= BILLION ? 1 : null;
            if (obj != null) {
                i -= BILLION;
                if (i >= BILLION) {
                    i -= BILLION;
                    i3 = i2 + 1;
                    cArr[i2] = '2';
                    i2 = i3;
                } else {
                    i3 = i2 + 1;
                    cArr[i2] = '1';
                    i2 = i3;
                }
            }
            i3 = i / 1000;
            int i4 = i3 / 1000;
            return outputFullTriplet(i - (i3 * 1000), cArr, outputFullTriplet(i3 - (i4 * 1000), cArr, obj != null ? outputFullTriplet(i4, cArr, i2) : outputLeadingTriplet(i4, cArr, i2)));
        } else if (i >= 1000) {
            i3 = i / 1000;
            return outputFullTriplet(i - (i3 * 1000), cArr, outputLeadingTriplet(i3, cArr, i2));
        } else if (i >= 10) {
            return outputLeadingTriplet(i, cArr, i2);
        } else {
            i3 = i2 + 1;
            cArr[i2] = (char) (i + 48);
            return i3;
        }
    }

    private static int outputLeadingTriplet(int i, byte[] bArr, int i2) {
        int i3 = i << 2;
        int i4 = i3 + 1;
        char c = LEADING_TRIPLETS[i3];
        if (c != '\u0000') {
            i3 = i2 + 1;
            bArr[i2] = (byte) c;
            i2 = i3;
        }
        int i5 = i4 + 1;
        char c2 = LEADING_TRIPLETS[i4];
        if (c2 != '\u0000') {
            i3 = i2 + 1;
            bArr[i2] = (byte) c2;
            i2 = i3;
        }
        i3 = i2 + 1;
        bArr[i2] = (byte) LEADING_TRIPLETS[i5];
        return i3;
    }

    private static int outputLeadingTriplet(int i, char[] cArr, int i2) {
        int i3 = i << 2;
        int i4 = i3 + 1;
        char c = LEADING_TRIPLETS[i3];
        if (c != '\u0000') {
            i3 = i2 + 1;
            cArr[i2] = c;
            i2 = i3;
        }
        int i5 = i4 + 1;
        char c2 = LEADING_TRIPLETS[i4];
        if (c2 != '\u0000') {
            i3 = i2 + 1;
            cArr[i2] = c2;
            i2 = i3;
        }
        i3 = i2 + 1;
        cArr[i2] = LEADING_TRIPLETS[i5];
        return i3;
    }

    public static int outputLong(long j, byte[] bArr, int i) {
        int length;
        int i2;
        int i3;
        if (j < 0) {
            if (j > MIN_INT_AS_LONG) {
                return outputInt((int) j, bArr, i);
            }
            if (j == Long.MIN_VALUE) {
                length = SMALLEST_LONG.length();
                i2 = 0;
                i3 = i;
                while (i2 < length) {
                    i = i3 + 1;
                    bArr[i3] = (byte) SMALLEST_LONG.charAt(i2);
                    i2++;
                    i3 = i;
                }
                return i3;
            }
            i2 = i + 1;
            bArr[i] = (byte) 45;
            j = -j;
            i = i2;
        } else if (j <= MAX_INT_AS_LONG) {
            return outputInt((int) j, bArr, i);
        }
        i3 = i + calcLongStrLength(j);
        i2 = i3;
        while (j > MAX_INT_AS_LONG) {
            i2 -= 3;
            long j2 = j / THOUSAND_L;
            outputFullTriplet((int) (j - (THOUSAND_L * j2)), bArr, i2);
            j = j2;
        }
        length = i2;
        i2 = (int) j;
        while (i2 >= 1000) {
            int i4 = length - 3;
            length = i2 / 1000;
            outputFullTriplet(i2 - (length * 1000), bArr, i4);
            i2 = length;
            length = i4;
        }
        outputLeadingTriplet(i2, bArr, i);
        return i3;
    }

    public static int outputLong(long j, char[] cArr, int i) {
        int length;
        if (j < 0) {
            if (j > MIN_INT_AS_LONG) {
                return outputInt((int) j, cArr, i);
            }
            if (j == Long.MIN_VALUE) {
                length = SMALLEST_LONG.length();
                SMALLEST_LONG.getChars(0, length, cArr, i);
                return i + length;
            }
            length = i + 1;
            cArr[i] = SignatureVisitor.SUPER;
            j = -j;
            i = length;
        } else if (j <= MAX_INT_AS_LONG) {
            return outputInt((int) j, cArr, i);
        }
        int calcLongStrLength = i + calcLongStrLength(j);
        length = calcLongStrLength;
        while (j > MAX_INT_AS_LONG) {
            length -= 3;
            long j2 = j / THOUSAND_L;
            outputFullTriplet((int) (j - (THOUSAND_L * j2)), cArr, length);
            j = j2;
        }
        int i2 = length;
        length = (int) j;
        while (length >= 1000) {
            int i3 = i2 - 3;
            i2 = length / 1000;
            outputFullTriplet(length - (i2 * 1000), cArr, i3);
            length = i2;
            i2 = i3;
        }
        outputLeadingTriplet(length, cArr, i);
        return calcLongStrLength;
    }

    public static String toString(double d) {
        return Double.toString(d);
    }

    public static String toString(int i) {
        if (i < sSmallIntStrs.length) {
            if (i >= 0) {
                return sSmallIntStrs[i];
            }
            int i2 = (-i) - 1;
            if (i2 < sSmallIntStrs2.length) {
                return sSmallIntStrs2[i2];
            }
        }
        return Integer.toString(i);
    }

    public static String toString(long j) {
        return (j > 2147483647L || j < -2147483648L) ? Long.toString(j) : toString((int) j);
    }
}