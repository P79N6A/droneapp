package com.fimi.soul.module.thirdpartlogin;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import cn.sharesdk.facebook.Facebook;
import cn.sharesdk.framework.PlatformDb;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.twitter.Twitter;
import com.fimi.overseas.soul.R;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.biz.manager.x;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.User;
import com.tencent.open.SocialConstants;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.mipush.sdk.MiPushClient;
import java.io.File;
import java.util.HashMap;

public class c {
    public static c a = null;
    public static final String c = "LoginManager";
    public Context b;
    public String d;
    private User e = new User();
    private String f;

    public interface a {
        void a(int i, Object obj);
    }

    private c() {
    }

    public static c a() {
        if (a == null) {
            a = new c();
        }
        return a;
    }

    private void a(PlatformDb platformDb, final a aVar) {
        Log.i(c, "thirPlaformLogin(" + platformDb.toString() + Constants.ACCEPT_TIME_SEPARATOR_SP + aVar.toString() + ")");
        String userId = platformDb.getUserId();
        String userIcon = platformDb.getUserIcon();
        String platformNname = platformDb.getPlatformNname();
        Log.i(c, "platformName:" + platformNname);
        Log.i(c, "userIcon:" + userIcon);
        this.e.setXiaomiID(userId);
        this.e.setappType("0");
        this.e.setName(platformDb.getUserName());
        this.e.setNickName(platformDb.getUserName());
        this.e.setUserImgUrl(userIcon);
        if (platformNname.equalsIgnoreCase(Facebook.NAME)) {
            this.d = "1";
        } else if (platformNname.equalsIgnoreCase(Twitter.NAME)) {
            this.d = "2";
        }
        this.e.setloginChannel(this.d);
        x.a(this.b).d(this.e, new k(this) {
            final /* synthetic */ c b;

            public void a(PlaneMsg planeMsg, File file) {
                this.b.f = planeMsg.getErrorMessage();
                if (planeMsg.isSuccess()) {
                    MiPushClient.registerPush(this.b.b, "2882303761517518920", com.fimi.soul.base.a.r);
                    if (aVar != null) {
                        aVar.a(0, "");
                    }
                } else if (this.b.f != null) {
                    if (aVar != null) {
                        aVar.a(1, String.valueOf(this.b.f));
                    }
                } else if (aVar != null) {
                    aVar.a(1, this.b.b.getResources().getString(R.string.login_result_net));
                }
            }
        });
    }

    private void b(String str, final a aVar) {
        Log.i(c, "innerLogin(" + str + ")");
        b bVar = new b();
        bVar.a(str);
        this.d = str;
        bVar.a(new d(this) {
            final /* synthetic */ c b;

            public boolean a(f fVar) {
                return true;
            }

            public boolean a(String str, HashMap<String, Object> hashMap) {
                if (!TextUtils.isEmpty(str)) {
                    this.b.a(ShareSDK.getPlatform(str).getDb(), aVar);
                } else if (aVar != null) {
                    aVar.a(-1, hashMap.get(SocialConstants.PARAM_SEND_MSG));
                }
                return false;
            }
        });
        bVar.a(this.b);
    }

    public void a(Context context) {
        this.b = context;
        ShareSDK.initSDK(context);
    }

    public void a(String str, a aVar) {
        b(str, aVar);
    }

    public void b() {
        if (!TextUtils.isEmpty(this.d)) {
            ShareSDK.getPlatform(this.d).removeAccount(true);
        }
    }
}
