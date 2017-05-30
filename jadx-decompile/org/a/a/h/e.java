package org.a.a.h;

import com.baidu.tts.loopj.RequestParams;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Locale;
import org.a.a.a.b;
import org.a.a.c.f.j;
import org.a.a.o.a;
import org.a.a.o.f;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.message.ParserCursor;
import org.apache.http.util.CharArrayBuffer;

@b
public final class e implements Serializable {
    public static final e a = a("application/atom+xml", org.a.a.b.g);
    public static final e b = a(j.a, org.a.a.b.g);
    public static final e c = a(RequestParams.APPLICATION_JSON, org.a.a.b.e);
    public static final e d = a(RequestParams.APPLICATION_OCTET_STREAM, (Charset) null);
    public static final e e = a("application/svg+xml", org.a.a.b.g);
    public static final e f = a("application/xhtml+xml", org.a.a.b.g);
    public static final e g = a("application/xml", org.a.a.b.g);
    public static final e h = a("multipart/form-data", org.a.a.b.g);
    public static final e i = a("text/html", org.a.a.b.g);
    public static final e j = a("text/plain", org.a.a.b.g);
    public static final e k = a("text/xml", org.a.a.b.g);
    public static final e l = a("*/*", (Charset) null);
    public static final e m = j;
    public static final e n = d;
    private static final long serialVersionUID = -7768694718232371896L;
    private final String o;
    private final Charset p;
    private final NameValuePair[] q;

    e(String str, Charset charset) {
        this.o = str;
        this.p = charset;
        this.q = null;
    }

    e(String str, NameValuePair[] nameValuePairArr) {
        this.o = str;
        this.q = nameValuePairArr;
        Object a = a("charset");
        this.p = !f.b(a) ? Charset.forName(a) : null;
    }

    public static e a(String str, String str2) {
        return a(str, !f.b(str2) ? Charset.forName(str2) : null);
    }

    public static e a(String str, Charset charset) {
        String toLowerCase = ((String) a.b((CharSequence) str, "MIME type")).toLowerCase(Locale.US);
        a.a(e(toLowerCase), "MIME type may not contain reserved characters");
        return new e(toLowerCase, charset);
    }

    private static e a(HeaderElement headerElement) {
        String name = headerElement.getName();
        NameValuePair[] parameters = headerElement.getParameters();
        if (parameters == null || parameters.length <= 0) {
            parameters = null;
        }
        return new e(name, parameters);
    }

    public static e a(HttpEntity httpEntity) {
        if (httpEntity == null) {
            return null;
        }
        Header contentType = httpEntity.getContentType();
        if (contentType == null) {
            return null;
        }
        HeaderElement[] elements = contentType.getElements();
        return elements.length > 0 ? a(elements[0]) : null;
    }

    public static e b(String str) {
        return new e(str, (Charset) null);
    }

    public static e b(HttpEntity httpEntity) {
        e a = a(httpEntity);
        return a != null ? a : m;
    }

    public static e c(String str) {
        a.a((Object) str, "Content type");
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        HeaderElement[] parseElements = org.a.a.k.b.b.parseElements(charArrayBuffer, new ParserCursor(0, str.length()));
        if (parseElements.length > 0) {
            return a(parseElements[0]);
        }
        throw new ParseException("Invalid content type: " + str);
    }

    private static boolean e(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == l.e || charAt == ',' || charAt == ';') {
                return false;
            }
        }
        return true;
    }

    public String a() {
        return this.o;
    }

    public String a(String str) {
        a.a((CharSequence) str, "Parameter name");
        if (this.q == null) {
            return null;
        }
        for (NameValuePair nameValuePair : this.q) {
            if (nameValuePair.getName().equalsIgnoreCase(str)) {
                return nameValuePair.getValue();
            }
        }
        return null;
    }

    public e a(Charset charset) {
        return a(a(), charset);
    }

    public Charset b() {
        return this.p;
    }

    public e d(String str) {
        return a(a(), str);
    }

    public String toString() {
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(64);
        charArrayBuffer.append(this.o);
        if (this.q != null) {
            charArrayBuffer.append("; ");
            org.a.a.k.a.b.formatParameters(charArrayBuffer, this.q, false);
        } else if (this.p != null) {
            charArrayBuffer.append("; charset=");
            charArrayBuffer.append(this.p.name());
        }
        return charArrayBuffer.toString();
    }
}
