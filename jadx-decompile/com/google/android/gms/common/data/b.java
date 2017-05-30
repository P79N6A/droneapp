package com.google.android.gms.common.data;

import android.os.Bundle;
import com.google.android.gms.common.api.k;
import java.util.Iterator;

public interface b<T> extends k, Iterable<T> {
    T a(int i);

    void b();

    int c();

    @Deprecated
    void d();

    @Deprecated
    boolean e();

    Bundle f();

    Iterator<T> g();

    Iterator<T> iterator();
}
