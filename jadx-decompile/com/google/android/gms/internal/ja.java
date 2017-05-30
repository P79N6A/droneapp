package com.google.android.gms.internal;

import com.google.android.gms.internal.kc.a;
import com.google.firebase.database.c;
import com.google.firebase.database.r;
import com.google.firebase.database.s;

public class ja extends ie {
    private final im b;
    private final r c;
    private final kg d;

    public ja(im imVar, r rVar, kg kgVar) {
        this.b = imVar;
        this.c = rVar;
        this.d = kgVar;
    }

    public ie a(kg kgVar) {
        return new ja(this.b, this.c, kgVar);
    }

    public kb a(ka kaVar, kg kgVar) {
        return new kb(a.VALUE, this, s.a(s.a(this.b, kgVar.a()), kaVar.c()), null);
    }

    public kg a() {
        return this.d;
    }

    public void a(kb kbVar) {
        if (!c()) {
            this.c.a(kbVar.c());
        }
    }

    public void a(c cVar) {
        this.c.a(cVar);
    }

    public boolean a(ie ieVar) {
        return (ieVar instanceof ja) && ((ja) ieVar).c.equals(this.c);
    }

    public boolean a(a aVar) {
        return aVar == a.VALUE;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ja) && ((ja) obj).c.equals(this.c) && ((ja) obj).b.equals(this.b) && ((ja) obj).d.equals(this.d);
    }

    public int hashCode() {
        return (((this.c.hashCode() * 31) + this.b.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "ValueEventRegistration";
    }
}
