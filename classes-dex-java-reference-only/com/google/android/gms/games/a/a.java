package com.google.android.gms.games.a;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.data.f;
import com.google.android.gms.games.Game;
import java.util.ArrayList;

public abstract interface a
  extends f<a>
{
  public static final int a = 0;
  public static final int b = 1;
  
  public abstract void a(CharArrayBuffer paramCharArrayBuffer);
  
  public abstract String c();
  
  public abstract String d();
  
  public abstract Uri e();
  
  public abstract int f();
  
  public abstract ArrayList<j> g();
  
  @Deprecated
  @KeepName
  public abstract String getIconImageUrl();
  
  public abstract Game h();
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/games/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */