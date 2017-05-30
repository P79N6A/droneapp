package org.a.a.h;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.a.a.a.c;
import org.a.a.o.a;

@c
public class f extends a implements Cloneable {
    protected final File e;

    public f(File file) {
        this.e = (File) a.a(file, "File");
    }

    @Deprecated
    public f(File file, String str) {
        this.e = (File) a.a(file, "File");
        a(str);
    }

    public f(File file, e eVar) {
        this.e = (File) a.a(file, "File");
        if (eVar != null) {
            a(eVar.toString());
        }
    }

    public Object clone() {
        return super.clone();
    }

    public InputStream getContent() {
        return new FileInputStream(this.e);
    }

    public long getContentLength() {
        return this.e.length();
    }

    public boolean isRepeatable() {
        return true;
    }

    public boolean isStreaming() {
        return false;
    }

    public void writeTo(OutputStream outputStream) {
        a.a(outputStream, "Output stream");
        InputStream fileInputStream = new FileInputStream(this.e);
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                outputStream.write(bArr, 0, read);
            }
            outputStream.flush();
        } finally {
            fileInputStream.close();
        }
    }
}
