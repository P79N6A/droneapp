package com.google.android.gms.games.social;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.a;

public class c extends a<SocialInvite> {
    public c(DataHolder dataHolder) {
        super(dataHolder);
    }

    public /* synthetic */ Object a(int i) {
        return b(i);
    }

    public SocialInvite b(int i) {
        return new SocialInviteRef(this.a, i);
    }
}
