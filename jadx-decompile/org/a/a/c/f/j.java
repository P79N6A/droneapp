package org.a.a.c.f;

import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import org.a.a.a.b;
import org.a.a.h.e;
import org.a.a.o.d;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.message.ParserCursor;
import org.apache.http.util.CharArrayBuffer;
import org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor;

@b
public class j {
    public static final String a = "application/x-www-form-urlencoded";
    private static final char b = '&';
    private static final char c = ';';
    private static final String d = "=";
    private static final char[] e = new char[]{b, c};
    private static final String f = ("[" + new String(e) + "]");
    private static final BitSet g = new BitSet(256);
    private static final BitSet h = new BitSet(256);
    private static final BitSet i = new BitSet(256);
    private static final BitSet j = new BitSet(256);
    private static final BitSet k = new BitSet(256);
    private static final BitSet l = new BitSet(256);
    private static final BitSet m = new BitSet(256);
    private static final int n = 16;

    static {
        int i;
        for (i = 97; i <= 122; i++) {
            g.set(i);
        }
        for (i = 65; i <= 90; i++) {
            g.set(i);
        }
        for (i = 48; i <= 57; i++) {
            g.set(i);
        }
        g.set(95);
        g.set(45);
        g.set(46);
        g.set(42);
        m.or(g);
        g.set(33);
        g.set(126);
        g.set(39);
        g.set(40);
        g.set(41);
        h.set(44);
        h.set(59);
        h.set(58);
        h.set(36);
        h.set(38);
        h.set(43);
        h.set(61);
        i.or(g);
        i.or(h);
        j.or(g);
        j.set(47);
        j.set(59);
        j.set(58);
        j.set(64);
        j.set(38);
        j.set(61);
        j.set(43);
        j.set(36);
        j.set(44);
        l.set(59);
        l.set(47);
        l.set(63);
        l.set(58);
        l.set(64);
        l.set(38);
        l.set(61);
        l.set(43);
        l.set(36);
        l.set(44);
        l.set(91);
        l.set(93);
        k.or(l);
        k.or(g);
    }

    public static String a(Iterable<? extends NameValuePair> iterable, char c, Charset charset) {
        StringBuilder stringBuilder = new StringBuilder();
        for (NameValuePair nameValuePair : iterable) {
            String f = f(nameValuePair.getName(), charset);
            String f2 = f(nameValuePair.getValue(), charset);
            if (stringBuilder.length() > 0) {
                stringBuilder.append(c);
            }
            stringBuilder.append(f);
            if (f2 != null) {
                stringBuilder.append(d);
                stringBuilder.append(f2);
            }
        }
        return stringBuilder.toString();
    }

    public static String a(Iterable<? extends NameValuePair> iterable, Charset charset) {
        return a((Iterable) iterable, (char) b, charset);
    }

    private static String a(String str, String str2) {
        if (str == null) {
            return null;
        }
        return a(str, str2 != null ? Charset.forName(str2) : org.a.a.b.e, true);
    }

