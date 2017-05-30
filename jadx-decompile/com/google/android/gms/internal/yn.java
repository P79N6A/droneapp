package com.google.android.gms.internal;

import com.fimi.soul.media.player.FimiMediaMeta;
import com.google.android.gms.ads.internal.util.client.b;
import com.tencent.mm.sdk.message.RMsgInfoDB;
import com.tencent.tauth.AuthActivity;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import com.xiaomi.market.sdk.j;
import org.json.JSONObject;

@aaa
public class yn {
    private final acy a;
    private final String b;

    public yn(acy com_google_android_gms_internal_acy) {
        this(com_google_android_gms_internal_acy, "");
    }

    public yn(acy com_google_android_gms_internal_acy, String str) {
        this.a = com_google_android_gms_internal_acy;
        this.b = str;
    }

    public void a(int i, int i2, int i3, int i4) {
        try {
            this.a.b("onSizeChanged", new JSONObject().put("x", i).put("y", i2).put(FimiMediaMeta.IJKM_KEY_WIDTH, i3).put(FimiMediaMeta.IJKM_KEY_HEIGHT, i4));
        } catch (Throwable e) {
            b.b("Error occured while dispatching size change.", e);
        }
    }

    public void a(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.a.b("onScreenInfoChanged", new JSONObject().put(FimiMediaMeta.IJKM_KEY_WIDTH, i).put(FimiMediaMeta.IJKM_KEY_HEIGHT, i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put(j.aj, (double) f).put("rotation", i5));
        } catch (Throwable e) {
            b.b("Error occured while obtaining screen information.", e);
        }
    }

    public void b(int i, int i2, int i3, int i4) {
        try {
            this.a.b("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i2).put(FimiMediaMeta.IJKM_KEY_WIDTH, i3).put(FimiMediaMeta.IJKM_KEY_HEIGHT, i4));
        } catch (Throwable e) {
            b.b("Error occured while dispatching default position.", e);
        }
    }

    public void b(String str) {
        try {
            this.a.b("onError", new JSONObject().put(RMsgInfoDB.TABLE, str).put(AuthActivity.ACTION_KEY, this.b));
        } catch (Throwable e) {
            b.b("Error occurred while dispatching error event.", e);
        }
    }

    public void c(String str) {
        try {
            this.a.b("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (Throwable e) {
            b.b("Error occured while dispatching ready Event.", e);
        }
    }

    public void d(String str) {
        try {
            this.a.b("onStateChanged", new JSONObject().put(XiaomiOAuthConstants.EXTRA_STATE_2, str));
        } catch (Throwable e) {
            b.b("Error occured while dispatching state change.", e);
        }
    }
}
