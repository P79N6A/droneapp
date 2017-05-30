package org.a.a.f.c;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import org.a.a.a.b;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.message.ParserCursor;
import org.apache.http.util.CharArrayBuffer;

@b
final class d {
    public static final d a = new d();
    private static final BitSet b = l.a(61, 44, 43);
    private static final BitSet c = l.a(44, 43);
    private final l d = new a();

    static class a extends l {
        a() {
        }

        public void a(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor, BitSet bitSet, StringBuilder stringBuilder) {
            int pos = parserCursor.getPos();
            int pos2 = parserCursor.getPos();
            int upperBound = parserCursor.getUpperBound();
            int i = pos;
            pos = pos2;
            Object obj = null;
            while (pos < upperBound) {
                char charAt = charArrayBuffer.charAt(pos);
                if (obj == null) {
                    if ((bitSet != null && bitSet.get(charAt)) || l.a(charAt) || charAt == l.e) {
                        break;
                    } else if (charAt == l.f) {
                        obj = 1;
                    } else {
                        stringBuilder.append(charAt);
                    }
                } else {
                    stringBuilder.append(charAt);
                    obj = null;
                }
                pos++;
                i++;
            }
            parserCursor.updatePos(i);
        }
    }

    d() {
    }

    String a(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor, BitSet bitSet) {
        return this.d.a(charArrayBuffer, parserCursor, bitSet);
    }

    public List<NameValuePair> a(String str) {
        if (str == null) {
            return null;
        }
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        return b(charArrayBuffer, new ParserCursor(0, str.length()));
    }

    NameValuePair a(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) {
        String a = a(charArrayBuffer, parserCursor, b);
        if (parserCursor.atEnd()) {
            return new BasicNameValuePair(a, null);
        }
        char charAt = charArrayBuffer.charAt(parserCursor.getPos());
        parserCursor.updatePos(parserCursor.getPos() + 1);
        if (charAt == ',') {
            return new BasicNameValuePair(a, null);
        }
        String b = b(charArrayBuffer, parserCursor, c);
        if (!parserCursor.atEnd()) {
            parserCursor.updatePos(parserCursor.getPos() + 1);
        }
        return new BasicNameValuePair(a, b);
    }

    String b(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor, BitSet bitSet) {
        return this.d.b(charArrayBuffer, parserCursor, bitSet);
    }

    public List<NameValuePair> b(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) {
        List<NameValuePair> arrayList = new ArrayList();
        this.d.a(charArrayBuffer, parserCursor);
        while (!parserCursor.atEnd()) {
            arrayList.add(a(charArrayBuffer, parserCursor));
        }
        return arrayList;
    }
}
