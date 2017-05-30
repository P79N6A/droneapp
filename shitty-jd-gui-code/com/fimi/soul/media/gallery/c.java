package com.fimi.soul.media.gallery;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Point;
import android.media.ThumbnailUtils;
import android.os.Handler;
import android.os.Message;
import android.support.v4.util.LruCache;
import com.fimi.kernel.utils.s;
import com.fimi.soul.utils.v;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class c
{
  private static c b = null;
  public LruCache<String, Bitmap> a;
  private ExecutorService c = Executors.newFixedThreadPool(4);
  private Context d;
  private ArrayList<Bitmap> e = new ArrayList();
  
  private c(Context paramContext)
  {
    this.d = paramContext;
    this.a = new LruCache((int)Runtime.getRuntime().maxMemory() / 8)
    {
      @SuppressLint({"NewApi"})
      protected int a(String paramAnonymousString, Bitmap paramAnonymousBitmap)
      {
        return paramAnonymousBitmap.getByteCount();
      }
    };
  }
  
  private int a(BitmapFactory.Options paramOptions, int paramInt1, int paramInt2)
  {
    int i = 1;
    paramInt2 = i;
    if (paramInt1 != 0)
    {
      if (paramInt1 != 0) {
        break label19;
      }
      paramInt2 = i;
    }
    label19:
    do
    {
      int k;
      int j;
      do
      {
        return paramInt2;
        k = paramOptions.outWidth;
        j = paramOptions.outHeight;
        if (k > paramInt1) {
          break;
        }
        paramInt2 = i;
      } while (j <= paramInt1);
      i = Math.round(k / paramInt1);
      paramInt1 = Math.round(j / paramInt1);
      paramInt2 = i;
    } while (i < paramInt1);
    return paramInt1;
  }
  
  private Bitmap a(String paramString, int paramInt1, int paramInt2)
  {
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inSampleSize = 1;
    localOptions.inJustDecodeBounds = true;
    BitmapFactory.decodeFile(paramString, localOptions);
    localOptions.inPreferredConfig = Bitmap.Config.RGB_565;
    BitmapFactory.decodeFile(paramString, localOptions);
    localOptions.inSampleSize = a(localOptions, paramInt1, paramInt2);
    localOptions.inJustDecodeBounds = false;
    return BitmapFactory.decodeFile(paramString, localOptions);
  }
  
  public static c a(Context paramContext)
  {
    if (b == null) {
      b = new c(paramContext);
    }
    return b;
  }
  
  private void a(String paramString, Bitmap paramBitmap)
  {
    if ((b(paramString) == null) && (paramBitmap != null))
    {
      this.e.add(paramBitmap);
      this.a.put(paramString, paramBitmap);
    }
  }
  
  private Bitmap b(String paramString)
  {
    return (Bitmap)this.a.get(paramString);
  }
  
  public Bitmap a(final String paramString, Point paramPoint, final a parama)
  {
    paramPoint = b(paramString);
    parama = new Handler()
    {
      public void handleMessage(Message paramAnonymousMessage)
      {
        super.handleMessage(paramAnonymousMessage);
        parama.a((Bitmap)paramAnonymousMessage.obj, paramString);
      }
    };
    if (paramPoint == null) {
      this.c.execute(new Runnable()
      {
        public void run()
        {
          Object localObject1 = null;
          if (v.c(paramString, c.a(c.this))) {
            localObject1 = ThumbnailUtils.createVideoThumbnail(paramString, 1);
          }
          for (;;)
          {
            Object localObject2 = parama.obtainMessage();
            ((Message)localObject2).obj = localObject1;
            parama.sendMessage((Message)localObject2);
            c.a(c.this, paramString, (Bitmap)localObject1);
            return;
            try
            {
              localObject2 = s.a(c.a(c.this), paramString, 250);
              localObject1 = localObject2;
            }
            catch (IOException localIOException)
            {
              localIOException.printStackTrace();
            }
          }
        }
      });
    }
    return paramPoint;
  }
  
  public Bitmap a(String paramString, a parama)
  {
    return a(paramString, null, parama);
  }
  
  public void a()
  {
    if ((this.a != null) && (this.a.size() > 0))
    {
      this.a.evictAll();
      int i = 0;
      while (i < this.e.size())
      {
        Bitmap localBitmap = (Bitmap)this.e.get(i);
        if ((localBitmap != null) && (!localBitmap.isRecycled())) {
          localBitmap.recycle();
        }
        i += 1;
      }
      this.e.clear();
    }
  }
  
  public void a(String paramString)
  {
    if (paramString != null) {}
    try
    {
      if (this.a != null)
      {
        paramString = (Bitmap)this.a.remove(paramString);
        if (paramString != null) {
          paramString.recycle();
        }
      }
      return;
    }
    finally {}
  }
  
  public static abstract interface a
  {
    public abstract void a(Bitmap paramBitmap, String paramString);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/media/gallery/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */