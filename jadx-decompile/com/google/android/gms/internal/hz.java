package com.google.android.gms.internal;

import com.google.firebase.database.a;
import com.google.firebase.database.c;
import com.google.firebase.database.s;

public class hz extends ie {
    private final im b;
    private final a c;
    private final kg d;

    public hz(im imVar, a aVar, kg kgVar) {
        this.b = imVar;
        this.c = aVar;
        this.d = kgVar;
    }

    public ie a(kg kgVar) {
        return new hz(this.b, this.c, kgVar);
    }

    public kb a(ka kaVar, kg kgVar) {
        return new kb(kaVar.b(), this, s.a(s.a(this.b, kgVar.a().a(kaVar.a())), kaVar.c()), kaVar.d() != null ? kaVar.d().e() : null);
    }

    public kg a() {
        return this.d;
    }

    public void a(kb kbVar) {
        if (!c()) {
            switch (kbVar.e()) {
                case CHILD_ADDED:
                    this.c.a(kbVar.c(), kbVar.d());
                    return;
                case CHILD_CHANGED:
                    this.c.b(kbVar.c(), kbVar.d());
                    return;
                case CHILD_MOVED:
                    this.c.c(kbVar.c(), kbVar.d());
                    return;
                case CHILD_REMOVED:
                    this.c.a(kbVar.c());
                    return;
                default:
                    return;
            }
        }
    }

    public void a(c cVar) {
        this.c.a(cVar);
    }

    public boolean a(ie ieVar) {
        return (ieVar instanceof hz) && ((hz) ieVar).c.equals(this.c);
    }

    public boolean a(kc.a aVar) {
        return aVar != kc.a.VALUE;
    }

    public boolean equals(Object obj) {
        return (obj instanceof hz) && ((hz) obj).c.equals(this.c) && ((hz) obj).b.equals(this.b) && ((hz) obj).d.equals(this.d);
    }

    public int hashCode() {
        return (((this.c.hashCode() * 31) + this.b.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "ChildEventRegistration";
    }
}
