package com.google.android.gms.drive.query;

import com.google.android.gms.drive.metadata.a;
import com.google.android.gms.drive.metadata.g;
import com.google.android.gms.drive.query.internal.Operator;
import com.xiaomi.mipush.sdk.Constants;
import java.util.List;

public class f implements com.google.android.gms.drive.query.internal.f<String> {
    public /* synthetic */ Object a() {
        return c();
    }

    public /* synthetic */ Object a(a aVar) {
        return b(aVar);
    }

    public /* synthetic */ Object a(a aVar, Object obj) {
        return b(aVar, obj);
    }

    public /* synthetic */ Object a(g gVar, Object obj) {
        return b(gVar, obj);
    }

    public /* synthetic */ Object a(Operator operator, a aVar, Object obj) {
        return b(operator, aVar, obj);
    }

    public /* synthetic */ Object a(Operator operator, List list) {
        return b(operator, list);
    }

    public /* synthetic */ Object a(Object obj) {
        return b((String) obj);
    }

    public /* synthetic */ Object a(String str) {
        return c(str);
    }

    public /* synthetic */ Object b() {
        return d();
    }

    public String b(a<?> aVar) {
        return String.format("fieldOnly(%s)", new Object[]{aVar.a()});
    }

    public <T> String b(a<T> aVar, T t) {
        return String.format("has(%s,%s)", new Object[]{aVar.a(), t});
    }

    public <T> String b(g<T> gVar, T t) {
        return String.format("contains(%s,%s)", new Object[]{gVar.a(), t});
    }

    public <T> String b(Operator operator, a<T> aVar, T t) {
        return String.format("cmp(%s,%s,%s)", new Object[]{operator.a(), aVar.a(), t});
    }

    public String b(Operator operator, List<String> list) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(operator.a()).concat("("));
        String str = "";
        for (String str2 : list) {
            stringBuilder.append(str);
            stringBuilder.append(str2);
            str = Constants.ACCEPT_TIME_SEPARATOR_SP;
        }
        return stringBuilder.append(")").toString();
    }

    public String b(String str) {
        return String.format("not(%s)", new Object[]{str});
    }

    public String c() {
        return "all()";
    }

    public String c(String str) {
        return String.format("fullTextSearch(%s)", new Object[]{str});
    }

    public String d() {
        return "ownedByMe()";
    }
}
