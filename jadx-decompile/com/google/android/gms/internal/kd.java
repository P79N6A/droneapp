package com.google.android.gms.internal;

import com.google.android.gms.internal.kc.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class kd {
    private final kg a;
    private final lb b;

    public kd(kg kgVar) {
        this.a = kgVar;
        this.b = kgVar.c();
    }

    private kb a(ka kaVar, ie ieVar, lc lcVar) {
        if (!(kaVar.b().equals(a.VALUE) || kaVar.b().equals(a.CHILD_REMOVED))) {
            kaVar = kaVar.a(lcVar.a(kaVar.a(), kaVar.c().a(), this.b));
        }
        return ieVar.a(kaVar, this.a);
    }

    private Comparator<ka> a() {
        return new Comparator<ka>(this) {
            static final /* synthetic */ boolean a = (!kd.class.desiredAssertionStatus());
            final /* synthetic */ kd b;

            {
                this.b = r1;
            }

            public int a(ka kaVar, ka kaVar2) {
                if (a || !(kaVar.a() == null || kaVar2.a() == null)) {
                    return this.b.b.compare(new lg(kaVar.a(), kaVar.c().a()), new lg(kaVar2.a(), kaVar2.c().a()));
                }
                throw new AssertionError();
            }

            public /* synthetic */ int compare(Object obj, Object obj2) {
                return a((ka) obj, (ka) obj2);
            }
        };
    }

    private void a(List<kb> list, a aVar, List<ka> list2, List<ie> list3, lc lcVar) {
        List<ka> arrayList = new ArrayList();
        for (ka kaVar : list2) {
            if (kaVar.b().equals(aVar)) {
                arrayList.add(kaVar);
            }
        }
        Collections.sort(arrayList, a());
        for (ka kaVar2 : arrayList) {
            for (ie ieVar : list3) {
                if (ieVar.a(aVar)) {
                    list.add(a(kaVar2, ieVar, lcVar));
                }
            }
        }
    }

    public List<kb> a(List<ka> list, lc lcVar, List<ie> list2) {
        List<kb> arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        for (ka kaVar : list) {
            if (kaVar.b().equals(a.CHILD_CHANGED) && this.b.a(kaVar.e().a(), kaVar.c().a())) {
                arrayList2.add(ka.c(kaVar.a(), kaVar.c()));
            }
        }
        a(arrayList, a.CHILD_REMOVED, list, list2, lcVar);
        a(arrayList, a.CHILD_ADDED, list, list2, lcVar);
        a(arrayList, a.CHILD_MOVED, arrayList2, list2, lcVar);
        a(arrayList, a.CHILD_CHANGED, list, list2, lcVar);
        a(arrayList, a.VALUE, list, list2, lcVar);
        return arrayList;
    }
}
