package com.google.android.gms.awareness.state;

import com.google.android.gms.awareness.snapshot.internal.BeaconStateImpl.TypeFilterImpl;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public abstract interface BeaconState
{
  public abstract List<a> a();
  
  public static abstract class TypeFilter
    extends AbstractSafeParcelable
  {
    public static TypeFilter a(String paramString1, String paramString2)
    {
      return new BeaconStateImpl.TypeFilterImpl(paramString1, paramString2);
    }
    
    public static TypeFilter a(String paramString1, String paramString2, byte[] paramArrayOfByte)
    {
      return new BeaconStateImpl.TypeFilterImpl(paramString1, paramString2, paramArrayOfByte);
    }
  }
  
  public static abstract interface a
  {
    public abstract String a();
    
    public abstract String b();
    
    public abstract byte[] c();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/awareness/state/BeaconState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */