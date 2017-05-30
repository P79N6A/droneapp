package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.c.f;
import com.google.android.gms.internal.akb;
import com.google.android.gms.internal.akb.a;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.HashMap;
import java.util.Map;

final class l
{
  private static volatile akb a;
  private static volatile ak b;
  private static final Map<String, c> c = new HashMap();
  private static final Map<String, d> d = new HashMap();
  
  /* Error */
  static android.os.IBinder a(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 34	com/google/android/gms/tagmanager/l:d	(Landroid/content/Context;)Lcom/google/android/gms/internal/akb;
    //   4: ldc 36
    //   6: invokevirtual 41	com/google/android/gms/internal/akb:a	(Ljava/lang/String;)Landroid/os/IBinder;
    //   9: invokestatic 47	com/google/android/gms/tagmanager/al$a:asInterface	(Landroid/os/IBinder;)Lcom/google/android/gms/tagmanager/al;
    //   12: astore_1
    //   13: aload_1
    //   14: aload_0
    //   15: invokestatic 52	com/google/android/gms/c/f:a	(Ljava/lang/Object;)Lcom/google/android/gms/c/e;
    //   18: aload_0
    //   19: invokestatic 56	com/google/android/gms/tagmanager/l:e	(Landroid/content/Context;)Lcom/google/android/gms/tagmanager/aj;
    //   22: invokestatic 59	com/google/android/gms/tagmanager/l:a	()Lcom/google/android/gms/tagmanager/af;
    //   25: invokeinterface 65 4 0
    //   30: invokeinterface 71 1 0
    //   35: astore_0
    //   36: aload_0
    //   37: areturn
    //   38: astore_0
    //   39: new 73	java/lang/IllegalStateException
    //   42: dup
    //   43: aload_0
    //   44: invokespecial 76	java/lang/IllegalStateException:<init>	(Ljava/lang/Throwable;)V
    //   47: athrow
    //   48: astore_0
    //   49: new 78	java/lang/RuntimeException
    //   52: dup
    //   53: aload_0
    //   54: invokespecial 79	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   57: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	58	0	paramContext	Context
    //   12	2	1	localal	al
    // Exception table:
    //   from	to	target	type
    //   13	36	38	android/os/RemoteException
    //   0	13	48	com/google/android/gms/internal/akb$a
    //   13	36	48	com/google/android/gms/internal/akb$a
    //   39	48	48	com/google/android/gms/internal/akb$a
  }
  
  static af a()
  {
    return new l.2();
  }
  
  static void a(Intent paramIntent, Context paramContext)
  {
    ak localak = c(paramContext);
    try
    {
      localak.previewIntent(paramIntent, f.a(paramContext), f.a(a.a()), e(paramContext), a());
      return;
    }
    catch (RemoteException paramIntent)
    {
      throw new IllegalStateException(paramIntent);
    }
    finally {}
  }
  
  /* Error */
  private static Object b(String paramString, Class<?> paramClass)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 4
    //   3: aload_0
    //   4: invokestatic 118	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   7: astore 6
    //   9: aload 6
    //   11: invokevirtual 122	java/lang/Class:getInterfaces	()[Ljava/lang/Class;
    //   14: astore 7
    //   16: aload 7
    //   18: arraylength
    //   19: istore 5
    //   21: iconst_0
    //   22: istore_2
    //   23: iload 4
    //   25: istore_3
    //   26: iload_2
    //   27: iload 5
    //   29: if_icmpge +16 -> 45
    //   32: aload 7
    //   34: iload_2
    //   35: aaload
    //   36: aload_1
    //   37: invokevirtual 126	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   40: ifeq +71 -> 111
    //   43: iconst_1
    //   44: istore_3
    //   45: iload_3
    //   46: ifne +72 -> 118
    //   49: aload_1
    //   50: invokevirtual 130	java/lang/Class:getCanonicalName	()Ljava/lang/String;
    //   53: invokestatic 136	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   56: astore_1
    //   57: ldc -118
    //   59: new 140	java/lang/StringBuilder
    //   62: dup
    //   63: aload_0
    //   64: invokestatic 136	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   67: invokevirtual 144	java/lang/String:length	()I
    //   70: bipush 30
    //   72: iadd
    //   73: aload_1
    //   74: invokestatic 136	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   77: invokevirtual 144	java/lang/String:length	()I
    //   80: iadd
    //   81: invokespecial 147	java/lang/StringBuilder:<init>	(I)V
    //   84: aload_0
    //   85: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   88: ldc -103
    //   90: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   93: aload_1
    //   94: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   97: ldc -101
    //   99: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: invokevirtual 158	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   105: invokestatic 163	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   108: pop
    //   109: aconst_null
    //   110: areturn
    //   111: iload_2
    //   112: iconst_1
    //   113: iadd
    //   114: istore_2
    //   115: goto -92 -> 23
    //   118: aload 6
    //   120: iconst_0
    //   121: anewarray 114	java/lang/Class
    //   124: invokevirtual 167	java/lang/Class:getConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   127: iconst_0
    //   128: anewarray 4	java/lang/Object
    //   131: invokevirtual 173	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   134: astore_1
    //   135: aload_1
    //   136: areturn
    //   137: astore_1
    //   138: ldc -118
    //   140: aload_0
    //   141: invokestatic 136	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   144: ldc -81
    //   146: invokevirtual 179	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   149: invokestatic 163	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   152: pop
    //   153: aconst_null
    //   154: areturn
    //   155: astore_1
    //   156: ldc -118
    //   158: aload_0
    //   159: invokestatic 136	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   162: ldc -75
    //   164: invokevirtual 179	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   167: invokestatic 163	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   170: pop
    //   171: aconst_null
    //   172: areturn
    //   173: astore_1
    //   174: ldc -118
    //   176: aload_0
    //   177: invokestatic 136	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   180: ldc -73
    //   182: invokevirtual 179	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   185: invokestatic 163	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   188: pop
    //   189: aconst_null
    //   190: areturn
    //   191: astore_1
    //   192: ldc -118
    //   194: aload_0
    //   195: invokestatic 136	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   198: ldc -71
    //   200: invokevirtual 179	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   203: invokestatic 163	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   206: pop
    //   207: aconst_null
    //   208: areturn
    //   209: astore_1
    //   210: ldc -118
    //   212: aload_0
    //   213: invokestatic 136	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   216: ldc -69
    //   218: invokevirtual 179	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   221: invokestatic 163	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   224: pop
    //   225: aconst_null
    //   226: areturn
    //   227: astore_1
    //   228: ldc -118
    //   230: aload_0
    //   231: invokestatic 136	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   234: ldc -73
    //   236: invokevirtual 179	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   239: invokestatic 163	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   242: pop
    //   243: aconst_null
    //   244: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	245	0	paramString	String
    //   0	245	1	paramClass	Class<?>
    //   22	93	2	i	int
    //   25	21	3	j	int
    //   1	23	4	k	int
    //   19	11	5	m	int
    //   7	112	6	localClass	Class
    //   14	19	7	arrayOfClass	Class[]
    // Exception table:
    //   from	to	target	type
    //   118	135	137	java/lang/NoSuchMethodException
    //   3	21	155	java/lang/ClassNotFoundException
    //   32	43	155	java/lang/ClassNotFoundException
    //   49	109	155	java/lang/ClassNotFoundException
    //   118	135	155	java/lang/ClassNotFoundException
    //   138	153	155	java/lang/ClassNotFoundException
    //   174	189	155	java/lang/ClassNotFoundException
    //   192	207	155	java/lang/ClassNotFoundException
    //   210	225	155	java/lang/ClassNotFoundException
    //   228	243	155	java/lang/ClassNotFoundException
    //   118	135	173	java/lang/SecurityException
    //   118	135	191	java/lang/reflect/InvocationTargetException
    //   118	135	209	java/lang/InstantiationException
    //   118	135	227	java/lang/IllegalAccessException
  }
  
  static void b(Context paramContext)
  {
    ak localak = c(paramContext);
    try
    {
      localak.initialize(f.a(paramContext), e(paramContext), a());
      return;
    }
    catch (RemoteException paramContext)
    {
      throw new IllegalStateException(paramContext);
    }
    finally {}
  }
  
  private static ak c(Context paramContext)
  {
    localObject = b;
    if (localObject == null) {
      try
      {
        ak localak = b;
        localObject = localak;
        if (localak == null) {}
        try
        {
          localObject = ak.a.asInterface(d(paramContext).a("com.google.android.gms.tagmanager.TagManagerApiImpl"));
          b = (ak)localObject;
          return (ak)localObject;
        }
        catch (akb.a paramContext)
        {
          throw new RuntimeException(paramContext);
        }
        return (ak)localObject;
      }
      finally {}
    }
  }
  
  private static akb d(Context paramContext)
  {
    akb localakb = a;
    if (localakb == null) {
      try
      {
        localakb = a;
        if (a == null)
        {
          localakb = akb.a(paramContext, akb.c, "com.google.android.gms.tagmanager");
          a = localakb;
        }
        return localakb;
      }
      finally {}
    }
    return localakb;
  }
  
  private static aj e(Context paramContext)
  {
    return new l.1(AppMeasurement.getInstance(paramContext));
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/tagmanager/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */