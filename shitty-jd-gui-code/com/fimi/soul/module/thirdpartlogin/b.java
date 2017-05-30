package com.fimi.soul.module.thirdpartlogin;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import cn.sharesdk.facebook.Facebook;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDK;
import java.util.HashMap;

public class b
  implements Handler.Callback
{
  private static final int a = 1;
  private static final int b = 2;
  private static final int c = 3;
  private d d;
  private String e;
  private Context f;
  private Handler g = new Handler(Looper.getMainLooper(), this);
  
  public void a(Context paramContext)
  {
    this.f = paramContext.getApplicationContext();
    paramContext = ShareSDK.getPlatform(this.e);
    if (paramContext == null) {
      return;
    }
    paramContext.removeAccount(true);
    if (Facebook.NAME.equals(this.e)) {
      paramContext.SSOSetting(false);
    }
    for (;;)
    {
      paramContext.setPlatformActionListener(new PlatformActionListener()
      {
        public void onCancel(Platform paramAnonymousPlatform, int paramAnonymousInt)
        {
          if (paramAnonymousPlatform != null) {
            paramAnonymousPlatform.removeAccount(true);
          }
          if (paramAnonymousInt == 8)
          {
            Message localMessage = new Message();
            localMessage.what = 1;
            localMessage.arg2 = paramAnonymousInt;
            localMessage.obj = paramAnonymousPlatform;
            b.a(b.this).sendMessage(localMessage);
          }
        }
        
        public void onComplete(Platform paramAnonymousPlatform, int paramAnonymousInt, HashMap<String, Object> paramAnonymousHashMap)
        {
          if (paramAnonymousInt == 8)
          {
            Message localMessage = new Message();
            localMessage.what = 3;
            localMessage.arg2 = paramAnonymousInt;
            localMessage.obj = new Object[] { paramAnonymousPlatform.getName(), paramAnonymousHashMap };
            b.a(b.this).sendMessage(localMessage);
          }
        }
        
        public void onError(Platform paramAnonymousPlatform, int paramAnonymousInt, Throwable paramAnonymousThrowable)
        {
          if (paramAnonymousPlatform != null) {
            paramAnonymousPlatform.removeAccount(true);
          }
          if (paramAnonymousInt == 8)
          {
            paramAnonymousPlatform = new Message();
            paramAnonymousPlatform.what = 2;
            paramAnonymousPlatform.arg2 = paramAnonymousInt;
            paramAnonymousPlatform.obj = paramAnonymousThrowable;
            b.a(b.this).sendMessage(paramAnonymousPlatform);
          }
          for (;;)
          {
            paramAnonymousThrowable.printStackTrace();
            return;
            if (paramAnonymousInt == 1)
            {
              paramAnonymousPlatform = new Message();
              paramAnonymousPlatform.what = 1;
              paramAnonymousPlatform.arg2 = paramAnonymousInt;
              paramAnonymousPlatform.obj = paramAnonymousThrowable;
              b.a(b.this).sendMessage(paramAnonymousPlatform);
            }
          }
        }
      });
      paramContext.showUser(null);
      return;
      paramContext.SSOSetting(true);
    }
  }
  
  public void a(d paramd)
  {
    this.d = paramd;
  }
  
  public void a(String paramString)
  {
    this.e = paramString;
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    }
    Object localObject;
    do
    {
      do
      {
        return false;
        paramMessage = new HashMap();
        this.f.getResources().getString(2131362051);
      } while (this.d == null);
      this.d.a("", paramMessage);
      return false;
      paramMessage = (Throwable)paramMessage.obj;
      localObject = "caught error: " + paramMessage.getMessage();
      HashMap localHashMap = new HashMap();
      localHashMap.put("msg", localObject);
      if (this.d != null) {
        this.d.a("", localHashMap);
      }
      paramMessage.printStackTrace();
      return false;
      localObject = (Object[])paramMessage.obj;
      paramMessage = (String)localObject[0];
      localObject = (HashMap)localObject[1];
    } while ((this.d == null) || (!this.d.a(paramMessage, (HashMap)localObject)));
    return false;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/thirdpartlogin/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */