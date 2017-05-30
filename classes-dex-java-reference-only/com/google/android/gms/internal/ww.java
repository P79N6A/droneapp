package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.ac;
import com.google.android.gms.ads.internal.d;
import com.google.android.gms.ads.internal.e;
import com.google.android.gms.ads.internal.overlay.g;
import com.google.android.gms.ads.internal.overlay.p;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

@aaa
public class ww
  implements wu
{
  private final acy a;
  
  public ww(Context paramContext, VersionInfoParcel paramVersionInfoParcel, @Nullable ro paramro, d paramd)
  {
    this.a = u.f().a(paramContext, new AdSizeParcel(), false, false, paramro, paramVersionInfoParcel, null, null, paramd);
    this.a.a().setWillNotDraw(true);
  }
  
  private void a(Runnable paramRunnable)
  {
    if (ac.a().b())
    {
      paramRunnable.run();
      return;
    }
    abv.a.post(paramRunnable);
  }
  
  public void a()
  {
    this.a.destroy();
  }
  
  public void a(com.google.android.gms.ads.internal.client.a parama, g paramg, vp paramvp, p paramp, boolean paramBoolean, vv paramvv, vx paramvx, e parame, yo paramyo)
  {
    this.a.l().a(parama, paramg, paramvp, paramp, paramBoolean, paramvv, paramvx, new e(this.a.getContext(), false), paramyo, null);
  }
  
  public void a(wu.a parama)
  {
    this.a.l().a(new ww.6(this, parama));
  }
  
  public void a(String paramString)
  {
    a(new ww.3(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[] { paramString })));
  }
  
  public void a(String paramString, vt paramvt)
  {
    this.a.l().a(paramString, paramvt);
  }
  
  public void a(String paramString1, String paramString2)
  {
    a(new ww.2(this, paramString1, paramString2));
  }
  
  public void a(String paramString, JSONObject paramJSONObject)
  {
    a(new ww.1(this, paramString, paramJSONObject));
  }
  
  public xa b()
  {
    return new xb(this);
  }
  
  public void b(String paramString)
  {
    a(new ww.5(this, paramString));
  }
  
  public void b(String paramString, vt paramvt)
  {
    this.a.l().b(paramString, paramvt);
  }
  
  public void b(String paramString, JSONObject paramJSONObject)
  {
    this.a.b(paramString, paramJSONObject);
  }
  
  public void c(String paramString)
  {
    a(new ww.4(this, paramString));
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/ww.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */