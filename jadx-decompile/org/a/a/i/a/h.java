package org.a.a.i.a;

import android.util.Base64;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import java.security.Key;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.apache.http.impl.auth.NTLMEngine;
import org.apache.http.impl.auth.NTLMEngineException;
import org.apache.http.util.EncodingUtils;

@org.a.a.a.c
final class h implements NTLMEngine {
    protected static final int a = 1;
    protected static final int b = 4;
    protected static final int c = 16;
    protected static final int d = 32;
    protected static final int e = 128;
    protected static final int f = 512;
    protected static final int g = 4096;
    protected static final int h = 8192;
    protected static final int i = 32768;
    protected static final int j = 524288;
    protected static final int k = 33554432;
    protected static final int l = 8388608;
    protected static final int m = 536870912;
    protected static final int n = 1073741824;
    protected static final int o = Integer.MIN_VALUE;
    static final String p = "ASCII";
    private static final SecureRandom q;
    private static final byte[] s;
    private String r = p;

    protected static class a {
        protected final String a;
        protected final String b;
        protected final String c;
        protected final byte[] d;
        protected final String e;
        protected final byte[] f;
        protected byte[] g;
        protected byte[] h;
        protected byte[] i;
        protected byte[] j;
        protected byte[] k;
        protected byte[] l;
        protected byte[] m;
        protected byte[] n;
        protected byte[] o;
        protected byte[] p;
        protected byte[] q;
        protected byte[] r;
        protected byte[] s;
        protected byte[] t;
        protected byte[] u;
        protected byte[] v;
        protected byte[] w;
        protected byte[] x;
        protected byte[] y;
        protected byte[] z;

        public a(String str, String str2, String str3, byte[] bArr, String str4, byte[] bArr2) {
            this(str, str2, str3, bArr, str4, bArr2, null, null, null, null);
        }

        public a(String str, String str2, String str3, byte[] bArr, String str4, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
            this.k = null;
            this.l = null;
            this.m = null;
            this.n = null;
            this.o = null;
            this.p = null;
            this.q = null;
            this.r = null;
            this.s = null;
            this.t = null;
            this.u = null;
            this.v = null;
            this.w = null;
            this.x = null;
            this.y = null;
            this.z = null;
            this.a = str;
            this.e = str4;
            this.b = str2;
            this.c = str3;
            this.d = bArr;
            this.f = bArr2;
            this.g = bArr3;
            this.h = bArr4;
            this.i = bArr5;
            this.j = bArr6;
        }

        public byte[] a() {
            if (this.g == null) {
                this.g = h.e();
            }
            return this.g;
        }

        public byte[] b() {
            if (this.h == null) {
                this.h = h.e();
            }
            return this.h;
        }

        public byte[] c() {
            if (this.i == null) {
                this.i = h.f();
            }
            return this.i;
        }

        public byte[] d() {
            if (this.k == null) {
                this.k = h.i(this.c);
            }
            return this.k;
        }

        public byte[] e() {
            if (this.l == null) {
                this.l = h.d(d(), this.d);
            }
            return this.l;
        }

        public byte[] f() {
            if (this.m == null) {
                this.m = h.j(this.c);
            }
            return this.m;
        }

        public byte[] g() {
            if (this.n == null) {
                this.n = h.d(f(), this.d);
            }
            return this.n;
        }

        public byte[] h() {
            if (this.p == null) {
                this.p = h.c(this.a, this.b, f());
            }
            return this.p;
        }

        public byte[] i() {
            if (this.o == null) {
                this.o = h.d(this.a, this.b, f());
            }
            return this.o;
        }

        public byte[] j() {
            if (this.j == null) {
                long currentTimeMillis = NotificationOptions.a * (System.currentTimeMillis() + 11644473600000L);
                this.j = new byte[8];
                for (int i = 0; i < 8; i++) {
                    this.j[i] = (byte) ((int) currentTimeMillis);
                    currentTimeMillis >>>= 8;
                }
            }
            return this.j;
        }

        public byte[] k() {
            if (this.r == null) {
                this.r = h.e(b(), this.f, j());
            }
            return this.r;
        }

        public byte[] l() {
            if (this.s == null) {
                this.s = h.d(i(), this.d, k());
            }
            return this.s;
        }

        public byte[] m() {
            if (this.q == null) {
                this.q = h.d(h(), this.d, a());
            }
            return this.q;
        }

        public byte[] n() {
            if (this.t == null) {
                this.t = h.a(f(), this.d, a());
            }
            return this.t;
        }

        public byte[] o() {
            if (this.u == null) {
                Object a = a();
                this.u = new byte[24];
                System.arraycopy(a, 0, this.u, 0, a.length);
                Arrays.fill(this.u, a.length, this.u.length, (byte) 0);
            }
            return this.u;
        }

        public byte[] p() {
            if (this.v == null) {
                this.v = new byte[16];
                System.arraycopy(d(), 0, this.v, 0, 8);
                Arrays.fill(this.v, 8, 16, (byte) 0);
            }
            return this.v;
        }

        public byte[] q() {
            if (this.w == null) {
                c cVar = new c();
                cVar.a(f());
                this.w = cVar.a();
            }
            return this.w;
        }

        public byte[] r() {
            if (this.x == null) {
                byte[] i = i();
                byte[] bArr = new byte[16];
                System.arraycopy(l(), 0, bArr, 0, 16);
                this.x = h.a(bArr, i);
            }
            return this.x;
        }

        public byte[] s() {
            if (this.y == null) {
                Object o = o();
                byte[] bArr = new byte[(this.d.length + o.length)];
                System.arraycopy(this.d, 0, bArr, 0, this.d.length);
                System.arraycopy(o, 0, bArr, this.d.length, o.length);
                this.y = h.a(bArr, q());
            }
            return this.y;
        }

        public byte[] t() {
            if (this.z == null) {
                try {
                    byte[] bArr = new byte[14];
                    System.arraycopy(d(), 0, bArr, 0, 8);
                    Arrays.fill(bArr, 8, bArr.length, (byte) -67);
                    Key a = h.h(bArr, 0);
                    Key a2 = h.h(bArr, 7);
                    Object obj = new byte[8];
                    System.arraycopy(e(), 0, obj, 0, obj.length);
                    Cipher instance = Cipher.getInstance("DES/ECB/NoPadding");
                    instance.init(1, a);
                    Object doFinal = instance.doFinal(obj);
                    instance = Cipher.getInstance("DES/ECB/NoPadding");
                    instance.init(1, a2);
                    Object doFinal2 = instance.doFinal(obj);
                    this.z = new byte[16];
                    System.arraycopy(doFinal, 0, this.z, 0, doFinal.length);
                    System.arraycopy(doFinal2, 0, this.z, doFinal.length, doFinal2.length);
                } catch (Throwable e) {
                    throw new NTLMEngineException(e.getMessage(), e);
                }
            }
            return this.z;
        }
    }

    static class b {
        protected byte[] a;
        protected byte[] b;
        protected MessageDigest c;

        b(byte[] bArr) {
            try {
                this.c = MessageDigest.getInstance("MD5");
                this.a = new byte[64];
                this.b = new byte[64];
                int length = bArr.length;
                if (length > 64) {
                    this.c.update(bArr);
                    bArr = this.c.digest();
                    length = bArr.length;
                }
                int i = 0;
                while (i < length) {
                    this.a[i] = (byte) (bArr[i] ^ 54);
                    this.b[i] = (byte) (bArr[i] ^ 92);
                    i++;
                }
                for (length = i; length < 64; length++) {
                    this.a[length] = (byte) 54;
                    this.b[length] = (byte) 92;
                }
                this.c.reset();
                this.c.update(this.a);
            } catch (Throwable e) {
                throw new NTLMEngineException("Error getting md5 message digest implementation: " + e.getMessage(), e);
            }
        }

        void a(byte[] bArr) {
            this.c.update(bArr);
        }

        void a(byte[] bArr, int i, int i2) {
            this.c.update(bArr, i, i2);
        }

        byte[] a() {
            byte[] digest = this.c.digest();
            this.c.update(this.b);
            return this.c.digest(digest);
        }
    }

    static class c {
        protected int a = 1732584193;
        protected int b = -271733879;
        protected int c = -1732584194;
        protected int d = 271733878;
        protected long e = 0;
        protected byte[] f = new byte[64];

        c() {
        }

        void a(byte[] bArr) {
            int i = (int) (this.e & 63);
            int i2 = 0;
            while ((bArr.length - i2) + i >= this.f.length) {
                int length = this.f.length - i;
                System.arraycopy(bArr, i2, this.f, i, length);
                this.e += (long) length;
                i2 += length;
                b();
                i = 0;
            }
            if (i2 < bArr.length) {
                int length2 = bArr.length - i2;
                System.arraycopy(bArr, i2, this.f, i, length2);
                this.e += (long) length2;
                i2 = i + length2;
            }
        }

        protected void a(int[] iArr) {
            this.a = h.a((this.a + h.a(this.b, this.c, this.d)) + iArr[0], 3);
            this.d = h.a((this.d + h.a(this.a, this.b, this.c)) + iArr[1], 7);
            this.c = h.a((this.c + h.a(this.d, this.a, this.b)) + iArr[2], 11);
            this.b = h.a((this.b + h.a(this.c, this.d, this.a)) + iArr[3], 19);
            this.a = h.a((this.a + h.a(this.b, this.c, this.d)) + iArr[4], 3);
            this.d = h.a((this.d + h.a(this.a, this.b, this.c)) + iArr[5], 7);
            this.c = h.a((this.c + h.a(this.d, this.a, this.b)) + iArr[6], 11);
            this.b = h.a((this.b + h.a(this.c, this.d, this.a)) + iArr[7], 19);
            this.a = h.a((this.a + h.a(this.b, this.c, this.d)) + iArr[8], 3);
            this.d = h.a((this.d + h.a(this.a, this.b, this.c)) + iArr[9], 7);
            this.c = h.a((this.c + h.a(this.d, this.a, this.b)) + iArr[10], 11);
            this.b = h.a((this.b + h.a(this.c, this.d, this.a)) + iArr[11], 19);
            this.a = h.a((this.a + h.a(this.b, this.c, this.d)) + iArr[12], 3);
            this.d = h.a((this.d + h.a(this.a, this.b, this.c)) + iArr[13], 7);
            this.c = h.a((this.c + h.a(this.d, this.a, this.b)) + iArr[14], 11);
            this.b = h.a((this.b + h.a(this.c, this.d, this.a)) + iArr[15], 19);
        }

        byte[] a() {
            int i = (int) (this.e & 63);
            i = i < 56 ? 56 - i : 120 - i;
            byte[] bArr = new byte[(i + 8)];
            bArr[0] = Byte.MIN_VALUE;
            for (int i2 = 0; i2 < 8; i2++) {
                bArr[i + i2] = (byte) ((int) ((this.e * 8) >>> (i2 * 8)));
            }
            a(bArr);
            byte[] bArr2 = new byte[16];
            h.a(bArr2, this.a, 0);
            h.a(bArr2, this.b, 4);
            h.a(bArr2, this.c, 8);
            h.a(bArr2, this.d, 12);
            return bArr2;
        }

        protected void b() {
            int i;
            int[] iArr = new int[16];
            for (i = 0; i < 16; i++) {
                iArr[i] = (((this.f[i * 4] & 255) + ((this.f[(i * 4) + 1] & 255) << 8)) + ((this.f[(i * 4) + 2] & 255) << 16)) + ((this.f[(i * 4) + 3] & 255) << 24);
            }
            i = this.a;
            int i2 = this.b;
            int i3 = this.c;
            int i4 = this.d;
            a(iArr);
            b(iArr);
            c(iArr);
            this.a = i + this.a;
            this.b += i2;
            this.c += i3;
            this.d += i4;
        }

        protected void b(int[] iArr) {
            this.a = h.a(((this.a + h.b(this.b, this.c, this.d)) + iArr[0]) + 1518500249, 3);
            this.d = h.a(((this.d + h.b(this.a, this.b, this.c)) + iArr[4]) + 1518500249, 5);
            this.c = h.a(((this.c + h.b(this.d, this.a, this.b)) + iArr[8]) + 1518500249, 9);
            this.b = h.a(((this.b + h.b(this.c, this.d, this.a)) + iArr[12]) + 1518500249, 13);
            this.a = h.a(((this.a + h.b(this.b, this.c, this.d)) + iArr[1]) + 1518500249, 3);
            this.d = h.a(((this.d + h.b(this.a, this.b, this.c)) + iArr[5]) + 1518500249, 5);
            this.c = h.a(((this.c + h.b(this.d, this.a, this.b)) + iArr[9]) + 1518500249, 9);
            this.b = h.a(((this.b + h.b(this.c, this.d, this.a)) + iArr[13]) + 1518500249, 13);
            this.a = h.a(((this.a + h.b(this.b, this.c, this.d)) + iArr[2]) + 1518500249, 3);
            this.d = h.a(((this.d + h.b(this.a, this.b, this.c)) + iArr[6]) + 1518500249, 5);
            this.c = h.a(((this.c + h.b(this.d, this.a, this.b)) + iArr[10]) + 1518500249, 9);
            this.b = h.a(((this.b + h.b(this.c, this.d, this.a)) + iArr[14]) + 1518500249, 13);
            this.a = h.a(((this.a + h.b(this.b, this.c, this.d)) + iArr[3]) + 1518500249, 3);
            this.d = h.a(((this.d + h.b(this.a, this.b, this.c)) + iArr[7]) + 1518500249, 5);
            this.c = h.a(((this.c + h.b(this.d, this.a, this.b)) + iArr[11]) + 1518500249, 9);
            this.b = h.a(((this.b + h.b(this.c, this.d, this.a)) + iArr[15]) + 1518500249, 13);
        }

        protected void c(int[] iArr) {
            this.a = h.a(((this.a + h.c(this.b, this.c, this.d)) + iArr[0]) + 1859775393, 3);
            this.d = h.a(((this.d + h.c(this.a, this.b, this.c)) + iArr[8]) + 1859775393, 9);
            this.c = h.a(((this.c + h.c(this.d, this.a, this.b)) + iArr[4]) + 1859775393, 11);
            this.b = h.a(((this.b + h.c(this.c, this.d, this.a)) + iArr[12]) + 1859775393, 15);
            this.a = h.a(((this.a + h.c(this.b, this.c, this.d)) + iArr[2]) + 1859775393, 3);
            this.d = h.a(((this.d + h.c(this.a, this.b, this.c)) + iArr[10]) + 1859775393, 9);
            this.c = h.a(((this.c + h.c(this.d, this.a, this.b)) + iArr[6]) + 1859775393, 11);
            this.b = h.a(((this.b + h.c(this.c, this.d, this.a)) + iArr[14]) + 1859775393, 15);
            this.a = h.a(((this.a + h.c(this.b, this.c, this.d)) + iArr[1]) + 1859775393, 3);
            this.d = h.a(((this.d + h.c(this.a, this.b, this.c)) + iArr[9]) + 1859775393, 9);
            this.c = h.a(((this.c + h.c(this.d, this.a, this.b)) + iArr[5]) + 1859775393, 11);
            this.b = h.a(((this.b + h.c(this.c, this.d, this.a)) + iArr[13]) + 1859775393, 15);
            this.a = h.a(((this.a + h.c(this.b, this.c, this.d)) + iArr[3]) + 1859775393, 3);
            this.d = h.a(((this.d + h.c(this.a, this.b, this.c)) + iArr[11]) + 1859775393, 9);
            this.c = h.a(((this.c + h.c(this.d, this.a, this.b)) + iArr[7]) + 1859775393, 11);
            this.b = h.a(((this.b + h.c(this.c, this.d, this.a)) + iArr[15]) + 1859775393, 15);
        }
    }

    static class d {
        private byte[] a = null;
        private int b = 0;

        d() {
        }

        d(String str, int i) {
            int i2 = 0;
            this.a = Base64.decode(EncodingUtils.getBytes(str, h.p), 2);
            if (this.a.length < h.s.length) {
                throw new NTLMEngineException("NTLM message decoding error - packet too short");
            }
            while (i2 < h.s.length) {
                if (this.a[i2] != h.s[i2]) {
                    throw new NTLMEngineException("NTLM message expected - instead got unrecognized bytes");
                }
                i2++;
            }
            i2 = c(h.s.length);
            if (i2 != i) {
                throw new NTLMEngineException("NTLM type " + Integer.toString(i) + " message expected - instead got type " + Integer.toString(i2));
            }
            this.b = this.a.length;
        }

        protected byte a(int i) {
            if (this.a.length >= i + 1) {
                return this.a[i];
            }
            throw new NTLMEngineException("NTLM: Message too short");
        }

        protected int a() {
            return h.s.length + 4;
        }

        protected void a(byte b) {
            this.a[this.b] = b;
            this.b++;
        }

        protected void a(int i, int i2) {
            this.a = new byte[i];
            this.b = 0;
            a(h.s);
            f(i2);
        }

        protected void a(byte[] bArr) {
            if (bArr != null) {
                for (byte b : bArr) {
                    this.a[this.b] = b;
                    this.b++;
                }
            }
        }

        protected void a(byte[] bArr, int i) {
            if (this.a.length < bArr.length + i) {
                throw new NTLMEngineException("NTLM: Message too short");
            }
            System.arraycopy(this.a, i, bArr, 0, bArr.length);
        }

        protected int b() {
            return this.b;
        }

        protected int b(int i) {
            return h.f(this.a, i);
        }

        protected int c(int i) {
            return h.e(this.a, i);
        }

        String c() {
            byte[] bArr;
            if (this.a.length > this.b) {
                bArr = new byte[this.b];
                System.arraycopy(this.a, 0, bArr, 0, this.b);
            } else {
                bArr = this.a;
            }
            return EncodingUtils.getAsciiString(Base64.encode(bArr, 2));
        }

        protected byte[] d(int i) {
            return h.g(this.a, i);
        }

        protected void e(int i) {
            a((byte) (i & 255));
            a((byte) ((i >> 8) & 255));
        }

        protected void f(int i) {
            a((byte) (i & 255));
            a((byte) ((i >> 8) & 255));
            a((byte) ((i >> 16) & 255));
            a((byte) ((i >> 24) & 255));
        }
    }

    static class e extends d {
        protected byte[] a;
        protected byte[] b;

        e(String str, String str2) {
            byte[] bArr = null;
            try {
                String d = h.g(str2);
                String e = h.h(str);
                this.a = d != null ? d.getBytes(h.p) : null;
                if (e != null) {
                    bArr = e.toUpperCase(Locale.ENGLISH).getBytes(h.p);
                }
                this.b = bArr;
            } catch (Throwable e2) {
                throw new NTLMEngineException("Unicode unsupported: " + e2.getMessage(), e2);
            }
        }

        String c() {
            a(40, 1);
            f(-1576500735);
            e(0);
            e(0);
            f(40);
            e(0);
            e(0);
            f(40);
            e(261);
            f(2600);
            e(3840);
            return super.c();
        }
    }

    static class f extends d {
        protected byte[] a = new byte[8];
        protected String b;
        protected byte[] c;
        protected int d;

        f(String str) {
            super(str, 2);
            a(this.a, 24);
            this.d = c(20);
            if ((this.d & 1) == 0) {
                throw new NTLMEngineException("NTLM type 2 message has flags that make no sense: " + Integer.toString(this.d));
            }
            byte[] d;
            this.b = null;
            if (b() >= 20) {
                d = d(12);
                if (d.length != 0) {
                    try {
                        this.b = new String(d, "UnicodeLittleUnmarked");
                    } catch (Throwable e) {
                        throw new NTLMEngineException(e.getMessage(), e);
                    }
                }
            }
            this.c = null;
            if (b() >= 48) {
                d = d(40);
                if (d.length != 0) {
                    this.c = d;
                }
            }
        }

        byte[] d() {
            return this.a;
        }

        String e() {
            return this.b;
        }

        byte[] f() {
            return this.c;
        }

        int g() {
            return this.d;
        }
    }

    static class g extends d {
        protected int a;
        protected byte[] b;
        protected byte[] c;
        protected byte[] d;
        protected byte[] e;
        protected byte[] f;
        protected byte[] g;

        g(String str, String str2, String str3, String str4, byte[] bArr, int i, String str5, byte[] bArr2) {
            byte[] t;
            byte[] bytes;
            this.a = i;
            String d = h.g(str2);
            String e = h.h(str);
            a aVar = new a(e, str3, str4, bArr, str5, bArr2);
            if ((8388608 & i) != 0 && bArr2 != null && str5 != null) {
                try {
                    this.f = aVar.l();
                    this.e = aVar.m();
                    t = (i & 128) != 0 ? aVar.t() : aVar.r();
                } catch (NTLMEngineException e2) {
                    this.f = new byte[0];
                    this.e = aVar.e();
                    t = (i & 128) != 0 ? aVar.t() : aVar.p();
                }
            } else if ((524288 & i) != 0) {
                this.f = aVar.n();
                this.e = aVar.o();
                t = (i & 128) != 0 ? aVar.t() : aVar.s();
            } else {
                this.f = aVar.g();
                this.e = aVar.e();
                t = (i & 128) != 0 ? aVar.t() : aVar.q();
            }
            if ((i & 16) == 0) {
                this.g = null;
            } else if ((h.n & i) != 0) {
                this.g = h.b(aVar.c(), t);
            } else {
                this.g = t;
            }
            if (d != null) {
                try {
                    bytes = d.getBytes("UnicodeLittleUnmarked");
                } catch (Throwable e3) {
                    throw new NTLMEngineException("Unicode not supported: " + e3.getMessage(), e3);
                }
            }
            bytes = null;
            this.c = bytes;
            this.b = e != null ? e.toUpperCase(Locale.ENGLISH).getBytes("UnicodeLittleUnmarked") : null;
            this.d = str3.getBytes("UnicodeLittleUnmarked");
        }

        String c() {
            int i = 0;
            int length = this.f.length;
            int length2 = this.e.length;
            int length3 = this.b != null ? this.b.length : 0;
            int length4 = this.c != null ? this.c.length : 0;
            int length5 = this.d.length;
            if (this.g != null) {
                i = this.g.length;
            }
            int i2 = length2 + 72;
            int i3 = i2 + length;
            int i4 = i3 + length3;
            int i5 = i4 + length5;
            int i6 = i5 + length4;
            a(i6 + i, 3);
            e(length2);
            e(length2);
            f(72);
            e(length);
            e(length);
            f(i2);
            e(length3);
            e(length3);
            f(i3);
            e(length5);
            e(length5);
            f(i4);
            e(length4);
            e(length4);
            f(i5);
            e(i);
            e(i);
            f(i6);
            f(((((((((((((this.a & 128) | (this.a & 512)) | (this.a & 524288)) | h.k) | (this.a & 32768)) | (this.a & 32)) | (this.a & 16)) | (this.a & 536870912)) | (this.a & Integer.MIN_VALUE)) | (this.a & h.n)) | (this.a & 8388608)) | (this.a & 1)) | (this.a & 4));
            e(261);
            f(2600);
            e(3840);
            a(this.e);
            a(this.f);
            a(this.b);
            a(this.d);
            a(this.c);
            if (this.g != null) {
                a(this.g);
            }
            return super.c();
        }
    }

    static {
        SecureRandom secureRandom = null;
        try {
            secureRandom = SecureRandom.getInstance("SHA1PRNG");
        } catch (Exception e) {
        }
        q = secureRandom;
        Object bytes = EncodingUtils.getBytes("NTLMSSP", p);
        s = new byte[(bytes.length + 1)];
        System.arraycopy(bytes, 0, s, 0, bytes.length);
        s[bytes.length] = (byte) 0;
    }

    h() {
    }

    static int a(int i, int i2) {
        return (i << i2) | (i >>> (32 - i2));
    }

    static int a(int i, int i2, int i3) {
        return (i & i2) | ((i ^ -1) & i3);
    }

