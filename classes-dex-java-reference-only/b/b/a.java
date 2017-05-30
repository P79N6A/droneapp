package b.b;

@Deprecated
public class a
{
  public static void a(byte paramByte1, byte paramByte2)
  {
    a(null, paramByte1, paramByte2);
  }
  
  public static void a(char paramChar1, char paramChar2)
  {
    a(null, paramChar1, paramChar2);
  }
  
  public static void a(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    a(null, paramDouble1, paramDouble2, paramDouble3);
  }
  
  public static void a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    a(null, paramFloat1, paramFloat2, paramFloat3);
  }
  
  public static void a(int paramInt1, int paramInt2)
  {
    a(null, paramInt1, paramInt2);
  }
  
  public static void a(long paramLong1, long paramLong2)
  {
    a(null, paramLong1, paramLong2);
  }
  
  public static void a(Object paramObject)
  {
    a(null, paramObject);
  }
  
  public static void a(Object paramObject1, Object paramObject2)
  {
    a(null, paramObject1, paramObject2);
  }
  
  public static void a(String paramString)
  {
    if (paramString == null) {
      throw new b();
    }
    throw new b(paramString);
  }
  
  public static void a(String paramString, byte paramByte1, byte paramByte2)
  {
    a(paramString, Byte.valueOf(paramByte1), Byte.valueOf(paramByte2));
  }
  
  public static void a(String paramString, char paramChar1, char paramChar2)
  {
    a(paramString, Character.valueOf(paramChar1), Character.valueOf(paramChar2));
  }
  
  public static void a(String paramString, double paramDouble1, double paramDouble2, double paramDouble3)
  {
    if (Double.compare(paramDouble1, paramDouble2) == 0) {}
    while (Math.abs(paramDouble1 - paramDouble2) <= paramDouble3) {
      return;
    }
    e(paramString, new Double(paramDouble1), new Double(paramDouble2));
  }
  
  public static void a(String paramString, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if (Float.compare(paramFloat1, paramFloat2) == 0) {}
    while (Math.abs(paramFloat1 - paramFloat2) <= paramFloat3) {
      return;
    }
    e(paramString, new Float(paramFloat1), new Float(paramFloat2));
  }
  
  public static void a(String paramString, int paramInt1, int paramInt2)
  {
    a(paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2));
  }
  
  public static void a(String paramString, long paramLong1, long paramLong2)
  {
    a(paramString, Long.valueOf(paramLong1), Long.valueOf(paramLong2));
  }
  
  public static void a(String paramString, Object paramObject)
  {
    if (paramObject != null) {}
    for (boolean bool = true;; bool = false)
    {
      a(paramString, bool);
      return;
    }
  }
  
  public static void a(String paramString, Object paramObject1, Object paramObject2)
  {
    if ((paramObject1 == null) && (paramObject2 == null)) {}
    while ((paramObject1 != null) && (paramObject1.equals(paramObject2))) {
      return;
    }
    e(paramString, paramObject1, paramObject2);
  }
  
  public static void a(String paramString1, String paramString2)
  {
    a(null, paramString1, paramString2);
  }
  
  public static void a(String paramString1, String paramString2, String paramString3)
  {
    if ((paramString2 == null) && (paramString3 == null)) {}
    while ((paramString2 != null) && (paramString2.equals(paramString3))) {
      return;
    }
    String str = paramString1;
    if (paramString1 == null) {
      str = "";
    }
    throw new d(str, paramString2, paramString3);
  }
  
  public static void a(String paramString, short paramShort1, short paramShort2)
  {
    a(paramString, Short.valueOf(paramShort1), Short.valueOf(paramShort2));
  }
  
  public static void a(String paramString, boolean paramBoolean)
  {
    if (!paramBoolean) {
      a(paramString);
    }
  }
  
  public static void a(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    a(paramString, Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2));
  }
  
  public static void a(short paramShort1, short paramShort2)
  {
    a(null, paramShort1, paramShort2);
  }
  
  public static void a(boolean paramBoolean)
  {
    a(null, paramBoolean);
  }
  
  public static void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    a(null, paramBoolean1, paramBoolean2);
  }
  
  public static void b(Object paramObject)
  {
    if (paramObject != null) {
      b("Expected: <null> but was: " + paramObject.toString(), paramObject);
    }
  }
  
  public static void b(Object paramObject1, Object paramObject2)
  {
    b(null, paramObject1, paramObject2);
  }
  
  public static void b(String paramString)
  {
    if (paramString != null) {}
    for (paramString = paramString + " ";; paramString = "")
    {
      a(paramString + "expected not same");
      return;
    }
  }
  
  public static void b(String paramString, Object paramObject)
  {
    if (paramObject == null) {}
    for (boolean bool = true;; bool = false)
    {
      a(paramString, bool);
      return;
    }
  }
  
  public static void b(String paramString, Object paramObject1, Object paramObject2)
  {
    if (paramObject1 == paramObject2) {
      return;
    }
    d(paramString, paramObject1, paramObject2);
  }
  
  public static void b(String paramString, boolean paramBoolean)
  {
    if (!paramBoolean) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      a(paramString, paramBoolean);
      return;
    }
  }
  
  public static void b(boolean paramBoolean)
  {
    b(null, paramBoolean);
  }
  
  public static void c(Object paramObject1, Object paramObject2)
  {
    c(null, paramObject1, paramObject2);
  }
  
  public static void c(String paramString, Object paramObject1, Object paramObject2)
  {
    if (paramObject1 == paramObject2) {
      b(paramString);
    }
  }
  
  public static void d(String paramString, Object paramObject1, Object paramObject2)
  {
    if (paramString != null) {}
    for (paramString = paramString + " ";; paramString = "")
    {
      a(paramString + "expected same:<" + paramObject1 + "> was not:<" + paramObject2 + ">");
      return;
    }
  }
  
  public static void e()
  {
    a(null);
  }
  
  public static void e(String paramString, Object paramObject1, Object paramObject2)
  {
    a(f(paramString, paramObject1, paramObject2));
  }
  
  public static String f(String paramString, Object paramObject1, Object paramObject2)
  {
    String str2 = "";
    String str1 = str2;
    if (paramString != null)
    {
      str1 = str2;
      if (paramString.length() > 0) {
        str1 = paramString + " ";
      }
    }
    return str1 + "expected:<" + paramObject1 + "> but was:<" + paramObject2 + ">";
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/b/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */