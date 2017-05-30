package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.widget.ImageView.ScaleType;
import com.android.volley.d;
import com.android.volley.j;
import com.android.volley.n;
import com.android.volley.n.b;
import com.android.volley.p;
import com.android.volley.p.a;
import com.android.volley.p.b;
import com.android.volley.v;

public class l
  extends n<Bitmap>
{
  private static final int a = 1000;
  private static final int b = 2;
  private static final float c = 2.0F;
  private static final Object i = new Object();
  private final p.b<Bitmap> d;
  private final Bitmap.Config e;
  private final int f;
  private final int g;
  private ImageView.ScaleType h;
  
  @Deprecated
  public l(String paramString, p.b<Bitmap> paramb, int paramInt1, int paramInt2, Bitmap.Config paramConfig, p.a parama)
  {
    this(paramString, paramb, paramInt1, paramInt2, ImageView.ScaleType.CENTER_INSIDE, paramConfig, parama);
  }
  
  public l(String paramString, p.b<Bitmap> paramb, int paramInt1, int paramInt2, ImageView.ScaleType paramScaleType, Bitmap.Config paramConfig, p.a parama)
  {
    super(0, paramString, parama);
    a(new d(1000, 2, 2.0F));
    this.d = paramb;
    this.e = paramConfig;
    this.f = paramInt1;
    this.g = paramInt2;
    this.h = paramScaleType;
  }
  
  static int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    double d1 = Math.min(paramInt1 / paramInt3, paramInt2 / paramInt4);
    for (float f1 = 1.0F; f1 * 2.0F <= d1; f1 *= 2.0F) {}
    return (int)f1;
  }
  
  private static int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, ImageView.ScaleType paramScaleType)
  {
    int j;
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      j = paramInt3;
    }
    double d1;
    do
    {
      do
      {
        do
        {
          do
          {
            return j;
            if (paramScaleType != ImageView.ScaleType.FIT_XY) {
              break;
            }
            j = paramInt1;
          } while (paramInt1 != 0);
          return paramInt3;
          if (paramInt1 == 0) {
            return (int)(paramInt2 / paramInt4 * paramInt3);
          }
          j = paramInt1;
        } while (paramInt2 == 0);
        d1 = paramInt4 / paramInt3;
        if (paramScaleType != ImageView.ScaleType.CENTER_CROP) {
          break;
        }
        j = paramInt1;
      } while (paramInt1 * d1 >= paramInt2);
      return (int)(paramInt2 / d1);
      j = paramInt1;
    } while (paramInt1 * d1 <= paramInt2);
    return (int)(paramInt2 / d1);
  }
  
  private p<Bitmap> b(j paramj)
  {
    Object localObject1 = paramj.b;
    Object localObject2 = new BitmapFactory.Options();
    if ((this.f == 0) && (this.g == 0))
    {
      ((BitmapFactory.Options)localObject2).inPreferredConfig = this.e;
      localObject1 = BitmapFactory.decodeByteArray((byte[])localObject1, 0, localObject1.length, (BitmapFactory.Options)localObject2);
    }
    while (localObject1 == null)
    {
      return p.a(new com.android.volley.l(paramj));
      ((BitmapFactory.Options)localObject2).inJustDecodeBounds = true;
      BitmapFactory.decodeByteArray((byte[])localObject1, 0, localObject1.length, (BitmapFactory.Options)localObject2);
      int j = ((BitmapFactory.Options)localObject2).outWidth;
      int k = ((BitmapFactory.Options)localObject2).outHeight;
      int m = a(this.f, this.g, j, k, this.h);
      int n = a(this.g, this.f, k, j, this.h);
      ((BitmapFactory.Options)localObject2).inJustDecodeBounds = false;
      ((BitmapFactory.Options)localObject2).inSampleSize = a(j, k, m, n);
      localObject1 = BitmapFactory.decodeByteArray((byte[])localObject1, 0, localObject1.length, (BitmapFactory.Options)localObject2);
      if ((localObject1 != null) && ((((Bitmap)localObject1).getWidth() > m) || (((Bitmap)localObject1).getHeight() > n)))
      {
        localObject2 = Bitmap.createScaledBitmap((Bitmap)localObject1, m, n, true);
        ((Bitmap)localObject1).recycle();
        localObject1 = localObject2;
      }
    }
    return p.a(localObject1, h.a(paramj));
  }
  
  protected p<Bitmap> a(j paramj)
  {
    synchronized (i)
    {
      try
      {
        p localp = b(paramj);
        return localp;
      }
      catch (OutOfMemoryError localOutOfMemoryError)
      {
        v.c("Caught OOM for %d byte image, url=%s", new Object[] { Integer.valueOf(paramj.b.length), g() });
        paramj = p.a(new com.android.volley.l(localOutOfMemoryError));
        return paramj;
      }
    }
  }
  
  protected void a(Bitmap paramBitmap)
  {
    this.d.a(paramBitmap);
  }
  
  public n.b x()
  {
    return n.b.a;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/android/volley/toolbox/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */