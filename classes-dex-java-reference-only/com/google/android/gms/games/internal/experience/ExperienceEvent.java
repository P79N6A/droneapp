package com.google.android.gms.games.internal.experience;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.data.f;
import com.google.android.gms.games.Game;

public abstract interface ExperienceEvent
  extends Parcelable, f<ExperienceEvent>
{
  public abstract String c();
  
  public abstract Game d();
  
  public abstract String e();
  
  public abstract String f();
  
  public abstract Uri g();
  
  @Deprecated
  @KeepName
  public abstract String getIconImageUrl();
  
  public abstract long h();
  
  public abstract long i();
  
  public abstract long j();
  
  public abstract int k();
  
  public abstract int l();
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/games/internal/experience/ExperienceEvent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */