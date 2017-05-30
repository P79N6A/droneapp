package it.a.a;

import java.util.Date;

public class n
{
  public static final int a = 0;
  public static final int b = 1;
  public static final int c = 2;
  private String d = null;
  private String e = null;
  private Date f = null;
  private long g = -1L;
  private int h;
  
  public Date a()
  {
    return this.f;
  }
  
  public void a(int paramInt)
  {
    this.h = paramInt;
  }
  
  public void a(long paramLong)
  {
    this.g = paramLong;
  }
  
  public void a(String paramString)
  {
    this.d = paramString;
  }
  
  public void a(Date paramDate)
  {
    this.f = paramDate;
  }
  
  public String b()
  {
    return this.d;
  }
  
  public void b(String paramString)
  {
    this.e = paramString;
  }
  
  public int c()
  {
    return this.h;
  }
  
  public long d()
  {
    return this.g;
  }
  
  public String e()
  {
    return this.e;
  }
  
  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(getClass().getName());
    localStringBuffer.append(" [name=");
    localStringBuffer.append(this.d);
    localStringBuffer.append(", type=");
    if (this.h == 0) {
      localStringBuffer.append("FILE");
    }
    for (;;)
    {
      localStringBuffer.append(", size=");
      localStringBuffer.append(this.g);
      localStringBuffer.append(", modifiedDate=");
      localStringBuffer.append(this.f);
      localStringBuffer.append("]");
      return localStringBuffer.toString();
      if (this.h == 1)
      {
        localStringBuffer.append("DIRECTORY");
      }
      else if (this.h == 2)
      {
        localStringBuffer.append("LINK");
        localStringBuffer.append(", link=");
        localStringBuffer.append(this.e);
      }
      else
      {
        localStringBuffer.append("UNKNOWN");
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/it/a/a/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */