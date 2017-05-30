package org.a.a.i.c;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.a.a.a.b;
import org.a.a.o.a;

@b
public class u {
    private static final String a = "Wire";
    private final String b;

    public u(String str) {
        this.b = str;
    }

    private void a(String str, InputStream inputStream) {
        StringBuilder stringBuilder = new StringBuilder();
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                break;
            } else if (read == 13) {
                stringBuilder.append("[\\r]");
            } else if (read == 10) {
                stringBuilder.append("[\\n]\"");
                stringBuilder.insert(0, "\"");
                stringBuilder.insert(0, str);
                Log.d(a, this.b + " " + stringBuilder.toString());
                stringBuilder.setLength(0);
            } else if (read < 32 || read > 127) {
                stringBuilder.append("[0x");
                stringBuilder.append(Integer.toHexString(read));
                stringBuilder.append("]");
            } else {
                stringBuilder.append((char) read);
            }
        }
        if (stringBuilder.length() > 0) {
            stringBuilder.append(l.e);
            stringBuilder.insert(0, l.e);
            stringBuilder.insert(0, str);
            Log.d(a, this.b + " " + stringBuilder.toString());
        }
    }

    public void a(int i) {
        a(new byte[]{(byte) i});
    }

    public void a(InputStream inputStream) {
        a.a((Object) inputStream, "Output");
        a(">> ", inputStream);
    }

    public void a(String str) {
        a.a((Object) str, "Output");
        a(str.getBytes());
    }

    public void a(byte[] bArr) {
        a.a((Object) bArr, "Output");
        a(">> ", new ByteArrayInputStream(bArr));
    }

    public void a(byte[] bArr, int i, int i2) {
        a.a((Object) bArr, "Output");
        a(">> ", new ByteArrayInputStream(bArr, i, i2));
    }

    public boolean a() {
        return Log.isLoggable(a, 3);
    }

    public void b(int i) {
        b(new byte[]{(byte) i});
    }

    public void b(InputStream inputStream) {
        a.a((Object) inputStream, "Input");
        a("<< ", inputStream);
    }

    public void b(String str) {
        a.a((Object) str, "Input");
        b(str.getBytes());
    }

    public void b(byte[] bArr) {
        a.a((Object) bArr, "Input");
        a("<< ", new ByteArrayInputStream(bArr));
    }

    public void b(byte[] bArr, int i, int i2) {
        a.a((Object) bArr, "Input");
        a("<< ", new ByteArrayInputStream(bArr, i, i2));
    }
}
