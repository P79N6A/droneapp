package com.b.a.b.a;

import java.io.FilterInputStream;
import java.io.InputStream;

public class c
  extends FilterInputStream
{
  public c(InputStream paramInputStream)
  {
    super(paramInputStream);
  }
  
  public long skip(long paramLong)
  {
    long l2;
    for (long l1 = 0L;; l1 = l2 + l1)
    {
      if (l1 < paramLong)
      {
        long l3 = this.in.skip(paramLong - l1);
        l2 = l3;
        if (l3 != 0L) {
          continue;
        }
        if (read() >= 0) {}
      }
      else
      {
        return l1;
      }
      l2 = 1L;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/b/a/b/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */