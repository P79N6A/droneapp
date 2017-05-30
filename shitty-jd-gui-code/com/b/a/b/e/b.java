package com.b.a.b.e;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.b.a.b.a.h;
import java.lang.ref.Reference;
import java.lang.reflect.Field;

public class b
  extends d
{
  public b(ImageView paramImageView)
  {
    super(paramImageView);
  }
  
  public b(ImageView paramImageView, boolean paramBoolean)
  {
    super(paramImageView, paramBoolean);
  }
  
  private static int a(Object paramObject, String paramString)
  {
    try
    {
      paramString = ImageView.class.getDeclaredField(paramString);
      paramString.setAccessible(true);
      int i = ((Integer)paramString.get(paramObject)).intValue();
      if ((i > 0) && (i < Integer.MAX_VALUE)) {
        return i;
      }
    }
    catch (Exception paramObject)
    {
      com.b.a.c.d.a((Throwable)paramObject);
    }
    return 0;
  }
  
  public int a()
  {
    int i = super.a();
    if (i <= 0)
    {
      ImageView localImageView = (ImageView)this.c.get();
      if (localImageView != null) {
        return a(localImageView, "mMaxWidth");
      }
    }
    return i;
  }
  
  protected void a(Bitmap paramBitmap, View paramView)
  {
    ((ImageView)paramView).setImageBitmap(paramBitmap);
  }
  
  protected void a(Drawable paramDrawable, View paramView)
  {
    ((ImageView)paramView).setImageDrawable(paramDrawable);
    if ((paramDrawable instanceof AnimationDrawable)) {
      ((AnimationDrawable)paramDrawable).start();
    }
  }
  
  public int b()
  {
    int i = super.b();
    if (i <= 0)
    {
      ImageView localImageView = (ImageView)this.c.get();
      if (localImageView != null) {
        return a(localImageView, "mMaxHeight");
      }
    }
    return i;
  }
  
  public h c()
  {
    ImageView localImageView = (ImageView)this.c.get();
    if (localImageView != null) {
      return h.a(localImageView);
    }
    return super.c();
  }
  
  public ImageView g()
  {
    return (ImageView)super.d();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/b/a/b/e/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */