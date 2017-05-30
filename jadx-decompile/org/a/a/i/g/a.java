package org.a.a.i.g;

import java.util.ArrayList;
import java.util.List;
import org.a.a.a.c;
import org.a.a.f;
import org.a.a.f.c.l;
import org.a.a.k.d;
import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.ParseException;
import org.apache.http.ProtocolException;
import org.apache.http.io.HttpMessageParser;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.message.LineParser;
import org.apache.http.params.HttpParams;
import org.apache.http.util.CharArrayBuffer;

@c
public abstract class a<T extends HttpMessage> implements HttpMessageParser {
    private static final int b = 0;
    private static final int c = 1;
    protected final LineParser a;
    private final SessionInputBuffer d;
    private final org.a.a.e.c e;
    private final List<CharArrayBuffer> f;
    private int g;
    private T h;

    public a(SessionInputBuffer sessionInputBuffer, LineParser lineParser, org.a.a.e.c cVar) {
        this.d = (SessionInputBuffer) org.a.a.o.a.a(sessionInputBuffer, "Session input buffer");
        if (lineParser == null) {
            lineParser = d.b;
        }
        this.a = lineParser;
        if (cVar == null) {
            cVar = org.a.a.e.c.a;
        }
        this.e = cVar;
        this.f = new ArrayList();
        this.g = 0;
    }

    @Deprecated
    public a(SessionInputBuffer sessionInputBuffer, LineParser lineParser, HttpParams httpParams) {
        org.a.a.o.a.a(sessionInputBuffer, "Session input buffer");
        org.a.a.o.a.a(httpParams, "HTTP parameters");
        this.d = sessionInputBuffer;
        this.e = org.a.a.l.a.b(httpParams);
        if (lineParser == null) {
            lineParser = d.b;
        }
        this.a = lineParser;
        this.f = new ArrayList();
        this.g = 0;
    }

    public static Header[] a(SessionInputBuffer sessionInputBuffer, int i, int i2, LineParser lineParser) {
        List arrayList = new ArrayList();
        if (lineParser == null) {
            lineParser = d.b;
        }
        return a(sessionInputBuffer, i, i2, lineParser, arrayList);
    }

    public static Header[] a(SessionInputBuffer sessionInputBuffer, int i, int i2, LineParser lineParser, List<CharArrayBuffer> list) {
        Header[] headerArr;
        int i3 = 0;
        org.a.a.o.a.a(sessionInputBuffer, "Session input buffer");
        org.a.a.o.a.a(lineParser, "Line parser");
        org.a.a.o.a.a(list, "Header line list");
        CharArrayBuffer charArrayBuffer = null;
        CharArrayBuffer charArrayBuffer2 = null;
        while (true) {
            if (charArrayBuffer2 == null) {
                charArrayBuffer2 = new CharArrayBuffer(64);
            } else {
                charArrayBuffer2.clear();
            }
            if (sessionInputBuffer.readLine(charArrayBuffer2) == -1 || charArrayBuffer2.length() < 1) {
                headerArr = new Header[list.size()];
            } else {
                CharArrayBuffer charArrayBuffer3;
                if ((charArrayBuffer2.charAt(0) == l.c || charArrayBuffer2.charAt(0) == '\t') && charArrayBuffer != null) {
                    int i4 = 0;
                    while (i4 < charArrayBuffer2.length()) {
                        char charAt = charArrayBuffer2.charAt(i4);
                        if (charAt != l.c && charAt != '\t') {
                            break;
                        }
                        i4++;
                    }
                    if (i2 <= 0 || ((charArrayBuffer.length() + 1) + charArrayBuffer2.length()) - i4 <= i2) {
                        charArrayBuffer.append(l.c);
                        charArrayBuffer.append(charArrayBuffer2, i4, charArrayBuffer2.length() - i4);
                        charArrayBuffer3 = charArrayBuffer2;
                        charArrayBuffer2 = charArrayBuffer;
                    } else {
                        throw new f("Maximum line length limit exceeded");
                    }
                }
                list.add(charArrayBuffer2);
                charArrayBuffer3 = null;
                if (i <= 0 || list.size() < i) {
                    charArrayBuffer = charArrayBuffer2;
                    charArrayBuffer2 = charArrayBuffer3;
                } else {
                    throw new f("Maximum header count exceeded");
                }
            }
        }
        headerArr = new Header[list.size()];
        while (i3 < list.size()) {
            try {
                headerArr[i3] = lineParser.parseHeader((CharArrayBuffer) list.get(i3));
                i3++;
            } catch (ParseException e) {
                throw new ProtocolException(e.getMessage());
            }
        }
        return headerArr;
    }

    protected abstract T b(SessionInputBuffer sessionInputBuffer);

    public T parse() {
        switch (this.g) {
            case 0:
                try {
                    this.h = b(this.d);
                    this.g = 1;
                    break;
                } catch (Throwable e) {
                    throw new ProtocolException(e.getMessage(), e);
                }
            case 1:
                break;
            default:
                throw new IllegalStateException("Inconsistent parser state");
        }
        this.h.setHeaders(a(this.d, this.e.b(), this.e.a(), this.a, this.f));
        T t = this.h;
        this.h = null;
        this.f.clear();
        this.g = 0;
        return t;
    }
}
