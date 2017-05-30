package org.a.a.i.d;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import org.a.a.a.b;

@b
public class x {
    private static final int a = 256;
    private final w b;

    x(w wVar) {
        this.b = wVar;
    }

    private boolean a(Reader reader, StringBuilder stringBuilder) {
        stringBuilder.setLength(0);
        boolean z = false;
        do {
            int read = reader.read();
            if (read != -1) {
                char c = (char) read;
                if (c != '\n') {
                    if (Character.isWhitespace(c)) {
                        z = true;
                    }
                    if (!z) {
                        stringBuilder.append(c);
                    }
                }
            }
            return read != -1;
        } while (stringBuilder.length() <= 256);
        throw new IOException("Line too long");
    }

    public void a(Reader reader) {
        Collection arrayList = new ArrayList();
        Collection arrayList2 = new ArrayList();
        Reader bufferedReader = new BufferedReader(reader);
        StringBuilder stringBuilder = new StringBuilder(256);
        int i = 1;
        while (i != 0) {
            boolean a = a(bufferedReader, stringBuilder);
            Object stringBuilder2 = stringBuilder.toString();
            if (stringBuilder2.length() == 0) {
                i = a;
            } else if (stringBuilder2.startsWith("//")) {
                i = a;
            } else {
                if (stringBuilder2.startsWith(".")) {
                    stringBuilder2 = stringBuilder2.substring(1);
                }
                boolean startsWith = stringBuilder2.startsWith("!");
                if (startsWith) {
                    stringBuilder2 = stringBuilder2.substring(1);
                }
                if (startsWith) {
                    arrayList2.add(stringBuilder2);
                } else {
                    arrayList.add(stringBuilder2);
                }
                i = a;
            }
        }
        this.b.a(arrayList);
        this.b.b(arrayList2);
    }
}
