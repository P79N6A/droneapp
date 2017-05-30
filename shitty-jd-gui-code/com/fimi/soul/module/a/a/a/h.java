package com.fimi.soul.module.a.a.a;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.widget.ImageView.ScaleType;
import com.fimi.soul.module.a.c;
import com.fimi.soul.module.a.e;
import com.mob.tools.gui.ScaledImageView;

public class h
  extends c
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  private Bitmap a;
  private ScaledImageView b;
  
  public h(e parame)
  {
    super(parame);
  }
  
  public void a(Bitmap paramBitmap)
  {
    this.a = paramBitmap;
  }
  
  public void onCreate()
  {
    this.activity.getWindow().setBackgroundDrawable(new ColorDrawable(1275068416));
    this.b = new ScaledImageView(this.activity);
    this.b.setScaleType(ImageView.ScaleType.MATRIX);
    this.activity.setContentView(this.b);
    if (this.a != null) {
      this.b.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }
  }
  
  public void onGlobalLayout()
  {
    this.b.getViewTreeObserver().removeGlobalOnLayoutListener(this);
    this.b.post(new Runnable()
    {
      public void run()
      {
        h.b(h.this).setBitmap(h.a(h.this));
      }
    });
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/a/a/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */