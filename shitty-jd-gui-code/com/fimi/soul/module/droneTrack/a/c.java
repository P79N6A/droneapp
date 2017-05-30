package com.fimi.soul.module.droneTrack.a;

import android.os.Looper;
import com.fimi.kernel.utils.x;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class c
{
  private static final String c = com.fimi.soul.biz.h.c.a().b();
  long a = 0L;
  int b = 0;
  private volatile String d;
  private List<Object> e = new ArrayList();
  private volatile Object f;
  
  public static c a()
  {
    return a.a();
  }
  
  private static Object[] b(String[] paramArrayOfString, int paramInt)
  {
    int i;
    ArrayList localArrayList;
    int j;
    if (paramArrayOfString.length % paramInt == 0)
    {
      i = paramArrayOfString.length / paramInt;
      localArrayList = new ArrayList();
      j = 0;
    }
    Object localObject;
    for (;;)
    {
      if (j >= i) {
        break label110;
      }
      localObject = new ArrayList();
      int k = j * paramInt;
      int m = 0;
      for (;;)
      {
        if ((m < paramInt) && (k < paramArrayOfString.length))
        {
          ((List)localObject).add(paramArrayOfString[k]);
          m += 1;
          k += 1;
          continue;
          i = paramArrayOfString.length / paramInt;
          break;
        }
      }
      localArrayList.add(localObject);
      j += 1;
    }
    label110:
    paramArrayOfString = new Object[localArrayList.size()];
    paramInt = 0;
    while (paramInt < localArrayList.size())
    {
      localObject = (List)localArrayList.get(paramInt);
      String[] arrayOfString = new String[((List)localObject).size()];
      i = 0;
      while (i < ((List)localObject).size())
      {
        arrayOfString[i] = ((String)((List)localObject).get(i));
        i += 1;
      }
      paramArrayOfString[paramInt] = arrayOfString;
      paramInt += 1;
    }
    return paramArrayOfString;
  }
  
  public void a(final String paramString, final com.fimi.soul.module.droneTrack.e parame)
  {
    x.b(new Runnable()
    {
      public void run()
      {
        if (Looper.myLooper() == null) {
          Looper.prepare();
        }
        c.this.a = System.currentTimeMillis();
        Object localObject1;
        if (paramString != null)
        {
          localObject1 = new File(paramString);
          if (!((File)localObject1).exists()) {}
        }
        try
        {
          Object localObject2 = new byte[(int)((File)localObject1).length()];
          localObject1 = new RandomAccessFile((File)localObject1, "rw");
          ((RandomAccessFile)localObject1).read((byte[])localObject2);
          localObject2 = new String((byte[])localObject2).split("\n");
          c.this.b();
          int i = localObject2.length;
          localObject2 = c.a((String[])localObject2, localObject2.length / 4);
          if (localObject2.length >= 4)
          {
            d locald = new d(parame);
            locald.d().a((String[])localObject2[0]);
            locald.c().a((String[])localObject2[1]);
            locald.b().a((String[])localObject2[2]);
            locald.a().a((String[])localObject2[3]);
            locald.e();
            Looper.loop();
          }
          ((RandomAccessFile)localObject1).close();
          return;
        }
        catch (Exception localException)
        {
          while (parame == null) {}
          parame.a(localException.toString());
        }
      }
    });
  }
  
  public void b()
  {
    b.a().d();
    this.b = 0;
    this.e.clear();
  }
  
  private static class a
  {
    private static c a = new c();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/droneTrack/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */