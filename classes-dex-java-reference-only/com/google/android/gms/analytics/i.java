package com.google.android.gms.analytics;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.analytics.a.a;
import com.google.android.gms.analytics.a.b;
import com.google.android.gms.analytics.internal.g;
import com.google.android.gms.analytics.internal.p;
import com.google.android.gms.analytics.internal.s;
import com.google.android.gms.analytics.internal.u;
import com.google.android.gms.analytics.internal.v;
import com.google.android.gms.analytics.internal.x;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.ado;
import com.google.android.gms.internal.adp;
import com.google.android.gms.internal.adq;
import com.google.android.gms.internal.adr;
import com.google.android.gms.internal.ads;
import com.google.android.gms.internal.adt;
import com.google.android.gms.internal.adu;
import com.google.android.gms.internal.adv;
import com.google.android.gms.internal.adw;
import com.google.android.gms.internal.adx;
import com.google.android.gms.internal.ady;
import com.google.android.gms.internal.adz;
import com.google.android.gms.internal.aea;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class i
  extends s
  implements r
{
  private static DecimalFormat a;
  private final v b;
  private final String c;
  private final Uri d;
  private final boolean e;
  private final boolean f;
  
  public i(v paramv, String paramString)
  {
    this(paramv, paramString, true, false);
  }
  
  public i(v paramv, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramv);
    d.a(paramString);
    this.b = paramv;
    this.c = paramString;
    this.e = paramBoolean1;
    this.f = paramBoolean2;
    this.d = a(this.c);
  }
  
  static Uri a(String paramString)
  {
    d.a(paramString);
    Uri.Builder localBuilder = new Uri.Builder();
    localBuilder.scheme("uri");
    localBuilder.authority("google-analytics.com");
    localBuilder.path(paramString);
    return localBuilder.build();
  }
  
  static String a(double paramDouble)
  {
    if (a == null) {
      a = new DecimalFormat("0.######");
    }
    return a.format(paramDouble);
  }
  
  private static String a(Object paramObject)
  {
    if (paramObject == null) {
      paramObject = null;
    }
    String str;
    do
    {
      return (String)paramObject;
      if (!(paramObject instanceof String)) {
        break;
      }
      str = (String)paramObject;
      paramObject = str;
    } while (!TextUtils.isEmpty(str));
    return null;
    if ((paramObject instanceof Double))
    {
      paramObject = (Double)paramObject;
      if (((Double)paramObject).doubleValue() != 0.0D) {
        return a(((Double)paramObject).doubleValue());
      }
      return null;
    }
    if ((paramObject instanceof Boolean))
    {
      if (paramObject != Boolean.FALSE) {
        return "1";
      }
      return null;
    }
    return String.valueOf(paramObject);
  }
  
  private static String a(Map<String, String> paramMap)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      if (localStringBuilder.length() != 0) {
        localStringBuilder.append(", ");
      }
      localStringBuilder.append((String)localEntry.getKey());
      localStringBuilder.append("=");
      localStringBuilder.append((String)localEntry.getValue());
    }
    return localStringBuilder.toString();
  }
  
  private static void a(Map<String, String> paramMap, String paramString, double paramDouble)
  {
    if (paramDouble != 0.0D) {
      paramMap.put(paramString, a(paramDouble));
    }
  }
  
  private static void a(Map<String, String> paramMap, String paramString, int paramInt1, int paramInt2)
  {
    if ((paramInt1 > 0) && (paramInt2 > 0)) {
      paramMap.put(paramString, 23 + paramInt1 + "x" + paramInt2);
    }
  }
  
  private static void a(Map<String, String> paramMap, String paramString1, String paramString2)
  {
    if (!TextUtils.isEmpty(paramString2)) {
      paramMap.put(paramString1, paramString2);
    }
  }
  
  private static void a(Map<String, String> paramMap, String paramString, boolean paramBoolean)
  {
    if (paramBoolean) {
      paramMap.put(paramString, "1");
    }
  }
  
  public static Map<String, String> b(l paraml)
  {
    HashMap localHashMap = new HashMap();
    Object localObject1 = (ads)paraml.a(ads.class);
    Object localObject2;
    Object localObject3;
    if (localObject1 != null)
    {
      localObject1 = ((ads)localObject1).a().entrySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Map.Entry)((Iterator)localObject1).next();
        localObject3 = a(((Map.Entry)localObject2).getValue());
        if (localObject3 != null) {
          localHashMap.put((String)((Map.Entry)localObject2).getKey(), localObject3);
        }
      }
    }
    localObject1 = (adx)paraml.a(adx.class);
    if (localObject1 != null)
    {
      a(localHashMap, "t", ((adx)localObject1).a());
      a(localHashMap, "cid", ((adx)localObject1).b());
      a(localHashMap, "uid", ((adx)localObject1).c());
      a(localHashMap, "sc", ((adx)localObject1).f());
      a(localHashMap, "sf", ((adx)localObject1).h());
      a(localHashMap, "ni", ((adx)localObject1).g());
      a(localHashMap, "adid", ((adx)localObject1).d());
      a(localHashMap, "ate", ((adx)localObject1).e());
    }
    localObject1 = (ady)paraml.a(ady.class);
    if (localObject1 != null)
    {
      a(localHashMap, "cd", ((ady)localObject1).b());
      a(localHashMap, "a", ((ady)localObject1).c());
      a(localHashMap, "dr", ((ady)localObject1).d());
    }
    localObject1 = (adv)paraml.a(adv.class);
    if (localObject1 != null)
    {
      a(localHashMap, "ec", ((adv)localObject1).a());
      a(localHashMap, "ea", ((adv)localObject1).b());
      a(localHashMap, "el", ((adv)localObject1).c());
      a(localHashMap, "ev", ((adv)localObject1).d());
    }
    localObject1 = (adp)paraml.a(adp.class);
    if (localObject1 != null)
    {
      a(localHashMap, "cn", ((adp)localObject1).a());
      a(localHashMap, "cs", ((adp)localObject1).b());
      a(localHashMap, "cm", ((adp)localObject1).c());
      a(localHashMap, "ck", ((adp)localObject1).d());
      a(localHashMap, "cc", ((adp)localObject1).e());
      a(localHashMap, "ci", ((adp)localObject1).f());
      a(localHashMap, "anid", ((adp)localObject1).g());
      a(localHashMap, "gclid", ((adp)localObject1).h());
      a(localHashMap, "dclid", ((adp)localObject1).i());
      a(localHashMap, "aclid", ((adp)localObject1).j());
    }
    localObject1 = (adw)paraml.a(adw.class);
    if (localObject1 != null)
    {
      a(localHashMap, "exd", ((adw)localObject1).a());
      a(localHashMap, "exf", ((adw)localObject1).b());
    }
    localObject1 = (adz)paraml.a(adz.class);
    if (localObject1 != null)
    {
      a(localHashMap, "sn", ((adz)localObject1).a());
      a(localHashMap, "sa", ((adz)localObject1).b());
      a(localHashMap, "st", ((adz)localObject1).c());
    }
    localObject1 = (aea)paraml.a(aea.class);
    if (localObject1 != null)
    {
      a(localHashMap, "utv", ((aea)localObject1).a());
      a(localHashMap, "utt", ((aea)localObject1).b());
      a(localHashMap, "utc", ((aea)localObject1).c());
      a(localHashMap, "utl", ((aea)localObject1).d());
    }
    localObject1 = (adq)paraml.a(adq.class);
    if (localObject1 != null)
    {
      localObject1 = ((adq)localObject1).a().entrySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Map.Entry)((Iterator)localObject1).next();
        localObject3 = j.b(((Integer)((Map.Entry)localObject2).getKey()).intValue());
        if (!TextUtils.isEmpty((CharSequence)localObject3)) {
          localHashMap.put(localObject3, (String)((Map.Entry)localObject2).getValue());
        }
      }
    }
    localObject1 = (adr)paraml.a(adr.class);
    if (localObject1 != null)
    {
      localObject1 = ((adr)localObject1).a().entrySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Map.Entry)((Iterator)localObject1).next();
        localObject3 = j.d(((Integer)((Map.Entry)localObject2).getKey()).intValue());
        if (!TextUtils.isEmpty((CharSequence)localObject3)) {
          localHashMap.put(localObject3, a(((Double)((Map.Entry)localObject2).getValue()).doubleValue()));
        }
      }
    }
    localObject1 = (adu)paraml.a(adu.class);
    if (localObject1 != null)
    {
      localObject2 = ((adu)localObject1).a();
      if (localObject2 != null)
      {
        localObject2 = ((b)localObject2).a().entrySet().iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (Map.Entry)((Iterator)localObject2).next();
          if (((String)((Map.Entry)localObject3).getKey()).startsWith("&")) {
            localHashMap.put(((String)((Map.Entry)localObject3).getKey()).substring(1), (String)((Map.Entry)localObject3).getValue());
          } else {
            localHashMap.put((String)((Map.Entry)localObject3).getKey(), (String)((Map.Entry)localObject3).getValue());
          }
        }
      }
      localObject2 = ((adu)localObject1).d().iterator();
      int i = 1;
      while (((Iterator)localObject2).hasNext())
      {
        localHashMap.putAll(((com.google.android.gms.analytics.a.c)((Iterator)localObject2).next()).e(j.h(i)));
        i += 1;
      }
      localObject2 = ((adu)localObject1).b().iterator();
      i = 1;
      while (((Iterator)localObject2).hasNext())
      {
        localHashMap.putAll(((a)((Iterator)localObject2).next()).g(j.f(i)));
        i += 1;
      }
      localObject2 = ((adu)localObject1).c().entrySet().iterator();
      i = 1;
      if (((Iterator)localObject2).hasNext())
      {
        localObject3 = (Map.Entry)((Iterator)localObject2).next();
        localObject1 = (List)((Map.Entry)localObject3).getValue();
        String str1 = j.k(i);
        Iterator localIterator = ((List)localObject1).iterator();
        int j = 1;
        if (localIterator.hasNext())
        {
          a locala = (a)localIterator.next();
          localObject1 = String.valueOf(str1);
          String str2 = String.valueOf(j.i(j));
          if (str2.length() != 0) {}
          for (localObject1 = ((String)localObject1).concat(str2);; localObject1 = new String((String)localObject1))
          {
            localHashMap.putAll(locala.g((String)localObject1));
            j += 1;
            break;
          }
        }
        if (!TextUtils.isEmpty((CharSequence)((Map.Entry)localObject3).getKey()))
        {
          localObject1 = String.valueOf(str1);
          str1 = String.valueOf("nm");
          if (str1.length() == 0) {
            break label1283;
          }
        }
        label1283:
        for (localObject1 = ((String)localObject1).concat(str1);; localObject1 = new String((String)localObject1))
        {
          localHashMap.put(localObject1, (String)((Map.Entry)localObject3).getKey());
          i += 1;
          break;
        }
      }
    }
    localObject1 = (adt)paraml.a(adt.class);
    if (localObject1 != null)
    {
      a(localHashMap, "ul", ((adt)localObject1).f());
      a(localHashMap, "sd", ((adt)localObject1).a());
      a(localHashMap, "sr", ((adt)localObject1).b(), ((adt)localObject1).c());
      a(localHashMap, "vp", ((adt)localObject1).d(), ((adt)localObject1).e());
    }
    paraml = (ado)paraml.a(ado.class);
    if (paraml != null)
    {
      a(localHashMap, "an", paraml.a());
      a(localHashMap, "aid", paraml.c());
      a(localHashMap, "aiid", paraml.d());
      a(localHashMap, "av", paraml.b());
    }
    return localHashMap;
  }
  
  public Uri a()
  {
    return this.d;
  }
  
  public void a(l paraml)
  {
    d.a(paraml);
    d.b(paraml.f(), "Can't deliver not submitted measurement");
    d.c("deliver should be called on worker thread");
    Object localObject2 = paraml.a();
    Object localObject1 = (adx)((l)localObject2).b(adx.class);
    if (TextUtils.isEmpty(((adx)localObject1).a())) {
      p().a(b((l)localObject2), "Ignoring measurement without type");
    }
    do
    {
      return;
      if (TextUtils.isEmpty(((adx)localObject1).b()))
      {
        p().a(b((l)localObject2), "Ignoring measurement without client id");
        return;
      }
    } while (this.b.k().f());
    double d1 = ((adx)localObject1).h();
    if (p.a(d1, ((adx)localObject1).b()))
    {
      b("Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(d1));
      return;
    }
    localObject2 = b((l)localObject2);
    ((Map)localObject2).put("v", "1");
    ((Map)localObject2).put("_v", u.b);
    ((Map)localObject2).put("tid", this.c);
    if (this.b.k().e())
    {
      c("Dry run is enabled. GoogleAnalytics would have sent", a((Map)localObject2));
      return;
    }
    HashMap localHashMap = new HashMap();
    p.a(localHashMap, "uid", ((adx)localObject1).c());
    Object localObject3 = (ado)paraml.a(ado.class);
    if (localObject3 != null)
    {
      p.a(localHashMap, "an", ((ado)localObject3).a());
      p.a(localHashMap, "aid", ((ado)localObject3).c());
      p.a(localHashMap, "av", ((ado)localObject3).b());
      p.a(localHashMap, "aiid", ((ado)localObject3).d());
    }
    localObject3 = ((adx)localObject1).b();
    String str = this.c;
    if (!TextUtils.isEmpty(((adx)localObject1).d())) {}
    for (boolean bool = true;; bool = false)
    {
      localObject1 = new x(0L, (String)localObject3, str, bool, 0L, localHashMap);
      ((Map)localObject2).put("_s", String.valueOf(t().a((x)localObject1)));
      paraml = new com.google.android.gms.analytics.internal.c(p(), (Map)localObject2, paraml.d(), true);
      t().a(paraml);
      return;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/analytics/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */