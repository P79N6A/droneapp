package com.google.android.gms.common.stats;

import android.os.SystemClock;
import android.support.v4.util.SimpleArrayMap;
import android.util.Log;
import com.tencent.mm.sdk.platformtools.Util;

public class e {
    private final long a;
    private final int b;
    private final SimpleArrayMap<String, Long> c;

    public e() {
        this.a = Util.MILLSECONDS_OF_MINUTE;
        this.b = 10;
        this.c = new SimpleArrayMap(10);
    }

    public e(int i, long j) {
        this.a = j;
        this.b = i;
        this.c = new SimpleArrayMap();
    }

    private void a(long j, long j2) {
        for (int size = this.c.size() - 1; size >= 0; size--) {
            if (j2 - ((Long) this.c.valueAt(size)).longValue() > j) {
                this.c.removeAt(size);
            }
        }
    }

    public Long a(String str) {
        Long l;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.a;
        synchronized (this) {
            while (this.c.size() >= this.b) {
                a(j, elapsedRealtime);
                j /= 2;
                Log.w("ConnectionTracker", "The max capacity " + this.b + " is not enough. Current durationThreshold is: " + j);
            }
            l = (Long) this.c.put(str, Long.valueOf(elapsedRealtime));
        }
        return l;
    }

    public boolean b(String str) {
        boolean z;
        synchronized (this) {
            z = this.c.remove(str) != null;
        }
        return z;
    }
}
