package com.fimi.kernel.b.d;

import android.os.Handler;
import android.os.Message;
import com.fimi.kernel.b;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class c
  extends b
  implements a
{
  private static c f = null;
  boolean a = true;
  private d b = new d();
  private Socket c = null;
  private DataOutputStream d;
  private DataInputStream e;
  private List<com.fimi.kernel.b.c.d> g = new ArrayList();
  private List<com.fimi.kernel.b.c.a> h = new ArrayList();
  private boolean i = true;
  private StringBuffer j = new StringBuffer();
  
  public static c c()
  {
    try
    {
      if (f == null) {
        f = new c();
      }
      c localc = f;
      return localc;
    }
    finally {}
  }
  
  private void c(String paramString)
  {
    this.a = false;
    Message localMessage = new Message();
    localMessage.obj = paramString;
    a().sendMessage(localMessage);
  }
  
  protected void a(Message paramMessage)
  {
    if ((paramMessage != null) && (paramMessage.obj != null))
    {
      Iterator localIterator = this.g.iterator();
      while (localIterator.hasNext()) {
        ((com.fimi.kernel.b.c.d)localIterator.next()).a(paramMessage.obj.toString());
      }
    }
  }
  
  public void a(com.fimi.kernel.b.c.a parama)
  {
    if (this.h.contains(parama)) {
      this.h.remove(parama);
    }
  }
  
  public void a(com.fimi.kernel.b.c.d paramd)
  {
    if (this.g.contains(paramd)) {
      this.g.remove(paramd);
    }
  }
  
  public void a(d paramd)
  {
    this.b = paramd;
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    try
    {
      if ((this.i) && (this.b.c())) {
        h();
      }
      if (this.d != null)
      {
        this.d.write(paramArrayOfByte);
        this.d.flush();
      }
      return;
    }
    catch (IOException paramArrayOfByte)
    {
      this.i = true;
      paramArrayOfByte.printStackTrace();
    }
  }
  
  public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      if ((this.i) && (this.b.c())) {
        h();
      }
      this.d.write(paramArrayOfByte, paramInt1, paramInt2);
      this.d.flush();
      return;
    }
    catch (IOException paramArrayOfByte)
    {
      this.i = true;
    }
  }
  
  public boolean a(String paramString)
  {
    this.b.a(paramString);
    return d();
  }
  
  public boolean a(String paramString, int paramInt)
  {
    this.b.a(paramString);
    this.b.a(paramInt);
    return d();
  }
  
  public void b(com.fimi.kernel.b.c.a parama)
  {
    if (parama != null) {
      this.h.add(parama);
    }
  }
  
  public void b(com.fimi.kernel.b.c.d paramd)
  {
    if (paramd != null) {
      this.g.add(paramd);
    }
  }
  
  public void b(String paramString)
  {
    a(paramString.getBytes());
  }
  
  public boolean b()
  {
    if (this.c == null) {
      return false;
    }
    return this.c.isConnected();
  }
  
  public boolean d()
  {
    try
    {
      this.c = new Socket(this.b.a(), this.b.b());
      this.c.setSoLinger(true, 0);
      this.d = new DataOutputStream(this.c.getOutputStream());
      this.e = new DataInputStream(this.c.getInputStream());
      a(new Runnable()
      {
        public void run()
        {
          byte[] arrayOfByte = new byte[c.a(c.this).e()];
          if (c.b(c.this).isConnected()) {}
          for (;;)
          {
            try
            {
              c.a(c.this, false);
              int i = c.c(c.this).read(arrayOfByte);
              if (i == -1)
              {
                if (!c.f(c.this)) {
                  break;
                }
                return;
              }
              if (c.d(c.this).size() > 0)
              {
                Iterator localIterator = c.d(c.this).iterator();
                if (!localIterator.hasNext()) {
                  continue;
                }
                ((com.fimi.kernel.b.c.a)localIterator.next()).a(i, arrayOfByte);
                continue;
              }
              localObject = new String(arrayOfByte, 0, i, c.a(c.this).f());
            }
            catch (Exception localException)
            {
              c.a(c.this, true);
              localException.printStackTrace();
              return;
            }
            Object localObject;
            if (c.a(c.this).d())
            {
              c.a(c.this, (String)localObject);
            }
            else
            {
              String str = ((String)localObject).replace(" ", "");
              if ((str.startsWith("{\"rval\":")) || (str.startsWith("{\"msg_id\"")))
              {
                c.e(c.this).delete(0, c.e(c.this).length());
                c.this.a = true;
              }
              if (c.this.a)
              {
                c.e(c.this).append((String)localObject);
                if ((c.e(c.this).toString().contains(":1282")) && ((c.e(c.this).length() > 50000) || (((String)localObject).endsWith("]}"))))
                {
                  str = c.e(c.this).toString();
                  localObject = str;
                  if (str.length() > 50000)
                  {
                    localObject = str.substring(0, 50000);
                    localObject = ((String)localObject).substring(0, ((String)localObject).lastIndexOf("}") + 1) + "]}";
                  }
                  c.a(c.this, (String)localObject);
                  c.e(c.this).delete(0, c.e(c.this).length());
                }
                else if ((!c.e(c.this).toString().contains(":1282")) && (((String)localObject).endsWith("}")))
                {
                  c.a(c.this, c.e(c.this).toString());
                  c.e(c.this).delete(0, c.e(c.this).length());
                }
              }
            }
          }
        }
      });
      return true;
    }
    catch (Exception localException)
    {
      this.i = true;
      localException.printStackTrace();
    }
    return false;
  }
  
  public boolean e()
  {
    return this.i;
  }
  
  public d f()
  {
    return this.b;
  }
  
  public void g()
  {
    try
    {
      this.d.close();
      this.d = null;
      try
      {
        this.e.close();
        this.e = null;
        try
        {
          this.c.close();
          this.i = true;
          return;
        }
        catch (Exception localException1)
        {
          for (;;) {}
        }
      }
      catch (Exception localException2)
      {
        for (;;) {}
      }
    }
    catch (Exception localException3)
    {
      for (;;) {}
    }
  }
  
  protected boolean h()
  {
    g();
    d();
    return false;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/b/d/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */