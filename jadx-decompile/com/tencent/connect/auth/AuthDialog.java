package com.tencent.connect.auth;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebSettings.RenderPriority;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.tencent.connect.auth.AuthMap.Auth;
import com.tencent.open.SocialConstants;
import com.tencent.open.a.f;
import com.tencent.open.c.c;
import com.tencent.open.utils.Global;
import com.tencent.open.utils.ServerSetting;
import com.tencent.open.utils.SystemUtils;
import com.tencent.open.utils.Util;
import com.tencent.open.web.security.SecureJsInterface;
import com.tencent.open.web.security.b;
import com.tencent.tauth.IUiListener;
import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public class AuthDialog extends Dialog {
    private static final String a = (f.d + ".authDlg");
    private String b;
    private OnTimeListener c;
    private IUiListener d;
    private Handler e;
    private FrameLayout f;
    private LinearLayout g;
    private FrameLayout h;
    private ProgressBar i;
    private String j;
    private c k;
    private Context l;
    private b m;
    private boolean n = false;
    private int o;
    private String p;
    private String q;
    private long r = 0;
    private long s = NotificationOptions.b;
    private HashMap<String, Runnable> t;

    static {
        try {
            Context context = Global.getContext();
            if (context == null) {
                f.b(a, "-->load wbsafeedit lib fail, because context is null.");
            } else if (new File(context.getFilesDir().toString() + "/" + AuthAgent.SECURE_LIB_NAME).exists()) {
                System.load(context.getFilesDir().toString() + "/" + AuthAgent.SECURE_LIB_NAME);
                f.b(a, "-->load wbsafeedit lib success.");
            } else {
                f.b(a, "-->load wbsafeedit lib fail, because so is not exists.");
            }
        } catch (Throwable e) {
            f.b(a, "-->load wbsafeedit lib error.", e);
        }
    }

    public AuthDialog(Context context, String str, String str2, IUiListener iUiListener, QQToken qQToken) {
        super(context, 16973840);
        this.l = context;
        this.b = str2;
        this.c = new OnTimeListener(this, str, str2, qQToken.getAppId(), iUiListener);
        this.e = new THandler(this, this.c, context.getMainLooper());
        this.d = iUiListener;
        this.j = str;
        this.m = new b();
        getWindow().setSoftInputMode(32);
    }

    static /* synthetic */ String a(AuthDialog authDialog, Object obj) {
        String str = authDialog.b + obj;
        authDialog.b = str;
        return str;
    }

    private String a(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        if (!TextUtils.isEmpty(this.q) && this.q.length() >= 4) {
            stringBuilder.append("_u_").append(this.q.substring(this.q.length() - 4));
        }
        return stringBuilder.toString();
    }

    private String b() {
        String str = ServerSetting.DOWNLOAD_QQ_URL + this.b.substring(this.b.indexOf("?") + 1);
        f.c(a, "-->generateDownloadUrl, url: http://qzs.qq.com/open/mobile/login/qzsjump.html?");
        return str;
    }

    private static void b(Context context, String str) {
        try {
            JSONObject parseJson = Util.parseJson(str);
            int i = parseJson.getInt("type");
            Toast.makeText(context.getApplicationContext(), parseJson.getString(SocialConstants.PARAM_SEND_MSG), i).show();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void c() {
        d();
        LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.k = new c(this.l);
        this.k.setLayoutParams(layoutParams);
        this.f = new FrameLayout(this.l);
        layoutParams.gravity = 17;
        this.f.setLayoutParams(layoutParams);
        this.f.addView(this.k);
        this.f.addView(this.h);
        setContentView(this.f);
    }

    private void d() {
        LayoutParams layoutParams;
        this.i = new ProgressBar(this.l);
        this.i.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.g = new LinearLayout(this.l);
        View view = null;
        if (this.j.equals(SystemUtils.ACTION_LOGIN)) {
            layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 16;
            layoutParams.leftMargin = 5;
            view = new TextView(this.l);
            if (Locale.getDefault().getLanguage().equals("zh")) {
                view.setText("登录中...");
            } else {
                view.setText("Logging in...");
            }
            view.setTextColor(Color.rgb(255, 255, 255));
            view.setTextSize(18.0f);
            view.setLayoutParams(layoutParams);
        }
        layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.g.setLayoutParams(layoutParams);
        this.g.addView(this.i);
        if (view != null) {
            this.g.addView(view);
        }
        this.h = new FrameLayout(this.l);
        LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.leftMargin = 80;
        layoutParams2.rightMargin = 80;
        layoutParams2.topMargin = 40;
        layoutParams2.bottomMargin = 40;
        layoutParams2.gravity = 17;
        this.h.setLayoutParams(layoutParams2);
        this.h.setBackgroundResource(17301504);
        this.h.addView(this.g);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void e() {
        this.k.setVerticalScrollBarEnabled(false);
        this.k.setHorizontalScrollBarEnabled(false);
        this.k.setWebViewClient(new LoginWebViewClient(this, null));
        this.k.setWebChromeClient(new WebChromeClient());
        this.k.clearFormData();
        this.k.clearSslPreferences();
        this.k.setOnLongClickListener(new 1(this));
        this.k.setOnTouchListener(new 2(this));
        WebSettings settings = this.k.getSettings();
        settings.setSavePassword(false);
        settings.setSaveFormData(false);
        settings.setCacheMode(-1);
        settings.setNeedInitialFocus(false);
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);
        settings.setRenderPriority(RenderPriority.HIGH);
        settings.setJavaScriptEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setDatabasePath(this.l.getDir("databases", 0).getPath());
        settings.setDomStorageEnabled(true);
        f.b(a, "-->mUrl : " + this.b);
        this.p = this.b;
        this.k.loadUrl(this.b);
        this.k.setVisibility(4);
        this.k.getSettings().setSavePassword(false);
        this.m.a(new SecureJsInterface(), "SecureJsInterface");
        SecureJsInterface.isPWDEdit = false;
        super.setOnDismissListener(new 3(this));
    }

    private boolean f() {
        AuthMap instance = AuthMap.getInstance();
        String makeKey = instance.makeKey();
        Auth auth = new Auth();
        auth.listener = this.d;
        auth.dialog = this;
        auth.key = makeKey;
        String str = instance.set(auth);
        String substring = this.b.substring(0, this.b.indexOf("?"));
        Bundle parseUrl = Util.parseUrl(this.b);
        parseUrl.putString("token_key", makeKey);
        parseUrl.putString("serial", str);
        parseUrl.putString("browser", "1");
        this.b = substring + "?" + Util.encodeUrl(parseUrl);
        return Util.openBrowser(this.l, this.b);
    }

    public void callJs(String str, String str2) {
        this.k.loadUrl("javascript:" + str + "(" + str2 + ");void(" + System.currentTimeMillis() + ");");
    }

    public void dismiss() {
        this.t.clear();
        this.e.removeCallbacksAndMessages(null);
        if (isShowing()) {
            super.dismiss();
        }
        if (this.k != null) {
            this.k.destroy();
            this.k = null;
        }
    }

    public void onBackPressed() {
        if (!this.n) {
            this.c.onCancel();
        }
        super.onBackPressed();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        c();
        e();
        this.t = new HashMap();
    }

    protected void onStop() {
        super.onStop();
    }
}
