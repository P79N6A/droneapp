package org.a.a.k;

import org.a.a.a.b;
import org.a.a.f.c.l;
import org.a.a.o.a;
import org.apache.http.FormattedHeader;
import org.apache.http.Header;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.StatusLine;
import org.apache.http.message.LineFormatter;
import org.apache.http.util.CharArrayBuffer;

@b
public class c implements LineFormatter {
    @Deprecated
    public static final c a = new c();
    public static final c b = new c();

    public static String a(Header header, LineFormatter lineFormatter) {
        if (lineFormatter == null) {
            lineFormatter = b;
        }
        return lineFormatter.formatHeader(null, header).toString();
    }

    public static String a(ProtocolVersion protocolVersion, LineFormatter lineFormatter) {
        if (lineFormatter == null) {
            lineFormatter = b;
        }
        return lineFormatter.appendProtocolVersion(null, protocolVersion).toString();
    }

    public static String a(RequestLine requestLine, LineFormatter lineFormatter) {
        if (lineFormatter == null) {
            lineFormatter = b;
        }
        return lineFormatter.formatRequestLine(null, requestLine).toString();
    }

    public static String a(StatusLine statusLine, LineFormatter lineFormatter) {
        if (lineFormatter == null) {
            lineFormatter = b;
        }
        return lineFormatter.formatStatusLine(null, statusLine).toString();
    }

    protected int a(ProtocolVersion protocolVersion) {
        return protocolVersion.getProtocol().length() + 4;
    }

    protected CharArrayBuffer a(CharArrayBuffer charArrayBuffer) {
        if (charArrayBuffer == null) {
            return new CharArrayBuffer(64);
        }
        charArrayBuffer.clear();
        return charArrayBuffer;
    }

    protected void a(CharArrayBuffer charArrayBuffer, Header header) {
        String name = header.getName();
        String value = header.getValue();
        int length = name.length() + 2;
        if (value != null) {
            length += value.length();
        }
        charArrayBuffer.ensureCapacity(length);
        charArrayBuffer.append(name);
        charArrayBuffer.append(": ");
        if (value != null) {
            charArrayBuffer.append(value);
        }
    }

    protected void a(CharArrayBuffer charArrayBuffer, RequestLine requestLine) {
        String method = requestLine.getMethod();
        String uri = requestLine.getUri();
        charArrayBuffer.ensureCapacity((((method.length() + 1) + uri.length()) + 1) + a(requestLine.getProtocolVersion()));
        charArrayBuffer.append(method);
        charArrayBuffer.append(l.c);
        charArrayBuffer.append(uri);
        charArrayBuffer.append(l.c);
        appendProtocolVersion(charArrayBuffer, requestLine.getProtocolVersion());
    }

    protected void a(CharArrayBuffer charArrayBuffer, StatusLine statusLine) {
        int a = ((a(statusLine.getProtocolVersion()) + 1) + 3) + 1;
        String reasonPhrase = statusLine.getReasonPhrase();
        if (reasonPhrase != null) {
            a += reasonPhrase.length();
        }
        charArrayBuffer.ensureCapacity(a);
        appendProtocolVersion(charArrayBuffer, statusLine.getProtocolVersion());
        charArrayBuffer.append(l.c);
        charArrayBuffer.append(Integer.toString(statusLine.getStatusCode()));
        charArrayBuffer.append(l.c);
        if (reasonPhrase != null) {
            charArrayBuffer.append(reasonPhrase);
        }
    }

    public CharArrayBuffer appendProtocolVersion(CharArrayBuffer charArrayBuffer, ProtocolVersion protocolVersion) {
        a.a(protocolVersion, "Protocol version");
        int a = a(protocolVersion);
        if (charArrayBuffer == null) {
            charArrayBuffer = new CharArrayBuffer(a);
        } else {
            charArrayBuffer.ensureCapacity(a);
        }
        charArrayBuffer.append(protocolVersion.getProtocol());
        charArrayBuffer.append('/');
        charArrayBuffer.append(Integer.toString(protocolVersion.getMajor()));
        charArrayBuffer.append('.');
        charArrayBuffer.append(Integer.toString(protocolVersion.getMinor()));
        return charArrayBuffer;
    }

    public CharArrayBuffer formatHeader(CharArrayBuffer charArrayBuffer, Header header) {
        a.a(header, "Header");
        if (header instanceof FormattedHeader) {
            return ((FormattedHeader) header).getBuffer();
        }
        CharArrayBuffer a = a(charArrayBuffer);
        a(a, header);
        return a;
    }

    public CharArrayBuffer formatRequestLine(CharArrayBuffer charArrayBuffer, RequestLine requestLine) {
        a.a(requestLine, "Request line");
        CharArrayBuffer a = a(charArrayBuffer);
        a(a, requestLine);
        return a;
    }

    public CharArrayBuffer formatStatusLine(CharArrayBuffer charArrayBuffer, StatusLine statusLine) {
        a.a(statusLine, "Status line");
        CharArrayBuffer a = a(charArrayBuffer);
        a(a, statusLine);
        return a;
    }
}
