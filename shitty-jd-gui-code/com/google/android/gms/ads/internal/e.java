package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.request.AutoClickProtectionConfigurationParcel;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abi.a;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.abv;
import java.util.Iterator;
import java.util.List;

@aaa
public class e
{
  private final Context a;
  private final AutoClickProtectionConfigurationParcel b;
  private boolean c;
  
  public e(Context paramContext)
  {
    this(paramContext, false);
  }
  
  public e(Context paramContext, @Nullable abi.a parama)
  {
    this.a = paramContext;
    if ((parama != null) && (parama.b.G != null))
    {
      this.b = parama.b.G;
      return;
    }
    this.b = new AutoClickProtectionConfigurationParcel();
  }
  
  public e(Context paramContext, boolean paramBoolean)
  {
    this.a = paramContext;
    this.b = new AutoClickProtectionConfigurationParcel(paramBoolean);
  }
  
  public void a()
  {
    this.c = true;
  }
  
  public void a(@Nullable String paramString)
  {
    if (paramString != null) {}
    for (;;)
    {
      abr.c("Action was blocked because no touch was detected.");
      if ((!this.b.b) || (this.b.c == null)) {
        break;
      }
      Iterator localIterator = this.b.c.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if (!TextUtils.isEmpty(str))
        {
          str = str.replace("{NAVIGATION_URL}", Uri.encode(paramString));
          u.e().a(this.a, "", str);
        }
      }
      paramString = "";
    }
  }
  
  public boolean b()
  {
    return (!this.b.b) || (this.c);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */