package com.google.android.gms.cast.framework.media;

import com.google.android.gms.c.e;
import com.google.android.gms.c.f;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.common.images.WebImage;

public class a {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    private final e d = new a();

    private class a extends com.google.android.gms.cast.framework.media.e.a {
        final /* synthetic */ a a;

        private a(a aVar) {
            this.a = aVar;
        }

        public int a() {
            return 9683208;
        }

        public WebImage a(MediaMetadata mediaMetadata, int i) {
            return this.a.a(mediaMetadata, i);
        }

        public e b() {
            return f.a(this.a);
        }
    }

    public e a() {
        return this.d;
    }

    public WebImage a(MediaMetadata mediaMetadata, int i) {
        return (mediaMetadata == null || !mediaMetadata.g()) ? null : (WebImage) mediaMetadata.f().get(0);
    }
}
