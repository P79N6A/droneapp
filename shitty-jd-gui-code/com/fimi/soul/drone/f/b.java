package com.fimi.soul.drone.f;

import com.fimi.soul.drone.c.a.a.bn;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.Queue;

public class b
{
  public static final int a = 176;
  public static Queue<bn> b = new LinkedList();
  
  public static Queue<bn> a()
  {
    return b;
  }
  
  public static void a(Queue<bn> paramQueue)
  {
    paramQueue.removeAll(paramQueue);
  }
  
  public static byte[] a(int paramInt, InputStream paramInputStream, long paramLong)
  {
    int i = 1;
    if (b.size() > 1) {
      a(b);
    }
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    byte[] arrayOfByte = new byte['°'];
    int j = paramInputStream.read(arrayOfByte);
    if (j != -1)
    {
      localByteArrayOutputStream.write(arrayOfByte, 0, j);
      bn localbn = new bn();
      localbn.e = ((byte)paramInt);
      localbn.d = ((short)i);
      if (arrayOfByte.length == 176)
      {
        localbn.a(arrayOfByte.length);
        localbn.b(arrayOfByte.length + 3);
        j = 0;
        while (j < arrayOfByte.length)
        {
          localbn.f[j] = arrayOfByte[j];
          j += 1;
        }
        b.offer(localbn);
      }
      for (;;)
      {
        arrayOfByte = new byte['°'];
        i += 1;
        break;
        localbn.a(arrayOfByte.length);
        localbn.b(arrayOfByte.length + 3);
        j = 0;
        while (j < arrayOfByte.length)
        {
          localbn.f[j] = arrayOfByte[j];
          j += 1;
        }
        b.offer(localbn);
      }
    }
    paramInputStream.close();
    localByteArrayOutputStream.close();
    return localByteArrayOutputStream.toByteArray();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/f/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */