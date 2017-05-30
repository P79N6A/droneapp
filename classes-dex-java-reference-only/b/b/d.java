package b.b;

public class d
  extends b
{
  private static final int a = 20;
  private static final long serialVersionUID = 1L;
  private String b;
  private String c;
  
  public d(String paramString1, String paramString2, String paramString3)
  {
    super(paramString1);
    this.b = paramString2;
    this.c = paramString3;
  }
  
  public String a()
  {
    return this.c;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public String getMessage()
  {
    return new c(20, this.b, this.c).a(super.getMessage());
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/b/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */