package com.fimi.kernel.utils;

import com.fimi.kernel.a.a;
import com.fimi.kernel.a.e;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class l
{
  public static char a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return ' ';
    case 0: 
      return '0';
    case 1: 
      return '1';
    case 2: 
      return '2';
    case 3: 
      return '3';
    case 4: 
      return '4';
    case 5: 
      return '5';
    case 6: 
      return '6';
    case 7: 
      return '7';
    case 8: 
      return '8';
    case 9: 
      return '9';
    case 10: 
      return 'a';
    case 11: 
      return 'b';
    case 12: 
      return 'c';
    case 13: 
      return 'd';
    case 14: 
      return 'e';
    }
    return 'f';
  }
  
  public static double a(double paramDouble1, double paramDouble2)
  {
    return Math.log(paramDouble1) / Math.log(paramDouble2);
  }
  
  public static double a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
  {
    paramDouble1 -= paramDouble3;
    paramDouble2 -= paramDouble4;
    return Math.sqrt(paramDouble1 * paramDouble1 + paramDouble2 * paramDouble2);
  }
  
  public static double a(e parame1, e parame2)
  {
    return a(parame1.a, parame1.b, parame2.a, parame2.b);
  }
  
  public static int a(double[] paramArrayOfDouble)
  {
    float f = 0.0F;
    int i = 0;
    while (i < paramArrayOfDouble.length)
    {
      f = (float)(f + paramArrayOfDouble[i]);
      i += 1;
    }
    return (int)(f / paramArrayOfDouble.length);
  }
  
  public static String a(byte[] paramArrayOfByte, int paramInt)
  {
    String str1 = "";
    int i = 0;
    if (i < paramInt)
    {
      String str2 = Integer.toHexString(paramArrayOfByte[i] & 0xFF);
      if (str2.length() == 1) {}
      for (str1 = str1 + "0" + str2;; str1 = str1 + str2)
      {
        str1 = str1 + ",";
        i += 1;
        break;
      }
    }
    return str1.toUpperCase();
  }
  
  public static BigDecimal a(double paramDouble, int paramInt)
  {
    return new BigDecimal(paramDouble).setScale(paramInt, 4);
  }
  
  public static List<e> a(a parama1, a parama2)
  {
    ArrayList localArrayList = new ArrayList();
    double d2 = parama1.b * 2.0D * (parama1.a.a - parama2.a.a);
    double d3 = parama1.b * 2.0D * (parama1.a.b - parama2.a.b);
    double d4 = Math.pow(parama2.b, 2.0D) - Math.pow(parama1.b, 2.0D) - Math.pow(parama1.a.a - parama2.a.a, 2.0D) - Math.pow(parama1.a.b - parama2.a.b, 2.0D);
    double d1 = Math.pow(d2, 2.0D) + Math.pow(d3, 2.0D);
    d2 = d2 * -2.0D * d4;
    d4 = Math.pow(d4, 2.0D);
    d3 = Math.pow(d3, 2.0D);
    d4 = Math.pow(d2, 2.0D) - (d4 - d3) * (4.0D * d1);
    d3 = (Math.sqrt(d4) - d2) / (2.0D * d1);
    d1 = (-Math.sqrt(d4) - d2) / (2.0D * d1);
    d2 = parama1.b * d3 + parama1.a.a;
    d3 = Math.sqrt(Math.pow(parama1.b, 2.0D) - Math.pow(d2 - parama1.a.a, 2.0D));
    d4 = parama1.a.b;
    double d5 = -Math.sqrt(Math.pow(parama1.b, 2.0D) - Math.pow(d2 - parama1.a.a, 2.0D));
    double d6 = parama1.a.b;
    HashSet localHashSet = new HashSet();
    e locale = new e(d2, d3 + d4);
    if (a(locale, parama1, parama2)) {
      localHashSet.add(locale);
    }
    locale = new e(d2, d5 + d6);
    if (a(locale, parama1, parama2)) {
      localHashSet.add(locale);
    }
    d1 = d1 * parama1.b + parama1.a.a;
    d2 = Math.sqrt(Math.pow(parama1.b, 2.0D) - Math.pow(d1 - parama1.a.a, 2.0D));
    d3 = parama1.a.b;
    d4 = -Math.sqrt(Math.pow(parama1.b, 2.0D) - Math.pow(d1 - parama1.a.a, 2.0D));
    d5 = parama1.a.b;
    locale = new e(d1, d2 + d3);
    if (a(locale, parama1, parama2)) {
      localHashSet.add(locale);
    }
    locale = new e(d1, d4 + d5);
    if (a(locale, parama1, parama2)) {
      localHashSet.add(locale);
    }
    parama1 = localHashSet.iterator();
    while (parama1.hasNext()) {
      localArrayList.add((e)parama1.next());
    }
    return localArrayList;
  }
  
  public static boolean a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7)
  {
    if ((paramDouble1 >= Math.min(paramDouble4, paramDouble6)) && (paramDouble1 <= Math.max(paramDouble4, paramDouble6)) && (paramDouble2 >= Math.min(paramDouble5, paramDouble7)) && (paramDouble2 <= Math.max(paramDouble5, paramDouble7)))
    {
      paramDouble4 = Math.abs(paramDouble1 - paramDouble4);
      paramDouble5 = Math.abs(paramDouble2 - paramDouble7);
      paramDouble1 = Math.abs(paramDouble1 - paramDouble6);
      paramDouble2 = Math.abs(paramDouble2 - paramDouble7);
      return (paramDouble3 <= paramDouble4) && (paramDouble3 <= paramDouble5) && (paramDouble3 <= paramDouble1) && (paramDouble3 <= paramDouble2);
    }
    return false;
  }
  
  public static boolean a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8)
  {
    if ((paramDouble4 - paramDouble2) / (paramDouble3 - paramDouble1) == (paramDouble8 - paramDouble6) / (paramDouble7 - paramDouble5)) {
      return false;
    }
    paramDouble1 = (paramDouble1 * paramDouble4 - paramDouble2 * paramDouble3 - ((paramDouble1 * paramDouble4 - paramDouble2 * paramDouble3) * (paramDouble5 - paramDouble7) - (paramDouble5 * paramDouble8 - paramDouble6 * paramDouble7) * (paramDouble1 - paramDouble3)) / ((paramDouble4 - paramDouble2) * (paramDouble5 - paramDouble7) - (paramDouble8 - paramDouble6) * (paramDouble1 - paramDouble3)) * (paramDouble4 - paramDouble2)) / (paramDouble1 - paramDouble3);
    return true;
  }
  
  public static boolean a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8)
  {
    if ((paramFloat5 > paramFloat1) && (paramFloat5 > paramFloat1 + paramFloat3)) {}
    while (((paramFloat5 < paramFloat1) && (paramFloat5 < paramFloat1 - paramFloat7)) || ((paramFloat6 > paramFloat2) && (paramFloat6 > paramFloat2 + paramFloat4)) || ((paramFloat6 < paramFloat2) && (paramFloat6 < paramFloat2 - paramFloat8))) {
      return false;
    }
    return true;
  }
  
  public static boolean a(e parame, a parama)
  {
    return Math.pow(parame.a - parama.a.a, 2.0D) + Math.pow(parame.b - parama.a.b, 2.0D) <= Math.pow(parama.b, 2.0D);
  }
  
  public static boolean a(e parame, a parama1, a parama2)
  {
    return (Math.pow(parame.a - parama2.a.a, 2.0D) + Math.pow(parame.b - parama2.a.b, 2.0D) == Math.pow(parama2.b, 2.0D)) && (Math.pow(parame.a - parama1.a.a, 2.0D) + Math.pow(parame.b - parama1.a.b, 2.0D) == Math.pow(parama1.b, 2.0D));
  }
  
  public static boolean a(e parame, a parama1, a parama2, float paramFloat)
  {
    return (Math.pow(parame.a - parama2.a.a, 2.0D) + Math.pow(parame.b - parama2.a.b, 2.0D) <= Math.pow(parama2.b, 2.0D) + paramFloat) && (Math.pow(parame.a - parama2.a.a, 2.0D) + Math.pow(parame.b - parama2.a.b, 2.0D) >= Math.pow(parama2.b, 2.0D) - paramFloat) && (Math.pow(parame.a - parama1.a.a, 2.0D) + Math.pow(parame.b - parama1.a.b, 2.0D) <= Math.pow(parama1.b, 2.0D) + paramFloat) && (Math.pow(parame.a - parama1.a.a, 2.0D) + Math.pow(parame.b - parama1.a.b, 2.0D) >= Math.pow(parama1.b, 2.0D) - paramFloat);
  }
  
  public static double[] a(int[] paramArrayOfInt)
  {
    int j = paramArrayOfInt.length;
    double[] arrayOfDouble = new double[j];
    int i = 0;
    while (i < j)
    {
      arrayOfDouble[i] = Double.valueOf(String.valueOf(paramArrayOfInt[i])).doubleValue();
      i += 1;
    }
    return arrayOfDouble;
  }
  
  public static double[] a(double[][] paramArrayOfDouble)
  {
    double[] arrayOfDouble = new double[paramArrayOfDouble.length * paramArrayOfDouble[0].length];
    int i = 0;
    while (i < paramArrayOfDouble.length)
    {
      int j = 0;
      while (j < paramArrayOfDouble[i].length)
      {
        arrayOfDouble[(paramArrayOfDouble.length * j + i)] = paramArrayOfDouble[i][j];
        j += 1;
      }
      i += 1;
    }
    return arrayOfDouble;
  }
  
  public static double[][] a(int[][] paramArrayOfInt)
  {
    int k = paramArrayOfInt.length;
    int m = paramArrayOfInt[0].length;
    double[][] arrayOfDouble = (double[][])Array.newInstance(Double.TYPE, new int[] { k, m });
    int i = 0;
    while (i < k)
    {
      int j = 0;
      while (j < m)
      {
        arrayOfDouble[i][j] = Double.valueOf(String.valueOf(paramArrayOfInt[i][j])).doubleValue();
        j += 1;
      }
      i += 1;
    }
    return arrayOfDouble;
  }
  
  public static int[][] a(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    int[][] arrayOfInt = (int[][])Array.newInstance(Integer.TYPE, new int[] { paramInt2, paramInt1 });
    int i = 0;
    while (i < paramInt2)
    {
      int j = 0;
      while (j < paramInt1)
      {
        arrayOfInt[i][j] = paramArrayOfInt[(j * paramInt2 + i)];
        j += 1;
      }
      i += 1;
    }
    return arrayOfInt;
  }
  
  public static int b(int[] paramArrayOfInt)
  {
    float f = 0.0F;
    int i = 0;
    while (i < paramArrayOfInt.length)
    {
      f += paramArrayOfInt[i];
      i += 1;
    }
    return (int)(f / paramArrayOfInt.length);
  }
  
  public static boolean b(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
  {
    if ((paramDouble1 - paramDouble3) * (paramDouble6 - paramDouble4) - (paramDouble2 - paramDouble4) * (paramDouble5 - paramDouble3) == 0.0D) {
      return (paramDouble1 >= Math.min(paramDouble3, paramDouble5)) && (paramDouble1 <= Math.max(paramDouble3, paramDouble5)) && (paramDouble2 >= Math.min(paramDouble4, paramDouble6)) && (paramDouble2 <= Math.max(paramDouble4, paramDouble6));
    }
    return false;
  }
  
  public static boolean b(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8)
  {
    if ((paramDouble4 - paramDouble2) / (paramDouble3 - paramDouble1) == (paramDouble8 - paramDouble6) / (paramDouble7 - paramDouble5)) {
      return false;
    }
    double d1 = ((paramDouble1 * paramDouble4 - paramDouble2 * paramDouble3) * (paramDouble5 - paramDouble7) - (paramDouble5 * paramDouble8 - paramDouble6 * paramDouble7) * (paramDouble1 - paramDouble3)) / ((paramDouble4 - paramDouble2) * (paramDouble5 - paramDouble7) - (paramDouble8 - paramDouble6) * (paramDouble1 - paramDouble3));
    double d2 = (paramDouble1 * paramDouble4 - paramDouble2 * paramDouble3 - (paramDouble4 - paramDouble2) * d1) / (paramDouble1 - paramDouble3);
    return (d1 >= Math.min(paramDouble1, paramDouble3)) && (d1 <= Math.max(paramDouble1, paramDouble3)) && (d2 >= Math.min(paramDouble2, paramDouble4)) && (d2 <= Math.max(paramDouble2, paramDouble4)) && (d1 >= Math.min(paramDouble5, paramDouble7)) && (d1 <= Math.max(paramDouble5, paramDouble7)) && (d2 >= Math.min(paramDouble6, paramDouble8)) && (d2 <= Math.max(paramDouble6, paramDouble8));
  }
  
  public static boolean c(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
  {
    return (paramDouble1 >= Math.min(paramDouble3, paramDouble5)) && (paramDouble1 <= Math.max(paramDouble3, paramDouble5)) && (paramDouble2 >= Math.min(paramDouble4, paramDouble6)) && (paramDouble2 <= Math.max(paramDouble4, paramDouble6));
  }
  
  public static boolean c(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8)
  {
    if ((paramDouble4 - paramDouble2) / (paramDouble3 - paramDouble1) == (paramDouble8 - paramDouble6) / (paramDouble7 - paramDouble5)) {
      return false;
    }
    paramDouble5 = ((paramDouble1 * paramDouble4 - paramDouble2 * paramDouble3) * (paramDouble5 - paramDouble7) - (paramDouble5 * paramDouble8 - paramDouble6 * paramDouble7) * (paramDouble1 - paramDouble3)) / ((paramDouble4 - paramDouble2) * (paramDouble5 - paramDouble7) - (paramDouble8 - paramDouble6) * (paramDouble1 - paramDouble3));
    paramDouble6 = (paramDouble1 * paramDouble4 - paramDouble2 * paramDouble3 - (paramDouble4 - paramDouble2) * paramDouble5) / (paramDouble1 - paramDouble3);
    return (paramDouble5 >= Math.min(paramDouble1, paramDouble3)) && (paramDouble5 <= Math.max(paramDouble1, paramDouble3)) && (paramDouble6 >= Math.min(paramDouble2, paramDouble4)) && (paramDouble6 <= Math.max(paramDouble2, paramDouble4));
  }
  
  public static boolean d(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8)
  {
    return (paramDouble1 >= Math.min(paramDouble5, paramDouble7)) && (paramDouble1 <= Math.max(paramDouble5, paramDouble7)) && (paramDouble2 >= Math.min(paramDouble6, paramDouble8)) && (paramDouble2 <= Math.max(paramDouble6, paramDouble8)) && (paramDouble3 >= Math.min(paramDouble5, paramDouble7)) && (paramDouble3 <= Math.max(paramDouble5, paramDouble7)) && (paramDouble4 >= Math.min(paramDouble6, paramDouble8)) && (paramDouble4 <= Math.max(paramDouble6, paramDouble8));
  }
  
  public boolean a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
  {
    return (paramDouble1 - paramDouble3) * (paramDouble6 - paramDouble4) - (paramDouble2 - paramDouble4) * (paramDouble5 - paramDouble3) == 0.0D;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/utils/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */