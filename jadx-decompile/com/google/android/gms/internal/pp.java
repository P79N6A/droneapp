package com.google.android.gms.internal;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;

public class pp implements Closeable {
    private static final char[] a = ")]}'\n".toCharArray();
    private final Reader b;
    private boolean c = false;
    private final char[] d = new char[1024];
    private int e = 0;
    private int f = 0;
    private int g = 0;
    private int h = 0;
    private int i = 0;
    private long j;
    private int k;
    private String l;
    private int[] m = new int[32];
    private int n = 0;
    private String[] o;
    private int[] p;

    static {
        ou.a = new ou() {
            public void a(pp ppVar) {
                if (ppVar instanceof pf) {
                    ((pf) ppVar).o();
                    return;
                }
                int a = ppVar.i;
                if (a == 0) {
                    a = ppVar.o();
                }
                if (a == 13) {
                    ppVar.i = 9;
                } else if (a == 12) {
                    ppVar.i = 8;
                } else if (a == 14) {
                    ppVar.i = 10;
                } else {
                    String valueOf = String.valueOf(ppVar.f());
                    int c = ppVar.v();
                    int d = ppVar.w();
                    String q = ppVar.q();
                    throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 70) + String.valueOf(q).length()).append("Expected a name but was ").append(valueOf).append(" ").append(" at line ").append(c).append(" column ").append(d).append(" path ").append(q).toString());
                }
            }
        };
    }

    public pp(Reader reader) {
        int[] iArr = this.m;
        int i = this.n;
        this.n = i + 1;
        iArr[i] = 6;
        this.o = new String[32];
        this.p = new int[32];
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.b = reader;
    }

    private void A() {
        b(true);
        this.e--;
        if (this.e + a.length <= this.f || b(a.length)) {
            int i = 0;
            while (i < a.length) {
                if (this.d[this.e + i] == a[i]) {
                    i++;
                } else {
                    return;
                }
            }
            this.e += a.length;
        }
    }

    private void a(int i) {
        if (this.n == this.m.length) {
            Object obj = new int[(this.n * 2)];
            Object obj2 = new int[(this.n * 2)];
            Object obj3 = new String[(this.n * 2)];
            System.arraycopy(this.m, 0, obj, 0, this.n);
            System.arraycopy(this.p, 0, obj2, 0, this.n);
            System.arraycopy(this.o, 0, obj3, 0, this.n);
            this.m = obj;
            this.p = obj2;
            this.o = obj3;
        }
        int[] iArr = this.m;
        int i2 = this.n;
        this.n = i2 + 1;
        iArr[i2] = i;
    }

    private boolean a(char c) {
        switch (c) {
            case '\t':
            case '\n':
            case '\f':
            case '\r':
            case ' ':
            case ',':
            case ':':
            case '[':
            case ']':
            case Opcodes.LSHR /*123*/:
            case '}':
                break;
            case '#':
            case '/':
            case ';':
            case '=':
            case '\\':
                x();
                break;
            default:
                return true;
        }
        return false;
    }

    private boolean a(String str) {
        while (true) {
            if (this.e + str.length() > this.f && !b(str.length())) {
                return false;
            }
            if (this.d[this.e] == '\n') {
                this.g++;
                this.h = this.e + 1;
            } else {
                int i = 0;
                while (i < str.length()) {
                    if (this.d[this.e + i] == str.charAt(i)) {
                        i++;
                    }
                }
                return true;
            }
            this.e++;
        }
    }

    private int b(boolean z) {
        char[] cArr = this.d;
        int i = this.e;
        int i2 = this.f;
        while (true) {
            int v;
            if (i == i2) {
                this.e = i;
                if (b(1)) {
                    i = this.e;
                    i2 = this.f;
                } else if (!z) {
                    return -1;
                } else {
                    String valueOf = String.valueOf("End of input at line ");
                    v = v();
                    throw new EOFException(new StringBuilder(String.valueOf(valueOf).length() + 30).append(valueOf).append(v).append(" column ").append(w()).toString());
                }
            }
            v = i + 1;
            char c = cArr[i];
            if (c == '\n') {
                this.g++;
                this.h = v;
                i = v;
            } else if (c == l.c || c == l.a) {
                i = v;
            } else if (c == '\t') {
                i = v;
            } else if (c == '/') {
                this.e = v;
                if (v == i2) {
                    this.e--;
                    boolean b = b(2);
                    this.e++;
                    if (!b) {
                        return c;
                    }
                }
                x();
                switch (cArr[this.e]) {
                    case '*':
                        this.e++;
                        if (a("*/")) {
                            i = this.e + 2;
                            i2 = this.f;
                            break;
                        }
                        throw b("Unterminated comment");
                    case '/':
                        this.e++;
                        y();
                        i = this.e;
                        i2 = this.f;
                        break;
                    default:
                        return c;
                }
            } else if (c == '#') {
                this.e = v;
                x();
                y();
                i = this.e;
                i2 = this.f;
            } else {
                this.e = v;
                return c;
            }
        }
    }

    private IOException b(String str) {
        int v = v();
        int w = w();
        String q = q();
        throw new pt(new StringBuilder((String.valueOf(str).length() + 45) + String.valueOf(q).length()).append(str).append(" at line ").append(v).append(" column ").append(w).append(" path ").append(q).toString());
    }

    private String b(char c) {
        char[] cArr = this.d;
        StringBuilder stringBuilder = new StringBuilder();
        do {
            int i = this.e;
            int i2 = this.f;
            int i3 = i;
            while (i3 < i2) {
                int i4 = i3 + 1;
                char c2 = cArr[i3];
                if (c2 == c) {
                    this.e = i4;
                    stringBuilder.append(cArr, i, (i4 - i) - 1);
                    return stringBuilder.toString();
                }
                if (c2 == l.f) {
                    this.e = i4;
                    stringBuilder.append(cArr, i, (i4 - i) - 1);
                    stringBuilder.append(z());
                    i = this.e;
                    i2 = this.f;
                    i4 = i;
                } else if (c2 == '\n') {
                    this.g++;
                    this.h = i4;
                }
                i3 = i4;
            }
            stringBuilder.append(cArr, i, i3 - i);
            this.e = i3;
        } while (b(1));
        throw b("Unterminated string");
    }

    private boolean b(int i) {
        Object obj = this.d;
        this.h -= this.e;
        if (this.f != this.e) {
            this.f -= this.e;
            System.arraycopy(obj, this.e, obj, 0, this.f);
        } else {
            this.f = 0;
        }
        this.e = 0;
        do {
            int read = this.b.read(obj, this.f, obj.length - this.f);
            if (read == -1) {
                return false;
            }
            this.f = read + this.f;
            if (this.g == 0 && this.h == 0 && this.f > 0 && obj[0] == '﻿') {
                this.e++;
                this.h++;
                i++;
            }
        } while (this.f < i);
        return true;
    }

    private void c(char c) {
        char[] cArr = this.d;
        do {
            int i = this.e;
            int i2 = this.f;
            int i3 = i;
            while (i3 < i2) {
                i = i3 + 1;
                char c2 = cArr[i3];
                if (c2 == c) {
                    this.e = i;
                    return;
                }
                if (c2 == l.f) {
                    this.e = i;
                    z();
                    i = this.e;
                    i2 = this.f;
                } else if (c2 == '\n') {
                    this.g++;
                    this.h = i;
                }
                i3 = i;
            }
            this.e = i3;
        } while (b(1));
        throw b("Unterminated string");
    }

    private int o() {
        int b;
        int i = this.m[this.n - 1];
        if (i == 1) {
            this.m[this.n - 1] = 2;
        } else if (i == 2) {
            switch (b(true)) {
                case 44:
                    break;
                case 59:
                    x();
                    break;
                case 93:
                    this.i = 4;
                    return 4;
                default:
                    throw b("Unterminated array");
            }
        } else if (i == 3 || i == 5) {
            this.m[this.n - 1] = 4;
            if (i == 5) {
                switch (b(true)) {
                    case 44:
                        break;
                    case 59:
                        x();
                        break;
                    case 125:
                        this.i = 2;
                        return 2;
                    default:
                        throw b("Unterminated object");
                }
            }
            b = b(true);
            switch (b) {
                case 34:
                    this.i = 13;
                    return 13;
                case 39:
                    x();
                    this.i = 12;
                    return 12;
                case 125:
                    if (i != 5) {
                        this.i = 2;
                        return 2;
                    }
                    throw b("Expected name");
                default:
                    x();
                    this.e--;
                    if (a((char) b)) {
                        this.i = 14;
                        return 14;
                    }
                    throw b("Expected name");
            }
        } else if (i == 4) {
            this.m[this.n - 1] = 5;
            switch (b(true)) {
                case 58:
                    break;
                case 61:
                    x();
                    if ((this.e < this.f || b(1)) && this.d[this.e] == '>') {
                        this.e++;
                        break;
                    }
                default:
                    throw b("Expected ':'");
            }
        } else if (i == 6) {
            if (this.c) {
                A();
            }
            this.m[this.n - 1] = 7;
        } else if (i == 7) {
            if (b(false) == -1) {
                this.i = 17;
                return 17;
            }
            x();
            this.e--;
        } else if (i == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        switch (b(true)) {
            case 34:
                if (this.n == 1) {
                    x();
                }
                this.i = 9;
                return 9;
            case 39:
                x();
                this.i = 8;
                return 8;
            case 44:
            case 59:
                break;
            case 91:
                this.i = 3;
                return 3;
            case 93:
                if (i == 1) {
                    this.i = 4;
                    return 4;
                }
                break;
            case Opcodes.LSHR /*123*/:
                this.i = 1;
                return 1;
            default:
                this.e--;
                if (this.n == 1) {
                    x();
                }
                b = r();
                if (b != 0) {
                    return b;
                }
                b = s();
                if (b != 0) {
                    return b;
                }
                if (a(this.d[this.e])) {
                    x();
                    this.i = 10;
                    return 10;
                }
                throw b("Expected value");
        }
        if (i == 1 || i == 2) {
            x();
            this.e--;
            this.i = 7;
            return 7;
        }
        throw b("Unexpected value");
    }

    private int r() {
        String str;
        int i;
        char c = this.d[this.e];
        String str2;
        if (c == 't' || c == 'T') {
            str = "true";
            str2 = "TRUE";
            i = 5;
        } else if (c == 'f' || c == 'F') {
            str = "false";
            str2 = "FALSE";
            i = 6;
        } else if (c != 'n' && c != 'N') {
            return 0;
        } else {
            str = "null";
            str2 = "NULL";
            i = 7;
        }
        int length = str.length();
        int i2 = 1;
        while (i2 < length) {
            if (this.e + i2 >= this.f && !b(i2 + 1)) {
                return 0;
            }
            char c2 = this.d[this.e + i2];
            if (c2 != str.charAt(i2) && c2 != r1.charAt(i2)) {
                return 0;
            }
            i2++;
        }
        if ((this.e + length < this.f || b(length + 1)) && a(this.d[this.e + length])) {
            return 0;
        }
        this.e += length;
        this.i = i;
        return i;
    }

    private int s() {
        char[] cArr = this.d;
        int i = this.e;
        long j = 0;
        Object obj = null;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        int i5 = this.f;
        int i6 = i;
        while (true) {
            Object obj2;
            if (i6 + i4 == i5) {
                if (i4 == cArr.length) {
                    return 0;
                }
                if (b(i4 + 1)) {
                    i6 = this.e;
                    i5 = this.f;
                } else if (i3 != 2 && i2 != 0 && (j != Long.MIN_VALUE || obj != null)) {
                    if (obj == null) {
                        j = -j;
                    }
                    this.j = j;
                    this.e += i4;
                    this.i = 15;
                    return 15;
                } else if (i3 == 2 && i3 != 4 && i3 != 7) {
                    return 0;
                } else {
                    this.k = i4;
                    this.i = 16;
                    return 16;
                }
            }
            char c = cArr[i6 + i4];
            int i7;
            switch (c) {
                case '+':
                    if (i3 != 5) {
                        return 0;
                    }
                    i = 6;
                    i3 = i2;
                    obj2 = obj;
                    continue;
                case '-':
                    if (i3 == 0) {
                        i = 1;
                        i7 = i2;
                        obj2 = 1;
                        i3 = i7;
                        continue;
                    } else if (i3 == 5) {
                        i = 6;
                        i3 = i2;
                        obj2 = obj;
                        break;
                    } else {
                        return 0;
                    }
                case '.':
                    if (i3 != 2) {
                        return 0;
                    }
                    i = 3;
                    i3 = i2;
                    obj2 = obj;
                    continue;
                case 'E':
                case 'e':
                    if (i3 != 2 && i3 != 4) {
                        return 0;
                    }
                    i = 5;
                    i3 = i2;
                    obj2 = obj;
                    continue;
                default:
                    if (c >= '0' && c <= '9') {
                        if (i3 != 1 && i3 != 0) {
                            if (i3 != 2) {
                                if (i3 != 3) {
                                    if (i3 != 5 && i3 != 6) {
                                        i = i3;
                                        i3 = i2;
                                        obj2 = obj;
                                        break;
                                    }
                                    i = 7;
                                    i3 = i2;
                                    obj2 = obj;
                                    break;
                                }
                                i = 4;
                                i3 = i2;
                                obj2 = obj;
                                break;
                            } else if (j != 0) {
                                long j2 = (10 * j) - ((long) (c - 48));
                                i = (j > -922337203685477580L || (j == -922337203685477580L && j2 < j)) ? 1 : 0;
                                i &= i2;
                                obj2 = obj;
                                j = j2;
                                i7 = i3;
                                i3 = i;
                                i = i7;
                                break;
                            } else {
                                return 0;
                            }
                        }
                        j = (long) (-(c - 48));
                        i = 2;
                        i3 = i2;
                        obj2 = obj;
                        continue;
                    } else if (a(c)) {
                        return 0;
                    }
                    break;
            }
            if (i3 != 2) {
            }
            if (i3 == 2) {
            }
            this.k = i4;
            this.i = 16;
            return 16;
            i4++;
            obj = obj2;
            i2 = i3;
            i3 = i;
        }
    }

    private String t() {
        StringBuilder stringBuilder = null;
        int i = 0;
        while (true) {
            String str;
            if (this.e + i < this.f) {
                switch (this.d[this.e + i]) {
                    case '\t':
                    case '\n':
                    case '\f':
                    case '\r':
                    case ' ':
                    case ',':
                    case ':':
                    case '[':
                    case ']':
                    case Opcodes.LSHR /*123*/:
                    case '}':
                        break;
                    case '#':
                    case '/':
                    case ';':
                    case '=':
                    case '\\':
                        x();
                        break;
                    default:
                        i++;
                        continue;
                }
            } else if (i >= this.d.length) {
                if (stringBuilder == null) {
                    stringBuilder = new StringBuilder();
                }
                stringBuilder.append(this.d, this.e, i);
                this.e = i + this.e;
                i = !b(1) ? 0 : 0;
            } else if (b(i + 1)) {
            }
            if (stringBuilder == null) {
                str = new String(this.d, this.e, i);
            } else {
                stringBuilder.append(this.d, this.e, i);
                str = stringBuilder.toString();
            }
            this.e = i + this.e;
            return str;
        }
    }

    private void u() {
        do {
            int i = 0;
            while (this.e + i < this.f) {
                switch (this.d[this.e + i]) {
                    case '\t':
                    case '\n':
                    case '\f':
                    case '\r':
                    case ' ':
                    case ',':
                    case ':':
                    case '[':
                    case ']':
                    case Opcodes.LSHR /*123*/:
                    case '}':
                        break;
                    case '#':
                    case '/':
                    case ';':
                    case '=':
                    case '\\':
                        x();
                        break;
                    default:
                        i++;
                }
                this.e = i + this.e;
                return;
            }
            this.e = i + this.e;
        } while (b(1));
    }

    private int v() {
        return this.g + 1;
    }

    private int w() {
        return (this.e - this.h) + 1;
    }

    private void x() {
        if (!this.c) {
            throw b("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void y() {
        char c;
        do {
            if (this.e < this.f || b(1)) {
                char[] cArr = this.d;
                int i = this.e;
                this.e = i + 1;
                c = cArr[i];
                if (c == '\n') {
                    this.g++;
                    this.h = this.e;
                    return;
                }
            } else {
                return;
            }
        } while (c != l.a);
    }

    private char z() {
        if (this.e != this.f || b(1)) {
            char[] cArr = this.d;
            int i = this.e;
            this.e = i + 1;
            char c = cArr[i];
            switch (c) {
                case '\n':
                    this.g++;
                    this.h = this.e;
                    return c;
                case 'b':
                    return '\b';
                case 'f':
                    return '\f';
                case 'n':
                    return '\n';
                case 'r':
                    return l.a;
                case Opcodes.INEG /*116*/:
                    return '\t';
                case Opcodes.LNEG /*117*/:
                    if (this.e + 4 <= this.f || b(4)) {
                        int i2 = this.e;
                        int i3 = i2 + 4;
                        int i4 = i2;
                        c = '\u0000';
                        for (i = i4; i < i3; i++) {
                            char c2 = this.d[i];
                            c = (char) (c << 4);
                            if (c2 >= '0' && c2 <= '9') {
                                c = (char) (c + (c2 - 48));
                            } else if (c2 >= 'a' && c2 <= 'f') {
                                c = (char) (c + ((c2 - 97) + 10));
                            } else if (c2 < 'A' || c2 > 'F') {
                                String str = "\\u";
                                String valueOf = String.valueOf(new String(this.d, this.e, 4));
                                throw new NumberFormatException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                            } else {
                                c = (char) (c + ((c2 - 65) + 10));
                            }
                        }
                        this.e += 4;
                        return c;
                    }
                    throw b("Unterminated escape sequence");
                default:
                    return c;
            }
        }
        throw b("Unterminated escape sequence");
    }

    public void a() {
        int i = this.i;
        if (i == 0) {
            i = o();
        }
        if (i == 3) {
            a(1);
            this.p[this.n - 1] = 0;
            this.i = 0;
            return;
        }
        String valueOf = String.valueOf(f());
        int v = v();
        int w = w();
        String q = q();
        throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 74) + String.valueOf(q).length()).append("Expected BEGIN_ARRAY but was ").append(valueOf).append(" at line ").append(v).append(" column ").append(w).append(" path ").append(q).toString());
    }

    public final void a(boolean z) {
        this.c = z;
    }

    public void b() {
        int i = this.i;
        if (i == 0) {
            i = o();
        }
        if (i == 4) {
            this.n--;
            int[] iArr = this.p;
            int i2 = this.n - 1;
            iArr[i2] = iArr[i2] + 1;
            this.i = 0;
            return;
        }
        String valueOf = String.valueOf(f());
        int v = v();
        int w = w();
        String q = q();
        throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 72) + String.valueOf(q).length()).append("Expected END_ARRAY but was ").append(valueOf).append(" at line ").append(v).append(" column ").append(w).append(" path ").append(q).toString());
    }

    public void c() {
        int i = this.i;
        if (i == 0) {
            i = o();
        }
        if (i == 1) {
            a(3);
            this.i = 0;
            return;
        }
        String valueOf = String.valueOf(f());
        int v = v();
        int w = w();
        String q = q();
        throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 75) + String.valueOf(q).length()).append("Expected BEGIN_OBJECT but was ").append(valueOf).append(" at line ").append(v).append(" column ").append(w).append(" path ").append(q).toString());
    }

    public void close() {
        this.i = 0;
        this.m[0] = 8;
        this.n = 1;
        this.b.close();
    }

    public void d() {
        int i = this.i;
        if (i == 0) {
            i = o();
        }
        if (i == 2) {
            this.n--;
            this.o[this.n] = null;
            int[] iArr = this.p;
            int i2 = this.n - 1;
            iArr[i2] = iArr[i2] + 1;
            this.i = 0;
            return;
        }
        String valueOf = String.valueOf(f());
        int v = v();
        int w = w();
        String q = q();
        throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 73) + String.valueOf(q).length()).append("Expected END_OBJECT but was ").append(valueOf).append(" at line ").append(v).append(" column ").append(w).append(" path ").append(q).toString());
    }

    public boolean e() {
        int i = this.i;
        if (i == 0) {
            i = o();
        }
        return (i == 2 || i == 4) ? false : true;
    }

    public pq f() {
        int i = this.i;
        if (i == 0) {
            i = o();
        }
        switch (i) {
            case 1:
                return pq.BEGIN_OBJECT;
            case 2:
                return pq.END_OBJECT;
            case 3:
                return pq.BEGIN_ARRAY;
            case 4:
                return pq.END_ARRAY;
            case 5:
            case 6:
                return pq.BOOLEAN;
            case 7:
                return pq.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return pq.STRING;
            case 12:
            case 13:
            case 14:
                return pq.NAME;
            case 15:
            case 16:
                return pq.NUMBER;
            case 17:
                return pq.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public String g() {
        String t;
        int i = this.i;
        if (i == 0) {
            i = o();
        }
        if (i == 14) {
            t = t();
        } else if (i == 12) {
            t = b('\'');
        } else if (i == 13) {
            t = b((char) l.e);
        } else {
            String valueOf = String.valueOf(f());
            int v = v();
            int w = w();
            String q = q();
            throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 69) + String.valueOf(q).length()).append("Expected a name but was ").append(valueOf).append(" at line ").append(v).append(" column ").append(w).append(" path ").append(q).toString());
        }
        this.i = 0;
        this.o[this.n - 1] = t;
        return t;
    }

    public String h() {
        String t;
        int v;
        int i = this.i;
        if (i == 0) {
            i = o();
        }
        if (i == 10) {
            t = t();
        } else if (i == 8) {
            t = b('\'');
        } else if (i == 9) {
            t = b((char) l.e);
        } else if (i == 11) {
            t = this.l;
            this.l = null;
        } else if (i == 15) {
            t = Long.toString(this.j);
        } else if (i == 16) {
            t = new String(this.d, this.e, this.k);
            this.e += this.k;
        } else {
            String valueOf = String.valueOf(f());
            v = v();
            int w = w();
            String q = q();
            throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 71) + String.valueOf(q).length()).append("Expected a string but was ").append(valueOf).append(" at line ").append(v).append(" column ").append(w).append(" path ").append(q).toString());
        }
        this.i = 0;
        int[] iArr = this.p;
        v = this.n - 1;
        iArr[v] = iArr[v] + 1;
        return t;
    }

    public boolean i() {
        int i = this.i;
        if (i == 0) {
            i = o();
        }
        if (i == 5) {
            this.i = 0;
            int[] iArr = this.p;
            i = this.n - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        } else if (i == 6) {
            this.i = 0;
            int[] iArr2 = this.p;
            r2 = this.n - 1;
            iArr2[r2] = iArr2[r2] + 1;
            return false;
        } else {
            String valueOf = String.valueOf(f());
            r2 = v();
            int w = w();
            String q = q();
            throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 72) + String.valueOf(q).length()).append("Expected a boolean but was ").append(valueOf).append(" at line ").append(r2).append(" column ").append(w).append(" path ").append(q).toString());
        }
    }

    public void j() {
        int i = this.i;
        if (i == 0) {
            i = o();
        }
        if (i == 7) {
            this.i = 0;
            int[] iArr = this.p;
            int i2 = this.n - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        String valueOf = String.valueOf(f());
        int v = v();
        int w = w();
        String q = q();
        throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 67) + String.valueOf(q).length()).append("Expected null but was ").append(valueOf).append(" at line ").append(v).append(" column ").append(w).append(" path ").append(q).toString());
    }

    public double k() {
        int i = this.i;
        if (i == 0) {
            i = o();
        }
        if (i == 15) {
            this.i = 0;
            int[] iArr = this.p;
            int i2 = this.n - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.j;
        }
        if (i == 16) {
            this.l = new String(this.d, this.e, this.k);
            this.e += this.k;
        } else if (i == 8 || i == 9) {
            this.l = b(i == 8 ? '\'' : l.e);
        } else if (i == 10) {
            this.l = t();
        } else if (i != 11) {
            String valueOf = String.valueOf(f());
            int v = v();
            int w = w();
            String q = q();
            throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 71) + String.valueOf(q).length()).append("Expected a double but was ").append(valueOf).append(" at line ").append(v).append(" column ").append(w).append(" path ").append(q).toString());
        }
        this.i = 11;
        double parseDouble = Double.parseDouble(this.l);
        if (this.c || !(Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            this.l = null;
            this.i = 0;
            int[] iArr2 = this.p;
            w = this.n - 1;
            iArr2[w] = iArr2[w] + 1;
            return parseDouble;
        }
        w = v();
        int w2 = w();
        String q2 = q();
        throw new pt(new StringBuilder(String.valueOf(q2).length() + 102).append("JSON forbids NaN and infinities: ").append(parseDouble).append(" at line ").append(w).append(" column ").append(w2).append(" path ").append(q2).toString());
    }

    public long l() {
        int i = this.i;
        if (i == 0) {
            i = o();
        }
        if (i == 15) {
            this.i = 0;
            int[] iArr = this.p;
            int i2 = this.n - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.j;
        }
        long parseLong;
        int i3;
        if (i == 16) {
            this.l = new String(this.d, this.e, this.k);
            this.e += this.k;
        } else if (i == 8 || i == 9) {
            this.l = b(i == 8 ? '\'' : l.e);
            try {
                parseLong = Long.parseLong(this.l);
                this.i = 0;
                int[] iArr2 = this.p;
                i3 = this.n - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException e) {
            }
        } else {
            String valueOf = String.valueOf(f());
            int v = v();
            i3 = w();
            String q = q();
            throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 69) + String.valueOf(q).length()).append("Expected a long but was ").append(valueOf).append(" at line ").append(v).append(" column ").append(i3).append(" path ").append(q).toString());
        }
        this.i = 11;
        double parseDouble = Double.parseDouble(this.l);
        parseLong = (long) parseDouble;
        if (((double) parseLong) != parseDouble) {
            valueOf = this.l;
            v = v();
            i3 = w();
            q = q();
            throw new NumberFormatException(new StringBuilder((String.valueOf(valueOf).length() + 69) + String.valueOf(q).length()).append("Expected a long but was ").append(valueOf).append(" at line ").append(v).append(" column ").append(i3).append(" path ").append(q).toString());
        }
        this.l = null;
        this.i = 0;
        iArr2 = this.p;
        i3 = this.n - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return parseLong;
    }

    public int m() {
        int i = this.i;
        if (i == 0) {
            i = o();
        }
        int[] iArr;
        int i2;
        if (i == 15) {
            i = (int) this.j;
            if (this.j != ((long) i)) {
                long j = this.j;
                int v = v();
                int w = w();
                String q = q();
                throw new NumberFormatException(new StringBuilder(String.valueOf(q).length() + 89).append("Expected an int but was ").append(j).append(" at line ").append(v).append(" column ").append(w).append(" path ").append(q).toString());
            }
            this.i = 0;
            iArr = this.p;
            i2 = this.n - 1;
            iArr[i2] = iArr[i2] + 1;
        } else {
            String valueOf;
            int w2;
            String q2;
            if (i == 16) {
                this.l = new String(this.d, this.e, this.k);
                this.e += this.k;
            } else if (i == 8 || i == 9) {
                this.l = b(i == 8 ? '\'' : l.e);
                try {
                    i = Integer.parseInt(this.l);
                    this.i = 0;
                    iArr = this.p;
                    i2 = this.n - 1;
                    iArr[i2] = iArr[i2] + 1;
                } catch (NumberFormatException e) {
                }
            } else {
                valueOf = String.valueOf(f());
                i2 = v();
                w2 = w();
                q2 = q();
                throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 69) + String.valueOf(q2).length()).append("Expected an int but was ").append(valueOf).append(" at line ").append(i2).append(" column ").append(w2).append(" path ").append(q2).toString());
            }
            this.i = 11;
            double parseDouble = Double.parseDouble(this.l);
            i = (int) parseDouble;
            if (((double) i) != parseDouble) {
                valueOf = this.l;
                i2 = v();
                w2 = w();
                q2 = q();
                throw new NumberFormatException(new StringBuilder((String.valueOf(valueOf).length() + 69) + String.valueOf(q2).length()).append("Expected an int but was ").append(valueOf).append(" at line ").append(i2).append(" column ").append(w2).append(" path ").append(q2).toString());
            }
            this.l = null;
            this.i = 0;
            iArr = this.p;
            i2 = this.n - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return i;
    }

    public void n() {
        int i = 0;
        do {
            int i2 = this.i;
            if (i2 == 0) {
                i2 = o();
            }
            if (i2 == 3) {
                a(1);
                i++;
            } else if (i2 == 1) {
                a(3);
                i++;
            } else if (i2 == 4) {
                this.n--;
                i--;
            } else if (i2 == 2) {
                this.n--;
                i--;
            } else if (i2 == 14 || i2 == 10) {
                u();
            } else if (i2 == 8 || i2 == 12) {
                c('\'');
            } else if (i2 == 9 || i2 == 13) {
                c((char) l.e);
            } else if (i2 == 16) {
                this.e += this.k;
            }
            this.i = 0;
        } while (i != 0);
        int[] iArr = this.p;
        int i3 = this.n - 1;
        iArr[i3] = iArr[i3] + 1;
        this.o[this.n - 1] = "null";
    }

    public final boolean p() {
        return this.c;
    }

    public String q() {
        StringBuilder append = new StringBuilder().append('$');
        int i = this.n;
        for (int i2 = 0; i2 < i; i2++) {
            switch (this.m[i2]) {
                case 1:
                case 2:
                    append.append('[').append(this.p[i2]).append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    append.append('.');
                    if (this.o[i2] == null) {
                        break;
                    }
                    append.append(this.o[i2]);
                    break;
                default:
                    break;
            }
        }
        return append.toString();
    }

    public String toString() {
        String valueOf = String.valueOf(getClass().getSimpleName());
        int v = v();
        return new StringBuilder(String.valueOf(valueOf).length() + 39).append(valueOf).append(" at line ").append(v).append(" column ").append(w()).toString();
    }
}
