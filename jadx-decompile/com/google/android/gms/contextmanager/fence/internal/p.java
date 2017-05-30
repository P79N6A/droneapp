package com.google.android.gms.contextmanager.fence.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.qt;
import java.util.TimeZone;

public class p {
    private final qt a;

    public p(qt qtVar) {
        this.a = (qt) d.a(qtVar);
    }

    public static p a(int i, TimeZone timeZone, long j, long j2) {
        boolean z = true;
        d.b(i != 1);
        d.a(timeZone);
        d.b(j >= 0);
        d.b(j <= 86400000);
        d.b(j2 >= 0);
        d.b(j2 <= 86400000);
        if (j > j2) {
            z = false;
        }
        d.b(z);
        return new p(b(i, timeZone, j, j2));
    }

    public static p a(long j, long j2) {
        boolean z = false;
        d.b(j >= 0);
        d.b(j2 >= 0);
        if (j <= j2) {
            z = true;
        }
        d.b(z);
        return new p(b(1, null, j, j2));
    }

    private static qt b(int i, TimeZone timeZone, long j, long j2) {
        qt qtVar = new qt();
        qtVar.a = i;
        if (!(timeZone == null || TextUtils.isEmpty(timeZone.getID()))) {
            qtVar.b = timeZone.getID();
        }
        qtVar.c = j;
        qtVar.d = j2;
        return qtVar;
    }

    public qt a() {
        return this.a;
    }
}
