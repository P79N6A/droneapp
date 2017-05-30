package com.google.android.gms.internal;

import java.io.Writer;

public final class oz {

    private static final class a extends Writer {
        private final Appendable a;
        private final a b;

        static class a implements CharSequence {
            char[] a;

            a() {
            }

            public char charAt(int i) {
                return this.a[i];
            }

            public int length() {
                return this.a.length;
            }

            public CharSequence subSequence(int i, int i2) {
                return new String(this.a, i, i2 - i);
            }
        }

        private a(Appendable appendable) {
            this.b = new a();
            this.a = appendable;
        }

        public void close() {
        }

        public void flush() {
        }

        public void write(int i) {
            this.a.append((char) i);
        }

        public void write(char[] cArr, int i, int i2) {
            this.b.a = cArr;
            this.a.append(this.b, i, i + i2);
        }
    }

    public static nx a(pp ppVar) {
        Object obj = 1;
        try {
            ppVar.f();
            obj = null;
            return (nx) pn.P.b(ppVar);
        } catch (Throwable e) {
            if (obj != null) {
                return nz.a;
            }
            throw new og(e);
        } catch (Throwable e2) {
            throw new og(e2);
        } catch (Throwable e22) {
            throw new ny(e22);
        } catch (Throwable e222) {
            throw new og(e222);
        }
    }

    public static Writer a(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new a(appendable);
    }

    public static void a(nx nxVar, ps psVar) {
        pn.P.a(psVar, nxVar);
    }
}
