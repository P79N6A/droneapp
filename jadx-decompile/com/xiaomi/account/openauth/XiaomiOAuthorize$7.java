package com.xiaomi.account.openauth;

import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;

class XiaomiOAuthorize$7 extends AsyncTask<Void, Void, XiaomiOAuthResults> {
    Exception e;
    final /* synthetic */ Activity val$activity;
    final /* synthetic */ int val$requestCode;
    final /* synthetic */ String val$typeCode;
    final /* synthetic */ XiaomiOAuthFuture val$y;

    XiaomiOAuthorize$7(XiaomiOAuthFuture xiaomiOAuthFuture, String str, Activity activity, int i) {
        this.val$y = xiaomiOAuthFuture;
        this.val$typeCode = str;
        this.val$activity = activity;
        this.val$requestCode = i;
    }

    protected XiaomiOAuthResults doInBackground(Void... voidArr) {
        try {
            return (XiaomiOAuthResults) this.val$y.getResult();
        } catch (OperationCanceledException e) {
            e.printStackTrace();
        } catch (Exception e2) {
            this.e = e2;
        } catch (Exception e22) {
            this.e = e22;
        }
        return null;
    }

    protected void onPostExecute(XiaomiOAuthResults xiaomiOAuthResults) {
        int i;
        Bundle bundle = new Bundle();
        if (xiaomiOAuthResults == null) {
            if (this.e == null) {
                i = AuthorizeActivityBase.RESULT_CANCEL;
                bundle.putInt("error", AuthorizeActivityBase.RESULT_CANCEL);
                bundle.putString(XiaomiOAuthConstants.EXTRA_ERROR_DESCRIPTION_2, "canceled");
            } else {
                i = AuthorizeActivityBase.RESULT_FAIL;
                bundle.putInt("error", AuthorizeActivityBase.RESULT_FAIL);
                bundle.putString(XiaomiOAuthConstants.EXTRA_ERROR_DESCRIPTION_2, this.e.getMessage());
            }
        } else if (xiaomiOAuthResults.hasError()) {
            i = AuthorizeActivityBase.RESULT_FAIL;
            bundle.putInt("error", xiaomiOAuthResults.getErrorCode());
            bundle.putString(XiaomiOAuthConstants.EXTRA_ERROR_DESCRIPTION_2, xiaomiOAuthResults.getErrorMessage());
        } else {
            i = AuthorizeActivityBase.RESULT_SUCCESS;
            if (XiaomiOAuthConstants.EXTRA_CODE_2.equalsIgnoreCase(this.val$typeCode)) {
                bundle.putString(XiaomiOAuthConstants.EXTRA_CODE_2, xiaomiOAuthResults.getCode());
                bundle.putString(XiaomiOAuthConstants.EXTRA_STATE_2, xiaomiOAuthResults.getState());
                bundle.putString(XiaomiOAuthConstants.EXTRA_TOKEN_TYPE_2, xiaomiOAuthResults.getTokenType());
                bundle.putString(XiaomiOAuthConstants.EXTRA_MAC_KEY_2, xiaomiOAuthResults.getMacKey());
                bundle.putString(XiaomiOAuthConstants.EXTRA_MAC_ALGORITHM_2, xiaomiOAuthResults.getMacAlgorithm());
            } else {
                bundle.putString("access_token", xiaomiOAuthResults.getAccessToken());
                bundle.putString("expires_in", xiaomiOAuthResults.getExpiresIn());
                bundle.putString("scope", xiaomiOAuthResults.getScopes());
                bundle.putString(XiaomiOAuthConstants.EXTRA_STATE_2, xiaomiOAuthResults.getState());
                bundle.putString(XiaomiOAuthConstants.EXTRA_TOKEN_TYPE_2, xiaomiOAuthResults.getTokenType());
                bundle.putString(XiaomiOAuthConstants.EXTRA_MAC_KEY_2, xiaomiOAuthResults.getMacKey());
                bundle.putString(XiaomiOAuthConstants.EXTRA_MAC_ALGORITHM_2, xiaomiOAuthResults.getMacAlgorithm());
            }
        }
        this.val$activity.startActivityForResult(AuthorizeActivityBase.asMiddleActivity(this.val$activity, i, bundle, XiaomiOAuthorize.access$1500()), this.val$requestCode);
    }
}
