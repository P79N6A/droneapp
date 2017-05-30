package com.facebook.imageutils;

import java.io.IOException;
import java.io.InputStream;

class StreamProcessor {
    StreamProcessor() {
    }

    public static int readPackedInt(InputStream inputStream, int i, boolean z) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int read = inputStream.read();
            if (read == -1) {
                throw new IOException("no more bytes");
            }
            i2 = z ? i2 | ((read & 255) << (i3 * 8)) : (i2 << 8) | (read & 255);
        }
        return i2;
    }
}
