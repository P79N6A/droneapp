package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@aaa
public final class AutoClickProtectionConfigurationParcel
  extends AbstractSafeParcelable
{
  public static final i CREATOR = new i();
  public final int a;
  public final boolean b;
  @Nullable
  public final List<String> c;
  
  public AutoClickProtectionConfigurationParcel()
  {
    this(1, false, Collections.emptyList());
  }
  
  public AutoClickProtectionConfigurationParcel(int paramInt, boolean paramBoolean, List<String> paramList)
  {
    this.a = paramInt;
    this.b = paramBoolean;
    this.c = paramList;
  }
  
  public AutoClickProtectionConfigurationParcel(boolean paramBoolean)
  {
    this(1, paramBoolean, Collections.emptyList());
  }
  
  public AutoClickProtectionConfigurationParcel(boolean paramBoolean, List<String> paramList)
  {
    this(1, paramBoolean, paramList);
  }
  
  @Nullable
  public static AutoClickProtectionConfigurationParcel a(JSONObject paramJSONObject)
  {
    if (paramJSONObject == null) {
      return new AutoClickProtectionConfigurationParcel();
    }
    JSONArray localJSONArray = paramJSONObject.optJSONArray("reporting_urls");
    ArrayList localArrayList = new ArrayList();
    if (localJSONArray != null)
    {
      int i = 0;
      for (;;)
      {
        if (i < localJSONArray.length()) {
          try
          {
            localArrayList.add(localJSONArray.getString(i));
            i += 1;
          }
          catch (JSONException localJSONException)
          {
            for (;;)
            {
              abr.d("Error grabbing url from json.", localJSONException);
            }
          }
        }
      }
    }
    return new AutoClickProtectionConfigurationParcel(paramJSONObject.optBoolean("enable_protection"), localArrayList);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    i.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/request/AutoClickProtectionConfigurationParcel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */