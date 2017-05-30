package com.b.a.a.a.a.a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.b.a.c.c;
import com.b.a.c.c.a;
import com.b.a.c.d;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class b
  implements com.b.a.a.a.a
{
  public static final int a = 32768;
  public static final Bitmap.CompressFormat b = Bitmap.CompressFormat.PNG;
  public static final int c = 100;
  private static final String i = " argument must be not null";
  private static final String j = " argument must be positive number";
  protected a d;
  protected final com.b.a.a.a.b.a e;
  protected int f = 32768;
  protected Bitmap.CompressFormat g = b;
  protected int h = 100;
  private File k;
  
  public b(File paramFile, com.b.a.a.a.b.a parama, long paramLong)
  {
    this(paramFile, null, parama, paramLong, 0);
  }
  
  public b(File paramFile1, File paramFile2, com.b.a.a.a.b.a parama, long paramLong, int paramInt)
  {
    if (paramFile1 == null) {
      throw new IllegalArgumentException("cacheDir argument must be not null");
    }
    if (paramLong < 0L) {
      throw new IllegalArgumentException("cacheMaxSize argument must be positive number");
    }
    if (paramInt < 0) {
      throw new IllegalArgumentException("cacheMaxFileCount argument must be positive number");
    }
    if (parama == null) {
      throw new IllegalArgumentException("fileNameGenerator argument must be not null");
    }
    if (paramLong == 0L) {
      paramLong = Long.MAX_VALUE;
    }
    for (;;)
    {
      if (paramInt == 0) {
        paramInt = Integer.MAX_VALUE;
      }
      for (;;)
      {
        this.k = paramFile2;
        this.e = parama;
        a(paramFile1, paramFile2, paramLong, paramInt);
        return;
      }
    }
  }
  
  private void a(File paramFile1, File paramFile2, long paramLong, int paramInt)
  {
    try
    {
      this.d = a.a(paramFile1, 1, 1, paramLong, paramInt);
      return;
    }
    catch (IOException paramFile1)
    {
      do
      {
        d.a(paramFile1);
        if (paramFile2 != null) {
          a(paramFile2, null, paramLong, paramInt);
        }
      } while (this.d != null);
      throw paramFile1;
    }
  }
  
  private String c(String paramString)
  {
    return this.e.a(paramString);
  }
  
  public File a()
  {
    return this.d.a();
  }
  
  /* Error */
  public File a(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aconst_null
    //   4: astore_2
    //   5: aload_0
    //   6: getfield 84	com/b/a/a/a/a/a/b:d	Lcom/b/a/a/a/a/a/a;
    //   9: aload_0
    //   10: aload_1
    //   11: invokespecial 100	com/b/a/a/a/a/a/b:c	(Ljava/lang/String;)Ljava/lang/String;
    //   14: invokevirtual 103	com/b/a/a/a/a/a/a:a	(Ljava/lang/String;)Lcom/b/a/a/a/a/a/a$c;
    //   17: astore_1
    //   18: aload_1
    //   19: ifnonnull +17 -> 36
    //   22: aload_2
    //   23: astore_3
    //   24: aload_1
    //   25: ifnull +9 -> 34
    //   28: aload_1
    //   29: invokevirtual 108	com/b/a/a/a/a/a/a$c:close	()V
    //   32: aload_2
    //   33: astore_3
    //   34: aload_3
    //   35: areturn
    //   36: aload_1
    //   37: astore_2
    //   38: aload_1
    //   39: iconst_0
    //   40: invokevirtual 111	com/b/a/a/a/a/a/a$c:a	(I)Ljava/io/File;
    //   43: astore_3
    //   44: aload_3
    //   45: astore_2
    //   46: goto -24 -> 22
    //   49: astore_3
    //   50: aconst_null
    //   51: astore_1
    //   52: aload_1
    //   53: astore_2
    //   54: aload_3
    //   55: invokestatic 89	com/b/a/c/d:a	(Ljava/lang/Throwable;)V
    //   58: aload 4
    //   60: astore_3
    //   61: aload_1
    //   62: ifnull -28 -> 34
    //   65: aload_1
    //   66: invokevirtual 108	com/b/a/a/a/a/a/a$c:close	()V
    //   69: aconst_null
    //   70: areturn
    //   71: astore_1
    //   72: aconst_null
    //   73: astore_2
    //   74: aload_2
    //   75: ifnull +7 -> 82
    //   78: aload_2
    //   79: invokevirtual 108	com/b/a/a/a/a/a/a$c:close	()V
    //   82: aload_1
    //   83: athrow
    //   84: astore_1
    //   85: goto -11 -> 74
    //   88: astore_3
    //   89: goto -37 -> 52
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	92	0	this	b
    //   0	92	1	paramString	String
    //   4	75	2	localObject1	Object
    //   23	22	3	localObject2	Object
    //   49	6	3	localIOException1	IOException
    //   60	1	3	localObject3	Object
    //   88	1	3	localIOException2	IOException
    //   1	58	4	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   5	18	49	java/io/IOException
    //   5	18	71	finally
    //   38	44	84	finally
    //   54	58	84	finally
    //   38	44	88	java/io/IOException
  }
  
  public void a(int paramInt)
  {
    this.f = paramInt;
  }
  
  public void a(Bitmap.CompressFormat paramCompressFormat)
  {
    this.g = paramCompressFormat;
  }
  
  public boolean a(String paramString, Bitmap paramBitmap)
  {
    a.a locala = this.d.b(c(paramString));
    if (locala == null) {
      return false;
    }
    paramString = new BufferedOutputStream(locala.c(0), this.f);
    boolean bool;
    try
    {
      bool = paramBitmap.compress(this.g, this.h, paramString);
      c.a(paramString);
      if (bool)
      {
        locala.a();
        return bool;
      }
    }
    finally
    {
      c.a(paramString);
    }
    locala.b();
    return bool;
  }
  
  public boolean a(String paramString, InputStream paramInputStream, c.a parama)
  {
    paramString = this.d.b(c(paramString));
    if (paramString == null) {
      return false;
    }
    BufferedOutputStream localBufferedOutputStream = new BufferedOutputStream(paramString.c(0), this.f);
    try
    {
      boolean bool = c.a(paramInputStream, localBufferedOutputStream, parama, this.f);
      c.a(localBufferedOutputStream);
      if (bool)
      {
        paramString.a();
        return bool;
      }
      paramString.b();
      return bool;
    }
    finally
    {
      c.a(localBufferedOutputStream);
      paramString.b();
    }
  }
  
  public void b()
  {
    try
    {
      this.d.close();
      this.d = null;
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        d.a(localIOException);
      }
    }
  }
  
  public void b(int paramInt)
  {
    this.h = paramInt;
  }
  
  public boolean b(String paramString)
  {
    try
    {
      boolean bool = this.d.c(c(paramString));
      return bool;
    }
    catch (IOException paramString)
    {
      d.a(paramString);
    }
    return false;
  }
  
  public void c()
  {
    try
    {
      this.d.h();
    }
    catch (IOException localIOException1)
    {
      for (;;)
      {
        try
        {
          a(this.d.a(), this.k, this.d.b(), this.d.c());
          return;
        }
        catch (IOException localIOException2)
        {
          d.a(localIOException2);
        }
        localIOException1 = localIOException1;
        d.a(localIOException1);
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/b/a/a/a/a/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */