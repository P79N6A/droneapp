package org.c;

import org.b.k;
import org.b.l;
import org.c.b.e;
import org.c.b.f;

public class c
{
  private static String a(Object paramObject, String paramString)
  {
    if (paramObject == null) {}
    for (paramObject = "null";; paramObject = paramObject.getClass().getName()) {
      return (String)paramObject + "<" + paramString + ">";
    }
  }
  
  public static void a()
  {
    a(null);
  }
  
  @Deprecated
  public static void a(double paramDouble1, double paramDouble2)
  {
    a(null, paramDouble1, paramDouble2);
  }
  
  public static void a(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    a(null, paramDouble1, paramDouble2, paramDouble3);
  }
  
  public static void a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    b(null, paramFloat1, paramFloat2, paramFloat3);
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
  
  public static <T> void a(T paramT, k<? super T> paramk)
  {
    a("", paramT, paramk);
  }
  
  public static void a(String paramString)
  {
    if (paramString == null) {
      throw new AssertionError();
    }
    throw new AssertionError(paramString);
  }
  
  @Deprecated
  public static void a(String paramString, double paramDouble1, double paramDouble2)
  {
    a("Use assertEquals(expected, actual, delta) to compare floating-point numbers");
  }
  
  public static void a(String paramString, double paramDouble1, double paramDouble2, double paramDouble3)
  {
    if (!c(paramDouble1, paramDouble2, paramDouble3)) {
      c(paramString, Double.valueOf(paramDouble2));
    }
  }
  
  public static void a(String paramString, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if (c(paramFloat1, paramFloat2, paramFloat3)) {
      h(paramString, Float.valueOf(paramFloat1), Float.valueOf(paramFloat2));
    }
  }
  
  public static void a(String paramString, long paramLong1, long paramLong2)
  {
    if (paramLong1 == paramLong2) {
      c(paramString, Long.valueOf(paramLong2));
    }
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
    if (e(paramObject1, paramObject2)) {
      return;
    }
    if (((paramObject1 instanceof String)) && ((paramObject2 instanceof String)))
    {
      String str = paramString;
      if (paramString == null) {
        str = "";
      }
      throw new i(str, (String)paramObject1, (String)paramObject2);
    }
    h(paramString, paramObject1, paramObject2);
  }
  
  public static <T> void a(String paramString, T paramT, k<? super T> paramk)
  {
    l.a(paramString, paramT, paramk);
  }
  
  public static void a(String paramString, boolean paramBoolean)
  {
    if (!paramBoolean) {
      a(paramString);
    }
  }
  
  public static void a(String paramString, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    f(paramString, paramArrayOfByte1, paramArrayOfByte2);
  }
  
  public static void a(String paramString, char[] paramArrayOfChar1, char[] paramArrayOfChar2)
  {
    f(paramString, paramArrayOfChar1, paramArrayOfChar2);
  }
  
  public static void a(String paramString, double[] paramArrayOfDouble1, double[] paramArrayOfDouble2, double paramDouble)
  {
    new f(paramDouble).a(paramString, paramArrayOfDouble1, paramArrayOfDouble2);
  }
  
  public static void a(String paramString, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, float paramFloat)
  {
    new f(paramFloat).a(paramString, paramArrayOfFloat1, paramArrayOfFloat2);
  }
  
  public static void a(String paramString, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    f(paramString, paramArrayOfInt1, paramArrayOfInt2);
  }
  
  public static void a(String paramString, long[] paramArrayOfLong1, long[] paramArrayOfLong2)
  {
    f(paramString, paramArrayOfLong1, paramArrayOfLong2);
  }
  
  public static void a(String paramString, Object[] paramArrayOfObject1, Object[] paramArrayOfObject2)
  {
    f(paramString, paramArrayOfObject1, paramArrayOfObject2);
  }
  
  public static void a(String paramString, short[] paramArrayOfShort1, short[] paramArrayOfShort2)
  {
    f(paramString, paramArrayOfShort1, paramArrayOfShort2);
  }
  
  public static void a(String paramString, boolean[] paramArrayOfBoolean1, boolean[] paramArrayOfBoolean2)
  {
    f(paramString, paramArrayOfBoolean1, paramArrayOfBoolean2);
  }
  
  public static void a(boolean paramBoolean)
  {
    a(null, paramBoolean);
  }
  
