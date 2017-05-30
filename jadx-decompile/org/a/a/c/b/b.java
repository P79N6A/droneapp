package org.a.a.c.b;

import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;

public class b extends a {
    public b(HttpEntity httpEntity) {
        super(httpEntity);
    }

    InputStream a(InputStream inputStream) {
        return new c(inputStream);
    }

    public /* bridge */ /* synthetic */ InputStream getContent() {
        return super.getContent();
    }

    public Header getContentEncoding() {
        return null;
    }

    public long getContentLength() {
        return -1;
    }

    public /* bridge */ /* synthetic */ void writeTo(OutputStream outputStream) {
        super.writeTo(outputStream);
    }
}
