package com.xiaomi.account.openauth;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import c.a.a;
import com.xiaomi.account.IXiaomiAuthService;

class XiaomiOAuthorize$5 extends MiuiAuthServiceRunnable<Boolean> {
    XiaomiOAuthorize$5(Context context, Account account, Bundle bundle) {
        super(context, account, bundle);
    }

    protected Boolean talkWithMiuiV5(a aVar) {
        return Boolean.valueOf(true);
    }

    protected Boolean talkWithMiuiV6(IXiaomiAuthService iXiaomiAuthService) {
        return Boolean.valueOf(true);
    }
}
