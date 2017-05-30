package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@aaa
public final class xg
{
  public final String a;
  public final String b;
  public final List<String> c;
  public final String d;
  public final String e;
  public final List<String> f;
  public final List<String> g;
  public final List<String> h;
  public final String i;
  public final List<String> j;
  public final List<String> k;
  @Nullable
  public final String l;
  @Nullable
  public final String m;
  public final String n;
  @Nullable
  public final List<String> o;
  public final String p;
  
  public xg(String paramString1, String paramString2, List<String> paramList1, String paramString3, String paramString4, List<String> paramList2, List<String> paramList3, String paramString5, String paramString6, List<String> paramList4, List<String> paramList5, String paramString7, String paramString8, String paramString9, List<String> paramList6, String paramString10, List<String> paramList7)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramList1;
    this.d = paramString3;
    this.e = paramString4;
    this.f = paramList2;
    this.g = paramList3;
    this.i = paramString5;
    this.j = paramList4;
    this.k = paramList5;
    this.l = paramString7;
    this.m = paramString8;
    this.n = paramString9;
    this.o = paramList6;
    this.p = paramString10;
    this.h = paramList7;
  }
  
  public xg(JSONObject paramJSONObject)
  {
    this.b = paramJSONObject.getString("id");
    Object localObject1 = paramJSONObject.getJSONArray("adapters");
    Object localObject3 = new ArrayList(((JSONArray)localObject1).length());
    int i1 = 0;
    while (i1 < ((JSONArray)localObject1).length())
    {
      ((List)localObject3).add(((JSONArray)localObject1).getString(i1));
      i1 += 1;
    }
    this.c = Collections.unmodifiableList((List)localObject3);
    this.d = paramJSONObject.optString("allocation_id", null);
    this.f = u.x().a(paramJSONObject, "clickurl");
    this.g = u.x().a(paramJSONObject, "imp_urls");
    this.h = u.x().a(paramJSONObject, "fill_urls");
    this.j = u.x().a(paramJSONObject, "video_start_urls");
    this.k = u.x().a(paramJSONObject, "video_complete_urls");
    localObject1 = paramJSONObject.optJSONObject("ad");
    if (localObject1 != null)
    {
      localObject1 = ((JSONObject)localObject1).toString();
      this.a = ((String)localObject1);
      localObject3 = paramJSONObject.optJSONObject("data");
      if (localObject3 == null) {
        break label301;
      }
      localObject1 = ((JSONObject)localObject3).toString();
      label192:
      this.i = ((String)localObject1);
      if (localObject3 == null) {
        break label306;
      }
      localObject1 = ((JSONObject)localObject3).optString("class_name");
      label210:
      this.e = ((String)localObject1);
      this.l = paramJSONObject.optString("html_template", null);
      this.m = paramJSONObject.optString("ad_base_url", null);
      localObject1 = paramJSONObject.optJSONObject("assets");
      if (localObject1 == null) {
        break label311;
      }
    }
    label301:
    label306:
    label311:
    for (localObject1 = ((JSONObject)localObject1).toString();; localObject1 = null)
    {
      this.n = ((String)localObject1);
      this.o = u.x().a(paramJSONObject, "template_ids");
      localObject1 = paramJSONObject.optJSONObject("ad_loader_options");
      paramJSONObject = (JSONObject)localObject2;
      if (localObject1 != null) {
        paramJSONObject = ((JSONObject)localObject1).toString();
      }
      this.p = paramJSONObject;
      return;
      localObject1 = null;
      break;
      localObject1 = null;
      break label192;
      localObject1 = null;
      break label210;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/xg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */