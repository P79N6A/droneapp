package com.fimi.soul.service;

import com.fimi.soul.utils.j;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class b
{
  BufferedWriter a;
  BufferedWriter b;
  SimpleDateFormat c;
  
  public static b a()
  {
    return a.a();
  }
  
  private void a(com.fimi.soul.drone.c.a.c paramc)
  {
    if (paramc == null) {
      return;
    }
    paramc = paramc.e();
    try
    {
      if (this.b == null) {
        this.b = b();
      }
      this.b.write(c());
      this.b.write("    ");
      StringBuffer localStringBuffer = new StringBuffer(paramc.length * 2);
      int i = 0;
      while (i < paramc.length)
      {
        localStringBuffer.append(Character.forDigit((paramc[i] & 0xF0) >> 4, 16));
        localStringBuffer.append(Character.forDigit(paramc[i] & 0xF, 16));
        localStringBuffer.append(" ");
        i += 1;
      }
      this.b.write(localStringBuffer.toString());
      this.b.write("\n");
      this.b.flush();
      return;
    }
    catch (Exception paramc)
    {
      paramc.printStackTrace();
    }
  }
  
  private String c()
  {
    if (this.c == null) {
      this.c = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss", Locale.US);
    }
    return this.c.format(Long.valueOf(System.currentTimeMillis()));
  }
  
  public void a(ConcurrentHashMap<String, com.fimi.soul.drone.c.a.c> paramConcurrentHashMap)
  {
    if (paramConcurrentHashMap != null) {
      try
      {
        Iterator localIterator = paramConcurrentHashMap.keySet().iterator();
        while (localIterator.hasNext()) {
          a((com.fimi.soul.drone.c.a.c)paramConcurrentHashMap.get(localIterator.next()));
        }
      }
      finally {}
    }
  }
  
  public BufferedWriter b()
  {
    Object localObject1 = (com.fimi.soul.drone.e.a)com.fimi.kernel.c.c().a("0", com.fimi.soul.drone.e.a.class);
    if (localObject1 != null) {}
    Object localObject2;
    for (localObject1 = ((com.fimi.soul.drone.e.a)localObject1).d() + "" + ((com.fimi.soul.drone.e.a)localObject1).e() + "" + ((com.fimi.soul.drone.e.a)localObject1).g();; localObject2 = null) {
      for (;;)
      {
        try
        {
          File localFile = new File(j.a() + "/" + "SAVEDRONEINFO/");
          localFile.mkdirs();
          if (localObject1 == null) {
            continue;
          }
          localObject1 = new File(localFile, (String)localObject1);
          if ((((File)localObject1).exists()) || (this.a == null)) {
            continue;
          }
          this.a.close();
          ((File)localObject1).createNewFile();
          this.a = new BufferedWriter(new OutputStreamWriter(new FileOutputStream((File)localObject1, true)));
        }
        catch (Exception localException)
        {
          localException.printStackTrace();
          continue;
          if ((!localException.exists()) || (this.a != null)) {
            continue;
          }
          this.a = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(localException, true)));
          continue;
        }
        return this.a;
        localObject1 = "savedrone.txt";
        continue;
        if ((((File)localObject1).exists()) || (this.a != null)) {
          continue;
        }
        ((File)localObject1).createNewFile();
        this.a = new BufferedWriter(new OutputStreamWriter(new FileOutputStream((File)localObject1, true)));
      }
    }
  }
  
  private static class a
  {
    private static b a = new b();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/service/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */