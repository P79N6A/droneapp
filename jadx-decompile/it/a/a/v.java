package it.a.a;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.StringTokenizer;
import org.a.a.f.c.l;

class v extends Writer {
    private static final String a = "\r\n";
    private OutputStream b;
    private Writer c;

    public v(OutputStream outputStream, String str) {
        this.b = outputStream;
        this.c = new OutputStreamWriter(outputStream, str);
    }

    public void a(String str) {
        synchronized (this) {
            this.c = new OutputStreamWriter(this.b, str);
        }
    }

    public void b(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        StringTokenizer stringTokenizer = new StringTokenizer(str, a);
        int countTokens = stringTokenizer.countTokens();
        char c = '\u0000';
        for (int i = 0; i < countTokens; i++) {
            String nextToken = stringTokenizer.nextToken();
            if (nextToken.length() > 0) {
                if (c != '\u0000') {
                    stringBuffer.append(l.a);
                    stringBuffer.append('\u0000');
                }
                stringBuffer.append(nextToken);
                c = '\u0001';
            }
        }
        if (stringBuffer.length() > 0) {
            this.c.write(stringBuffer.toString());
            this.c.write(a);
            this.c.flush();
        }
    }

    public void close() {
        synchronized (this) {
            this.c.close();
        }
    }

    public void flush() {
        synchronized (this) {
            this.c.flush();
        }
    }

    public void write(char[] cArr, int i, int i2) {
        synchronized (this) {
            this.c.write(cArr, i, i2);
        }
    }
}
