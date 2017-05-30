package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Parcel;
import android.support.annotation.Nullable;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.ads.internal.l;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.common.util.e;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Pattern;

@aaa
public class wp
{
  private final Map<wq, wr> a = new HashMap();
  private final LinkedList<wq> b = new LinkedList();
  @Nullable
  private wm c;
  
  @Nullable
  static Bundle a(AdRequestParcel paramAdRequestParcel)
  {
    paramAdRequestParcel = paramAdRequestParcel.m;
    if (paramAdRequestParcel == null) {
      return null;
    }
    return paramAdRequestParcel.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
  }
  
  private static void a(Bundle paramBundle, String paramString)
  {
    paramString = paramString.split("/", 2);
    if (paramString.length == 0) {}
    do
    {
      return;
      String str = paramString[0];
      if (paramString.length == 1)
      {
        paramBundle.remove(str);
        return;
      }
      paramBundle = paramBundle.getBundle(str);
    } while (paramBundle == null);
    a(paramBundle, paramString[1]);
  }
  
  private static void a(String paramString, wq paramwq)
  {
    if (abr.a(2)) {
      abr.e(String.format(paramString, new Object[] { paramwq }));
    }
  }
  
  private String[] a(String paramString)
  {
    try
    {
      String[] arrayOfString = paramString.split("\000");
      int i = 0;
      for (;;)
      {
        paramString = arrayOfString;
        if (i >= arrayOfString.length) {
          break;
        }
        arrayOfString[i] = new String(Base64.decode(arrayOfString[i], 0), "UTF-8");
        i += 1;
      }
      return paramString;
    }
    catch (UnsupportedEncodingException paramString)
    {
      paramString = new String[0];
    }
  }
  
  static AdRequestParcel b(AdRequestParcel paramAdRequestParcel)
  {
    AdRequestParcel localAdRequestParcel = d(paramAdRequestParcel);
    Bundle localBundle = a(localAdRequestParcel);
    paramAdRequestParcel = localBundle;
    if (localBundle == null)
    {
      paramAdRequestParcel = new Bundle();
      localAdRequestParcel.m.putBundle("com.google.ads.mediation.admob.AdMobAdapter", paramAdRequestParcel);
    }
    paramAdRequestParcel.putBoolean("_skipMediation", true);
    return localAdRequestParcel;
  }
  
  private boolean b(String paramString)
  {
    try
    {
      boolean bool = Pattern.matches((String)uf.aC.c(), paramString);
      return bool;
    }
    catch (RuntimeException paramString)
    {
      u.i().a(paramString, "InterstitialAdPool.isExcludedAdUnit");
    }
    return false;
  }
  
  static boolean c(AdRequestParcel paramAdRequestParcel)
  {
    paramAdRequestParcel = paramAdRequestParcel.m;
    if (paramAdRequestParcel == null) {}
    do
    {
      return false;
      paramAdRequestParcel = paramAdRequestParcel.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
    } while ((paramAdRequestParcel == null) || (!paramAdRequestParcel.containsKey("_skipMediation")));
    return true;
  }
  
  static AdRequestParcel d(AdRequestParcel paramAdRequestParcel)
  {
    Parcel localParcel = Parcel.obtain();
    paramAdRequestParcel.writeToParcel(localParcel, 0);
    localParcel.setDataPosition(0);
    paramAdRequestParcel = (AdRequestParcel)AdRequestParcel.CREATOR.createFromParcel(localParcel);
    localParcel.recycle();
    AdRequestParcel.a(paramAdRequestParcel);
    return paramAdRequestParcel;
  }
  
  private static AdRequestParcel e(AdRequestParcel paramAdRequestParcel)
  {
    paramAdRequestParcel = d(paramAdRequestParcel);
    String[] arrayOfString = ((String)uf.ay.c()).split(",");
    int j = arrayOfString.length;
    int i = 0;
    while (i < j)
    {
      String str = arrayOfString[i];
      a(paramAdRequestParcel.m, str);
      i += 1;
    }
    return paramAdRequestParcel;
  }
  
  private String e()
  {
    try
    {
      StringBuilder localStringBuilder = new StringBuilder();
      Iterator localIterator = this.b.iterator();
      while (localIterator.hasNext())
      {
        localStringBuilder.append(Base64.encodeToString(((wq)localIterator.next()).toString().getBytes("UTF-8"), 0));
        if (localIterator.hasNext()) {
          localStringBuilder.append("\000");
        }
      }
      str = localUnsupportedEncodingException.toString();
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      return "";
    }
    String str;
    return str;
  }
  
  @Nullable
  wr.a a(AdRequestParcel paramAdRequestParcel, String paramString)
  {
    if (b(paramString)) {
      return null;
    }
    int i = new aak.a(this.c.a()).a().m;
    AdRequestParcel localAdRequestParcel = e(paramAdRequestParcel);
    wq localwq = new wq(localAdRequestParcel, paramString, i);
    paramAdRequestParcel = (wr)this.a.get(localwq);
    if (paramAdRequestParcel == null)
    {
      a("Interstitial pool created at %s.", localwq);
      paramAdRequestParcel = new wr(localAdRequestParcel, paramString, i);
      this.a.put(localwq, paramAdRequestParcel);
    }
    for (;;)
    {
      this.b.remove(localwq);
      this.b.add(localwq);
      paramAdRequestParcel.g();
      while (this.b.size() > ((Integer)uf.az.c()).intValue())
      {
        paramString = (wq)this.b.remove();
        wr localwr = (wr)this.a.get(paramString);
        a("Evicting interstitial queue for %s.", paramString);
        while (localwr.d() > 0) {
          localwr.a(null).a.I();
        }
        this.a.remove(paramString);
      }
      while (paramAdRequestParcel.d() > 0)
      {
        paramString = paramAdRequestParcel.a(localAdRequestParcel);
        if ((paramString.e) && (u.k().a() - paramString.d > 1000L * ((Integer)uf.aB.c()).intValue()))
        {
          a("Expired interstitial at %s.", localwq);
        }
        else
        {
          if (paramString.b != null) {}
          for (paramAdRequestParcel = " (inline) ";; paramAdRequestParcel = " ")
          {
            a(String.valueOf(paramAdRequestParcel).length() + 34 + "Pooled interstitial" + paramAdRequestParcel + "returned at %s.", localwq);
            return paramString;
          }
        }
      }
      return null;
    }
  }
  
  void a()
  {
    if (this.c == null) {
      return;
    }
    Iterator localIterator = this.a.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      wq localwq = (wq)((Map.Entry)localObject).getKey();
      localObject = (wr)((Map.Entry)localObject).getValue();
      if (abr.a(2))
      {
        int i = ((wr)localObject).d();
        int j = ((wr)localObject).e();
        if (j < i) {
          abr.e(String.format("Loading %s/%s pooled interstitials for %s.", new Object[] { Integer.valueOf(i - j), Integer.valueOf(i), localwq }));
        }
      }
      ((wr)localObject).f();
      while (((wr)localObject).d() < ((Integer)uf.aA.c()).intValue())
      {
        a("Pooling and loading one new interstitial for %s.", localwq);
        ((wr)localObject).a(this.c);
      }
    }
    b();
  }
  
  void a(wm paramwm)
  {
    if (this.c == null)
    {
      this.c = paramwm.b();
      c();
    }
  }
  
  void b()
  {
    if (this.c == null) {
      return;
    }
    SharedPreferences.Editor localEditor = this.c.a().getSharedPreferences("com.google.android.gms.ads.internal.interstitial.InterstitialAdPool", 0).edit();
    localEditor.clear();
    Iterator localIterator = this.a.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      wq localwq = (wq)((Map.Entry)localObject).getKey();
      localObject = (wr)((Map.Entry)localObject).getValue();
      if (((wr)localObject).h())
      {
        localObject = new wt((wr)localObject).a();
        localEditor.putString(localwq.toString(), (String)localObject);
        a("Saved interstitial queue for %s.", localwq);
      }
    }
    localEditor.putString("PoolKeys", e());
    localEditor.apply();
  }
  
  void b(AdRequestParcel paramAdRequestParcel, String paramString)
  {
    if (this.c == null) {
      return;
    }
    int i = new aak.a(this.c.a()).a().m;
    AdRequestParcel localAdRequestParcel = e(paramAdRequestParcel);
    wq localwq = new wq(localAdRequestParcel, paramString, i);
    wr localwr2 = (wr)this.a.get(localwq);
    wr localwr1 = localwr2;
    if (localwr2 == null)
    {
      a("Interstitial pool created at %s.", localwq);
      localwr1 = new wr(localAdRequestParcel, paramString, i);
      this.a.put(localwq, localwr1);
    }
    localwr1.a(this.c, paramAdRequestParcel);
    localwr1.g();
    a("Inline entry added to the queue at %s.", localwq);
  }
  
  void c()
  {
    if (this.c == null) {}
    for (;;)
    {
      return;
      Object localObject1 = this.c.a().getSharedPreferences("com.google.android.gms.ads.internal.interstitial.InterstitialAdPool", 0);
      d();
      Object localObject2;
      try
      {
        HashMap localHashMap = new HashMap();
        localObject2 = ((SharedPreferences)localObject1).getAll().entrySet().iterator();
        while (((Iterator)localObject2).hasNext())
        {
          Object localObject3 = (Map.Entry)((Iterator)localObject2).next();
          if (!((String)((Map.Entry)localObject3).getKey()).equals("PoolKeys"))
          {
            Object localObject4 = wt.a((String)((Map.Entry)localObject3).getValue());
            localObject3 = new wq(((wt)localObject4).a, ((wt)localObject4).b, ((wt)localObject4).c);
            if (!this.a.containsKey(localObject3))
            {
              localObject4 = new wr(((wt)localObject4).a, ((wt)localObject4).b, ((wt)localObject4).c);
              this.a.put(localObject3, localObject4);
              localHashMap.put(((wq)localObject3).toString(), localObject3);
              a("Restored interstitial queue for %s.", (wq)localObject3);
            }
          }
        }
        localObject1 = a(((SharedPreferences)localObject1).getString("PoolKeys", ""));
      }
      catch (Throwable localThrowable)
      {
        u.i().a(localThrowable, "InterstitialAdPool.restore");
        abr.d("Malformed preferences value for InterstitialAdPool.", localThrowable);
        this.a.clear();
        this.b.clear();
        return;
      }
      int j = localObject1.length;
      int i = 0;
      while (i < j)
      {
        localObject2 = (wq)localThrowable.get(localObject1[i]);
        if (this.a.containsKey(localObject2)) {
          this.b.add(localObject2);
        }
        i += 1;
      }
    }
  }
  
  void d()
  {
    while (this.b.size() > 0)
    {
      wq localwq = (wq)this.b.remove();
      wr localwr = (wr)this.a.get(localwq);
      a("Flushing interstitial queue for %s.", localwq);
      while (localwr.d() > 0) {
        localwr.a(null).a.I();
      }
      this.a.remove(localwq);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/wp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */