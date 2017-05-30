package com.fimi.soul.module.thirdpartlogin;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import cn.sharesdk.facebook.Facebook;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDK;
import com.fimi.overseas.soul.R;
import com.tencent.open.SocialConstants;
import java.util.HashMap;

public class b implements Callback {
    private static final int a = 1;
    private static final int b = 2;
    private static final int c = 3;
    private d d;
    private String e;
    private Context f;
    private Handler g = new Handler(Looper.getMainLooper(), this);

    public void a(Context context) {
        this.f = context.getApplicationContext();
        Platform platform = ShareSDK.getPlatform(this.e);
        if (platform != null) {
            platform.removeAccount(true);
            if (Facebook.NAME.equals(this.e)) {
                platform.SSOSetting(false);
            } else {
                platform.SSOSetting(true);
            }
            platform.setPlatformActionListener(new PlatformActionListener(this) {
                final /* synthetic */ b a;

                {
                    this.a = r1;
                }

                public void onCancel(Platform platform, int i) {
                    if (platform != null) {
                        platform.removeAccount(true);
                    }
                    if (i == 8) {
                        Message message = new Message();
                        message.what = 1;
                        message.arg2 = i;
                        message.obj = platform;
                        this.a.g.sendMessage(message);
                    }
                }

                public void onComplete(Platform platform, int i, HashMap<String, Object> hashMap) {
                    if (i == 8) {
                        Message message = new Message();
                        message.what = 3;
                        message.arg2 = i;
                        message.obj = new Object[]{platform.getName(), hashMap};
                        this.a.g.sendMessage(message);
                    }
                }

                public void onError(Platform platform, int i, Throwable th) {
                    if (platform != null) {
                        platform.removeAccount(true);
                    }
                    Message message;
                    if (i == 8) {
                        message = new Message();
                        message.what = 2;
                        message.arg2 = i;
                        message.obj = th;
                        this.a.g.sendMessage(message);
                    } else if (i == 1) {
                        message = new Message();
                        message.what = 1;
                        message.arg2 = i;
                        message.obj = th;
                        this.a.g.sendMessage(message);
                    }
                    th.printStackTrace();
                }
            });
            platform.showUser(null);
        }
    }

    public void a(d dVar) {
        this.d = dVar;
    }

    public void a(String str) {
        this.e = str;
    }

    public boolean handleMessage(Message message) {
        HashMap hashMap;
        String str;
        switch (message.what) {
            case 1:
                hashMap = new HashMap();
                this.f.getResources().getString(R.string.cancel);
                if (this.d != null) {
                    this.d.a("", hashMap);
                    break;
                }
                break;
            case 2:
                Throwable th = (Throwable) message.obj;
                str = "caught error: " + th.getMessage();
                HashMap hashMap2 = new HashMap();
                hashMap2.put(SocialConstants.PARAM_SEND_MSG, str);
                if (this.d != null) {
                    this.d.a("", hashMap2);
                }
                th.printStackTrace();
                break;
            case 3:
                Object[] objArr = (Object[]) message.obj;
                str = (String) objArr[0];
                hashMap = (HashMap) objArr[1];
                if (this.d != null && this.d.a(str, hashMap)) {
                    break;
                }
        }
        return false;
    }
}
