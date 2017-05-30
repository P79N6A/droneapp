package com.xiaomi.account.openauth;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import c.a.a;
import com.xiaomi.account.IXiaomiAuthService;

class XiaomiOAuthorize$6 extends MiuiAuthServiceRunnable<Boolean> {
    final /* synthetic */ XiaomiOAuthorize this$0;

    XiaomiOAuthorize$6(XiaomiOAuthorize xiaomiOAuthorize, Context context, Account account, Bundle bundle) {
        this.this$0 = xiaomiOAuthorize;
        super(context, account, bundle);
    }

    protected Boolean talkWithMiuiV5(a aVar) {
        return Boolean.valueOf(false);
    }

    protected Boolean talkWithMiuiV6(IXiaomiAuthService iXiaomiAuthService) {
        return Boolean.valueOf(iXiaomiAuthService.supportResponseWay());
    }
}
