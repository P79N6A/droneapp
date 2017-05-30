package com.fimi.soul.module.thirdpartlogin;

import cn.sharesdk.framework.authorize.AuthorizeAdapter;

public class a extends AuthorizeAdapter {
    public void onCreate() {
        super.onCreate();
        hideShareSDKLogo();
    }
}
