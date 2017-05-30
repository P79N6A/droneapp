package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abl;
import com.google.android.gms.internal.abm;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.abv;
import com.google.android.gms.internal.yx.a;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

@aaa
public class d
  extends yx.a
{
  private String a;
  private Context b;
  private String c;
  private ArrayList<String> d;
  
  public d(String paramString1, ArrayList<String> paramArrayList, Context paramContext, String paramString2)
  {
    this.c = paramString1;
    this.d = paramArrayList;
    this.a = paramString2;
    this.b = paramContext;
  }
  
  protected int a(int paramInt)
  {
    if (paramInt == 0) {
      return 1;
    }
    if (paramInt == 1) {
      return 2;
    }
    if (paramInt == 4) {
      return 3;
    }
    return 0;
  }
  
  public String a()
  {
    return this.c;
  }
  
  Map<String, String> b()
  {
    String str = this.b.getPackageName();
    Object localObject1 = "";
    try
    {
      localObject2 = this.b.getPackageManager().getPackageInfo(str, 0).versionName;
      localObject1 = localObject2;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        Object localObject2;
        long l1;
        long l2;
        abr.d("Error to retrieve app version", localNameNotFoundException);
      }
    }
    l1 = u.i().d().a();
    l2 = SystemClock.elapsedRealtime();
    localObject2 = new HashMap();
    ((Map)localObject2).put("sessionid", u.i().a());
    ((Map)localObject2).put("appid", str);
    ((Map)localObject2).put("osversion", String.valueOf(Build.VERSION.SDK_INT));
    ((Map)localObject2).put("sdkversion", this.a);
    ((Map)localObject2).put("appversion", localObject1);
    ((Map)localObject2).put("timestamp", String.valueOf(l2 - l1));
    return (Map<String, String>)localObject2;
  }
  
  public void b(int paramInt)
  {
    if (paramInt == 1) {
      c();
    }
    Map localMap = b();
    localMap.put("status", String.valueOf(paramInt));
    localMap.put("sku", this.c);
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localLinkedList.add(u.e().a(str, localMap));
    }
    u.e().a(this.b, this.a, localLinkedList);
  }
  
  void c()
  {
    try
    {
      this.b.getClassLoader().loadClass("com.google.ads.conversiontracking.IAPConversionReporter").getDeclaredMethod("reportWithProductId", new Class[] { Context.class, String.class, String.class, Boolean.TYPE }).invoke(null, new Object[] { this.b, this.c, "", Boolean.valueOf(true) });
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      abr.d("Google Conversion Tracking SDK 1.2.0 or above is required to report a conversion.");
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      abr.d("Google Conversion Tracking SDK 1.2.0 or above is required to report a conversion.");
      return;
    }
    catch (Exception localException)
    {
      abr.d("Fail to report a conversion.", localException);
    }
  }
  
  public void c(int paramInt)
  {
    if (paramInt == 0) {
      c();
    }
    Map localMap = b();
    localMap.put("google_play_status", String.valueOf(paramInt));
    localMap.put("sku", this.c);
    localMap.put("status", String.valueOf(a(paramInt)));
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localLinkedList.add(u.e().a(str, localMap));
    }
    u.e().a(this.b, this.a, localLinkedList);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/purchase/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */