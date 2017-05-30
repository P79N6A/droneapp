package it.a.a.a;

import java.io.OutputStream;

class c extends OutputStream {
    private OutputStream a;
    private int b;
    private int c;
    private int d;
    private int e;

    public c(OutputStream outputStream) {
        this(outputStream, 76);
    }

    public c(OutputStream outputStream, int i) {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.a = outputStream;
        this.e = i;
    }

    protected void a() {
        if (this.c > 0) {
            if (this.e > 0 && this.d == this.e) {
                this.a.write("\r\n".getBytes());
                this.d = 0;
            }
            char charAt = a.a.charAt((this.b << 8) >>> 26);
            char charAt2 = a.a.charAt((this.b << 14) >>> 26);
            int charAt3 = this.c < 2 ? a.b : a.a.charAt((this.b << 20) >>> 26);
            int charAt4 = this.c < 3 ? a.b : a.a.charAt((this.b << 26) >>> 26);
            this.a.write(charAt);
            this.a.write(charAt2);
            this.a.write(charAt3);
            this.a.write(charAt4);
            this.d += 4;
            this.c = 0;
            this.b = 0;
        }
    }

    public void close() {
        a();
        this.a.close();
    }

    public void write(int i) {
        this.b = ((i & 255) << (16 - (this.c * 8))) | this.b;
        this.c++;
        if (this.c == 3) {
            a();
        }
    }
}
