package com.google.android.gms.games.snapshot;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.data.f;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Player;

public abstract interface SnapshotMetadata
  extends Parcelable, f<SnapshotMetadata>
{
  public static final long a = -1L;
  public static final long b = -1L;
  
  public abstract void a(CharArrayBuffer paramCharArrayBuffer);
  
  public abstract Game c();
  
  public abstract Player d();
  
  public abstract String e();
  
  public abstract Uri f();
  
  public abstract float g();
  
  @Deprecated
  @KeepName
  public abstract String getCoverImageUrl();
  
  public abstract String h();
  
  public abstract String i();
  
  public abstract String j();
  
  public abstract long k();
  
  public abstract long l();
  
  public abstract boolean m();
  
  public abstract long n();
  
  public abstract String o();
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/games/snapshot/SnapshotMetadata.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */