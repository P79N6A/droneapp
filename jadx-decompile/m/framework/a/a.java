package m.framework.a;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public class a extends c {
    private byte[] a;

    protected InputStream a() {
        return (this.a == null || this.a.length <= 0) ? new ByteArrayInputStream(new byte[0]) : new ByteArrayInputStream(this.a);
    }

    public a a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (this.a != null && this.a.length > 0) {
            byteArrayOutputStream.write(this.a);
        }
        byteArrayOutputStream.write(bArr);
        byteArrayOutputStream.flush();
        this.a = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return this;
    }

    protected long b() {
        return (long) (this.a == null ? 0 : this.a.length);
    }

    public String toString() {
        return m.framework.b.a.a(this.a);
    }
}
