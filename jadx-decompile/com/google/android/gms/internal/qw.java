package com.google.android.gms.internal;

import com.fimi.soul.media.player.FimiMediaMeta;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

public final class qw {
    private final ByteBuffer a;

    public static class a extends IOException {
        a(int i, int i2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space (pos " + i + " limit " + i2 + ").");
        }
    }

    private qw(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
        this.a.order(ByteOrder.LITTLE_ENDIAN);
    }

    private qw(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, i, i2));
    }

    private static int a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < '') {
            i++;
        }
        int i2 = i;
        i = length;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt >= 'ࠀ') {
                i += a(charSequence, i2);
                break;
            }
            i2++;
            i = ((127 - charAt) >>> 31) + i;
        }
        if (i >= length) {
            return i;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i) + FimiMediaMeta.AV_CH_WIDE_RIGHT));
    }

    private static int a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        int i3 = i;
        while (i3 < length) {
            char charAt = charSequence.charAt(i3);
            if (charAt < 'ࠀ') {
                i2 += (127 - charAt) >>> 31;
            } else {
                i2 += 2;
                if ('?' <= charAt && charAt <= '?') {
                    if (Character.codePointAt(charSequence, i3) < 65536) {
                        throw new IllegalArgumentException("Unpaired surrogate at index " + i3);
                    }
                    i3++;
                }
            }
            i3++;
        }
        return i2;
    }

    private static int a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int length = charSequence.length();
        int i3 = 0;
        int i4 = i + i2;
        while (i3 < length && i3 + i < i4) {
            char charAt = charSequence.charAt(i3);
            if (charAt >= '') {
                break;
            }
            bArr[i + i3] = (byte) charAt;
            i3++;
        }
        if (i3 == length) {
            return i + length;
        }
        int i5 = i + i3;
        while (i3 < length) {
            int i6;
            char charAt2 = charSequence.charAt(i3);
            if (charAt2 < '' && i5 < i4) {
                i6 = i5 + 1;
                bArr[i5] = (byte) charAt2;
            } else if (charAt2 < 'ࠀ' && i5 <= i4 - 2) {
                r6 = i5 + 1;
                bArr[i5] = (byte) ((charAt2 >>> 6) | 960);
                i6 = r6 + 1;
                bArr[r6] = (byte) ((charAt2 & 63) | 128);
            } else if ((charAt2 < '?' || '?' < charAt2) && i5 <= i4 - 3) {
                i6 = i5 + 1;
                bArr[i5] = (byte) ((charAt2 >>> 12) | 480);
                i5 = i6 + 1;
                bArr[i6] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i6 = i5 + 1;
                bArr[i5] = (byte) ((charAt2 & 63) | 128);
            } else if (i5 <= i4 - 4) {
                if (i3 + 1 != charSequence.length()) {
                    i3++;
                    charAt = charSequence.charAt(i3);
                    if (Character.isSurrogatePair(charAt2, charAt)) {
                        int toCodePoint = Character.toCodePoint(charAt2, charAt);
                        i6 = i5 + 1;
                        bArr[i5] = (byte) ((toCodePoint >>> 18) | 240);
                        i5 = i6 + 1;
                        bArr[i6] = (byte) (((toCodePoint >>> 12) & 63) | 128);
                        r6 = i5 + 1;
                        bArr[i5] = (byte) (((toCodePoint >>> 6) & 63) | 128);
                        i6 = r6 + 1;
                        bArr[r6] = (byte) ((toCodePoint & 63) | 128);
                    }
                }
                throw new IllegalArgumentException("Unpaired surrogate at index " + (i3 - 1));
            } else {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i5);
            }
            i3++;
            i5 = i6;
        }
        return i5;
    }

    public static qw a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static qw a(byte[] bArr, int i, int i2) {
        return new qw(bArr, i, i2);
    }

    private static void a(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        } else if (byteBuffer.hasArray()) {
            try {
                byteBuffer.position(a(charSequence, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()) - byteBuffer.arrayOffset());
            } catch (Throwable e) {
                BufferOverflowException bufferOverflowException = new BufferOverflowException();
                bufferOverflowException.initCause(e);
                throw bufferOverflowException;
            }
        } else {
            b(charSequence, byteBuffer);
        }
    }

    public static int b(double d) {
        return 8;
    }

    public static int b(float f) {
        return 4;
    }

    public static int b(int i, double d) {
        return f(i) + b(d);
    }

    public static int b(int i, float f) {
        return f(i) + b(f);
    }

    public static int b(int i, rd rdVar) {
        return (f(i) * 2) + c(rdVar);
    }

    public static int b(int i, String str) {
        return f(i) + b(str);
    }

    public static int b(int i, boolean z) {
        return f(i) + b(z);
    }

    public static int b(int i, byte[] bArr) {
        return f(i) + c(bArr);
    }

    public static int b(String str) {
        int a = a((CharSequence) str);
        return a + h(a);
    }

    public static int b(boolean z) {
        return 1;
    }

    private static void b(CharSequence charSequence, ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt < '') {
                byteBuffer.put((byte) charAt);
            } else if (charAt < 'ࠀ') {
                byteBuffer.put((byte) ((charAt >>> 6) | 960));
                byteBuffer.put((byte) ((charAt & 63) | 128));
            } else if (charAt < '?' || '?' < charAt) {
                byteBuffer.put((byte) ((charAt >>> 12) | 480));
                byteBuffer.put((byte) (((charAt >>> 6) & 63) | 128));
                byteBuffer.put((byte) ((charAt & 63) | 128));
            } else {
                if (i + 1 != charSequence.length()) {
                    i++;
                    char charAt2 = charSequence.charAt(i);
                    if (Character.isSurrogatePair(charAt, charAt2)) {
                        int toCodePoint = Character.toCodePoint(charAt, charAt2);
                        byteBuffer.put((byte) ((toCodePoint >>> 18) | 240));
                        byteBuffer.put((byte) (((toCodePoint >>> 12) & 63) | 128));
                        byteBuffer.put((byte) (((toCodePoint >>> 6) & 63) | 128));
                        byteBuffer.put((byte) ((toCodePoint & 63) | 128));
                    }
                }
                throw new IllegalArgumentException("Unpaired surrogate at index " + (i - 1));
            }
            i++;
        }
    }

    public static int c(int i) {
        return i >= 0 ? h(i) : 10;
    }

    public static int c(int i, int i2) {
        return f(i) + c(i2);
    }

    public static int c(int i, rd rdVar) {
        return f(i) + d(rdVar);
    }

    public static int c(rd rdVar) {
        return rdVar.g();
    }

    public static int c(byte[] bArr) {
        return h(bArr.length) + bArr.length;
    }

    public static int d(int i) {
        return h(j(i));
    }

    public static int d(int i, int i2) {
        return f(i) + d(i2);
    }

    public static int d(rd rdVar) {
        int g = rdVar.g();
        return g + h(g);
    }

    public static int e(int i, long j) {
        return f(i) + e(j);
    }

    public static int e(long j) {
        return j(j);
    }

    public static int f(int i) {
        return h(rg.a(i, 0));
    }

    public static int f(int i, long j) {
        return f(i) + f(j);
    }

    public static int f(long j) {
        return j(j);
    }

    public static int g(int i, long j) {
        return f(i) + g(j);
    }

    public static int g(long j) {
        return 8;
    }

    public static int h(int i) {
        return (i & -128) == 0 ? 1 : (i & -16384) == 0 ? 2 : (-2097152 & i) == 0 ? 3 : (-268435456 & i) == 0 ? 4 : 5;
    }

    public static int h(int i, long j) {
        return f(i) + h(j);
    }

    public static int h(long j) {
        return j(l(j));
    }

    public static int j(int i) {
        return (i << 1) ^ (i >> 31);
    }

    public static int j(long j) {
        return (-128 & j) == 0 ? 1 : (-16384 & j) == 0 ? 2 : (-2097152 & j) == 0 ? 3 : (-268435456 & j) == 0 ? 4 : (-34359738368L & j) == 0 ? 5 : (-4398046511104L & j) == 0 ? 6 : (-562949953421312L & j) == 0 ? 7 : (-72057594037927936L & j) == 0 ? 8 : (Long.MIN_VALUE & j) == 0 ? 9 : 10;
    }

    public static long l(long j) {
        return (j << 1) ^ (j >> 63);
    }

    public int a() {
        return this.a.remaining();
    }

    public void a(byte b) {
        if (this.a.hasRemaining()) {
            this.a.put(b);
            return;
        }
        throw new a(this.a.position(), this.a.limit());
    }

    public void a(double d) {
        k(Double.doubleToLongBits(d));
    }

    public void a(float f) {
        i(Float.floatToIntBits(f));
    }

    public void a(int i) {
        if (i >= 0) {
            g(i);
        } else {
            i((long) i);
        }
    }

    public void a(int i, double d) {
        e(i, 1);
        a(d);
    }

    public void a(int i, float f) {
        e(i, 5);
        a(f);
    }

    public void a(int i, int i2) {
        e(i, 0);
        a(i2);
    }

    public void a(int i, long j) {
        e(i, 0);
        a(j);
    }

    public void a(int i, rd rdVar) {
        e(i, 2);
        b(rdVar);
    }

    public void a(int i, String str) {
        e(i, 2);
        a(str);
    }

    public void a(int i, boolean z) {
        e(i, 0);
        a(z);
    }

    public void a(int i, byte[] bArr) {
        e(i, 2);
        b(bArr);
    }

    public void a(long j) {
        i(j);
    }

    public void a(rd rdVar) {
        rdVar.a(this);
    }

    public void a(String str) {
        try {
            int h = h(str.length());
            if (h == h(str.length() * 3)) {
                int position = this.a.position();
                if (this.a.remaining() < h) {
                    throw new a(h + position, this.a.limit());
                }
                this.a.position(position + h);
                a((CharSequence) str, this.a);
                int position2 = this.a.position();
                this.a.position(position);
                g((position2 - position) - h);
                this.a.position(position2);
                return;
            }
            g(a((CharSequence) str));
            a((CharSequence) str, this.a);
        } catch (Throwable e) {
            a aVar = new a(this.a.position(), this.a.limit());
            aVar.initCause(e);
            throw aVar;
        }
    }

    public void a(boolean z) {
        e(z ? 1 : 0);
    }

    public void b() {
        if (a() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public void b(int i) {
        g(j(i));
    }

    public void b(int i, int i2) {
        e(i, 0);
        b(i2);
    }

    public void b(int i, long j) {
        e(i, 0);
        b(j);
    }

    public void b(long j) {
        i(j);
    }

    public void b(rd rdVar) {
        g(rdVar.f());
        rdVar.a(this);
    }

    public void b(byte[] bArr) {
        g(bArr.length);
        d(bArr);
    }

    public void b(byte[] bArr, int i, int i2) {
        if (this.a.remaining() >= i2) {
            this.a.put(bArr, i, i2);
            return;
        }
        throw new a(this.a.position(), this.a.limit());
    }

    public void c(int i, long j) {
        e(i, 1);
        c(j);
    }

    public void c(long j) {
        k(j);
    }

    public void d(int i, long j) {
        e(i, 0);
        d(j);
    }

    public void d(long j) {
        i(l(j));
    }

    public void d(byte[] bArr) {
        b(bArr, 0, bArr.length);
    }

    public void e(int i) {
        a((byte) i);
    }

    public void e(int i, int i2) {
        g(rg.a(i, i2));
    }

    public void g(int i) {
        while ((i & -128) != 0) {
            e((i & 127) | 128);
            i >>>= 7;
        }
        e(i);
    }

    public void i(int i) {
        if (this.a.remaining() < 4) {
            throw new a(this.a.position(), this.a.limit());
        }
        this.a.putInt(i);
    }

    public void i(long j) {
        while ((-128 & j) != 0) {
            e((((int) j) & 127) | 128);
            j >>>= 7;
        }
        e((int) j);
    }

    public void k(long j) {
        if (this.a.remaining() < 8) {
            throw new a(this.a.position(), this.a.limit());
        }
        this.a.putLong(j);
    }
}
