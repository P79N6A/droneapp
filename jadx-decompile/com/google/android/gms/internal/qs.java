package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.a.a.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class qs extends rm {
    private static final String s = qs.class.getSimpleName();
    private a t;

    protected qs(Context context) {
        super(context, "");
    }

    public static qs c(Context context) {
        rm.a(context, true);
        return new qs(context);
    }

    protected df.a a(Context context, View view) {
        return null;
    }

    public String a(String str, String str2) {
        return ln.a(str, str2, true);
    }

    public void a(a aVar) {
        this.t = aVar;
    }

    protected void a(rw rwVar, df.a aVar) {
        if (!rwVar.h()) {
            a(b(rwVar, aVar));
        } else if (this.t != null) {
            String a = this.t.a();
            if (!TextUtils.isEmpty(a)) {
                aVar.aa = ry.a(a);
                aVar.ab = Integer.valueOf(5);
                aVar.ac = Boolean.valueOf(this.t.b());
            }
            this.t = null;
        }
    }

    protected List<Callable<Void>> b(rw rwVar, df.a aVar) {
        List<Callable<Void>> arrayList = new ArrayList();
        if (rwVar.c() == null) {
            return arrayList;
        }
        rw rwVar2 = rwVar;
        arrayList.add(new sf(rwVar2, rr.n(), rr.o(), aVar, rwVar.q(), 24));
        return arrayList;
    }
}
