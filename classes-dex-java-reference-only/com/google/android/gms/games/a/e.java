package com.google.android.gms.games.a;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.data.f;
import com.google.android.gms.games.Player;

public abstract interface e
  extends f<e>
{
  public static final int a = -1;
  
  public abstract void a(CharArrayBuffer paramCharArrayBuffer);
  
  public abstract void b(CharArrayBuffer paramCharArrayBuffer);
  
  public abstract long c();
  
  public abstract void c(CharArrayBuffer paramCharArrayBuffer);
  
  public abstract String d();
  
  public abstract String e();
  
  public abstract long f();
  
  public abstract long g();
  
  @Deprecated
  @KeepName
  public abstract String getScoreHolderHiResImageUrl();
  
  @Deprecated
  @KeepName
  public abstract String getScoreHolderIconImageUrl();
  
  public abstract String h();
  
  public abstract Uri i();
  
  public abstract Uri j();
  
  public abstract Player k();
  
  public abstract String l();
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/games/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */