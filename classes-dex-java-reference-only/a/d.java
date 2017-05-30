package a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.util.SparseArray;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class d
{
  private static final String a = "user_agent";
  private static final String b = "version";
  private static final String c = "referer_app_link";
  private static final String d = "app_name";
  private static final String e = "package";
  private static final String f = "1.0";
  private static e g;
  private final c h;
  private final Bundle i;
  private final Bundle j;
  
  public d(c paramc, Bundle paramBundle1, Bundle paramBundle2)
  {
    if (paramc == null) {
      throw new IllegalArgumentException("appLink must not be null.");
    }
    Bundle localBundle = paramBundle1;
    if (paramBundle1 == null) {
      localBundle = new Bundle();
    }
    paramBundle1 = paramBundle2;
    if (paramBundle2 == null) {
      paramBundle1 = new Bundle();
    }
    this.h = paramc;
    this.i = localBundle;
    this.j = paramBundle1;
  }
  
  public static a a(Context paramContext, c paramc)
  {
    return new d(paramc, null, null).a(paramContext);
  }
  
  public static l<a> a(Context paramContext, Uri paramUri)
  {
    return a(paramContext, paramUri, c(paramContext));
  }
  
  public static l<a> a(Context paramContext, Uri paramUri, e parame)
  {
    parame.a(paramUri).c(new j()
    {
      public d.a a(l<c> paramAnonymousl)
      {
        return d.a(this.a, (c)paramAnonymousl.e());
      }
    }, l.b);
  }
  
  public static l<a> a(Context paramContext, String paramString)
  {
    return a(paramContext, paramString, c(paramContext));
  }
  
  public static l<a> a(Context paramContext, String paramString, e parame)
  {
    return a(paramContext, Uri.parse(paramString), parame);
  }
  
  public static l<a> a(Context paramContext, URL paramURL)
  {
    return a(paramContext, paramURL, c(paramContext));
  }
  
  public static l<a> a(Context paramContext, URL paramURL, e parame)
  {
    return a(paramContext, Uri.parse(paramURL.toString()), parame);
  }
  
  private Object a(Object paramObject)
  {
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    int i7 = 0;
    Object localObject;
    if ((paramObject instanceof Bundle)) {
      localObject = a((Bundle)paramObject);
    }
    do
    {
      return localObject;
      if ((paramObject instanceof CharSequence)) {
        return paramObject.toString();
      }
      if ((paramObject instanceof List))
      {
        localObject = new JSONArray();
        paramObject = ((List)paramObject).iterator();
        while (((Iterator)paramObject).hasNext()) {
          ((JSONArray)localObject).put(a(((Iterator)paramObject).next()));
        }
        return localObject;
      }
      if ((paramObject instanceof SparseArray))
      {
        localObject = new JSONArray();
        paramObject = (SparseArray)paramObject;
        k = i7;
        while (k < ((SparseArray)paramObject).size())
        {
          ((JSONArray)localObject).put(((SparseArray)paramObject).keyAt(k), a(((SparseArray)paramObject).valueAt(k)));
          k += 1;
        }
        return localObject;
      }
      if ((paramObject instanceof Character)) {
        return paramObject.toString();
      }
      localObject = paramObject;
    } while ((paramObject instanceof Boolean));
    if ((paramObject instanceof Number))
    {
      if (((paramObject instanceof Double)) || ((paramObject instanceof Float))) {
        return Double.valueOf(((Number)paramObject).doubleValue());
      }
      return Long.valueOf(((Number)paramObject).longValue());
    }
    if ((paramObject instanceof boolean[]))
    {
      localObject = new JSONArray();
      paramObject = (boolean[])paramObject;
      m = paramObject.length;
      while (k < m)
      {
        ((JSONArray)localObject).put(a(Boolean.valueOf(paramObject[k])));
        k += 1;
      }
      return localObject;
    }
    if ((paramObject instanceof char[]))
    {
      localObject = new JSONArray();
      paramObject = (char[])paramObject;
      n = paramObject.length;
      k = m;
      while (k < n)
      {
        ((JSONArray)localObject).put(a(Character.valueOf(paramObject[k])));
        k += 1;
      }
      return localObject;
    }
    if ((paramObject instanceof CharSequence[]))
    {
      localObject = new JSONArray();
      paramObject = (CharSequence[])paramObject;
      m = paramObject.length;
      k = n;
      while (k < m)
      {
        ((JSONArray)localObject).put(a(paramObject[k]));
        k += 1;
      }
      return localObject;
    }
    if ((paramObject instanceof double[]))
    {
      localObject = new JSONArray();
      paramObject = (double[])paramObject;
      m = paramObject.length;
      k = i1;
      while (k < m)
      {
        ((JSONArray)localObject).put(a(Double.valueOf(paramObject[k])));
        k += 1;
      }
      return localObject;
    }
    if ((paramObject instanceof float[]))
    {
      localObject = new JSONArray();
      paramObject = (float[])paramObject;
      m = paramObject.length;
      k = i2;
      while (k < m)
      {
        ((JSONArray)localObject).put(a(Float.valueOf(paramObject[k])));
        k += 1;
      }
      return localObject;
    }
    if ((paramObject instanceof int[]))
    {
      localObject = new JSONArray();
      paramObject = (int[])paramObject;
      m = paramObject.length;
      k = i3;
      while (k < m)
      {
        ((JSONArray)localObject).put(a(Integer.valueOf(paramObject[k])));
        k += 1;
      }
      return localObject;
    }
    if ((paramObject instanceof long[]))
    {
      localObject = new JSONArray();
      paramObject = (long[])paramObject;
      m = paramObject.length;
      k = i4;
      while (k < m)
      {
        ((JSONArray)localObject).put(a(Long.valueOf(paramObject[k])));
        k += 1;
      }
      return localObject;
    }
    if ((paramObject instanceof short[]))
    {
      localObject = new JSONArray();
      paramObject = (short[])paramObject;
      m = paramObject.length;
      k = i5;
      while (k < m)
      {
        ((JSONArray)localObject).put(a(Short.valueOf(paramObject[k])));
        k += 1;
      }
      return localObject;
    }
    if ((paramObject instanceof String[]))
    {
      localObject = new JSONArray();
      paramObject = (String[])paramObject;
      m = paramObject.length;
      k = i6;
      while (k < m)
      {
        ((JSONArray)localObject).put(a(paramObject[k]));
        k += 1;
      }
      return localObject;
    }
    return null;
  }
  
  private JSONObject a(Bundle paramBundle)
  {
    JSONObject localJSONObject = new JSONObject();
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localJSONObject.put(str, a(paramBundle.get(str)));
    }
    return localJSONObject;
  }
  
  public static void a(e parame)
  {
    g = parame;
  }
  
  private void a(Context paramContext, Intent paramIntent, a parama, JSONException paramJSONException)
  {
    HashMap localHashMap = new HashMap();
    if (paramJSONException != null) {
      localHashMap.put("error", paramJSONException.getLocalizedMessage());
    }
    if (parama.b()) {}
    for (paramJSONException = "1";; paramJSONException = "0")
    {
      localHashMap.put("success", paramJSONException);
      localHashMap.put("type", parama.a());
      k.a(paramContext, "al_nav_out", paramIntent, localHashMap);
      return;
    }
  }
  
  private Bundle b(Context paramContext)
  {
    Bundle localBundle1 = new Bundle();
    Bundle localBundle2 = new Bundle();
    if (paramContext != null)
    {
      Object localObject = paramContext.getPackageName();
      if (localObject != null) {
        localBundle2.putString("package", (String)localObject);
      }
      localObject = paramContext.getApplicationInfo();
      if (localObject != null)
      {
        paramContext = paramContext.getString(((ApplicationInfo)localObject).labelRes);
        if (paramContext != null) {
          localBundle2.putString("app_name", paramContext);
        }
      }
    }
    localBundle1.putAll(b());
    localBundle1.putString("target_url", a().a().toString());
    localBundle1.putString("version", "1.0");
    localBundle1.putString("user_agent", "Bolts Android 1.1.4");
    localBundle1.putBundle("referer_app_link", localBundle2);
    localBundle1.putBundle("extras", c());
    return localBundle1;
  }
  
  private static e c(Context paramContext)
  {
    if (d() != null) {
      return d();
    }
    return new m(paramContext);
  }
  
  public static e d()
  {
    return g;
  }
  
  public c a()
  {
    return this.h;
  }
  
  public a a(Context paramContext)
  {
    Object localObject2 = paramContext.getPackageManager();
    Object localObject4 = b(paramContext);
    Object localObject5 = a().b().iterator();
    Object localObject1;
    do
    {
      if (!((Iterator)localObject5).hasNext()) {
        break label267;
      }
      c.a locala = (c.a)((Iterator)localObject5).next();
      localObject1 = new Intent("android.intent.action.VIEW");
      if (locala.a() == null) {
        break;
      }
      ((Intent)localObject1).setData(locala.a());
      ((Intent)localObject1).setPackage(locala.d());
      if (locala.c() != null) {
        ((Intent)localObject1).setClassName(locala.d(), locala.c());
      }
      ((Intent)localObject1).putExtra("al_applink_data", (Bundle)localObject4);
    } while (((PackageManager)localObject2).resolveActivity((Intent)localObject1, 65536) == null);
    for (;;)
    {
      localObject2 = a.a;
      if (localObject1 != null)
      {
        localObject4 = a.c;
        localObject2 = localObject1;
        localObject1 = localObject4;
      }
      for (;;)
      {
        a(paramContext, (Intent)localObject2, (a)localObject1, null);
        if (localObject2 != null) {
          paramContext.startActivity((Intent)localObject2);
        }
        return (a)localObject1;
        ((Intent)localObject1).setData(this.h.a());
        break;
        localObject5 = a().c();
        if (localObject5 != null)
        {
          try
          {
            localObject2 = a((Bundle)localObject4);
            localObject2 = new Intent("android.intent.action.VIEW", ((Uri)localObject5).buildUpon().appendQueryParameter("al_applink_data", ((JSONObject)localObject2).toString()).build());
            localObject1 = a.b;
          }
          catch (JSONException localJSONException)
          {
            a(paramContext, (Intent)localObject1, a.a, localJSONException);
            throw new RuntimeException(localJSONException);
          }
        }
        else
        {
          localObject1 = localJSONException;
          Object localObject3 = null;
        }
      }
      label267:
      localObject1 = null;
    }
  }
  
  public Bundle b()
  {
    return this.j;
  }
  
  public Bundle c()
  {
    return this.i;
  }
  
  public static enum a
  {
    private String d;
    private boolean e;
    
    private a(String paramString, boolean paramBoolean)
    {
      this.d = paramString;
      this.e = paramBoolean;
    }
    
    public String a()
    {
      return this.d;
    }
    
    public boolean b()
    {
      return this.e;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */