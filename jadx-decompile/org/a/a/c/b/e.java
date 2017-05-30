package org.a.a.c.b;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;
import org.a.a.h.g;
import org.a.a.o.a;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.message.BasicHeader;

public class e extends g {
    private static final String b = "gzip";

    public e(HttpEntity httpEntity) {
        super(httpEntity);
    }

    public InputStream getContent() {
        throw new UnsupportedOperationException();
    }

    public Header getContentEncoding() {
        return new BasicHeader("Content-Encoding", "gzip");
    }

    public long getContentLength() {
        return -1;
    }

    public boolean isChunked() {
        return true;
    }

    public void writeTo(OutputStream outputStream) {
        a.a((Object) outputStream, "Output stream");
        OutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        this.a.writeTo(gZIPOutputStream);
        gZIPOutputStream.close();
    }
}
