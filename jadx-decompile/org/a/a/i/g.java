package org.a.a.i;

import org.a.a.a.b;
import org.a.a.e;
import org.a.a.o.a;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.ParseException;
import org.apache.http.ProtocolVersion;
import org.apache.http.TokenIterator;
import org.apache.http.message.BasicTokenIterator;
import org.apache.http.protocol.HttpContext;

@b
public class g implements ConnectionReuseStrategy {
    public static final g a = new g();

    private boolean a(HttpResponse httpResponse) {
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        return (statusCode < 200 || statusCode == 204 || statusCode == 304 || statusCode == 205) ? false : true;
    }

    protected TokenIterator a(HeaderIterator headerIterator) {
        return new BasicTokenIterator(headerIterator);
    }

    public boolean keepAlive(HttpResponse httpResponse, HttpContext httpContext) {
        boolean z = true;
        a.a((Object) httpResponse, "HTTP response");
        a.a((Object) httpContext, "HTTP context");
        ProtocolVersion protocolVersion = httpResponse.getStatusLine().getProtocolVersion();
        Header firstHeader = httpResponse.getFirstHeader(e.W);
        if (firstHeader != null) {
            if (!"chunked".equalsIgnoreCase(firstHeader.getValue())) {
                return false;
            }
        } else if (a(httpResponse)) {
            Header[] headers = httpResponse.getHeaders("Content-Length");
            if (headers.length != 1) {
                return false;
            }
            try {
                if (Integer.parseInt(headers[0].getValue()) < 0) {
                    return false;
                }
            } catch (NumberFormatException e) {
                return false;
            }
        }
        HeaderIterator headerIterator = httpResponse.headerIterator(e.j);
        if (!headerIterator.hasNext()) {
            headerIterator = httpResponse.headerIterator("Proxy-Connection");
        }
        if (headerIterator.hasNext()) {
            try {
                TokenIterator a = a(headerIterator);
                boolean z2 = false;
                while (a.hasNext()) {
                    String nextToken = a.nextToken();
                    if ("Close".equalsIgnoreCase(nextToken)) {
                        return false;
                    }
                    if ("Keep-Alive".equalsIgnoreCase(nextToken)) {
                        z2 = true;
                    }
                }
                if (z2) {
                    return true;
                }
            } catch (ParseException e2) {
                return false;
            }
        }
        if (protocolVersion.lessEquals(HttpVersion.HTTP_1_0)) {
            z = false;
        }
        return z;
    }
}
