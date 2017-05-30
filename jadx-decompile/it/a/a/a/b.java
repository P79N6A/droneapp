package it.a.a.a;

import java.io.IOException;
import java.io.InputStream;

class b extends InputStream {
    private InputStream a;
    private int[] b;
    private int c = 0;
    private boolean d = false;

    public b(InputStream inputStream) {
        this.a = inputStream;
    }

    private void a() {
        int i = 1;
        int i2 = 0;
        char[] cArr = new char[4];
        int i3 = 0;
        do {
            int read = this.a.read();
            if (read != -1) {
                char c = (char) read;
                if (a.a.indexOf(c) != -1 || c == a.b) {
                    read = i3 + 1;
                    cArr[i3] = c;
                    i3 = read;
                    continue;
                } else if (!(c == l.a || c == '\n')) {
                    throw new IOException("Bad base64 stream");
                }
            } else if (i3 != 0) {
                throw new IOException("Bad base64 stream");
            } else {
                this.b = new int[0];
                this.d = true;
                return;
            }
        } while (i3 < 4);
        i3 = 0;
        for (read = 0; read < 4; read++) {
            if (cArr[read] != a.b) {
                if (i3 != 0) {
                    throw new IOException("Bad base64 stream");
                }
            } else if (i3 == 0) {
                i3 = 1;
            }
        }
        if (cArr[3] != a.b) {
            i = 3;
        } else if (this.a.read() != -1) {
            throw new IOException("Bad base64 stream");
        } else {
            this.d = true;
            if (cArr[2] != a.b) {
                i = 2;
            }
        }
        i3 = 0;
        for (int i4 = 0; i4 < 4; i4++) {
            if (cArr[i4] != a.b) {
                i3 |= a.a.indexOf(cArr[i4]) << ((3 - i4) * 6);
            }
        }
        this.b = new int[i];
        while (i2 < i) {
            this.b[i2] = (i3 >>> ((2 - i2) * 8)) & 255;
            i2++;
        }
    }

    public void close() {
        this.a.close();
    }

    public int read() {
        if (this.b == null || this.c == this.b.length) {
            if (this.d) {
                return -1;
            }
            a();
            if (this.b.length == 0) {
                this.b = null;
                return -1;
            }
            this.c = 0;
        }
        int[] iArr = this.b;
        int i = this.c;
        this.c = i + 1;
        return iArr[i];
    }
}
