package com.fimi.soul.module.thirdpartlogin;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import cn.sharesdk.facebook.Facebook;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformDb;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.twitter.Twitter;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.biz.manager.x;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.User;
import com.xiaomi.mipush.sdk.MiPushClient;
import java.io.File;
import java.util.HashMap;

public class c
{
  public static c a;
  public static final String c = "LoginManager";
  public Context b;
  public String d;
  private User e = new User();
  private String f;
  
  public static c a()
  {
    if (a == null) {
      a = new c();
    }
    return a;
  }
  
  private void a(PlatformDb paramPlatformDb, final a parama)
  {
    Log.i("LoginManager", "thirPlaformLogin(" + paramPlatformDb.toString() + "," + parama.toString() + ")");
    String str1 = paramPlatformDb.getUserId();
    String str2 = paramPlatformDb.getUserIcon();
    String str3 = paramPlatformDb.getPlatformNname();
    Log.i("LoginManager", "platformName:" + str3);
    Log.i("LoginManager", "userIcon:" + str2);
    this.e.setXiaomiID(str1);
    this.e.setappType("0");
    this.e.setName(paramPlatformDb.getUserName());
    this.e.setNickName(paramPlatformDb.getUserName());
    this.e.setUserImgUrl(str2);
    if (str3.equalsIgnoreCase(Facebook.NAME)) {
      this.d = "1";
    }
    for (;;)
    {
      this.e.setloginChannel(this.d);
      x.a(this.b).d(this.e, new k()
      {
        public void a(PlaneMsg paramAnonymousPlaneMsg, File paramAnonymousFile)
        {
          c.a(c.this, paramAnonymousPlaneMsg.getErrorMessage());
          if (paramAnonymousPlaneMsg.isSuccess())
          {
            MiPushClient.registerPush(c.this.b, "2882303761517518920", "5761751863920");
            if (parama != null) {
              parama.a(0, "");
            }
          }
          do
          {
            do
            {
              return;
              if (c.a(c.this) == null) {
                break;
              }
            } while (parama == null);
            parama.a(1, String.valueOf(c.a(c.this)));
            return;
          } while (parama == null);
          parama.a(1, c.this.b.getResources().getString(2131362440));
        }
      });
      return;
      if (str3.equalsIgnoreCase(Twitter.NAME)) {
        this.d = "2";
      }
    }
  }
  
  private void b(String paramString, final a parama)
  {
    Log.i("LoginManager", "innerLogin(" + paramString + ")");
    b localb = new b();
    localb.a(paramString);
    this.d = paramString;
    localb.a(new d()
    {
      public boolean a(f paramAnonymousf)
      {
        return true;
      }
      
      public boolean a(String paramAnonymousString, HashMap<String, Object> paramAnonymousHashMap)
      {
        if (TextUtils.isEmpty(paramAnonymousString)) {
          if (parama != null) {
            parama.a(-1, paramAnonymousHashMap.get("msg"));
          }
        }
        for (;;)
        {
          return false;
          paramAnonymousString = ShareSDK.getPlatform(paramAnonymousString).getDb();
          c.a(c.this, paramAnonymousString, parama);
        }
      }
    });
    localb.a(this.b);
  }
  
  public void a(Context paramContext)
  {
    this.b = paramContext;
    ShareSDK.initSDK(paramContext);
  }
  
  public void a(String paramString, a parama)
  {
    b(paramString, parama);
  }
  
  public void b()
  {
    if (!TextUtils.isEmpty(this.d)) {
      ShareSDK.getPlatform(this.d).removeAccount(true);
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(int paramInt, Object paramObject);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/thirdpartlogin/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */