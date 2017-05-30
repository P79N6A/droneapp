package com.google.android.gms.ads.internal.client;

import com.fimi.soul.media.player.FimiMediaMeta;
import com.google.android.gms.ads.internal.client.ao.a;
import com.google.android.gms.internal.aaa;
import java.util.Random;

@aaa
public class ad extends a {
    private final Random a = new Random();
    private long b;
    private Object c = new Object();

    public ad() {
        a();
    }

    public void a() {
        synchronized (this.c) {
            int i = 3;
            long j = 0;
            while (true) {
                i--;
                if (i <= 0) {
                    break;
                }
                j = ((long) this.a.nextInt()) + FimiMediaMeta.AV_CH_WIDE_LEFT;
                if (j != this.b && j != 0) {
                    break;
                }
            }
            this.b = j;
        }
    }

    public long b() {
        return this.b;
    }
}
