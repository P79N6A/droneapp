package cn.sharesdk.wechat.utils;

import android.os.Bundle;
import android.text.TextUtils;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.a.a;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import cn.sharesdk.framework.utils.d;
import com.mob.tools.network.KVPair;
import com.mob.tools.utils.Hashon;
import com.mob.tools.utils.R;
import com.tencent.mm.sdk.contact.RContact;
import com.tencent.mm.sdk.plugin.MMPluginProviderConstants.OAuth;
import com.tencent.open.GameAppOperation;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import java.util.ArrayList;
import java.util.HashMap;

public class g {
    private String a;
    private String b;
    private a c = a.a();
    private Platform d;
    private int e;

    public g(Platform platform, int i) {
        this.d = platform;
        this.e = i;
    }

    private void a(String str) {
        d.a().d("wechat getAuthorizeToken ==>>" + str, new Object[0]);
        HashMap fromJson = new Hashon().fromJson(str);
        String valueOf = String.valueOf(fromJson.get("access_token"));
        String valueOf2 = String.valueOf(fromJson.get("refresh_token"));
        String valueOf3 = String.valueOf(fromJson.get("expires_in"));
        this.d.getDb().put("openid", String.valueOf(fromJson.get("openid")));
        this.d.getDb().putExpiresIn(Long.valueOf(valueOf3).longValue());
        this.d.getDb().putToken(valueOf);
        this.d.getDb().put("refresh_token", valueOf2);
    }

    public void a(Bundle bundle, AuthorizeListener authorizeListener) {
        String string = bundle.getString("_wxapi_sendauth_resp_url");
        if (!TextUtils.isEmpty(string)) {
            int indexOf = string.indexOf("://oauth?");
            if (indexOf >= 0) {
                string = string.substring(indexOf + 1);
            }
            try {
                a(R.urlToBundle(string).getString(XiaomiOAuthConstants.EXTRA_CODE_2), authorizeListener);
            } catch (Throwable th) {
                d.a().d(th);
                if (authorizeListener != null) {
                    authorizeListener.onError(th);
                }
            }
        } else if (authorizeListener != null) {
            authorizeListener.onError(null);
        }
    }

    public void a(final PlatformActionListener platformActionListener) {
        new Thread(this) {
            final /* synthetic */ g b;

            public void run() {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new KVPair("access_token", this.b.d.getDb().getToken()));
                arrayList.add(new KVPair("openid", this.b.d.getDb().get("openid")));
                String a = this.b.c.a("https://api.weixin.qq.com/sns/userinfo", arrayList, "/sns/userinfo", this.b.e);
                if (!TextUtils.isEmpty(a)) {
                    d.a().d("getUserInfo ==>>" + a, new Object[0]);
                    HashMap fromJson = new Hashon().fromJson(a);
                    if (!fromJson.containsKey("errcode") || ((Integer) fromJson.get("errcode")).intValue() == 0) {
                        String valueOf;
                        String valueOf2;
                        int parseInt;
                        try {
                            valueOf = String.valueOf(fromJson.get("openid"));
                            valueOf2 = String.valueOf(fromJson.get(RContact.COL_NICKNAME));
                            parseInt = R.parseInt(String.valueOf(fromJson.get("sex")));
                        } catch (Throwable th) {
                            d.a().d(th);
                            return;
                        }
                        String valueOf3 = String.valueOf(fromJson.get("province"));
                        String valueOf4 = String.valueOf(fromJson.get("city"));
                        String valueOf5 = String.valueOf(fromJson.get("country"));
                        String valueOf6 = String.valueOf(fromJson.get("headimgurl"));
                        String valueOf7 = String.valueOf(fromJson.get(GameAppOperation.GAME_UNION_ID));
                        this.b.d.getDb().put(RContact.COL_NICKNAME, valueOf2);
                        if (parseInt == 1) {
                            this.b.d.getDb().put("gender", "0");
                        } else if (parseInt == 2) {
                            this.b.d.getDb().put("gender", "1");
                        } else {
                            this.b.d.getDb().put("gender", "2");
                        }
                        this.b.d.getDb().putUserId(valueOf);
                        this.b.d.getDb().put("icon", valueOf6);
                        this.b.d.getDb().put("province", valueOf3);
                        this.b.d.getDb().put("city", valueOf4);
                        this.b.d.getDb().put("country", valueOf5);
                        this.b.d.getDb().put("openid", valueOf);
                        this.b.d.getDb().put(GameAppOperation.GAME_UNION_ID, valueOf7);
                        platformActionListener.onComplete(this.b.d, 8, fromJson);
                    } else if (platformActionListener != null) {
                        platformActionListener.onError(this.b.d, 8, new Throwable(new Hashon().fromHashMap(fromJson)));
                    }
                } else if (platformActionListener != null) {
                    platformActionListener.onError(this.b.d, 8, new Throwable());
                }
            }
        }.start();
    }

    public void a(final String str, final AuthorizeListener authorizeListener) {
        d.a().d("getAuthorizeToken ==>> " + str, new Object[0]);
        new Thread(this) {
            final /* synthetic */ g c;

            public void run() {
                try {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new KVPair("appid", this.c.a));
                    arrayList.add(new KVPair(OAuth.SECRET, this.c.b));
                    arrayList.add(new KVPair(XiaomiOAuthConstants.EXTRA_CODE_2, str));
                    arrayList.add(new KVPair("grant_type", "authorization_code"));
                    String a = this.c.c.a("https://api.weixin.qq.com/sns/oauth2/access_token", arrayList, "/sns/oauth2/access_token", this.c.e);
                    if (TextUtils.isEmpty(a)) {
                        authorizeListener.onError(new Throwable("Authorize token is empty"));
                    } else if (!a.contains("errcode")) {
                        this.c.a(a);
                        authorizeListener.onComplete(null);
                    } else if (authorizeListener != null) {
                        authorizeListener.onError(new Throwable(a));
                    }
                } catch (Throwable th) {
                    d.a().d(th);
                }
            }
        }.start();
    }

    public void a(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public boolean a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new KVPair("appid", this.a));
        arrayList.add(new KVPair("refresh_token", this.d.getDb().get("refresh_token")));
        arrayList.add(new KVPair("grant_type", "refresh_token"));
        try {
            String a = this.c.a("https://api.weixin.qq.com/sns/oauth2/refresh_token", arrayList, "/sns/oauth2/refresh_token", this.e);
            if (TextUtils.isEmpty(a) || a.contains("errcode")) {
                return false;
            }
            a(a);
            return true;
        } catch (Throwable th) {
            d.a().d(th);
            return false;
        }
    }
}
