package com.google.android.gms.ads.b.a;

import android.content.Context;
import android.os.Bundle;

public abstract interface a
  extends com.google.android.gms.ads.mediation.b
{
  public static final String a = "parameter";
  
  public abstract void initialize(Context paramContext, com.google.android.gms.ads.mediation.a parama, String paramString, b paramb, Bundle paramBundle1, Bundle paramBundle2);
  
  public abstract boolean isInitialized();
  
  public abstract void loadAd(com.google.android.gms.ads.mediation.a parama, Bundle paramBundle1, Bundle paramBundle2);
  
  public abstract void showVideo();
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/b/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */