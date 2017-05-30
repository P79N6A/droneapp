package com.google.android.gms.drive.query.internal;

import com.google.android.gms.drive.metadata.a;
import com.google.android.gms.drive.query.Filter;
import java.util.List;

public class g implements f<Boolean> {
    private Boolean a = Boolean.valueOf(false);

    private g() {
    }

    public static boolean a(Filter filter) {
        return filter == null ? false : ((Boolean) filter.a(new g())).booleanValue();
    }

    public Boolean a(Boolean bool) {
        return this.a;
    }

    public /* synthetic */ Object a() {
        return c();
    }

    public /* synthetic */ Object a(a aVar) {
        return b(aVar);
    }

    public /* synthetic */ Object a(a aVar, Object obj) {
        return b(aVar, obj);
    }

    public /* synthetic */ Object a(com.google.android.gms.drive.metadata.g gVar, Object obj) {
        return b(gVar, obj);
    }

    public /* synthetic */ Object a(Operator operator, a aVar, Object obj) {
        return b(operator, aVar, obj);
    }

    public /* synthetic */ Object a(Operator operator, List list) {
        return b(operator, list);
    }

    public /* synthetic */ Object a(Object obj) {
        return a((Boolean) obj);
    }

    public /* synthetic */ Object a(String str) {
        return b(str);
    }

    public Boolean b(a<?> aVar) {
        return this.a;
    }

    public <T> Boolean b(a<T> aVar, T t) {
        return this.a;
    }

    public <T> Boolean b(com.google.android.gms.drive.metadata.g<T> gVar, T t) {
        return this.a;
    }

    public <T> Boolean b(Operator operator, a<T> aVar, T t) {
        return this.a;
    }

    public Boolean b(Operator operator, List<Boolean> list) {
        return this.a;
    }

    public Boolean b(String str) {
        if (!str.isEmpty()) {
            this.a = Boolean.valueOf(true);
        }
        return this.a;
    }

    public /* synthetic */ Object b() {
        return d();
    }

    public Boolean c() {
        return this.a;
    }

    public Boolean d() {
        return this.a;
    }
}
