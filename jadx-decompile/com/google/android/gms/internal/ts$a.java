package com.google.android.gms.internal;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;

class ts$a {
    ByteArrayOutputStream a = new ByteArrayOutputStream(4096);
    Base64OutputStream b = new Base64OutputStream(this.a, 10);

    public void a(byte[] bArr) {
        this.b.write(bArr);
    }

    public String toString() {
        String byteArrayOutputStream;
        try {
            this.b.close();
        } catch (Throwable e) {
            abr.b("HashManager: Unable to convert to Base64.", e);
        }
        try {
            this.a.close();
            byteArrayOutputStream = this.a.toString();
        } catch (Throwable e2) {
            abr.b("HashManager: Unable to convert to Base64.", e2);
            byteArrayOutputStream = "";
        } finally {
            this.a = null;
            this.b = null;
        }
        return byteArrayOutputStream;
    }
}
