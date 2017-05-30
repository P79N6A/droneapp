package com.google.android.gms.common.images;

public final class a
{
  private final int a;
  private final int b;
  
  public a(int paramInt1, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramInt2;
  }
  
  public static a a(String paramString)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("string must not be null");
    }
    int j = paramString.indexOf('*');
    int i = j;
    if (j < 0) {
      i = paramString.indexOf('x');
    }
    if (i < 0) {
      throw b(paramString);
    }
    try
    {
      a locala = new a(Integer.parseInt(paramString.substring(0, i)), Integer.parseInt(paramString.substring(i + 1)));
      return locala;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      throw b(paramString);
    }
  }
  
  private static NumberFormatException b(String paramString)
  {
    throw new NumberFormatException(String.valueOf(paramString).length() + 16 + "Invalid Size: \"" + paramString + "\"");
  }
  
  public int a()
  {
    return this.a;
  }
  
  public int b()
  {
    return this.b;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == null) {}
    do
    {
      return false;
      if (this == paramObject) {
        return true;
      }
    } while (!(paramObject instanceof a));
    paramObject = (a)paramObject;
    if ((this.a == ((a)paramObject).a) && (this.b == ((a)paramObject).b)) {}
    for (;;)
    {
      return bool;
      bool = false;
    }
  }
  
  public int hashCode()
  {
    return this.b ^ (this.a << 16 | this.a >>> 16);
  }
  
  public String toString()
  {
    int i = this.a;
    int j = this.b;
    return 23 + i + "x" + j;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/images/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */