package com.google.android.gms.internal;

import android.os.Bundle;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.firebase.a.a.b;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

@aaa
class wq {
    private final Object[] a;

    wq(AdRequestParcel adRequestParcel, String str, int i) {
        this.a = a(adRequestParcel, str, i);
    }

    private static String a(@Nullable Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            String a = obj == null ? "null" : obj instanceof Bundle ? a((Bundle) obj) : obj.toString();
            stringBuilder.append(a);
        }
        return stringBuilder.toString();
    }

    private static Object[] a(AdRequestParcel adRequestParcel, String str, int i) {
        Set hashSet = new HashSet(Arrays.asList(((String) uf.ax.c()).split(Constants.ACCEPT_TIME_SEPARATOR_SP)));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(adRequestParcel.b));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(a(adRequestParcel.c));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(adRequestParcel.d));
        }
        if (hashSet.contains("keywords")) {
            if (adRequestParcel.e != null) {
                arrayList.add(adRequestParcel.e.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(adRequestParcel.f));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(adRequestParcel.g));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(adRequestParcel.h));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(adRequestParcel.i);
        }
        if (hashSet.contains(b.p)) {
            if (adRequestParcel.k != null) {
                arrayList.add(adRequestParcel.k.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(adRequestParcel.l);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(a(adRequestParcel.m));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(a(adRequestParcel.n));
        }
        if (hashSet.contains("categoryExclusions")) {
            if (adRequestParcel.o != null) {
                arrayList.add(adRequestParcel.o.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(adRequestParcel.p);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(adRequestParcel.q);
        }
        return arrayList.toArray();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof wq)) {
            return false;
        }
        return Arrays.equals(this.a, ((wq) obj).a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public String toString() {
        String valueOf = String.valueOf(Arrays.toString(this.a));
        return new StringBuilder(String.valueOf(valueOf).length() + 24).append("[InterstitialAdPoolKey ").append(valueOf).append("]").toString();
    }
}
