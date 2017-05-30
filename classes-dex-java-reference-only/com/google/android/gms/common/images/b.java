package com.google.android.gms.common.images;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.internal.aja;
import com.google.android.gms.internal.ajb;
import com.google.android.gms.internal.zzrv;
import java.lang.ref.WeakReference;

public abstract class b
{
  final a a;
  protected int b = 0;
  protected int c = 0;
  protected boolean d = false;
  private boolean e = true;
  private boolean f = false;
  private boolean g = true;
  
  public b(Uri paramUri, int paramInt)
  {
    this.a = new a(paramUri);
    this.c = paramInt;
  }
  
  private Drawable a(Context paramContext, zzrv paramzzrv, int paramInt)
  {
    return paramContext.getResources().getDrawable(paramInt);
  }
  
  protected aja a(Drawable paramDrawable1, Drawable paramDrawable2)
  {
    if (paramDrawable1 != null)
    {
      localDrawable = paramDrawable1;
      if (!(paramDrawable1 instanceof aja)) {}
    }
    for (Drawable localDrawable = ((aja)paramDrawable1).b();; localDrawable = null) {
      return new aja(localDrawable, paramDrawable2);
    }
  }
  
  public void a(int paramInt)
  {
    this.c = paramInt;
  }
  
  void a(Context paramContext, Bitmap paramBitmap, boolean paramBoolean)
  {
    n.a(paramBitmap);
    a(new BitmapDrawable(paramContext.getResources(), paramBitmap), paramBoolean, false, true);
  }
  
  void a(Context paramContext, zzrv paramzzrv)
  {
    if (this.g) {
      a(null, false, true, false);
    }
  }
  
  void a(Context paramContext, zzrv paramzzrv, boolean paramBoolean)
  {
    Drawable localDrawable = null;
    if (this.c != 0) {
      localDrawable = a(paramContext, paramzzrv, this.c);
    }
    a(localDrawable, paramBoolean, false, false);
  }
  
  protected abstract void a(Drawable paramDrawable, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3);
  
  protected boolean a(boolean paramBoolean1, boolean paramBoolean2)
  {
    return (this.e) && (!paramBoolean2) && (!paramBoolean1);
  }
  
  static final class a
  {
    public final Uri a;
    
    public a(Uri paramUri)
    {
      this.a = paramUri;
    }
    
    public boolean equals(Object paramObject)
    {
      if (!(paramObject instanceof a)) {
        return false;
      }
      if (this == paramObject) {
        return true;
      }
      return c.a(((a)paramObject).a, this.a);
    }
    
    public int hashCode()
    {
      return c.a(new Object[] { this.a });
    }
  }
  
  public static final class b
    extends b
  {
    private WeakReference<ImageView> e;
    
    public b(ImageView paramImageView, int paramInt)
    {
      super(paramInt);
      n.a(paramImageView);
      this.e = new WeakReference(paramImageView);
    }
    
    public b(ImageView paramImageView, Uri paramUri)
    {
      super(0);
      n.a(paramImageView);
      this.e = new WeakReference(paramImageView);
    }
    
    private void a(ImageView paramImageView, Drawable paramDrawable, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
    {
      if ((!paramBoolean2) && (!paramBoolean3)) {}
      for (int i = 1; (i != 0) && ((paramImageView instanceof ajb)); i = 0)
      {
        int j = ((ajb)paramImageView).a();
        if ((this.c == 0) || (j != this.c)) {
          break;
        }
        return;
      }
      paramBoolean1 = a(paramBoolean1, paramBoolean2);
      if (paramBoolean1) {
        paramDrawable = a(paramImageView.getDrawable(), paramDrawable);
      }
      for (;;)
      {
        paramImageView.setImageDrawable(paramDrawable);
        ajb localajb;
        if ((paramImageView instanceof ajb))
        {
          localajb = (ajb)paramImageView;
          if (!paramBoolean3) {
            break label149;
          }
          paramImageView = this.a.a;
          label110:
          localajb.a(paramImageView);
          if (i == 0) {
            break label154;
          }
        }
        label149:
        label154:
        for (i = this.c;; i = 0)
        {
          localajb.a(i);
          if (!paramBoolean1) {
            break;
          }
          ((aja)paramDrawable).a(250);
          return;
          paramImageView = null;
          break label110;
        }
      }
    }
    
    protected void a(Drawable paramDrawable, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
    {
      ImageView localImageView = (ImageView)this.e.get();
      if (localImageView != null) {
        a(localImageView, paramDrawable, paramBoolean1, paramBoolean2, paramBoolean3);
      }
    }
    
    public boolean equals(Object paramObject)
    {
      if (!(paramObject instanceof b)) {
        return false;
      }
      if (this == paramObject) {
        return true;
      }
      Object localObject = (b)paramObject;
      paramObject = (ImageView)this.e.get();
      localObject = (ImageView)((b)localObject).e.get();
      if ((localObject != null) && (paramObject != null) && (c.a(localObject, paramObject))) {}
      for (boolean bool = true;; bool = false) {
        return bool;
      }
    }
    
    public int hashCode()
    {
      return 0;
    }
  }
  
  public static final class c
    extends b
  {
    private WeakReference<ImageManager.a> e;
    
    public c(ImageManager.a parama, Uri paramUri)
    {
      super(0);
      n.a(parama);
      this.e = new WeakReference(parama);
    }
    
    protected void a(Drawable paramDrawable, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
    {
      if (!paramBoolean2)
      {
        ImageManager.a locala = (ImageManager.a)this.e.get();
        if (locala != null) {
          locala.a(this.a.a, paramDrawable, paramBoolean3);
        }
      }
    }
    
    public boolean equals(Object paramObject)
    {
      if (!(paramObject instanceof c)) {
        return false;
      }
      if (this == paramObject) {
        return true;
      }
      paramObject = (c)paramObject;
      ImageManager.a locala1 = (ImageManager.a)this.e.get();
      ImageManager.a locala2 = (ImageManager.a)((c)paramObject).e.get();
      if ((locala2 != null) && (locala1 != null) && (c.a(locala2, locala1)) && (c.a(((c)paramObject).a, this.a))) {}
      for (boolean bool = true;; bool = false) {
        return bool;
      }
    }
    
    public int hashCode()
    {
      return c.a(new Object[] { this.a });
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/images/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */