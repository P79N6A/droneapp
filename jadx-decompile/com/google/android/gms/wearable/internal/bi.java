package com.google.android.gms.wearable.internal;

import android.util.Log;
import com.google.android.gms.common.internal.d;
import java.io.IOException;
import java.io.OutputStream;

public final class bi extends OutputStream {
    private final OutputStream a;
    private volatile be b;

    public bi(OutputStream outputStream) {
        this.a = (OutputStream) d.a(outputStream);
    }

    private IOException a(IOException iOException) {
        be beVar = this.b;
        if (beVar == null) {
            return iOException;
        }
        if (Log.isLoggable("ChannelOutputStream", 2)) {
            Log.v("ChannelOutputStream", "Caught IOException, but channel has been closed. Translating to ChannelIOException.", iOException);
        }
        return new com.google.android.gms.wearable.d("Channel closed unexpectedly before stream was finished", beVar.a, beVar.b);
    }

    bm a() {
        return new bm(this) {
            final /* synthetic */ bi a;

            {
                this.a = r1;
            }

            public void a(be beVar) {
                this.a.a(beVar);
            }
        };
    }

    void a(be beVar) {
        this.b = beVar;
    }

    public void close() {
        try {
            this.a.close();
        } catch (IOException e) {
            throw a(e);
        }
    }

    public void flush() {
        try {
            this.a.flush();
        } catch (IOException e) {
            throw a(e);
        }
    }

    public void write(int i) {
        try {
            this.a.write(i);
        } catch (IOException e) {
            throw a(e);
        }
    }

    public void write(byte[] bArr) {
        try {
            this.a.write(bArr);
        } catch (IOException e) {
            throw a(e);
        }
    }

    public void write(byte[] bArr, int i, int i2) {
        try {
            this.a.write(bArr, i, i2);
        } catch (IOException e) {
            throw a(e);
        }
    }
}
