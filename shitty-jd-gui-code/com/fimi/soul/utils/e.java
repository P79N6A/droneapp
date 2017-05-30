package com.fimi.soul.utils;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.media.ExifInterface;
import android.media.ThumbnailUtils;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class e
{
  public static int a(BitmapFactory.Options paramOptions, int paramInt1, int paramInt2)
  {
    int k = paramOptions.outHeight;
    int j = paramOptions.outWidth;
    int i = 1;
    if ((k > paramInt2) || (j > paramInt1))
    {
      i = Math.round(k / paramInt2);
      paramInt1 = Math.round(j / paramInt1);
      if (i >= paramInt1) {}
    }
    else
    {
      return i;
    }
    return paramInt1;
  }
  
  public static Bitmap a(int paramInt, Bitmap... paramVarArgs)
  {
    if ((paramInt <= 0) || (paramVarArgs == null) || (paramVarArgs.length == 0)) {
      throw new IllegalArgumentException("Wrong parameters: columns must > 0 and bitmaps.length must > 0.");
    }
    int m = paramVarArgs.length;
    int i = 0;
    int j = 0;
    int k = 0;
    Bitmap localBitmap;
    if (i < m)
    {
      localBitmap = paramVarArgs[i];
      if (k > localBitmap.getWidth()) {
        label55:
        if (j <= localBitmap.getHeight()) {
          break label81;
        }
      }
      for (;;)
      {
        i += 1;
        break;
        k = localBitmap.getWidth();
        break label55;
        label81:
        j = localBitmap.getHeight();
      }
    }
    label119:
    int n;
    if (paramInt >= paramVarArgs.length)
    {
      i = 1;
      paramInt = paramVarArgs.length;
      localBitmap = Bitmap.createBitmap(paramInt * k, i * j, Bitmap.Config.RGB_565);
      m = 0;
      if (m < i) {
        n = 0;
      }
    }
    else
    {
      for (;;)
      {
        int i1;
        if (n < paramInt)
        {
          i1 = m * paramInt + n;
          if (i1 < paramVarArgs.length) {}
        }
        else
        {
          m += 1;
          break label119;
          if (paramVarArgs.length % paramInt == 0)
          {
            i = paramVarArgs.length / paramInt;
            break;
          }
          i = paramVarArgs.length / paramInt + 1;
          break;
        }
        localBitmap = a(localBitmap, paramVarArgs[i1], new PointF(n * k, m * j));
        n += 1;
      }
    }
    return localBitmap;
  }
  
  public static Bitmap a(Bitmap paramBitmap)
  {
    int i = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    Object localObject1 = new Matrix();
    ((Matrix)localObject1).preScale(1.0F, -1.0F);
    Object localObject2 = Bitmap.createBitmap(paramBitmap, 0, j / 2, i, j / 2, (Matrix)localObject1, false);
    localObject1 = Bitmap.createBitmap(i, j / 2 + j, Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas((Bitmap)localObject1);
    localCanvas.drawBitmap(paramBitmap, 0.0F, 0.0F, null);
    Paint localPaint = new Paint();
    localCanvas.drawRect(0.0F, j, i, j + 4, localPaint);
    localCanvas.drawBitmap((Bitmap)localObject2, 0.0F, j + 4, null);
    localObject2 = new Paint();
    ((Paint)localObject2).setShader(new LinearGradient(0.0F, paramBitmap.getHeight(), 0.0F, ((Bitmap)localObject1).getHeight() + 4, 1895825407, 16777215, Shader.TileMode.CLAMP));
    ((Paint)localObject2).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    localCanvas.drawRect(0.0F, j, i, ((Bitmap)localObject1).getHeight() + 4, (Paint)localObject2);
    return (Bitmap)localObject1;
  }
  
  public static Bitmap a(Bitmap paramBitmap, float paramFloat)
  {
    int i = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    Bitmap localBitmap = Bitmap.createBitmap(i, j, Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    Paint localPaint = new Paint();
    Rect localRect = new Rect(0, 0, i, j);
    RectF localRectF = new RectF(localRect);
    localPaint.setAntiAlias(true);
    localCanvas.drawARGB(0, 0, 0, 0);
    localPaint.setColor(-12434878);
    localCanvas.drawRoundRect(localRectF, paramFloat, paramFloat, localPaint);
    localPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    localCanvas.drawBitmap(paramBitmap, localRect, localRect, localPaint);
    return localBitmap;
  }
  
  public static Bitmap a(Bitmap paramBitmap1, Bitmap paramBitmap2, PointF paramPointF)
  {
    if ((paramBitmap1 == null) || (paramBitmap2 == null) || (paramPointF == null)) {
      return null;
    }
    Bitmap localBitmap = Bitmap.createBitmap(paramBitmap1.getWidth(), paramBitmap1.getHeight(), Bitmap.Config.ARGB_4444);
    Canvas localCanvas = new Canvas(localBitmap);
    localCanvas.drawBitmap(paramBitmap1, 0.0F, 0.0F, null);
    localCanvas.drawBitmap(paramBitmap2, paramPointF.x, paramPointF.y, null);
    localCanvas.save(31);
    localCanvas.restore();
    return localBitmap;
  }
  
  public static Bitmap a(String paramString)
  {
    try
    {
      paramString = Base64.decode(paramString, 0);
      paramString = BitmapFactory.decodeByteArray(paramString, 0, paramString.length);
      return paramString;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
    return null;
  }
  
  public static Bitmap a(String paramString, int paramInt1, int paramInt2)
  {
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = true;
    BitmapFactory.decodeFile(paramString, localOptions);
    paramInt1 = (int)Math.ceil(localOptions.outWidth / paramInt1);
    paramInt2 = (int)Math.ceil(localOptions.outHeight / paramInt2);
    if ((paramInt1 > 1) && (paramInt2 > 1)) {
      if (paramInt1 <= paramInt2) {
        break label78;
      }
    }
    label78:
    for (localOptions.inSampleSize = paramInt1;; localOptions.inSampleSize = paramInt2)
    {
      localOptions.inJustDecodeBounds = false;
      return BitmapFactory.decodeFile(paramString, localOptions);
    }
  }
  
  public static Bitmap a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte.length != 0) {
      return BitmapFactory.decodeByteArray(paramArrayOfByte, 0, paramArrayOfByte.length);
    }
    return null;
  }
  
  public static String a(Bitmap paramBitmap, int paramInt)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    paramBitmap.compress(Bitmap.CompressFormat.PNG, paramInt, localByteArrayOutputStream);
    return Base64.encodeToString(localByteArrayOutputStream.toByteArray(), 0);
  }
  
  public static String a(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    try
    {
      paramString = a(paramString, paramInt1, paramInt2);
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      paramString.compress(Bitmap.CompressFormat.PNG, paramInt3, localByteArrayOutputStream);
      paramString = Base64.encodeToString(localByteArrayOutputStream.toByteArray(), 0);
      return paramString;
    }
    catch (FileNotFoundException paramString)
    {
      paramString.printStackTrace();
    }
    return null;
  }
  
  /* Error */
  public static boolean a(Bitmap paramBitmap, File paramFile)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aload_0
    //   3: bipush 100
    //   5: invokestatic 245	com/fimi/soul/utils/e:b	(Landroid/graphics/Bitmap;I)[B
    //   8: astore 4
    //   10: new 247	java/io/FileOutputStream
    //   13: dup
    //   14: aload_1
    //   15: invokespecial 250	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   18: astore_1
    //   19: aload_1
    //   20: astore_0
    //   21: aload_1
    //   22: aload 4
    //   24: invokevirtual 256	java/io/OutputStream:write	([B)V
    //   27: aload_1
    //   28: astore_0
    //   29: aload_1
    //   30: invokevirtual 259	java/io/OutputStream:flush	()V
    //   33: iconst_1
    //   34: istore_3
    //   35: iload_3
    //   36: istore_2
    //   37: aload_1
    //   38: ifnull +9 -> 47
    //   41: aload_1
    //   42: invokevirtual 262	java/io/OutputStream:close	()V
    //   45: iload_3
    //   46: istore_2
    //   47: iload_2
    //   48: ireturn
    //   49: astore_0
    //   50: aload_0
    //   51: invokevirtual 263	java/io/IOException:printStackTrace	()V
    //   54: iconst_1
    //   55: ireturn
    //   56: astore 4
    //   58: aconst_null
    //   59: astore_1
    //   60: aload_1
    //   61: astore_0
    //   62: aload 4
    //   64: invokevirtual 192	java/lang/Exception:printStackTrace	()V
    //   67: aload_1
    //   68: ifnull -21 -> 47
    //   71: aload_1
    //   72: invokevirtual 262	java/io/OutputStream:close	()V
    //   75: iconst_0
    //   76: ireturn
    //   77: astore_0
    //   78: aload_0
    //   79: invokevirtual 263	java/io/IOException:printStackTrace	()V
    //   82: iconst_0
    //   83: ireturn
    //   84: astore_1
    //   85: aconst_null
    //   86: astore_0
    //   87: aload_0
    //   88: ifnull +7 -> 95
    //   91: aload_0
    //   92: invokevirtual 262	java/io/OutputStream:close	()V
    //   95: aload_1
    //   96: athrow
    //   97: astore_0
    //   98: aload_0
    //   99: invokevirtual 263	java/io/IOException:printStackTrace	()V
    //   102: goto -7 -> 95
    //   105: astore_1
    //   106: goto -19 -> 87
    //   109: astore 4
    //   111: goto -51 -> 60
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	114	0	paramBitmap	Bitmap
    //   0	114	1	paramFile	File
    //   1	47	2	bool1	boolean
    //   34	12	3	bool2	boolean
    //   8	15	4	arrayOfByte	byte[]
    //   56	7	4	localException1	Exception
    //   109	1	4	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   41	45	49	java/io/IOException
    //   10	19	56	java/lang/Exception
    //   71	75	77	java/io/IOException
    //   10	19	84	finally
    //   91	95	97	java/io/IOException
    //   21	27	105	finally
    //   29	33	105	finally
    //   62	67	105	finally
    //   21	27	109	java/lang/Exception
    //   29	33	109	java/lang/Exception
  }
  
  public static Bitmap b(String paramString, int paramInt1, int paramInt2)
  {
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = true;
    BitmapFactory.decodeFile(paramString, localOptions);
    localOptions.inSampleSize = a(localOptions, paramInt1, paramInt2);
    localOptions.inJustDecodeBounds = false;
    return BitmapFactory.decodeFile(paramString, localOptions);
  }
  
  public static String b(String paramString)
  {
    try
    {
      paramString = ThumbnailUtils.createVideoThumbnail(paramString, 1);
      if (paramString != null)
      {
        paramString = a(Bitmap.createBitmap(paramString, 0, 0, 80, 80), 20);
        return paramString;
      }
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
      return "";
    }
    catch (OutOfMemoryError paramString)
    {
      for (;;)
      {
        paramString.printStackTrace();
      }
    }
  }
  
  public static byte[] b(Bitmap paramBitmap, int paramInt)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(paramBitmap.getWidth() * paramBitmap.getHeight() * 4);
    try
    {
      paramBitmap.compress(Bitmap.CompressFormat.PNG, paramInt, localByteArrayOutputStream);
      localByteArrayOutputStream.flush();
      localByteArrayOutputStream.close();
      paramBitmap = localByteArrayOutputStream.toByteArray();
      return paramBitmap;
    }
    catch (IOException paramBitmap) {}
    return null;
  }
  
  public static void c(String paramString)
  {
    int i = d(paramString);
    if (i == 0) {}
    for (;;)
    {
      return;
      Object localObject = new BitmapFactory.Options();
      ((BitmapFactory.Options)localObject).inSampleSize = 1;
      ((BitmapFactory.Options)localObject).inDither = false;
      ((BitmapFactory.Options)localObject).inPurgeable = true;
      ((BitmapFactory.Options)localObject).inInputShareable = true;
      ((BitmapFactory.Options)localObject).inTempStorage = new byte[32768];
      ((BitmapFactory.Options)localObject).inPreferredConfig = Bitmap.Config.RGB_565;
      localObject = BitmapFactory.decodeFile(paramString, (BitmapFactory.Options)localObject);
      Matrix localMatrix = new Matrix();
      localMatrix.postRotate(i);
      localObject = Bitmap.createBitmap((Bitmap)localObject, 0, 0, ((Bitmap)localObject).getWidth(), ((Bitmap)localObject).getHeight(), localMatrix, true);
      try
      {
        paramString = new FileOutputStream(new File(paramString));
        ((Bitmap)localObject).compress(Bitmap.CompressFormat.JPEG, 100, paramString);
        if (localObject != null)
        {
          ((Bitmap)localObject).recycle();
          return;
        }
      }
      catch (FileNotFoundException paramString)
      {
        paramString.printStackTrace();
      }
    }
  }
  
  public static int d(String paramString)
  {
    try
    {
      int i = new ExifInterface(paramString).getAttributeInt("Orientation", 1);
      switch (i)
      {
      case 4: 
      case 5: 
      case 7: 
      default: 
        return 0;
      case 6: 
        return 90;
      case 3: 
        return 180;
      }
      return 270;
    }
    catch (IOException paramString)
    {
      paramString.printStackTrace();
    }
    return 0;
  }
  
  public static boolean f(String paramString)
  {
    paramString = new File(paramString);
    if ((paramString.isFile()) && (paramString.exists())) {
      return paramString.delete();
    }
    return false;
  }
  
  public boolean e(String paramString)
  {
    Object localObject = paramString;
    if (!paramString.endsWith(File.separator)) {
      localObject = paramString + File.separator;
    }
    paramString = new File((String)localObject);
    label59:
    int j;
    int i;
    if ((!paramString.exists()) || (!paramString.isDirectory()))
    {
      break label111;
      return false;
    }
    else
    {
      localObject = paramString.listFiles();
      j = 1;
      i = 0;
    }
    for (;;)
    {
      if (i < localObject.length)
      {
        if (localObject[i].isFile())
        {
          bool = f(localObject[i].getAbsolutePath());
          j = bool;
          if (bool) {
            break label144;
          }
          j = bool;
        }
      }
      else
      {
        label111:
        if (j == 0) {
          break label59;
        }
        return paramString.delete();
      }
      boolean bool = e(localObject[i].getAbsolutePath());
      j = bool;
      if (!bool) {
        break;
      }
      j = bool;
      label144:
      i += 1;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/utils/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */