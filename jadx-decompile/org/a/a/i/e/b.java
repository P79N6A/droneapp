package org.a.a.i.e;

import org.a.a.e;
import org.a.a.o.a;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpMessage;
import org.apache.http.ProtocolException;
import org.apache.http.entity.ContentLengthStrategy;

@org.a.a.a.b
public class b implements ContentLengthStrategy {
    public static final b a = new b();
    private final int b;

    public b() {
        this(-1);
    }

    public b(int i) {
        this.b = i;
    }

    public long determineLength(HttpMessage httpMessage) {
        a.a((Object) httpMessage, "HTTP message");
        Header firstHeader = httpMessage.getFirstHeader(e.W);
        if (firstHeader != null) {
            try {
                HeaderElement[] elements = firstHeader.getElements();
                int length = elements.length;
                return (!"identity".equalsIgnoreCase(firstHeader.getValue()) && length > 0 && "chunked".equalsIgnoreCase(elements[length - 1].getName())) ? -2 : -1;
            } catch (Throwable e) {
                throw new ProtocolException("Invalid Transfer-Encoding header value: " + firstHeader, e);
            }
        } else if (httpMessage.getFirstHeader("Content-Length") == null) {
            return (long) this.b;
        } else {
            long parseLong;
            Header[] headers = httpMessage.getHeaders("Content-Length");
            int length2 = headers.length - 1;
            while (length2 >= 0) {
                try {
                    parseLong = Long.parseLong(headers[length2].getValue());
                    break;
                } catch (NumberFormatException e2) {
                    length2--;
                }
            }
            parseLong = -1;
            return parseLong >= 0 ? parseLong : -1;
        }
    }
}
