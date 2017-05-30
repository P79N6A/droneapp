package org.a.a.h;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import org.a.a.a.c;
import org.a.a.o.a;

@c
public class j extends a implements Cloneable {
    protected final byte[] e;

    public j(String str) {
        this(str, e.m);
    }

    public j(String str, String str2) {
        this(str, e.a(e.j.a(), str2));
    }

    @Deprecated
    public j(String str, String str2, String str3) {
        a.a(str, "Source string");
        if (str2 == null) {
            str2 = "text/plain";
        }
        if (str3 == null) {
            str3 = "ISO-8859-1";
        }
        this.e = str.getBytes(str3);
        a(str2 + "; charset=" + str3);
    }

    public j(String str, Charset charset) {
        this(str, e.a(e.j.a(), charset));
    }

    public j(String str, e eVar) {
        a.a(str, "Source string");
        Charset b = eVar != null ? eVar.b() : null;
        if (b == null) {
            b = Charset.forName("ISO-8859-1");
        }
        try {
            this.e = str.getBytes(b.name());
            if (eVar != null) {
                a(eVar.toString());
            }
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedCharsetException(b.name());
        }
    }

    public Object clone() {
        return super.clone();
    }

    public InputStream getContent() {
        return new ByteArrayInputStream(this.e);
    }

    public long getContentLength() {
        return (long) this.e.length;
    }

    public boolean isRepeatable() {
        return true;
    }

    public boolean isStreaming() {
        return false;
    }

    public void writeTo(OutputStream outputStream) {
        a.a(outputStream, "Output stream");
        outputStream.write(this.e);
        outputStream.flush();
    }
}
