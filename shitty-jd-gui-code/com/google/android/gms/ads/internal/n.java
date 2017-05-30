package com.google.android.gms.ads.internal;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.gms.ads.internal.formats.d;
import com.google.android.gms.ads.internal.formats.e;
import com.google.android.gms.c.f;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abi;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.acy;
import com.google.android.gms.internal.acz;
import com.google.android.gms.internal.acz.a;
import com.google.android.gms.internal.uu;
import com.google.android.gms.internal.uu.a;
import com.google.android.gms.internal.vt;
import com.google.android.gms.internal.xg;
import com.google.android.gms.internal.xl;
import com.google.android.gms.internal.xr;
import com.google.android.gms.internal.xu;
import com.google.android.gms.internal.xv;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@aaa
public class n
{
  @Nullable
  public static View a(@Nullable abi paramabi)
  {
    if (paramabi == null)
    {
      abr.b("AdState is null");
      return null;
    }
    if ((b(paramabi)) && (paramabi.b != null)) {
      return paramabi.b.b();
    }
    for (;;)
    {
      try
      {
        if (paramabi.p != null)
        {
          paramabi = paramabi.p.a();
          if (paramabi == null)
          {
            abr.d("View in mediation adapter is null.");
            return null;
          }
          paramabi = (View)f.a(paramabi);
          return paramabi;
        }
      }
      catch (RemoteException paramabi)
      {
        abr.d("Could not get View from mediation adapter.", paramabi);
        return null;
      }
      paramabi = null;
    }
  }
  
  private static d a(xu paramxu)
  {
    return new d(paramxu.a(), paramxu.b(), paramxu.c(), paramxu.d(), paramxu.e(), paramxu.f(), paramxu.g(), paramxu.h(), null, paramxu.l(), null, null);
  }
  
  private static e a(xv paramxv)
  {
    return new e(paramxv.a(), paramxv.b(), paramxv.c(), paramxv.d(), paramxv.e(), paramxv.f(), null, paramxv.j());
  }
  
  static vt a(@Nullable xu paramxu, @Nullable final xv paramxv, final f.a parama)
  {
    new vt()
    {
      public void a(acy paramAnonymousacy, Map<String, String> paramAnonymousMap)
      {
        paramAnonymousMap = paramAnonymousacy.b();
        if (paramAnonymousMap == null) {}
        do
        {
          return;
          try
          {
            if (n.this == null) {
              continue;
            }
            if (!n.this.k())
            {
              n.this.a(f.a(paramAnonymousMap));
              parama.a();
              return;
            }
          }
          catch (RemoteException paramAnonymousacy)
          {
            abr.d("Unable to call handleClick on mapper", paramAnonymousacy);
            return;
          }
          n.a(paramAnonymousacy);
          return;
        } while (paramxv == null);
        if (!paramxv.i())
        {
          paramxv.a(f.a(paramAnonymousMap));
          parama.a();
          return;
        }
        n.a(paramAnonymousacy);
      }
    };
  }
  
  static vt a(CountDownLatch paramCountDownLatch)
  {
    new vt()
    {
      public void a(acy paramAnonymousacy, Map<String, String> paramAnonymousMap)
      {
        n.this.countDown();
        paramAnonymousacy.b().setVisibility(0);
      }
    };
  }
  
  private static String a(@Nullable Bitmap paramBitmap)
  {
    Object localObject = new ByteArrayOutputStream();
    if (paramBitmap == null)
    {
      abr.d("Bitmap is null. Returning empty string");
      return "";
    }
    paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, (OutputStream)localObject);
    localObject = Base64.encodeToString(((ByteArrayOutputStream)localObject).toByteArray(), 0);
    paramBitmap = String.valueOf("data:image/png;base64,");
    localObject = String.valueOf(localObject);
    if (((String)localObject).length() != 0) {
      return paramBitmap.concat((String)localObject);
    }
    return new String(paramBitmap);
  }
  
  static String a(@Nullable uu paramuu)
  {
    if (paramuu == null)
    {
      abr.d("Image is null. Returning empty string");
      return "";
    }
    try
    {
      Object localObject = paramuu.b();
      if (localObject != null)
      {
        localObject = ((Uri)localObject).toString();
        return (String)localObject;
      }
    }
    catch (RemoteException localRemoteException)
    {
      abr.d("Unable to get image uri. Trying data uri next");
    }
    return b(paramuu);
  }
  
  public static void a(@Nullable abi paramabi, f.a parama)
  {
    xv localxv = null;
    acy localacy;
    if ((paramabi != null) && (b(paramabi)))
    {
      localacy = paramabi.b;
      if (localacy == null) {
        break label43;
      }
    }
    label43:
    for (View localView = localacy.b(); localView == null; localView = null)
    {
      abr.d("AdWebView is null");
      return;
    }
    List localList;
    for (;;)
    {
      try
      {
        if (paramabi.o != null)
        {
          localList = paramabi.o.o;
          if ((localList != null) && (!localList.isEmpty())) {
            break;
          }
          abr.d("No template ids present in mediation response");
          return;
        }
      }
      catch (RemoteException paramabi)
      {
        abr.d("Error occurred while recording impression and registering for clicks", paramabi);
        return;
      }
      localList = null;
    }
    if (paramabi.p != null) {}
    for (xu localxu = paramabi.p.h();; localxu = null)
    {
      if (paramabi.p != null) {
        localxv = paramabi.p.i();
      }
      if ((localList.contains("2")) && (localxu != null))
      {
        localxu.b(f.a(localView));
        if (!localxu.j()) {
          localxu.i();
        }
        localacy.l().a("/nativeExpressViewClicked", a(localxu, null, parama));
        return;
      }
      if ((localList.contains("1")) && (localxv != null))
      {
        localxv.b(f.a(localView));
        if (!localxv.h()) {
          localxv.g();
        }
        localacy.l().a("/nativeExpressViewClicked", a(null, localxv, parama));
        return;
      }
      abr.d("No matching template id and mapper");
      return;
    }
  }
  
  private static void a(final acy paramacy, d paramd, final String paramString)
  {
    paramacy.l().a(new acz.a()
    {
      public void a(acy paramAnonymousacy, boolean paramAnonymousBoolean)
      {
        try
        {
          paramAnonymousacy = new JSONObject();
          paramAnonymousacy.put("headline", n.this.a());
          paramAnonymousacy.put("body", n.this.c());
          paramAnonymousacy.put("call_to_action", n.this.e());
          paramAnonymousacy.put("price", n.this.h());
          paramAnonymousacy.put("star_rating", String.valueOf(n.this.f()));
          paramAnonymousacy.put("store", n.this.g());
          paramAnonymousacy.put("icon", n.a(n.this.d()));
          localObject1 = new JSONArray();
          Object localObject2 = n.this.b();
          if (localObject2 != null)
          {
            localObject2 = ((List)localObject2).iterator();
            while (((Iterator)localObject2).hasNext()) {
              ((JSONArray)localObject1).put(n.a(n.a(((Iterator)localObject2).next())));
            }
          }
          paramAnonymousacy.put("images", localObject1);
        }
        catch (JSONException paramAnonymousacy)
        {
          abr.d("Exception occurred when loading assets", paramAnonymousacy);
          return;
        }
        paramAnonymousacy.put("extras", n.a(n.this.n(), paramString));
        Object localObject1 = new JSONObject();
        ((JSONObject)localObject1).put("assets", paramAnonymousacy);
        ((JSONObject)localObject1).put("template_id", "2");
        paramacy.a("google.afma.nativeExpressAds.loadAssets", (JSONObject)localObject1);
      }
    });
  }
  
  private static void a(final acy paramacy, e parame, final String paramString)
  {
    paramacy.l().a(new acz.a()
    {
      public void a(acy paramAnonymousacy, boolean paramAnonymousBoolean)
      {
        try
        {
          paramAnonymousacy = new JSONObject();
          paramAnonymousacy.put("headline", n.this.a());
          paramAnonymousacy.put("body", n.this.c());
          paramAnonymousacy.put("call_to_action", n.this.e());
          paramAnonymousacy.put("advertiser", n.this.f());
          paramAnonymousacy.put("logo", n.a(n.this.d()));
          localObject1 = new JSONArray();
          Object localObject2 = n.this.b();
          if (localObject2 != null)
          {
            localObject2 = ((List)localObject2).iterator();
            while (((Iterator)localObject2).hasNext()) {
              ((JSONArray)localObject1).put(n.a(n.a(((Iterator)localObject2).next())));
            }
          }
          paramAnonymousacy.put("images", localObject1);
        }
        catch (JSONException paramAnonymousacy)
        {
          abr.d("Exception occurred when loading assets", paramAnonymousacy);
          return;
        }
        paramAnonymousacy.put("extras", n.a(n.this.h(), paramString));
        Object localObject1 = new JSONObject();
        ((JSONObject)localObject1).put("assets", paramAnonymousacy);
        ((JSONObject)localObject1).put("template_id", "1");
        paramacy.a("google.afma.nativeExpressAds.loadAssets", (JSONObject)localObject1);
      }
    });
  }
  
  private static void a(acy paramacy, CountDownLatch paramCountDownLatch)
  {
    paramacy.l().a("/nativeExpressAssetsLoaded", a(paramCountDownLatch));
    paramacy.l().a("/nativeExpressAssetsLoadingFailed", b(paramCountDownLatch));
  }
  
  public static boolean a(acy paramacy, xl paramxl, CountDownLatch paramCountDownLatch)
  {
    boolean bool1 = false;
    try
    {
      boolean bool2 = b(paramacy, paramxl, paramCountDownLatch);
      bool1 = bool2;
    }
    catch (RemoteException paramacy)
    {
      for (;;)
      {
        abr.d("Unable to invoke load assets", paramacy);
      }
    }
    catch (RuntimeException paramacy)
    {
      paramCountDownLatch.countDown();
      throw paramacy;
    }
    if (!bool1) {
      paramCountDownLatch.countDown();
    }
    return bool1;
  }
  
  @Nullable
  private static uu b(Object paramObject)
  {
    if ((paramObject instanceof IBinder)) {
      return uu.a.a((IBinder)paramObject);
    }
    return null;
  }
  
  static vt b(CountDownLatch paramCountDownLatch)
  {
    new vt()
    {
      public void a(acy paramAnonymousacy, Map<String, String> paramAnonymousMap)
      {
        abr.d("Adapter returned an ad, but assets substitution failed");
        n.this.countDown();
        paramAnonymousacy.destroy();
      }
    };
  }
  
  private static String b(uu paramuu)
  {
    try
    {
      paramuu = paramuu.a();
      if (paramuu == null)
      {
        abr.d("Drawable is null. Returning empty string");
        return "";
      }
      paramuu = (Drawable)f.a(paramuu);
      if (!(paramuu instanceof BitmapDrawable))
      {
        abr.d("Drawable is not an instance of BitmapDrawable. Returning empty string");
        return "";
      }
    }
    catch (RemoteException paramuu)
    {
      abr.d("Unable to get drawable. Returning empty string");
      return "";
    }
    return a(((BitmapDrawable)paramuu).getBitmap());
  }
  
  private static JSONObject b(@Nullable Bundle paramBundle, String paramString)
  {
    JSONObject localJSONObject = new JSONObject();
    if ((paramBundle == null) || (TextUtils.isEmpty(paramString))) {
      return localJSONObject;
    }
    paramString = new JSONObject(paramString);
    Iterator localIterator = paramString.keys();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (paramBundle.containsKey(str)) {
        if ("image".equals(paramString.getString(str)))
        {
          Object localObject = paramBundle.get(str);
          if ((localObject instanceof Bitmap)) {
            localJSONObject.put(str, a((Bitmap)localObject));
          } else {
            abr.d("Invalid type. An image type extra should return a bitmap");
          }
        }
        else if ((paramBundle.get(str) instanceof Bitmap))
        {
          abr.d("Invalid asset type. Bitmap should be returned only for image type");
        }
        else
        {
          localJSONObject.put(str, String.valueOf(paramBundle.get(str)));
        }
      }
    }
    return localJSONObject;
  }
  
  private static void b(acy paramacy)
  {
    View.OnClickListener localOnClickListener = paramacy.F();
    if (localOnClickListener != null) {
      localOnClickListener.onClick(paramacy.b());
    }
  }
  
  public static boolean b(@Nullable abi paramabi)
  {
    return (paramabi != null) && (paramabi.n) && (paramabi.o != null) && (paramabi.o.l != null);
  }
  
  private static boolean b(acy paramacy, xl paramxl, CountDownLatch paramCountDownLatch)
  {
    Object localObject = paramacy.b();
    if (localObject == null)
    {
      abr.d("AdWebView is null");
      return false;
    }
    ((View)localObject).setVisibility(4);
    localObject = paramxl.b.o;
    if ((localObject == null) || (((List)localObject).isEmpty()))
    {
      abr.d("No template ids present in mediation response");
      return false;
    }
    a(paramacy, paramCountDownLatch);
    paramCountDownLatch = paramxl.c.h();
    xv localxv = paramxl.c.i();
    if ((((List)localObject).contains("2")) && (paramCountDownLatch != null))
    {
      a(paramacy, a(paramCountDownLatch), paramxl.b.n);
      paramCountDownLatch = paramxl.b.l;
      paramxl = paramxl.b.m;
      if (paramxl == null) {
        break label188;
      }
      paramacy.loadDataWithBaseURL(paramxl, paramCountDownLatch, "text/html", "UTF-8", null);
    }
    for (;;)
    {
      return true;
      if ((((List)localObject).contains("1")) && (localxv != null))
      {
        a(paramacy, a(localxv), paramxl.b.n);
        break;
      }
      abr.d("No matching template id and mapper");
      return false;
      label188:
      paramacy.loadData(paramCountDownLatch, "text/html", "UTF-8");
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */