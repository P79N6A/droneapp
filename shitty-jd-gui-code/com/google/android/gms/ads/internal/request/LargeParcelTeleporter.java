package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseOutputStream;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.o;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abl;
import com.google.android.gms.internal.abr;
import java.io.IOException;
import java.io.OutputStream;

@aaa
public final class LargeParcelTeleporter
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<LargeParcelTeleporter> CREATOR = new m();
  final int a;
  ParcelFileDescriptor b;
  private Parcelable c;
  private boolean d;
  
  LargeParcelTeleporter(int paramInt, ParcelFileDescriptor paramParcelFileDescriptor)
  {
    this.a = paramInt;
    this.b = paramParcelFileDescriptor;
    this.c = null;
    this.d = true;
  }
  
  public LargeParcelTeleporter(SafeParcelable paramSafeParcelable)
  {
    this.a = 1;
    this.b = null;
    this.c = paramSafeParcelable;
    this.d = false;
  }
  
  protected <T> ParcelFileDescriptor a(final byte[] paramArrayOfByte)
  {
    try
    {
      ParcelFileDescriptor[] arrayOfParcelFileDescriptor = ParcelFileDescriptor.createPipe();
      localAutoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(arrayOfParcelFileDescriptor[1]);
      abr.b("Error transporting the ad response", paramArrayOfByte);
    }
    catch (IOException paramArrayOfByte)
    {
      try
      {
        new Thread(new Runnable()
        {
          /* Error */
          public void run()
          {
            // Byte code:
            //   0: new 33	java/io/DataOutputStream
            //   3: dup
            //   4: aload_0
            //   5: getfield 22	com/google/android/gms/ads/internal/request/LargeParcelTeleporter$1:a	Ljava/io/OutputStream;
            //   8: invokespecial 36	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
            //   11: astore_2
            //   12: aload_2
            //   13: astore_1
            //   14: aload_2
            //   15: aload_0
            //   16: getfield 24	com/google/android/gms/ads/internal/request/LargeParcelTeleporter$1:b	[B
            //   19: arraylength
            //   20: invokevirtual 40	java/io/DataOutputStream:writeInt	(I)V
            //   23: aload_2
            //   24: astore_1
            //   25: aload_2
            //   26: aload_0
            //   27: getfield 24	com/google/android/gms/ads/internal/request/LargeParcelTeleporter$1:b	[B
            //   30: invokevirtual 44	java/io/DataOutputStream:write	([B)V
            //   33: aload_2
            //   34: invokestatic 49	com/google/android/gms/common/util/o:a	(Ljava/io/Closeable;)V
            //   37: return
            //   38: astore_3
            //   39: aconst_null
            //   40: astore_2
            //   41: aload_2
            //   42: astore_1
            //   43: ldc 51
            //   45: aload_3
            //   46: invokestatic 56	com/google/android/gms/internal/abr:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
            //   49: aload_2
            //   50: astore_1
            //   51: invokestatic 62	com/google/android/gms/ads/internal/u:i	()Lcom/google/android/gms/internal/abl;
            //   54: aload_3
            //   55: ldc 64
            //   57: invokevirtual 69	com/google/android/gms/internal/abl:a	(Ljava/lang/Throwable;Ljava/lang/String;)V
            //   60: aload_2
            //   61: ifnonnull +11 -> 72
            //   64: aload_0
            //   65: getfield 22	com/google/android/gms/ads/internal/request/LargeParcelTeleporter$1:a	Ljava/io/OutputStream;
            //   68: invokestatic 49	com/google/android/gms/common/util/o:a	(Ljava/io/Closeable;)V
            //   71: return
            //   72: aload_2
            //   73: invokestatic 49	com/google/android/gms/common/util/o:a	(Ljava/io/Closeable;)V
            //   76: return
            //   77: astore_2
            //   78: aconst_null
            //   79: astore_1
            //   80: aload_1
            //   81: ifnonnull +12 -> 93
            //   84: aload_0
            //   85: getfield 22	com/google/android/gms/ads/internal/request/LargeParcelTeleporter$1:a	Ljava/io/OutputStream;
            //   88: invokestatic 49	com/google/android/gms/common/util/o:a	(Ljava/io/Closeable;)V
            //   91: aload_2
            //   92: athrow
            //   93: aload_1
            //   94: invokestatic 49	com/google/android/gms/common/util/o:a	(Ljava/io/Closeable;)V
            //   97: goto -6 -> 91
            //   100: astore_2
            //   101: goto -21 -> 80
            //   104: astore_3
            //   105: goto -64 -> 41
            // Local variable table:
            //   start	length	slot	name	signature
            //   0	108	0	this	1
            //   13	81	1	localDataOutputStream1	java.io.DataOutputStream
            //   11	62	2	localDataOutputStream2	java.io.DataOutputStream
            //   77	15	2	localObject1	Object
            //   100	1	2	localObject2	Object
            //   38	17	3	localIOException1	IOException
            //   104	1	3	localIOException2	IOException
            // Exception table:
            //   from	to	target	type
            //   0	12	38	java/io/IOException
            //   0	12	77	finally
            //   14	23	100	finally
            //   25	33	100	finally
            //   43	49	100	finally
            //   51	60	100	finally
            //   14	23	104	java/io/IOException
            //   25	33	104	java/io/IOException
          }
        }).start();
        paramArrayOfByte = arrayOfParcelFileDescriptor[0];
        return paramArrayOfByte;
      }
      catch (IOException paramArrayOfByte)
      {
        final ParcelFileDescriptor.AutoCloseOutputStream localAutoCloseOutputStream;
        for (;;) {}
      }
      paramArrayOfByte = paramArrayOfByte;
      localAutoCloseOutputStream = null;
    }
    u.i().a(paramArrayOfByte, "LargeParcelTeleporter.pipeData.2");
    o.a(localAutoCloseOutputStream);
    return null;
  }
  
  /* Error */
  public <T extends SafeParcelable> T a(Parcelable.Creator<T> paramCreator)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 38	com/google/android/gms/ads/internal/request/LargeParcelTeleporter:d	Z
    //   4: ifeq +95 -> 99
    //   7: aload_0
    //   8: getfield 34	com/google/android/gms/ads/internal/request/LargeParcelTeleporter:b	Landroid/os/ParcelFileDescriptor;
    //   11: ifnonnull +10 -> 21
    //   14: ldc 94
    //   16: invokestatic 97	com/google/android/gms/internal/abr:b	(Ljava/lang/String;)V
    //   19: aconst_null
    //   20: areturn
    //   21: new 99	java/io/DataInputStream
    //   24: dup
    //   25: new 101	android/os/ParcelFileDescriptor$AutoCloseInputStream
    //   28: dup
    //   29: aload_0
    //   30: getfield 34	com/google/android/gms/ads/internal/request/LargeParcelTeleporter:b	Landroid/os/ParcelFileDescriptor;
    //   33: invokespecial 102	android/os/ParcelFileDescriptor$AutoCloseInputStream:<init>	(Landroid/os/ParcelFileDescriptor;)V
    //   36: invokespecial 105	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   39: astore_2
    //   40: aload_2
    //   41: invokevirtual 109	java/io/DataInputStream:readInt	()I
    //   44: newarray <illegal type>
    //   46: astore_3
    //   47: aload_2
    //   48: aload_3
    //   49: iconst_0
    //   50: aload_3
    //   51: arraylength
    //   52: invokevirtual 113	java/io/DataInputStream:readFully	([BII)V
    //   55: aload_2
    //   56: invokestatic 89	com/google/android/gms/common/util/o:a	(Ljava/io/Closeable;)V
    //   59: invokestatic 119	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   62: astore_2
    //   63: aload_2
    //   64: aload_3
    //   65: iconst_0
    //   66: aload_3
    //   67: arraylength
    //   68: invokevirtual 122	android/os/Parcel:unmarshall	([BII)V
    //   71: aload_2
    //   72: iconst_0
    //   73: invokevirtual 126	android/os/Parcel:setDataPosition	(I)V
    //   76: aload_0
    //   77: aload_1
    //   78: aload_2
    //   79: invokeinterface 132 2 0
    //   84: checkcast 134	com/google/android/gms/common/internal/safeparcel/SafeParcelable
    //   87: putfield 36	com/google/android/gms/ads/internal/request/LargeParcelTeleporter:c	Landroid/os/Parcelable;
    //   90: aload_2
    //   91: invokevirtual 137	android/os/Parcel:recycle	()V
    //   94: aload_0
    //   95: iconst_0
    //   96: putfield 38	com/google/android/gms/ads/internal/request/LargeParcelTeleporter:d	Z
    //   99: aload_0
    //   100: getfield 36	com/google/android/gms/ads/internal/request/LargeParcelTeleporter:c	Landroid/os/Parcelable;
    //   103: checkcast 134	com/google/android/gms/common/internal/safeparcel/SafeParcelable
    //   106: areturn
    //   107: astore_1
    //   108: new 139	java/lang/IllegalStateException
    //   111: dup
    //   112: ldc -115
    //   114: aload_1
    //   115: invokespecial 143	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   118: athrow
    //   119: astore_1
    //   120: aload_2
    //   121: invokestatic 89	com/google/android/gms/common/util/o:a	(Ljava/io/Closeable;)V
    //   124: aload_1
    //   125: athrow
    //   126: astore_1
    //   127: aload_2
    //   128: invokevirtual 137	android/os/Parcel:recycle	()V
    //   131: aload_1
    //   132: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	133	0	this	LargeParcelTeleporter
    //   0	133	1	paramCreator	Parcelable.Creator<T>
    //   39	89	2	localObject	Object
    //   46	21	3	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   40	55	107	java/io/IOException
    //   40	55	119	finally
    //   108	119	119	finally
    //   63	90	126	finally
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Parcel localParcel;
    if (this.b == null) {
      localParcel = Parcel.obtain();
    }
    try
    {
      this.c.writeToParcel(localParcel, 0);
      byte[] arrayOfByte = localParcel.marshall();
      localParcel.recycle();
      this.b = a(arrayOfByte);
      m.a(this, paramParcel, paramInt);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/request/LargeParcelTeleporter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */