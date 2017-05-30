package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@aaa
public class uc {
    private final Collection<ub> a = new ArrayList();
    private final Collection<ub<String>> b = new ArrayList();
    private final Collection<ub<String>> c = new ArrayList();

    public List<String> a() {
        List<String> arrayList = new ArrayList();
        for (ub c : this.b) {
            String str = (String) c.c();
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public void a(ub ubVar) {
        this.a.add(ubVar);
    }

    public List<String> b() {
        List<String> a = a();
        for (ub c : this.c) {
            String str = (String) c.c();
            if (str != null) {
                a.add(str);
            }
        }
        return a;
    }

    public void b(ub<String> ubVar) {
        this.b.add(ubVar);
    }

    public void c(ub<String> ubVar) {
        this.c.add(ubVar);
    }
}
