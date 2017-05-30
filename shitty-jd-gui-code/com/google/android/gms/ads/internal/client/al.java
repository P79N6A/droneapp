package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.c.e;
import com.google.android.gms.c.e.a;
import com.google.android.gms.internal.xq;
import com.google.android.gms.internal.xq.a;

public abstract interface al
  extends IInterface
{
  public abstract IBinder a(e parame, AdSizeParcel paramAdSizeParcel, String paramString, xq paramxq, int paramInt);
  
  public abstract IBinder a(e parame, AdSizeParcel paramAdSizeParcel, String paramString, xq paramxq, int paramInt1, int paramInt2);
  
  public static abstract class a
    extends Binder
    implements al
  {
    public static al a(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
      if ((localIInterface != null) && ((localIInterface instanceof al))) {
        return (al)localIInterface;
      }
      return new a(paramIBinder);
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      e locale1 = null;
      Object localObject = null;
      switch (paramInt1)
      {
      default: 
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 1598968902: 
        paramParcel2.writeString("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        locale1 = e.a.a(paramParcel1.readStrongBinder());
        if (paramParcel1.readInt() != 0) {
          localObject = (AdSizeParcel)AdSizeParcel.CREATOR.createFromParcel(paramParcel1);
        }
        paramParcel1 = a(locale1, (AdSizeParcel)localObject, paramParcel1.readString(), xq.a.a(paramParcel1.readStrongBinder()), paramParcel1.readInt());
        paramParcel2.writeNoException();
        paramParcel2.writeStrongBinder(paramParcel1);
        return true;
      }
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
      e locale2 = e.a.a(paramParcel1.readStrongBinder());
      localObject = locale1;
      if (paramParcel1.readInt() != 0) {
        localObject = (AdSizeParcel)AdSizeParcel.CREATOR.createFromParcel(paramParcel1);
      }
      paramParcel1 = a(locale2, (AdSizeParcel)localObject, paramParcel1.readString(), xq.a.a(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      paramParcel2.writeStrongBinder(paramParcel1);
      return true;
    }
    
    private static class a
      implements al
    {
      private IBinder a;
      
      a(IBinder paramIBinder)
      {
        this.a = paramIBinder;
      }
      
      /* Error */
      public IBinder a(e parame, AdSizeParcel paramAdSizeParcel, String paramString, xq paramxq, int paramInt)
      {
        // Byte code:
        //   0: aconst_null
        //   1: astore 6
        //   3: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   6: astore 7
        //   8: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 8
        //   13: aload 7
        //   15: ldc 27
        //   17: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   20: aload_1
        //   21: ifnull +107 -> 128
        //   24: aload_1
        //   25: invokeinterface 37 1 0
        //   30: astore_1
        //   31: aload 7
        //   33: aload_1
        //   34: invokevirtual 40	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   37: aload_2
        //   38: ifnull +95 -> 133
        //   41: aload 7
        //   43: iconst_1
        //   44: invokevirtual 44	android/os/Parcel:writeInt	(I)V
        //   47: aload_2
        //   48: aload 7
        //   50: iconst_0
        //   51: invokevirtual 50	com/google/android/gms/ads/internal/client/AdSizeParcel:writeToParcel	(Landroid/os/Parcel;I)V
        //   54: aload 7
        //   56: aload_3
        //   57: invokevirtual 53	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   60: aload 6
        //   62: astore_1
        //   63: aload 4
        //   65: ifnull +11 -> 76
        //   68: aload 4
        //   70: invokeinterface 56 1 0
        //   75: astore_1
        //   76: aload 7
        //   78: aload_1
        //   79: invokevirtual 40	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   82: aload 7
        //   84: iload 5
        //   86: invokevirtual 44	android/os/Parcel:writeInt	(I)V
        //   89: aload_0
        //   90: getfield 17	com/google/android/gms/ads/internal/client/al$a$a:a	Landroid/os/IBinder;
        //   93: iconst_1
        //   94: aload 7
        //   96: aload 8
        //   98: iconst_0
        //   99: invokeinterface 62 5 0
        //   104: pop
        //   105: aload 8
        //   107: invokevirtual 65	android/os/Parcel:readException	()V
        //   110: aload 8
        //   112: invokevirtual 68	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
        //   115: astore_1
        //   116: aload 8
        //   118: invokevirtual 71	android/os/Parcel:recycle	()V
        //   121: aload 7
        //   123: invokevirtual 71	android/os/Parcel:recycle	()V
        //   126: aload_1
        //   127: areturn
        //   128: aconst_null
        //   129: astore_1
        //   130: goto -99 -> 31
        //   133: aload 7
        //   135: iconst_0
        //   136: invokevirtual 44	android/os/Parcel:writeInt	(I)V
        //   139: goto -85 -> 54
        //   142: astore_1
        //   143: aload 8
        //   145: invokevirtual 71	android/os/Parcel:recycle	()V
        //   148: aload 7
        //   150: invokevirtual 71	android/os/Parcel:recycle	()V
        //   153: aload_1
        //   154: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	155	0	this	a
        //   0	155	1	parame	e
        //   0	155	2	paramAdSizeParcel	AdSizeParcel
        //   0	155	3	paramString	String
        //   0	155	4	paramxq	xq
        //   0	155	5	paramInt	int
        //   1	60	6	localObject	Object
        //   6	143	7	localParcel1	Parcel
        //   11	133	8	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   13	20	142	finally
        //   24	31	142	finally
        //   31	37	142	finally
        //   41	54	142	finally
        //   54	60	142	finally
        //   68	76	142	finally
        //   76	116	142	finally
        //   133	139	142	finally
      }
      
      /* Error */
      public IBinder a(e parame, AdSizeParcel paramAdSizeParcel, String paramString, xq paramxq, int paramInt1, int paramInt2)
      {
        // Byte code:
        //   0: aconst_null
        //   1: astore 7
        //   3: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   6: astore 8
        //   8: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 9
        //   13: aload 8
        //   15: ldc 27
        //   17: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   20: aload_1
        //   21: ifnull +114 -> 135
        //   24: aload_1
        //   25: invokeinterface 37 1 0
        //   30: astore_1
        //   31: aload 8
        //   33: aload_1
        //   34: invokevirtual 40	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   37: aload_2
        //   38: ifnull +102 -> 140
        //   41: aload 8
        //   43: iconst_1
        //   44: invokevirtual 44	android/os/Parcel:writeInt	(I)V
        //   47: aload_2
        //   48: aload 8
        //   50: iconst_0
        //   51: invokevirtual 50	com/google/android/gms/ads/internal/client/AdSizeParcel:writeToParcel	(Landroid/os/Parcel;I)V
        //   54: aload 8
        //   56: aload_3
        //   57: invokevirtual 53	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   60: aload 7
        //   62: astore_1
        //   63: aload 4
        //   65: ifnull +11 -> 76
        //   68: aload 4
        //   70: invokeinterface 56 1 0
        //   75: astore_1
        //   76: aload 8
        //   78: aload_1
        //   79: invokevirtual 40	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   82: aload 8
        //   84: iload 5
        //   86: invokevirtual 44	android/os/Parcel:writeInt	(I)V
        //   89: aload 8
        //   91: iload 6
        //   93: invokevirtual 44	android/os/Parcel:writeInt	(I)V
        //   96: aload_0
        //   97: getfield 17	com/google/android/gms/ads/internal/client/al$a$a:a	Landroid/os/IBinder;
        //   100: iconst_2
        //   101: aload 8
        //   103: aload 9
        //   105: iconst_0
        //   106: invokeinterface 62 5 0
        //   111: pop
        //   112: aload 9
        //   114: invokevirtual 65	android/os/Parcel:readException	()V
        //   117: aload 9
        //   119: invokevirtual 68	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
        //   122: astore_1
        //   123: aload 9
        //   125: invokevirtual 71	android/os/Parcel:recycle	()V
        //   128: aload 8
        //   130: invokevirtual 71	android/os/Parcel:recycle	()V
        //   133: aload_1
        //   134: areturn
        //   135: aconst_null
        //   136: astore_1
        //   137: goto -106 -> 31
        //   140: aload 8
        //   142: iconst_0
        //   143: invokevirtual 44	android/os/Parcel:writeInt	(I)V
        //   146: goto -92 -> 54
        //   149: astore_1
        //   150: aload 9
        //   152: invokevirtual 71	android/os/Parcel:recycle	()V
        //   155: aload 8
        //   157: invokevirtual 71	android/os/Parcel:recycle	()V
        //   160: aload_1
        //   161: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	162	0	this	a
        //   0	162	1	parame	e
        //   0	162	2	paramAdSizeParcel	AdSizeParcel
        //   0	162	3	paramString	String
        //   0	162	4	paramxq	xq
        //   0	162	5	paramInt1	int
        //   0	162	6	paramInt2	int
        //   1	60	7	localObject	Object
        //   6	150	8	localParcel1	Parcel
        //   11	140	9	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   13	20	149	finally
        //   24	31	149	finally
        //   31	37	149	finally
        //   41	54	149	finally
        //   54	60	149	finally
        //   68	76	149	finally
        //   76	123	149	finally
        //   140	146	149	finally
      }
      
      public IBinder asBinder()
      {
        return this.a;
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/client/al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */