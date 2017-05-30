package org.a.a.i.g;

import com.fimi.soul.media.player.FimiMediaMeta;
import java.io.IOException;
import java.io.InputStream;
import org.a.a.a.c;
import org.a.a.o.a;
import org.apache.http.ConnectionClosedException;
import org.apache.http.io.SessionInputBuffer;

@c
public class e extends InputStream {
    private static final int a = 2048;
    private final long b;
    private long c = 0;
    private boolean d = false;
    private SessionInputBuffer e = null;

    public e(SessionInputBuffer sessionInputBuffer, long j) {
        this.e = (SessionInputBuffer) a.a((Object) sessionInputBuffer, "Session input buffer");
        this.b = a.b(j, "Content length");
    }

    public int available() {
        return this.e instanceof org.a.a.j.a ? Math.min(((org.a.a.j.a) this.e).c(), (int) (this.b - this.c)) : 0;
    }

    public void close() {
        if (!this.d) {
            try {
                if (this.c < this.b) {
                    do {
                    } while (read(new byte[2048]) >= 0);
                }
                this.d = true;
            } catch (Throwable th) {
                this.d = true;
            }
        }
    }

    public int read() {
        if (this.d) {
            throw new IOException("Attempted read from closed stream.");
        } else if (this.c >= this.b) {
            return -1;
        } else {
            int read = this.e.read();
            if (read != -1) {
                this.c++;
            } else if (this.c < this.b) {
                throw new ConnectionClosedException("Premature end of Content-Length delimited message body (expected: " + this.b + "; received: " + this.c);
            }
            return read;
        }
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) {
        if (this.d) {
            throw new IOException("Attempted read from closed stream.");
        } else if (this.c >= this.b) {
            return -1;
        } else {
            if (this.c + ((long) i2) > this.b) {
                i2 = (int) (this.b - this.c);
            }
            int read = this.e.read(bArr, i, i2);
            if (read != -1 || this.c >= this.b) {
                if (read > 0) {
                    this.c += (long) read;
                }
                return read;
            }
            throw new ConnectionClosedException("Premature end of Content-Length delimited message body (expected: " + this.b + "; received: " + this.c);
        }
    }

    public long skip(long j) {
        if (j <= 0) {
            return 0;
        }
        byte[] bArr = new byte[2048];
        long min = Math.min(j, this.b - this.c);
        long j2 = 0;
        while (min > 0) {
            int read = read(bArr, 0, (int) Math.min(FimiMediaMeta.AV_CH_TOP_CENTER, min));
            if (read == -1) {
                break;
            }
            j2 += (long) read;
            min -= (long) read;
        }
        return j2;
    }
}
