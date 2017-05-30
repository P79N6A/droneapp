package it.a.a;

public class s
{
  private int a = 0;
  private String[] b;
  
  s(int paramInt, String[] paramArrayOfString)
  {
    this.a = paramInt;
    this.b = paramArrayOfString;
  }
  
  public int a()
  {
    return this.a;
  }
  
  public boolean b()
  {
    int i = this.a - 200;
    return (i >= 0) && (i < 100);
  }
  
  public String[] c()
  {
    return this.b;
  }
  
  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(getClass().getName());
    localStringBuffer.append(" [code=");
    localStringBuffer.append(this.a);
    localStringBuffer.append(", message=");
    int i = 0;
    while (i < this.b.length)
    {
      if (i > 0) {
        localStringBuffer.append(" ");
      }
      localStringBuffer.append(this.b[i]);
      i += 1;
    }
    localStringBuffer.append("]");
    return localStringBuffer.toString();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/it/a/a/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */