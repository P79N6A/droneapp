package com.xiaomi.account.openauth;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import c.a.a;
import com.xiaomi.account.IXiaomiAuthService;

class XiaomiOAuthorize$4 extends MiuiAuthServiceRunnable<Bundle> {
    XiaomiOAuthorize$4(Context context, Account account, Bundle bundle) {
        super(context, account, bundle);
    }

    protected Bundle talkWithMiuiV5(a aVar) {
        aVar.d(this.account, this.options);
        return aVar.b(this.account, this.options);
    }

    protected Bundle talkWithMiuiV6(IXiaomiAuthService iXiaomiAuthService) {
        return iXiaomiAuthService.getMiCloudAccessToken(this.account, this.options);
    }
}
