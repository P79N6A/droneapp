package com.google.android.gms.games.multiplayer;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.data.f;
import com.google.android.gms.games.Player;

public abstract interface Participant
  extends Parcelable, f<Participant>
{
  public static final int a = 0;
  public static final int b = 1;
  public static final int c = 2;
  public static final int d = 3;
  public static final int e = 4;
  public static final int f = 5;
  public static final int g = 6;
  
  public abstract void a(CharArrayBuffer paramCharArrayBuffer);
  
  public abstract int c();
  
  public abstract String d();
  
  public abstract int e();
  
  public abstract boolean f();
  
  public abstract String g();
  
  @Deprecated
  @KeepName
  public abstract String getHiResImageUrl();
  
  @Deprecated
  @KeepName
  public abstract String getIconImageUrl();
  
  public abstract Uri h();
  
  public abstract Uri i();
  
  public abstract String j();
  
  public abstract Player k();
  
  public abstract ParticipantResult l();
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/games/multiplayer/Participant.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */