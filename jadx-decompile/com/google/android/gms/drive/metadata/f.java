package com.google.android.gms.drive.metadata;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public abstract class f<T> implements a<T> {
    private final String a;
    private final Set<String> b;
    private final Set<String> c;
    private final int d;

    protected f(String str, int i) {
        this.a = (String) d.a(str, "fieldName");
        this.b = Collections.singleton(str);
        this.c = Collections.emptySet();
        this.d = i;
    }

    protected f(String str, Collection<String> collection, Collection<String> collection2, int i) {
        this.a = (String) d.a(str, "fieldName");
        this.b = Collections.unmodifiableSet(new HashSet(collection));
        this.c = Collections.unmodifiableSet(new HashSet(collection2));
        this.d = i;
    }

    public final T a(Bundle bundle) {
        d.a(bundle, "bundle");
        return bundle.get(a()) != null ? c(bundle) : null;
    }

    public final T a(DataHolder dataHolder, int i, int i2) {
        return b(dataHolder, i, i2) ? c(dataHolder, i, i2) : null;
    }

    public final String a() {
        return this.a;
    }

    protected abstract void a(Bundle bundle, T t);

    public final void a(DataHolder dataHolder, MetadataBundle metadataBundle, int i, int i2) {
        d.a(dataHolder, "dataHolder");
        d.a(metadataBundle, "bundle");
        if (b(dataHolder, i, i2)) {
            metadataBundle.b(this, c(dataHolder, i, i2));
        }
    }

    public final void a(T t, Bundle bundle) {
        d.a(bundle, "bundle");
        if (t == null) {
            bundle.putString(a(), null);
        } else {
            a(bundle, (Object) t);
        }
    }

    public final Collection<String> b() {
        return this.b;
    }

    protected boolean b(DataHolder dataHolder, int i, int i2) {
        for (String str : this.b) {
            if (dataHolder.a(str)) {
                if (dataHolder.h(str, i, i2)) {
                }
            }
            return false;
        }
        return true;
    }

    protected abstract T c(Bundle bundle);

    protected abstract T c(DataHolder dataHolder, int i, int i2);

    public String toString() {
        return this.a;
    }
}
