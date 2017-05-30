package com.google.android.gms.internal;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public final class pk extends oj<Date> {
    public static final ok a = new ok() {
        public <T> oj<T> a(nr nrVar, po<T> poVar) {
            return poVar.a() == Date.class ? new pk() : null;
        }
    };
    private final DateFormat b = new SimpleDateFormat("MMM d, yyyy");

    public synchronized Date a(pp ppVar) {
        Date date;
        if (ppVar.f() == pq.NULL) {
            ppVar.j();
            date = null;
        } else {
            try {
                date = new Date(this.b.parse(ppVar.h()).getTime());
            } catch (Throwable e) {
                throw new og(e);
            }
        }
        return date;
    }

    public synchronized void a(ps psVar, Date date) {
        psVar.b(date == null ? null : this.b.format(date));
    }

    public /* synthetic */ Object b(pp ppVar) {
        return a(ppVar);
    }
}
