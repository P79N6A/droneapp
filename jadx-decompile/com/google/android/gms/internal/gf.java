package com.google.android.gms.internal;

import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.d;
import com.google.firebase.auth.api.model.ProviderUserInfo;
import com.google.firebase.auth.api.model.ProviderUserInfoList;
import java.util.List;

public class gf extends oj<ProviderUserInfoList> {
    private nr a;

    public ProviderUserInfoList a(pp ppVar) {
        if (ppVar.f() == pq.NULL) {
            ppVar.j();
            return null;
        }
        ProviderUserInfoList providerUserInfoList = new ProviderUserInfoList();
        oj a = this.a.a(ProviderUserInfo.class);
        ppVar.a();
        while (ppVar.e()) {
            providerUserInfoList.a().add((ProviderUserInfo) a.b(ppVar));
        }
        ppVar.b();
        return providerUserInfoList;
    }

    public void a(@NonNull nr nrVar) {
        this.a = (nr) d.a(nrVar);
    }

    public void a(ps psVar, ProviderUserInfoList providerUserInfoList) {
        int i = 0;
        if (providerUserInfoList == null) {
            psVar.f();
            return;
        }
        oj a = this.a.a(ProviderUserInfo.class);
        psVar.b();
        List a2 = providerUserInfoList.a();
        int size = a2 != null ? a2.size() : 0;
        while (i < size) {
            a.a(psVar, (ProviderUserInfo) a2.get(i));
            i++;
        }
        psVar.c();
    }

    public /* synthetic */ Object b(pp ppVar) {
        return a(ppVar);
    }
}
