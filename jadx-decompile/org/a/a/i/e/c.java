package org.a.a.i.e;

import org.a.a.a.b;
import org.a.a.e;
import org.a.a.o.a;
import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolException;
import org.apache.http.entity.ContentLengthStrategy;

@b
public class c implements ContentLengthStrategy {
    public static final c a = new c();
    private final int b;

    public c() {
        this(-1);
    }

    public c(int i) {
        this.b = i;
    }

    public long determineLength(HttpMessage httpMessage) {
        a.a((Object) httpMessage, "HTTP message");
        Header firstHeader = httpMessage.getFirstHeader(e.W);
        if (firstHeader != null) {
            String value = firstHeader.getValue();
            if ("chunked".equalsIgnoreCase(value)) {
                if (!httpMessage.getProtocolVersion().lessEquals(HttpVersion.HTTP_1_0)) {
                    return -2;
                }
                throw new ProtocolException("Chunked transfer encoding not allowed for " + httpMessage.getProtocolVersion());
            } else if ("identity".equalsIgnoreCase(value)) {
                return -1;
            } else {
                throw new ProtocolException("Unsupported transfer encoding: " + value);
            }
        }
        firstHeader = httpMessage.getFirstHeader("Content-Length");
        if (firstHeader == null) {
            return (long) this.b;
        }
        String value2 = firstHeader.getValue();
        try {
            long parseLong = Long.parseLong(value2);
            if (parseLong >= 0) {
                return parseLong;
            }
            throw new ProtocolException("Negative content length: " + value2);
        } catch (NumberFormatException e) {
            throw new ProtocolException("Invalid content length: " + value2);
        }
    }
}
