package com.google.android.gms.games.event;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.data.f;
import com.google.android.gms.games.Player;

public abstract interface Event
  extends Parcelable, f<Event>
{
  public abstract void a(CharArrayBuffer paramCharArrayBuffer);
  
  public abstract void b(CharArrayBuffer paramCharArrayBuffer);
  
  public abstract String c();
  
  public abstract void c(CharArrayBuffer paramCharArrayBuffer);
  
  public abstract String d();
  
  public abstract String e();
  
  public abstract Uri f();
  
  public abstract Player g();
  
  @Deprecated
  @KeepName
  public abstract String getIconImageUrl();
  
  public abstract long h();
  
  public abstract String i();
  
  public abstract boolean j();
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/games/event/Event.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */