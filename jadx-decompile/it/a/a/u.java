package it.a.a;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

class u extends Reader {
    private static final String a = System.getProperty("line.separator");
    private InputStream b;
    private Reader c;

    public u(InputStream inputStream, String str) {
        this.b = inputStream;
        this.c = new InputStreamReader(inputStream, str);
    }

    public String a() {
        StringBuffer stringBuffer = new StringBuffer();
        int i = -1;
        while (true) {
            int read = this.c.read();
            if (read == -1) {
                break;
            } else if (read == 10) {
                return stringBuffer.toString();
            } else {
                if (i == 13 && read == 0) {
                    stringBuffer.append(a);
                } else if (!(read == 0 || read == 13)) {
                    stringBuffer.append((char) read);
                }
                i = read;
            }
        }
        return stringBuffer.length() == 0 ? null : stringBuffer.toString();
    }

    public void a(String str) {
        synchronized (this) {
            this.c = new InputStreamReader(this.b, str);
        }
    }

    public void close() {
        synchronized (this) {
            this.c.close();
        }
    }

    public int read(char[] cArr, int i, int i2) {
        int read;
        synchronized (this) {
            read = this.c.read(cArr, i, i2);
        }
        return read;
    }
}
