package it.a.a;

public class m
  extends Exception
{
  private static final long serialVersionUID = 1L;
  private int a;
  private String b;
  
  public m(int paramInt)
  {
    this.a = paramInt;
  }
  
  public m(int paramInt, String paramString)
  {
    this.a = paramInt;
    this.b = paramString;
  }
  
  public m(s params)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    String[] arrayOfString = params.c();
    int i = 0;
    while (i < arrayOfString.length)
    {
      if (i > 0) {
        localStringBuffer.append(System.getProperty("line.separator"));
      }
      localStringBuffer.append(arrayOfString[i]);
      i += 1;
    }
    this.a = params.a();
    this.b = localStringBuffer.toString();
  }
  
  public int a()
  {
    return this.a;
  }
  
  public String getMessage()
  {
    return this.b;
  }
  
  public String toString()
  {
    return getClass().getName() + " [code=" + this.a + ", message= " + this.b + "]";
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/it/a/a/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */