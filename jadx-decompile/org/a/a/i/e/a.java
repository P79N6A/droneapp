package org.a.a.i.e;

import org.a.a.a.b;
import org.apache.http.HttpMessage;
import org.apache.http.ProtocolException;
import org.apache.http.entity.ContentLengthStrategy;

@b
public class a implements ContentLengthStrategy {
    public static final a a = new a(new b(0));
    private final ContentLengthStrategy b;

    public a(ContentLengthStrategy contentLengthStrategy) {
        this.b = contentLengthStrategy;
    }

    public long determineLength(HttpMessage httpMessage) {
        long determineLength = this.b.determineLength(httpMessage);
        if (determineLength != -1) {
            return determineLength;
        }
        throw new ProtocolException("Identity transfer encoding cannot be used");
    }
}
