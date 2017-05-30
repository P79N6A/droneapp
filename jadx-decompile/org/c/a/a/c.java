package org.c.a.a;

import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import org.c.e.a.a;
import org.c.e.e;
import org.c.e.f;

abstract class c implements e {
    c() {
    }

    private List<Class<?>> a(String str) {
        List<Class<?>> arrayList = new ArrayList();
        for (String a : str.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
            arrayList.add(org.c.b.c.a(a));
        }
        return arrayList;
    }

    protected abstract a a(List<Class<?>> list);

    public a a(f fVar) {
        try {
            return a(a(fVar.a()));
        } catch (Exception e) {
            throw new e.a(e);
        }
    }
}
