package com.google.android.gms.internal;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public final class pl extends oj<Time> {
    public static final ok a = new ok() {
        public <T> oj<T> a(nr nrVar, po<T> poVar) {
            return poVar.a() == Time.class ? new pl() : null;
        }
    };
    private final DateFormat b = new SimpleDateFormat("hh:mm:ss a");

    public synchronized Time a(pp ppVar) {
        Time time;
        if (ppVar.f() == pq.NULL) {
            ppVar.j();
            time = null;
        } else {
            try {
                time = new Time(this.b.parse(ppVar.h()).getTime());
            } catch (Throwable e) {
                throw new og(e);
            }
        }
        return time;
    }

    public synchronized void a(ps psVar, Time time) {
        psVar.b(time == null ? null : this.b.format(time));
    }

    public /* synthetic */ Object b(pp ppVar) {
        return a(ppVar);
    }
}
