package com.google.android.gms.vision;

import android.graphics.Bitmap;
import android.graphics.Color;
import com.fimi.soul.media.player.FimiMediaPlayer;
import java.nio.ByteBuffer;

public class d {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    private b e;
    private ByteBuffer f;
    private Bitmap g;

    public static class a {
        private d a = new d();

        public a a(int i) {
            this.a.a().c = i;
            return this;
        }

        public a a(long j) {
            this.a.a().d = j;
            return this;
        }

        public a a(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            this.a.g = bitmap;
            b a = this.a.a();
            a.a = width;
            a.b = height;
            return this;
        }

        public a a(ByteBuffer byteBuffer, int i, int i2, int i3) {
            if (byteBuffer == null) {
                throw new IllegalArgumentException("Null image data supplied.");
            } else if (byteBuffer.capacity() < i * i2) {
                throw new IllegalArgumentException("Invalid image data size.");
            } else {
                switch (i3) {
                    case 16:
                    case 17:
                    case FimiMediaPlayer.SDL_FCC_YV12 /*842094169*/:
                        this.a.f = byteBuffer;
                        b a = this.a.a();
                        a.a = i;
                        a.b = i2;
                        a.f = i3;
                        return this;
                    default:
                        throw new IllegalArgumentException("Unsupported image format: " + i3);
                }
            }
        }

        public d a() {
            if (this.a.f != null || this.a.g != null) {
                return this.a;
            }
            throw new IllegalStateException("Missing image data.  Call either setBitmap or setImageData to specify the image");
        }

        public a b(int i) {
            this.a.a().e = i;
            return this;
        }
    }

    public static class b {
        private int a;
        private int b;
        private int c;
        private long d;
        private int e;
        private int f = -1;

        public b(b bVar) {
            this.a = bVar.a();
            this.b = bVar.b();
            this.c = bVar.c();
            this.d = bVar.d();
            this.e = bVar.e();
        }

        public int a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }

        public int c() {
            return this.c;
        }

        public long d() {
            return this.d;
        }

        public int e() {
            return this.e;
        }

        public int f() {
            return this.f;
        }

        public void g() {
            if (this.e % 2 != 0) {
                int i = this.a;
                this.a = this.b;
                this.b = i;
            }
            this.e = 0;
        }
    }

    private d() {
        this.e = new b();
        this.f = null;
        this.g = null;
    }

    private ByteBuffer d() {
        int i = 0;
        int width = this.g.getWidth();
        int height = this.g.getHeight();
        int[] iArr = new int[(width * height)];
        this.g.getPixels(iArr, 0, width, 0, 0, width, height);
        byte[] bArr = new byte[(width * height)];
        while (i < iArr.length) {
            bArr[i] = (byte) ((int) (((((float) Color.red(iArr[i])) * 0.299f) + (((float) Color.green(iArr[i])) * 0.587f)) + (((float) Color.blue(iArr[i])) * 0.114f)));
            i++;
        }
        return ByteBuffer.wrap(bArr);
    }

    public b a() {
        return this.e;
    }

    public ByteBuffer b() {
        return this.g != null ? d() : this.f;
    }

    public Bitmap c() {
        return this.g;
    }
}
