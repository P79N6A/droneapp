package cn.sharesdk.facebook;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import cn.sharesdk.framework.b.b.f.a;
import cn.sharesdk.framework.utils.d;
import com.facebook.common.util.UriUtil;
import com.fimi.soul.entity.User;
import com.google.firebase.a.a.b;
import com.mob.tools.utils.BitmapHelper;
import com.mob.tools.utils.Hashon;
import com.mob.tools.utils.R;
import com.tencent.mm.sdk.contact.RContact;
import com.tencent.open.SocialConstants;
import com.xiaomi.account.openauth.AuthorizeActivityBase;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;

public class Facebook extends Platform {
    public static final String NAME = Facebook.class.getSimpleName();
    private String a;
    private String b;

    public static class ShareParams extends cn.sharesdk.framework.Platform.ShareParams {
    }

    public Facebook(Context context) {
        super(context);
    }

    protected boolean checkAuthorize(int i, Object obj) {
        if (isAuthValid()) {
            d a = d.a((Platform) this);
            a.a(this.a);
            String token = this.db.getToken();
            String valueOf = String.valueOf(this.db.getExpiresIn());
            if (!(token == null || valueOf == null)) {
                a.a(token, valueOf);
                if (a.a()) {
                    return true;
                }
            }
        } else if ((obj instanceof cn.sharesdk.framework.Platform.ShareParams) && ((cn.sharesdk.framework.Platform.ShareParams) obj).getShareType() == 4) {
            return true;
        }
        innerAuthorize(i, obj);
        return false;
    }

    protected void doAuthorize(String[] strArr) {
        final d a = d.a((Platform) this);
        a.a(this.a);
        a.d(this.b);
        a.a(strArr);
        a.a(new AuthorizeListener(this) {
            final /* synthetic */ Facebook b;

            public void onCancel() {
                if (this.b.listener != null) {
                    this.b.listener.onCancel(this.b, 1);
                }
            }

            public void onComplete(Bundle bundle) {
                String string = bundle.getString("oauth_token");
                int i = bundle.getInt("oauth_token_expires");
                if (i == 0) {
                    try {
                        i = R.parseInt(String.valueOf(bundle.get("expires_in")));
                    } catch (Throwable th) {
                        d.a().d(th);
                        i = 0;
                    }
                }
                if (TextUtils.isEmpty(string)) {
                    string = bundle.getString("access_token");
                }
                this.b.db.putToken(string);
                this.b.db.putExpiresIn((long) i);
                a.a(string, String.valueOf(i));
                this.b.afterRegister(1, null);
            }

            public void onError(Throwable th) {
                if (this.b.listener != null) {
                    this.b.listener.onError(this.b, 1, th);
                }
            }
        }, isSSODisable());
    }

    protected void doCustomerProtocol(String str, String str2, int i, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2) {
        try {
            HashMap a = d.a((Platform) this).a(str, str2, hashMap, hashMap2);
            if (a == null || a.size() <= 0) {
                if (this.listener != null) {
                    this.listener.onError(this, i, new Throwable("response is null"));
                }
            } else if (a.containsKey("error_code") || a.containsKey("error")) {
                if (this.listener != null) {
                    this.listener.onError(this, i, new Throwable(new Hashon().fromHashMap(a)));
                }
            } else if (this.listener != null) {
                this.listener.onComplete(this, i, a);
            }
        } catch (Throwable th) {
            if (this.listener != null) {
                this.listener.onError(this, i, th);
            }
        }
    }

    protected void doShare(final cn.sharesdk.framework.Platform.ShareParams shareParams) {
        d a = d.a((Platform) this);
        a.a(this.a);
        try {
            String shortLintk = getShortLintk(shareParams.getText(), false);
            String imagePath = shareParams.getImagePath();
            Object imageUrl = shareParams.getImageUrl();
            CharSequence titleUrl = shareParams.getTitleUrl();
            CharSequence url = shareParams.getUrl();
            if (shareParams.getShareType() != 4 || (TextUtils.isEmpty(titleUrl) && TextUtils.isEmpty(url))) {
                HashMap b;
                if (!TextUtils.isEmpty(imagePath) && new File(imagePath).exists()) {
                    b = a.b(shortLintk, imagePath);
                } else if (TextUtils.isEmpty(imageUrl)) {
                    b = a.b(shortLintk);
                } else {
                    File file = new File(BitmapHelper.downloadBitmap(this.context, imageUrl));
                    b = file.exists() ? a.b(shortLintk, file.getAbsolutePath()) : a.b(shortLintk);
                }
                if (b == null || b.size() <= 0) {
                    if (this.listener != null) {
                        this.listener.onError(this, 9, new Throwable("response is null"));
                        return;
                    }
                    return;
                } else if (b.containsKey("error_code") || b.containsKey("error")) {
                    if (this.listener != null) {
                        this.listener.onError(this, 9, new Throwable(new Hashon().fromHashMap(b)));
                        return;
                    }
                    return;
                } else if (this.listener != null) {
                    b.put("ShareParams", shareParams);
                    this.listener.onComplete(this, 9, b);
                    return;
                } else {
                    return;
                }
            }
            if (TextUtils.isEmpty(imageUrl) && !TextUtils.isEmpty(imagePath) && new File(imagePath).exists()) {
                shareParams.setImageUrl(uploadImageToFileServer(imagePath));
            }
            a.a(shareParams, new PlatformActionListener(this) {
                final /* synthetic */ Facebook b;

                public void onCancel(Platform platform, int i) {
                    if (this.b.listener != null) {
                        this.b.listener.onCancel(this.b, 9);
                    }
                }

                public void onComplete(Platform platform, int i, HashMap<String, Object> hashMap) {
                    if (this.b.listener != null) {
                        hashMap.put("ShareParams", shareParams);
                        this.b.listener.onComplete(this.b, 9, hashMap);
                    }
                }

                public void onError(Platform platform, int i, Throwable th) {
                    if (this.b.listener != null) {
                        this.b.listener.onError(this.b, 9, th);
                    }
                }
            });
        } catch (Throwable th) {
            if (this.listener != null) {
                this.listener.onError(this, 9, th);
            }
        }
    }

    protected HashMap<String, Object> filterFriendshipInfo(int i, HashMap<String, Object> hashMap) {
        Object obj = hashMap.get(UriUtil.DATA_SCHEME);
        if (obj == null) {
            return null;
        }
        HashMap<String, Object> hashMap2 = new HashMap();
        hashMap2.put("type", "FOLLOWING");
        hashMap2.put("snsplat", Integer.valueOf(getPlatformId()));
        hashMap2.put("snsuid", this.db.getUserId());
        int intValue = ((Integer) hashMap.get("current_cursor")).intValue();
        int intValue2 = ((Integer) hashMap.get("current_limit")).intValue();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        if (arrayList2.size() <= 0) {
            return null;
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            HashMap hashMap3 = (HashMap) it.next();
            if (hashMap3 != null) {
                String[] split;
                HashMap hashMap4 = new HashMap();
                hashMap4.put("snsuid", String.valueOf(hashMap3.get("id")));
                hashMap4.put(RContact.COL_NICKNAME, String.valueOf(hashMap3.get(User.FN_NAME)));
                hashMap4.put("gender", "male".equals(String.valueOf(hashMap3.get("gender"))) ? "0" : "1");
                hashMap4.put("secretType", "true".equals(String.valueOf(hashMap3.get("verified"))) ? "1" : "0");
                hashMap4.put("snsUserUrl", String.valueOf(hashMap3.get("link")));
                hashMap4.put("resume", String.valueOf(hashMap3.get("link")));
                HashMap hashMap5 = hashMap3.containsKey(SocialConstants.PARAM_AVATAR_URI) ? (HashMap) hashMap3.get(SocialConstants.PARAM_AVATAR_URI) : null;
                if (hashMap5 != null) {
                    hashMap5 = hashMap5.containsKey(UriUtil.DATA_SCHEME) ? (HashMap) hashMap5.get(UriUtil.DATA_SCHEME) : null;
                    if (hashMap5 != null) {
                        hashMap4.put("icon", String.valueOf(hashMap5.get("url")));
                    }
                }
                try {
                    if (hashMap3.containsKey("birthday")) {
                        split = String.valueOf(hashMap3.get("birthday")).split("/");
                        Calendar instance = Calendar.getInstance();
                        instance.set(1, R.parseInt(split[2]));
                        instance.set(2, R.parseInt(split[0]) - 1);
                        instance.set(5, R.parseInt(split[1]));
                        hashMap4.put("birthday", String.valueOf(instance.getTimeInMillis()));
                    }
                } catch (Throwable th) {
                    d.a().d(th);
                }
                ArrayList arrayList3 = hashMap3.containsKey("education") ? (ArrayList) hashMap3.get("education") : null;
                if (arrayList3 != null) {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        hashMap5 = (HashMap) it2.next();
                        HashMap hashMap6 = new HashMap();
                        hashMap6.put("school_type", Integer.valueOf(0));
                        HashMap hashMap7 = (HashMap) hashMap5.get("school");
                        if (hashMap7 != null) {
                            hashMap6.put("school", String.valueOf(hashMap7.get(User.FN_NAME)));
                        }
                        try {
                            hashMap6.put("year", Integer.valueOf(R.parseInt(String.valueOf(((HashMap) hashMap5.get("year")).get(User.FN_NAME)))));
                        } catch (Throwable th2) {
                            d.a().d(th2);
                        }
                        hashMap6.put("background", Integer.valueOf(0));
                        arrayList4.add(hashMap6);
                    }
                    hashMap5 = new HashMap();
                    hashMap5.put("list", arrayList4);
                    String fromHashMap = new Hashon().fromHashMap(hashMap5);
                    hashMap4.put("educationJSONArrayStr", fromHashMap.substring(8, fromHashMap.length() - 1));
                }
                arrayList2 = hashMap3.containsKey("work") ? (ArrayList) hashMap3.get("work") : null;
                if (arrayList2 != null) {
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        hashMap3 = (HashMap) it3.next();
                        HashMap hashMap8 = new HashMap();
                        hashMap5 = (HashMap) hashMap3.get("employer");
                        if (hashMap5 != null) {
                            hashMap8.put("company", String.valueOf(hashMap5.get(User.FN_NAME)));
                        }
                        hashMap5 = (HashMap) hashMap3.get("position");
                        if (hashMap5 != null) {
                            hashMap8.put("position", String.valueOf(hashMap5.get(User.FN_NAME)));
                        }
                        try {
                            split = String.valueOf(hashMap3.get(b.h)).split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                            hashMap8.put(b.h, Integer.valueOf(R.parseInt(split[1]) + (R.parseInt(split[0]) * 100)));
                        } catch (Throwable th22) {
                            d.a().d(th22);
                        }
                        try {
                            String[] split2 = String.valueOf(hashMap3.get(b.i)).split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                            hashMap8.put(b.i, Integer.valueOf(R.parseInt(split2[1]) + (R.parseInt(split2[0]) * 100)));
                        } catch (Throwable th3) {
                            d.a().d(th3);
                            hashMap8.put(b.i, Integer.valueOf(0));
                        }
                        arrayList5.add(hashMap8);
                    }
                    hashMap3 = new HashMap();
                    hashMap3.put("list", arrayList5);
                    String fromHashMap2 = new Hashon().fromHashMap(hashMap3);
                    hashMap4.put("workJSONArrayStr", fromHashMap2.substring(8, fromHashMap2.length() - 1));
                }
                arrayList.add(hashMap4);
            }
        }
        if (arrayList == null || arrayList.size() <= 0) {
            return null;
        }
        fromHashMap2 = "_false";
        if (intValue2 >= arrayList.size()) {
            fromHashMap2 = "_true";
        }
        hashMap2.put("nextCursor", (arrayList.size() + intValue) + fromHashMap2);
        hashMap2.put("list", arrayList);
        return hashMap2;
    }

    protected a filterShareContent(cn.sharesdk.framework.Platform.ShareParams shareParams, HashMap<String, Object> hashMap) {
        a aVar = new a();
        aVar.b = shareParams.getText();
        if (hashMap != null) {
            Object titleUrl;
            if (hashMap != null && hashMap.containsKey("source")) {
                aVar.d.add(String.valueOf(hashMap.get("source")));
            } else if (4 == shareParams.getShareType()) {
                aVar.d.add(shareParams.getImageUrl());
                titleUrl = shareParams.getTitleUrl();
                if (TextUtils.isEmpty(titleUrl)) {
                    titleUrl = shareParams.getUrl();
                }
                aVar.c.add(titleUrl);
            }
            titleUrl = hashMap.get("post_id");
            aVar.a = titleUrl == null ? null : String.valueOf(titleUrl);
            aVar.g = hashMap;
        }
        return aVar;
    }

    protected void follow(String str) {
        if (this.listener != null) {
            this.listener.onCancel(this, 6);
        }
    }

    protected HashMap<String, Object> getBilaterals(int i, int i2, String str) {
        return null;
    }

    protected HashMap<String, Object> getFollowers(int i, int i2, String str) {
        return null;
    }

    protected HashMap<String, Object> getFollowings(int i, int i2, String str) {
        HashMap<String, Object> hashMap = null;
        try {
            HashMap a = d.a((Platform) this).a(i, i2, str);
            if (!(a == null || a.size() <= 0 || a.containsKey("error_code") || a.containsKey("error"))) {
                a.put("current_limit", Integer.valueOf(i));
                a.put("current_cursor", Integer.valueOf(i2));
                hashMap = filterFriendshipInfo(2, a);
            }
        } catch (Throwable th) {
            d.a().d(th);
        }
        return hashMap;
    }

    protected void getFriendList(int i, int i2, String str) {
        try {
            HashMap a = d.a((Platform) this).a(i, i2 * i, str);
            if (a == null || a.size() <= 0) {
                if (this.listener != null) {
                    this.listener.onError(this, 2, new Throwable("response is null"));
                }
            } else if (a.containsKey("error_code") || a.containsKey("error")) {
                if (this.listener != null) {
                    this.listener.onError(this, 2, new Throwable(new Hashon().fromHashMap(a)));
                }
            } else if (this.listener != null) {
                this.listener.onComplete(this, 2, a);
            }
        } catch (Throwable th) {
            if (this.listener != null) {
                this.listener.onError(this, 2, th);
            }
        }
    }

    public String getName() {
        return NAME;
    }

    public int getPlatformId() {
        return 10;
    }

    public int getVersion() {
        return 2;
    }

    public boolean hasShareCallback() {
        return true;
    }

    protected void initDevInfo(String str) {
        this.a = getDevinfo("ConsumerKey");
        this.b = getDevinfo("RedirectUrl");
    }

    public boolean isClientValid() {
        d a = d.a((Platform) this);
        a.a(this.a);
        return a.b();
    }

    protected void setNetworkDevinfo() {
        this.a = getNetworkDevinfo("api_key", "ConsumerKey");
        this.b = getNetworkDevinfo(AuthorizeActivityBase.KEY_REDIRECT_URI, "RedirectUrl");
        if (TextUtils.isEmpty(this.b)) {
            this.b = "fbconnect://success";
        }
    }

    protected void timeline(int i, int i2, String str) {
        if (this.listener != null) {
            this.listener.onCancel(this, 7);
        }
    }

    protected void userInfor(String str) {
        HashMap c = d.a((Platform) this).c(str);
        if (c == null || c.size() <= 0) {
            if (this.listener != null) {
                this.listener.onError(this, 8, new Throwable("response is null"));
            }
        } else if (!c.containsKey("error_code") && !c.containsKey("error")) {
            if (str == null) {
                String[] split;
                HashMap hashMap;
                String fromHashMap;
                this.db.putUserId(String.valueOf(c.get("id")));
                this.db.put(RContact.COL_NICKNAME, String.valueOf(c.get(User.FN_NAME)));
                this.db.put("gender", "male".equals(String.valueOf(c.get("gender"))) ? "0" : "1");
                this.db.put("token_for_business", (String) c.get("token_for_business"));
                HashMap hashMap2 = c.containsKey(SocialConstants.PARAM_AVATAR_URI) ? (HashMap) c.get(SocialConstants.PARAM_AVATAR_URI) : null;
                if (hashMap2 != null) {
                    hashMap2 = (HashMap) hashMap2.get(UriUtil.DATA_SCHEME);
                    if (hashMap2 != null) {
                        this.db.put("icon", String.valueOf(hashMap2.get("url")));
                    }
                }
                try {
                    if (c.containsKey("birthday")) {
                        split = String.valueOf(c.get("birthday")).split("/");
                        Calendar instance = Calendar.getInstance();
                        instance.set(1, R.parseInt(split[2]));
                        instance.set(2, R.parseInt(split[0]) - 1);
                        instance.set(5, R.parseInt(split[1]));
                        this.db.put("birthday", String.valueOf(instance.getTimeInMillis()));
                    }
                } catch (Throwable th) {
                    if (this.listener != null) {
                        this.listener.onError(this, 8, th);
                        return;
                    }
                    return;
                }
                this.db.put("secretType", "true".equals(String.valueOf(c.get("verified"))) ? "1" : "0");
                this.db.put("snsUserUrl", String.valueOf(c.get("link")));
                this.db.put("resume", String.valueOf(c.get("link")));
                ArrayList arrayList = c.containsKey("education") ? (ArrayList) c.get("education") : null;
                if (arrayList != null) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        hashMap2 = (HashMap) it.next();
                        HashMap hashMap3 = new HashMap();
                        hashMap3.put("school_type", Integer.valueOf(0));
                        hashMap = hashMap2.containsKey("school") ? (HashMap) hashMap2.get("school") : null;
                        if (hashMap != null) {
                            hashMap3.put("school", String.valueOf(hashMap.get(User.FN_NAME)));
                        }
                        try {
                            hashMap3.put("year", Integer.valueOf(R.parseInt(String.valueOf((hashMap2.containsKey("year") ? (HashMap) hashMap2.get("year") : null).get(User.FN_NAME)))));
                        } catch (Throwable th2) {
                            d.a().d(th2);
                        }
                        hashMap3.put("background", Integer.valueOf(0));
                        arrayList2.add(hashMap3);
                    }
                    hashMap2 = new HashMap();
                    hashMap2.put("list", arrayList2);
                    fromHashMap = new Hashon().fromHashMap(hashMap2);
                    this.db.put("educationJSONArrayStr", fromHashMap.substring(8, fromHashMap.length() - 1));
                }
                arrayList = c.containsKey("work") ? (ArrayList) c.get("work") : null;
                if (arrayList != null) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        hashMap2 = (HashMap) it2.next();
                        HashMap hashMap4 = new HashMap();
                        hashMap = (HashMap) hashMap2.get("employer");
                        if (hashMap != null) {
                            hashMap4.put("company", String.valueOf(hashMap.get(User.FN_NAME)));
                        }
                        hashMap = (HashMap) hashMap2.get("position");
                        if (hashMap != null) {
                            hashMap4.put("position", String.valueOf(hashMap.get(User.FN_NAME)));
                        }
                        try {
                            String[] split2 = String.valueOf(hashMap2.get(b.h)).split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                            hashMap4.put(b.h, Integer.valueOf(R.parseInt(split2[1]) + (R.parseInt(split2[0]) * 100)));
                        } catch (Throwable th3) {
                            d.a().d(th3);
                        }
                        try {
                            split = String.valueOf(hashMap2.get(b.i)).split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                            hashMap4.put(b.i, Integer.valueOf(R.parseInt(split[1]) + (R.parseInt(split[0]) * 100)));
                        } catch (Throwable th22) {
                            d.a().d(th22);
                            hashMap4.put(b.i, Integer.valueOf(0));
                        }
                        arrayList3.add(hashMap4);
                    }
                    hashMap2 = new HashMap();
                    hashMap2.put("list", arrayList3);
                    fromHashMap = new Hashon().fromHashMap(hashMap2);
                    this.db.put("workJSONArrayStr", fromHashMap.substring(8, fromHashMap.length() - 1));
                }
            }
            if (this.listener != null) {
                this.listener.onComplete(this, 8, c);
            }
        } else if (this.listener != null) {
            this.listener.onError(this, 8, new Throwable(new Hashon().fromHashMap(c)));
        }
    }
}
