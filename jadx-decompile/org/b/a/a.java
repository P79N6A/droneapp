package org.b.a;

import java.util.ArrayList;
import java.util.Arrays;
import org.b.g;
import org.b.h;
import org.b.i;
import org.b.k;

public class a<T> extends h<T> {
    private final Iterable<k<? super T>> a;

    public a(Iterable<k<? super T>> iterable) {
        this.a = iterable;
    }

    @i
    public static <T> k<T> a(Iterable<k<? super T>> iterable) {
        return new a(iterable);
    }

    @i
    public static <T> k<T> a(k<? super T> kVar, k<? super T> kVar2) {
        Iterable arrayList = new ArrayList(2);
        arrayList.add(kVar);
        arrayList.add(kVar2);
        return a(arrayList);
    }

    @i
    public static <T> k<T> a(k<? super T> kVar, k<? super T> kVar2, k<? super T> kVar3) {
        Iterable arrayList = new ArrayList(3);
        arrayList.add(kVar);
        arrayList.add(kVar2);
        arrayList.add(kVar3);
        return a(arrayList);
    }

    @i
    public static <T> k<T> a(k<? super T> kVar, k<? super T> kVar2, k<? super T> kVar3, k<? super T> kVar4) {
        Iterable arrayList = new ArrayList(4);
        arrayList.add(kVar);
        arrayList.add(kVar2);
        arrayList.add(kVar3);
        arrayList.add(kVar4);
        return a(arrayList);
    }

    @i
    public static <T> k<T> a(k<? super T> kVar, k<? super T> kVar2, k<? super T> kVar3, k<? super T> kVar4, k<? super T> kVar5) {
        Iterable arrayList = new ArrayList(5);
        arrayList.add(kVar);
        arrayList.add(kVar2);
        arrayList.add(kVar3);
        arrayList.add(kVar4);
        arrayList.add(kVar5);
        return a(arrayList);
    }

    @i
    public static <T> k<T> a(k<? super T> kVar, k<? super T> kVar2, k<? super T> kVar3, k<? super T> kVar4, k<? super T> kVar5, k<? super T> kVar6) {
        Iterable arrayList = new ArrayList(6);
        arrayList.add(kVar);
        arrayList.add(kVar2);
        arrayList.add(kVar3);
        arrayList.add(kVar4);
        arrayList.add(kVar5);
        arrayList.add(kVar6);
        return a(arrayList);
    }

    @i
    public static <T> k<T> a(k<? super T>... kVarArr) {
        return a(Arrays.asList(kVarArr));
    }

    public void a(g gVar) {
        gVar.b("(", " and ", ")", this.a);
    }

    public boolean b(Object obj, g gVar) {
        for (k kVar : this.a) {
            if (!kVar.a(obj)) {
                gVar.a(kVar).a(" ");
                kVar.a(obj, gVar);
                return false;
            }
        }
        return true;
    }
}
