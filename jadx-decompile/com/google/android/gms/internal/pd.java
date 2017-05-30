package com.google.android.gms.internal;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public final class pd extends oj<Date> {
    public static final ok a = new ok() {
        public <T> oj<T> a(nr nrVar, po<T> poVar) {
            return poVar.a() == Date.class ? new pd() : null;
        }
    };
    private final DateFormat b = DateFormat.getDateTimeInstance(2, 2, Locale.US);
    private final DateFormat c = DateFormat.getDateTimeInstance(2, 2);
    private final DateFormat d = a();

    private static DateFormat a() {
        DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat;
    }

    private synchronized Date a(String str) {
        Date parse;
        try {
            parse = this.c.parse(str);
        } catch (ParseException e) {
            try {
                parse = this.b.parse(str);
            } catch (ParseException e2) {
                try {
                    parse = this.d.parse(str);
                } catch (Throwable e3) {
                    throw new og(str, e3);
                }
            }
        }
        return parse;
    }

    public Date a(pp ppVar) {
        if (ppVar.f() != pq.NULL) {
            return a(ppVar.h());
        }
        ppVar.j();
        return null;
    }

    public synchronized void a(ps psVar, Date date) {
        if (date == null) {
            psVar.f();
        } else {
            psVar.b(this.b.format(date));
        }
    }

    public /* synthetic */ Object b(pp ppVar) {
        return a(ppVar);
    }
}
