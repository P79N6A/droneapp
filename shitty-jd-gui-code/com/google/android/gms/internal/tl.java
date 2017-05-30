package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONException;
import org.json.JSONObject;

@aaa
public class tl
  extends tf
{
  private wx.c d;
  private boolean e;
  
  public tl(Context paramContext, AdSizeParcel paramAdSizeParcel, abi paramabi, VersionInfoParcel paramVersionInfoParcel, tm paramtm, wx paramwx)
  {
    super(paramContext, paramAdSizeParcel, paramabi, paramVersionInfoParcel, paramtm);
    this.d = paramwx.a();
    try
    {
      paramContext = a(paramtm.c().a());
      this.d.a(new tl.1(this, paramContext), new tl.2(this));
      this.d.a(new tl.3(this), new tl.4(this));
      paramContext = String.valueOf(this.b.d());
      if (paramContext.length() != 0)
      {
        paramContext = "Tracking ad unit: ".concat(paramContext);
        abr.a(paramContext);
        return;
      }
    }
    catch (RuntimeException paramContext)
    {
      for (;;)
      {
        abr.b("Failure while processing active view data.", paramContext);
        continue;
        paramContext = new String("Tracking ad unit: ");
      }
    }
    catch (JSONException paramContext)
    {
      for (;;) {}
    }
  }
  
  protected void b(JSONObject paramJSONObject)
  {
    this.d.a(new tl.5(this, paramJSONObject), new acr.b());
  }
  
  protected void c()
  {
    synchronized (this.a)
    {
      super.c();
      this.d.a(new tl.6(this), new acr.b());
      this.d.q_();
      return;
    }
  }
  
  protected boolean j()
  {
    return this.e;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/tl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */