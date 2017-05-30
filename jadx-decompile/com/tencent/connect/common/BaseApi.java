package com.tencent.connect.common;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.fimi.soul.media.player.FimiMediaMeta;
import com.tencent.connect.auth.QQAuth;
import com.tencent.connect.auth.QQToken;
import com.tencent.open.TDialog;
import com.tencent.open.a.f;
import com.tencent.open.utils.Global;
import com.tencent.open.utils.ServerSetting;
import com.tencent.open.utils.SystemUtils;
import com.tencent.open.utils.Util;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class BaseApi {
    protected static final String ACTION_CHECK_TOKEN = "action_check_token";
    protected static final String ACTIVITY_AGENT = "com.tencent.open.agent.AgentActivity";
    protected static final String ACTIVITY_ENCRY_TOKEN = "com.tencent.open.agent.EncryTokenActivity";
    protected static final String DEFAULT_PF = "openmobile_android";
    private static final String KEY_REQUEST_CODE = "key_request_code";
    private static final int MSG_COMPLETE = 0;
    protected static final String PARAM_ENCRY_EOKEN = "encry_token";
    protected static final String PLATFORM = "desktop_m_qq";
    protected static final String PREFERENCE_PF = "pfStore";
    private static final String TAG = BaseApi.class.getName();
    protected static final String VERSION = "android";
    public static String businessId = null;
    public static String installChannel = null;
    public static boolean isOEM = false;
    public static String registerChannel = null;
    protected static int sRequestCode = 1000;
    protected Intent mActivityIntent;
    protected ProgressDialog mProgressDialog;
    protected QQAuth mQQAuth;
    protected List<ApiTask> mTaskList;
    protected QQToken mToken;
    protected IUiListener mUiListener;

    public BaseApi(QQAuth qQAuth, QQToken qQToken) {
        this.mTaskList = null;
        this.mActivityIntent = null;
        this.mUiListener = null;
        this.mQQAuth = qQAuth;
        this.mToken = qQToken;
        this.mTaskList = new ArrayList();
    }

    public BaseApi(QQToken qQToken) {
        this(null, qQToken);
    }

    private Intent getAssitIntent(Activity activity) {
        Intent intent = new Intent(activity.getApplicationContext(), AssistActivity.class);
        intent.putExtra(SystemUtils.IS_LOGIN, true);
        return intent;
    }

    public static void handleDataToListener(Intent intent, IUiListener iUiListener) {
        if (intent == null) {
            iUiListener.onCancel();
            return;
        }
        String stringExtra = intent.getStringExtra(Constants.KEY_ACTION);
        String stringExtra2;
        if (SystemUtils.ACTION_LOGIN.equals(stringExtra)) {
            int intExtra = intent.getIntExtra(Constants.KEY_ERROR_CODE, 0);
            if (intExtra == 0) {
                stringExtra2 = intent.getStringExtra(Constants.KEY_RESPONSE);
                if (stringExtra2 != null) {
                    try {
                        iUiListener.onComplete(Util.parseJson(stringExtra2));
                        return;
                    } catch (Throwable e) {
                        iUiListener.onError(new UiError(-4, Constants.MSG_JSON_ERROR, stringExtra2));
                        f.b(f.d, "OpenUi, onActivityResult, json error", e);
                        return;
                    }
                }
                f.b(f.d, "OpenUi, onActivityResult, onComplete");
                iUiListener.onComplete(new JSONObject());
                return;
            }
            f.e(f.d, "OpenUi, onActivityResult, onError = " + intExtra + "");
            iUiListener.onError(new UiError(intExtra, intent.getStringExtra(Constants.KEY_ERROR_MSG), intent.getStringExtra(Constants.KEY_ERROR_DETAIL)));
        } else if (SystemUtils.ACTION_SHARE.equals(stringExtra)) {
            stringExtra = intent.getStringExtra("result");
            stringExtra2 = intent.getStringExtra("response");
            if ("cancel".equals(stringExtra)) {
                iUiListener.onCancel();
            } else if ("error".equals(stringExtra)) {
                iUiListener.onError(new UiError(-6, "unknown error", stringExtra2 + ""));
            } else if ("complete".equals(stringExtra)) {
                try {
                    iUiListener.onComplete(new JSONObject(stringExtra2 == null ? "{\"ret\": 0}" : stringExtra2));
                } catch (JSONException e2) {
                    e2.printStackTrace();
                    iUiListener.onError(new UiError(-4, "json error", stringExtra2 + ""));
                }
            }
        }
    }

    protected Bundle composeActivityParams() {
        Bundle bundle = new Bundle();
        bundle.putString("appid", this.mToken.getAppId());
        if (this.mToken.isSessionValid()) {
            bundle.putString(Constants.PARAM_KEY_STR, this.mToken.getAccessToken());
            bundle.putString(Constants.PARAM_KEY_TYPE, "0x80");
        }
        String openId = this.mToken.getOpenId();
        if (openId != null) {
            bundle.putString("hopenid", openId);
        }
        bundle.putString(Constants.PARAM_PLATFORM, "androidqz");
        SharedPreferences sharedPreferences = Global.getContext().getSharedPreferences("pfStore", 0);
        if (isOEM) {
            bundle.putString(Constants.PARAM_PLATFORM_ID, "desktop_m_qq-" + installChannel + Constants.ACCEPT_TIME_SEPARATOR_SERVER + "android" + Constants.ACCEPT_TIME_SEPARATOR_SERVER + registerChannel + Constants.ACCEPT_TIME_SEPARATOR_SERVER + businessId);
        } else {
            bundle.putString(Constants.PARAM_PLATFORM_ID, sharedPreferences.getString(Constants.PARAM_PLATFORM_ID, "openmobile_android"));
            bundle.putString(Constants.PARAM_PLATFORM_ID, "openmobile_android");
        }
        bundle.putString("sdkv", Constants.SDK_VERSION);
        bundle.putString("sdkp", "a");
        return bundle;
    }

    protected Bundle composeCGIParams() {
        Bundle bundle = new Bundle();
        bundle.putString(FimiMediaMeta.IJKM_KEY_FORMAT, "json");
        bundle.putString("status_os", VERSION.RELEASE);
        bundle.putString("status_machine", Build.MODEL);
        bundle.putString("status_version", VERSION.SDK);
        bundle.putString("sdkv", Constants.SDK_VERSION);
        bundle.putString("sdkp", "a");
        if (this.mToken != null && this.mToken.isSessionValid()) {
            bundle.putString("access_token", this.mToken.getAccessToken());
            bundle.putString("oauth_consumer_key", this.mToken.getAppId());
            bundle.putString("openid", this.mToken.getOpenId());
            bundle.putString("appid_for_getting_config", this.mToken.getAppId());
        }
        SharedPreferences sharedPreferences = Global.getContext().getSharedPreferences("pfStore", 0);
        if (isOEM) {
            bundle.putString(Constants.PARAM_PLATFORM_ID, "desktop_m_qq-" + installChannel + Constants.ACCEPT_TIME_SEPARATOR_SERVER + "android" + Constants.ACCEPT_TIME_SEPARATOR_SERVER + registerChannel + Constants.ACCEPT_TIME_SEPARATOR_SERVER + businessId);
        } else {
            bundle.putString(Constants.PARAM_PLATFORM_ID, sharedPreferences.getString(Constants.PARAM_PLATFORM_ID, "openmobile_android"));
        }
        return bundle;
    }

    Intent getActivityIntent() {
        return this.mActivityIntent;
    }

    protected Intent getAgentIntent() {
        return getTargetActivityIntent(ACTIVITY_AGENT);
    }

    protected Intent getAgentIntentWithTarget(String str) {
        Intent intent = new Intent();
        Intent targetActivityIntent = getTargetActivityIntent(str);
        if (targetActivityIntent == null || targetActivityIntent.getComponent() == null) {
            return null;
        }
        intent.setClassName(targetActivityIntent.getComponent().getPackageName(), ACTIVITY_AGENT);
        return intent;
    }

    protected String getCommonDownloadQQUrl(String str) {
        Bundle composeCGIParams = composeCGIParams();
        StringBuilder stringBuilder = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            composeCGIParams.putString("need_version", str);
        }
        stringBuilder.append(ServerSetting.NEED_QQ_VERSION_TIPS_URL);
        stringBuilder.append(Util.encodeUrl(composeCGIParams));
        return stringBuilder.toString();
    }

    protected Intent getTargetActivityIntent(String str) {
        Intent intent = new Intent();
        intent.setClassName("com.tencent.mobileqq", str);
        return SystemUtils.isActivityExist(Global.getContext(), intent) ? intent : null;
    }

    protected void handleDownloadLastestQQ(Activity activity, Bundle bundle, IUiListener iUiListener) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ServerSetting.DOWNLOAD_QQ_URL);
        stringBuilder.append(Util.encodeUrl(bundle));
        Context context = activity;
        new TDialog(context, "", stringBuilder.toString(), null, this.mToken).show();
    }

    protected boolean hasActivityForIntent() {
        return this.mActivityIntent != null ? SystemUtils.isActivityExist(Global.getContext(), this.mActivityIntent) : false;
    }

    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        IUiListener iUiListener;
        for (ApiTask apiTask : this.mTaskList) {
            if (apiTask.mRequestCode == i) {
                IUiListener iUiListener2 = apiTask.mListener;
                this.mTaskList.remove(apiTask);
                iUiListener = iUiListener2;
                break;
            }
        }
        iUiListener = null;
        if (iUiListener == null) {
            f.b(TAG, "BaseApi--onActivityResult-- listener == null");
            AssistActivity.setResultDataForLogin(activity, intent);
            return;
        }
        if (i2 == -1) {
            handleDataToListener(intent, iUiListener);
        } else {
            f.b(f.d, "OpenUi, onActivityResult, Constants.ACTIVITY_CANCEL");
            iUiListener.onCancel();
        }
        f.b();
    }

    public void releaseResource() {
    }

    protected void showProgressDialog(Context context, String str, String str2) {
        CharSequence charSequence;
        CharSequence charSequence2;
        if (TextUtils.isEmpty(str)) {
            charSequence = "请稍候";
        }
        if (TextUtils.isEmpty(str2)) {
            charSequence2 = "正在加载...";
        }
        this.mProgressDialog = ProgressDialog.show(context, charSequence, charSequence2);
        this.mProgressDialog.setCancelable(true);
    }

    protected void startAssistActivity(Activity activity, int i) {
        AssistActivity.setApiObject(this);
        Intent intent = new Intent(activity.getApplicationContext(), AssistActivity.class);
        AssistActivity.hackShareSend = true;
        if (AssistActivity.isQQMobileShare) {
            intent.putExtra(SystemUtils.IS_QQ_MOBILE_SHARE, true);
            AssistActivity.isQQMobileShare = false;
        }
        activity.startActivityForResult(intent, i);
    }

    protected void startAssistActivity(Activity activity, Bundle bundle, int i) {
        AssistActivity.setApiObject(this);
        Intent intent = new Intent(activity.getApplicationContext(), AssistActivity.class);
        AssistActivity.hackShareSend = true;
        intent.putExtra(SystemUtils.H5_SHARE_DATA, bundle);
        activity.startActivityForResult(intent, i);
    }

    protected void startAssitActivity(Activity activity, IUiListener iUiListener) {
        AssistActivity.setApiObject(this);
        int i = sRequestCode;
        sRequestCode = i + 1;
        this.mActivityIntent.putExtra("key_request_code", i);
        this.mTaskList.add(new ApiTask(this, i, iUiListener));
        activity.startActivityForResult(getAssitIntent(activity), Constants.REQUEST_API);
    }

    protected void startAssitActivity(Fragment fragment, IUiListener iUiListener) {
        AssistActivity.setApiObject(this);
        int i = sRequestCode;
        sRequestCode = i + 1;
        this.mActivityIntent.putExtra("key_request_code", i);
        this.mTaskList.add(new ApiTask(this, i, iUiListener));
        fragment.startActivityForResult(getAssitIntent(fragment.getActivity()), Constants.REQUEST_API);
    }
}
