package com.google.android.gms.fitness;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.f;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public final class j {
    public static Scope a(Scope scope) {
        return scope.equals(new Scope(f.k)) ? new Scope(f.l) : scope.equals(new Scope(f.m)) ? new Scope(f.n) : scope.equals(new Scope(f.o)) ? new Scope(f.p) : scope.equals(new Scope(f.q)) ? new Scope(f.r) : scope;
    }

    public static Set<Scope> a(Collection<Scope> collection) {
        Set<Scope> hashSet = new HashSet(collection.size());
        for (Scope scope : collection) {
            Scope a = a(scope);
            if (a.equals(scope) || !collection.contains(a)) {
                hashSet.add(scope);
            }
        }
        return hashSet;
    }
}
