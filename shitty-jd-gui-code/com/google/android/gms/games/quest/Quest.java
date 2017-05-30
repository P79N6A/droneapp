package com.google.android.gms.games.quest;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.data.f;
import com.google.android.gms.games.Game;
import java.util.List;

public abstract interface Quest
  extends Parcelable, f<Quest>
{
  @KeepName
  public static final int[] QUEST_STATE_ALL = { 1, 2, 3, 4, 6, 5 };
  @KeepName
  public static final String[] QUEST_STATE_NON_TERMINAL = { Integer.toString(1), Integer.toString(2), Integer.toString(3) };
  public static final int a = 1;
  public static final int b = 2;
  public static final int c = 3;
  public static final int d = 4;
  public static final int e = 5;
  public static final int f = 6;
  public static final long g = -1L;
  
  public abstract void a(CharArrayBuffer paramCharArrayBuffer);
  
  public abstract void b(CharArrayBuffer paramCharArrayBuffer);
  
  public abstract String c();
  
  public abstract String d();
  
  public abstract String e();
  
  public abstract Uri f();
  
  public abstract Uri g();
  
  @Deprecated
  @KeepName
  public abstract String getBannerImageUrl();
  
  @Deprecated
  @KeepName
  public abstract String getIconImageUrl();
  
  public abstract Milestone h();
  
  public abstract List<Milestone> i();
  
  public abstract Game j();
  
  public abstract int k();
  
  public abstract int l();
  
  public abstract long m();
  
  public abstract long n();
  
  public abstract long o();
  
  public abstract long p();
  
  public abstract long q();
  
  public abstract boolean r();
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/games/quest/Quest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */