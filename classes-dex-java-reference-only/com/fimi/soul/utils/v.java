package com.fimi.soul.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.graphics.Rect;

public class v
{
  public static Bitmap a(Context paramContext, int paramInt1, int paramInt2, int paramInt3)
  {
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inPreferredConfig = Bitmap.Config.RGB_565;
    localOptions.inPurgeable = true;
    localOptions.inInputShareable = true;
    paramContext = paramContext.getResources().openRawResource(paramInt1);
    Rect localRect = new Rect();
    localRect.left = 20;
    localRect.top = 30;
    localRect.right = 10;
    return BitmapFactory.decodeStream(paramContext, localRect, localOptions);
  }
  
  public static Bitmap a(Bitmap paramBitmap, float paramFloat1, float paramFloat2)
  {
    Matrix localMatrix = new Matrix();
    localMatrix.postScale(paramFloat1, paramFloat2);
    return Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight(), localMatrix, true);
  }
  
  public static Bitmap a(Bitmap paramBitmap, int paramInt)
  {
    if ((paramInt == 0) || (paramBitmap == null)) {
      return paramBitmap;
    }
    Object localObject = new Matrix();
    ((Matrix)localObject).setRotate(paramInt, paramBitmap.getWidth() / 2, paramBitmap.getHeight() / 2);
    localObject = Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight(), (Matrix)localObject, true);
    if (paramBitmap != null) {
      paramBitmap.recycle();
    }
    return (Bitmap)localObject;
  }
  
  public static boolean a(String paramString, Context paramContext)
  {
    return (ao.a(paramString, paramContext.getResources().getStringArray(2131558409))) || (ao.a(paramString, paramContext.getResources().getStringArray(2131558408))) || (ao.a(paramString, paramContext.getResources().getStringArray(2131558410)));
  }
  
  public static boolean b(String paramString, Context paramContext)
  {
    return ao.a(paramString, paramContext.getResources().getStringArray(2131558409));
  }
  
  public static boolean c(String paramString, Context paramContext)
  {
    return ao.a(paramString, paramContext.getResources().getStringArray(2131558410));
  }
  
  public static boolean d(String paramString, Context paramContext)
  {
    return ao.a(paramString, paramContext.getResources().getStringArray(2131558408));
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/utils/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */