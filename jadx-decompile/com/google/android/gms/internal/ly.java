package com.google.android.gms.internal;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class ly {
    private BlockingQueue<ByteBuffer> a;
    private final Random b = new Random();
    private volatile boolean c = false;
    private boolean d = false;
    private ls e;
    private WritableByteChannel f;
    private final Thread g = ls.a().newThread(new Runnable(this) {
        final /* synthetic */ ly a;

        {
            this.a = r1;
        }

        public void run() {
            this.a.e();
        }
    });

    ly(ls lsVar, String str, int i) {
        ls.b().a(b(), new StringBuilder(String.valueOf(str).length() + 18).append(str).append("Writer-").append(i).toString());
        this.e = lsVar;
        this.a = new LinkedBlockingQueue();
    }

    private void a(lu luVar) {
        this.e.a(luVar);
    }

    private ByteBuffer b(byte b, boolean z, byte[] bArr) {
        int i = 2;
        if (z) {
            i = 6;
        }
        int length = bArr.length;
        if (length >= 126) {
            i = length <= 65535 ? i + 2 : i + 8;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i + bArr.length);
        allocate.put((byte) (b | -128));
        if (length < 126) {
            allocate.put((byte) (z ? length | 128 : length));
        } else if (length <= 65535) {
            allocate.put((byte) (z ? 254 : 126));
            allocate.putShort((short) length);
        } else {
            i = 127;
            if (z) {
                i = 255;
            }
            allocate.put((byte) i);
            allocate.putInt(0);
            allocate.putInt(length);
        }
        if (z) {
            byte[] c = c();
            allocate.put(c);
            for (i = 0; i < bArr.length; i++) {
                allocate.put((byte) (bArr[i] ^ c[i % 4]));
            }
        }
        allocate.flip();
        return allocate;
    }

    private byte[] c() {
        byte[] bArr = new byte[4];
        this.b.nextBytes(bArr);
        return bArr;
    }

    private void d() {
        this.f.write((ByteBuffer) this.a.take());
    }

    private void e() {
        while (!this.c && !Thread.interrupted()) {
            try {
                d();
            } catch (Throwable e) {
                a(new lu("IO Exception", e));
                return;
            } catch (InterruptedException e2) {
                return;
            }
        }
        for (int i = 0; i < this.a.size(); i++) {
            d();
        }
    }

    void a() {
        this.c = true;
    }

    synchronized void a(byte b, boolean z, byte[] bArr) {
        ByteBuffer b2 = b(b, z, bArr);
        if (!this.c || (!this.d && b == (byte) 8)) {
            if (b == (byte) 8) {
                this.d = true;
            }
            this.a.add(b2);
        } else {
            throw new lu("Shouldn't be sending");
        }
    }

    void a(OutputStream outputStream) {
        this.f = Channels.newChannel(outputStream);
    }

    Thread b() {
        return this.g;
    }
}
