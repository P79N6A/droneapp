package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.List;

class lq {

    interface b {
        lw a();

        boolean a(byte[] bArr);
    }

    static class a implements b {
        private List<byte[]> a = new ArrayList();
        private int b = 0;

        a() {
        }

        public lw a() {
            byte[] bArr = new byte[this.b];
            int i = 0;
            for (int i2 = 0; i2 < this.a.size(); i2++) {
                byte[] bArr2 = (byte[]) this.a.get(i2);
                System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
                i += bArr2.length;
            }
            return new lw(bArr);
        }

        public boolean a(byte[] bArr) {
            this.a.add(bArr);
            this.b += bArr.length;
            return true;
        }
    }

    static class c implements b {
        private static ThreadLocal<CharsetDecoder> a = new ThreadLocal<CharsetDecoder>() {
            protected CharsetDecoder a() {
                CharsetDecoder newDecoder = Charset.forName("UTF8").newDecoder();
                newDecoder.onMalformedInput(CodingErrorAction.REPORT);
                newDecoder.onUnmappableCharacter(CodingErrorAction.REPORT);
                return newDecoder;
            }

            protected /* synthetic */ Object initialValue() {
                return a();
            }
        };
        private static ThreadLocal<CharsetEncoder> b = new ThreadLocal<CharsetEncoder>() {
            protected CharsetEncoder a() {
                CharsetEncoder newEncoder = Charset.forName("UTF8").newEncoder();
                newEncoder.onMalformedInput(CodingErrorAction.REPORT);
                newEncoder.onUnmappableCharacter(CodingErrorAction.REPORT);
                return newEncoder;
            }

            protected /* synthetic */ Object initialValue() {
                return a();
            }
        };
        private StringBuilder c = new StringBuilder();

        c() {
        }

        private String b(byte[] bArr) {
            try {
                return ((CharsetDecoder) a.get()).decode(ByteBuffer.wrap(bArr)).toString();
            } catch (CharacterCodingException e) {
                return null;
            }
        }

        public lw a() {
            return new lw(this.c.toString());
        }

        public boolean a(byte[] bArr) {
            String b = b(bArr);
            if (b == null) {
                return false;
            }
            this.c.append(b);
            return true;
        }
    }

    static b a(byte b) {
        return b == (byte) 2 ? new a() : new c();
    }
}
