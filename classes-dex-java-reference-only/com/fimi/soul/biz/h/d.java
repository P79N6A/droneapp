package com.fimi.soul.biz.h;

import com.fimi.kernel.utils.r;
import com.fimi.soul.utils.j;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class d
{
  private static final String j = c.a().b();
  private BufferedWriter a;
  private BufferedWriter b;
  private SimpleDateFormat c;
  private SimpleDateFormat d;
  private SimpleDateFormat e;
  private File f;
  private File g;
  private StringBuffer h = new StringBuffer();
  private StringBuilder i = new StringBuilder();
  
  public static d a()
  {
    return a.a();
  }
  
  private void a(StringBuilder paramStringBuilder, File paramFile)
  {
    try
    {
      if (this.a == null) {
        return;
      }
      this.a.write(paramStringBuilder.toString());
      this.a.flush();
      paramStringBuilder.delete(0, paramStringBuilder.length());
      return;
    }
    catch (Exception paramStringBuilder)
    {
      paramStringBuilder.printStackTrace();
    }
  }
  
  private StringBuilder c(com.fimi.soul.drone.c.a.c paramc)
  {
    paramc = paramc.e();
    int k = 0;
    while (k < paramc.length)
    {
      this.h.append(Character.forDigit((paramc[k] & 0xF0) >> 4, 16));
      this.h.append(Character.forDigit(paramc[k] & 0xF, 16));
      k += 1;
    }
    paramc = r.b(this.h.toString(), j);
    this.i.append(paramc);
    this.i.append("\n");
    this.h = this.h.delete(0, this.h.length());
    return this.i;
  }
  
  public void a(com.fimi.soul.drone.c.a.c paramc)
  {
    a(c(paramc), this.f);
  }
  
  public void b()
  {
    String str = g().format(new Date());
    File localFile = new File(j.a() + "/LOGDOWN/" + h() + "/DroneData");
    localFile.mkdirs();
    if ((this.f == null) || (!this.f.exists())) {
      this.f = new File(localFile, str + ".sf");
    }
    if (this.a == null) {}
    try
    {
      this.a = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f, true)));
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public void b(com.fimi.soul.drone.c.a.c paramc)
  {
    a(c(paramc), this.g);
  }
  
  public void c()
  {
    String str = g().format(Long.valueOf(System.currentTimeMillis()));
    File localFile = new File(j.a() + "/LOGDOWN/" + h() + "/DroneData");
    localFile.mkdirs();
    if ((this.g == null) || (!this.g.exists())) {
      this.g = new File(localFile, str + ".sf");
    }
    if (this.b == null) {}
    try
    {
      this.b = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.g, true)));
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public boolean d()
  {
    return (this.g != null) && (this.b != null);
  }
  
  public void e()
  {
    try
    {
      if (this.b != null)
      {
        this.b.close();
        this.b = null;
      }
      return;
    }
    catch (Exception localException) {}
  }
  
  public void f()
  {
    if (this.g != null)
    {
      this.g.delete();
      this.g = null;
    }
  }
  
  public SimpleDateFormat g()
  {
    if (this.c == null) {
      this.c = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
    }
    return this.c;
  }
  
  public String h()
  {
    if (this.d == null) {
      this.d = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
    }
    return this.d.format(new Date());
  }
  
  public String i()
  {
    if (this.e == null) {
      this.e = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss-SSS", Locale.US);
    }
    return this.e.format(new Date());
  }
  
  public boolean j()
  {
    return (this.a != null) && (this.f != null);
  }
  
  public void k()
  {
    if (this.a != null) {}
    try
    {
      this.a.close();
      this.a = null;
      this.f = null;
      return;
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
    }
  }
  
  public static class a
  {
    private static final d a = new d(null);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/h/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */