package com.google.android.gms.ads.internal.safebrowsing;

import android.os.Parcel;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;
import org.json.JSONObject;

@aaa
public class SafeBrowsingConfigParcel
  extends AbstractSafeParcelable
{
  public static final b CREATOR = new b();
  public final int a;
  public final String b;
  public final String c;
  public final boolean d;
  public final boolean e;
  
  public SafeBrowsingConfigParcel(int paramInt, String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.a = paramInt;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramBoolean1;
    this.e = paramBoolean2;
  }
  
  @Nullable
  public static SafeBrowsingConfigParcel a(JSONObject paramJSONObject)
  {
    if (paramJSONObject == null) {
      return null;
    }
    return new SafeBrowsingConfigParcel(1, paramJSONObject.getString("click_string"), paramJSONObject.getString("report_url"), paramJSONObject.optBoolean("rendered_ad_enabled", false), paramJSONObject.optBoolean("non_malicious_reporting_enabled", false));
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    b.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/safebrowsing/SafeBrowsingConfigParcel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */