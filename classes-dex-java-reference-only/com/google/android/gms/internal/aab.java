package com.google.android.gms.internal;

import android.location.Location;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

@aaa
public class aab
{
  @Nullable
  public Bundle a;
  @Nullable
  public Bundle b;
  @Nullable
  public List<String> c = new ArrayList();
  @Nullable
  public Location d;
  @Nullable
  public aao.a e;
  @Nullable
  public String f;
  @Nullable
  public String g;
  public AdRequestInfoParcel h;
  public aak i;
  public JSONObject j = new JSONObject();
  
  public aab a(Location paramLocation)
  {
    this.d = paramLocation;
    return this;
  }
  
  public aab a(Bundle paramBundle)
  {
    this.b = paramBundle;
    return this;
  }
  
  public aab a(AdRequestInfoParcel paramAdRequestInfoParcel)
  {
    this.h = paramAdRequestInfoParcel;
    return this;
  }
  
  public aab a(aak paramaak)
  {
    this.i = paramaak;
    return this;
  }
  
  public aab a(aao.a parama)
  {
    this.e = parama;
    return this;
  }
  
  public aab a(String paramString)
  {
    this.g = paramString;
    return this;
  }
  
  public aab a(List<String> paramList)
  {
    if (paramList == null) {
      this.c.clear();
    }
    this.c = paramList;
    return this;
  }
  
  public aab a(JSONObject paramJSONObject)
  {
    this.j = paramJSONObject;
    return this;
  }
  
  public aab b(Bundle paramBundle)
  {
    this.a = paramBundle;
    return this;
  }
  
  public aab b(String paramString)
  {
    this.f = paramString;
    return this;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/aab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */