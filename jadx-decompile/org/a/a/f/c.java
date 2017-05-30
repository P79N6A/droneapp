package org.a.a.f;

import java.io.IOException;
import java.io.InputStream;
import org.a.a.o.a;
import org.apache.http.conn.ConnectionReleaseTrigger;
import org.apache.http.conn.EofSensorWatcher;

@org.a.a.a.c
public class c extends InputStream implements ConnectionReleaseTrigger {
    protected InputStream a;
    private boolean b = false;
    private final EofSensorWatcher c;

    public c(InputStream inputStream, EofSensorWatcher eofSensorWatcher) {
        a.a((Object) inputStream, "Wrapped stream");
        this.a = inputStream;
        this.c = eofSensorWatcher;
    }

    protected void a(int i) {
        if (this.a != null && i < 0) {
            boolean z = true;
            try {
                if (this.c != null) {
                    z = this.c.eofDetected(this.a);
                }
                if (z) {
                    this.a.close();
                }
                this.a = null;
            } catch (Throwable th) {
                this.a = null;
            }
        }
    }

    boolean a() {
        return this.b;
    }

    public void abortConnection() {
        this.b = true;
        e();
    }

    public int available() {
        int i = 0;
        if (c()) {
            try {
                i = this.a.available();
            } catch (IOException e) {
                e();
                throw e;
            }
        }
        return i;
    }

    InputStream b() {
        return this.a;
    }

    protected boolean c() {
        if (!this.b) {
            return this.a != null;
        } else {
            throw new IOException("Attempted read on closed stream.");
        }
    }

    public void close() {
        this.b = true;
        d();
    }

    protected void d() {
        if (this.a != null) {
            boolean z = true;
            try {
                if (this.c != null) {
                    z = this.c.streamClosed(this.a);
                }
                if (z) {
                    this.a.close();
                }
                this.a = null;
            } catch (Throwable th) {
                this.a = null;
            }
        }
    }

    protected void e() {
        if (this.a != null) {
            boolean z = true;
            try {
                if (this.c != null) {
                    z = this.c.streamAbort(this.a);
                }
                if (z) {
                    this.a.close();
                }
                this.a = null;
            } catch (Throwable th) {
                this.a = null;
            }
        }
    }

    public int read() {
        if (!c()) {
            return -1;
        }
        try {
            int read = this.a.read();
            a(read);
            return read;
        } catch (IOException e) {
            e();
            throw e;
        }
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) {
        if (!c()) {
            return -1;
        }
        try {
            int read = this.a.read(bArr, i, i2);
            a(read);
            return read;
        } catch (IOException e) {
            e();
            throw e;
        }
    }

    public void releaseConnection() {
        close();
    }
}
