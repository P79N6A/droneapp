package org.a.a.c.b;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

public class c extends InputStream {
    private InputStream a;

    static class a extends InflaterInputStream {
        private boolean a = false;

        public a(InputStream inputStream, Inflater inflater) {
            super(inputStream, inflater);
        }

        public void close() {
            if (!this.a) {
                this.a = true;
                this.inf.end();
                super.close();
            }
        }
    }

    public c(InputStream inputStream) {
        byte[] bArr = new byte[6];
        InputStream pushbackInputStream = new PushbackInputStream(inputStream, bArr.length);
        int read = pushbackInputStream.read(bArr);
        if (read == -1) {
            throw new IOException("Unable to read the response");
        }
        byte[] bArr2 = new byte[1];
        Inflater inflater = new Inflater();
        while (true) {
            int inflate = inflater.inflate(bArr2);
            if (inflate != 0) {
                break;
            } else if (inflater.finished()) {
                throw new IOException("Unable to read the response");
            } else if (inflater.needsDictionary()) {
                break;
            } else {
                try {
                    if (inflater.needsInput()) {
                        inflater.setInput(bArr);
                    }
                } catch (DataFormatException e) {
                    pushbackInputStream.unread(bArr, 0, read);
                    this.a = new a(pushbackInputStream, new Inflater(true));
                } finally {
                    inflater.end();
                }
            }
        }
        if (inflate == -1) {
            throw new IOException("Unable to read the response");
        }
        pushbackInputStream.unread(bArr, 0, read);
        this.a = new a(pushbackInputStream, new Inflater());
    }

    public int available() {
        return this.a.available();
    }

    public void close() {
        this.a.close();
    }

    public void mark(int i) {
        this.a.mark(i);
    }

    public boolean markSupported() {
        return this.a.markSupported();
    }

    public int read() {
        return this.a.read();
    }

    public int read(byte[] bArr) {
        return this.a.read(bArr);
    }

    public int read(byte[] bArr, int i, int i2) {
        return this.a.read(bArr, i, i2);
    }

    public void reset() {
        this.a.reset();
    }

    public long skip(long j) {
        return this.a.skip(j);
    }
}