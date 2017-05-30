package com.fimi.soul.module.thirdpartlogin;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import cn.sharesdk.framework.Platform;

public class e {
    public static Bitmap a(String str) {
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inJustDecodeBounds = false;
        int i = options.outWidth;
        int i2 = options.outHeight;
        i = (i <= i2 || ((float) i) <= 480.0f) ? (i >= i2 || ((float) i2) <= 800.0f) ? 1 : (int) (((float) options.outHeight) / 800.0f) : (int) (((float) options.outWidth) / 480.0f);
        if (i <= 0) {
            i = 1;
        }
        options.inSampleSize = i;
        options.inPreferredConfig = Config.ARGB_8888;
        options.inPurgeable = true;
        options.inInputShareable = true;
        return BitmapFactory.decodeFile(str, options);
    }

    public static String a(int i) {
        switch (i) {
            case 1:
                return "ACTION_AUTHORIZING";
            case 2:
                return "ACTION_GETTING_FRIEND_LIST";
            case 5:
                return "ACTION_SENDING_DIRECT_MESSAGE";
            case 6:
                return "ACTION_FOLLOWING_USER";
            case 7:
                return "ACTION_TIMELINE";
            case 8:
                return "ACTION_USER_INFOR";
            case 9:
                return "ACTION_SHARE";
            default:
                return "UNKNOWN";
        }
    }

    public static boolean a(Platform platform) {
        if (platform == null) {
            return false;
        }
        String name = platform.getName();
        return (!"Wechat".equals(name) || platform.isClientValid()) ? (("GooglePlus".equals(name) && !platform.isClientValid()) || "WechatMoments".equals(name) || "WechatFavorite".equals(name) || "ShortMessage".equals(name) || "Email".equals(name) || "Pinterest".equals(name) || "Yixin".equals(name) || "YixinMoments".equals(name) || "Line".equals(name) || "Bluetooth".equals(name) || "WhatsApp".equals(name) || "Pocket".equals(name) || "BaiduTieba".equals(name) || "Laiwang".equals(name) || "LaiwangMoments".equals(name) || "Alipay".equals(name)) ? false : true : false;
    }
}
