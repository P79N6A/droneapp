package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@aaa
public class acn {
    public static <A, B> aco<B> a(aco<A> com_google_android_gms_internal_aco_A, a<A, B> aVar) {
        aco com_google_android_gms_internal_acl = new acl();
        com_google_android_gms_internal_aco_A.a(new 1(com_google_android_gms_internal_acl, aVar, com_google_android_gms_internal_aco_A));
        return com_google_android_gms_internal_acl;
    }

    public static <V> aco<List<V>> a(List<aco<V>> list) {
        aco com_google_android_gms_internal_acl = new acl();
        int size = list.size();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        for (aco a : list) {
            a.a(new 2(atomicInteger, size, com_google_android_gms_internal_acl, list));
        }
        return com_google_android_gms_internal_acl;
    }

    private static <V> List<V> c(List<aco<V>> list) {
        List<V> arrayList = new ArrayList();
        for (aco com_google_android_gms_internal_aco : list) {
            Object obj = com_google_android_gms_internal_aco.get();
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
