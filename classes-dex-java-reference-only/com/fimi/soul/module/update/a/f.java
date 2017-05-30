package com.fimi.soul.module.update.a;

import android.text.TextUtils;
import com.fimi.soul.biz.e.d;
import com.fimi.soul.drone.c.a.a.bn;
import com.fimi.soul.utils.j;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class f
  implements c
{
  private int a;
  private Queue<bn> b;
  
  public int a()
  {
    return this.a;
  }
  
  public long a(int paramInt)
  {
    return new File(b(paramInt)).length();
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    b localb2 = (b)com.fimi.kernel.c.c().a("sp_firmware_cache", b.class);
    b localb1 = localb2;
    if (localb2 == null) {
      localb1 = new b();
    }
    localb1.i().put(Integer.valueOf(paramInt1), Integer.valueOf(paramInt2));
    switch (paramInt1)
    {
    }
    for (;;)
    {
      com.fimi.kernel.c.c().a("sp_firmware_cache", localb1);
      return;
      localb1.c(paramInt2);
      continue;
      localb1.f(paramInt2);
      continue;
      localb1.g(paramInt2);
      continue;
      localb1.b(paramInt2);
      continue;
      localb1.e(paramInt2);
      continue;
      localb1.h(paramInt2);
      continue;
      localb1.a(paramInt2);
      continue;
      localb1.d(paramInt2);
      localb1.l(paramInt2);
      continue;
      localb1.e(paramInt2);
      continue;
      localb1.i(paramInt2);
      continue;
      localb1.j(paramInt2);
      continue;
      localb1.k(paramInt2);
      localb1.l(paramInt2);
      continue;
      localb1.m(paramInt2);
    }
  }
  
  public void a(int paramInt, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int i = 0;
    while (i < 4)
    {
      paramArrayOfByte2[(paramInt + i)] = paramArrayOfByte1[i];
      i += 1;
    }
  }
  
  public void a(e parame)
  {
    if (parame == null) {
      return;
    }
    Object localObject1 = new File(c(parame.d()));
    if (!((File)localObject1).exists()) {
      ((File)localObject1).mkdir();
    }
    int i = parame.d();
    parame.a();
    long l1 = parame.e();
    long l2 = parame.f();
    long l3 = parame.g();
    long l4 = parame.h();
    localObject1 = null;
    try
    {
      Object localObject2 = new File(c(parame.d()));
      parame = (e)localObject1;
      if (((File)localObject2).exists()) {
        parame = new FileInputStream((File)localObject2);
      }
      Object localObject3 = new File(b(i));
      if (!((File)localObject3).exists()) {
        ((File)localObject3).createNewFile();
      }
      localObject2 = com.fimi.soul.drone.g.b.a(l1);
      byte[] arrayOfByte1 = com.fimi.soul.drone.g.b.a(l2);
      byte[] arrayOfByte2 = com.fimi.soul.drone.g.b.a(l3);
      byte[] arrayOfByte3 = com.fimi.soul.drone.g.b.a(l4);
      localObject1 = com.fimi.soul.drone.f.c.a(parame);
      localObject3 = new FileOutputStream((File)localObject3);
      a(16, (byte[])localObject2, (byte[])localObject1);
      a(20, arrayOfByte1, (byte[])localObject1);
      a(24, arrayOfByte2, (byte[])localObject1);
      a(28, arrayOfByte3, (byte[])localObject1);
      a(48, com.fimi.soul.drone.g.b.a((int)com.fimi.soul.drone.g.b.a(com.fimi.soul.drone.f.a.a((byte[])localObject1), 12)), (byte[])localObject1);
      localObject2 = com.fimi.soul.drone.f.a.a((byte[])localObject1);
      i = (int)com.fimi.soul.drone.g.b.a((int[])localObject2, localObject2.length - 1);
      a(localObject1.length - 4, com.fimi.soul.drone.g.b.a(i), (byte[])localObject1);
      ((OutputStream)localObject3).write((byte[])localObject1);
      ((OutputStream)localObject3).flush();
      parame.close();
      ((OutputStream)localObject3).close();
      return;
    }
    catch (Exception parame)
    {
      parame.printStackTrace();
    }
  }
  
  public String b(int paramInt)
  {
    return String.format("%s", new Object[] { c(paramInt) + ".crc" });
  }
  
  public Queue<bn> b()
  {
    return this.b;
  }
  
  public String c(int paramInt)
  {
    boolean bool1 = d.a().i();
    boolean bool2 = d.a().j();
    Object localObject2 = null;
    Object localObject1;
    if ((paramInt == 0) && (bool2)) {
      localObject1 = "mifc";
    }
    while (TextUtils.isEmpty((CharSequence)localObject1))
    {
      return "";
      if ((paramInt == 3) && (bool2))
      {
        localObject1 = "micc";
      }
      else if ((paramInt == 1) && (bool2))
      {
        localObject1 = "mirc";
      }
      else if ((paramInt == 2) && (bool2))
      {
        localObject1 = "mirec";
      }
      else if ((paramInt == 10) && (bool2))
      {
        localObject1 = "misafety";
      }
      else if ((paramInt == 9) && (bool2))
      {
        localObject1 = "mils";
      }
      else if ((paramInt == 6) && (bool2))
      {
        localObject1 = "misf";
      }
      else if ((paramInt == 11) && (bool2))
      {
        localObject1 = "vmlinux_";
      }
      else if ((paramInt == 4) && (bool2))
      {
        localObject1 = "firmware.zip";
      }
      else if ((paramInt == 0) && (bool1))
      {
        localObject1 = "MI_FC_4K";
      }
      else if ((paramInt == 1) && (bool1))
      {
        localObject1 = "MI_RC_4K";
      }
      else if ((paramInt == 3) && (bool1))
      {
        localObject1 = "MI_GC_4K";
      }
      else if ((paramInt == 13) && (bool1))
      {
        localObject1 = "firmware-4k.zip";
      }
      else if ((paramInt == 10) && (bool1))
      {
        localObject1 = "safe-4k";
      }
      else if ((paramInt == 9) && (bool1))
      {
        localObject1 = "mils-4k";
      }
      else if ((paramInt == 6) && (bool1))
      {
        localObject1 = "misf-4k";
      }
      else if ((paramInt == 253) && (bool2))
      {
        localObject1 = "fc-bootloader-1080";
      }
      else
      {
        localObject1 = localObject2;
        if (paramInt == 5)
        {
          localObject1 = localObject2;
          if (bool2) {
            localObject1 = "mi_power_battery";
          }
        }
      }
    }
    return j.p() + (String)localObject1;
  }
  
  public Queue<bn> d(int paramInt)
  {
    File localFile = new File(b(paramInt));
    this.b = new LinkedList();
    if (localFile.exists()) {}
    try
    {
      com.fimi.soul.drone.f.b.a(paramInt, new FileInputStream(localFile), localFile.length());
      this.b = com.fimi.soul.drone.f.b.a();
      this.a = this.b.size();
      return this.b;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
      }
    }
  }
  
  public void e(int paramInt) {}
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/update/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */