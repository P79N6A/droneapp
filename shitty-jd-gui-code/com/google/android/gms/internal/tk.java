package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

@aaa
public class tk
  extends tf
{
  private final wy d;
  
  public tk(Context paramContext, AdSizeParcel paramAdSizeParcel, abi paramabi, VersionInfoParcel paramVersionInfoParcel, tm paramtm, wy paramwy)
  {
    super(paramContext, paramAdSizeParcel, paramabi, paramVersionInfoParcel, paramtm);
    this.d = paramwy;
    a(this.d);
    a();
    a(3);
    paramContext = String.valueOf(this.b.d());
    if (paramContext.length() != 0) {}
    for (paramContext = "Tracking ad unit: ".concat(paramContext);; paramContext = new String("Tracking ad unit: "))
    {
      abr.a(paramContext);
      return;
    }
  }
  
  protected void b(JSONObject paramJSONObject)
  {
    this.d.a("AFMA_updateActiveView", paramJSONObject);
  }
  
  protected void c()
  {
    synchronized (this.a)
    {
      super.c();
      b(this.d);
      return;
    }
  }
  
  public void d()
  {
    c();
  }
  
  protected boolean j()
  {
    return true;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/tk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */