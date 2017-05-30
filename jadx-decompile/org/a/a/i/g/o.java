package org.a.a.i.g;

import java.io.InputStream;
import org.a.a.a.c;
import org.a.a.o.a;
import org.apache.http.io.SessionInputBuffer;

@c
public class o extends InputStream {
    private final SessionInputBuffer a;
    private boolean b = false;

    public o(SessionInputBuffer sessionInputBuffer) {
        this.a = (SessionInputBuffer) a.a((Object) sessionInputBuffer, "Session input buffer");
    }

    public int available() {
        return this.a instanceof org.a.a.j.a ? ((org.a.a.j.a) this.a).c() : 0;
    }

    public void close() {
        this.b = true;
    }

    public int read() {
        return this.b ? -1 : this.a.read();
    }

    public int read(byte[] bArr, int i, int i2) {
        return this.b ? -1 : this.a.read(bArr, i, i2);
    }
}
