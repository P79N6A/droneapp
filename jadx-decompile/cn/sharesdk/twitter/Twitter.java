package cn.sharesdk.twitter;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import cn.sharesdk.framework.b.b.f.a;
import cn.sharesdk.framework.utils.d;
import com.mob.tools.utils.BitmapHelper;
import com.mob.tools.utils.Hashon;
import com.mob.tools.utils.R;
import com.tencent.mm.sdk.contact.RContact;
import com.xiaomi.account.openauth.AuthorizeActivityBase;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Twitter extends Platform {
    public static final String NAME = Twitter.class.getSimpleName();
    private String a;
    private String b;
    private String c;

    public static class ShareParams extends cn.sharesdk.framework.Platform.ShareParams {
    }

    public Twitter(Context context) {
        super(context);
    }

    protected boolean checkAuthorize(int i, Object obj) {
        if (isAuthValid()) {
            b a = b.a((Platform) this);
            a.a(this.a, this.b, this.c);
            String token = this.db.getToken();
            String tokenSecret = this.db.getTokenSecret();
            if (!(token == null || tokenSecret == null)) {
                a.a(token, tokenSecret);
                return true;
            }
        }
        innerAuthorize(i, obj);
        return false;
    }

    protected void doAuthorize(String[] strArr) {
        final b a = b.a((Platform) this);
        a.a(this.a, this.b, this.c);
        a.a(new AuthorizeListener(this) {
            final /* synthetic */ Twitter b;

            public void onCancel() {
                if (this.b.listener != null) {
                    this.b.listener.onCancel(this.b, 1);
                }
            }

            public void onComplete(Bundle bundle) {
                String string = bundle.getString("oauth_token");
                String string2 = bundle.getString("oauth_token_secret");
                String string3 = bundle.getString("user_id");
                String string4 = bundle.getString("screen_name");
                this.b.db.putToken(string);
                this.b.db.putTokenSecret(string2);
                this.b.db.putUserId(string3);
                this.b.db.put(RContact.COL_NICKNAME, string4);
                a.a(string, string2);
                this.b.afterRegister(1, null);
            }

            public void onError(Throwable th) {
                if (this.b.listener != null) {
                    this.b.listener.onError(this.b, 1, th);
                }
            }
        });
    }

    protected void doCustomerProtocol(String str, String str2, int i, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2) {
        try {
            HashMap a = b.a((Platform) this).a(str, str2, hashMap, hashMap2);
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

    protected void doShare(cn.sharesdk.framework.Platform.ShareParams shareParams) {
        b a = b.a((Platform) this);
        HashMap hashMap = null;
        String shortLintk = getShortLintk(shareParams.getText(), false);
        try {
            String[] imageArray = shareParams.getImageArray();
            String imagePath = shareParams.getImagePath();
            Object imageUrl = shareParams.getImageUrl();
            if (imageArray != null && imageArray.length > 0) {
                hashMap = a.a(shortLintk, imageArray);
            } else if (!TextUtils.isEmpty(imagePath) && new File(imagePath).exists()) {
                hashMap = a.e(shortLintk, imagePath);
            } else if (TextUtils.isEmpty(imageUrl)) {
                hashMap = a.c(shortLintk);
            } else {
                String downloadBitmap = BitmapHelper.downloadBitmap(getContext(), imageUrl);
                if (new File(downloadBitmap).exists()) {
                    hashMap = a.e(shortLintk, downloadBitmap);
                }
            }
            if (hashMap == null) {
                if (this.listener != null) {
                    this.listener.onError(this, 8, new Throwable("response is null"));
                }
            } else if (!hashMap.containsKey("error_code") && !hashMap.containsKey("error")) {
                hashMap.put("ShareParams", shareParams);
                if (this.listener != null) {
                    this.listener.onComplete(this, 9, hashMap);
                }
            } else if (this.listener != null) {
                this.listener.onError(this, 8, new Throwable(new Hashon().fromHashMap(hashMap)));
            }
        } catch (Throwable th) {
            if (this.listener != null) {
                this.listener.onError(this, 9, th);
            }
        }
    }

    protected HashMap<String, Object> filterFriendshipInfo(int i, HashMap<String, Object> hashMap) {
        HashMap<String, Object> hashMap2 = new HashMap();
        switch (i) {
            case 2:
                hashMap2.put("type", "FOLLOWING");
                break;
            case 10:
                hashMap2.put("type", "FRIENDS");
                break;
            case 11:
                hashMap2.put("type", "FOLLOWERS");
                break;
            default:
                return null;
        }
        hashMap2.put("snsplat", Integer.valueOf(getPlatformId()));
        hashMap2.put("snsuid", this.db.getUserId());
        CharSequence valueOf = hashMap.containsKey("next_cursor") ? String.valueOf(hashMap.get("next_cursor")) : null;
        Object obj = hashMap.get("users");
        if (obj == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        if (arrayList2.size() <= 0) {
            return null;
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            HashMap hashMap3 = (HashMap) it.next();
            if (hashMap3 != null) {
                HashMap hashMap4 = new HashMap();
                hashMap4.put("snsuid", String.valueOf(hashMap3.get("id")));
                hashMap4.put(RContact.COL_NICKNAME, String.valueOf(hashMap3.get("screen_name")));
                hashMap4.put("icon", String.valueOf(hashMap3.get("profile_image_url")));
                hashMap4.put("gender", "2");
                hashMap4.put("resume", String.valueOf(hashMap3.get("description")));
                hashMap4.put("secretType", "true".equals(String.valueOf(hashMap3.get("verified"))) ? "1" : "0");
                hashMap4.put("followerCount", String.valueOf(hashMap3.get("followers_count")));
                hashMap4.put("favouriteCount", String.valueOf(hashMap3.get("friends_count")));
                hashMap4.put("shareCount", String.valueOf(hashMap3.get("statuses_count")));
                hashMap4.put("snsregat", String.valueOf(R.dateToLong(String.valueOf(hashMap3.get("created_at")))));
                hashMap4.put("snsUserUrl", "https://twitter.com/" + hashMap3.get("screen_name"));
                arrayList.add(hashMap4);
            }
        }
        if (arrayList == null || arrayList.size() <= 0) {
            return null;
        }
        obj = valueOf + "_false";
        if (TextUtils.isEmpty(valueOf) || "0".equals(valueOf)) {
            obj = "0_true";
        }
        hashMap2.put("nextCursor", obj);
        hashMap2.put("list", arrayList);
        return hashMap2;
    }

    protected a filterShareContent(cn.sharesdk.framework.Platform.ShareParams shareParams, HashMap<String, Object> hashMap) {
        a aVar = new a();
        aVar.b = shareParams.getText();
        if (hashMap != null) {
            HashMap hashMap2 = (HashMap) hashMap.get("entities");
            if (hashMap2 != null) {
                ArrayList arrayList = (ArrayList) hashMap2.get("media");
                if (!(arrayList == null || arrayList.size() <= 0 || ((HashMap) arrayList.get(0)) == null)) {
                    aVar.d.add(String.valueOf(hashMap.get("media_url")));
                }
            }
            aVar.a = String.valueOf(hashMap.get("id"));
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
        HashMap<String, Object> hashMap = null;
        Object userId = TextUtils.isEmpty(null) ? this.db.getUserId() : null;
        if (TextUtils.isEmpty(userId)) {
            userId = this.db.getUserName();
        }
        if (!TextUtils.isEmpty(userId)) {
            b a = b.a((Platform) this);
            try {
                if (TextUtils.isEmpty(str)) {
                    str = "0";
                }
                HashMap c = a.c(userId, str);
                if (!(c == null || c.size() <= 0 || c.containsKey("error_code") || c.containsKey("error"))) {
                    hashMap = filterFriendshipInfo(11, c);
                }
            } catch (Throwable th) {
                d.a().d(th);
            }
        }
        return hashMap;
    }

    protected HashMap<String, Object> getFollowings(int i, int i2, String str) {
        HashMap<String, Object> hashMap = null;
        Object userId = TextUtils.isEmpty(null) ? this.db.getUserId() : null;
        if (TextUtils.isEmpty(userId)) {
            userId = this.db.getUserName();
        }
        if (!TextUtils.isEmpty(userId)) {
            b a = b.a((Platform) this);
            try {
                if (TextUtils.isEmpty(str)) {
                    str = "0";
                }
                HashMap b = a.b(userId, str);
                if (!(b == null || b.size() <= 0 || b.containsKey("error_code") || b.containsKey("error"))) {
                    hashMap = filterFriendshipInfo(2, b);
                }
            } catch (Throwable th) {
                d.a().d(th);
            }
        }
        return hashMap;
    }

    protected void getFriendList(int i, int i2, String str) {
        Object obj = null;
        if (TextUtils.isEmpty(null)) {
            obj = this.db.getUserId();
        }
        if (TextUtils.isEmpty(obj)) {
            obj = this.db.getUserName();
        }
        if (TextUtils.isEmpty(obj) && this.listener != null) {
            this.listener.onError(this, 2, new Throwable("The account do not authorize!"));
        }
        b a = b.a((Platform) this);
        try {
            if (TextUtils.isEmpty(str)) {
                str = "0";
            }
            HashMap b = a.b(obj, str);
            if (b == null || b.size() <= 0) {
                if (this.listener != null) {
                    this.listener.onError(this, 2, new Throwable("response is null"));
                }
            } else if (b.containsKey("error_code") || b.containsKey("error")) {
                if (this.listener != null) {
                    this.listener.onError(this, 2, new Throwable(new Hashon().fromHashMap(b)));
                }
            } else if (this.listener != null) {
                this.listener.onComplete(this, 2, b);
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
        return 11;
    }

    public int getVersion() {
        return 2;
    }

    public boolean hasShareCallback() {
        return true;
    }

    protected void initDevInfo(String str) {
        this.a = getDevinfo("ConsumerKey");
        this.b = getDevinfo("ConsumerSecret");
        this.c = getDevinfo("CallbackUrl");
    }

    protected void setNetworkDevinfo() {
        this.a = getNetworkDevinfo("consumer_key", "ConsumerKey");
        this.b = getNetworkDevinfo("consumer_secret", "ConsumerSecret");
        this.c = getNetworkDevinfo(AuthorizeActivityBase.KEY_REDIRECT_URI, "CallbackUrl");
    }

    protected void timeline(int i, int i2, String str) {
        if (this.listener != null) {
            this.listener.onCancel(this, 7);
        }
    }

    protected void userInfor(String str) {
        try {
            HashMap b = b.a((Platform) this).b(str);
            if (b == null || b.size() <= 0) {
                if (this.listener != null) {
                    this.listener.onError(this, 8, new Throwable("response is null"));
                }
            } else if (!b.containsKey("error_code") && !b.containsKey("error")) {
                if (str == null) {
                    this.db.put(RContact.COL_NICKNAME, String.valueOf(b.get("screen_name")));
                    this.db.put("icon", String.valueOf(b.get("profile_image_url")));
                    this.db.put("gender", "2");
                    this.db.put("resume", String.valueOf(b.get("description")));
                    this.db.put("secretType", "true".equals(String.valueOf(b.get("verified"))) ? "1" : "0");
                    this.db.put("followerCount", String.valueOf(b.get("followers_count")));
                    this.db.put("favouriteCount", String.valueOf(b.get("friends_count")));
                    this.db.put("shareCount", String.valueOf(b.get("statuses_count")));
                    this.db.put("snsregat", String.valueOf(R.dateToLong(String.valueOf(b.get("created_at")))));
                    this.db.put("snsUserUrl", "https://twitter.com/" + b.get("screen_name"));
                }
                if (this.listener != null) {
                    this.listener.onComplete(this, 8, b);
                }
            } else if (this.listener != null) {
                this.listener.onError(this, 8, new Throwable(new Hashon().fromHashMap(b)));
            }
        } catch (Throwable th) {
            if (this.listener != null) {
                this.listener.onError(this, 8, th);
            }
        }
    }
}
