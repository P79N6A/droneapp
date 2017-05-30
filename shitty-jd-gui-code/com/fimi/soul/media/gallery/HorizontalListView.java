package com.fimi.soul.media.gallery;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.EdgeEffectCompat;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.Scroller;
import com.fimi.overseas.soul.R.styleable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class HorizontalListView
  extends AdapterView<ListAdapter>
{
  private static final int e = -1;
  private static final int f = 0;
  private static final float g = 30.0F;
  private static final float h = 0.009F;
  private static final String i = "BUNDLE_ID_CURRENT_X";
  private static final String j = "BUNDLE_ID_PARENT_STATE";
  private boolean A = false;
  private d B = null;
  private HorizontalListView.d.a C = HorizontalListView.d.a.a;
  private EdgeEffectCompat D;
  private EdgeEffectCompat E;
  private int F;
  private boolean G = false;
  private boolean H = false;
  private View.OnClickListener I;
  private DataSetObserver J = new DataSetObserver()
  {
    public void onChanged()
    {
      HorizontalListView.a(HorizontalListView.this, true);
      HorizontalListView.b(HorizontalListView.this, false);
      HorizontalListView.b(HorizontalListView.this);
      HorizontalListView.this.invalidate();
      HorizontalListView.this.requestLayout();
    }
    
    public void onInvalidated()
    {
      HorizontalListView.b(HorizontalListView.this, false);
      HorizontalListView.b(HorizontalListView.this);
      HorizontalListView.c(HorizontalListView.this);
      HorizontalListView.this.invalidate();
      HorizontalListView.this.requestLayout();
    }
  };
  private Runnable K = new Runnable()
  {
    public void run()
    {
      HorizontalListView.this.requestLayout();
    }
  };
  protected Scroller a = new Scroller(getContext());
  protected ListAdapter b;
  protected int c;
  protected int d;
  private final a k = new a(null);
  private GestureDetector l;
  private int m;
  private List<Queue<View>> n = new ArrayList();
  private boolean o = false;
  private Rect p = new Rect();
  private View q = null;
  private int r = 0;
  private Drawable s = null;
  private Integer t = null;
  private int u = Integer.MAX_VALUE;
  private int v;
  private int w;
  private int x;
  private e y = null;
  private int z = 0;
  
  public HorizontalListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.D = new EdgeEffectCompat(paramContext);
    this.E = new EdgeEffectCompat(paramContext);
    this.l = new GestureDetector(paramContext, this.k);
    a();
    b();
    a(paramContext, paramAttributeSet);
    setWillNotDraw(false);
    if (Build.VERSION.SDK_INT >= 11) {
      b.a(this.a, 0.009F);
    }
  }
  
  private void a()
  {
    setOnTouchListener(new View.OnTouchListener()
    {
      public boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        return HorizontalListView.a(HorizontalListView.this).onTouchEvent(paramAnonymousMotionEvent);
      }
    });
  }
  
  private void a(int paramInt1, int paramInt2)
  {
    if ((paramInt1 + paramInt2 + this.r < getWidth()) && (this.w + 1 < this.b.getCount()))
    {
      this.w += 1;
      if (this.v < 0) {
        this.v = this.w;
      }
      View localView = this.b.getView(this.w, c(this.w), this);
      a(localView, -1);
      if (this.w == 0) {}
      for (int i1 = 0;; i1 = this.r)
      {
        paramInt1 += i1 + localView.getMeasuredWidth();
        h();
        break;
      }
    }
  }
  
  private void a(int paramInt, View paramView)
  {
    paramInt = this.b.getItemViewType(paramInt);
    if (d(paramInt)) {
      ((Queue)this.n.get(paramInt)).offer(paramView);
    }
  }
  
  private void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    if (paramAttributeSet != null)
    {
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.HorizontalListView);
      paramAttributeSet = paramContext.getDrawable(1);
      if (paramAttributeSet != null) {
        setDivider(paramAttributeSet);
      }
      int i1 = paramContext.getDimensionPixelSize(3, 0);
      if (i1 != 0) {
        setDividerWidth(i1);
      }
      paramContext.recycle();
    }
  }
  
  private void a(Canvas paramCanvas)
  {
    if ((this.D != null) && (!this.D.isFinished()) && (i()))
    {
      i1 = paramCanvas.save();
      i2 = getHeight();
      paramCanvas.rotate(-90.0F, 0.0F, 0.0F);
      paramCanvas.translate(-i2 + getPaddingBottom(), 0.0F);
      this.D.setSize(getRenderHeight(), getRenderWidth());
      if (this.D.draw(paramCanvas)) {
        invalidate();
      }
      paramCanvas.restoreToCount(i1);
    }
    while ((this.E == null) || (this.E.isFinished()) || (!i())) {
      return;
    }
    int i1 = paramCanvas.save();
    int i2 = getWidth();
    paramCanvas.rotate(90.0F, 0.0F, 0.0F);
    paramCanvas.translate(getPaddingTop(), -i2);
    this.E.setSize(getRenderHeight(), getRenderWidth());
    if (this.E.draw(paramCanvas)) {
      invalidate();
    }
    paramCanvas.restoreToCount(i1);
  }
  
  private void a(Canvas paramCanvas, Rect paramRect)
  {
    if (this.s != null)
    {
      this.s.setBounds(paramRect);
      this.s.draw(paramCanvas);
    }
  }
  
  private void a(View paramView)
  {
    ViewGroup.LayoutParams localLayoutParams = b(paramView);
    int i2 = ViewGroup.getChildMeasureSpec(this.F, getPaddingTop() + getPaddingBottom(), localLayoutParams.height);
    if (localLayoutParams.width > 0) {}
    for (int i1 = View.MeasureSpec.makeMeasureSpec(localLayoutParams.width, 1073741824);; i1 = View.MeasureSpec.makeMeasureSpec(0, 0))
    {
      paramView.measure(i1, i2);
      return;
    }
  }
  
  private void a(View paramView, int paramInt)
  {
    addViewInLayout(paramView, paramInt, b(paramView), true);
    a(paramView);
  }
  
  private void a(Boolean paramBoolean)
  {
    if (this.H != paramBoolean.booleanValue()) {}
    for (Object localObject = this;; localObject = (View)((View)localObject).getParent()) {
      if ((((View)localObject).getParent() instanceof View))
      {
        if (((((View)localObject).getParent() instanceof ListView)) || ((((View)localObject).getParent() instanceof ScrollView)))
        {
          ((View)localObject).getParent().requestDisallowInterceptTouchEvent(paramBoolean.booleanValue());
          this.H = paramBoolean.booleanValue();
        }
      }
      else {
        return;
      }
    }
  }
  
  private ViewGroup.LayoutParams b(View paramView)
  {
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    paramView = localLayoutParams;
    if (localLayoutParams == null) {
      paramView = new ViewGroup.LayoutParams(-2, -1);
    }
    return paramView;
  }
  
  private void b()
  {
    this.v = -1;
    this.w = -1;
    this.m = 0;
    this.c = 0;
    this.d = 0;
    this.u = Integer.MAX_VALUE;
    setCurrentScrollState(HorizontalListView.d.a.a);
  }
  
  private void b(int paramInt)
  {
    this.n.clear();
    int i1 = 0;
    while (i1 < paramInt)
    {
      this.n.add(new LinkedList());
      i1 += 1;
    }
  }
  
  private void b(int paramInt1, int paramInt2)
  {
    if ((paramInt1 + paramInt2 - this.r > 0) && (this.v >= 1))
    {
      this.v -= 1;
      View localView = this.b.getView(this.v, c(this.v), this);
      a(localView, 0);
      int i1;
      label73:
      int i2;
      if (this.v == 0)
      {
        i1 = localView.getMeasuredWidth();
        i1 = paramInt1 - i1;
        i2 = this.m;
        if (i1 + paramInt2 != 0) {
          break label122;
        }
      }
      label122:
      for (paramInt1 = localView.getMeasuredWidth();; paramInt1 = this.r + localView.getMeasuredWidth())
      {
        this.m = (i2 - paramInt1);
        paramInt1 = i1;
        break;
        i1 = this.r + localView.getMeasuredWidth();
        break label73;
      }
    }
  }
  
  private void b(Canvas paramCanvas)
  {
    int i2 = getChildCount();
    Rect localRect = this.p;
    this.p.top = getPaddingTop();
    this.p.bottom = (this.p.top + getRenderHeight());
    int i1 = 0;
    while (i1 < i2)
    {
      if ((i1 != i2 - 1) || (!i(this.w)))
      {
        View localView = getChildAt(i1);
        localRect.left = localView.getRight();
        localRect.right = (localView.getRight() + this.r);
        if (localRect.left < getPaddingLeft()) {
          localRect.left = getPaddingLeft();
        }
        if (localRect.right > getWidth() - getPaddingRight()) {
          localRect.right = (getWidth() - getPaddingRight());
        }
        a(paramCanvas, localRect);
        if ((i1 == 0) && (localView.getLeft() > getPaddingLeft()))
        {
          localRect.left = getPaddingLeft();
          localRect.right = localView.getLeft();
          a(paramCanvas, localRect);
        }
      }
      i1 += 1;
    }
  }
  
  private int c(int paramInt1, int paramInt2)
  {
    int i2 = getChildCount();
    int i1 = 0;
    while (i1 < i2)
    {
      getChildAt(i1).getHitRect(this.p);
      if (this.p.contains(paramInt1, paramInt2)) {
        return i1;
      }
      i1 += 1;
    }
    return -1;
  }
  
  private View c(int paramInt)
  {
    paramInt = this.b.getItemViewType(paramInt);
    if (d(paramInt)) {
      return (View)((Queue)this.n.get(paramInt)).poll();
    }
    return null;
  }
  
  private void c()
  {
    b();
    removeAllViewsInLayout();
    requestLayout();
  }
  
  private float d()
  {
    if (Build.VERSION.SDK_INT >= 14) {
      return c.a(this.a);
    }
    return 30.0F;
  }
  
  private boolean d(int paramInt)
  {
    return paramInt < this.n.size();
  }
  
  private void e(int paramInt)
  {
    int i2 = 0;
    View localView = getRightmostChild();
    if (localView != null) {}
    for (int i1 = localView.getRight();; i1 = 0)
    {
      a(i1, paramInt);
      localView = getLeftmostChild();
      i1 = i2;
      if (localView != null) {
        i1 = localView.getLeft();
      }
      b(i1, paramInt);
      return;
    }
  }
  
  private boolean e()
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (i(this.w))
    {
      View localView = getRightmostChild();
      bool1 = bool2;
      if (localView != null)
      {
        int i1 = this.u;
        int i2 = this.c;
        this.u = (localView.getRight() - getPaddingLeft() + i2 - getRenderWidth());
        if (this.u < 0) {
          this.u = 0;
        }
        bool1 = bool2;
        if (this.u != i1) {
          bool1 = true;
        }
      }
    }
    return bool1;
  }
  
  private void f()
  {
    if (this.q != null)
    {
      this.q.setPressed(false);
      refreshDrawableState();
      this.q = null;
    }
  }
  
  private void f(int paramInt)
  {
    View localView = getLeftmostChild();
    if ((localView != null) && (localView.getRight() + paramInt <= 0))
    {
      int i2 = this.m;
      if (i(this.v)) {}
      for (int i1 = localView.getMeasuredWidth();; i1 = this.r + localView.getMeasuredWidth())
      {
        this.m = (i1 + i2);
        a(this.v, localView);
        removeViewInLayout(localView);
        this.v += 1;
        localView = getLeftmostChild();
        break;
      }
    }
    for (localView = getRightmostChild(); (localView != null) && (localView.getLeft() + paramInt >= getWidth()); localView = getRightmostChild())
    {
      a(this.w, localView);
      removeViewInLayout(localView);
      this.w -= 1;
    }
  }
  
  private void g()
  {
    if (this.D != null) {
      this.D.onRelease();
    }
    if (this.E != null) {
      this.E.onRelease();
    }
  }
  
  private void g(int paramInt)
  {
    int i2 = getChildCount();
    if (i2 > 0)
    {
      this.m += paramInt;
      int i1 = this.m;
      paramInt = 0;
      while (paramInt < i2)
      {
        View localView = getChildAt(paramInt);
        int i3 = getPaddingLeft() + i1;
        int i4 = getPaddingTop();
        localView.layout(i3, i4, localView.getMeasuredWidth() + i3, localView.getMeasuredHeight() + i4);
        i1 += localView.getMeasuredWidth() + this.r;
        paramInt += 1;
      }
    }
  }
  
  private View getLeftmostChild()
  {
    return getChildAt(0);
  }
  
  private int getRenderHeight()
  {
    return getHeight() - getPaddingTop() - getPaddingBottom();
  }
  
  private int getRenderWidth()
  {
    return getWidth() - getPaddingLeft() - getPaddingRight();
  }
  
  private View getRightmostChild()
  {
    return getChildAt(getChildCount() - 1);
  }
  
  private View h(int paramInt)
  {
    if ((paramInt >= this.v) && (paramInt <= this.w)) {
      return getChildAt(paramInt - this.v);
    }
    return null;
  }
  
  private void h()
  {
    if ((this.y != null) && (this.b != null) && (this.b.getCount() - (this.w + 1) < this.z) && (!this.A))
    {
      this.A = true;
      this.y.a();
    }
  }
  
  private boolean i()
  {
    if ((this.b == null) || (this.b.isEmpty())) {}
    while (this.u <= 0) {
      return false;
    }
    return true;
  }
  
  private boolean i(int paramInt)
  {
    return paramInt == this.b.getCount() - 1;
  }
  
  private void j(int paramInt)
  {
    if ((this.D == null) || (this.E == null)) {}
    do
    {
      int i1;
      do
      {
        do
        {
          do
          {
            return;
            i1 = this.c + paramInt;
          } while ((this.a != null) && (!this.a.isFinished()));
          if (i1 >= 0) {
            break;
          }
          paramInt = Math.abs(paramInt);
          this.D.onPull(paramInt / getRenderWidth());
        } while (this.E.isFinished());
        this.E.onRelease();
        return;
      } while (i1 <= this.u);
      paramInt = Math.abs(paramInt);
      this.E.onPull(paramInt / getRenderWidth());
    } while (this.D.isFinished());
    this.D.onRelease();
  }
  
  private void setCurrentScrollState(HorizontalListView.d.a parama)
  {
    if ((this.C != parama) && (this.B != null)) {
      this.B.a(parama);
    }
    this.C = parama;
  }
  
  public void a(int paramInt)
  {
    this.a.startScroll(this.d, 0, paramInt - this.d, 0);
    setCurrentScrollState(HorizontalListView.d.a.c);
    requestLayout();
  }
  
  public void a(e parame, int paramInt)
  {
    this.y = parame;
    this.z = paramInt;
  }
  
  protected boolean a(MotionEvent paramMotionEvent)
  {
    if (!this.a.isFinished()) {}
    for (boolean bool = true;; bool = false)
    {
      this.G = bool;
      this.a.forceFinished(true);
      setCurrentScrollState(HorizontalListView.d.a.a);
      f();
      if (!this.G)
      {
        int i1 = c((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
        if (i1 >= 0)
        {
          this.q = getChildAt(i1);
          if (this.q != null)
          {
            this.q.setPressed(true);
            refreshDrawableState();
          }
        }
      }
      return true;
    }
  }
  
  protected boolean a(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    this.a.fling(this.d, 0, (int)-paramFloat1, 0, 0, this.u, 0, 0);
    setCurrentScrollState(HorizontalListView.d.a.c);
    requestLayout();
    return true;
  }
  
  protected void dispatchDraw(Canvas paramCanvas)
  {
    super.dispatchDraw(paramCanvas);
    a(paramCanvas);
  }
  
  protected void dispatchSetPressed(boolean paramBoolean) {}
  
  public ListAdapter getAdapter()
  {
    return this.b;
  }
  
  public int getFirstVisiblePosition()
  {
    return this.v;
  }
  
  public int getLastVisiblePosition()
  {
    return this.w;
  }
  
  protected float getLeftFadingEdgeStrength()
  {
    int i1 = getHorizontalFadingEdgeLength();
    if (this.c == 0) {
      return 0.0F;
    }
    if (this.c < i1) {
      return this.c / i1;
    }
    return 1.0F;
  }
  
  protected float getRightFadingEdgeStrength()
  {
    int i1 = getHorizontalFadingEdgeLength();
    if (this.c == this.u) {
      return 0.0F;
    }
    if (this.u - this.c < i1) {
      return (this.u - this.c) / i1;
    }
    return 1.0F;
  }
  
  public View getSelectedView()
  {
    return h(this.x);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    b(paramCanvas);
  }
  
  @SuppressLint({"WrongCall"})
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.b == null) {}
    do
    {
      return;
      invalidate();
      int i1;
      if (this.o)
      {
        i1 = this.c;
        b();
        removeAllViewsInLayout();
        this.d = i1;
        this.o = false;
      }
      if (this.t != null)
      {
        this.d = this.t.intValue();
        this.t = null;
      }
      if (this.a.computeScrollOffset()) {
        this.d = this.a.getCurrX();
      }
      if (this.d < 0)
      {
        this.d = 0;
        if (this.D.isFinished()) {
          this.D.onAbsorb((int)d());
        }
        this.a.forceFinished(true);
        setCurrentScrollState(HorizontalListView.d.a.a);
      }
      for (;;)
      {
        i1 = this.c - this.d;
        f(i1);
        e(i1);
        g(i1);
        this.c = this.d;
        if (!e()) {
          break;
        }
        onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
        return;
        if (this.d > this.u)
        {
          this.d = this.u;
          if (this.E.isFinished()) {
            this.E.onAbsorb((int)d());
          }
          this.a.forceFinished(true);
          setCurrentScrollState(HorizontalListView.d.a.a);
        }
      }
      if (!this.a.isFinished()) {
        break;
      }
    } while (this.C != HorizontalListView.d.a.c);
    setCurrentScrollState(HorizontalListView.d.a.a);
    return;
    ViewCompat.postOnAnimation(this, this.K);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    this.F = paramInt2;
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if ((paramParcelable instanceof Bundle))
    {
      paramParcelable = (Bundle)paramParcelable;
      this.t = Integer.valueOf(paramParcelable.getInt("BUNDLE_ID_CURRENT_X"));
      super.onRestoreInstanceState(paramParcelable.getParcelable("BUNDLE_ID_PARENT_STATE"));
    }
  }
  
  public Parcelable onSaveInstanceState()
  {
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("BUNDLE_ID_PARENT_STATE", super.onSaveInstanceState());
    localBundle.putInt("BUNDLE_ID_CURRENT_X", this.c);
    return localBundle;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getAction() == 1)
    {
      if ((this.a == null) || (this.a.isFinished())) {
        setCurrentScrollState(HorizontalListView.d.a.a);
      }
      a(Boolean.valueOf(false));
      g();
    }
    for (;;)
    {
      return super.onTouchEvent(paramMotionEvent);
      if (paramMotionEvent.getAction() == 3)
      {
        f();
        g();
        a(Boolean.valueOf(false));
      }
    }
  }
  
  public void setAdapter(ListAdapter paramListAdapter)
  {
    if (this.b != null) {
      this.b.unregisterDataSetObserver(this.J);
    }
    if (paramListAdapter != null)
    {
      this.A = false;
      this.b = paramListAdapter;
      this.b.registerDataSetObserver(this.J);
    }
    b(this.b.getViewTypeCount());
    c();
  }
  
  public void setDivider(Drawable paramDrawable)
  {
    this.s = paramDrawable;
    if (paramDrawable != null)
    {
      setDividerWidth(paramDrawable.getIntrinsicWidth());
      return;
    }
    setDividerWidth(0);
  }
  
  public void setDividerWidth(int paramInt)
  {
    this.r = paramInt;
    requestLayout();
    invalidate();
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.I = paramOnClickListener;
  }
  
  public void setOnScrollStateChangedListener(d paramd)
  {
    this.B = paramd;
  }
  
  public void setSelection(int paramInt)
  {
    this.x = paramInt;
  }
  
  private class a
    extends GestureDetector.SimpleOnGestureListener
  {
    private a() {}
    
    public boolean onDown(MotionEvent paramMotionEvent)
    {
      return HorizontalListView.this.a(paramMotionEvent);
    }
    
    public boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
    {
      return HorizontalListView.this.a(paramMotionEvent1, paramMotionEvent2, paramFloat1, paramFloat2);
    }
    
    public void onLongPress(MotionEvent paramMotionEvent)
    {
      HorizontalListView.b(HorizontalListView.this);
      int i = HorizontalListView.a(HorizontalListView.this, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
      if ((i >= 0) && (!HorizontalListView.d(HorizontalListView.this)))
      {
        paramMotionEvent = HorizontalListView.this.getChildAt(i);
        AdapterView.OnItemLongClickListener localOnItemLongClickListener = HorizontalListView.this.getOnItemLongClickListener();
        if (localOnItemLongClickListener != null)
        {
          i = HorizontalListView.e(HorizontalListView.this) + i;
          if (localOnItemLongClickListener.onItemLongClick(HorizontalListView.this, paramMotionEvent, i, HorizontalListView.this.b.getItemId(i))) {
            HorizontalListView.this.performHapticFeedback(0);
          }
        }
      }
    }
    
    public boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
    {
      HorizontalListView.a(HorizontalListView.this, Boolean.valueOf(true));
      HorizontalListView.a(HorizontalListView.this, HorizontalListView.d.a.b);
      HorizontalListView.b(HorizontalListView.this);
      paramMotionEvent1 = HorizontalListView.this;
      paramMotionEvent1.d += (int)paramFloat1;
      HorizontalListView.a(HorizontalListView.this, Math.round(paramFloat1));
      HorizontalListView.this.requestLayout();
      return true;
    }
    
    public boolean onSingleTapConfirmed(MotionEvent paramMotionEvent)
    {
      HorizontalListView.b(HorizontalListView.this);
      AdapterView.OnItemClickListener localOnItemClickListener = HorizontalListView.this.getOnItemClickListener();
      int i = HorizontalListView.a(HorizontalListView.this, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
      if ((i >= 0) && (!HorizontalListView.d(HorizontalListView.this)))
      {
        paramMotionEvent = HorizontalListView.this.getChildAt(i);
        i = HorizontalListView.e(HorizontalListView.this) + i;
        if (localOnItemClickListener != null)
        {
          localOnItemClickListener.onItemClick(HorizontalListView.this, paramMotionEvent, i, HorizontalListView.this.b.getItemId(i));
          return true;
        }
      }
      if ((HorizontalListView.f(HorizontalListView.this) != null) && (!HorizontalListView.d(HorizontalListView.this))) {
        HorizontalListView.f(HorizontalListView.this).onClick(HorizontalListView.this);
      }
      return false;
    }
  }
  
  @TargetApi(11)
  private static final class b
  {
    static
    {
      if (Build.VERSION.SDK_INT < 11) {
        throw new RuntimeException("Should not get to HoneycombPlus class unless sdk is >= 11!");
      }
    }
    
    public static void a(Scroller paramScroller, float paramFloat)
    {
      if (paramScroller != null) {
        paramScroller.setFriction(paramFloat);
      }
    }
  }
  
  @TargetApi(14)
  private static final class c
  {
    static
    {
      if (Build.VERSION.SDK_INT < 14) {
        throw new RuntimeException("Should not get to IceCreamSandwichPlus class unless sdk is >= 14!");
      }
    }
    
    public static float a(Scroller paramScroller)
    {
      return paramScroller.getCurrVelocity();
    }
  }
  
  public static abstract interface d
  {
    public abstract void a(a parama);
    
    public static enum a
    {
      private a() {}
    }
  }
  
  public static abstract interface e
  {
    public abstract void a();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/media/gallery/HorizontalListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */