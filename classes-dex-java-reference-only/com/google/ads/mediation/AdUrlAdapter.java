package com.google.ads.mediation;

import android.os.Bundle;
import android.support.annotation.Keep;
import com.google.android.gms.ads.mediation.c;
import com.google.android.gms.ads.mediation.e;
import com.google.android.gms.ads.mediation.g;

@Keep
public final class AdUrlAdapter
  extends a
  implements c, e, g
{
  public String getAdUnitId(Bundle paramBundle)
  {
    return "adurl";
  }
  
  protected Bundle zza(Bundle paramBundle1, Bundle paramBundle2)
  {
    if (paramBundle1 != null) {}
    for (;;)
    {
      paramBundle1.putBundle("sdk_less_server_data", paramBundle2);
      paramBundle1.putBoolean("_noRefresh", true);
      return paramBundle1;
      paramBundle1 = new Bundle();
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/ads/mediation/AdUrlAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */