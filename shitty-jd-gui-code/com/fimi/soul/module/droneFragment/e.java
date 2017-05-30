package com.fimi.soul.module.droneFragment;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.google.android.gms.maps.model.g;

public abstract class e
  implements View.OnTouchListener
{
  private final View a;
  private final Drawable b;
  private final Drawable c;
  private final Handler d = new Handler();
  private g e;
  private boolean f = false;
  private final Runnable g = new Runnable()
  {
    public void run()
    {
      if (e.a(e.this)) {
        e.this.a(e.b(e.this), e.c(e.this));
      }
    }
  };
  
  public e(View paramView, Drawable paramDrawable1, Drawable paramDrawable2)
  {
    this.a = paramView;
    this.b = paramDrawable1;
    this.c = paramDrawable2;
  }
  
  private void a()
  {
    if (!this.f)
    {
      this.f = true;
      this.d.removeCallbacks(this.g);
      this.a.setBackgroundDrawable(this.c);
      if (this.e != null) {
        this.e.h();
      }
    }
  }
  
  private boolean b()
  {
    boolean bool = false;
    if (this.f)
    {
      this.f = false;
      this.d.removeCallbacks(this.g);
      this.a.setBackgroundDrawable(this.b);
      if (this.e != null) {
        this.e.h();
      }
      bool = true;
    }
    return bool;
  }
  
  protected abstract void a(View paramView, g paramg);
  
  public void a(g paramg)
  {
    this.e = paramg;
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if ((0.0F <= paramMotionEvent.getX()) && (paramMotionEvent.getX() <= this.a.getWidth()) && (0.0F <= paramMotionEvent.getY()) && (paramMotionEvent.getY() <= this.a.getHeight())) {
      switch (paramMotionEvent.getActionMasked())
      {
      }
    }
    for (;;)
    {
      return false;
      a();
      continue;
      this.d.postDelayed(this.g, 150L);
      continue;
      b();
      continue;
      b();
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/droneFragment/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */