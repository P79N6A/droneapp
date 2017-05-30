package com.google.android.gms.internal;

import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.d;
import com.google.firebase.auth.api.model.GetAccountInfoUser;
import com.google.firebase.auth.api.model.GetAccountInfoUserList;
import java.util.List;

public class fx extends oj<GetAccountInfoUserList> {
    private nr a;

    public GetAccountInfoUserList a(pp ppVar) {
        if (ppVar.f() == pq.NULL) {
            ppVar.j();
            return null;
        }
        GetAccountInfoUserList getAccountInfoUserList = new GetAccountInfoUserList();
        oj a = this.a.a(GetAccountInfoUser.class);
        ppVar.a();
        while (ppVar.e()) {
            getAccountInfoUserList.a().add((GetAccountInfoUser) a.b(ppVar));
        }
        ppVar.b();
        return getAccountInfoUserList;
    }

    public void a(@NonNull nr nrVar) {
        this.a = (nr) d.a(nrVar);
    }

    public void a(ps psVar, GetAccountInfoUserList getAccountInfoUserList) {
        int i = 0;
        if (getAccountInfoUserList == null) {
            psVar.f();
            return;
        }
        oj a = this.a.a(GetAccountInfoUser.class);
        psVar.b();
        List a2 = getAccountInfoUserList.a();
        int size = a2 != null ? a2.size() : 0;
        while (i < size) {
            a.a(psVar, (GetAccountInfoUser) a2.get(i));
            i++;
        }
        psVar.c();
    }

    public /* synthetic */ Object b(pp ppVar) {
        return a(ppVar);
    }
}
