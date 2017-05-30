package com.fimi.kernel.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.ImageView;
import java.io.File;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class s
{
  public static final int a = 0;
  public static final int b = 1;
  public static final int c = 2;
  public static final int d = 2048;
  public static final int e = 2048;
  
  private static float a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    float f1 = paramInt3 / paramInt1;
    float f2 = paramInt4 / paramInt2;
    if (f1 > f2) {
      return f1;
    }
    return f2;
  }
  
  private static int a(double paramDouble)
  {
    int j = Integer.highestOneBit((int)Math.floor(paramDouble));
    int i = j;
    if (j == 0) {
      i = 1;
    }
    return i;
  }
  
  private static int a(int paramInt)
  {
    double d1 = paramInt >> 16 & 0xFF;
    return (int)((paramInt >> 8 & 0xFF) * 0.59D + 0.3D * d1 + (paramInt & 0xFF) * 0.11D);
  }
  
  /* Error */
  public static int a(Bitmap paramBitmap, Bitmap.CompressFormat paramCompressFormat)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: new 44	java/io/ByteArrayOutputStream
    //   5: dup
    //   6: invokespecial 45	java/io/ByteArrayOutputStream:<init>	()V
    //   9: astore 5
    //   11: aload 5
    //   13: astore 4
    //   15: aload_0
    //   16: aload_1
    //   17: bipush 100
    //   19: aload 5
    //   21: invokevirtual 51	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   24: pop
    //   25: aload 5
    //   27: astore 4
    //   29: aload 5
    //   31: invokevirtual 55	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   34: arraylength
    //   35: istore_3
    //   36: iload_3
    //   37: istore_2
    //   38: aload 5
    //   40: ifnull +10 -> 50
    //   43: aload 5
    //   45: invokevirtual 58	java/io/ByteArrayOutputStream:close	()V
    //   48: iload_3
    //   49: istore_2
    //   50: iload_2
    //   51: ireturn
    //   52: astore_0
    //   53: aload_0
    //   54: invokevirtual 61	java/lang/Exception:printStackTrace	()V
    //   57: iload_3
    //   58: ireturn
    //   59: astore_1
    //   60: aconst_null
    //   61: astore_0
    //   62: aload_0
    //   63: astore 4
    //   65: aload_1
    //   66: invokevirtual 61	java/lang/Exception:printStackTrace	()V
    //   69: aload_0
    //   70: ifnull -20 -> 50
    //   73: aload_0
    //   74: invokevirtual 58	java/io/ByteArrayOutputStream:close	()V
    //   77: iconst_0
    //   78: ireturn
    //   79: astore_0
    //   80: aload_0
    //   81: invokevirtual 61	java/lang/Exception:printStackTrace	()V
    //   84: iconst_0
    //   85: ireturn
    //   86: astore_0
    //   87: aconst_null
    //   88: astore 4
    //   90: aload 4
    //   92: ifnull +8 -> 100
    //   95: aload 4
    //   97: invokevirtual 58	java/io/ByteArrayOutputStream:close	()V
    //   100: aload_0
    //   101: athrow
    //   102: astore_1
    //   103: aload_1
    //   104: invokevirtual 61	java/lang/Exception:printStackTrace	()V
    //   107: goto -7 -> 100
    //   110: astore_0
    //   111: goto -21 -> 90
    //   114: astore_1
    //   115: aload 5
    //   117: astore_0
    //   118: goto -56 -> 62
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	121	0	paramBitmap	Bitmap
    //   0	121	1	paramCompressFormat	Bitmap.CompressFormat
    //   1	50	2	i	int
    //   35	23	3	j	int
    //   13	83	4	localObject	Object
    //   9	107	5	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    // Exception table:
    //   from	to	target	type
    //   43	48	52	java/lang/Exception
    //   2	11	59	java/lang/Exception
    //   73	77	79	java/lang/Exception
    //   2	11	86	finally
    //   95	100	102	java/lang/Exception
    //   15	25	110	finally
    //   29	36	110	finally
    //   65	69	110	finally
    //   15	25	114	java/lang/Exception
    //   29	36	114	java/lang/Exception
  }
  
  public static int a(String paramString1, String paramString2)
  {
    int j = 0;
    int m = paramString1.length();
    int i = 0;
    while (i < m)
    {
      int k = j;
      if (paramString1.charAt(i) != paramString2.charAt(i)) {
        k = j + 1;
      }
      i += 1;
      j = k;
    }
    return j;
  }
  
  public static Bitmap a(Context paramContext, Bitmap paramBitmap, int paramInt)
  {
    int i;
    if (paramBitmap.getWidth() > paramBitmap.getHeight())
    {
      i = paramBitmap.getWidth();
      if (i <= paramInt) {
        break label46;
      }
    }
    label46:
    for (double d1 = i / paramInt;; d1 = 1.0D)
    {
      return a(paramBitmap, (float)d1);
      i = paramBitmap.getHeight();
      break;
    }
  }
  
  public static Bitmap a(Context paramContext, Uri paramUri, int paramInt)
  {
    paramContext = paramContext.getContentResolver();
    Object localObject = paramContext.openInputStream(paramUri);
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = true;
    localOptions.inDither = true;
    localOptions.inPreferredConfig = Bitmap.Config.ARGB_8888;
    BitmapFactory.decodeStream((InputStream)localObject, null, localOptions);
    ((InputStream)localObject).close();
    if ((localOptions.outWidth == -1) || (localOptions.outHeight == -1)) {
      return null;
    }
    int i;
    if (localOptions.outHeight > localOptions.outWidth)
    {
      i = localOptions.outHeight;
      if (i <= paramInt) {
        break label175;
      }
    }
    label175:
    for (double d1 = i / paramInt;; d1 = 1.0D)
    {
      localObject = new BitmapFactory.Options();
      ((BitmapFactory.Options)localObject).inSampleSize = a(d1);
      ((BitmapFactory.Options)localObject).inDither = true;
      ((BitmapFactory.Options)localObject).inPreferredConfig = Bitmap.Config.ARGB_8888;
      paramContext = paramContext.openInputStream(paramUri);
      paramUri = BitmapFactory.decodeStream(paramContext, null, (BitmapFactory.Options)localObject);
      paramContext.close();
      return a(paramUri, paramInt, paramInt);
      i = localOptions.outWidth;
      break;
    }
  }
  
  public static Bitmap a(Context paramContext, String paramString, int paramInt)
  {
    paramContext = new BitmapFactory.Options();
    paramContext.inJustDecodeBounds = true;
    paramContext.inDither = true;
    paramContext.inPreferredConfig = Bitmap.Config.ARGB_8888;
    BitmapFactory.decodeFile(paramString, paramContext);
    if ((paramContext.outWidth == -1) || (paramContext.outHeight == -1)) {
      return null;
    }
    int i;
    if (paramContext.outHeight > paramContext.outWidth)
    {
      i = paramContext.outHeight;
      if (i <= paramInt) {
        break label127;
      }
    }
    label127:
    for (double d1 = i / paramInt;; d1 = 1.0D)
    {
      paramContext = new BitmapFactory.Options();
      paramContext.inSampleSize = a(d1);
      paramContext.inDither = true;
      paramContext.inPreferredConfig = Bitmap.Config.ARGB_8888;
      return a(BitmapFactory.decodeFile(paramString, paramContext), paramInt, paramInt);
      i = paramContext.outWidth;
      break;
    }
  }
  
  public static Bitmap a(Bitmap paramBitmap, float paramFloat)
  {
    if (!h(paramBitmap)) {
      return null;
    }
    if (paramFloat == 1.0F) {
      return paramBitmap;
    }
    for (;;)
    {
      try
      {
        int i = paramBitmap.getWidth();
        int j = paramBitmap.getHeight();
        localObject1 = new Matrix();
        ((Matrix)localObject1).postScale(paramFloat, paramFloat);
        Bitmap localBitmap = Bitmap.createBitmap(paramBitmap, 0, 0, i, j, (Matrix)localObject1, true);
        localObject1 = localBitmap;
        if (localBitmap != paramBitmap)
        {
          paramBitmap.recycle();
          localObject1 = localBitmap;
        }
      }
      catch (Exception localException)
      {
        Object localObject1;
        localException.printStackTrace();
        if (paramBitmap == null) {
          break label112;
        }
        paramBitmap.recycle();
        Object localObject2 = null;
        continue;
      }
      finally
      {
        if (paramBitmap == null) {
          continue;
        }
        paramBitmap.recycle();
      }
      return (Bitmap)localObject1;
      label112:
      Object localObject4 = null;
    }
  }
  
  public static Bitmap a(Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    if (!h(paramBitmap)) {
      paramBitmap = null;
    }
    Object localObject;
    do
    {
      return paramBitmap;
      int i = paramBitmap.getWidth();
      int j = paramBitmap.getHeight();
      localObject = c(i, j, paramInt1, paramInt2);
      paramInt1 = localObject[0];
      paramInt2 = localObject[1];
      localObject = a(paramBitmap, b(i, j, paramInt1, paramInt2));
      if (((Bitmap)localObject).getWidth() > paramInt1) {
        break;
      }
      paramBitmap = (Bitmap)localObject;
    } while (((Bitmap)localObject).getHeight() <= paramInt2);
    return b((Bitmap)localObject, paramInt1, paramInt2);
  }
  
  public static Bitmap a(Drawable paramDrawable)
  {
    int i = paramDrawable.getIntrinsicWidth();
    int j = paramDrawable.getIntrinsicHeight();
    if (paramDrawable.getOpacity() != -1) {}
    for (Object localObject = Bitmap.Config.ARGB_8888;; localObject = Bitmap.Config.RGB_565)
    {
      localObject = Bitmap.createBitmap(i, j, (Bitmap.Config)localObject);
      Canvas localCanvas = new Canvas((Bitmap)localObject);
      paramDrawable.setBounds(0, 0, paramDrawable.getIntrinsicWidth(), paramDrawable.getIntrinsicHeight());
      paramDrawable.draw(localCanvas);
      return (Bitmap)localObject;
    }
  }
  
  public static Bitmap a(ImageView paramImageView)
  {
    try
    {
      localBitmap = Bitmap.createBitmap(paramImageView.getDrawingCache());
      paramImageView.printStackTrace();
    }
    catch (Exception paramImageView)
    {
      try
      {
        paramImageView.setDrawingCacheEnabled(false);
        return localBitmap;
      }
      catch (Exception paramImageView)
      {
        Bitmap localBitmap;
        for (;;) {}
      }
      paramImageView = paramImageView;
      localBitmap = null;
    }
    return localBitmap;
  }
  
  public static Bitmap a(File paramFile)
  {
    try
    {
      paramFile = BitmapFactory.decodeFile(paramFile.getPath());
      return paramFile;
    }
    catch (Exception paramFile)
    {
      paramFile.printStackTrace();
    }
    return null;
  }
  
  public static Bitmap a(File paramFile, int paramInt1, int paramInt2)
  {
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = true;
    BitmapFactory.decodeFile(paramFile.getPath(), localOptions);
    int j = localOptions.outWidth;
    int i = localOptions.outHeight;
    int[] arrayOfInt = c(j, i, paramInt1, paramInt2);
    float f = a(j, i, arrayOfInt[0], arrayOfInt[1]);
    paramInt2 = i;
    paramInt1 = j;
    if (f != 0.0F)
    {
      paramInt1 = (int)(j * f);
      paramInt2 = (int)(i * f);
    }
    localOptions.inPreferredConfig = Bitmap.Config.RGB_565;
    localOptions.inPurgeable = true;
    localOptions.inInputShareable = true;
    if (f < 0.25D) {
      localOptions.inSampleSize = 2;
    }
    for (;;)
    {
      localOptions.outWidth = paramInt1;
      localOptions.outHeight = paramInt2;
      localOptions.inJustDecodeBounds = false;
      localOptions.inDither = false;
      return a(BitmapFactory.decodeFile(paramFile.getPath(), localOptions), f);
      if (f < 0.125D) {
        localOptions.inSampleSize = 4;
      } else {
        localOptions.inSampleSize = 1;
      }
    }
  }
  
  /* Error */
  public static Bitmap a(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 6
    //   3: new 238	java/net/URL
    //   6: dup
    //   7: aload_0
    //   8: invokespecial 241	java/net/URL:<init>	(Ljava/lang/String;)V
    //   11: invokevirtual 245	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   14: astore_0
    //   15: aload_0
    //   16: iconst_1
    //   17: invokevirtual 250	java/net/URLConnection:setDoInput	(Z)V
    //   20: aload_0
    //   21: invokevirtual 253	java/net/URLConnection:connect	()V
    //   24: aload_0
    //   25: invokevirtual 257	java/net/URLConnection:getInputStream	()Ljava/io/InputStream;
    //   28: astore 4
    //   30: aload 4
    //   32: astore_0
    //   33: aload 4
    //   35: aconst_null
    //   36: aconst_null
    //   37: invokestatic 120	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   40: astore 5
    //   42: iload_1
    //   43: ifne +37 -> 80
    //   46: aload 4
    //   48: astore_0
    //   49: aload 5
    //   51: iload_2
    //   52: iload_3
    //   53: invokestatic 167	com/fimi/kernel/utils/s:b	(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
    //   56: astore 5
    //   58: aload 5
    //   60: astore_0
    //   61: aload_0
    //   62: astore 5
    //   64: aload 4
    //   66: ifnull +11 -> 77
    //   69: aload 4
    //   71: invokevirtual 123	java/io/InputStream:close	()V
    //   74: aload_0
    //   75: astore 5
    //   77: aload 5
    //   79: areturn
    //   80: iload_1
    //   81: iconst_1
    //   82: if_icmpne +21 -> 103
    //   85: aload 4
    //   87: astore_0
    //   88: aload 5
    //   90: iload_2
    //   91: iload_3
    //   92: invokestatic 137	com/fimi/kernel/utils/s:a	(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
    //   95: astore 5
    //   97: aload 5
    //   99: astore_0
    //   100: goto -39 -> 61
    //   103: aload 5
    //   105: astore_0
    //   106: goto -45 -> 61
    //   109: astore 4
    //   111: aload 4
    //   113: invokevirtual 61	java/lang/Exception:printStackTrace	()V
    //   116: aload_0
    //   117: areturn
    //   118: astore 5
    //   120: aconst_null
    //   121: astore 4
    //   123: aload 4
    //   125: astore_0
    //   126: ldc 2
    //   128: new 259	java/lang/StringBuilder
    //   131: dup
    //   132: invokespecial 260	java/lang/StringBuilder:<init>	()V
    //   135: ldc_w 262
    //   138: invokevirtual 266	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   141: aload 5
    //   143: invokevirtual 269	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   146: invokevirtual 266	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   149: invokevirtual 272	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   152: invokestatic 277	com/fimi/kernel/utils/k:a	(Ljava/lang/Class;Ljava/lang/String;)V
    //   155: aload 6
    //   157: astore 5
    //   159: aload 4
    //   161: ifnull -84 -> 77
    //   164: aload 4
    //   166: invokevirtual 123	java/io/InputStream:close	()V
    //   169: aconst_null
    //   170: areturn
    //   171: astore_0
    //   172: aload_0
    //   173: invokevirtual 61	java/lang/Exception:printStackTrace	()V
    //   176: aconst_null
    //   177: areturn
    //   178: astore 4
    //   180: aconst_null
    //   181: astore_0
    //   182: aload_0
    //   183: ifnull +7 -> 190
    //   186: aload_0
    //   187: invokevirtual 123	java/io/InputStream:close	()V
    //   190: aload 4
    //   192: athrow
    //   193: astore_0
    //   194: aload_0
    //   195: invokevirtual 61	java/lang/Exception:printStackTrace	()V
    //   198: goto -8 -> 190
    //   201: astore 4
    //   203: goto -21 -> 182
    //   206: astore 5
    //   208: goto -85 -> 123
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	211	0	paramString	String
    //   0	211	1	paramInt1	int
    //   0	211	2	paramInt2	int
    //   0	211	3	paramInt3	int
    //   28	58	4	localInputStream	InputStream
    //   109	3	4	localException1	Exception
    //   121	44	4	localObject1	Object
    //   178	13	4	localObject2	Object
    //   201	1	4	localObject3	Object
    //   40	64	5	localObject4	Object
    //   118	24	5	localException2	Exception
    //   157	1	5	localObject5	Object
    //   206	1	5	localException3	Exception
    //   1	155	6	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   69	74	109	java/lang/Exception
    //   3	30	118	java/lang/Exception
    //   164	169	171	java/lang/Exception
    //   3	30	178	finally
    //   186	190	193	java/lang/Exception
    //   33	42	201	finally
    //   49	58	201	finally
    //   88	97	201	finally
    //   126	155	201	finally
    //   33	42	206	java/lang/Exception
    //   49	58	206	java/lang/Exception
    //   88	97	206	java/lang/Exception
  }
  
  public static Bitmap a(byte[] paramArrayOfByte)
  {
    Bitmap localBitmap = null;
    try
    {
      if (paramArrayOfByte.length != 0) {
        localBitmap = BitmapFactory.decodeByteArray(paramArrayOfByte, 0, paramArrayOfByte.length);
      }
      return localBitmap;
    }
    catch (Exception paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
    }
    return null;
  }
  
  public static Drawable a(Bitmap paramBitmap)
  {
    if (paramBitmap == null) {
      return null;
    }
    try
    {
      paramBitmap = new BitmapDrawable(paramBitmap);
      return paramBitmap;
    }
    catch (Exception paramBitmap)
    {
      for (;;)
      {
        paramBitmap.printStackTrace();
        paramBitmap = null;
      }
    }
  }
  
  public static Drawable a(View paramView)
  {
    try
    {
      paramView = b(paramView);
      if (paramView != null)
      {
        paramView = new BitmapDrawable(paramView);
        return paramView;
      }
    }
    catch (Exception paramView)
    {
      paramView.printStackTrace();
    }
    return null;
  }
  
  public static String a(Context paramContext, String paramString)
  {
    l2 = 0L;
    paramString = new File(paramString);
    l1 = l2;
    if (paramString.isFile())
    {
      l1 = l2;
      if (!paramString.exists()) {}
    }
    try
    {
      int i = MediaPlayer.create(paramContext, Uri.fromFile(paramString)).getDuration();
      l1 = i;
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        l1 = l2;
      }
    }
    paramContext = new SimpleDateFormat();
    paramContext.setTimeZone(TimeZone.getTimeZone("UTC"));
    paramContext.applyPattern("mm:ss");
    return paramContext.format(new Date(l1));
  }
  
  public static void a(Bitmap[] paramArrayOfBitmap)
  {
    if (paramArrayOfBitmap != null) {
      try
      {
        int j = paramArrayOfBitmap.length;
        int i = 0;
        while (i < j)
        {
          Bitmap localBitmap = paramArrayOfBitmap[i];
          if ((localBitmap != null) && (!localBitmap.isRecycled()))
          {
            k.a(s.class, "Bitmap释放" + localBitmap.toString());
            localBitmap.recycle();
          }
          i += 1;
        }
        return;
      }
      catch (Exception paramArrayOfBitmap) {}
    }
  }
  
  public static void a(String[] paramArrayOfString) {}
  
  private static boolean a(int paramInt1, int paramInt2)
  {
    if ((paramInt1 <= 0) || (paramInt2 <= 0))
    {
      k.c(s.class, "请求Bitmap的宽高参数必须大于0");
      return false;
    }
    return true;
  }
  
  /* Error */
  public static byte[] a(Bitmap paramBitmap, Bitmap.CompressFormat paramCompressFormat, boolean paramBoolean)
  {
    // Byte code:
    //   0: new 44	java/io/ByteArrayOutputStream
    //   3: dup
    //   4: invokespecial 45	java/io/ByteArrayOutputStream:<init>	()V
    //   7: astore 5
    //   9: aload 5
    //   11: astore_3
    //   12: aload_0
    //   13: aload_1
    //   14: bipush 100
    //   16: aload 5
    //   18: invokevirtual 51	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   21: pop
    //   22: aload 5
    //   24: astore_3
    //   25: aload 5
    //   27: invokevirtual 55	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   30: astore_1
    //   31: iload_2
    //   32: ifeq +10 -> 42
    //   35: aload 5
    //   37: astore_3
    //   38: aload_0
    //   39: invokevirtual 160	android/graphics/Bitmap:recycle	()V
    //   42: aload_1
    //   43: astore_3
    //   44: aload 5
    //   46: ifnull +10 -> 56
    //   49: aload 5
    //   51: invokevirtual 58	java/io/ByteArrayOutputStream:close	()V
    //   54: aload_1
    //   55: astore_3
    //   56: aload_3
    //   57: areturn
    //   58: astore_0
    //   59: aload_0
    //   60: invokevirtual 61	java/lang/Exception:printStackTrace	()V
    //   63: aload_1
    //   64: areturn
    //   65: astore 4
    //   67: aconst_null
    //   68: astore_1
    //   69: aconst_null
    //   70: astore_0
    //   71: aload_1
    //   72: astore_3
    //   73: aload 4
    //   75: invokevirtual 61	java/lang/Exception:printStackTrace	()V
    //   78: aload_0
    //   79: astore_3
    //   80: aload_1
    //   81: ifnull -25 -> 56
    //   84: aload_1
    //   85: invokevirtual 58	java/io/ByteArrayOutputStream:close	()V
    //   88: aload_0
    //   89: areturn
    //   90: astore_1
    //   91: aload_1
    //   92: invokevirtual 61	java/lang/Exception:printStackTrace	()V
    //   95: aload_0
    //   96: areturn
    //   97: astore_0
    //   98: aconst_null
    //   99: astore_3
    //   100: aload_3
    //   101: ifnull +7 -> 108
    //   104: aload_3
    //   105: invokevirtual 58	java/io/ByteArrayOutputStream:close	()V
    //   108: aload_0
    //   109: athrow
    //   110: astore_1
    //   111: aload_1
    //   112: invokevirtual 61	java/lang/Exception:printStackTrace	()V
    //   115: goto -7 -> 108
    //   118: astore_0
    //   119: goto -19 -> 100
    //   122: astore 4
    //   124: aconst_null
    //   125: astore_0
    //   126: aload 5
    //   128: astore_1
    //   129: goto -58 -> 71
    //   132: astore 4
    //   134: aload_1
    //   135: astore_0
    //   136: aload 5
    //   138: astore_1
    //   139: goto -68 -> 71
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	142	0	paramBitmap	Bitmap
    //   0	142	1	paramCompressFormat	Bitmap.CompressFormat
    //   0	142	2	paramBoolean	boolean
    //   11	94	3	localObject	Object
    //   65	9	4	localException1	Exception
    //   122	1	4	localException2	Exception
    //   132	1	4	localException3	Exception
    //   7	130	5	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    // Exception table:
    //   from	to	target	type
    //   49	54	58	java/lang/Exception
    //   0	9	65	java/lang/Exception
    //   84	88	90	java/lang/Exception
    //   0	9	97	finally
    //   104	108	110	java/lang/Exception
    //   12	22	118	finally
    //   25	31	118	finally
    //   38	42	118	finally
    //   73	78	118	finally
    //   12	22	122	java/lang/Exception
    //   25	31	122	java/lang/Exception
    //   38	42	132	java/lang/Exception
  }
  
  public static byte[] a(View paramView, Bitmap.CompressFormat paramCompressFormat)
  {
    try
    {
      paramView = a(b(paramView), paramCompressFormat, true);
      return paramView;
    }
    catch (Exception paramView)
    {
      paramView.printStackTrace();
    }
    return null;
  }
  
  private static float b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    float f1 = paramInt3 / paramInt1;
    float f2 = paramInt4 / paramInt2;
    if (f1 > f2) {
      return f2;
    }
    return f1;
  }
  
  public static Bitmap b(Bitmap paramBitmap, float paramFloat)
  {
    try
    {
      Matrix localMatrix = new Matrix();
      localMatrix.setRotate(paramFloat % 360.0F);
      paramBitmap = Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight(), localMatrix, false);
      return paramBitmap;
    }
    catch (Exception paramBitmap)
    {
      paramBitmap.printStackTrace();
    }
    return null;
  }
  
  public static Bitmap b(Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    int k = 0;
    Object localObject4 = null;
    Object localObject1;
    if (!h(paramBitmap)) {
      localObject1 = localObject4;
    }
    for (;;)
    {
      return (Bitmap)localObject1;
      localObject1 = localObject4;
      if (!a(paramInt1, paramInt2)) {
        continue;
      }
      try
      {
        int i = paramBitmap.getWidth();
        int j = paramBitmap.getHeight();
        if (i > paramInt1)
        {
          int m = (i - paramInt1) / 2;
          i = paramInt1;
          paramInt1 = m;
          label60:
          if (j <= paramInt2) {
            break label117;
          }
          k = (j - paramInt2) / 2;
          j = paramInt2;
        }
        label117:
        for (paramInt2 = k;; paramInt2 = k)
        {
          localObject1 = Bitmap.createBitmap(paramBitmap, paramInt1, paramInt2, i, j);
          localObject4 = localObject1;
          localObject1 = localObject4;
          if (localObject4 == paramBitmap) {
            break;
          }
          paramBitmap.recycle();
          return (Bitmap)localObject4;
          paramInt1 = 0;
          break label60;
        }
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        Object localObject2 = localObject4;
        return null;
      }
      finally
      {
        if (paramBitmap != null) {
          paramBitmap.recycle();
        }
      }
    }
  }
  
  public static Bitmap b(View paramView)
  {
    Bitmap localBitmap = null;
    if (paramView != null) {}
    try
    {
      paramView.setDrawingCacheEnabled(true);
      paramView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
      paramView.layout(0, 0, paramView.getMeasuredWidth(), paramView.getMeasuredHeight());
      paramView.buildDrawingCache();
      localBitmap = paramView.getDrawingCache();
      return localBitmap;
    }
    catch (Exception paramView)
    {
      paramView.printStackTrace();
    }
    return null;
  }
  
  public static Bitmap b(File paramFile, int paramInt1, int paramInt2)
  {
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = true;
    BitmapFactory.decodeFile(paramFile.getPath(), localOptions);
    int j = localOptions.outWidth;
    int i = localOptions.outHeight;
    int[] arrayOfInt = c(j, i, paramInt1, paramInt2);
    int k = arrayOfInt[0];
    int m = arrayOfInt[1];
    float f = a(j, i, k, m);
    paramInt2 = i;
    paramInt1 = j;
    if (f != 1.0F)
    {
      paramInt1 = (int)(j * f);
      paramInt2 = (int)(i * f);
    }
    localOptions.inPreferredConfig = Bitmap.Config.RGB_565;
    localOptions.inPurgeable = true;
    localOptions.inInputShareable = true;
    if (f < 0.25D) {
      localOptions.inSampleSize = 2;
    }
    for (;;)
    {
      localOptions.outHeight = paramInt2;
      localOptions.outWidth = paramInt1;
      localOptions.inJustDecodeBounds = false;
      localOptions.inDither = false;
      paramFile = BitmapFactory.decodeFile(paramFile.getPath(), localOptions);
      if (paramFile == null) {
        break;
      }
      return b(paramFile, k, m);
      if (f < 0.125D) {
        localOptions.inSampleSize = 4;
      } else {
        localOptions.inSampleSize = 1;
      }
    }
    return null;
  }
  
  public static TransitionDrawable b(Bitmap paramBitmap)
  {
    if (paramBitmap == null) {
      return null;
    }
    try
    {
      paramBitmap = new TransitionDrawable(new Drawable[] { new ColorDrawable(17170445), new BitmapDrawable(paramBitmap) });
      return paramBitmap;
    }
    catch (Exception paramBitmap)
    {
      for (;;)
      {
        paramBitmap.printStackTrace();
        paramBitmap = null;
      }
    }
  }
  
  public static TransitionDrawable b(Drawable paramDrawable)
  {
    if (paramDrawable == null) {
      return null;
    }
    try
    {
      paramDrawable = new TransitionDrawable(new Drawable[] { new ColorDrawable(17170445), paramDrawable });
      return paramDrawable;
    }
    catch (Exception paramDrawable)
    {
      for (;;)
      {
        paramDrawable.printStackTrace();
        paramDrawable = null;
      }
    }
  }
  
  public static float[] b(File paramFile)
  {
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = true;
    BitmapFactory.decodeFile(paramFile.getPath(), localOptions);
    return new float[] { localOptions.outWidth, localOptions.outHeight };
  }
  
  public static Bitmap c(Bitmap paramBitmap)
  {
    if (paramBitmap == null) {
      return null;
    }
    int i = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    float f6;
    float f3;
    float f4;
    float f2;
    float f1;
    float f5;
    if (i <= j)
    {
      f6 = i / 2;
      f3 = i;
      f4 = i;
      f2 = i;
      f1 = i;
      j = i;
      f5 = 0.0F;
    }
    for (;;)
    {
      Bitmap localBitmap = Bitmap.createBitmap(j, i, Bitmap.Config.ARGB_8888);
      Canvas localCanvas = new Canvas(localBitmap);
      Paint localPaint = new Paint();
      Rect localRect1 = new Rect((int)f5, (int)0.0F, (int)f4, (int)f3);
      Rect localRect2 = new Rect((int)0.0F, (int)0.0F, (int)f2, (int)f1);
      RectF localRectF = new RectF(localRect2);
      localPaint.setAntiAlias(true);
      localCanvas.drawARGB(0, 0, 0, 0);
      localPaint.setColor(-12434878);
      localCanvas.drawRoundRect(localRectF, f6, f6, localPaint);
      localPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
      localCanvas.drawBitmap(paramBitmap, localRect1, localRect2, localPaint);
      return localBitmap;
      f6 = j / 2;
      f5 = (i - j) / 2;
      f4 = i - f5;
      f3 = j;
      f2 = j;
      f1 = j;
      i = j;
    }
  }
  
  public static Bitmap c(Bitmap paramBitmap, float paramFloat)
  {
    try
    {
      Matrix localMatrix = new Matrix();
      int j;
      if (paramFloat / 90.0F % 2.0F != 0.0F) {
        j = paramBitmap.getWidth();
      }
      for (int i = paramBitmap.getHeight();; i = paramBitmap.getWidth())
      {
        j /= 2;
        i /= 2;
        localMatrix.preTranslate(-j, -i);
        localMatrix.postRotate(paramFloat);
        localMatrix.postTranslate(j, i);
        return null;
        j = paramBitmap.getHeight();
      }
      return null;
    }
    catch (Exception paramBitmap)
    {
      paramBitmap.printStackTrace();
    }
  }
  
  private static int[] c(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int k = 2048;
    if (paramInt3 <= 0) {
      paramInt3 = paramInt1;
    }
    for (;;)
    {
      if (paramInt4 <= 0) {}
      for (int i = paramInt2;; i = paramInt4)
      {
        int j = i;
        paramInt4 = paramInt3;
        if (paramInt3 > 2048)
        {
          float f = 'ࠀ' / paramInt1;
          j = (int)(i * f);
          paramInt4 = 2048;
        }
        if (j > 2048)
        {
          paramInt2 = (int)('ࠀ' / paramInt2 * paramInt4);
          paramInt1 = k;
        }
        for (;;)
        {
          return new int[] { paramInt2, paramInt1 };
          paramInt1 = j;
          paramInt2 = paramInt4;
        }
      }
    }
  }
  
  public static Bitmap d(Bitmap paramBitmap)
  {
    if (paramBitmap == null) {
      return null;
    }
    try
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
      localCanvas.drawRect(0.0F, j, i, j + 1, localPaint);
      localCanvas.drawBitmap((Bitmap)localObject2, 0.0F, j + 1, null);
      localObject2 = new Paint();
      ((Paint)localObject2).setShader(new LinearGradient(0.0F, paramBitmap.getHeight(), 0.0F, ((Bitmap)localObject1).getHeight() + 1, 1895825407, 16777215, Shader.TileMode.CLAMP));
      ((Paint)localObject2).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
      localCanvas.drawRect(0.0F, j, i, ((Bitmap)localObject1).getHeight() + 1, (Paint)localObject2);
      return (Bitmap)localObject1;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return paramBitmap;
  }
  
  public static void e(Bitmap paramBitmap)
  {
    if (paramBitmap != null) {}
    try
    {
      if (!paramBitmap.isRecycled())
      {
        k.a(s.class, "Bitmap释放" + paramBitmap.toString());
        paramBitmap.recycle();
      }
      return;
    }
    catch (Exception paramBitmap) {}
  }
  
  public static String f(Bitmap paramBitmap)
  {
    int k = 0;
    Object localObject = Bitmap.createScaledBitmap(paramBitmap, 8, 8, false);
    int m = ((Bitmap)localObject).getWidth();
    int n = ((Bitmap)localObject).getHeight();
    Log.i("th", "将图片缩小到8x8的尺寸:" + m + "*" + n);
    paramBitmap = new int[m * n];
    int i = 0;
    while (i < m)
    {
      j = 0;
      while (j < n)
      {
        paramBitmap[(i * n + j)] = a(((Bitmap)localObject).getPixel(i, j));
        j += 1;
      }
      i += 1;
    }
    e((Bitmap)localObject);
    int j = l.b(paramBitmap);
    localObject = new int[m * n];
    i = 0;
    if (i < localObject.length)
    {
      if (paramBitmap[i] >= j) {
        localObject[i] = 1;
      }
      for (;;)
      {
        i += 1;
        break;
        localObject[i] = 0;
      }
    }
    paramBitmap = new StringBuffer();
    i = k;
    while (i < localObject.length)
    {
      paramBitmap.append(l.a(localObject[i] * (int)Math.pow(2.0D, 3.0D) + localObject[(i + 1)] * (int)Math.pow(2.0D, 2.0D) + localObject[(i + 2)] * (int)Math.pow(2.0D, 1.0D) + localObject[(i + 2)]));
      i += 4;
    }
    return paramBitmap.toString();
  }
  
  public static int[] g(Bitmap paramBitmap)
  {
    int i1 = paramBitmap.getWidth();
    int i2 = paramBitmap.getHeight();
    int[] arrayOfInt = new int[64];
    int m = 0;
    int n;
    label31:
    int k;
    int i;
    int j;
    if (m < i1)
    {
      n = 0;
      if (n < i2)
      {
        k = paramBitmap.getPixel(m, n);
        i = k >> 16 & 0xFF;
        j = k >> 8 & 0xFF;
        k &= 0xFF;
        if (i >= 192) {
          i = 3;
        }
      }
    }
    for (;;)
    {
      label80:
      if (j >= 192) {
        j = 3;
      }
      for (;;)
      {
        label89:
        if (k >= 192) {
          k = 3;
        }
        for (;;)
        {
          i = k + (j * 4 + i * 16);
          arrayOfInt[i] += 1;
          n += 1;
          break label31;
          if (i >= 128)
          {
            i = 2;
            break label80;
          }
          if (i >= 64)
          {
            i = 1;
            break label80;
          }
          if (i < 0) {
            break label246;
          }
          i = 0;
          break label80;
          if (j >= 128)
          {
            j = 2;
            break label89;
          }
          if (j >= 64)
          {
            j = 1;
            break label89;
          }
          if (j < 0) {
            break label241;
          }
          j = 0;
          break label89;
          if (k >= 128)
          {
            k = 2;
          }
          else if (k >= 64)
          {
            k = 1;
          }
          else
          {
            if (k >= 0)
            {
              k = 0;
              continue;
              m += 1;
              break;
              return arrayOfInt;
            }
            k = 0;
          }
        }
        label241:
        j = 0;
      }
      label246:
      i = 0;
    }
  }
  
  private static boolean h(Bitmap paramBitmap)
  {
    if (paramBitmap == null)
    {
      k.c(s.class, "原图Bitmap为空了");
      return false;
    }
    if ((paramBitmap.getWidth() <= 0) || (paramBitmap.getHeight() <= 0))
    {
      k.c(s.class, "原图Bitmap大小为0");
      return false;
    }
    return true;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/utils/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */