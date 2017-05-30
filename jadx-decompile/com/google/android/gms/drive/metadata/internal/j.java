package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.drive.metadata.g;
import java.util.ArrayList;
import java.util.Collection;

public class j<T extends Parcelable> extends g<T> {
    public j(String str, Collection<String> collection, Collection<String> collection2, int i) {
        super(str, collection, collection2, i);
    }

    protected void a(Bundle bundle, Collection<T> collection) {
        bundle.putParcelableArrayList(a(), collection instanceof ArrayList ? (ArrayList) collection : new ArrayList(collection));
    }

    protected Collection<T> b(Bundle bundle) {
        return bundle.getParcelableArrayList(a());
    }

    protected /* synthetic */ Object c(Bundle bundle) {
        return b(bundle);
    }
}
