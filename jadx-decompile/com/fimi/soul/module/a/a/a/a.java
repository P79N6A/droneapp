package com.fimi.soul.module.a.a.a;

import android.content.Context;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.Platform.ShareParams;
import com.fimi.soul.module.a.a.a.b.d;
import com.fimi.soul.module.a.e;

public class a extends e {
    protected void a(Context context, Platform platform, ShareParams shareParams) {
        b aVar = context.getResources().getConfiguration().orientation == 1 ? new com.fimi.soul.module.a.a.a.b.a(this) : new com.fimi.soul.module.a.a.a.a.a(this);
        aVar.d(platform);
        aVar.a(shareParams);
        aVar.show(context, null);
    }

    protected void b(Context context) {
        (context.getResources().getConfiguration().orientation == 1 ? new d(this) : new com.fimi.soul.module.a.a.a.a.d(this)).show(context, null);
    }
}
