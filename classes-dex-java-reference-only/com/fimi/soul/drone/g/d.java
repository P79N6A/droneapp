package com.fimi.soul.drone.g;

import android.content.Context;
import com.fimi.soul.drone.c.a.a.bn;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.Queue;

public class d
{
  public static Queue<bn> a = new LinkedList();
  
  public static Queue<bn> a()
  {
    return a;
  }
  
  public static void a(Queue<bn> paramQueue)
  {
    paramQueue.removeAll(paramQueue);
  }
  
  public static byte[] a(InputStream paramInputStream, long paramLong, Context paramContext)
  {
    if (a.size() > 1) {
      a(a);
    }
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    paramContext = new byte['´'];
    int i = 1;
    int j = paramInputStream.read(paramContext);
    if (j != -1)
    {
      localByteArrayOutputStream.write(paramContext, 0, j);
      bn localbn = new bn();
      localbn.d = ((short)i);
      if (paramContext.length == 180)
      {
        localbn.a(paramContext.length);
        localbn.b(paramContext.length + 2);
        j = 0;
        while (j < paramContext.length)
        {
          localbn.f[j] = paramContext[j];
          j += 1;
        }
        a.offer(localbn);
        label141:
        if (i != paramLong / 180L) {
          break label232;
        }
      }
      label232:
      for (paramContext = new byte[(int)(paramLong % 180L)];; paramContext = new byte['´'])
      {
        i += 1;
        break;
        localbn.a(paramContext.length);
        localbn.b(paramContext.length + 2);
        j = 0;
        while (j < paramContext.length)
        {
          localbn.f[j] = paramContext[j];
          j += 1;
        }
        a.offer(localbn);
        break label141;
      }
    }
    paramInputStream.close();
    localByteArrayOutputStream.close();
    return localByteArrayOutputStream.toByteArray();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/g/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */