package com.fimi.kernel.a;

public class g
{
  public String a;
  public String b;
  public String c;
  public String d;
  public int e;
  public String f;
  
  public g(String paramString)
  {
    if (paramString == null) {}
    do
    {
      do
      {
        return;
        paramString = paramString.split("[\\s]+");
      } while (paramString.length != 9);
      this.d = paramString[0];
      this.a = paramString[1];
      this.c = paramString[2];
      this.e = Integer.parseInt(paramString[4]);
      this.b = paramString[8];
    } while (!a());
    this.f = this.a;
  }
  
  public boolean a()
  {
    return "zygote".equals(this.b);
  }
  
  public boolean b()
  {
    return (this.c.equals(this.f)) && (this.d.startsWith("app_"));
  }
  
  public String toString()
  {
    return "PsRow ( " + super.toString() + ";" + "pid = " + this.a + ";" + "cmd = " + this.b + ";" + "ppid = " + this.c + ";" + "user = " + this.d + ";" + "mem = " + this.e + " )";
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */