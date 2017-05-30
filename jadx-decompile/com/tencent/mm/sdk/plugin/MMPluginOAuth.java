package com.tencent.mm.sdk.plugin;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Handler;
import com.google.android.gms.drive.e;
import com.tencent.mm.sdk.platformtools.Log;
import com.tencent.mm.sdk.plugin.MMPluginProviderConstants.OAuth;
import com.tencent.mm.sdk.plugin.MMPluginProviderConstants.PluginIntent;
import java.util.HashMap;
import java.util.Map;

public class MMPluginOAuth {
    private final Context R;
    private final IResult bA;
    private String bB;
    private String bC;
    private Handler handler;

    public interface IResult {
        void onResult(MMPluginOAuth mMPluginOAuth);

        void onSessionTimeOut();
    }

    public static class Receiver extends BroadcastReceiver {
        private static final Map<String, MMPluginOAuth> aA = new HashMap();
        private final MMPluginOAuth bE;

        public Receiver() {
            this(null);
        }

        public Receiver(MMPluginOAuth mMPluginOAuth) {
            this.bE = mMPluginOAuth;
        }

        public static void register(String str, MMPluginOAuth mMPluginOAuth) {
            aA.put(str, mMPluginOAuth);
        }

        public static void unregister(String str) {
            aA.remove(str);
        }

        public void onReceive(Context context, Intent intent) {
            MMPluginOAuth mMPluginOAuth;
            Log.d("MicroMsg.SDK.MMPluginOAuth", "receive oauth result");
            String stringExtra = intent.getStringExtra(PluginIntent.REQUEST_TOKEN);
            final String stringExtra2 = intent.getStringExtra(PluginIntent.ACCESS_TOKEN);
            if (this.bE != null) {
                mMPluginOAuth = this.bE;
            } else {
                mMPluginOAuth = (MMPluginOAuth) aA.get(stringExtra);
                if (mMPluginOAuth == null) {
                    Log.e("MicroMsg.SDK.MMPluginOAuth", "oauth unregistered, request token = " + stringExtra);
                    return;
                }
                unregister(mMPluginOAuth.bC);
            }
            new Handler().post(new Runnable(this) {
                final /* synthetic */ Receiver bH;

                public void run() {
                    MMPluginOAuth.a(mMPluginOAuth, stringExtra2);
                }
            });
        }
    }

    public MMPluginOAuth(Context context, IResult iResult) {
        this.R = context;
        this.bA = iResult;
    }

    static /* synthetic */ void a(MMPluginOAuth mMPluginOAuth, String str) {
        Receiver.unregister(mMPluginOAuth.bC);
        mMPluginOAuth.bB = str;
        Log.i("MicroMsg.SDK.MMPluginOAuth", "access token: " + str);
        if (mMPluginOAuth.bA != null) {
            mMPluginOAuth.bA.onResult(mMPluginOAuth);
        }
    }

    public String getAccessToken() {
        return this.bB;
    }

    public String getRequestToken() {
        return this.bC;
    }

    public void start() {
        start(null);
    }

    public boolean start(Handler handler) {
        if (handler == null) {
            handler = new Handler();
        }
        this.handler = handler;
        Cursor query = this.R.getContentResolver().query(OAuth.CONTENT_URI, null, null, new String[]{this.R.getPackageName(), OAuth.ACTION_REQUEST_TOKEN}, null);
        if (query != null) {
            if (query.moveToFirst() && query.getColumnCount() >= 2) {
                this.bC = query.getString(0);
                this.bB = query.getString(1);
            }
            query.close();
        }
        Log.i("MicroMsg.SDK.MMPluginOAuth", "request token = " + this.bC);
        if (this.bC == null) {
            Log.e("MicroMsg.SDK.MMPluginOAuth", "request token failed");
            return false;
        } else if (this.bB != null) {
            this.handler.post(new Runnable(this) {
                final /* synthetic */ MMPluginOAuth bD;

                {
                    this.bD = r1;
                }

                public void run() {
                    if (this.bD.bA != null) {
                        this.bD.bA.onResult(this.bD);
                    }
                }
            });
            return true;
        } else {
            int i;
            Log.d("MicroMsg.SDK.MMPluginOAuth", "begin to show user oauth page");
            Intent intent = new Intent();
            intent.setClassName(PluginIntent.APP_PACKAGE_PATTERN, "com.tencent.mm.plugin.PluginOAuthUI");
            intent.putExtra(PluginIntent.REQUEST_TOKEN, this.bC);
            intent.putExtra(PluginIntent.PACKAGE, this.R.getPackageName());
            if (this.R.getPackageManager().resolveActivity(intent, 65536) == null) {
                Log.e("MicroMsg.SDK.MMPluginOAuth", "show oauth page failed, activity not found");
                i = 0;
            } else {
                if (!(this.R instanceof Activity)) {
                    intent.setFlags(e.a_);
                }
                this.R.startActivity(intent);
                i = 1;
            }
            if (i == 0) {
                return false;
            }
            Receiver.register(this.bC, this);
            return true;
        }
    }
}
