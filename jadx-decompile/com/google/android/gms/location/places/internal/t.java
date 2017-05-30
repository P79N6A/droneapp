package com.google.android.gms.location.places.internal;

import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.j;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.fr;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class t extends j {
    public t(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    protected float a(String str, float f) {
        return (!d_(str) || i(str)) ? f : f(str);
    }

    protected int a(String str, int i) {
        return (!d_(str) || i(str)) ? i : c(str);
    }

    protected long a(String str, long j) {
        return (!d_(str) || i(str)) ? j : b(str);
    }

    protected <E extends SafeParcelable> E a(String str, Creator<E> creator) {
        byte[] a = a(str, null);
        return a == null ? null : c.a(a, creator);
    }

    protected String a(String str, String str2) {
        return (!d_(str) || i(str)) ? str2 : e(str);
    }

    protected <E extends SafeParcelable> List<E> a(String str, Creator<E> creator, List<E> list) {
        byte[] a = a(str, null);
        if (a == null) {
            return list;
        }
        try {
            fr a2 = fr.a(a);
            if (a2.c == null) {
                return list;
            }
            List<E> arrayList = new ArrayList(a2.c.length);
            for (byte[] a3 : a2.c) {
                arrayList.add(c.a(a3, creator));
            }
            return arrayList;
        } catch (Throwable e) {
            if (!Log.isLoggable("SafeDataBufferRef", 6)) {
                return list;
            }
            Log.e("SafeDataBufferRef", "Cannot parse byte[]", e);
            return list;
        }
    }

    protected List<Integer> a(String str, List<Integer> list) {
        byte[] a = a(str, null);
        if (a == null) {
            return list;
        }
        try {
            fr a2 = fr.a(a);
            if (a2.b == null) {
                return list;
            }
            List<Integer> arrayList = new ArrayList(a2.b.length);
            for (int valueOf : a2.b) {
                arrayList.add(Integer.valueOf(valueOf));
            }
            return arrayList;
        } catch (Throwable e) {
            if (!Log.isLoggable("SafeDataBufferRef", 6)) {
                return list;
            }
            Log.e("SafeDataBufferRef", "Cannot parse byte[]", e);
            return list;
        }
    }

    protected boolean a(String str, boolean z) {
        return (!d_(str) || i(str)) ? z : d(str);
    }

    protected byte[] a(String str, byte[] bArr) {
        return (!d_(str) || i(str)) ? bArr : g(str);
    }

    protected List<String> b(String str, List<String> list) {
        byte[] a = a(str, null);
        if (a != null) {
            try {
                fr a2 = fr.a(a);
                if (a2.a != null) {
                    list = Arrays.asList(a2.a);
                }
            } catch (Throwable e) {
                if (Log.isLoggable("SafeDataBufferRef", 6)) {
                    Log.e("SafeDataBufferRef", "Cannot parse byte[]", e);
                }
            }
        }
        return list;
    }
}
