package com.google.android.gms.ads.mediation;

import android.os.Bundle;

public abstract interface b
{
  public abstract void onDestroy();
  
  public abstract void onPause();
  
  public abstract void onResume();
  
  public static class a
  {
    private int a;
    
    public Bundle a()
    {
      Bundle localBundle = new Bundle();
      localBundle.putInt("capabilities", this.a);
      return localBundle;
    }
    
    public a a(int paramInt)
    {
      this.a = paramInt;
      return this;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/mediation/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */