package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.data.f;

public abstract interface Game
  extends Parcelable, f<Game>
{
  public abstract void a(CharArrayBuffer paramCharArrayBuffer);
  
  public abstract void b(CharArrayBuffer paramCharArrayBuffer);
  
  public abstract String c();
  
  public abstract void c(CharArrayBuffer paramCharArrayBuffer);
  
  public abstract String d();
  
  public abstract String e();
  
  public abstract String f();
  
  public abstract String g();
  
  @Deprecated
  @KeepName
  public abstract String getFeaturedImageUrl();
  
  @Deprecated
  @KeepName
  public abstract String getHiResImageUrl();
  
  @Deprecated
  @KeepName
  public abstract String getIconImageUrl();
  
  public abstract String h();
  
  public abstract Uri i();
  
  public abstract Uri j();
  
  public abstract Uri k();
  
  public abstract boolean l();
  
  public abstract boolean m();
  
  public abstract boolean n();
  
  public abstract boolean o();
  
  public abstract String p();
  
  public abstract int q();
  
  public abstract int r();
  
  public abstract boolean s();
  
  public abstract boolean t();
  
  public abstract boolean u();
  
  public abstract String v();
  
  public abstract boolean w();
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/games/Game.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */