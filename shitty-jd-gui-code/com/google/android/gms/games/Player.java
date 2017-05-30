package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.data.f;
import com.google.android.gms.games.internal.player.MostRecentGameInfo;

public abstract interface Player
  extends Parcelable, f<Player>
{
  public static final long a = -1L;
  public static final long b = -1L;
  
  public abstract void a(CharArrayBuffer paramCharArrayBuffer);
  
  public abstract void b(CharArrayBuffer paramCharArrayBuffer);
  
  public abstract String c();
  
  public abstract String d();
  
  public abstract String e();
  
  public abstract String f();
  
  public abstract boolean g();
  
  @Deprecated
  @KeepName
  public abstract String getBannerImageLandscapeUrl();
  
  @Deprecated
  @KeepName
  public abstract String getBannerImagePortraitUrl();
  
  @Deprecated
  @KeepName
  public abstract String getHiResImageUrl();
  
  @Deprecated
  @KeepName
  public abstract String getIconImageUrl();
  
  public abstract boolean h();
  
  public abstract Uri i();
  
  public abstract boolean j();
  
  public abstract Uri k();
  
  public abstract long l();
  
  public abstract long m();
  
  @Deprecated
  public abstract int n();
  
  public abstract boolean o();
  
  public abstract String p();
  
  public abstract PlayerLevelInfo q();
  
  public abstract MostRecentGameInfo r();
  
  public abstract Uri s();
  
  public abstract Uri t();
  
  public abstract int u();
  
  public abstract long v();
  
  public abstract boolean w();
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/games/Player.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */