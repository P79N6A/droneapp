package com.google.android.gms.common.images;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.util.LruCache;
import android.util.Log;
import android.widget.ImageView;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.util.s;
import com.google.android.gms.internal.zzrv;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class ImageManager
{
  private static final Object a = new Object();
  private static HashSet<Uri> b = new HashSet();
  private static ImageManager c;
  private static ImageManager d;
  private final Context e;
  private final Handler f;
  private final ExecutorService g;
  private final c h;
  private final zzrv i;
  private final Map<b, ImageReceiver> j;
  private final Map<Uri, ImageReceiver> k;
  private final Map<Uri, Long> l;
  
  private ImageManager(Context paramContext, boolean paramBoolean)
  {
    this.e = paramContext.getApplicationContext();
    this.f = new Handler(Looper.getMainLooper());
    this.g = Executors.newFixedThreadPool(4);
    if (paramBoolean)
    {
      this.h = new c(this.e);
      if (s.d()) {
        c();
      }
    }
    for (;;)
    {
      this.i = new zzrv();
      this.j = new HashMap();
      this.k = new HashMap();
      this.l = new HashMap();
      return;
      this.h = null;
    }
  }
  
  private Bitmap a(b.a parama)
  {
    if (this.h == null) {
      return null;
    }
    return (Bitmap)this.h.get(parama);
  }
  
  public static ImageManager a(Context paramContext)
  {
    return a(paramContext, false);
  }
  
  public static ImageManager a(Context paramContext, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (d == null) {
        d = new ImageManager(paramContext, true);
      }
      return d;
    }
    if (c == null) {
      c = new ImageManager(paramContext, false);
    }
    return c;
  }
  
  @TargetApi(14)
  private void c()
  {
    this.e.registerComponentCallbacks(new f(this.h));
  }
  
  public void a(ImageView paramImageView, int paramInt)
  {
    a(new b.b(paramImageView, paramInt));
  }
  
  public void a(ImageView paramImageView, Uri paramUri)
  {
    a(new b.b(paramImageView, paramUri));
  }
  
  public void a(ImageView paramImageView, Uri paramUri, int paramInt)
  {
    paramImageView = new b.b(paramImageView, paramUri);
    paramImageView.a(paramInt);
    a(paramImageView);
  }
  
  public void a(a parama, Uri paramUri)
  {
    a(new b.c(parama, paramUri));
  }
  
  public void a(a parama, Uri paramUri, int paramInt)
  {
    parama = new b.c(parama, paramUri);
    parama.a(paramInt);
    a(parama);
  }
  
  public void a(b paramb)
  {
    n.a("ImageManager.loadImage() must be called in the main thread");
    new e(paramb).run();
  }
  
  @KeepName
  private final class ImageReceiver
    extends ResultReceiver
  {
    private final Uri b;
    private final ArrayList<b> c;
    
    ImageReceiver(Uri paramUri)
    {
      super();
      this.b = paramUri;
      this.c = new ArrayList();
    }
    
    public void a()
    {
      Intent localIntent = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
      localIntent.putExtra("com.google.android.gms.extras.uri", this.b);
      localIntent.putExtra("com.google.android.gms.extras.resultReceiver", this);
      localIntent.putExtra("com.google.android.gms.extras.priority", 3);
      ImageManager.b(ImageManager.this).sendBroadcast(localIntent);
    }
    
    public void a(b paramb)
    {
      n.a("ImageReceiver.addImageRequest() must be called in the main thread");
      this.c.add(paramb);
    }
    
    public void b(b paramb)
    {
      n.a("ImageReceiver.removeImageRequest() must be called in the main thread");
      this.c.remove(paramb);
    }
    
    public void onReceiveResult(int paramInt, Bundle paramBundle)
    {
      paramBundle = (ParcelFileDescriptor)paramBundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
      ImageManager.f(ImageManager.this).execute(new ImageManager.d(ImageManager.this, this.b, paramBundle));
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(Uri paramUri, Drawable paramDrawable, boolean paramBoolean);
  }
  
  @TargetApi(11)
  private static final class b
  {
    static int a(ActivityManager paramActivityManager)
    {
      return paramActivityManager.getLargeMemoryClass();
    }
  }
  
  private static final class c
    extends LruCache<b.a, Bitmap>
  {
    public c(Context paramContext)
    {
      super();
    }
    
    @TargetApi(11)
    private static int a(Context paramContext)
    {
      ActivityManager localActivityManager = (ActivityManager)paramContext.getSystemService("activity");
      if ((paramContext.getApplicationInfo().flags & 0x100000) != 0)
      {
        i = 1;
        if ((i == 0) || (!s.a())) {
          break label55;
        }
      }
      label55:
      for (int i = ImageManager.b.a(localActivityManager);; i = localActivityManager.getMemoryClass())
      {
        return (int)(i * 1048576 * 0.33F);
        i = 0;
        break;
      }
    }
    
    protected int a(b.a parama, Bitmap paramBitmap)
    {
      return paramBitmap.getHeight() * paramBitmap.getRowBytes();
    }
    
    protected void a(boolean paramBoolean, b.a parama, Bitmap paramBitmap1, Bitmap paramBitmap2)
    {
      super.entryRemoved(paramBoolean, parama, paramBitmap1, paramBitmap2);
    }
  }
  
  private final class d
    implements Runnable
  {
    private final Uri b;
    private final ParcelFileDescriptor c;
    
    public d(Uri paramUri, ParcelFileDescriptor paramParcelFileDescriptor)
    {
      this.b = paramUri;
      this.c = paramParcelFileDescriptor;
    }
    
    public void run()
    {
      n.b("LoadBitmapFromDiskRunnable can't be executed in the main thread");
      boolean bool1 = false;
      boolean bool2 = false;
      Bitmap localBitmap = null;
      CountDownLatch localCountDownLatch = null;
      if (this.c != null) {}
      try
      {
        localBitmap = BitmapFactory.decodeFileDescriptor(this.c.getFileDescriptor());
        bool1 = bool2;
        String str2;
        Object localObject;
        String str1;
        return;
      }
      catch (OutOfMemoryError localOutOfMemoryError)
      {
        try
        {
          for (;;)
          {
            this.c.close();
            localCountDownLatch = new CountDownLatch(1);
            ImageManager.g(ImageManager.this).post(new ImageManager.g(ImageManager.this, this.b, localBitmap, bool1, localCountDownLatch));
            try
            {
              localCountDownLatch.await();
              return;
            }
            catch (InterruptedException localInterruptedException)
            {
              str1 = String.valueOf(this.b);
              Log.w("ImageManager", String.valueOf(str1).length() + 32 + "Latch interrupted while posting " + str1);
            }
            localOutOfMemoryError = localOutOfMemoryError;
            str2 = String.valueOf(this.b);
            Log.e("ImageManager", String.valueOf(str2).length() + 34 + "OOM while loading bitmap for uri: " + str2, localOutOfMemoryError);
            bool1 = true;
            localObject = localCountDownLatch;
          }
        }
        catch (IOException localIOException)
        {
          for (;;)
          {
            Log.e("ImageManager", "closed failed", localIOException);
          }
        }
      }
    }
  }
  
  private final class e
    implements Runnable
  {
    private final b b;
    
    public e(b paramb)
    {
      this.b = paramb;
    }
    
    public void run()
    {
      n.a("LoadImageRunnable must be executed on the main thread");
      Object localObject1 = (ImageManager.ImageReceiver)ImageManager.a(ImageManager.this).get(this.b);
      if (localObject1 != null)
      {
        ImageManager.a(ImageManager.this).remove(this.b);
        ((ImageManager.ImageReceiver)localObject1).b(this.b);
      }
      b.a locala = this.b.a;
      if (locala.a == null)
      {
        this.b.a(ImageManager.b(ImageManager.this), ImageManager.c(ImageManager.this), true);
        return;
      }
      localObject1 = ImageManager.a(ImageManager.this, locala);
      if (localObject1 != null)
      {
        this.b.a(ImageManager.b(ImageManager.this), (Bitmap)localObject1, true);
        return;
      }
      localObject1 = (Long)ImageManager.d(ImageManager.this).get(locala.a);
      if (localObject1 != null)
      {
        if (SystemClock.elapsedRealtime() - ((Long)localObject1).longValue() < 3600000L)
        {
          this.b.a(ImageManager.b(ImageManager.this), ImageManager.c(ImageManager.this), true);
          return;
        }
        ImageManager.d(ImageManager.this).remove(locala.a);
      }
      this.b.a(ImageManager.b(ImageManager.this), ImageManager.c(ImageManager.this));
      ??? = (ImageManager.ImageReceiver)ImageManager.e(ImageManager.this).get(locala.a);
      localObject1 = ???;
      if (??? == null)
      {
        localObject1 = new ImageManager.ImageReceiver(ImageManager.this, locala.a);
        ImageManager.e(ImageManager.this).put(locala.a, localObject1);
      }
      ((ImageManager.ImageReceiver)localObject1).a(this.b);
      if (!(this.b instanceof b.c)) {
        ImageManager.a(ImageManager.this).put(this.b, localObject1);
      }
      synchronized (ImageManager.a())
      {
        if (!ImageManager.b().contains(locala.a))
        {
          ImageManager.b().add(locala.a);
          ((ImageManager.ImageReceiver)localObject1).a();
        }
        return;
      }
    }
  }
  
  @TargetApi(14)
  private static final class f
    implements ComponentCallbacks2
  {
    private final ImageManager.c a;
    
    public f(ImageManager.c paramc)
    {
      this.a = paramc;
    }
    
    public void onConfigurationChanged(Configuration paramConfiguration) {}
    
    public void onLowMemory()
    {
      this.a.evictAll();
    }
    
    public void onTrimMemory(int paramInt)
    {
      if (paramInt >= 60) {
        this.a.evictAll();
      }
      while (paramInt < 20) {
        return;
      }
      this.a.trimToSize(this.a.size() / 2);
    }
  }
  
  private final class g
    implements Runnable
  {
    private final Uri b;
    private final Bitmap c;
    private final CountDownLatch d;
    private boolean e;
    
    public g(Uri paramUri, Bitmap paramBitmap, boolean paramBoolean, CountDownLatch paramCountDownLatch)
    {
      this.b = paramUri;
      this.c = paramBitmap;
      this.e = paramBoolean;
      this.d = paramCountDownLatch;
    }
    
    private void a(ImageManager.ImageReceiver paramImageReceiver, boolean paramBoolean)
    {
      paramImageReceiver = ImageManager.ImageReceiver.a(paramImageReceiver);
      int j = paramImageReceiver.size();
      int i = 0;
      if (i < j)
      {
        b localb = (b)paramImageReceiver.get(i);
        if (paramBoolean) {
          localb.a(ImageManager.b(ImageManager.this), this.c, false);
        }
        for (;;)
        {
          if (!(localb instanceof b.c)) {
            ImageManager.a(ImageManager.this).remove(localb);
          }
          i += 1;
          break;
          ImageManager.d(ImageManager.this).put(this.b, Long.valueOf(SystemClock.elapsedRealtime()));
          localb.a(ImageManager.b(ImageManager.this), ImageManager.c(ImageManager.this), false);
        }
      }
    }
    
    public void run()
    {
      n.a("OnBitmapLoadedRunnable must be executed in the main thread");
      boolean bool;
      if (this.c != null) {
        bool = true;
      }
      while (ImageManager.h(ImageManager.this) != null) {
        if (this.e)
        {
          ImageManager.h(ImageManager.this).evictAll();
          System.gc();
          this.e = false;
          ImageManager.g(ImageManager.this).post(this);
          return;
          bool = false;
        }
        else if (bool)
        {
          ImageManager.h(ImageManager.this).put(new b.a(this.b), this.c);
        }
      }
      ??? = (ImageManager.ImageReceiver)ImageManager.e(ImageManager.this).remove(this.b);
      if (??? != null) {
        a((ImageManager.ImageReceiver)???, bool);
      }
      this.d.countDown();
      synchronized (ImageManager.a())
      {
        ImageManager.b().remove(this.b);
        return;
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/images/ImageManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */