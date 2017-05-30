package com.xiaomi.account.openauth;

import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.ExecutionException;

class XiaomiOAuthorize$2 extends XiaomiOAuthRunnable<XiaomiOAuthResults> {
    final /* synthetic */ XiaomiOAuthorize this$0;
    final /* synthetic */ Activity val$activity;
    final /* synthetic */ String val$responseType;

    XiaomiOAuthorize$2(XiaomiOAuthorize xiaomiOAuthorize, Activity activity, String str) {
        this.this$0 = xiaomiOAuthorize;
        this.val$activity = activity;
        this.val$responseType = str;
    }

    private Bundle makeOptions() {
        Bundle bundle = new Bundle();
        bundle.putString("extra_client_id", String.valueOf(XiaomiOAuthorize.access$800(this.this$0)));
        bundle.putString("extra_redirect_uri", XiaomiOAuthorize.access$900(this.this$0));
        bundle.putString("extra_response_type", this.val$responseType);
        if (XiaomiOAuthorize.access$1300(this.this$0) != null) {
            bundle.putBoolean("extra_skip_confirm", XiaomiOAuthorize.access$1300(this.this$0).booleanValue());
        }
        if (!TextUtils.isEmpty(XiaomiOAuthorize.access$1200(this.this$0))) {
            bundle.putString("extra_state", XiaomiOAuthorize.access$1200(this.this$0));
        }
        Object access$1100 = XiaomiOAuthorize.access$1100(XiaomiOAuthorize.access$1000(this.this$0));
        if (!TextUtils.isEmpty(access$1100)) {
            bundle.putString("extra_scope", access$1100);
        }
        return bundle;
    }

    private void run(XiaomiOAuthorize$XiaomiTokenFuture xiaomiOAuthorize$XiaomiTokenFuture) {
        XiaomiOAuthorize$OAuthStage xiaomiOAuthorize$OAuthStage = XiaomiOAuthorize$OAuthStage.INIT;
        while (true) {
            switch (XiaomiOAuthorize$8.$SwitchMap$com$xiaomi$account$openauth$XiaomiOAuthorize$OAuthStage[xiaomiOAuthorize$OAuthStage.ordinal()]) {
                case 1:
                    if (!XiaomiOAuthorize.access$100(this.this$0) && XiaomiOAuthorize.access$200(this.val$activity)) {
                        if (!XiaomiOAuthorize.access$300(this.this$0, this.val$activity)) {
                            if (XiaomiOAuthorize.access$400(this.this$0, this.val$activity) == null) {
                                xiaomiOAuthorize$OAuthStage = XiaomiOAuthorize$OAuthStage.ADD_SYSTEM_ACCOUNT;
                                break;
                            } else {
                                xiaomiOAuthorize$OAuthStage = XiaomiOAuthorize$OAuthStage.OAUTH_FROM_MIUI;
                                break;
                            }
                        }
                        xiaomiOAuthorize$OAuthStage = XiaomiOAuthorize$OAuthStage.OAUTH_FROM_MIUI_WITH_RESPONSE;
                        break;
                    }
                    xiaomiOAuthorize$OAuthStage = XiaomiOAuthorize$OAuthStage.OAUTH_FROM_3RD_PARTY;
                    break;
                case 2:
                    try {
                        Bundle bundle = (Bundle) AccountManager.get(this.val$activity).addAccount("com.xiaomi", null, null, null, this.val$activity, null, null).getResult();
                        if (bundle != null && bundle.containsKey("authAccount")) {
                            xiaomiOAuthorize$OAuthStage = XiaomiOAuthorize$OAuthStage.OAUTH_FROM_MIUI;
                            break;
                        } else {
                            xiaomiOAuthorize$XiaomiTokenFuture.setException(new Exception("fail to add account"));
                            return;
                        }
                    } catch (SecurityException e) {
                        xiaomiOAuthorize$OAuthStage = XiaomiOAuthorize$OAuthStage.OAUTH_FROM_3RD_PARTY;
                        break;
                    } catch (AuthenticatorException e2) {
                        xiaomiOAuthorize$OAuthStage = XiaomiOAuthorize$OAuthStage.OAUTH_FROM_3RD_PARTY;
                        break;
                    }
                case 3:
                    xiaomiOAuthorize$XiaomiTokenFuture.set(XiaomiOAuthorize.access$500(this.val$activity, XiaomiOAuthorize.access$400(this.this$0, this.val$activity), makeOptions()));
                    return;
                case 4:
                    XiaomiOAuthorize.access$700(this.val$activity, makeOptions(), xiaomiOAuthorize$XiaomiTokenFuture.wrapWithinResponse());
                    return;
                case 5:
                    xiaomiOAuthorize$XiaomiTokenFuture.handleIntentResult(AuthorizeActivityBase.getIntent(this.val$activity, String.valueOf(XiaomiOAuthorize.access$800(this.this$0)), XiaomiOAuthorize.access$900(this.this$0), this.val$responseType, XiaomiOAuthorize.access$1100(XiaomiOAuthorize.access$1000(this.this$0)), XiaomiOAuthorize.access$1200(this.this$0), XiaomiOAuthorize.access$1300(this.this$0), XiaomiOAuthorize.access$1400(this.this$0), xiaomiOAuthorize$XiaomiTokenFuture.wrapWithinResponse(), XiaomiOAuthorize.access$000(this.this$0)));
                    return;
                default:
                    break;
            }
        }
    }

    public void doRun() {
        try {
            run(new XiaomiOAuthorize$XiaomiTokenFuture(this.val$activity, this.mFuture, XiaomiOAuthorize.access$000(this.this$0)));
        } catch (ExecutionException e) {
            this.mFuture.setException(e.getCause());
        } catch (Throwable e2) {
            this.mFuture.setException(e2);
        } catch (Throwable e22) {
            this.mFuture.setException(e22);
        } catch (Throwable e222) {
            this.mFuture.setException(e222);
        }
    }
}
