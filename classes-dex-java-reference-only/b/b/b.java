package b.b;

public class b
  extends AssertionError
{
  private static final long serialVersionUID = 1L;
  
  public b() {}
  
  public b(String paramString)
  {
    super(a(paramString));
  }
  
  private static String a(String paramString)
  {
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    return str;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/b/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */