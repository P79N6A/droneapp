package com.xiaomi.account.openauth;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.xiaomi.account.IXiaomiAuthResponse;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import org.a.a.f.c.l;

public class XiaomiOAuthorize {
    private static final String ACCOUNT_TYPE = "com.xiaomi";
    private static final Class<? extends AuthorizeActivityBase> DEFAULT_AUTHORIZE_ACTIVITY_CLASS = AuthorizeActivity.class;
    private static final String TAG = "XiaomiOAuthorize";
    private static final String TYPE_CODE = "code";
    private static final String TYPE_TOKEN = "token";
    private Long mAppId = null;
    private Class<? extends AuthorizeActivityBase> mAuthorizeActivityClazz = DEFAULT_AUTHORIZE_ACTIVITY_CLASS;
    private boolean mKeepCookies = false;
    private boolean mNotUseMiui = false;
    private String mRedirectUrl = null;
    private int[] mScopes = null;
    private Boolean mSkipConfirm = null;
    private String mState = null;

    private static Bundle getAccessTokenFromMiui(Context context, Account account, Bundle bundle) {
        return (Bundle) new 4(context, account, bundle).start().get();
    }

    private static Bundle getAccessTokenFromMiuiInResponseWay(Context context, Bundle bundle, IXiaomiAuthResponse iXiaomiAuthResponse) {
        return (Bundle) new 3(context, null, bundle, iXiaomiAuthResponse).start().get();
    }

    private Account getXiaomiAccount(Context context) {
        Account[] accountsByType = AccountManager.get(context).getAccountsByType(ACCOUNT_TYPE);
        return accountsByType.length == 0 ? null : accountsByType[0];
    }

    private static boolean isMiui(Context context) {
        try {
            return ((Boolean) new 5(context, null, null).start().get()).booleanValue();
        } catch (InterruptedException e) {
            return false;
        } catch (ExecutionException e2) {
            return false;
        }
    }

    private static String makeScopeString(int[] iArr) {
        int i = 0;
        if (iArr == null || iArr.length <= 0) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int length = iArr.length;
        int i2 = 0;
        while (i < length) {
            int i3 = iArr[i];
            int i4 = i2 + 1;
            if (i2 > 0) {
                stringBuilder.append(l.c);
            }
            stringBuilder.append(i3);
            i++;
            i2 = i4;
        }
        return stringBuilder.toString();
    }

    private XiaomiOAuthFutureImpl<XiaomiOAuthResults> oauth(Activity activity, String str) {
        if (activity == null || activity.isFinishing()) {
            throw new IllegalArgumentException("activity should not be null and should be running");
        } else if (this.mAppId == null || this.mAppId.longValue() <= 0) {
            throw new IllegalArgumentException("client id is error!!!");
        } else if (TextUtils.isEmpty(this.mRedirectUrl)) {
            throw new IllegalArgumentException("redirect url is empty!!!");
        } else if (!TextUtils.isEmpty(str)) {
            return new 2(this, activity, str).start();
        } else {
            throw new IllegalArgumentException("responseType is empty!!!");
        }
    }

    @Deprecated
    private static int[] scopeStringToIntArray(String str) {
        int i;
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            for (String valueOf : str.split(" ")) {
                try {
                    arrayList.add(Integer.valueOf(valueOf));
                } catch (NumberFormatException e) {
                }
            }
        }
        int[] iArr = new int[arrayList.size()];
        for (i = 0; i < iArr.length; i++) {
            iArr[i] = ((Integer) arrayList.get(i)).intValue();
        }
        return iArr;
    }

    @Deprecated
    public static void startGetAccessToken(Activity activity, long j, String str, Bundle bundle, int i) {
        Log.w(TAG, "you are calling startGetAccessToken(). Is still works but it is deprecated. Instead please use \n                XiaomiOAuthFuture<XiaomiOAuthResults> future = new XiaomiOAuthorize()\n                        .setAppId(appId)\n                        .setRedirectUrl(redirectUri)\n                        .setScope(scope)\n                        .setAllowSwitchAccount(true)\n                        .startGetAccessToken(acitivity);\n                XiaomiOAuthResults results = future.getResult();//call on background thread.\nIt provides better user experience! Checkout the Demo codes!");
        startGetOAuthorize(activity, j, str, "token", bundle, i);
    }

    @Deprecated
    public static void startGetOAuthCode(Activity activity, long j, String str, Bundle bundle, int i) {
        Log.w(TAG, "you are calling startGetOAuthCode(). Is still works but it is deprecated. Instead please use \n                XiaomiOAuthFuture<XiaomiOAuthResults> future = new XiaomiOAuthorize()\n                        .setAppId(appId)\n                        .setRedirectUrl(redirectUri)\n                        .setScope(scope)\n                        .setAllowSwitchAccount(true)\n                        .startGetOAuthCode(acitivity);\n                XiaomiOAuthResults results = future.getResult();//call on background thread.\nIt provides better user experience! Checkout the Demo codes!");
        startGetOAuthorize(activity, j, str, "code", bundle, i);
    }

    @Deprecated
    private static void startGetOAuthorize(Activity activity, long j, String str, String str2, Bundle bundle, int i) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        XiaomiOAuthorize state = new XiaomiOAuthorize().setAppId(j).setRedirectUrl(str).setScope(scopeStringToIntArray(bundle.getString("extra_scope"))).setState(bundle.getString("extra_state"));
        if (bundle.containsKey("extra_skip_confirm")) {
            state.setSkipConfirm(bundle.getBoolean("extra_skip_confirm"));
        }
        new 7("code".equalsIgnoreCase(str2) ? state.startGetOAuthCode(activity) : state.startGetAccessToken(activity), str2, activity, i).execute(new Void[0]);
    }

    private boolean supportResponseWayWithMiui(Context context) {
        try {
            return ((Boolean) new 6(this, context, null, null).start().get()).booleanValue();
        } catch (InterruptedException e) {
            return false;
        } catch (ExecutionException e2) {
            return false;
        }
    }

    public XiaomiOAuthFuture<String> callOpenApi(Context context, long j, String str, String str2, String str3, String str4) {
        return new 1(this, context, str, j, str2, str3, str4).start();
    }

    public XiaomiOAuthorize setAppId(long j) {
        this.mAppId = Long.valueOf(j);
        return this;
    }

    public XiaomiOAuthorize setCustomizedAuthorizeActivityClass(Class<? extends AuthorizeActivityBase> cls) {
        this.mAuthorizeActivityClazz = cls;
        return this;
    }

    public XiaomiOAuthorize setKeepCookies(boolean z) {
        this.mKeepCookies = z;
        return this;
    }

    public XiaomiOAuthorize setNoMiui(boolean z) {
        this.mNotUseMiui = z;
        return this;
    }

    public XiaomiOAuthorize setRedirectUrl(String str) {
        this.mRedirectUrl = str;
        return this;
    }

    public XiaomiOAuthorize setScope(int[] iArr) {
        this.mScopes = iArr;
        return this;
    }

    public XiaomiOAuthorize setSkipConfirm(boolean z) {
        this.mSkipConfirm = Boolean.valueOf(z);
        return this;
    }

    public XiaomiOAuthorize setState(String str) {
        this.mState = str;
        return this;
    }

    public XiaomiOAuthFuture<XiaomiOAuthResults> startGetAccessToken(Activity activity) {
        return oauth(activity, "token");
    }

    public XiaomiOAuthFuture<XiaomiOAuthResults> startGetOAuthCode(Activity activity) {
        return oauth(activity, "code");
    }
}
