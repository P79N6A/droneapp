package org.b.a;

import java.util.ArrayList;
import java.util.Arrays;
import org.b.g;
import org.b.i;
import org.b.k;

public class b<T> extends n<T> {
    public b(Iterable<k<? super T>> iterable) {
        super(iterable);
    }

    @i
    public static <T> b<T> a(Iterable<k<? super T>> iterable) {
        return new b(iterable);
    }

    @i
    public static <T> b<T> a(k<T> kVar, k<? super T> kVar2) {
        Iterable arrayList = new ArrayList();
        arrayList.add(kVar);
        arrayList.add(kVar2);
        return a(arrayList);
    }

    @i
    public static <T> b<T> a(k<T> kVar, k<? super T> kVar2, k<? super T> kVar3) {
        Iterable arrayList = new ArrayList();
        arrayList.add(kVar);
        arrayList.add(kVar2);
        arrayList.add(kVar3);
        return a(arrayList);
    }

    @i
    public static <T> b<T> a(k<T> kVar, k<? super T> kVar2, k<? super T> kVar3, k<? super T> kVar4) {
        Iterable arrayList = new ArrayList();
        arrayList.add(kVar);
        arrayList.add(kVar2);
        arrayList.add(kVar3);
        arrayList.add(kVar4);
        return a(arrayList);
    }

    @i
    public static <T> b<T> a(k<T> kVar, k<? super T> kVar2, k<? super T> kVar3, k<? super T> kVar4, k<? super T> kVar5) {
        Iterable arrayList = new ArrayList();
        arrayList.add(kVar);
        arrayList.add(kVar2);
        arrayList.add(kVar3);
        arrayList.add(kVar4);
        arrayList.add(kVar5);
        return a(arrayList);
    }

    @i
    public static <T> b<T> a(k<T> kVar, k<? super T> kVar2, k<? super T> kVar3, k<? super T> kVar4, k<? super T> kVar5, k<? super T> kVar6) {
        Iterable arrayList = new ArrayList();
        arrayList.add(kVar);
        arrayList.add(kVar2);
        arrayList.add(kVar3);
        arrayList.add(kVar4);
        arrayList.add(kVar5);
        arrayList.add(kVar6);
        return a(arrayList);
    }

    @i
    public static <T> b<T> a(k<? super T>... kVarArr) {
        return a(Arrays.asList(kVarArr));
    }

    public void a(g gVar) {
        a(gVar, "or");
    }

    public boolean a(Object obj) {
        return a(obj, true);
    }
}