  public static void a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    a(null, paramArrayOfByte1, paramArrayOfByte2);
  }
  
  public static void a(char[] paramArrayOfChar1, char[] paramArrayOfChar2)
  {
    a(null, paramArrayOfChar1, paramArrayOfChar2);
  }
  
  public static void a(double[] paramArrayOfDouble1, double[] paramArrayOfDouble2, double paramDouble)
  {
    a(null, paramArrayOfDouble1, paramArrayOfDouble2, paramDouble);
  }
  
  public static void a(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, float paramFloat)
  {
    a(null, paramArrayOfFloat1, paramArrayOfFloat2, paramFloat);
  }
  
  public static void a(int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    a(null, paramArrayOfInt1, paramArrayOfInt2);
  }
  
  public static void a(long[] paramArrayOfLong1, long[] paramArrayOfLong2)
  {
    a(null, paramArrayOfLong1, paramArrayOfLong2);
  }
  
  public static void a(Object[] paramArrayOfObject1, Object[] paramArrayOfObject2)
  {
    a(null, paramArrayOfObject1, paramArrayOfObject2);
  }
  
  public static void a(short[] paramArrayOfShort1, short[] paramArrayOfShort2)
  {
    a(null, paramArrayOfShort1, paramArrayOfShort2);
  }
  
  public static void a(boolean[] paramArrayOfBoolean1, boolean[] paramArrayOfBoolean2)
  {
    a(null, paramArrayOfBoolean1, paramArrayOfBoolean2);
  }
  
  public static void b(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    b(null, paramDouble1, paramDouble2, paramDouble3);
  }
  
  public static void b(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    a(null, paramFloat1, paramFloat2, paramFloat3);
  }
  
  public static void b(long paramLong1, long paramLong2)
  {
    b(null, paramLong1, paramLong2);
  }
  
  public static void b(Object paramObject)
  {
    b(null, paramObject);
  }
  
  public static void b(Object paramObject1, Object paramObject2)
  {
    b(null, paramObject1, paramObject2);
  }
  
  private static void b(String paramString)
  {
    String str = "";
    if (paramString != null) {
      str = paramString + " ";
    }
    a(str + "expected not same");
  }
  
  public static void b(String paramString, double paramDouble1, double paramDouble2, double paramDouble3)
  {
    if (c(paramDouble1, paramDouble2, paramDouble3)) {
      h(paramString, Double.valueOf(paramDouble1), Double.valueOf(paramDouble2));
    }
  }
  
  public static void b(String paramString, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if (!c(paramFloat1, paramFloat2, paramFloat3)) {
      c(paramString, Float.valueOf(paramFloat2));
    }
  }
  
  public static void b(String paramString, long paramLong1, long paramLong2)
  {
    if (paramLong1 != paramLong2) {
      h(paramString, Long.valueOf(paramLong1), Long.valueOf(paramLong2));
    }
  }
  
  public static void b(String paramString, Object paramObject)
  {
    if (paramObject == null) {
      return;
    }
    d(paramString, paramObject);
  }
  
  public static void b(String paramString, Object paramObject1, Object paramObject2)
  {
    if (e(paramObject1, paramObject2)) {
      c(paramString, paramObject2);
    }
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
  
  @Deprecated
  public static void b(String paramString, Object[] paramArrayOfObject1, Object[] paramArrayOfObject2)
  {
    a(paramString, paramArrayOfObject1, paramArrayOfObject2);
  }
  
  public static void b(boolean paramBoolean)
  {
    b(null, paramBoolean);
  }
  
  @Deprecated
  public static void b(Object[] paramArrayOfObject1, Object[] paramArrayOfObject2)
  {
    a(paramArrayOfObject1, paramArrayOfObject2);
  }
  
  public static void c(Object paramObject1, Object paramObject2)
  {
    c(null, paramObject1, paramObject2);
  }
  
  private static void c(String paramString, Object paramObject)
  {
    String str = "Values should be different. ";
    if (paramString != null) {
      str = paramString + ". ";
    }
    a(str + "Actual: " + paramObject);
  }
  
  public static void c(String paramString, Object paramObject1, Object paramObject2)
  {
    if (paramObject1 == paramObject2) {
      return;
    }
    g(paramString, paramObject1, paramObject2);
  }
  
  private static boolean c(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    if (Double.compare(paramDouble1, paramDouble2) == 0) {}
    while (Math.abs(paramDouble1 - paramDouble2) <= paramDouble3) {
      return false;
    }
    return true;
  }
  
  private static boolean c(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if (Float.compare(paramFloat1, paramFloat2) == 0) {}
    while (Math.abs(paramFloat1 - paramFloat2) <= paramFloat3) {
      return false;
    }
    return true;
  }
  
  public static void d(Object paramObject1, Object paramObject2)
  {
    d(null, paramObject1, paramObject2);
  }
  
  private static void d(String paramString, Object paramObject)
  {
    String str = "";
    if (paramString != null) {
      str = paramString + " ";
    }
    a(str + "expected null, but was:<" + paramObject + ">");
  }
  
  public static void d(String paramString, Object paramObject1, Object paramObject2)
  {
    if (paramObject1 == paramObject2) {
      b(paramString);
    }
  }
  
  static String e(String paramString, Object paramObject1, Object paramObject2)
  {
    String str2 = "";
    String str1 = str2;
    if (paramString != null)
    {
      str1 = str2;
      if (!paramString.equals("")) {
        str1 = paramString + " ";
      }
    }
    paramString = String.valueOf(paramObject1);
    str2 = String.valueOf(paramObject2);
    if (paramString.equals(str2)) {
      return str1 + "expected: " + a(paramObject1, paramString) + " but was: " + a(paramObject2, str2);
    }
    return str1 + "expected:<" + paramString + "> but was:<" + str2 + ">";
  }
  
  private static boolean e(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 == null) {
      return paramObject2 == null;
    }
    return f(paramObject1, paramObject2);
  }
  
  private static void f(String paramString, Object paramObject1, Object paramObject2)
  {
    new e().a(paramString, paramObject1, paramObject2);
  }
  
  private static boolean f(Object paramObject1, Object paramObject2)
  {
    return paramObject1.equals(paramObject2);
  }
  
  private static void g(String paramString, Object paramObject1, Object paramObject2)
  {
    String str = "";
    if (paramString != null) {
      str = paramString + " ";
    }
    a(str + "expected same:<" + paramObject1 + "> was not:<" + paramObject2 + ">");
  }
  
  private static void h(String paramString, Object paramObject1, Object paramObject2)
  {
    a(e(paramString, paramObject1, paramObject2));
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */