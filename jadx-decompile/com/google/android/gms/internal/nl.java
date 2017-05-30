package com.google.android.gms.internal;

import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

final class nl implements nw<Date>, of<Date> {
    private final DateFormat a;
    private final DateFormat b;
    private final DateFormat c;

    nl() {
        this(DateFormat.getDateTimeInstance(2, 2, Locale.US), DateFormat.getDateTimeInstance(2, 2));
    }

    public nl(int i, int i2) {
        this(DateFormat.getDateTimeInstance(i, i2, Locale.US), DateFormat.getDateTimeInstance(i, i2));
    }

    nl(String str) {
        this(new SimpleDateFormat(str, Locale.US), new SimpleDateFormat(str));
    }

    nl(DateFormat dateFormat, DateFormat dateFormat2) {
        this.a = dateFormat;
        this.b = dateFormat2;
        this.c = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        this.c.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    private Date a(nx nxVar) {
        Date parse;
        synchronized (this.b) {
            try {
                parse = this.b.parse(nxVar.c());
            } catch (ParseException e) {
                try {
                    parse = this.a.parse(nxVar.c());
                } catch (ParseException e2) {
                    try {
                        parse = this.c.parse(nxVar.c());
                    } catch (Throwable e3) {
                        throw new og(nxVar.c(), e3);
                    }
                }
            }
        }
        return parse;
    }

    public nx a(Date date, Type type, oe oeVar) {
        nx odVar;
        synchronized (this.b) {
            odVar = new od(this.a.format(date));
        }
        return odVar;
    }

    public Date a(nx nxVar, Type type, nv nvVar) {
        if (nxVar instanceof od) {
            Date a = a(nxVar);
            if (type == Date.class) {
                return a;
            }
            if (type == Timestamp.class) {
                return new Timestamp(a.getTime());
            }
            if (type == java.sql.Date.class) {
                return new java.sql.Date(a.getTime());
            }
            String valueOf = String.valueOf(getClass());
            String valueOf2 = String.valueOf(type);
            throw new IllegalArgumentException(new StringBuilder((String.valueOf(valueOf).length() + 23) + String.valueOf(valueOf2).length()).append(valueOf).append(" cannot deserialize to ").append(valueOf2).toString());
        }
        throw new ob("The date should be a string value");
    }

    public /* synthetic */ Object b(nx nxVar, Type type, nv nvVar) {
        return a(nxVar, type, nvVar);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(nl.class.getSimpleName());
        stringBuilder.append('(').append(this.b.getClass().getSimpleName()).append(')');
        return stringBuilder.toString();
    }
}
