package com.google.android.gms.drive.query.internal;

import com.google.android.gms.drive.metadata.a;
import com.google.android.gms.drive.metadata.g;
import java.util.List;

public interface f<F> {
    F a();

    F a(a<?> aVar);

    <T> F a(a<T> aVar, T t);

    <T> F a(g<T> gVar, T t);

    <T> F a(Operator operator, a<T> aVar, T t);

    F a(Operator operator, List<F> list);

    F a(F f);

    F a(String str);

    F b();
}
