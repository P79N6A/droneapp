package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.internal.b.z;

public final class a
{
  private final com.google.android.gms.games.multiplayer.a a;
  private final c b;
  private final c c;
  private final c d;
  
  public a(Bundle paramBundle)
  {
    DataHolder localDataHolder = a(paramBundle, 0);
    if (localDataHolder != null)
    {
      this.a = new com.google.android.gms.games.multiplayer.a(localDataHolder);
      localDataHolder = a(paramBundle, 1);
      if (localDataHolder == null) {
        break label101;
      }
      this.b = new c(localDataHolder);
      label48:
      localDataHolder = a(paramBundle, 2);
      if (localDataHolder == null) {
        break label109;
      }
    }
    label101:
    label109:
    for (this.c = new c(localDataHolder);; this.c = null)
    {
      paramBundle = a(paramBundle, 3);
      if (paramBundle == null) {
        break label117;
      }
      this.d = new c(paramBundle);
      return;
      this.a = null;
      break;
      this.b = null;
      break label48;
    }
    label117:
    this.d = null;
  }
  
  private static DataHolder a(Bundle paramBundle, int paramInt)
  {
    String str = z.a(paramInt);
    if (!paramBundle.containsKey(str)) {
      return null;
    }
    return (DataHolder)paramBundle.getParcelable(str);
  }
  
  public com.google.android.gms.games.multiplayer.a a()
  {
    return this.a;
  }
  
  public c b()
  {
    return this.b;
  }
  
  public c c()
  {
    return this.c;
  }
  
  public c d()
  {
    return this.d;
  }
  
  @Deprecated
  public void e()
  {
    f();
  }
  
  public void f()
  {
    if (this.a != null) {
      this.a.b();
    }
    if (this.b != null) {
      this.b.b();
    }
    if (this.c != null) {
      this.c.b();
    }
    if (this.d != null) {
      this.d.b();
    }
  }
  
  public boolean g()
  {
    if ((this.a != null) && (this.a.c() > 0)) {}
    while (((this.b != null) && (this.b.c() > 0)) || ((this.c != null) && (this.c.c() > 0)) || ((this.d != null) && (this.d.c() > 0))) {
      return true;
    }
    return false;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/games/multiplayer/turnbased/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */