package com.google.android.gms.games.achievement;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.data.f;
import com.google.android.gms.games.Player;

public abstract interface Achievement
  extends Parcelable, f<Achievement>
{
  public static final int a = 0;
  public static final int b = 1;
  public static final int c = 2;
  public static final int d = 0;
  public static final int e = 1;
  
  public abstract void a(CharArrayBuffer paramCharArrayBuffer);
  
  public abstract void b(CharArrayBuffer paramCharArrayBuffer);
  
  public abstract String c();
  
  public abstract void c(CharArrayBuffer paramCharArrayBuffer);
  
  public abstract int d();
  
  public abstract void d(CharArrayBuffer paramCharArrayBuffer);
  
  public abstract String e();
  
  public abstract String f();
  
  public abstract Uri g();
  
  @Deprecated
  @KeepName
  public abstract String getRevealedImageUrl();
  
  @Deprecated
  @KeepName
  public abstract String getUnlockedImageUrl();
  
  public abstract Uri h();
  
  public abstract int i();
  
  public abstract String j();
  
  public abstract Player k();
  
  public abstract int l();
  
  public abstract int m();
  
  public abstract String n();
  
  public abstract long o();
  
  public abstract long p();
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/games/achievement/Achievement.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */