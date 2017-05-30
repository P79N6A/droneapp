package com.fimi.soul.module.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Handler.Callback;
import android.os.Message;
import android.text.TextUtils;
import android.widget.Toast;
import cn.sharesdk.framework.CustomPlatform;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.Platform.ShareParams;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDK;
import com.mob.tools.utils.R;
import com.mob.tools.utils.UIHandler;
import com.tencent.connect.common.Constants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class e implements Callback, PlatformActionListener {
    protected boolean a;
    protected HashMap<String, Object> b;
    protected boolean c;
    protected ArrayList<a> d;
    protected HashMap<String, String> e;
    protected PlatformActionListener f = this;
    protected f g;
    protected boolean h;
    protected Context i;

    private void a(final String str) {
        UIHandler.sendEmptyMessage(0, new Callback(this) {
            final /* synthetic */ e b;

            public boolean handleMessage(Message message) {
                int stringRes = R.getStringRes(this.b.i, str);
                if (stringRes > 0) {
                    Toast.makeText(this.b.i, stringRes, 0).show();
                } else {
                    Toast.makeText(this.b.i, str, 0).show();
                }
                return false;
            }
        });
    }

    private void e(Platform platform) {
        if (c(platform)) {
            ShareParams d = d(platform);
            if (d != null) {
                ShareSDK.logDemoEvent(3, null);
                if (this.g != null) {
                    this.g.a(platform, d);
                }
                a(this.i, platform, d);
            }
        }
    }

    public final void a() {
        this.h = true;
    }

    public final void a(Context context) {
        this.i = context;
        if (this.b.containsKey(Constants.PARAM_PLATFORM)) {
            Platform platform = ShareSDK.getPlatform(String.valueOf(this.b.get(Constants.PARAM_PLATFORM)));
            boolean z = platform instanceof CustomPlatform;
            boolean a = a(platform);
            if (this.c || z || a) {
                b(platform);
                return;
            } else {
                e(platform);
                return;
            }
        }
        b(context);
    }

    protected abstract void a(Context context, Platform platform, ShareParams shareParams);

    public final void a(PlatformActionListener platformActionListener) {
        if (platformActionListener == null) {
            platformActionListener = this;
        }
        this.f = platformActionListener;
    }

    public final void a(f fVar) {
        this.g = fVar;
    }

    public final void a(ArrayList<a> arrayList) {
        this.d = arrayList;
    }

    public final void a(HashMap<String, Object> hashMap) {
        this.b = hashMap;
    }

    public final void a(boolean z) {
        this.a = z;
    }

    final boolean a(Platform platform) {
        String name = platform.getName();
        if ("Wechat".equals(name) || "WechatMoments".equals(name) || "WechatFavorite".equals(name) || "ShortMessage".equals(name) || "Email".equals(name) || "Qzone".equals(name) || Constants.SOURCE_QQ.equals(name) || "Pinterest".equals(name) || "Instagram".equals(name) || "Yixin".equals(name) || "YixinMoments".equals(name) || "QZone".equals(name) || "Mingdao".equals(name) || "Line".equals(name) || "KakaoStory".equals(name) || "KakaoTalk".equals(name) || "Bluetooth".equals(name) || "WhatsApp".equals(name) || "BaiduTieba".equals(name) || "Laiwang".equals(name) || "LaiwangMoments".equals(name) || "Alipay".equals(name) || "AlipayMoments".equals(name) || "FacebookMessenger".equals(name) || "GooglePlus".equals(name)) {
            return true;
        }
        if ("Evernote".equals(name)) {
            if ("true".equals(platform.getDevinfo("ShareByAppClient"))) {
                return true;
            }
        } else if ("SinaWeibo".equals(name) && "true".equals(platform.getDevinfo("ShareByAppClient"))) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setPackage("com.sina.weibo");
            intent.setType("image/*");
            ResolveInfo resolveActivity = platform.getContext().getPackageManager().resolveActivity(intent, 0);
            if (resolveActivity == null) {
                intent = new Intent("android.intent.action.SEND");
                intent.setPackage("com.sina.weibog3");
                intent.setType("image/*");
                resolveActivity = platform.getContext().getPackageManager().resolveActivity(intent, 0);
            }
            return resolveActivity != null;
        }
        return false;
    }

    protected abstract void b(Context context);

    final void b(Platform platform) {
        if (c(platform)) {
            ShareParams d = d(platform);
            if (d != null) {
                a("ssdk_oks_sharing");
                if (this.g != null) {
                    this.g.a(platform, d);
                }
                if (this.h) {
                    platform.SSOSetting(this.h);
                }
                platform.setPlatformActionListener(this.f);
                platform.share(d);
            }
        }
    }

    public final void b(HashMap<String, String> hashMap) {
        this.e = hashMap;
    }

    public final void b(boolean z) {
        this.c = z;
    }

    final boolean c(Platform platform) {
        String name = platform.getName();
        boolean z = "Alipay".equals(name) || "AlipayMoments".equals(name);
        if (z && !platform.isClientValid()) {
            a("ssdk_alipay_client_inavailable");
            return false;
        } else if ("KakaoTalk".equals(name) && !platform.isClientValid()) {
            a("ssdk_kakaotalk_client_inavailable");
            return false;
        } else if ("KakaoStory".equals(name) && !platform.isClientValid()) {
            a("ssdk_kakaostory_client_inavailable");
            return false;
        } else if ("Line".equals(name) && !platform.isClientValid()) {
            a("ssdk_line_client_inavailable");
            return false;
        } else if ("WhatsApp".equals(name) && !platform.isClientValid()) {
            a("ssdk_whatsapp_client_inavailable");
            return false;
        } else if ("Pinterest".equals(name) && !platform.isClientValid()) {
            return false;
        } else {
            if ("Instagram".equals(name) && !platform.isClientValid()) {
                return false;
            }
            if ("QZone".equals(name) && !platform.isClientValid()) {
                return false;
            }
            z = "Laiwang".equals(name);
            boolean equals = "LaiwangMoments".equals(name);
            if ((z || equals) && !platform.isClientValid()) {
                return false;
            }
            z = "YixinMoments".equals(name) || "Yixin".equals(name);
            if (z && !platform.isClientValid()) {
                return false;
            }
            z = "WechatFavorite".equals(name) || "Wechat".equals(name) || "WechatMoments".equals(name);
            if (z && !platform.isClientValid()) {
                a(this.i.getString(R.getStringRes(this.i, "no_install_apk")));
                return false;
            } else if ("FacebookMessenger".equals(name) && !platform.isClientValid()) {
                return false;
            } else {
                if (this.b.containsKey("shareType")) {
                    return true;
                }
                int i;
                String valueOf = String.valueOf(this.b.get("imagePath"));
                if (valueOf == null || !new File(valueOf).exists()) {
                    Bitmap bitmap = (Bitmap) R.forceCast(this.b.get("viewToShare"));
                    if (bitmap == null || bitmap.isRecycled()) {
                        Object obj = this.b.get("imageUrl");
                        if (obj == null || TextUtils.isEmpty(String.valueOf(obj))) {
                            i = 1;
                        } else if (String.valueOf(obj).endsWith(".gif") && z) {
                            i = 9;
                        } else {
                            if (this.b.containsKey("url") && !TextUtils.isEmpty(this.b.get("url").toString())) {
                                if (this.b.containsKey("musicUrl") && !TextUtils.isEmpty(this.b.get("musicUrl").toString()) && z) {
                                    i = 5;
                                }
                                i = 4;
                            }
                            i = 2;
                        }
                    } else {
                        if (this.b.containsKey("url") && !TextUtils.isEmpty(this.b.get("url").toString())) {
                            if (this.b.containsKey("musicUrl") && !TextUtils.isEmpty(this.b.get("musicUrl").toString()) && z) {
                                i = 5;
                            }
                            i = 4;
                        }
                        i = 2;
                    }
                } else if (valueOf.endsWith(".gif") && z) {
                    i = 9;
                } else {
                    if (this.b.containsKey("url") && !TextUtils.isEmpty(this.b.get("url").toString())) {
                        if (this.b.containsKey("musicUrl") && !TextUtils.isEmpty(this.b.get("musicUrl").toString()) && z) {
                            i = 5;
                        }
                        i = 4;
                    }
                    i = 2;
                }
                this.b.put("shareType", Integer.valueOf(i));
                return true;
            }
        }
    }

    final ShareParams d(Platform platform) {
        if (platform == null || this.b == null) {
            a("ssdk_oks_share_failed");
            return null;
        }
        try {
            Bitmap bitmap = (Bitmap) R.forceCast(this.b.get("viewToShare"));
            if (!(!TextUtils.isEmpty((String) R.forceCast(this.b.get("imagePath"))) || bitmap == null || bitmap.isRecycled())) {
                File file = new File(R.getCachePath(platform.getContext(), "screenshot"), String.valueOf(System.currentTimeMillis()) + ".jpg");
                OutputStream fileOutputStream = new FileOutputStream(file);
                bitmap.compress(CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                this.b.put("imagePath", file.getAbsolutePath());
            }
            return new ShareParams(this.b);
        } catch (Throwable th) {
            th.printStackTrace();
            a("ssdk_oks_share_failed");
            return null;
        }
    }

    public final boolean handleMessage(Message message) {
        switch (message.arg1) {
            case 1:
                int stringRes = R.getStringRes(this.i, "ssdk_oks_share_completed");
                if (stringRes > 0) {
                    a(this.i.getString(stringRes));
                    break;
                }
                break;
            case 2:
                String simpleName = message.obj.getClass().getSimpleName();
                if (!"WechatClientNotExistException".equals(simpleName) && !"WechatTimelineNotSupportedException".equals(simpleName) && !"WechatFavoriteNotSupportedException".equals(simpleName)) {
                    if (!"GooglePlusClientNotExistException".equals(simpleName)) {
                        if (!"QQClientNotExistException".equals(simpleName)) {
                            if (!"YixinClientNotExistException".equals(simpleName) && !"YixinTimelineNotSupportedException".equals(simpleName)) {
                                if (!"KakaoTalkClientNotExistException".equals(simpleName)) {
                                    if (!"KakaoStoryClientNotExistException".equals(simpleName)) {
                                        if (!"WhatsAppClientNotExistException".equals(simpleName)) {
                                            if (!"FacebookMessengerClientNotExistException".equals(simpleName)) {
                                                a("ssdk_oks_share_failed");
                                                break;
                                            }
                                            a("ssdk_facebookmessenger_client_inavailable");
                                            break;
                                        }
                                        a("ssdk_whatsapp_client_inavailable");
                                        break;
                                    }
                                    a("ssdk_kakaostory_client_inavailable");
                                    break;
                                }
                                a("ssdk_kakaotalk_client_inavailable");
                                break;
                            }
                            a("ssdk_yixin_client_inavailable");
                            break;
                        }
                        a("ssdk_qq_client_inavailable");
                        break;
                    }
                    a("ssdk_google_plus_client_inavailable");
                    break;
                }
                a(this.i.getString(R.getStringRes(this.i, "no_install_apk")));
                break;
                break;
            case 3:
                a("ssdk_oks_share_canceled");
                break;
        }
        return false;
    }

    public final void onCancel(Platform platform, int i) {
        Message message = new Message();
        message.arg1 = 3;
        message.arg2 = i;
        message.obj = platform;
        UIHandler.sendMessage(message, this);
        ShareSDK.logDemoEvent(5, platform);
    }

    public final void onComplete(Platform platform, int i, HashMap<String, Object> hashMap) {
        Message message = new Message();
        message.arg1 = 1;
        message.arg2 = i;
        message.obj = platform;
        UIHandler.sendMessage(message, this);
    }

    public final void onError(Platform platform, int i, Throwable th) {
        th.printStackTrace();
        Message message = new Message();
        message.arg1 = 2;
        message.arg2 = i;
        message.obj = th;
        UIHandler.sendMessage(message, this);
        ShareSDK.logDemoEvent(4, platform);
    }
}
