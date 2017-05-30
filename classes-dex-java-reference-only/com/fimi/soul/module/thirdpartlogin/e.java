package com.fimi.soul.module.thirdpartlogin;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import cn.sharesdk.framework.Platform;

public class e
{
  public static Bitmap a(String paramString)
  {
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = true;
    BitmapFactory.decodeFile(paramString, localOptions);
    localOptions.inJustDecodeBounds = false;
    int i = localOptions.outWidth;
    int j = localOptions.outHeight;
    if ((i > j) && (i > 480.0F)) {
      i = (int)(localOptions.outWidth / 480.0F);
    }
    for (;;)
    {
      j = i;
      if (i <= 0) {
        j = 1;
      }
      localOptions.inSampleSize = j;
      localOptions.inPreferredConfig = Bitmap.Config.ARGB_8888;
      localOptions.inPurgeable = true;
      localOptions.inInputShareable = true;
      return BitmapFactory.decodeFile(paramString, localOptions);
      if ((i < j) && (j > 800.0F)) {
        i = (int)(localOptions.outHeight / 800.0F);
      } else {
        i = 1;
      }
    }
  }
  
  public static String a(int paramInt)
  {
    switch (paramInt)
    {
    case 3: 
    case 4: 
    default: 
      return "UNKNOWN";
    case 1: 
      return "ACTION_AUTHORIZING";
    case 2: 
      return "ACTION_GETTING_FRIEND_LIST";
    case 6: 
      return "ACTION_FOLLOWING_USER";
    case 5: 
      return "ACTION_SENDING_DIRECT_MESSAGE";
    case 7: 
      return "ACTION_TIMELINE";
    case 8: 
      return "ACTION_USER_INFOR";
    }
    return "ACTION_SHARE";
  }
  
  public static boolean a(Platform paramPlatform)
  {
    if (paramPlatform == null) {}
    String str;
    do
    {
      return false;
      str = paramPlatform.getName();
    } while ((("Wechat".equals(str)) && (!paramPlatform.isClientValid())) || (("GooglePlus".equals(str)) && (!paramPlatform.isClientValid())) || ("WechatMoments".equals(str)) || ("WechatFavorite".equals(str)) || ("ShortMessage".equals(str)) || ("Email".equals(str)) || ("Pinterest".equals(str)) || ("Yixin".equals(str)) || ("YixinMoments".equals(str)) || ("Line".equals(str)) || ("Bluetooth".equals(str)) || ("WhatsApp".equals(str)) || ("Pocket".equals(str)) || ("BaiduTieba".equals(str)) || ("Laiwang".equals(str)) || ("LaiwangMoments".equals(str)) || ("Alipay".equals(str)));
    return true;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/thirdpartlogin/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */