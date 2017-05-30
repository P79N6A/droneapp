package com.google.android.gms.drive.metadata;

import com.google.android.gms.common.data.DataHolder;
import java.util.Collection;

public abstract class g<T> extends f<Collection<T>> {
    protected g(String str, Collection<String> collection, Collection<String> collection2, int i) {
        super(str, collection, collection2, i);
    }

    protected /* synthetic */ Object c(DataHolder dataHolder, int i, int i2) {
        return e_(dataHolder, i, i2);
    }

    protected Collection<T> e_(DataHolder dataHolder, int i, int i2) {
        throw new UnsupportedOperationException("Cannot read collections from a dataHolder.");
    }
}
