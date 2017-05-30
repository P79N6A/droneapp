package com.google.android.gms.contextmanager.fence.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.awareness.fence.FenceState;
import com.google.android.gms.internal.sw;

public class FenceStateImpl
  extends FenceState
{
  public static final Parcelable.Creator<FenceStateImpl> CREATOR = new i();
  private final int d;
  private final int e;
  private final long f;
  private final String g;
  private final int h;
  
  FenceStateImpl(int paramInt1, int paramInt2, long paramLong, String paramString, int paramInt3)
  {
    this.d = paramInt1;
    this.e = paramInt2;
    this.f = paramLong;
    this.g = paramString;
    this.h = paramInt3;
  }
  
  public FenceStateImpl(int paramInt1, long paramLong, String paramString, int paramInt2)
  {
    this(1, paramInt1, paramLong, paramString, paramInt2);
  }
  
  public static int a(int paramInt, String paramString)
  {
    switch (paramInt)
    {
    default: 
      sw.a(paramString, 43 + "Invalid fence evaluation state: " + paramInt);
    case 0: 
      return 0;
    case 2: 
      return 2;
    }
    return 1;
  }
  
  public static FenceState b(Intent paramIntent)
  {
    return new FenceStateImpl(a(paramIntent.getIntExtra("context_fence_current_state", 0), "FenceState"), paramIntent.getLongExtra("context_fence_last_updated_time", 0L), paramIntent.getStringExtra("context_fence_key"), a(paramIntent.getIntExtra("context_fence_previous_state", 0), "FenceState"));
  }
  
  public int a()
  {
    return this.e;
  }
  
  public int b()
  {
    return this.h;
  }
  
  public long c()
  {
    return this.f;
  }
  
  public String d()
  {
    return this.g;
  }
  
  int e()
  {
    return this.d;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    i.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/contextmanager/fence/internal/FenceStateImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */