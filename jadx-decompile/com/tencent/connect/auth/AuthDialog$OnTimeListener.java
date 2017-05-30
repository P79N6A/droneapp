package com.tencent.connect.auth;

import android.os.SystemClock;
import com.tencent.connect.common.Constants;
import com.tencent.open.b.g;
import com.tencent.open.utils.Util;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import org.json.JSONException;
import org.json.JSONObject;

class AuthDialog$OnTimeListener implements IUiListener {
    String a;
    String b;
    final /* synthetic */ AuthDialog c;
    private String d;
    private IUiListener e;

    public AuthDialog$OnTimeListener(AuthDialog authDialog, String str, String str2, String str3, IUiListener iUiListener) {
        this.c = authDialog;
        this.d = str;
        this.a = str2;
        this.b = str3;
        this.e = iUiListener;
    }

    private void a(String str) {
        try {
            onComplete(Util.parseJson(str));
        } catch (JSONException e) {
            e.printStackTrace();
            onError(new UiError(-4, Constants.MSG_JSON_ERROR, str));
        }
    }

    public void onCancel() {
        if (this.e != null) {
            this.e.onCancel();
            this.e = null;
        }
    }

    public void onComplete(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        g.a().a(this.d + "_H5", SystemClock.elapsedRealtime(), 0, 0, jSONObject.optInt("ret", -6), this.a, false);
        if (this.e != null) {
            this.e.onComplete(jSONObject);
            this.e = null;
        }
    }

    public void onError(UiError uiError) {
        String str = uiError.errorMessage != null ? uiError.errorMessage + this.a : this.a;
        g.a().a(this.d + "_H5", SystemClock.elapsedRealtime(), 0, 0, uiError.errorCode, str, false);
        AuthDialog.a(this.c, str);
        if (this.e != null) {
            this.e.onError(uiError);
            this.e = null;
        }
    }
}
