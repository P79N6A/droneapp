package m.framework.b;

public class c {
    private static final char[] a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    protected static int a(char c, int i) {
        int digit = Character.digit(c, 16);
        if (digit != -1) {
            return digit;
        }
        throw new RuntimeException("Illegal hexadecimal charcter " + c + " at index " + i);
    }

    public static String a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < bArr.length; i++) {
            stringBuffer.append(String.format("%02x", new Object[]{Byte.valueOf(bArr[i])}));
        }
        return stringBuffer.toString();
    }

    public static byte[] a(String str) {
        byte[] bArr = null;
        if (str != null) {
            int length = str.length();
            if (length % 2 != 1) {
                int i = length / 2;
                bArr = new byte[i];
                for (length = 0; length < i; length++) {
                    bArr[length] = (byte) Integer.parseInt(str.substring(length * 2, (length * 2) + 2), 16);
                }
            }
        }
        return bArr;
    }

    public static byte[] a(char[] cArr) {
        int i = 0;
        int length = cArr.length;
        if ((length & 1) != 0) {
            throw new RuntimeException("Odd number of characters.");
        }
        byte[] bArr = new byte[(length >> 1)];
        int i2 = 0;
        while (i < length) {
            i++;
            i++;
            bArr[i2] = (byte) (((a(cArr[i], i) << 4) | a(cArr[i], i)) & 255);
            i2++;
        }
        return bArr;
    }

    public static String b(byte[] bArr) {
        return new String(c(bArr));
    }

    public static byte[] b(String str) {
        return a(str.toCharArray());
    }

    public static char[] c(byte[] bArr) {
        int i = 0;
        int length = bArr.length;
        char[] cArr = new char[(length << 1)];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i + 1;
            cArr[i] = a[(bArr[i2] & 240) >>> 4];
            i = i3 + 1;
            cArr[i3] = a[bArr[i2] & 15];
        }
        return cArr;
    }

    public byte[] a(Object obj) {
        try {
            return a(obj instanceof String ? ((String) obj).toCharArray() : (char[]) obj);
        } catch (ClassCastException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public char[] b(Object obj) {
        try {
            return c(obj instanceof String ? ((String) obj).getBytes() : (byte[]) obj);
        } catch (ClassCastException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public byte[] d(byte[] bArr) {
        return a(new String(bArr).toCharArray());
    }

    public byte[] e(byte[] bArr) {
        return new String(c(bArr)).getBytes();
    }
}
