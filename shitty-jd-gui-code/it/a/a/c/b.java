package it.a.a.c;

import it.a.a.n;
import it.a.a.q;
import it.a.a.r;
import java.io.PrintStream;
import java.util.Date;
import java.util.StringTokenizer;

public class b
  implements r
{
  public static void b(String[] paramArrayOfString)
  {
    int i = 0;
    paramArrayOfString = new b().a(new String[] { "+i8388621.29609,m824255902,/,\tdev", "+i8388621.44468,m839956783,r,s10376,\tRFCEPLF" });
    while (i < paramArrayOfString.length)
    {
      System.out.println(paramArrayOfString[i]);
      i += 1;
    }
  }
  
  public n[] a(String[] paramArrayOfString)
  {
    int k = paramArrayOfString.length;
    int i = 0;
    Object localObject1 = null;
    Object localObject2;
    int j;
    Object localObject3;
    String str;
    long l1;
    StringTokenizer localStringTokenizer;
    if (i < k)
    {
      localObject2 = paramArrayOfString[i];
      if (((String)localObject2).charAt(0) != '+') {
        throw new q();
      }
      j = ((String)localObject2).indexOf('\t');
      if (j == -1) {
        throw new q();
      }
      localObject3 = ((String)localObject2).substring(1, j);
      str = ((String)localObject2).substring(j + 1, ((String)localObject2).length());
      localObject2 = null;
      j = 0;
      l1 = 0L;
      localStringTokenizer = new StringTokenizer((String)localObject3, ",");
    }
    for (;;)
    {
      int n;
      if (localStringTokenizer.hasMoreTokens())
      {
        localObject3 = localStringTokenizer.nextToken();
        int m = ((String)localObject3).length();
        if (m <= 0) {
          continue;
        }
        if (m == 1)
        {
          if (!((String)localObject3).equals("/")) {
            continue;
          }
          j = 1;
          continue;
        }
        n = ((String)localObject3).charAt(0);
        localObject3 = ((String)localObject3).substring(1, m);
        if (n != 115) {}
      }
      try
      {
        long l2 = Long.parseLong((String)localObject3);
        l1 = l2;
      }
      catch (Throwable localThrowable1) {}
      if (n == 109)
      {
        try
        {
          localObject3 = new Date(Long.parseLong((String)localObject3) * 1000L);
          localObject2 = localObject3;
        }
        catch (Throwable localThrowable2) {}
        localObject3 = localObject1;
        if (localObject1 == null) {
          localObject3 = new n[k];
        }
        localObject3[i] = new n();
        localObject3[i].a(str);
        localObject3[i].a((Date)localObject2);
        localObject3[i].a(l1);
        localObject1 = localObject3[i];
        if (j != 0) {}
        for (j = 1;; j = 0)
        {
          ((n)localObject1).a(j);
          i += 1;
          localObject1 = localObject3;
          break;
        }
        continue;
        return (n[])localObject1;
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/it/a/a/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */