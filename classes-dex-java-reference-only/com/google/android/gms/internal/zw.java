package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.ads.internal.formats.a;
import com.google.android.gms.ads.internal.formats.c;
import com.google.android.gms.ads.internal.formats.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;

@aaa
public class zw
  implements zu.a<d>
{
  private final boolean a;
  private final boolean b;
  
  public zw(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.a = paramBoolean1;
    this.b = paramBoolean2;
  }
  
  private acy a(aco<acy> paramaco)
  {
    try
    {
      paramaco = (acy)paramaco.get(((Integer)uf.bO.c()).intValue(), TimeUnit.SECONDS);
      return paramaco;
    }
    catch (InterruptedException paramaco)
    {
      abr.d("InterruptedException occurred while waiting for video to load", paramaco);
      Thread.currentThread().interrupt();
      return null;
    }
    catch (ExecutionException paramaco)
    {
      for (;;)
      {
        abr.d("Exception occurred while waiting for video to load", paramaco);
      }
    }
    catch (CancellationException paramaco)
    {
      for (;;) {}
    }
    catch (TimeoutException paramaco)
    {
      for (;;) {}
    }
  }
  
  public d b(zu paramzu, JSONObject paramJSONObject)
  {
    Object localObject2 = paramzu.a(paramJSONObject, "images", true, this.a, this.b);
    Object localObject3 = paramzu.a(paramJSONObject, "app_icon", true, this.a);
    Object localObject1 = paramzu.a(paramJSONObject, "video");
    paramzu = paramzu.b(paramJSONObject);
    ArrayList localArrayList = new ArrayList();
    localObject2 = ((List)localObject2).iterator();
    while (((Iterator)localObject2).hasNext()) {
      localArrayList.add((c)((aco)((Iterator)localObject2).next()).get());
    }
    acy localacy = a((aco)localObject1);
    localObject1 = paramJSONObject.getString("headline");
    localObject2 = paramJSONObject.getString("body");
    localObject3 = (uu)((Future)localObject3).get();
    String str1 = paramJSONObject.getString("call_to_action");
    double d = paramJSONObject.optDouble("rating", -1.0D);
    String str2 = paramJSONObject.optString("store");
    String str3 = paramJSONObject.optString("price");
    a locala = (a)paramzu.get();
    Bundle localBundle = new Bundle();
    if (localacy != null)
    {
      paramzu = localacy.z();
      if (localacy == null) {
        break label254;
      }
    }
    label254:
    for (paramJSONObject = localacy.b();; paramJSONObject = null)
    {
      return new d((String)localObject1, localArrayList, (String)localObject2, (uu)localObject3, str1, d, str2, str3, locala, localBundle, paramzu, paramJSONObject);
      paramzu = null;
      break;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/zw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */