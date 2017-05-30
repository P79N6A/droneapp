package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.drive.metadata.f;
import java.util.Collection;

public abstract class k<T extends ReflectedParcelable> extends f<T> {
    public k(String str, Collection<String> collection, Collection<String> collection2, int i) {
        super(str, collection, collection2, i);
    }

    protected void a(Bundle bundle, ReflectedParcelable reflectedParcelable) {
        bundle.putParcelable(a(), reflectedParcelable);
    }

    protected T b(Bundle bundle) {
        return (ReflectedParcelable) bundle.getParcelable(a());
    }

    protected /* synthetic */ Object c(Bundle bundle) {
        return b(bundle);
    }
}
