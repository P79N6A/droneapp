package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class jd implements if {
    static final /* synthetic */ boolean b = (!jd.class.desiredAssertionStatus());
    private static jd c = new jd();
    final HashMap<ie, List<ie>> a = new HashMap();

    private jd() {
    }

    public static jd a() {
        return c;
    }

    private void d(ie ieVar) {
        int i = 0;
        synchronized (this.a) {
            List list = (List) this.a.get(ieVar);
            int i2;
            if (list != null) {
                int i3;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    if (list.get(i4) == ieVar) {
                        i3 = 1;
                        list.remove(i4);
                        break;
                    }
                }
                i3 = 0;
                if (list.isEmpty()) {
                    this.a.remove(ieVar);
                }
                i2 = i3;
            } else {
                i2 = 0;
            }
            if (!b && r0 == 0 && ieVar.d()) {
                throw new AssertionError();
            }
            if (!ieVar.a().d()) {
                ie a = ieVar.a(kg.a(ieVar.a().a()));
                list = (List) this.a.get(a);
                if (list != null) {
                    while (i < list.size()) {
                        if (list.get(i) == ieVar) {
                            list.remove(i);
                            break;
                        }
                        i++;
                    }
                    if (list.isEmpty()) {
                        this.a.remove(a);
                    }
                }
            }
        }
    }

    public void a(ie ieVar) {
        d(ieVar);
    }

    public void b(ie ieVar) {
        synchronized (this.a) {
            List list = (List) this.a.get(ieVar);
            if (list == null) {
                list = new ArrayList();
                this.a.put(ieVar, list);
            }
            list.add(ieVar);
            if (!ieVar.a().d()) {
                ie a = ieVar.a(kg.a(ieVar.a().a()));
                list = (List) this.a.get(a);
                if (list == null) {
                    list = new ArrayList();
                    this.a.put(a, list);
                }
                list.add(ieVar);
            }
            ieVar.a(true);
            ieVar.a((if) this);
        }
    }

    public void c(ie ieVar) {
        synchronized (this.a) {
            List list = (List) this.a.get(ieVar);
            if (!(list == null || list.isEmpty())) {
                if (ieVar.a().d()) {
                    HashSet hashSet = new HashSet();
                    for (int size = list.size() - 1; size >= 0; size--) {
                        ie ieVar2 = (ie) list.get(size);
                        if (!hashSet.contains(ieVar2.a())) {
                            hashSet.add(ieVar2.a());
                            ieVar2.b();
                        }
                    }
                } else {
                    ((ie) list.get(0)).b();
                }
            }
        }
    }
}
