package com.b.a.b.a;

import org.codehaus.jackson.org.objectweb.asm.Opcodes;

public class e {
    private static final int a = 9;
    private static final String b = "x";
    private final int c;
    private final int d;

    public e(int i, int i2) {
        this.c = i;
        this.d = i2;
    }

    public e(int i, int i2, int i3) {
        if (i3 % Opcodes.GETFIELD == 0) {
            this.c = i;
            this.d = i2;
            return;
        }
        this.c = i2;
        this.d = i;
    }

    public int a() {
        return this.c;
    }

    public e a(float f) {
        return new e((int) (((float) this.c) * f), (int) (((float) this.d) * f));
    }

    public e a(int i) {
        return new e(this.c / i, this.d / i);
    }

    public int b() {
        return this.d;
    }

    public String toString() {
        return this.c + b + this.d;
    }
}
