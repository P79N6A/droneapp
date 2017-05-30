package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.ads.internal.formats.a;
import com.google.android.gms.ads.internal.formats.c;
import com.google.android.gms.ads.internal.formats.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import org.json.JSONObject;

@aaa
public class zx
  implements zu.a<e>
{
  private final boolean a;
  private final boolean b;
  
  public zx(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.a = paramBoolean1;
    this.b = paramBoolean2;
  }
  
  public e b(zu paramzu, JSONObject paramJSONObject)
  {
    Object localObject = paramzu.a(paramJSONObject, "images", true, this.a, this.b);
    aco localaco = paramzu.a(paramJSONObject, "secondary_image", false, this.a);
    paramzu = paramzu.b(paramJSONObject);
    ArrayList localArrayList = new ArrayList();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      localArrayList.add((c)((aco)((Iterator)localObject).next()).get());
    }
    return new e(paramJSONObject.getString("headline"), localArrayList, paramJSONObject.getString("body"), (uu)localaco.get(), paramJSONObject.getString("call_to_action"), paramJSONObject.getString("advertiser"), (a)paramzu.get(), new Bundle());
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/zx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */