package m.framework.a;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class f extends InputStream {
    private ArrayList<InputStream> a = new ArrayList();
    private int b;

    f() {
    }

    private boolean a() {
        return this.a == null || this.a.size() <= 0;
    }

    public void a(InputStream inputStream) {
        this.a.add(inputStream);
    }

    public int available() {
        return a() ? 0 : ((InputStream) this.a.get(this.b)).available();
    }

    public void close() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((InputStream) it.next()).close();
        }
    }

    public int read() {
        if (a()) {
            return -1;
        }
        int read = ((InputStream) this.a.get(this.b)).read();
        while (read < 0) {
            this.b++;
            if (this.b >= this.a.size()) {
                return read;
            }
            read = ((InputStream) this.a.get(this.b)).read();
        }
        return read;
    }

    public int read(byte[] bArr, int i, int i2) {
        if (a()) {
            return -1;
        }
        int read = ((InputStream) this.a.get(this.b)).read(bArr, i, i2);
        while (read < 0) {
            this.b++;
            if (this.b >= this.a.size()) {
                return read;
            }
            read = ((InputStream) this.a.get(this.b)).read(bArr, i, i2);
        }
        return read;
    }

    public long skip(long j) {
        throw new IOException();
    }
}
