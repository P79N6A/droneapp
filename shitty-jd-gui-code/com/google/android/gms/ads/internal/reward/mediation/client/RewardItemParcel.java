package com.google.android.gms.ads.internal.reward.mediation.client;

import android.os.Parcel;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.ads.b.a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@aaa
public final class RewardItemParcel
  extends AbstractSafeParcelable
{
  public static final c CREATOR = new c();
  public final int a;
  public final String b;
  public final int c;
  
  public RewardItemParcel(int paramInt1, String paramString, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramString;
    this.c = paramInt2;
  }
  
  public RewardItemParcel(a parama)
  {
    this(1, parama.a(), parama.b());
  }
  
  public RewardItemParcel(String paramString, int paramInt)
  {
    this(1, paramString, paramInt);
  }
  
  @Nullable
  public static RewardItemParcel a(@Nullable String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    try
    {
      paramString = a(new JSONArray(paramString));
      return paramString;
    }
    catch (JSONException paramString) {}
    return null;
  }
  
  @Nullable
  public static RewardItemParcel a(JSONArray paramJSONArray)
  {
    if ((paramJSONArray == null) || (paramJSONArray.length() == 0)) {
      return null;
    }
    return new RewardItemParcel(paramJSONArray.getJSONObject(0).optString("rb_type"), paramJSONArray.getJSONObject(0).optInt("rb_amount"));
  }
  
  public JSONArray a()
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("rb_type", this.b);
    localJSONObject.put("rb_amount", this.c);
    JSONArray localJSONArray = new JSONArray();
    localJSONArray.put(localJSONObject);
    return localJSONArray;
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof RewardItemParcel))) {}
    do
    {
      return false;
      paramObject = (RewardItemParcel)paramObject;
    } while ((!com.google.android.gms.common.internal.c.a(this.b, ((RewardItemParcel)paramObject).b)) || (!com.google.android.gms.common.internal.c.a(Integer.valueOf(this.c), Integer.valueOf(((RewardItemParcel)paramObject).c))));
    return true;
  }
  
  public int hashCode()
  {
    return com.google.android.gms.common.internal.c.a(new Object[] { this.b, Integer.valueOf(this.c) });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    c.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/reward/mediation/client/RewardItemParcel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */