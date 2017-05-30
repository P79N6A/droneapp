package com.b.a.a.a.a;

import android.graphics.Bitmap;
import com.b.a.c.c.a;
import java.io.File;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class b
  extends a
{
  private final long j;
  private final Map<File, Long> k = Collections.synchronizedMap(new HashMap());
  
  public b(File paramFile, long paramLong)
  {
    this(paramFile, null, com.b.a.b.a.b(), paramLong);
  }
  
  public b(File paramFile1, File paramFile2, long paramLong)
  {
    this(paramFile1, paramFile2, com.b.a.b.a.b(), paramLong);
  }
  
  public b(File paramFile1, File paramFile2, com.b.a.a.a.b.a parama, long paramLong)
  {
    super(paramFile1, paramFile2, parama);
    this.j = (1000L * paramLong);
  }
  
  private void d(String paramString)
  {
    paramString = c(paramString);
    long l = System.currentTimeMillis();
    paramString.setLastModified(l);
    this.k.put(paramString, Long.valueOf(l));
  }
  
  public File a(String paramString)
  {
    File localFile = super.a(paramString);
    int i;
    if ((localFile != null) && (localFile.exists()))
    {
      paramString = (Long)this.k.get(localFile);
      if (paramString != null) {
        break label79;
      }
      i = 0;
      paramString = Long.valueOf(localFile.lastModified());
      if (System.currentTimeMillis() - paramString.longValue() <= this.j) {
        break label84;
      }
      localFile.delete();
      this.k.remove(localFile);
    }
    label79:
    label84:
    while (i != 0)
    {
      return localFile;
      i = 1;
      break;
    }
    this.k.put(localFile, paramString);
    return localFile;
  }
  
  public boolean a(String paramString, Bitmap paramBitmap)
  {
    boolean bool = super.a(paramString, paramBitmap);
    d(paramString);
    return bool;
  }
  
  public boolean a(String paramString, InputStream paramInputStream, c.a parama)
  {
    boolean bool = super.a(paramString, paramInputStream, parama);
    d(paramString);
    return bool;
  }
  
  public boolean b(String paramString)
  {
    this.k.remove(c(paramString));
    return super.b(paramString);
  }
  
  public void c()
  {
    super.c();
    this.k.clear();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/b/a/a/a/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */