package com.google.android.gms.internal;

import android.support.v4.util.SimpleArrayMap;
import com.google.android.gms.ads.internal.formats.a;
import com.google.android.gms.ads.internal.formats.c;
import com.google.android.gms.ads.internal.formats.f;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONObject;

@aaa
public class zy
  implements zu.a<f>
{
  private final boolean a;
  
  public zy(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }
  
  private <K, V> SimpleArrayMap<K, V> a(SimpleArrayMap<K, Future<V>> paramSimpleArrayMap)
  {
    SimpleArrayMap localSimpleArrayMap = new SimpleArrayMap();
    int i = 0;
    while (i < paramSimpleArrayMap.size())
    {
      localSimpleArrayMap.put(paramSimpleArrayMap.keyAt(i), ((Future)paramSimpleArrayMap.valueAt(i)).get());
      i += 1;
    }
    return localSimpleArrayMap;
  }
  
  private void a(zu paramzu, JSONObject paramJSONObject, SimpleArrayMap<String, Future<c>> paramSimpleArrayMap)
  {
    paramSimpleArrayMap.put(paramJSONObject.getString("name"), paramzu.a(paramJSONObject, "image_value", this.a));
  }
  
  private void a(JSONObject paramJSONObject, SimpleArrayMap<String, String> paramSimpleArrayMap)
  {
    paramSimpleArrayMap.put(paramJSONObject.getString("name"), paramJSONObject.getString("string_value"));
  }
  
  public f b(zu paramzu, JSONObject paramJSONObject)
  {
    SimpleArrayMap localSimpleArrayMap1 = new SimpleArrayMap();
    SimpleArrayMap localSimpleArrayMap2 = new SimpleArrayMap();
    aco localaco = paramzu.b(paramJSONObject);
    JSONArray localJSONArray = paramJSONObject.getJSONArray("custom_assets");
    int i = 0;
    if (i < localJSONArray.length())
    {
      Object localObject = localJSONArray.getJSONObject(i);
      String str = ((JSONObject)localObject).getString("type");
      if ("string".equals(str)) {
        a((JSONObject)localObject, localSimpleArrayMap2);
      }
      for (;;)
      {
        i += 1;
        break;
        if (!"image".equals(str)) {
          break label108;
        }
        a(paramzu, (JSONObject)localObject, localSimpleArrayMap1);
      }
      label108:
      localObject = String.valueOf(str);
      if (((String)localObject).length() != 0) {}
      for (localObject = "Unknown custom asset type: ".concat((String)localObject);; localObject = new String("Unknown custom asset type: "))
      {
        abr.d((String)localObject);
        break;
      }
    }
    return new f(paramJSONObject.getString("custom_template_id"), a(localSimpleArrayMap1), localSimpleArrayMap2, (a)localaco.get());
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/zy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */