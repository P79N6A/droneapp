package com.fimi.soul.view.photodraweeview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.support.annotation.Nullable;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.widget.ScrollerCompat;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import com.facebook.drawee.drawable.ScalingUtils.ScaleType;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.view.DraweeView;
import java.lang.ref.WeakReference;

public class a
  implements View.OnTouchListener, c, f
{
  private static final int e = -1;
  private static final int f = 0;
  private static final int g = 1;
  private static final int h = 2;
  private g A;
  private View.OnLongClickListener B;
  private e C;
  private final float[] i = new float[9];
  private final RectF j = new RectF();
  private final Interpolator k = new AccelerateDecelerateInterpolator();
  private float l = 1.0F;
  private float m = 1.75F;
  private float n = 3.0F;
  private long o = 200L;
  private h p;
  private GestureDetectorCompat q;
  private boolean r = false;
  private boolean s = true;
  private int t = 2;
  private final Matrix u = new Matrix();
  private int v = -1;
  private int w = -1;
  private b x;
  private WeakReference<DraweeView<GenericDraweeHierarchy>> y;
  private d z;
  
  public a(DraweeView<GenericDraweeHierarchy> paramDraweeView)
  {
    this.y = new WeakReference(paramDraweeView);
    ((GenericDraweeHierarchy)paramDraweeView.getHierarchy()).setActualImageScaleType(ScalingUtils.ScaleType.FIT_CENTER);
    paramDraweeView.setOnTouchListener(this);
    this.p = new h(paramDraweeView.getContext(), this);
    this.q = new GestureDetectorCompat(paramDraweeView.getContext(), new GestureDetector.SimpleOnGestureListener()
    {
      public void onLongPress(MotionEvent paramAnonymousMotionEvent)
      {
        super.onLongPress(paramAnonymousMotionEvent);
        if (a.a(a.this) != null) {
          a.a(a.this).onLongClick(a.this.a());
        }
      }
    });
    this.q.setOnDoubleTapListener(new b(this));
  }
  
  private float a(Matrix paramMatrix, int paramInt)
  {
    paramMatrix.getValues(this.i);
    return this.i[paramInt];
  }
  
  private RectF a(Matrix paramMatrix)
  {
    DraweeView localDraweeView = a();
    if ((localDraweeView == null) || ((this.w == -1) && (this.v == -1))) {
      return null;
    }
    this.j.set(0.0F, 0.0F, this.w, this.v);
    ((GenericDraweeHierarchy)localDraweeView.getHierarchy()).getActualImageBounds(this.j);
    paramMatrix.mapRect(this.j);
    return this.j;
  }
  
  private void a(View paramView, Runnable paramRunnable)
  {
    if (Build.VERSION.SDK_INT >= 16)
    {
      paramView.postOnAnimation(paramRunnable);
      return;
    }
    paramView.postDelayed(paramRunnable, 16L);
  }
  
  private static void b(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if (paramFloat1 >= paramFloat2) {
      throw new IllegalArgumentException("MinZoom has to be less than MidZoom");
    }
    if (paramFloat2 >= paramFloat3) {
      throw new IllegalArgumentException("MidZoom has to be less than MaxZoom");
    }
  }
  
  private int h()
  {
    DraweeView localDraweeView = a();
    if (localDraweeView != null) {
      return localDraweeView.getWidth() - localDraweeView.getPaddingLeft() - localDraweeView.getPaddingRight();
    }
    return 0;
  }
  
  private int i()
  {
    DraweeView localDraweeView = a();
    if (localDraweeView != null) {
      return localDraweeView.getHeight() - localDraweeView.getPaddingTop() - localDraweeView.getPaddingBottom();
    }
    return 0;
  }
  
  private void j()
  {
    if ((this.w == -1) && (this.v == -1)) {
      return;
    }
    k();
  }
  
  private void k()
  {
    this.u.reset();
    e();
    DraweeView localDraweeView = a();
    if (localDraweeView != null) {
      localDraweeView.invalidate();
    }
  }
  
  private void l()
  {
    DraweeView localDraweeView = a();
    if (localDraweeView == null) {}
    RectF localRectF;
    do
    {
      do
      {
        return;
      } while (getScale() >= this.l);
      localRectF = c();
    } while (localRectF == null);
    localDraweeView.post(new a(getScale(), this.l, localRectF.centerX(), localRectF.centerY()));
  }
  
  private void m()
  {
    if (this.x != null)
    {
      this.x.a();
      this.x = null;
    }
  }
  
  @Nullable
  public DraweeView<GenericDraweeHierarchy> a()
  {
    return (DraweeView)this.y.get();
  }
  
  public void a(float paramFloat1, float paramFloat2)
  {
    Object localObject = a();
    if ((localObject != null) && (!this.p.a()))
    {
      this.u.postTranslate(paramFloat1, paramFloat2);
      d();
      localObject = ((DraweeView)localObject).getParent();
      if (localObject != null) {
        break label43;
      }
    }
    label43:
    do
    {
      return;
      if ((!this.s) || (this.p.a()) || (this.r)) {
        break;
      }
    } while ((this.t != 2) && ((this.t != 0) || (paramFloat1 < 1.0F)) && ((this.t != 1) || (paramFloat1 > -1.0F)));
    ((ViewParent)localObject).requestDisallowInterceptTouchEvent(false);
    return;
    ((ViewParent)localObject).requestDisallowInterceptTouchEvent(true);
  }
  
  public void a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if ((getScale() < this.n) || (paramFloat1 < 1.0F))
    {
      if (this.C != null) {
        this.C.a(paramFloat1, paramFloat2, paramFloat3);
      }
      this.u.postScale(paramFloat1, paramFloat1, paramFloat2, paramFloat3);
      d();
    }
  }
  
  public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    DraweeView localDraweeView = a();
    if (localDraweeView == null) {
      return;
    }
    this.x = new b(localDraweeView.getContext());
    this.x.a(h(), i(), (int)paramFloat3, (int)paramFloat4);
    localDraweeView.post(this.x);
  }
  
  public void a(float paramFloat1, float paramFloat2, float paramFloat3, boolean paramBoolean)
  {
    DraweeView localDraweeView = a();
    if ((localDraweeView == null) || (paramFloat1 < this.l) || (paramFloat1 > this.n)) {
      return;
    }
    if (paramBoolean)
    {
      localDraweeView.post(new a(getScale(), paramFloat1, paramFloat2, paramFloat3));
      return;
    }
    this.u.setScale(paramFloat1, paramFloat1, paramFloat2, paramFloat3);
    d();
  }
  
  public void a(float paramFloat, boolean paramBoolean)
  {
    DraweeView localDraweeView = a();
    if (localDraweeView != null) {
      a(paramFloat, localDraweeView.getRight() / 2, localDraweeView.getBottom() / 2, false);
    }
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    this.w = paramInt1;
    this.v = paramInt2;
    j();
  }
  
  public Matrix b()
  {
    return this.u;
  }
  
  public RectF c()
  {
    e();
    return a(b());
  }
  
  public void d()
  {
    DraweeView localDraweeView = a();
    if (localDraweeView == null) {}
    while (!e()) {
      return;
    }
    localDraweeView.invalidate();
  }
  
  public boolean e()
  {
    float f2 = 0.0F;
    RectF localRectF = a(b());
    if (localRectF == null) {
      return false;
    }
    float f1 = localRectF.height();
    float f3 = localRectF.width();
    int i1 = i();
    if (f1 <= i1) {
      f1 = (i1 - f1) / 2.0F - localRectF.top;
    }
    for (;;)
    {
      i1 = h();
      if (f3 <= i1)
      {
        f2 = (i1 - f3) / 2.0F - localRectF.left;
        this.t = 2;
      }
      for (;;)
      {
        this.u.postTranslate(f2, f1);
        return true;
        if (localRectF.top > 0.0F)
        {
          f1 = -localRectF.top;
          break;
        }
        if (localRectF.bottom >= i1) {
          break label212;
        }
        f1 = i1 - localRectF.bottom;
        break;
        if (localRectF.left > 0.0F)
        {
          f2 = -localRectF.left;
          this.t = 0;
        }
        else if (localRectF.right < i1)
        {
          f2 = i1 - localRectF.right;
          this.t = 1;
        }
        else
        {
          this.t = -1;
        }
      }
      label212:
      f1 = 0.0F;
    }
  }
  
  public void f()
  {
    l();
  }
  
  protected void g()
  {
    m();
  }
  
  public float getMaximumScale()
  {
    return this.n;
  }
  
  public float getMediumScale()
  {
    return this.m;
  }
  
  public float getMinimumScale()
  {
    return this.l;
  }
  
  public d getOnPhotoTapListener()
  {
    return this.z;
  }
  
  public g getOnViewTapListener()
  {
    return this.A;
  }
  
  public float getScale()
  {
    return (float)Math.sqrt((float)Math.pow(a(this.u, 0), 2.0D) + (float)Math.pow(a(this.u, 3), 2.0D));
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool2 = false;
    boolean bool1;
    boolean bool3;
    int i1;
    switch (MotionEventCompat.getActionMasked(paramMotionEvent))
    {
    case 2: 
    default: 
      bool1 = this.p.a();
      boolean bool4 = this.p.b();
      bool3 = this.p.a(paramMotionEvent);
      if ((!bool1) && (!this.p.a()))
      {
        i1 = 1;
        label81:
        if ((bool4) || (this.p.b())) {
          break label185;
        }
      }
      break;
    }
    label185:
    for (int i2 = 1;; i2 = 0)
    {
      bool1 = bool2;
      if (i1 != 0)
      {
        bool1 = bool2;
        if (i2 != 0) {
          bool1 = true;
        }
      }
      this.r = bool1;
      if (!this.q.onTouchEvent(paramMotionEvent)) {
        break label191;
      }
      return true;
      paramView = paramView.getParent();
      if (paramView != null) {
        paramView.requestDisallowInterceptTouchEvent(true);
      }
      m();
      break;
      paramView = paramView.getParent();
      if (paramView == null) {
        break;
      }
      paramView.requestDisallowInterceptTouchEvent(false);
      break;
      i1 = 0;
      break label81;
    }
    label191:
    return bool3;
  }
  
  public void setAllowParentInterceptOnEdge(boolean paramBoolean)
  {
    this.s = paramBoolean;
  }
  
  public void setMaximumScale(float paramFloat)
  {
    b(this.l, this.m, paramFloat);
    this.n = paramFloat;
  }
  
  public void setMediumScale(float paramFloat)
  {
    b(this.l, paramFloat, this.n);
    this.m = paramFloat;
  }
  
  public void setMinimumScale(float paramFloat)
  {
    b(paramFloat, this.m, this.n);
    this.l = paramFloat;
  }
  
  public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener paramOnDoubleTapListener)
  {
    if (paramOnDoubleTapListener != null)
    {
      this.q.setOnDoubleTapListener(paramOnDoubleTapListener);
      return;
    }
    this.q.setOnDoubleTapListener(new b(this));
  }
  
  public void setOnLongClickListener(View.OnLongClickListener paramOnLongClickListener)
  {
    this.B = paramOnLongClickListener;
  }
  
  public void setOnPhotoTapListener(d paramd)
  {
    this.z = paramd;
  }
  
  public void setOnScaleChangeListener(e parame)
  {
    this.C = parame;
  }
  
  public void setOnViewTapListener(g paramg)
  {
    this.A = paramg;
  }
  
  public void setScale(float paramFloat)
  {
    a(paramFloat, false);
  }
  
  public void setZoomTransitionDuration(long paramLong)
  {
    long l1 = paramLong;
    if (paramLong < 0L) {
      l1 = 200L;
    }
    this.o = l1;
  }
  
  private class a
    implements Runnable
  {
    private final float b;
    private final float c;
    private final long d;
    private final float e;
    private final float f;
    
    public a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
    {
      this.b = paramFloat3;
      this.c = paramFloat4;
      this.d = System.currentTimeMillis();
      this.e = paramFloat1;
      this.f = paramFloat2;
    }
    
    private float a()
    {
      float f1 = Math.min(1.0F, (float)(System.currentTimeMillis() - this.d) * 1.0F / (float)a.b(a.this));
      return a.c(a.this).getInterpolation(f1);
    }
    
    public void run()
    {
      DraweeView localDraweeView = a.this.a();
      if (localDraweeView == null) {}
      float f1;
      do
      {
        return;
        f1 = a();
        float f2 = (this.e + (this.f - this.e) * f1) / a.this.getScale();
        a.this.a(f2, this.b, this.c);
      } while (f1 >= 1.0F);
      a.a(a.this, localDraweeView, this);
    }
  }
  
  private class b
    implements Runnable
  {
    private final ScrollerCompat b;
    private int c;
    private int d;
    
    public b(Context paramContext)
    {
      this.b = ScrollerCompat.create(paramContext);
    }
    
    public void a()
    {
      this.b.abortAnimation();
    }
    
    public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      RectF localRectF = a.this.c();
      if (localRectF == null) {
        return;
      }
      int i = Math.round(-localRectF.left);
      int j;
      label52:
      int k;
      int m;
      if (paramInt1 < localRectF.width())
      {
        j = Math.round(localRectF.width() - paramInt1);
        paramInt1 = 0;
        k = Math.round(-localRectF.top);
        if (paramInt2 >= localRectF.height()) {
          break label148;
        }
        m = Math.round(localRectF.height() - paramInt2);
      }
      for (paramInt2 = 0;; paramInt2 = k)
      {
        this.c = i;
        this.d = k;
        if ((i == j) && (k == m)) {
          break;
        }
        this.b.fling(i, k, paramInt3, paramInt4, paramInt1, j, paramInt2, m, 0, 0);
        return;
        j = i;
        paramInt1 = i;
        break label52;
        label148:
        m = k;
      }
    }
    
    public void run()
    {
      if (this.b.isFinished()) {}
      DraweeView localDraweeView;
      do
      {
        return;
        localDraweeView = a.this.a();
      } while ((localDraweeView == null) || (!this.b.computeScrollOffset()));
      int i = this.b.getCurrX();
      int j = this.b.getCurrY();
      a.d(a.this).postTranslate(this.c - i, this.d - j);
      localDraweeView.invalidate();
      this.c = i;
      this.d = j;
      a.a(a.this, localDraweeView, this);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/photodraweeview/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */