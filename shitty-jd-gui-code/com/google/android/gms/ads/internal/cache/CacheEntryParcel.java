package com.google.android.gms.ads.internal.cache;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;

@aaa
public class CacheEntryParcel
  extends AbstractSafeParcelable
{
  public static final b CREATOR = new b();
  public final int a;
  @Nullable
  private ParcelFileDescriptor b;
  
  public CacheEntryParcel()
  {
    this(1, null);
  }
  
  CacheEntryParcel(int paramInt, @Nullable ParcelFileDescriptor paramParcelFileDescriptor)
  {
    this.a = paramInt;
    this.b = paramParcelFileDescriptor;
  }
  
  /* Error */
  public boolean a()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 30	com/google/android/gms/ads/internal/cache/CacheEntryParcel:b	Landroid/os/ParcelFileDescriptor;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnull +9 -> 17
    //   11: iconst_1
    //   12: istore_1
    //   13: aload_0
    //   14: monitorexit
    //   15: iload_1
    //   16: ireturn
    //   17: iconst_0
    //   18: istore_1
    //   19: goto -6 -> 13
    //   22: astore_2
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_2
    //   26: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	27	0	this	CacheEntryParcel
    //   12	7	1	bool	boolean
    //   6	2	2	localParcelFileDescriptor	ParcelFileDescriptor
    //   22	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	7	22	finally
  }
  
  /* Error */
  @Nullable
  public java.io.InputStream b()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_0
    //   5: getfield 30	com/google/android/gms/ads/internal/cache/CacheEntryParcel:b	Landroid/os/ParcelFileDescriptor;
    //   8: astore_2
    //   9: aload_2
    //   10: ifnonnull +7 -> 17
    //   13: aload_0
    //   14: monitorexit
    //   15: aload_1
    //   16: areturn
    //   17: new 35	android/os/ParcelFileDescriptor$AutoCloseInputStream
    //   20: dup
    //   21: aload_0
    //   22: getfield 30	com/google/android/gms/ads/internal/cache/CacheEntryParcel:b	Landroid/os/ParcelFileDescriptor;
    //   25: invokespecial 38	android/os/ParcelFileDescriptor$AutoCloseInputStream:<init>	(Landroid/os/ParcelFileDescriptor;)V
    //   28: astore_1
    //   29: aload_0
    //   30: aconst_null
    //   31: putfield 30	com/google/android/gms/ads/internal/cache/CacheEntryParcel:b	Landroid/os/ParcelFileDescriptor;
    //   34: goto -21 -> 13
    //   37: astore_1
    //   38: aload_0
    //   39: monitorexit
    //   40: aload_1
    //   41: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	42	0	this	CacheEntryParcel
    //   1	28	1	localObject1	Object
    //   37	4	1	localObject2	Object
    //   8	2	2	localParcelFileDescriptor	ParcelFileDescriptor
    // Exception table:
    //   from	to	target	type
    //   4	9	37	finally
    //   17	34	37	finally
  }
  
  ParcelFileDescriptor c()
  {
    try
    {
      ParcelFileDescriptor localParcelFileDescriptor = this.b;
      return localParcelFileDescriptor;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    b.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/cache/CacheEntryParcel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */