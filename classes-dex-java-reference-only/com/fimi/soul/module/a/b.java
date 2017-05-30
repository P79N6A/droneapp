package com.fimi.soul.module.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDK;
import com.mob.tools.utils.BitmapHelper;
import com.mob.tools.utils.R;
import java.util.ArrayList;
import java.util.HashMap;

public class b
{
  private HashMap<String, Object> a = new HashMap();
  
  public b()
  {
    this.a.put("customers", new ArrayList());
    this.a.put("hiddenPlatforms", new HashMap());
  }
  
  public String a()
  {
    if (this.a.containsKey("text")) {
      return String.valueOf(this.a.get("text"));
    }
    return null;
  }
  
  public void a(float paramFloat)
  {
    this.a.put("latitude", Float.valueOf(paramFloat));
  }
  
  public void a(Context paramContext)
  {
    boolean bool2 = false;
    HashMap localHashMap = new HashMap();
    localHashMap.putAll(this.a);
    ShareSDK.initSDK(paramContext.getApplicationContext());
    ShareSDK.logDemoEvent(1, null);
    try
    {
      i = R.parseInt(String.valueOf(localHashMap.remove("theme")));
      e locale = d.a(i).b();
      locale.a(localHashMap);
      if (localHashMap.containsKey("dialogMode"))
      {
        bool1 = ((Boolean)localHashMap.remove("dialogMode")).booleanValue();
        locale.a(bool1);
        bool1 = bool2;
        if (localHashMap.containsKey("silent")) {
          bool1 = ((Boolean)localHashMap.remove("silent")).booleanValue();
        }
        locale.b(bool1);
        locale.a((ArrayList)localHashMap.remove("customers"));
        locale.b((HashMap)localHashMap.remove("hiddenPlatforms"));
        locale.a((PlatformActionListener)localHashMap.remove("callback"));
        locale.a((f)localHashMap.remove("customizeCallback"));
        if ((localHashMap.containsKey("disableSSO")) && (((Boolean)localHashMap.remove("disableSSO")).booleanValue())) {
          locale.a();
        }
        locale.a(paramContext.getApplicationContext());
        return;
      }
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        int i = 0;
        continue;
        boolean bool1 = false;
      }
    }
  }
  
  public void a(Bitmap paramBitmap, String paramString, View.OnClickListener paramOnClickListener)
  {
    a locala = new a();
    locala.b = paramBitmap;
    locala.a = paramString;
    locala.c = paramOnClickListener;
    ((ArrayList)R.forceCast(this.a.get("customers"))).add(locala);
  }
  
  public void a(View paramView)
  {
    try
    {
      paramView = BitmapHelper.captureView(paramView, paramView.getWidth(), paramView.getHeight());
      this.a.put("viewToShare", paramView);
      return;
    }
    catch (Throwable paramView)
    {
      paramView.printStackTrace();
    }
  }
  
  public void a(PlatformActionListener paramPlatformActionListener)
  {
    this.a.put("callback", paramPlatformActionListener);
  }
  
  public void a(d paramd)
  {
    this.a.put("theme", Integer.valueOf(paramd.a()));
  }
  
  public void a(f paramf)
  {
    this.a.put("customizeCallback", paramf);
  }
  
  public void a(String paramString)
  {
    this.a.put("address", paramString);
  }
  
  public void a(boolean paramBoolean)
  {
    this.a.put("silent", Boolean.valueOf(paramBoolean));
  }
  
  public void a(String[] paramArrayOfString)
  {
    this.a.put("imageArray", paramArrayOfString);
  }
  
  public PlatformActionListener b()
  {
    return (PlatformActionListener)R.forceCast(this.a.get("callback"));
  }
  
  public void b(float paramFloat)
  {
    this.a.put("longitude", Float.valueOf(paramFloat));
  }
  
  public void b(String paramString)
  {
    this.a.put("title", paramString);
  }
  
  public f c()
  {
    return (f)R.forceCast(this.a.get("customizeCallback"));
  }
  
  public void c(String paramString)
  {
    this.a.put("titleUrl", paramString);
  }
  
  public void d()
  {
    this.a.put("disableSSO", Boolean.valueOf(true));
  }
  
  public void d(String paramString)
  {
    this.a.put("text", paramString);
  }
  
  @Deprecated
  public void e()
  {
    this.a.put("dialogMode", Boolean.valueOf(true));
  }
  
  public void e(String paramString)
  {
    if (!TextUtils.isEmpty(paramString)) {
      this.a.put("imagePath", paramString);
    }
  }
  
  public void f()
  {
    this.a.put("isShareTencentWeibo", Boolean.valueOf(true));
  }
  
  public void f(String paramString)
  {
    if (!TextUtils.isEmpty(paramString)) {
      this.a.put("imageUrl", paramString);
    }
  }
  
  public void g(String paramString)
  {
    this.a.put("url", paramString);
  }
  
  public void h(String paramString)
  {
    this.a.put("filePath", paramString);
  }
  
  public void i(String paramString)
  {
    this.a.put("comment", paramString);
  }
  
  public void j(String paramString)
  {
    this.a.put("site", paramString);
  }
  
  public void k(String paramString)
  {
    this.a.put("siteUrl", paramString);
  }
  
  public void l(String paramString)
  {
    this.a.put("venueName", paramString);
  }
  
  public void m(String paramString)
  {
    this.a.put("venueDescription", paramString);
  }
  
  public void n(String paramString)
  {
    this.a.put("platform", paramString);
  }
  
  public void o(String paramString)
  {
    this.a.put("installurl", paramString);
  }
  
  public void p(String paramString)
  {
    this.a.put("executeurl", paramString);
  }
  
  public void q(String paramString)
  {
    this.a.put("musicUrl", paramString);
  }
  
  public void r(String paramString)
  {
    this.a.put("url", paramString);
    this.a.put("shareType", Integer.valueOf(6));
  }
  
  public void s(String paramString)
  {
    ((HashMap)R.forceCast(this.a.get("hiddenPlatforms"))).put(paramString, paramString);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */