package com.google.android.gms.location.places;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class AbstractPlaceFilter extends AbstractSafeParcelable {
    static <E> List<E> a(Collection<E> collection) {
        return (collection == null || collection.isEmpty()) ? Collections.emptyList() : new ArrayList(collection);
    }

    static <E> Set<E> a(List<E> list) {
        return (list == null || list.isEmpty()) ? Collections.emptySet() : Collections.unmodifiableSet(new HashSet(list));
    }

    public boolean a() {
        return false;
    }

    public abstract Set<String> b();
}
