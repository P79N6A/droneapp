package com.google.android.gms.common.util;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.d;
import java.util.Set;

public final class v {
    public static String[] a(Set<Scope> set) {
        d.a(set, "scopes can't be null.");
        return a((Scope[]) set.toArray(new Scope[set.size()]));
    }

    public static String[] a(Scope[] scopeArr) {
        d.a(scopeArr, "scopes can't be null.");
        String[] strArr = new String[scopeArr.length];
        for (int i = 0; i < scopeArr.length; i++) {
            strArr[i] = scopeArr[i].a();
        }
        return strArr;
    }
}