    private static void a(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            if (((((b >>> 1) ^ ((((((b >>> 7) ^ (b >>> 6)) ^ (b >>> 5)) ^ (b >>> 4)) ^ (b >>> 3)) ^ (b >>> 2))) & 1) == 0 ? 1 : null) != null) {
                bArr[i] = (byte) (bArr[i] | 1);
            } else {
                bArr[i] = (byte) (bArr[i] & -2);
            }
        }
    }

    static void a(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) (i & 255);
        bArr[i2 + 1] = (byte) ((i >> 8) & 255);
        bArr[i2 + 2] = (byte) ((i >> 16) & 255);
        bArr[i2 + 3] = (byte) ((i >> 24) & 255);
    }

    static byte[] a(byte[] bArr, byte[] bArr2) {
        b bVar = new b(bArr2);
        bVar.a(bArr);
        return bVar.a();
    }

    static byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr2);
            instance.update(bArr3);
            byte[] bArr4 = new byte[8];
            System.arraycopy(instance.digest(), 0, bArr4, 0, 8);
            return d(bArr, bArr4);
        } catch (Throwable e) {
            if (e instanceof NTLMEngineException) {
                throw ((NTLMEngineException) e);
            }
            throw new NTLMEngineException(e.getMessage(), e);
        }
    }

    static int b(int i, int i2, int i3) {
        return ((i & i2) | (i & i3)) | (i2 & i3);
    }

    static byte[] b(byte[] bArr, byte[] bArr2) {
        try {
            Cipher instance = Cipher.getInstance("RC4");
            instance.init(1, new SecretKeySpec(bArr2, "RC4"));
            return instance.doFinal(bArr);
        } catch (Throwable e) {
            throw new NTLMEngineException(e.getMessage(), e);
        }
    }

    static int c(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    private static byte[] c(String str, String str2, byte[] bArr) {
        try {
            b bVar = new b(bArr);
            bVar.a(str2.toUpperCase(Locale.ENGLISH).getBytes("UnicodeLittleUnmarked"));
            if (str != null) {
                bVar.a(str.toUpperCase(Locale.ENGLISH).getBytes("UnicodeLittleUnmarked"));
            }
            return bVar.a();
        } catch (Throwable e) {
            throw new NTLMEngineException("Unicode not supported! " + e.getMessage(), e);
        }
    }

    private static byte[] d(String str, String str2, byte[] bArr) {
        try {
            b bVar = new b(bArr);
            bVar.a(str2.toUpperCase(Locale.ENGLISH).getBytes("UnicodeLittleUnmarked"));
            if (str != null) {
                bVar.a(str.getBytes("UnicodeLittleUnmarked"));
            }
            return bVar.a();
        } catch (Throwable e) {
            throw new NTLMEngineException("Unicode not supported! " + e.getMessage(), e);
        }
    }

    private static byte[] d(byte[] bArr, byte[] bArr2) {
        try {
            Object obj = new byte[21];
            System.arraycopy(bArr, 0, obj, 0, 16);
            Key h = h(obj, 0);
            Key h2 = h(obj, 7);
            Key h3 = h(obj, 14);
            Cipher instance = Cipher.getInstance("DES/ECB/NoPadding");
            instance.init(1, h);
            Object doFinal = instance.doFinal(bArr2);
            instance.init(1, h2);
            Object doFinal2 = instance.doFinal(bArr2);
            instance.init(1, h3);
            obj = instance.doFinal(bArr2);
            Object obj2 = new byte[24];
            System.arraycopy(doFinal, 0, obj2, 0, 8);
            System.arraycopy(doFinal2, 0, obj2, 8, 8);
            System.arraycopy(obj, 0, obj2, 16, 8);
            return obj2;
        } catch (Throwable e) {
            throw new NTLMEngineException(e.getMessage(), e);
        }
    }

    private static byte[] d(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        b bVar = new b(bArr);
        bVar.a(bArr2);
        bVar.a(bArr3);
        Object a = bVar.a();
        Object obj = new byte[(a.length + bArr3.length)];
        System.arraycopy(a, 0, obj, 0, a.length);
        System.arraycopy(bArr3, 0, obj, a.length, bArr3.length);
        return obj;
    }

    private static int e(byte[] bArr, int i) {
        if (bArr.length >= i + 4) {
            return (((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8)) | ((bArr[i + 2] & 255) << 16)) | ((bArr[i + 3] & 255) << 24);
        }
        throw new NTLMEngineException("NTLM authentication - buffer too small for DWORD");
    }

    private static byte[] e() {
        if (q == null) {
            throw new NTLMEngineException("Random generator not available");
        }
        byte[] bArr = new byte[8];
        synchronized (q) {
            q.nextBytes(bArr);
        }
        return bArr;
    }

    private static byte[] e(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        Object obj = new byte[]{(byte) 1, (byte) 1, (byte) 0, (byte) 0};
        Object obj2 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0};
        Object obj3 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0};
        Object obj4 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0};
        Object obj5 = new byte[((((((obj.length + obj2.length) + bArr3.length) + 8) + obj3.length) + bArr2.length) + obj4.length)];
        System.arraycopy(obj, 0, obj5, 0, obj.length);
        int length = obj.length + 0;
        System.arraycopy(obj2, 0, obj5, length, obj2.length);
        length += obj2.length;
        System.arraycopy(bArr3, 0, obj5, length, bArr3.length);
        length += bArr3.length;
        System.arraycopy(bArr, 0, obj5, length, 8);
        length += 8;
        System.arraycopy(obj3, 0, obj5, length, obj3.length);
        length += obj3.length;
        System.arraycopy(bArr2, 0, obj5, length, bArr2.length);
        length += bArr2.length;
        System.arraycopy(obj4, 0, obj5, length, obj4.length);
        length += obj4.length;
        return obj5;
    }

    private static int f(byte[] bArr, int i) {
        if (bArr.length >= i + 2) {
            return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
        }
        throw new NTLMEngineException("NTLM authentication - buffer too small for WORD");
    }

    private static String f(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(".");
        return indexOf != -1 ? str.substring(0, indexOf) : str;
    }

    private static byte[] f() {
        if (q == null) {
            throw new NTLMEngineException("Random generator not available");
        }
        byte[] bArr = new byte[16];
        synchronized (q) {
            q.nextBytes(bArr);
        }
        return bArr;
    }

    private static String g(String str) {
        return f(str);
    }

    private static byte[] g(byte[] bArr, int i) {
        int f = f(bArr, i);
        int e = e(bArr, i + 4);
        if (bArr.length < e + f) {
            throw new NTLMEngineException("NTLM authentication - buffer too small for data item");
        }
        Object obj = new byte[f];
        System.arraycopy(bArr, e, obj, 0, f);
        return obj;
    }

    private static String h(String str) {
        return f(str);
    }

    private static Key h(byte[] bArr, int i) {
        r0 = new byte[7];
        System.arraycopy(bArr, i, r0, 0, 7);
        byte[] bArr2 = new byte[]{r0[0], (byte) ((r0[0] << 7) | ((r0[1] & 255) >>> 1)), (byte) ((r0[1] << 6) | ((r0[2] & 255) >>> 2)), (byte) ((r0[2] << 5) | ((r0[3] & 255) >>> 3)), (byte) ((r0[3] << 4) | ((r0[4] & 255) >>> 4)), (byte) ((r0[4] << 3) | ((r0[5] & 255) >>> 5)), (byte) ((r0[5] << 2) | ((r0[6] & 255) >>> 6)), (byte) (r0[6] << 1)};
        a(bArr2);
        return new SecretKeySpec(bArr2, "DES");
    }

    private static byte[] i(String str) {
        try {
            Object bytes = str.toUpperCase(Locale.ENGLISH).getBytes("US-ASCII");
            Object obj = new byte[14];
            System.arraycopy(bytes, 0, obj, 0, Math.min(bytes.length, 14));
            Key h = h(obj, 0);
            Key h2 = h(obj, 7);
            byte[] bytes2 = "KGS!@#$%".getBytes("US-ASCII");
            Cipher instance = Cipher.getInstance("DES/ECB/NoPadding");
            instance.init(1, h);
            bytes = instance.doFinal(bytes2);
            instance.init(1, h2);
            Object doFinal = instance.doFinal(bytes2);
            obj = new byte[16];
            System.arraycopy(bytes, 0, obj, 0, 8);
            System.arraycopy(doFinal, 0, obj, 8, 8);
            return obj;
        } catch (Throwable e) {
            throw new NTLMEngineException(e.getMessage(), e);
        }
    }

    private static byte[] j(String str) {
        try {
            byte[] bytes = str.getBytes("UnicodeLittleUnmarked");
            c cVar = new c();
            cVar.a(bytes);
            return cVar.a();
        } catch (Throwable e) {
            throw new NTLMEngineException("Unicode not supported: " + e.getMessage(), e);
        }
    }

    String a() {
        return this.r;
    }

    String a(String str, String str2) {
        return new e(str2, str).c();
    }

    final String a(String str, String str2, String str3, String str4, String str5) {
        if (str == null || str.trim().equals("")) {
            return a(str4, str5);
        }
        f fVar = new f(str);
        return a(str2, str3, str4, str5, fVar.d(), fVar.g(), fVar.e(), fVar.f());
    }

    String a(String str, String str2, String str3, String str4, byte[] bArr, int i, String str5, byte[] bArr2) {
        return new g(str4, str3, str, str2, bArr, i, str5, bArr2).c();
    }

    void a(String str) {
        this.r = str;
    }

    public String generateType1Msg(String str, String str2) {
        return a(str2, str);
    }

    public String generateType3Msg(String str, String str2, String str3, String str4, String str5) {
        f fVar = new f(str5);
        return a(str, str2, str4, str3, fVar.d(), fVar.g(), fVar.e(), fVar.f());
    }
}
