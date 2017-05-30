package com.xiaomi.account.openauth;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import c.a.a;
import com.xiaomi.account.IXiaomiAuthResponse;
import com.xiaomi.account.IXiaomiAuthService;

class XiaomiOAuthorize$3 extends MiuiAuthServiceRunnable<Bundle> {
    final /* synthetic */ IXiaomiAuthResponse val$resp;

    XiaomiOAuthorize$3(Context context, Account account, Bundle bundle, IXiaomiAuthResponse iXiaomiAuthResponse) {
        this.val$resp = iXiaomiAuthResponse;
        super(context, account, bundle);
    }

    protected Bundle talkWithMiuiV5(a aVar) {
        throw new IllegalStateException("should not be here");
    }

    protected Bundle talkWithMiuiV6(IXiaomiAuthService iXiaomiAuthService) {
        iXiaomiAuthService.getAccessTokenInResponse(this.val$resp, this.options, 1, 4);
        return null;
    }
}
