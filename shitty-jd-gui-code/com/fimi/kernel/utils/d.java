package com.fimi.kernel.utils;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

public final class d
{
  private static final char[] a = { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47 };
  private static final byte[] b = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1 };
  
  public static final String a(String paramString1, String paramString2)
  {
    return a(paramString1, paramString2, 0);
  }
  
  public static final String a(String paramString1, String paramString2, int paramInt)
  {
    int j = 0;
    int k;
    int m;
    int i;
    for (;;)
    {
      try
      {
        paramString1 = paramString1.getBytes(paramString2);
        k = paramString1.length;
        m = (int)Math.ceil(k * 1.36D);
        if (paramInt > 0)
        {
          i = m / paramInt;
          paramString2 = new StringBuffer(m + i);
          m = k % 3;
          if (j >= k - m) {
            break;
          }
          int i2 = j + 1;
          int n = paramString1[j];
          int i1 = i2 + 1;
          i2 = paramString1[i2];
          j = i1 + 1;
          n = (i2 & 0xFF) << 8 | (n & 0xFF) << 16 | paramString1[i1] & 0xFF;
          paramString2.append(a[(n >> 18)]);
          paramString2.append(a[(n >> 12 & 0x3F)]);
          paramString2.append(a[(n >> 6 & 0x3F)]);
          paramString2.append(a[(n & 0x3F)]);
          continue;
        }
        i = 0;
      }
      catch (UnsupportedEncodingException paramString1)
      {
        paramString1.printStackTrace();
        return null;
      }
    }
    if (m == 1)
    {
      j = paramString1[j] & 0xFF;
      paramString2.append(a[(j >> 2)]);
      paramString2.append(a[((j & 0x3) << 4)]);
      paramString2.append("==");
    }
    while (i > 0)
    {
      for (i = paramInt; i < paramString2.length(); i = i + paramInt + 1) {
        paramString2.insert(i, '\n');
      }
      if (m == 2)
      {
        k = j + 1;
        j = (paramString1[j] & 0xFF) << 8 | paramString1[k] & 0xFF;
        paramString2.append(a[(j >> 10)]);
        paramString2.append(a[(j >> 4 & 0x3F)]);
        paramString2.append(a[((j & 0xF) << 2)]);
        paramString2.append("=");
      }
    }
    return paramString2.toString();
  }
  
  public static final String b(String paramString1, String paramString2)
  {
    for (;;)
    {
      int i;
      try
      {
        paramString1 = paramString1.getBytes(paramString2);
        i1 = paramString1.length;
        localByteArrayOutputStream = new ByteArrayOutputStream((int)(i1 * 0.67D));
        i = 0;
        if (i < i1)
        {
          if (i < i1) {
            break label64;
          }
          j = -1;
          if (j != -1) {
            break label104;
          }
        }
        label48:
        arrayOfByte = b;
      }
      catch (UnsupportedEncodingException paramString1)
      {
        try
        {
          paramString1 = localByteArrayOutputStream.toString(paramString2);
          return paramString1;
        }
        catch (UnsupportedEncodingException paramString1)
        {
          int i1;
          ByteArrayOutputStream localByteArrayOutputStream;
          byte[] arrayOfByte;
          int m;
          paramString1.printStackTrace();
          return null;
        }
        paramString1 = paramString1;
        paramString1.printStackTrace();
        return null;
      }
      label64:
      int j = i + 1;
      int k = arrayOfByte[paramString1[i]];
      if ((j >= i1) || (k != -1))
      {
        i = j;
        j = k;
        continue;
        label101:
        i = k;
        label104:
        if (i >= i1)
        {
          m = -1;
          label113:
          if (m != -1) {
            localByteArrayOutputStream.write(j << 2 | (m & 0x30) >>> 4);
          }
        }
        else
        {
          label150:
          label308:
          label341:
          for (k = i;; k = i)
          {
            if (k >= i1)
            {
              j = -1;
              i = k;
              if (j == -1) {
                break label48;
              }
              localByteArrayOutputStream.write((m & 0xF) << 4 | (j & 0x3C) >>> 2);
            }
            for (;;)
            {
              if (i >= i1) {
                k = -1;
              }
              int n;
              do
              {
                for (;;)
                {
                  if (k == -1) {
                    break label48;
                  }
                  localByteArrayOutputStream.write(k | (j & 0x3) << 6);
                  break;
                  arrayOfByte = b;
                  k = i + 1;
                  m = arrayOfByte[paramString1[i]];
                  if ((k < i1) && (m == -1)) {
                    break label101;
                  }
                  i = k;
                  break label113;
                  i = k + 1;
                  j = paramString1[k];
                  if (j == 61)
                  {
                    j = -1;
                    break label150;
                  }
                  j = b[j];
                  if ((i < i1) && (j == -1)) {
                    break label341;
                  }
                  break label150;
                  m = i + 1;
                  i = paramString1[i];
                  if (i != 61) {
                    break label308;
                  }
                  k = -1;
                  i = m;
                }
                n = b[i];
                k = n;
                i = m;
              } while (n != -1);
              i = m;
            }
          }
        }
      }
      else
      {
        i = j;
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/utils/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */