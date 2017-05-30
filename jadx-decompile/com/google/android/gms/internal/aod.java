package com.google.android.gms.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.common.util.UriUtil;
import com.tencent.mm.sdk.contact.RContact;
import com.xiaomi.market.sdk.j;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class aod {
    private static final String a = aod.class.getSimpleName();
    private static final char[] b = "0123456789ABCDEF".toCharArray();
    private static final Pattern c = Pattern.compile("/\\.\\.");
    private static final Pattern d = Pattern.compile("0[1-7][0-7]*");
    private static final Pattern e = Pattern.compile("0x[0-9a-f]*", 2);
    private static final Pattern f = Pattern.compile("^((?:0x[0-9a-f]+|[0-9\\\\.])+)$", 2);
    private final String g;
    private final String h;
    private final String i;
    private final int j;
    private final String k;
    private final String l;

    private static class a {
        private static final String[] a = new String[]{UriUtil.HTTP_SCHEME, UriUtil.HTTPS_SCHEME, "ftp"};
        private final String b;
        private final Uri c;
        private final URI d;
        private final String e;
        private final Boolean f;
        private final Integer g;

        private a(String str) {
            this.b = str;
            this.c = Uri.parse(this.b);
            try {
                URI uri = new URI(this.b);
            } catch (URISyntaxException e) {
            } finally {
                this.d = null;
            }
            this.e = a();
            this.f = Boolean.valueOf(d());
            this.g = Integer.valueOf(c());
        }

        private String a() {
            if (this.e != null) {
                return this.e;
            }
            String scheme = this.c != null ? this.c.getScheme() : null;
            if (TextUtils.isEmpty(scheme)) {
            }
            if (TextUtils.isEmpty(scheme) && !TextUtils.isEmpty(this.b)) {
                int indexOf = this.b.indexOf(":");
                if (indexOf != -1) {
                    String toLowerCase = this.b.substring(0, indexOf).toLowerCase(Locale.US);
                    if (a(toLowerCase)) {
                        scheme = toLowerCase;
                    }
                }
                if (TextUtils.isEmpty(scheme)) {
                    scheme = this.b.startsWith("www.") ? UriUtil.HTTP_SCHEME : UriUtil.HTTP_SCHEME;
                }
            }
            return scheme != null ? scheme.toLowerCase(Locale.US) : null;
        }

        private static boolean a(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            for (String equals : a) {
                if (equals.equals(str)) {
                    return true;
                }
            }
            return false;
        }

        private int b() {
            return this.g.intValue();
        }

        private int c() {
            if (this.g != null) {
                return this.g.intValue();
            }
            if (this.c != null) {
                int port = this.c.getPort();
                if (port != -1) {
                    return port;
                }
            }
            return -1;
        }

        private boolean d() {
            return this.f != null ? this.f.booleanValue() : a(this.e);
        }
    }

    public aod(String str) {
        if (e(str)) {
            String replaceAll = str.replaceAll("^\\s+", "").replaceAll("\\s+$", "").replaceAll("[\\t\\n\\r]", "");
            int indexOf = replaceAll.indexOf(35);
            if (indexOf != -1) {
                replaceAll = replaceAll.substring(0, indexOf);
            }
            a aVar = new a(replaceAll);
            if (aVar.d()) {
                String str2;
                this.h = aVar.a();
                this.j = aVar.b();
                if (this.h != null) {
                    str2 = this.h;
                    replaceAll = replaceAll.replaceAll(new StringBuilder(String.valueOf(str2).length() + 2).append("^").append(str2).append(":").toString(), "");
                }
                str2 = g(replaceAll.replaceAll("^/+", ""));
                int indexOf2 = str2.indexOf(63);
                if (indexOf2 != -1) {
                    int i = indexOf2 + 1;
                    replaceAll = i < str2.length() ? str2.substring(i) : "";
                    str2 = str2.substring(0, indexOf2);
                } else {
                    replaceAll = null;
                }
                Object a = a(str2);
                if (TextUtils.isEmpty(a)) {
                    this.g = null;
                    this.i = null;
                    this.k = null;
                    this.l = null;
                    return;
                }
                String d = d(str2);
                this.i = f(a);
                this.k = f(d);
                if (!TextUtils.isEmpty(replaceAll)) {
                    replaceAll = f(replaceAll);
                }
                this.l = replaceAll;
                this.g = str2;
                return;
            }
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = -1;
            this.k = null;
            this.l = null;
            return;
        }
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = -1;
        this.k = null;
        this.l = null;
    }

    private static Byte a(byte[] bArr, int i) {
        if (i + 2 >= bArr.length || ((char) (bArr[i] & 255)) != '%') {
            return null;
        }
        char c = (char) (bArr[i + 1] & 255);
        char c2 = (char) (bArr[i + 2] & 255);
        return (a(c) && a(c2)) ? Byte.valueOf((byte) ((Integer.parseInt(c, 16) * 16) + Integer.parseInt(c2, 16))) : null;
    }

    private String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int indexOf = str.indexOf(47);
        if (indexOf != -1) {
            str = str.substring(0, indexOf);
        }
        indexOf = str.indexOf(64);
        if (indexOf != -1) {
            str = str.substring(indexOf + 1);
        }
        if (this.j != -1) {
            str = str.replaceAll(":" + this.j + RContact.FAVOUR_CONTACT_SHOW_HEAD_CHAR, "");
        }
        String replaceAll = str.replaceAll("^\\.*", "").replaceAll("\\.*$", "").replaceAll("\\.+", ".");
        String b = b(replaceAll);
        if (b == null) {
            b = replaceAll;
        }
        return b.toLowerCase(Locale.getDefault());
    }

    private static final void a(Exception exception) {
    }

    private static boolean a(char c) {
        return (c >= '0' && c <= '9') || ((c >= 'A' && c <= 'F') || (c >= 'a' && c <= 'f'));
    }

    private static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String replaceAll = str.replaceAll("^\\[", "").replaceAll("\\]$", "");
        String a;
        if (aob.a(replaceAll)) {
            a = aob.a(aob.b(replaceAll));
            if (!a.contains(":")) {
                return a;
            }
            return String.format("[%s]", new Object[]{a});
        } else if (TextUtils.isDigitsOnly(str)) {
            CharSequence c = c(str);
            return !TextUtils.isEmpty(c) ? c : null;
        } else if (!f.matcher(replaceAll).find()) {
            return null;
        } else {
            Matcher matcher = d.matcher(replaceAll);
            StringBuffer stringBuffer = new StringBuffer();
            while (matcher.find()) {
                matcher.appendReplacement(stringBuffer, Integer.parseInt(matcher.group(), 8));
            }
            matcher.appendTail(stringBuffer);
            matcher = e.matcher(stringBuffer.toString());
            stringBuffer = new StringBuffer();
            while (matcher.find()) {
                matcher.appendReplacement(stringBuffer, Integer.parseInt(matcher.group().substring(2), 16));
            }
            matcher.appendTail(stringBuffer);
            a = stringBuffer.toString();
            if (!a.contains(":")) {
                return a;
            }
            return String.format("[%s]", new Object[]{a});
        }
    }

    private static String c(String str) {
        int i = 0;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            BigInteger bigInteger = new BigInteger(str);
            byte[] toByteArray = bigInteger.toByteArray();
            if (toByteArray.length < 4) {
                return null;
            }
            if (bigInteger.equals(new BigInteger(new byte[]{(byte) 0, r4[0], r4[1], r4[2], Arrays.copyOfRange(toByteArray, toByteArray.length - 4, toByteArray.length)[3]}))) {
                return Inet4Address.getByAddress(Arrays.copyOfRange(toByteArray, toByteArray.length - 4, toByteArray.length)).getHostAddress();
            }
            byte[] copyOfRange;
            if (toByteArray.length >= 16) {
                copyOfRange = Arrays.copyOfRange(toByteArray, toByteArray.length - 16, toByteArray.length);
            } else {
                copyOfRange = new byte[16];
                int length = 16 - toByteArray.length;
                int i2 = 1;
                int i3 = 0;
                while (i2 <= length) {
                    int i4 = i3 + 1;
                    copyOfRange[i3] = (byte) 0;
                    i2++;
                    i3 = i4;
                }
                while (i < toByteArray.length) {
                    i2 = i3 + 1;
                    copyOfRange[i3] = toByteArray[i];
                    i++;
                    i3 = i2;
                }
            }
            return String.format("[%s]", new Object[]{Inet6Address.getByAddress(copyOfRange).getHostAddress()});
        } catch (Exception e) {
            a(e);
            return null;
        } catch (Exception e2) {
            a(e2);
            return null;
        } catch (Exception e22) {
            a(e22);
            return null;
        }
    }

    private List<String> c() {
        if (TextUtils.isEmpty(this.i)) {
            return null;
        }
        List<String> arrayList = new ArrayList();
        char[] toCharArray = this.i.toCharArray();
        Object obj = null;
        for (int length = toCharArray.length - 2; length > 0 && arrayList.size() < 4; length--) {
            if (toCharArray[length] == '.') {
                if (obj != null) {
                    arrayList.add(this.i.substring(length + 1));
                } else {
                    obj = 1;
                }
            }
        }
        arrayList.add(this.i);
        return arrayList;
    }

    private String d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int indexOf = str.indexOf(47);
        String replaceAll = (indexOf != -1 ? str.substring(indexOf) : "/").replaceAll("/\\./", "/").replaceAll("/\\.$", "/");
        if (c.matcher(replaceAll).find()) {
            try {
                replaceAll = new URI(this.h, j.HOST, replaceAll, null).normalize().getRawPath();
            } catch (URISyntaxException e) {
            }
        }
        return replaceAll.replaceAll("/+", "/");
    }

    private List<String> d() {
        if (TextUtils.isEmpty(this.k)) {
            return null;
        }
        List<String> arrayList = new ArrayList();
        char[] toCharArray = this.k.toCharArray();
        for (int i = 0; i < toCharArray.length && arrayList.size() < 4; i++) {
            if (toCharArray[i] == '/') {
                arrayList.add(this.k.substring(0, i + 1));
            }
        }
        if (!(arrayList.isEmpty() || ((String) arrayList.get(arrayList.size() - 1)).equals(this.k))) {
            arrayList.add(this.k);
        }
        if (!TextUtils.isEmpty(this.l)) {
            String str = this.k;
            String str2 = this.l;
            arrayList.add(new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(str2).length()).append(str).append("?").append(str2).toString());
        }
        return arrayList;
    }

    private static boolean e(String str) {
        return !TextUtils.isEmpty(str);
    }

    private static String f(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] bytes = str.getBytes("UTF-8");
            StringBuilder stringBuilder = new StringBuilder();
            for (byte b : bytes) {
                char c = (char) (b & 255);
                if (c <= l.c || c > '~' || c == '#' || c == '%') {
                    stringBuilder.append("%");
                    stringBuilder.append(b[c >>> 4]);
                    stringBuilder.append(b[c & 15]);
                } else {
                    stringBuilder.append(c);
                }
            }
            return stringBuilder.toString();
        } catch (UnsupportedEncodingException e) {
            return null;
        }
    }

    private static String g(String str) {
        Object obj = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int i = 0;
        String str2 = str;
        while (!str2.equals(obj) && i < 1024) {
            i++;
            String str3 = str2;
            str2 = h(str2);
        }
        return str2;
    }

    private static String h(String str) {
        try {
            byte[] bytes = str.replace("\\x", "%").getBytes("UTF-8");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bytes.length);
            int i = 0;
            while (i < bytes.length) {
                byte b = bytes[i];
                if (((char) (b & 255)) >= '') {
                    byteArrayOutputStream.write(b);
                } else {
                    Byte a = a(bytes, i);
                    if (a != null) {
                        byteArrayOutputStream.write(a.byteValue());
                        i += 2;
                    } else {
                        byteArrayOutputStream.write(b);
                    }
                }
                i++;
            }
            try {
                return new String(byteArrayOutputStream.toByteArray(), "UTF-8");
            } catch (UnsupportedEncodingException e) {
                return null;
            }
        } catch (UnsupportedEncodingException e2) {
            return null;
        }
    }

    public List<String> a() {
        if (TextUtils.isEmpty(this.g)) {
            return null;
        }
        String b = b(this.i);
        List arrayList;
        if (b != null) {
            arrayList = new ArrayList();
            arrayList.add(b);
        } else {
            arrayList = c();
        }
        if (r0 == null || r0.isEmpty()) {
            return null;
        }
        List<String> d = d();
        if (d == null || d.isEmpty()) {
            return null;
        }
        List<String> linkedList = new LinkedList();
        for (String str : r0) {
            for (String b2 : d) {
                String valueOf = String.valueOf(str);
                b2 = String.valueOf(b2);
                linkedList.add(b2.length() != 0 ? valueOf.concat(b2) : new String(valueOf));
            }
        }
        return !linkedList.isEmpty() ? linkedList : null;
    }

    public List<aoa> b() {
        List<String> a = a();
        if (a == null || a.isEmpty()) {
            return null;
        }
        MessageDigest instance;
        try {
            instance = MessageDigest.getInstance("SHA-256");
        } catch (Exception e) {
            a(e);
            instance = null;
        }
        if (instance == null) {
            return null;
        }
        List<aoa> arrayList = new ArrayList(a.size());
        for (String str : a) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    arrayList.add(new aoa(instance.digest(str.getBytes("UTF-8"))));
                } catch (Exception e2) {
                    a(e2);
                }
                instance.reset();
            }
        }
        return !arrayList.isEmpty() ? arrayList : null;
    }
}
