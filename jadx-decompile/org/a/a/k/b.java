package org.a.a.k;

import java.util.ArrayList;
import java.util.List;
import org.a.a.f.c.l;
import org.a.a.o.a;
import org.apache.http.HeaderElement;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicHeaderElement;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.message.HeaderValueParser;
import org.apache.http.message.ParserCursor;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.CharArrayBuffer;
import org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor;

@org.a.a.a.b
public class b implements HeaderValueParser {
    @Deprecated
    public static final b a = new b();
    public static final b b = new b();
    private static final char c = ';';
    private static final char d = ',';
    private static final char[] e = new char[]{c, d};

    private static boolean a(char c, char[] cArr) {
        if (cArr == null) {
            return false;
        }
        for (char c2 : cArr) {
            if (c == c2) {
                return true;
            }
        }
        return false;
    }

    public static HeaderElement[] a(String str, HeaderValueParser headerValueParser) {
        a.a(str, "Value");
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        ParserCursor parserCursor = new ParserCursor(0, str.length());
        if (headerValueParser == null) {
            headerValueParser = b;
        }
        return headerValueParser.parseElements(charArrayBuffer, parserCursor);
    }

    public static HeaderElement b(String str, HeaderValueParser headerValueParser) {
        a.a(str, "Value");
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        ParserCursor parserCursor = new ParserCursor(0, str.length());
        if (headerValueParser == null) {
            headerValueParser = b;
        }
        return headerValueParser.parseHeaderElement(charArrayBuffer, parserCursor);
    }

    public static NameValuePair[] c(String str, HeaderValueParser headerValueParser) {
        a.a(str, "Value");
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        ParserCursor parserCursor = new ParserCursor(0, str.length());
        if (headerValueParser == null) {
            headerValueParser = b;
        }
        return headerValueParser.parseParameters(charArrayBuffer, parserCursor);
    }

    public static NameValuePair d(String str, HeaderValueParser headerValueParser) {
        a.a(str, "Value");
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        ParserCursor parserCursor = new ParserCursor(0, str.length());
        if (headerValueParser == null) {
            headerValueParser = b;
        }
        return headerValueParser.parseNameValuePair(charArrayBuffer, parserCursor);
    }

    protected HeaderElement a(String str, String str2, NameValuePair[] nameValuePairArr) {
        return new BasicHeaderElement(str, str2, nameValuePairArr);
    }

    protected NameValuePair a(String str, String str2) {
        return new BasicNameValuePair(str, str2);
    }

    public NameValuePair a(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor, char[] cArr) {
        Object obj;
        String substringTrimmed;
        Object obj2 = 1;
        a.a(charArrayBuffer, "Char array buffer");
        a.a(parserCursor, "Parser cursor");
        int pos = parserCursor.getPos();
        int pos2 = parserCursor.getPos();
        int upperBound = parserCursor.getUpperBound();
        while (pos < upperBound) {
            char charAt = charArrayBuffer.charAt(pos);
            if (charAt == SignatureVisitor.INSTANCEOF) {
                obj = null;
                break;
            } else if (a(charAt, cArr)) {
                int i = 1;
                break;
            } else {
                pos++;
            }
        }
        obj = null;
        if (pos == upperBound) {
            substringTrimmed = charArrayBuffer.substringTrimmed(pos2, upperBound);
            obj = 1;
        } else {
            String substringTrimmed2 = charArrayBuffer.substringTrimmed(pos2, pos);
            pos++;
            substringTrimmed = substringTrimmed2;
        }
        if (obj != null) {
            parserCursor.updatePos(pos);
            return a(substringTrimmed, null);
        }
        Object obj3 = null;
        Object obj4 = null;
        int i2 = pos;
        while (i2 < upperBound) {
            Object obj5;
            char charAt2 = charArrayBuffer.charAt(i2);
            if (charAt2 == l.e && obj3 == null) {
                obj5 = obj4 == null ? 1 : null;
            } else {
                obj5 = obj4;
            }
            if (obj5 == null && obj3 == null && a(charAt2, cArr)) {
                break;
            }
            if (obj3 != null) {
                obj4 = null;
            } else if (obj5 == null || charAt2 != l.f) {
                obj4 = null;
            } else {
                pos2 = 1;
            }
            i2++;
            obj3 = obj4;
            obj4 = obj5;
        }
        obj2 = obj;
        int i3 = pos;
        while (i3 < i2 && HTTP.isWhitespace(charArrayBuffer.charAt(i3))) {
            i3++;
        }
        pos2 = i2;
        while (pos2 > i3 && HTTP.isWhitespace(charArrayBuffer.charAt(pos2 - 1))) {
            pos2--;
        }
        if (pos2 - i3 >= 2 && charArrayBuffer.charAt(i3) == l.e && charArrayBuffer.charAt(pos2 - 1) == l.e) {
            i3++;
            pos2--;
        }
        String substring = charArrayBuffer.substring(i3, pos2);
        parserCursor.updatePos(obj2 != null ? i2 + 1 : i2);
        return a(substringTrimmed, substring);
    }

    public HeaderElement[] parseElements(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) {
        a.a(charArrayBuffer, "Char array buffer");
        a.a(parserCursor, "Parser cursor");
        List arrayList = new ArrayList();
        while (!parserCursor.atEnd()) {
            HeaderElement parseHeaderElement = parseHeaderElement(charArrayBuffer, parserCursor);
            if (parseHeaderElement.getName().length() != 0 || parseHeaderElement.getValue() != null) {
                arrayList.add(parseHeaderElement);
            }
        }
        return (HeaderElement[]) arrayList.toArray(new HeaderElement[arrayList.size()]);
    }

    public HeaderElement parseHeaderElement(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) {
        a.a(charArrayBuffer, "Char array buffer");
        a.a(parserCursor, "Parser cursor");
        NameValuePair parseNameValuePair = parseNameValuePair(charArrayBuffer, parserCursor);
        NameValuePair[] nameValuePairArr = null;
        if (!(parserCursor.atEnd() || charArrayBuffer.charAt(parserCursor.getPos() - 1) == d)) {
            nameValuePairArr = parseParameters(charArrayBuffer, parserCursor);
        }
        return a(parseNameValuePair.getName(), parseNameValuePair.getValue(), nameValuePairArr);
    }

    public NameValuePair parseNameValuePair(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) {
        return a(charArrayBuffer, parserCursor, e);
    }

    public NameValuePair[] parseParameters(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) {
        a.a(charArrayBuffer, "Char array buffer");
        a.a(parserCursor, "Parser cursor");
        int pos = parserCursor.getPos();
        int upperBound = parserCursor.getUpperBound();
        while (pos < upperBound && HTTP.isWhitespace(charArrayBuffer.charAt(pos))) {
            pos++;
        }
        parserCursor.updatePos(pos);
        if (parserCursor.atEnd()) {
            return new NameValuePair[0];
        }
        List arrayList = new ArrayList();
        while (!parserCursor.atEnd()) {
            arrayList.add(parseNameValuePair(charArrayBuffer, parserCursor));
            if (charArrayBuffer.charAt(parserCursor.getPos() - 1) == d) {
                break;
            }
        }
        return (NameValuePair[]) arrayList.toArray(new NameValuePair[arrayList.size()]);
    }
}
