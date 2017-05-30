package org.a.a.h;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import org.a.a.a.c;
import org.a.a.o.a;

@c
public class i extends a {
    private byte[] e;
    private Serializable f;

    public i(Serializable serializable) {
        a.a((Object) serializable, "Source object");
        this.f = serializable;
    }

    public i(Serializable serializable, boolean z) {
        a.a((Object) serializable, "Source object");
        if (z) {
            a(serializable);
        } else {
            this.f = serializable;
        }
    }

    private void a(Serializable serializable) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(serializable);
        objectOutputStream.flush();
        this.e = byteArrayOutputStream.toByteArray();
    }

    public InputStream getContent() {
        if (this.e == null) {
            a(this.f);
        }
        return new ByteArrayInputStream(this.e);
    }

    public long getContentLength() {
        return this.e == null ? -1 : (long) this.e.length;
    }

    public boolean isRepeatable() {
        return true;
    }

    public boolean isStreaming() {
        return this.e == null;
    }

    public void writeTo(OutputStream outputStream) {
        a.a((Object) outputStream, "Output stream");
        if (this.e == null) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(this.f);
            objectOutputStream.flush();
            return;
        }
        outputStream.write(this.e);
        outputStream.flush();
    }
}
