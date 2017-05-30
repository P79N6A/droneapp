package com.google.ads.mediation;

import android.location.Location;
import com.google.ads.a.b;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

@Deprecated
public class c {
    private final Date a;
    private final b b;
    private final Set<String> c;
    private final boolean d;
    private final Location e;

    public c(Date date, b bVar, Set<String> set, boolean z, Location location) {
        this.a = date;
        this.b = bVar;
        this.c = set;
        this.d = z;
        this.e = location;
    }

    public Integer a() {
        if (this.a == null) {
            return null;
        }
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        instance.setTime(this.a);
        Integer valueOf = Integer.valueOf(instance2.get(1) - instance.get(1));
        return (instance2.get(2) < instance.get(2) || (instance2.get(2) == instance.get(2) && instance2.get(5) < instance.get(5))) ? Integer.valueOf(valueOf.intValue() - 1) : valueOf;
    }

    public Date b() {
        return this.a;
    }

    public b c() {
        return this.b;
    }

    public Set<String> d() {
        return this.c;
    }

    public Location e() {
        return this.e;
    }

    public boolean f() {
        return this.d;
    }
}
