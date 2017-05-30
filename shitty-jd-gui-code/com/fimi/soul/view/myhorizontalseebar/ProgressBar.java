package com.fimi.soul.view.myhorizontalseebar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.ViewDebug.ExportedProperty;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import com.fimi.overseas.soul.R.styleable;
import java.util.ArrayList;

public class ProgressBar
  extends View
{
  private static final int a = 10000;
  private static final int b = 200;
  private boolean A;
  private Interpolator B;
  private c C;
  private long D = Thread.currentThread().getId();
  private boolean E;
  private boolean F;
  private boolean G;
  private boolean H;
  private final ArrayList<b> I = new ArrayList();
  private a J;
  int c;
  int d;
  int e;
  int f;
  Bitmap g;
  protected int h;
  protected int i;
  protected int j;
  protected int k;
  protected int l;
  protected int m;
  private int n;
  private int o;
  private int p;
  private int q;
  private int r;
  private boolean s;
  private boolean t;
  private Transformation u;
  private AlphaAnimation v;
  private boolean w;
  private Drawable x;
  private Drawable y;
  private Drawable z;
  
  public ProgressBar(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ProgressBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16842871);
  }
  
  public ProgressBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet, paramInt, 0);
  }
  
  public ProgressBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1);
    a();
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.ProgressBar, paramInt1, paramInt2);
    this.A = true;
    paramAttributeSet = paramContext.getDrawable(6);
    if (paramAttributeSet != null) {
      setProgressDrawable(a(paramAttributeSet, false));
    }
    this.r = paramContext.getInt(7, this.r);
    this.c = paramContext.getDimensionPixelSize(4, this.c);
    this.d = paramContext.getDimensionPixelSize(0, this.d);
    this.e = paramContext.getDimensionPixelSize(5, this.e);
    this.f = paramContext.getDimensionPixelSize(1, this.f);
    this.q = paramContext.getInt(8, this.q);
    setMax(paramContext.getInt(2, this.p));
    setProgress(paramContext.getInt(3, this.n));
    setSecondaryProgress(paramContext.getInt(9, this.o));
    paramAttributeSet = paramContext.getDrawable(10);
    if (paramAttributeSet != null) {
      setIndeterminateDrawable(a(paramAttributeSet));
    }
    this.t = paramContext.getBoolean(11, this.t);
    this.A = false;
    if ((this.t) || (paramContext.getBoolean(12, this.s))) {
      bool = true;
    }
    setIndeterminate(bool);
    paramContext.recycle();
  }
  
  private Drawable a(Drawable paramDrawable)
  {
    Object localObject = paramDrawable;
    if ((paramDrawable instanceof AnimationDrawable))
    {
      paramDrawable = (AnimationDrawable)paramDrawable;
      int i2 = paramDrawable.getNumberOfFrames();
      localObject = new AnimationDrawable();
      ((AnimationDrawable)localObject).setOneShot(paramDrawable.isOneShot());
      int i1 = 0;
      while (i1 < i2)
      {
        Drawable localDrawable = a(paramDrawable.getFrame(i1), true);
        localDrawable.setLevel(10000);
        ((AnimationDrawable)localObject).addFrame(localDrawable, paramDrawable.getDuration(i1));
        i1 += 1;
      }
      ((AnimationDrawable)localObject).setLevel(10000);
    }
    return (Drawable)localObject;
  }
  
  private Drawable a(Drawable paramDrawable, boolean paramBoolean)
  {
    int i2 = 0;
    Object localObject;
    if ((paramDrawable instanceof LayerDrawable))
    {
      LayerDrawable localLayerDrawable = (LayerDrawable)paramDrawable;
      int i3 = localLayerDrawable.getNumberOfLayers();
      paramDrawable = new Drawable[i3];
      int i1 = 0;
      if (i1 < i3)
      {
        int i4 = localLayerDrawable.getId(i1);
        localObject = localLayerDrawable.getDrawable(i1);
        if ((i4 == 16908301) || (i4 == 16908303)) {}
        for (paramBoolean = true;; paramBoolean = false)
        {
          paramDrawable[i1] = a((Drawable)localObject, paramBoolean);
          i1 += 1;
          break;
        }
      }
      localObject = new LayerDrawable(paramDrawable);
      i1 = i2;
      for (;;)
      {
        paramDrawable = (Drawable)localObject;
        if (i1 >= i3) {
          break;
        }
        ((LayerDrawable)localObject).setId(i1, localLayerDrawable.getId(i1));
        i1 += 1;
      }
    }
    if ((paramDrawable instanceof StateListDrawable))
    {
      paramDrawable = (StateListDrawable)paramDrawable;
      paramDrawable = new StateListDrawable();
      return paramDrawable;
    }
    if ((paramDrawable instanceof BitmapDrawable))
    {
      localObject = ((BitmapDrawable)paramDrawable).getBitmap();
      if (this.g == null) {
        this.g = ((Bitmap)localObject);
      }
      paramDrawable = new ShapeDrawable(getDrawableShape());
      localObject = new BitmapShader((Bitmap)localObject, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP);
      paramDrawable.getPaint().setShader((Shader)localObject);
      if (paramBoolean) {
        return new ClipDrawable(paramDrawable, 3, 1);
      }
      return paramDrawable;
    }
    return paramDrawable;
  }
  
  private void a()
  {
    this.p = 100;
    this.n = 0;
    this.o = 0;
    this.s = false;
    this.t = false;
    this.r = 4000;
    this.q = 1;
    this.c = 24;
    this.d = 48;
    this.e = 24;
    this.f = 48;
  }
  
  private void a(int paramInt1, int paramInt2)
  {
    int i1 = paramInt1 - (this.k + this.j);
    paramInt1 = paramInt2 - (this.l + this.m);
    int i2;
    float f1;
    float f2;
    if (this.x != null) {
      if ((this.t) && (!(this.x instanceof AnimationDrawable)))
      {
        paramInt2 = this.x.getIntrinsicWidth();
        i2 = this.x.getIntrinsicHeight();
        f1 = paramInt2 / i2;
        f2 = i1 / paramInt1;
        if (f1 != f2) {
          if (f2 > f1)
          {
            paramInt2 = (int)(f1 * paramInt1);
            i1 = (i1 - paramInt2) / 2;
            paramInt2 = i1 + paramInt2;
            i2 = 0;
            this.x.setBounds(i1, i2, paramInt2, paramInt1);
          }
        }
      }
    }
    for (;;)
    {
      if (this.y != null) {
        this.y.setBounds(0, 0, paramInt2, paramInt1);
      }
      return;
      f2 = i1;
      int i3 = (int)(1.0F / f1 * f2);
      i2 = (paramInt1 - i3) / 2;
      paramInt2 = i1;
      paramInt1 = i2 + i3;
      i1 = 0;
      break;
      i2 = 0;
      paramInt2 = i1;
      i3 = 0;
      i1 = i2;
      i2 = i3;
      break;
      paramInt2 = i1;
    }
  }
  
  /* Error */
  private void a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 100	com/fimi/soul/view/myhorizontalseebar/ProgressBar:D	J
    //   6: invokestatic 94	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   9: invokevirtual 98	java/lang/Thread:getId	()J
    //   12: lcmp
    //   13: ifne +14 -> 27
    //   16: aload_0
    //   17: iload_1
    //   18: iload_2
    //   19: iload_3
    //   20: iconst_1
    //   21: invokespecial 310	com/fimi/soul/view/myhorizontalseebar/ProgressBar:a	(IIZZ)V
    //   24: aload_0
    //   25: monitorexit
    //   26: return
    //   27: aload_0
    //   28: getfield 312	com/fimi/soul/view/myhorizontalseebar/ProgressBar:C	Lcom/fimi/soul/view/myhorizontalseebar/ProgressBar$c;
    //   31: ifnonnull +16 -> 47
    //   34: aload_0
    //   35: new 21	com/fimi/soul/view/myhorizontalseebar/ProgressBar$c
    //   38: dup
    //   39: aload_0
    //   40: aconst_null
    //   41: invokespecial 315	com/fimi/soul/view/myhorizontalseebar/ProgressBar$c:<init>	(Lcom/fimi/soul/view/myhorizontalseebar/ProgressBar;Lcom/fimi/soul/view/myhorizontalseebar/ProgressBar$1;)V
    //   44: putfield 312	com/fimi/soul/view/myhorizontalseebar/ProgressBar:C	Lcom/fimi/soul/view/myhorizontalseebar/ProgressBar$c;
    //   47: iload_1
    //   48: iload_2
    //   49: iload_3
    //   50: invokestatic 318	com/fimi/soul/view/myhorizontalseebar/ProgressBar$b:a	(IIZ)Lcom/fimi/soul/view/myhorizontalseebar/ProgressBar$b;
    //   53: astore 4
    //   55: aload_0
    //   56: getfield 88	com/fimi/soul/view/myhorizontalseebar/ProgressBar:I	Ljava/util/ArrayList;
    //   59: aload 4
    //   61: invokevirtual 322	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   64: pop
    //   65: aload_0
    //   66: getfield 324	com/fimi/soul/view/myhorizontalseebar/ProgressBar:G	Z
    //   69: ifeq -45 -> 24
    //   72: aload_0
    //   73: getfield 326	com/fimi/soul/view/myhorizontalseebar/ProgressBar:H	Z
    //   76: ifne -52 -> 24
    //   79: aload_0
    //   80: aload_0
    //   81: getfield 312	com/fimi/soul/view/myhorizontalseebar/ProgressBar:C	Lcom/fimi/soul/view/myhorizontalseebar/ProgressBar$c;
    //   84: invokevirtual 330	com/fimi/soul/view/myhorizontalseebar/ProgressBar:post	(Ljava/lang/Runnable;)Z
    //   87: pop
    //   88: aload_0
    //   89: iconst_1
    //   90: putfield 326	com/fimi/soul/view/myhorizontalseebar/ProgressBar:H	Z
    //   93: goto -69 -> 24
    //   96: astore 4
    //   98: aload_0
    //   99: monitorexit
    //   100: aload 4
    //   102: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	103	0	this	ProgressBar
    //   0	103	1	paramInt1	int
    //   0	103	2	paramInt2	int
    //   0	103	3	paramBoolean	boolean
    //   53	7	4	localb	b
    //   96	5	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	24	96	finally
    //   27	47	96	finally
    //   47	93	96	finally
  }
  
  private void a(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    for (;;)
    {
      Object localObject2;
      try
      {
        float f1;
        if (this.p > 0)
        {
          f1 = paramInt2 / this.p;
          localObject2 = this.z;
          if (localObject2 != null)
          {
            Drawable localDrawable = null;
            if (!(localObject2 instanceof LayerDrawable)) {
              break label103;
            }
            localDrawable = ((LayerDrawable)localObject2).findDrawableByLayerId(paramInt1);
            break label103;
            ((Drawable)localObject2).setLevel(paramInt2);
            if ((paramBoolean2) && (paramInt1 == 16908301)) {
              a(f1, paramBoolean1);
            }
          }
        }
        else
        {
          f1 = 0.0F;
          continue;
        }
        invalidate();
        continue;
        paramInt2 = (int)(10000.0F * f1);
      }
      finally {}
      label103:
      if (localObject1 != null) {
        localObject2 = localObject1;
      }
    }
  }
  
  private void b()
  {
    int[] arrayOfInt = getDrawableState();
    if ((this.y != null) && (this.y.isStateful())) {
      this.y.setState(arrayOfInt);
    }
    if ((this.x != null) && (this.x.isStateful())) {
      this.x.setState(arrayOfInt);
    }
  }
  
  private void c()
  {
    if (this.J == null) {
      this.J = new a(null);
    }
    for (;;)
    {
      postDelayed(this.J, 200L);
      return;
      removeCallbacks(this.J);
    }
  }
  
  void a(float paramFloat, boolean paramBoolean) {}
  
  public void a(int paramInt)
  {
    Drawable localDrawable = this.z;
  }
  
  void a(int paramInt, boolean paramBoolean)
  {
    try
    {
      boolean bool = this.s;
      if (bool) {
        return;
      }
      if (paramInt < 0) {
        paramInt = 0;
      }
      for (;;)
      {
        int i1 = paramInt;
        if (paramInt > this.p) {
          i1 = this.p;
        }
        if (i1 == this.n) {
          break;
        }
        this.n = i1;
        a(16908301, this.n, paramBoolean);
        break;
      }
    }
    finally {}
  }
  
  public void a(Context paramContext, int paramInt)
  {
    setInterpolator(AnimationUtils.loadInterpolator(paramContext, paramInt));
  }
  
  public final void b(int paramInt)
  {
    try
    {
      setProgress(this.n + paramInt);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void c(int paramInt)
  {
    try
    {
      setSecondaryProgress(this.o + paramInt);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  @ViewDebug.ExportedProperty(category="progress")
  public boolean d()
  {
    try
    {
      boolean bool = this.s;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    b();
  }
  
  void e()
  {
    if (getVisibility() != 0) {
      return;
    }
    if ((this.x instanceof Animatable))
    {
      this.E = true;
      this.w = false;
      postInvalidate();
      return;
    }
    this.w = true;
    if (this.B == null) {
      this.B = new LinearInterpolator();
    }
    if (this.u == null)
    {
      this.u = new Transformation();
      label74:
      if (this.v != null) {
        break label159;
      }
      this.v = new AlphaAnimation(0.0F, 1.0F);
    }
    for (;;)
    {
      this.v.setRepeatMode(this.q);
      this.v.setRepeatCount(-1);
      this.v.setDuration(this.r);
      this.v.setInterpolator(this.B);
      this.v.setStartTime(-1L);
      break;
      this.u.clear();
      break label74;
      label159:
      this.v.reset();
    }
  }
  
  void f()
  {
    this.w = false;
    if ((this.x instanceof Animatable))
    {
      ((Animatable)this.x).stop();
      this.E = false;
    }
    postInvalidate();
  }
  
  Drawable getCurrentDrawable()
  {
    return this.z;
  }
  
  Shape getDrawableShape()
  {
    return new RoundRectShape(new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F }, null, null);
  }
  
  public Drawable getIndeterminateDrawable()
  {
    return this.x;
  }
  
  public Interpolator getInterpolator()
  {
    return this.B;
  }
  
  @ViewDebug.ExportedProperty(category="progress")
  public int getMax()
  {
    try
    {
      int i1 = this.p;
      return i1;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  @ViewDebug.ExportedProperty(category="progress")
  public int getProgress()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 178	com/fimi/soul/view/myhorizontalseebar/ProgressBar:s	Z
    //   6: istore_2
    //   7: iload_2
    //   8: ifeq +9 -> 17
    //   11: iconst_0
    //   12: istore_1
    //   13: aload_0
    //   14: monitorexit
    //   15: iload_1
    //   16: ireturn
    //   17: aload_0
    //   18: getfield 156	com/fimi/soul/view/myhorizontalseebar/ProgressBar:n	I
    //   21: istore_1
    //   22: goto -9 -> 13
    //   25: astore_3
    //   26: aload_0
    //   27: monitorexit
    //   28: aload_3
    //   29: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	30	0	this	ProgressBar
    //   12	10	1	i1	int
    //   6	2	2	bool	boolean
    //   25	4	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	7	25	finally
    //   17	22	25	finally
  }
  
  public Drawable getProgressDrawable()
  {
    return this.y;
  }
  
  /* Error */
  @ViewDebug.ExportedProperty(category="progress")
  public int getSecondaryProgress()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 178	com/fimi/soul/view/myhorizontalseebar/ProgressBar:s	Z
    //   6: istore_2
    //   7: iload_2
    //   8: ifeq +9 -> 17
    //   11: iconst_0
    //   12: istore_1
    //   13: aload_0
    //   14: monitorexit
    //   15: iload_1
    //   16: ireturn
    //   17: aload_0
    //   18: getfield 161	com/fimi/soul/view/myhorizontalseebar/ProgressBar:o	I
    //   21: istore_1
    //   22: goto -9 -> 13
    //   25: astore_3
    //   26: aload_0
    //   27: monitorexit
    //   28: aload_3
    //   29: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	30	0	this	ProgressBar
    //   12	10	1	i1	int
    //   6	2	2	bool	boolean
    //   25	4	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	7	25	finally
    //   17	22	25	finally
  }
  
  public void invalidateDrawable(Drawable paramDrawable)
  {
    if (!this.F)
    {
      if (verifyDrawable(paramDrawable))
      {
        paramDrawable = paramDrawable.getBounds();
        int i1 = this.h + this.j;
        int i2 = this.i + this.l;
        invalidate(paramDrawable.left + i1, paramDrawable.top + i2, i1 + paramDrawable.right, paramDrawable.bottom + i2);
      }
    }
    else {
      return;
    }
    super.invalidateDrawable(paramDrawable);
  }
  
  public void jumpDrawablesToCurrentState()
  {
    super.jumpDrawablesToCurrentState();
    if (this.y != null) {
      this.y.jumpToCurrentState();
    }
    if (this.x != null) {
      this.x.jumpToCurrentState();
    }
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.s) {
      e();
    }
    if (this.I != null) {}
    try
    {
      int i2 = this.I.size();
      int i1 = 0;
      while (i1 < i2)
      {
        b localb = (b)this.I.get(i1);
        a(localb.a, localb.b, localb.c, true);
        localb.c();
        i1 += 1;
      }
      this.I.clear();
      this.G = true;
      return;
    }
    finally {}
  }
  
  protected void onDetachedFromWindow()
  {
    if (this.s) {
      f();
    }
    if (this.C != null) {
      removeCallbacks(this.C);
    }
    if ((this.C != null) && (this.H)) {
      removeCallbacks(this.C);
    }
    if (this.J != null) {
      removeCallbacks(this.J);
    }
    super.onDetachedFromWindow();
    this.G = false;
  }
  
  /* Error */
  protected void onDraw(android.graphics.Canvas paramCanvas)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: invokespecial 528	android/view/View:onDraw	(Landroid/graphics/Canvas;)V
    //   7: aload_0
    //   8: getfield 332	com/fimi/soul/view/myhorizontalseebar/ProgressBar:z	Landroid/graphics/drawable/Drawable;
    //   11: astore 5
    //   13: aload 5
    //   15: ifnull +121 -> 136
    //   18: aload_1
    //   19: invokevirtual 533	android/graphics/Canvas:save	()I
    //   22: pop
    //   23: aload_1
    //   24: aload_0
    //   25: getfield 288	com/fimi/soul/view/myhorizontalseebar/ProgressBar:j	I
    //   28: i2f
    //   29: aload_0
    //   30: getfield 290	com/fimi/soul/view/myhorizontalseebar/ProgressBar:l	I
    //   33: i2f
    //   34: invokevirtual 536	android/graphics/Canvas:translate	(FF)V
    //   37: aload_0
    //   38: invokevirtual 539	com/fimi/soul/view/myhorizontalseebar/ProgressBar:getDrawingTime	()J
    //   41: lstore_3
    //   42: aload_0
    //   43: getfield 399	com/fimi/soul/view/myhorizontalseebar/ProgressBar:w	Z
    //   46: ifeq +50 -> 96
    //   49: aload_0
    //   50: getfield 414	com/fimi/soul/view/myhorizontalseebar/ProgressBar:v	Landroid/view/animation/AlphaAnimation;
    //   53: lload_3
    //   54: aload_0
    //   55: getfield 409	com/fimi/soul/view/myhorizontalseebar/ProgressBar:u	Landroid/view/animation/Transformation;
    //   58: invokevirtual 543	android/view/animation/AlphaAnimation:getTransformation	(JLandroid/view/animation/Transformation;)Z
    //   61: pop
    //   62: aload_0
    //   63: getfield 409	com/fimi/soul/view/myhorizontalseebar/ProgressBar:u	Landroid/view/animation/Transformation;
    //   66: invokevirtual 547	android/view/animation/Transformation:getAlpha	()F
    //   69: fstore_2
    //   70: aload_0
    //   71: iconst_1
    //   72: putfield 462	com/fimi/soul/view/myhorizontalseebar/ProgressBar:F	Z
    //   75: aload 5
    //   77: fload_2
    //   78: ldc_w 342
    //   81: fmul
    //   82: f2i
    //   83: invokevirtual 208	android/graphics/drawable/Drawable:setLevel	(I)Z
    //   86: pop
    //   87: aload_0
    //   88: iconst_0
    //   89: putfield 462	com/fimi/soul/view/myhorizontalseebar/ProgressBar:F	Z
    //   92: aload_0
    //   93: invokevirtual 550	com/fimi/soul/view/myhorizontalseebar/ProgressBar:postInvalidateOnAnimation	()V
    //   96: aload 5
    //   98: aload_1
    //   99: invokevirtual 553	android/graphics/drawable/Drawable:draw	(Landroid/graphics/Canvas;)V
    //   102: aload_1
    //   103: invokevirtual 556	android/graphics/Canvas:restore	()V
    //   106: aload_0
    //   107: getfield 397	com/fimi/soul/view/myhorizontalseebar/ProgressBar:E	Z
    //   110: ifeq +26 -> 136
    //   113: aload 5
    //   115: instanceof 395
    //   118: ifeq +18 -> 136
    //   121: aload 5
    //   123: checkcast 395	android/graphics/drawable/Animatable
    //   126: invokeinterface 559 1 0
    //   131: aload_0
    //   132: iconst_0
    //   133: putfield 397	com/fimi/soul/view/myhorizontalseebar/ProgressBar:E	Z
    //   136: aload_0
    //   137: monitorexit
    //   138: return
    //   139: astore_1
    //   140: aload_0
    //   141: iconst_0
    //   142: putfield 462	com/fimi/soul/view/myhorizontalseebar/ProgressBar:F	Z
    //   145: aload_1
    //   146: athrow
    //   147: astore_1
    //   148: aload_0
    //   149: monitorexit
    //   150: aload_1
    //   151: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	152	0	this	ProgressBar
    //   0	152	1	paramCanvas	android.graphics.Canvas
    //   69	9	2	f1	float
    //   41	13	3	l1	long
    //   11	111	5	localDrawable	Drawable
    // Exception table:
    //   from	to	target	type
    //   70	87	139	finally
    //   2	13	147	finally
    //   18	70	147	finally
    //   87	96	147	finally
    //   96	136	147	finally
    //   140	147	147	finally
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(ProgressBar.class.getName());
    paramAccessibilityEvent.setItemCount(this.p);
    paramAccessibilityEvent.setCurrentItemIndex(this.n);
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setClassName(ProgressBar.class.getName());
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = 0;
    for (;;)
    {
      try
      {
        Drawable localDrawable = this.z;
        if (localDrawable != null)
        {
          i2 = Math.max(this.c, Math.min(this.d, localDrawable.getIntrinsicWidth()));
          i1 = Math.max(this.e, Math.min(this.f, localDrawable.getIntrinsicHeight()));
          b();
          int i3 = this.j;
          int i4 = this.k;
          int i5 = this.l;
          int i6 = this.m;
          setMeasuredDimension(resolveSizeAndState(i2 + (i3 + i4), paramInt1, 0), resolveSizeAndState(i1 + (i5 + i6), paramInt2, 0));
          return;
        }
      }
      finally {}
      int i2 = 0;
    }
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    paramParcelable = (SavedState)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    setProgress(paramParcelable.a);
    setSecondaryProgress(paramParcelable.b);
  }
  
  public Parcelable onSaveInstanceState()
  {
    SavedState localSavedState = new SavedState(super.onSaveInstanceState());
    localSavedState.a = this.n;
    localSavedState.b = this.o;
    return localSavedState;
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a(paramInt1, paramInt2);
  }
  
  protected void onVisibilityChanged(View paramView, int paramInt)
  {
    super.onVisibilityChanged(paramView, paramInt);
    if (this.s)
    {
      if ((paramInt == 8) || (paramInt == 4)) {
        f();
      }
    }
    else {
      return;
    }
    e();
  }
  
  public void postInvalidate()
  {
    if (!this.A) {
      super.postInvalidate();
    }
  }
  
  /* Error */
  public void setIndeterminate(boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 172	com/fimi/soul/view/myhorizontalseebar/ProgressBar:t	Z
    //   6: ifeq +10 -> 16
    //   9: aload_0
    //   10: getfield 178	com/fimi/soul/view/myhorizontalseebar/ProgressBar:s	Z
    //   13: ifne +32 -> 45
    //   16: iload_1
    //   17: aload_0
    //   18: getfield 178	com/fimi/soul/view/myhorizontalseebar/ProgressBar:s	Z
    //   21: if_icmpeq +24 -> 45
    //   24: aload_0
    //   25: iload_1
    //   26: putfield 178	com/fimi/soul/view/myhorizontalseebar/ProgressBar:s	Z
    //   29: iload_1
    //   30: ifeq +18 -> 48
    //   33: aload_0
    //   34: aload_0
    //   35: getfield 294	com/fimi/soul/view/myhorizontalseebar/ProgressBar:x	Landroid/graphics/drawable/Drawable;
    //   38: putfield 332	com/fimi/soul/view/myhorizontalseebar/ProgressBar:z	Landroid/graphics/drawable/Drawable;
    //   41: aload_0
    //   42: invokevirtual 503	com/fimi/soul/view/myhorizontalseebar/ProgressBar:e	()V
    //   45: aload_0
    //   46: monitorexit
    //   47: return
    //   48: aload_0
    //   49: aload_0
    //   50: getfield 306	com/fimi/soul/view/myhorizontalseebar/ProgressBar:y	Landroid/graphics/drawable/Drawable;
    //   53: putfield 332	com/fimi/soul/view/myhorizontalseebar/ProgressBar:z	Landroid/graphics/drawable/Drawable;
    //   56: aload_0
    //   57: invokevirtual 522	com/fimi/soul/view/myhorizontalseebar/ProgressBar:f	()V
    //   60: goto -15 -> 45
    //   63: astore_2
    //   64: aload_0
    //   65: monitorexit
    //   66: aload_2
    //   67: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	68	0	this	ProgressBar
    //   0	68	1	paramBoolean	boolean
    //   63	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	16	63	finally
    //   16	29	63	finally
    //   33	45	63	finally
    //   48	60	63	finally
  }
  
  public void setIndeterminateDrawable(Drawable paramDrawable)
  {
    if (paramDrawable != null) {
      paramDrawable.setCallback(this);
    }
    if (this.s)
    {
      this.z = paramDrawable;
      postInvalidate();
    }
  }
  
  public void setInterpolator(Interpolator paramInterpolator)
  {
    this.B = paramInterpolator;
  }
  
  public void setMax(int paramInt)
  {
    int i1 = paramInt;
    if (paramInt < 0) {
      i1 = 0;
    }
    try
    {
      if (i1 != this.p)
      {
        this.p = i1;
        postInvalidate();
        if (this.n > i1) {
          this.n = i1;
        }
        a(16908301, this.n, false);
      }
      return;
    }
    finally {}
  }
  
  public void setProgress(int paramInt)
  {
    try
    {
      a(paramInt, false);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void setProgressDrawable(Drawable paramDrawable)
  {
    if ((this.y != null) && (paramDrawable != this.y)) {
      this.y.setCallback(null);
    }
    for (int i1 = 1;; i1 = 0)
    {
      if (paramDrawable != null)
      {
        paramDrawable.setCallback(this);
        int i2 = paramDrawable.getMinimumHeight();
        if (this.f < i2)
        {
          this.f = i2;
          requestLayout();
        }
      }
      this.y = paramDrawable;
      if (!this.s)
      {
        this.z = paramDrawable;
        postInvalidate();
      }
      if (i1 != 0)
      {
        a(getWidth(), getHeight());
        b();
        a(16908301, this.n, false, false);
        a(16908303, this.o, false, false);
      }
      return;
    }
  }
  
  public void setSecondaryProgress(int paramInt)
  {
    int i1 = 0;
    try
    {
      boolean bool = this.s;
      if (bool) {
        return;
      }
      if (paramInt < 0) {
        paramInt = i1;
      }
      for (;;)
      {
        i1 = paramInt;
        if (paramInt > this.p) {
          i1 = this.p;
        }
        if (i1 == this.o) {
          break;
        }
        this.o = i1;
        a(16908303, this.o, false);
        break;
      }
    }
    finally {}
  }
  
  public void setVisibility(int paramInt)
  {
    if (getVisibility() != paramInt)
    {
      super.setVisibility(paramInt);
      if (this.s)
      {
        if ((paramInt != 8) && (paramInt != 4)) {
          break label36;
        }
        f();
      }
    }
    return;
    label36:
    e();
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    return (paramDrawable == this.y) || (paramDrawable == this.x) || (super.verifyDrawable(paramDrawable));
  }
  
  static class SavedState
    extends View.BaseSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator()
    {
      public ProgressBar.SavedState a(Parcel paramAnonymousParcel)
      {
        return new ProgressBar.SavedState(paramAnonymousParcel, null);
      }
      
      public ProgressBar.SavedState[] a(int paramAnonymousInt)
      {
        return new ProgressBar.SavedState[paramAnonymousInt];
      }
    };
    int a;
    int b;
    
    private SavedState(Parcel paramParcel)
    {
      super();
      this.a = paramParcel.readInt();
      this.b = paramParcel.readInt();
    }
    
    SavedState(Parcelable paramParcelable)
    {
      super();
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(this.a);
      paramParcel.writeInt(this.b);
    }
  }
  
  private class a
    implements Runnable
  {
    private a() {}
    
    public void run()
    {
      ProgressBar.this.sendAccessibilityEvent(4);
    }
  }
  
  private static class b
    implements c<b>
  {
    private static final int f = 24;
    private static final b<b> g = e.a(e.a(new d()
    {
      public void a(ProgressBar.b paramAnonymousb) {}
      
      public ProgressBar.b b()
      {
        return new ProgressBar.b(null);
      }
      
      public void b(ProgressBar.b paramAnonymousb) {}
    }, 24));
    public int a;
    public int b;
    public boolean c;
    private b d;
    private boolean e;
    
    public static b a(int paramInt1, int paramInt2, boolean paramBoolean)
    {
      b localb = (b)g.a();
      localb.a = paramInt1;
      localb.b = paramInt2;
      localb.c = paramBoolean;
      return localb;
    }
    
    public void a(b paramb)
    {
      this.d = paramb;
    }
    
    public void a(boolean paramBoolean)
    {
      this.e = paramBoolean;
    }
    
    public boolean b()
    {
      return this.e;
    }
    
    public void c()
    {
      g.a(this);
    }
    
    public b d()
    {
      return this.d;
    }
  }
  
  private class c
    implements Runnable
  {
    private c() {}
    
    public void run()
    {
      synchronized (ProgressBar.this)
      {
        int j = ProgressBar.a(ProgressBar.this).size();
        int i = 0;
        while (i < j)
        {
          ProgressBar.b localb = (ProgressBar.b)ProgressBar.a(ProgressBar.this).get(i);
          ProgressBar.a(ProgressBar.this, localb.a, localb.b, localb.c, true);
          localb.c();
          i += 1;
        }
        ProgressBar.a(ProgressBar.this).clear();
        ProgressBar.a(ProgressBar.this, false);
        return;
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/view/myhorizontalseebar/ProgressBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */