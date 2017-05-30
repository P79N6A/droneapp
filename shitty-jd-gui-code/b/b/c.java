package b.b;

public class c
{
  private static final String a = "...";
  private static final String b = "]";
  private static final String c = "[";
  private int d;
  private String e;
  private String f;
  private int g;
  private int h;
  
  public c(int paramInt, String paramString1, String paramString2)
  {
    this.d = paramInt;
    this.e = paramString1;
    this.f = paramString2;
  }
  
  private void a()
  {
    this.g = 0;
    int i = Math.min(this.e.length(), this.f.length());
    for (;;)
    {
      if ((this.g >= i) || (this.e.charAt(this.g) != this.f.charAt(this.g))) {
        return;
      }
      this.g += 1;
    }
  }
  
  private String b(String paramString)
  {
    String str = "[" + paramString.substring(this.g, paramString.length() - this.h + 1) + "]";
    paramString = str;
    if (this.g > 0) {
      paramString = c() + str;
    }
    str = paramString;
    if (this.h > 0) {
      str = paramString + d();
    }
    return str;
  }
  
  private void b()
  {
    int i = this.e.length() - 1;
    int j = this.f.length() - 1;
    for (;;)
    {
      if ((j < this.g) || (i < this.g) || (this.e.charAt(i) != this.f.charAt(j)))
      {
        this.h = (this.e.length() - i);
        return;
      }
      j -= 1;
      i -= 1;
    }
  }
  
  private String c()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (this.g > this.d) {}
    for (String str = "...";; str = "") {
      return str + this.e.substring(Math.max(0, this.g - this.d), this.g);
    }
  }
  
  private String d()
  {
    int i = Math.min(this.e.length() - this.h + 1 + this.d, this.e.length());
    StringBuilder localStringBuilder = new StringBuilder().append(this.e.substring(this.e.length() - this.h + 1, i));
    if (this.e.length() - this.h + 1 < this.e.length() - this.d) {}
    for (String str = "...";; str = "") {
      return str;
    }
  }
  
  private boolean e()
  {
    return this.e.equals(this.f);
  }
  
  public String a(String paramString)
  {
    if ((this.e == null) || (this.f == null) || (e())) {
      return a.f(paramString, this.e, this.f);
    }
    a();
    b();
    return a.f(paramString, b(this.e), b(this.f));
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/b/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */