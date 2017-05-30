package com.google.android.gms.internal;

import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.d;
import com.google.firebase.auth.api.model.StringList;
import java.util.List;

public class gg extends oj<StringList> {
    private nr a;

    public StringList a(pp ppVar) {
        if (ppVar.f() == pq.NULL) {
            ppVar.j();
            return null;
        }
        StringList stringList = new StringList();
        oj a = this.a.a(String.class);
        ppVar.a();
        while (ppVar.e()) {
            stringList.a().add((String) a.b(ppVar));
        }
        ppVar.b();
        return stringList;
    }

    public void a(@NonNull nr nrVar) {
        this.a = (nr) d.a(nrVar);
    }

    public void a(ps psVar, StringList stringList) {
        int i = 0;
        if (stringList == null) {
            psVar.f();
            return;
        }
        oj a = this.a.a(String.class);
        psVar.b();
        List a2 = stringList.a();
        int size = a2 != null ? a2.size() : 0;
        while (i < size) {
            a.a(psVar, (String) a2.get(i));
            i++;
        }
        psVar.c();
    }

    public /* synthetic */ Object b(pp ppVar) {
        return a(ppVar);
    }
}
