package m.framework.b;

import java.net.URLEncoder;
import java.security.Key;
import java.security.MessageDigest;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class a {
    private static final String a = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static d b = new d();

    public static String a(long j) {
        String str = j == 0 ? "0" : "";
        while (j > 0) {
            int i = (int) (j % 62);
            j /= 62;
            str = new StringBuilder(String.valueOf(a.charAt(i))).append(str).toString();
        }
        return str;
    }

    public static String a(String str, byte[] bArr) {
        return new String(a(str.getBytes("UTF-8"), bArr), "UTF-8");
    }

    public static String a(HashMap<String, Object> hashMap) {
        return b.a((HashMap) hashMap);
    }

    public static String a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < bArr.length; i++) {
            stringBuffer.append(String.format("%02x", new Object[]{Byte.valueOf(bArr[i])}));
        }
        return stringBuffer.toString();
    }

    public static byte[] a(String str) {
        byte[] bytes = str.getBytes("utf-8");
        MessageDigest instance = MessageDigest.getInstance("SHA-1");
        instance.update(bytes);
        return instance.digest();
    }

    public static byte[] a(String str, String str2) {
        Object bytes = str.getBytes("UTF-8");
        Object obj = new byte[16];
        System.arraycopy(bytes, 0, obj, 0, Math.min(bytes.length, 16));
        byte[] bytes2 = str2.getBytes("UTF-8");
        Key secretKeySpec = new SecretKeySpec(obj, "AES");
        Cipher instance = Cipher.getInstance("AES/ECB/PKCS7Padding", "BC");
        instance.init(1, secretKeySpec);
        byte[] bArr = new byte[instance.getOutputSize(bytes2.length)];
        instance.doFinal(bArr, instance.update(bytes2, 0, bytes2.length, bArr, 0));
        return bArr;
    }

    public static byte[] a(byte[] bArr, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        Key secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher instance = Cipher.getInstance("AES/ECB/PKCS7Padding", "BC");
        instance.init(1, secretKeySpec);
        byte[] bArr2 = new byte[instance.getOutputSize(bytes.length)];
        instance.doFinal(bArr2, instance.update(bytes, 0, bytes.length, bArr2, 0));
        return bArr2;
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        Object obj = new byte[16];
        System.arraycopy(bArr, 0, obj, 0, Math.min(bArr.length, 16));
        Key secretKeySpec = new SecretKeySpec(obj, "AES");
        Cipher instance = Cipher.getInstance("AES/ECB/NoPadding", "BC");
        instance.init(2, secretKeySpec);
        byte[] bArr3 = new byte[instance.getOutputSize(bArr2.length)];
        int update = instance.update(bArr2, 0, bArr2.length, bArr3, 0);
        int doFinal = instance.doFinal(bArr3, update) + update;
        return bArr3;
    }

    public static String b(String str, String str2) {
        return URLEncoder.encode(str, str2).replace("\\+", "%20");
    }

    public static HashMap<String, Object> b(String str) {
        return b.a(str);
    }

    public static String c(String str) {
        if (str == null) {
            return null;
        }
        byte[] d = d(str);
        return d != null ? c.a(d) : null;
    }

    public static byte[] d(String str) {
        byte[] bArr = null;
        if (str != null) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(str.getBytes("utf-8"));
                bArr = instance.digest();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return bArr;
    }
}
