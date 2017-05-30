package com.fimi.soul.module.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
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
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class e
  implements Handler.Callback, PlatformActionListener
{
  protected boolean a;
  protected HashMap<String, Object> b;
  protected boolean c;
  protected ArrayList<a> d;
  protected HashMap<String, String> e;
  protected PlatformActionListener f = this;
  protected f g;
  protected boolean h;
  protected Context i;
  
  private void a(final String paramString)
  {
    UIHandler.sendEmptyMessage(0, new Handler.Callback()
    {
      public boolean handleMessage(Message paramAnonymousMessage)
      {
        int i = R.getStringRes(e.this.i, paramString);
        if (i > 0)
        {
          Toast.makeText(e.this.i, i, 0).show();
          return false;
        }
        Toast.makeText(e.this.i, paramString, 0).show();
        return false;
      }
    });
  }
  
  private void e(Platform paramPlatform)
  {
    if (c(paramPlatform))
    {
      Platform.ShareParams localShareParams = d(paramPlatform);
      if (localShareParams != null)
      {
        ShareSDK.logDemoEvent(3, null);
        if (this.g != null) {
          this.g.a(paramPlatform, localShareParams);
        }
        a(this.i, paramPlatform, localShareParams);
      }
    }
  }
  
  public final void a()
  {
    this.h = true;
  }
  
  public final void a(Context paramContext)
  {
    this.i = paramContext;
    if (this.b.containsKey("platform"))
    {
      paramContext = ShareSDK.getPlatform(String.valueOf(this.b.get("platform")));
      boolean bool1 = paramContext instanceof CustomPlatform;
      boolean bool2 = a(paramContext);
      if ((this.c) || (bool1) || (bool2))
      {
        b(paramContext);
        return;
      }
      e(paramContext);
      return;
    }
    b(paramContext);
  }
  
  protected abstract void a(Context paramContext, Platform paramPlatform, Platform.ShareParams paramShareParams);
  
  public final void a(PlatformActionListener paramPlatformActionListener)
  {
    Object localObject = paramPlatformActionListener;
    if (paramPlatformActionListener == null) {
      localObject = this;
    }
    this.f = ((PlatformActionListener)localObject);
  }
  
  public final void a(f paramf)
  {
    this.g = paramf;
  }
  
  public final void a(ArrayList<a> paramArrayList)
  {
    this.d = paramArrayList;
  }
  
  public final void a(HashMap<String, Object> paramHashMap)
  {
    this.b = paramHashMap;
  }
  
  public final void a(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }
  
  final boolean a(Platform paramPlatform)
  {
    Object localObject = paramPlatform.getName();
    if (("Wechat".equals(localObject)) || ("WechatMoments".equals(localObject)) || ("WechatFavorite".equals(localObject)) || ("ShortMessage".equals(localObject)) || ("Email".equals(localObject)) || ("Qzone".equals(localObject)) || ("QQ".equals(localObject)) || ("Pinterest".equals(localObject)) || ("Instagram".equals(localObject)) || ("Yixin".equals(localObject)) || ("YixinMoments".equals(localObject)) || ("QZone".equals(localObject)) || ("Mingdao".equals(localObject)) || ("Line".equals(localObject)) || ("KakaoStory".equals(localObject)) || ("KakaoTalk".equals(localObject)) || ("Bluetooth".equals(localObject)) || ("WhatsApp".equals(localObject)) || ("BaiduTieba".equals(localObject)) || ("Laiwang".equals(localObject)) || ("LaiwangMoments".equals(localObject)) || ("Alipay".equals(localObject)) || ("AlipayMoments".equals(localObject)) || ("FacebookMessenger".equals(localObject)) || ("GooglePlus".equals(localObject))) {}
    do
    {
      do
      {
        return true;
        if (!"Evernote".equals(localObject)) {
          break;
        }
      } while ("true".equals(paramPlatform.getDevinfo("ShareByAppClient")));
      while ((!"SinaWeibo".equals(localObject)) || (!"true".equals(paramPlatform.getDevinfo("ShareByAppClient")))) {
        return false;
      }
      localObject = new Intent("android.intent.action.SEND");
      ((Intent)localObject).setPackage("com.sina.weibo");
      ((Intent)localObject).setType("image/*");
      ResolveInfo localResolveInfo = paramPlatform.getContext().getPackageManager().resolveActivity((Intent)localObject, 0);
      localObject = localResolveInfo;
      if (localResolveInfo == null)
      {
        localObject = new Intent("android.intent.action.SEND");
        ((Intent)localObject).setPackage("com.sina.weibog3");
        ((Intent)localObject).setType("image/*");
        localObject = paramPlatform.getContext().getPackageManager().resolveActivity((Intent)localObject, 0);
      }
    } while (localObject != null);
    return false;
  }
  
  protected abstract void b(Context paramContext);
  
  final void b(Platform paramPlatform)
  {
    if (c(paramPlatform))
    {
      Platform.ShareParams localShareParams = d(paramPlatform);
      if (localShareParams != null)
      {
        a("ssdk_oks_sharing");
        if (this.g != null) {
          this.g.a(paramPlatform, localShareParams);
        }
        if (this.h) {
          paramPlatform.SSOSetting(this.h);
        }
        paramPlatform.setPlatformActionListener(this.f);
        paramPlatform.share(localShareParams);
      }
    }
  }
  
  public final void b(HashMap<String, String> paramHashMap)
  {
    this.e = paramHashMap;
  }
  
  public final void b(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }
  
  final boolean c(Platform paramPlatform)
  {
    boolean bool1 = true;
    String str = paramPlatform.getName();
    int j;
    if (("Alipay".equals(str)) || ("AlipayMoments".equals(str)))
    {
      j = 1;
      if ((j == 0) || (paramPlatform.isClientValid())) {
        break label56;
      }
      a("ssdk_alipay_client_inavailable");
      bool1 = false;
    }
    label56:
    do
    {
      return bool1;
      j = 0;
      break;
      if (("KakaoTalk".equals(str)) && (!paramPlatform.isClientValid()))
      {
        a("ssdk_kakaotalk_client_inavailable");
        return false;
      }
      if (("KakaoStory".equals(str)) && (!paramPlatform.isClientValid()))
      {
        a("ssdk_kakaostory_client_inavailable");
        return false;
      }
      if (("Line".equals(str)) && (!paramPlatform.isClientValid()))
      {
        a("ssdk_line_client_inavailable");
        return false;
      }
      if (("WhatsApp".equals(str)) && (!paramPlatform.isClientValid()))
      {
        a("ssdk_whatsapp_client_inavailable");
        return false;
      }
      if (("Pinterest".equals(str)) && (!paramPlatform.isClientValid())) {
        return false;
      }
      if (("Instagram".equals(str)) && (!paramPlatform.isClientValid())) {
        return false;
      }
      if (("QZone".equals(str)) && (!paramPlatform.isClientValid())) {
        return false;
      }
      boolean bool2 = "Laiwang".equals(str);
      boolean bool3 = "LaiwangMoments".equals(str);
      if (((bool2) || (bool3)) && (!paramPlatform.isClientValid())) {
        return false;
      }
      if (("YixinMoments".equals(str)) || ("Yixin".equals(str))) {}
      for (j = 1; (j != 0) && (!paramPlatform.isClientValid()); j = 0) {
        return false;
      }
      if (("WechatFavorite".equals(str)) || ("Wechat".equals(str)) || ("WechatMoments".equals(str))) {}
      for (j = 1; (j != 0) && (!paramPlatform.isClientValid()); j = 0)
      {
        j = R.getStringRes(this.i, "no_install_apk");
        a(this.i.getString(j));
        return false;
      }
      if (("FacebookMessenger".equals(str)) && (!paramPlatform.isClientValid())) {
        return false;
      }
    } while (this.b.containsKey("shareType"));
    paramPlatform = String.valueOf(this.b.get("imagePath"));
    if ((paramPlatform != null) && (new File(paramPlatform).exists())) {
      if ((paramPlatform.endsWith(".gif")) && (j != 0)) {
        j = 9;
      }
    }
    for (;;)
    {
      this.b.put("shareType", Integer.valueOf(j));
      return true;
      if ((this.b.containsKey("url")) && (!TextUtils.isEmpty(this.b.get("url").toString())))
      {
        if ((this.b.containsKey("musicUrl")) && (!TextUtils.isEmpty(this.b.get("musicUrl").toString())) && (j != 0))
        {
          j = 5;
          continue;
          paramPlatform = (Bitmap)R.forceCast(this.b.get("viewToShare"));
          if ((paramPlatform != null) && (!paramPlatform.isRecycled()))
          {
            if ((!this.b.containsKey("url")) || (TextUtils.isEmpty(this.b.get("url").toString()))) {
              break label763;
            }
            if ((this.b.containsKey("musicUrl")) && (!TextUtils.isEmpty(this.b.get("musicUrl").toString())) && (j != 0)) {
              j = 5;
            }
          }
          else
          {
            paramPlatform = this.b.get("imageUrl");
            if ((paramPlatform == null) || (TextUtils.isEmpty(String.valueOf(paramPlatform)))) {
              break label768;
            }
            if ((String.valueOf(paramPlatform).endsWith(".gif")) && (j != 0))
            {
              j = 9;
              continue;
            }
            if ((!this.b.containsKey("url")) || (TextUtils.isEmpty(this.b.get("url").toString()))) {
              break label763;
            }
            if ((this.b.containsKey("musicUrl")) && (!TextUtils.isEmpty(this.b.get("musicUrl").toString())) && (j != 0))
            {
              j = 5;
              continue;
            }
          }
        }
        j = 4;
        continue;
      }
      label763:
      j = 2;
      continue;
      label768:
      j = 1;
    }
  }
  
  final Platform.ShareParams d(Platform paramPlatform)
  {
    if ((paramPlatform == null) || (this.b == null))
    {
      a("ssdk_oks_share_failed");
      return null;
    }
    try
    {
      Object localObject = (String)R.forceCast(this.b.get("imagePath"));
      Bitmap localBitmap = (Bitmap)R.forceCast(this.b.get("viewToShare"));
      if ((TextUtils.isEmpty((CharSequence)localObject)) && (localBitmap != null) && (!localBitmap.isRecycled()))
      {
        paramPlatform = new File(R.getCachePath(paramPlatform.getContext(), "screenshot"), String.valueOf(System.currentTimeMillis()) + ".jpg");
        localObject = new FileOutputStream(paramPlatform);
        localBitmap.compress(Bitmap.CompressFormat.JPEG, 100, (OutputStream)localObject);
        ((FileOutputStream)localObject).flush();
        ((FileOutputStream)localObject).close();
        this.b.put("imagePath", paramPlatform.getAbsolutePath());
      }
      return new Platform.ShareParams(this.b);
    }
    catch (Throwable paramPlatform)
    {
      paramPlatform.printStackTrace();
      a("ssdk_oks_share_failed");
    }
    return null;
  }
  
  public final boolean handleMessage(Message paramMessage)
  {
    switch (paramMessage.arg1)
    {
    }
    for (;;)
    {
      return false;
      int j = R.getStringRes(this.i, "ssdk_oks_share_completed");
      if (j > 0)
      {
        a(this.i.getString(j));
        continue;
        paramMessage = paramMessage.obj.getClass().getSimpleName();
        if (("WechatClientNotExistException".equals(paramMessage)) || ("WechatTimelineNotSupportedException".equals(paramMessage)) || ("WechatFavoriteNotSupportedException".equals(paramMessage)))
        {
          j = R.getStringRes(this.i, "no_install_apk");
          a(this.i.getString(j));
        }
        else if ("GooglePlusClientNotExistException".equals(paramMessage))
        {
          a("ssdk_google_plus_client_inavailable");
        }
        else if ("QQClientNotExistException".equals(paramMessage))
        {
          a("ssdk_qq_client_inavailable");
        }
        else if (("YixinClientNotExistException".equals(paramMessage)) || ("YixinTimelineNotSupportedException".equals(paramMessage)))
        {
          a("ssdk_yixin_client_inavailable");
        }
        else if ("KakaoTalkClientNotExistException".equals(paramMessage))
        {
          a("ssdk_kakaotalk_client_inavailable");
        }
        else if ("KakaoStoryClientNotExistException".equals(paramMessage))
        {
          a("ssdk_kakaostory_client_inavailable");
        }
        else if ("WhatsAppClientNotExistException".equals(paramMessage))
        {
          a("ssdk_whatsapp_client_inavailable");
        }
        else if ("FacebookMessengerClientNotExistException".equals(paramMessage))
        {
          a("ssdk_facebookmessenger_client_inavailable");
        }
        else
        {
          a("ssdk_oks_share_failed");
          continue;
          a("ssdk_oks_share_canceled");
        }
      }
    }
  }
  
  public final void onCancel(Platform paramPlatform, int paramInt)
  {
    Message localMessage = new Message();
    localMessage.arg1 = 3;
    localMessage.arg2 = paramInt;
    localMessage.obj = paramPlatform;
    UIHandler.sendMessage(localMessage, this);
    ShareSDK.logDemoEvent(5, paramPlatform);
  }
  
  public final void onComplete(Platform paramPlatform, int paramInt, HashMap<String, Object> paramHashMap)
  {
    paramHashMap = new Message();
    paramHashMap.arg1 = 1;
    paramHashMap.arg2 = paramInt;
    paramHashMap.obj = paramPlatform;
    UIHandler.sendMessage(paramHashMap, this);
  }
  
  public final void onError(Platform paramPlatform, int paramInt, Throwable paramThrowable)
  {
    paramThrowable.printStackTrace();
    Message localMessage = new Message();
    localMessage.arg1 = 2;
    localMessage.arg2 = paramInt;
    localMessage.obj = paramThrowable;
    UIHandler.sendMessage(localMessage, this);
    ShareSDK.logDemoEvent(4, paramPlatform);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */