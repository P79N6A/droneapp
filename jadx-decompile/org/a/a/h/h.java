package org.a.a.h;

import com.fimi.soul.media.player.FimiMediaMeta;
import java.io.InputStream;
import java.io.OutputStream;
import org.a.a.a.c;
import org.a.a.o.a;

@c
public class h extends a {
    private final InputStream e;
    private final long f;

    public h(InputStream inputStream) {
        this(inputStream, -1);
    }

    public h(InputStream inputStream, long j) {
        this(inputStream, j, null);
    }

    public h(InputStream inputStream, long j, e eVar) {
        this.e = (InputStream) a.a((Object) inputStream, "Source input stream");
        this.f = j;
        if (eVar != null) {
            a(eVar.toString());
        }
    }

    public h(InputStream inputStream, e eVar) {
        this(inputStream, -1, eVar);
    }

    public InputStream getContent() {
        return this.e;
    }

    public long getContentLength() {
        return this.f;
    }

    public boolean isRepeatable() {
        return false;
    }

    public boolean isStreaming() {
        return true;
    }

    public void writeTo(OutputStream outputStream) {
        a.a((Object) outputStream, "Output stream");
        InputStream inputStream = this.e;
        try {
            byte[] bArr = new byte[4096];
            if (this.f < 0) {
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, read);
                }
            } else {
                long j = this.f;
                while (j > 0) {
                    int read2 = inputStream.read(bArr, 0, (int) Math.min(FimiMediaMeta.AV_CH_TOP_FRONT_LEFT, j));
                    if (read2 == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, read2);
                    j -= (long) read2;
                }
            }
            inputStream.close();
        } catch (Throwable th) {
            inputStream.close();
        }
    }
}