    private static String a(String str, Charset charset, BitSet bitSet, boolean z) {
        if (str == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        ByteBuffer encode = charset.encode(str);
        while (encode.hasRemaining()) {
            int i = encode.get() & 255;
            if (bitSet.get(i)) {
                stringBuilder.append((char) i);
            } else if (z && i == 32) {
                stringBuilder.append(SignatureVisitor.EXTENDS);
            } else {
                stringBuilder.append("%");
                char toUpperCase = Character.toUpperCase(Character.forDigit((i >> 4) & 15, 16));
                char toUpperCase2 = Character.toUpperCase(Character.forDigit(i & 15, 16));
                stringBuilder.append(toUpperCase);
                stringBuilder.append(toUpperCase2);
            }
        }
        return stringBuilder.toString();
    }

    private static String a(String str, Charset charset, boolean z) {
        if (str == null) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(str.length());
        CharBuffer wrap = CharBuffer.wrap(str);
        while (wrap.hasRemaining()) {
            char c = wrap.get();
            if (c == '%' && wrap.remaining() >= 2) {
                c = wrap.get();
                char c2 = wrap.get();
                int digit = Character.digit(c, 16);
                int digit2 = Character.digit(c2, 16);
                if (digit == -1 || digit2 == -1) {
                    allocate.put((byte) 37);
                    allocate.put((byte) c);
                    allocate.put((byte) c2);
                } else {
                    allocate.put((byte) ((digit << 4) + digit2));
                }
            } else if (z && c == SignatureVisitor.EXTENDS) {
                allocate.put((byte) 32);
            } else {
                allocate.put((byte) c);
            }
        }
        allocate.flip();
        return charset.decode(allocate).toString();
    }

    public static String a(List<? extends NameValuePair> list, char c, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (NameValuePair nameValuePair : list) {
            String b = b(nameValuePair.getName(), str);
            String b2 = b(nameValuePair.getValue(), str);
            if (stringBuilder.length() > 0) {
                stringBuilder.append(c);
            }
            stringBuilder.append(b);
            if (b2 != null) {
                stringBuilder.append(d);
                stringBuilder.append(b2);
            }
        }
        return stringBuilder.toString();
    }

    public static String a(List<? extends NameValuePair> list, String str) {
        return a((List) list, (char) b, str);
    }

    public static List<NameValuePair> a(String str, Charset charset) {
        return a(str, charset, e);
    }

    public static List<NameValuePair> a(String str, Charset charset, char... cArr) {
        if (str == null) {
            return Collections.emptyList();
        }
        org.a.a.k.b bVar = org.a.a.k.b.b;
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        ParserCursor parserCursor = new ParserCursor(0, charArrayBuffer.length());
        List<NameValuePair> arrayList = new ArrayList();
        while (!parserCursor.atEnd()) {
            NameValuePair a = bVar.a(charArrayBuffer, parserCursor, cArr);
            if (a.getName().length() > 0) {
                arrayList.add(new BasicNameValuePair(e(a.getName(), charset), e(a.getValue(), charset)));
            }
        }
        return arrayList;
    }

    public static List<NameValuePair> a(URI uri, String str) {
        String rawQuery = uri.getRawQuery();
        if (rawQuery == null || rawQuery.length() <= 0) {
            return Collections.emptyList();
        }
        List arrayList = new ArrayList();
        a(arrayList, new Scanner(rawQuery), f, str);
        return arrayList;
    }

    public static List<NameValuePair> a(HttpEntity httpEntity) {
        e a = e.a(httpEntity);
        if (a != null && a.a().equalsIgnoreCase(a)) {
            String a2 = d.a(httpEntity, org.a.a.b.f);
            if (a2 != null && a2.length() > 0) {
                Charset b = a.b();
                if (b == null) {
                    b = Charset.forName("ISO-8859-1");
                }
                return a(a2, b, e);
            }
        }
        return Collections.emptyList();
    }

    public static void a(List<NameValuePair> list, Scanner scanner, String str) {
        a((List) list, scanner, f, str);
    }

    public static void a(List<NameValuePair> list, Scanner scanner, String str, String str2) {
        scanner.useDelimiter(str);
        while (scanner.hasNext()) {
            String a;
            String str3 = null;
            String next = scanner.next();
            int indexOf = next.indexOf(d);
            if (indexOf != -1) {
                a = a(next.substring(0, indexOf).trim(), str2);
                str3 = a(next.substring(indexOf + 1).trim(), str2);
            } else {
                a = a(next.trim(), str2);
            }
            list.add(new BasicNameValuePair(a, str3));
        }
    }

    private static String b(String str, String str2) {
        if (str == null) {
            return null;
        }
        return a(str, str2 != null ? Charset.forName(str2) : org.a.a.b.e, m, true);
    }

    static String b(String str, Charset charset) {
        return a(str, charset, i, false);
    }

    public static boolean b(HttpEntity httpEntity) {
        Header contentType = httpEntity.getContentType();
        if (contentType == null) {
            return false;
        }
        HeaderElement[] elements = contentType.getElements();
        return elements.length > 0 ? elements[0].getName().equalsIgnoreCase(a) : false;
    }

    static String c(String str, Charset charset) {
        return a(str, charset, k, false);
    }

    static String d(String str, Charset charset) {
        return a(str, charset, j, false);
    }

    private static String e(String str, Charset charset) {
        if (str == null) {
            return null;
        }
        if (charset == null) {
            charset = org.a.a.b.e;
        }
        return a(str, charset, true);
    }

    private static String f(String str, Charset charset) {
        if (str == null) {
            return null;
        }
        if (charset == null) {
            charset = org.a.a.b.e;
        }
        return a(str, charset, m, true);
    }
}
