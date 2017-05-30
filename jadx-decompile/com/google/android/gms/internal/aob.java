package com.google.android.gms.internal;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;

class aob {
    private static final Pattern a = Pattern.compile("[.]");
    private static final Inet4Address b = ((Inet4Address) b("127.0.0.1"));
    private static final Inet4Address c = ((Inet4Address) b("0.0.0.0"));

    private static int a(byte b, byte b2, byte b3, byte b4) {
        return (((b << 24) | ((b2 & 255) << 16)) | ((b3 & 255) << 8)) | (b4 & 255);
    }

    private static IllegalArgumentException a(String str, Object... objArr) {
        return new IllegalArgumentException(String.format(Locale.ROOT, str, objArr));
    }

    static String a(InetAddress inetAddress) {
        if (inetAddress instanceof Inet4Address) {
            return inetAddress.getHostAddress();
        }
        byte[] address = inetAddress.getAddress();
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = a((byte) 0, (byte) 0, address[i * 2], address[(i * 2) + 1]);
        }
        a(iArr);
        return b(iArr);
    }

    private static InetAddress a(byte[] bArr) {
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException e) {
            throw new AssertionError(e);
        }
    }

    private static void a(int[] iArr) {
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        while (i < iArr.length + 1) {
            if (i >= iArr.length || iArr[i] != 0) {
                if (i2 >= 0) {
                    int i5 = i - i2;
                    if (i5 > i3) {
                        i3 = i5;
                    } else {
                        i2 = i4;
                    }
                    i4 = i2;
                    i2 = -1;
                }
            } else if (i2 < 0) {
                i2 = i;
            }
            i++;
        }
        if (i3 >= 2) {
            Arrays.fill(iArr, i4, i4 + i3, -1);
        }
    }

    static boolean a(String str) {
        return c(str) != null;
    }

    private static String b(int[] iArr) {
        StringBuilder stringBuilder = new StringBuilder(39);
        int i = 0;
        Object obj = null;
        while (i < iArr.length) {
            Object obj2 = iArr[i] >= 0 ? 1 : null;
            if (obj2 != null) {
                if (obj != null) {
                    stringBuilder.append(':');
                }
                stringBuilder.append(Integer.toHexString(iArr[i]));
            } else if (i == 0 || obj != null) {
                stringBuilder.append("::");
            }
            i++;
            obj = obj2;
        }
        return stringBuilder.toString();
    }

    static InetAddress b(String str) {
        byte[] c = c(str);
        if (c != null) {
            return a(c);
        }
        throw a("'%s' is not an IP string literal.", str);
    }

    private static byte[] c(String str) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt == '.') {
                i2 = 1;
            } else if (charAt == ':') {
                if (i2 != 0) {
                    return null;
                }
                i3 = 1;
            } else if (Character.digit(charAt, 16) == -1) {
                return null;
            }
            i++;
        }
        if (i3 == 0) {
            return i2 != 0 ? e(str) : null;
        } else {
            if (i2 != 0) {
                str = d(str);
                if (str == null) {
                    return null;
                }
            }
            return g(str);
        }
    }

    private static String d(String str) {
        int lastIndexOf = str.lastIndexOf(58);
        String substring = str.substring(0, lastIndexOf + 1);
        byte[] e = e(str.substring(lastIndexOf + 1));
        if (e == null) {
            return null;
        }
        String toHexString = Integer.toHexString(((e[0] & 255) << 8) | (e[1] & 255));
        String toHexString2 = Integer.toHexString((e[3] & 255) | ((e[2] & 255) << 8));
        return new StringBuilder(((String.valueOf(substring).length() + 1) + String.valueOf(toHexString).length()) + String.valueOf(toHexString2).length()).append(substring).append(toHexString).append(":").append(toHexString2).toString();
    }

    private static byte[] e(String str) {
        int i = 0;
        byte[] bArr = new byte[4];
        try {
            String[] split = a.split(str, 4);
            int length = split.length;
            int i2 = 0;
            while (i < length) {
                int i3 = i2 + 1;
                bArr[i2] = f(split[i]);
                i++;
                i2 = i3;
            }
            return i2 != 4 ? null : bArr;
        } catch (NumberFormatException e) {
            return null;
        }
    }

    private static byte f(String str) {
        int parseInt = Integer.parseInt(str);
        if (parseInt <= 255 && (!str.startsWith("0") || str.length() <= 1)) {
            return (byte) parseInt;
        }
        throw new NumberFormatException();
    }

    private static byte[] g(String str) {
        String[] split = str.split(":", 10);
        if (split.length < 3 || split.length > 9) {
            return null;
        }
        int i;
        int length;
        int i2 = -1;
        for (i = 1; i < split.length - 1; i++) {
            if (split[i].length() == 0) {
                if (i2 >= 0) {
                    return null;
                }
                i2 = i;
            }
        }
        if (i2 >= 0) {
            length = (split.length - i2) - 1;
            if (split[0].length() == 0) {
                i = i2 - 1;
                if (i != 0) {
                    return null;
                }
            }
            i = i2;
            if (split[split.length - 1].length() == 0) {
                length--;
                if (length != 0) {
                    return null;
                }
            }
            int i3 = length;
            length = i;
            i = i3;
        } else {
            length = split.length;
            i = 0;
        }
        int i4 = 8 - (length + i);
        if (!i2 < 0 ? i4 >= 1 : i4 == 0) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(16);
        int i5 = 0;
        while (i5 < length) {
            try {
                allocate.putShort(h(split[i5]));
                i5++;
            } catch (NumberFormatException e) {
                return null;
            }
        }
        for (i5 = 0; i5 < i4; i5++) {
            allocate.putShort((short) 0);
        }
        while (i > 0) {
            allocate.putShort(h(split[split.length - i]));
            i--;
        }
        return allocate.array();
    }

    private static short h(String str) {
        int parseInt = Integer.parseInt(str, 16);
        if (parseInt <= 65535) {
            return (short) parseInt;
        }
        throw new NumberFormatException();
    }
}
