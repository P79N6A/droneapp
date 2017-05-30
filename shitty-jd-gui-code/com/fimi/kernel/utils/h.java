package com.fimi.kernel.utils;

import android.graphics.Canvas;
import android.graphics.Paint.FontMetrics;
import android.text.Layout;
import android.text.TextPaint;
import java.util.ArrayList;
import java.util.List;

public final class h
{
  public static float a(TextPaint paramTextPaint)
  {
    paramTextPaint = paramTextPaint.getFontMetrics();
    return (float)Math.ceil(paramTextPaint.descent - paramTextPaint.ascent);
  }
  
  public static float a(String paramString, TextPaint paramTextPaint)
  {
    return paramTextPaint.measureText(paramString);
  }
  
  public static int a(Canvas paramCanvas, String paramString, int paramInt1, TextPaint paramTextPaint, int paramInt2, int paramInt3)
  {
    if (n.b(paramString)) {
      return 1;
    }
    paramString = b(paramString, paramInt1, paramTextPaint);
    int i = (int)a(paramTextPaint);
    paramInt1 = 0;
    while (paramInt1 < paramString.size())
    {
      int j = i / 2;
      paramCanvas.drawText((String)paramString.get(paramInt1), paramInt2, i * paramInt1 + (j + paramInt3), paramTextPaint);
      paramInt1 += 1;
    }
    return paramString.size();
  }
  
  public static int a(String paramString, int paramInt, TextPaint paramTextPaint)
  {
    if (n.b(paramString)) {
      return 0;
    }
    int j = 0;
    float f;
    int i;
    if (j < paramString.length())
    {
      f = paramTextPaint.measureText(paramString.substring(0, j + 1));
      if (f > paramInt) {
        i = j - 1;
      }
    }
    for (;;)
    {
      paramInt = i;
      if (i == 0) {
        paramInt = paramString.length() - 1;
      }
      return paramInt;
      i = j;
      if (f != paramInt)
      {
        j += 1;
        break;
        i = 0;
      }
    }
  }
  
  public static float b(String paramString, TextPaint paramTextPaint)
  {
    return Layout.getDesiredWidth(paramString, paramTextPaint);
  }
  
  public static List<String> b(String paramString, int paramInt, TextPaint paramTextPaint)
  {
    ArrayList localArrayList;
    int i;
    if (paramString.indexOf("\n") != -1)
    {
      paramString = paramString.split("\n");
      localArrayList = new ArrayList();
      i = 0;
    }
    for (;;)
    {
      if (i >= paramString.length) {
        break label159;
      }
      Object localObject = paramString[i];
      label39:
      int j = a((String)localObject, paramInt, paramTextPaint);
      if (j <= 0) {
        localArrayList.add(localObject);
      }
      for (;;)
      {
        if (((String)localObject).length() <= j + 1) {
          break label152;
        }
        localObject = ((String)localObject).substring(j + 1);
        break label39;
        localObject = new String[1];
        localObject[0] = paramString;
        paramString = (String)localObject;
        break;
        if (j == ((String)localObject).length() - 1) {
          localArrayList.add(localObject);
        } else {
          localArrayList.add(((String)localObject).substring(0, j + 1));
        }
      }
      label152:
      i += 1;
    }
    label159:
    return localArrayList;
  }
  
  public static int c(String paramString, int paramInt, TextPaint paramTextPaint)
  {
    ArrayList localArrayList;
    int i;
    if (paramString.indexOf("\n") != -1)
    {
      paramString = paramString.split("\n");
      localArrayList = new ArrayList();
      i = 0;
    }
    for (;;)
    {
      if (i >= paramString.length) {
        break label159;
      }
      Object localObject = paramString[i];
      label39:
      int j = a((String)localObject, paramInt, paramTextPaint);
      if (j <= 0) {
        localArrayList.add(localObject);
      }
      for (;;)
      {
        if (((String)localObject).length() <= j + 1) {
          break label152;
        }
        localObject = ((String)localObject).substring(j + 1);
        break label39;
        localObject = new String[1];
        localObject[0] = paramString;
        paramString = (String)localObject;
        break;
        if (j == ((String)localObject).length() - 1) {
          localArrayList.add(localObject);
        } else {
          localArrayList.add(((String)localObject).substring(0, j + 1));
        }
      }
      label152:
      i += 1;
    }
    label159:
    return localArrayList.size();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/utils/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */