package org.a.b.c;

import org.a.b.d;

public class b extends d {
    private d a;
    private int b;

    public b(int i) {
        this.a = new d(i);
    }

    public int a(byte[] bArr, int i, int i2) {
        Object a = this.a.a();
        if (i2 > this.a.b() - this.b) {
            i2 = this.a.b() - this.b;
        }
        if (i2 > 0) {
            System.arraycopy(a, this.b, bArr, i, i2);
            this.b += i2;
        }
        return i2;
    }

    public void b(byte[] bArr, int i, int i2) {
        this.a.write(bArr, i, i2);
    }

    public int w_() {
        return this.a.size();
    }
}
