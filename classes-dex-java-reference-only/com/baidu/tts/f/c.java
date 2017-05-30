package com.baidu.tts.f;

public enum c
{
  private final String v;
  private final String w;
  
  private c(String paramString1, String paramString2)
  {
    this.v = paramString1;
    this.w = paramString2;
  }
  
  public static c a(String paramString)
  {
    c[] arrayOfc = values();
    int i2 = arrayOfc.length;
    int i1 = 0;
    while (i1 < i2)
    {
      c localc = arrayOfc[i1];
      if (localc.a().equals(paramString)) {
        return localc;
      }
      i1 += 1;
    }
    return null;
  }
  
  public String a()
  {
    return this.w;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/baidu/tts/f/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */