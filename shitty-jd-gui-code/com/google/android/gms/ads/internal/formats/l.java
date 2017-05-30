package com.google.android.gms.ads.internal.formats;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.gms.ads.internal.client.ac;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.a;
import com.google.android.gms.c.e;
import com.google.android.gms.c.f;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.abv;
import com.google.android.gms.internal.act;
import com.google.android.gms.internal.acy;
import com.google.android.gms.internal.ub;
import com.google.android.gms.internal.uf;
import com.google.android.gms.internal.uw.a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@aaa
public class l
  extends uw.a
  implements View.OnClickListener, View.OnTouchListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener
{
  boolean a = false;
  int b;
  int c;
  private final Object d = new Object();
  private final FrameLayout e;
  @Nullable
  private FrameLayout f;
  private Map<String, WeakReference<View>> g = new HashMap();
  @Nullable
  private b h;
  @Nullable
  private i i;
  
  public l(FrameLayout paramFrameLayout1, FrameLayout paramFrameLayout2)
  {
    this.e = paramFrameLayout1;
    this.f = paramFrameLayout2;
    u.C().a(this.e, this);
    u.C().a(this.e, this);
    this.e.setOnTouchListener(this);
    this.e.setOnClickListener(this);
  }
  
  private void b(j paramj)
  {
    if (!this.g.containsKey("2011"))
    {
      paramj.g();
      return;
    }
    final View localView = (View)((WeakReference)this.g.get("2011")).get();
    if (!(localView instanceof FrameLayout))
    {
      paramj.g();
      return;
    }
    paramj.a(localView, new g()
    {
      public void a()
      {
        l.this.onClick(localView);
      }
      
      public void a(MotionEvent paramAnonymousMotionEvent)
      {
        l.this.onTouch(null, paramAnonymousMotionEvent);
      }
    });
  }
  
  int a(int paramInt)
  {
    return ac.a().b(this.i.f(), paramInt);
  }
  
  Point a(MotionEvent paramMotionEvent)
  {
    int[] arrayOfInt = new int[2];
    this.e.getLocationOnScreen(arrayOfInt);
    float f1 = paramMotionEvent.getRawX();
    float f2 = arrayOfInt[0];
    float f3 = paramMotionEvent.getRawY();
    float f4 = arrayOfInt[1];
    return new Point((int)(f1 - f2), (int)(f3 - f4));
  }
  
  @Nullable
  b a(j paramj)
  {
    return paramj.a(this);
  }
  
  public e a(String paramString)
  {
    synchronized (this.d)
    {
      paramString = (WeakReference)this.g.get(paramString);
      if (paramString == null)
      {
        paramString = null;
        paramString = f.a(paramString);
        return paramString;
      }
      paramString = (View)paramString.get();
    }
  }
  
  public void a()
  {
    synchronized (this.d)
    {
      if (this.f != null) {
        this.f.removeAllViews();
      }
      this.f = null;
      this.g = null;
      this.h = null;
      this.i = null;
      return;
    }
  }
  
  void a(@Nullable View paramView)
  {
    if (this.i != null) {
      if (!(this.i instanceof h)) {
        break label40;
      }
    }
    label40:
    for (i locali = ((h)this.i).c();; locali = this.i)
    {
      if (locali != null) {
        locali.b(paramView);
      }
      return;
    }
  }
  
  public void a(final e parame)
  {
    for (;;)
    {
      synchronized (this.d)
      {
        a(null);
        parame = f.a(parame);
        if (!(parame instanceof j))
        {
          abr.d("Not an instance of native engine. This is most likely a transient error");
          return;
        }
        if (this.f != null)
        {
          this.f.setLayoutParams(new FrameLayout.LayoutParams(0, 0));
          this.e.requestLayout();
        }
        this.a = true;
        parame = (j)parame;
        if ((this.i != null) && (((Boolean)uf.bM.c()).booleanValue())) {
          this.i.a(this.e, this.g);
        }
        if (((this.i instanceof h)) && (((h)this.i).b()))
        {
          ((h)this.i).a(parame);
          if (((Boolean)uf.bM.c()).booleanValue()) {
            this.f.setClickable(false);
          }
          this.f.removeAllViews();
          this.h = a(parame);
          if (this.h != null)
          {
            this.g.put("1007", new WeakReference(this.h.a()));
            this.f.addView(this.h);
          }
          parame.a(this.e, this.g, this, this);
          abv.a.post(new Runnable()
          {
            public void run()
            {
              acy localacy = parame.d();
              if ((localacy != null) && (l.a(l.this) != null)) {
                l.a(l.this).addView(localacy.b());
              }
              if (!(parame instanceof h)) {
                l.a(l.this, parame);
              }
            }
          });
          a(this.e);
          return;
        }
      }
      this.i = parame;
      if ((parame instanceof h)) {
        ((h)parame).a(null);
      }
    }
  }
  
  public void a(String paramString, e parame)
  {
    View localView = (View)f.a(parame);
    parame = this.d;
    if (localView == null) {}
    for (;;)
    {
      try
      {
        this.g.remove(paramString);
        return;
      }
      finally {}
      this.g.put(paramString, new WeakReference(localView));
      localView.setOnTouchListener(this);
      localView.setClickable(true);
      localView.setOnClickListener(this);
    }
  }
  
  int b()
  {
    return this.e.getMeasuredWidth();
  }
  
  Point b(View paramView)
  {
    if ((this.h != null) && (this.h.a().equals(paramView)))
    {
      localPoint1 = new Point();
      this.e.getGlobalVisibleRect(new Rect(), localPoint1);
      Point localPoint2 = new Point();
      paramView.getGlobalVisibleRect(new Rect(), localPoint2);
      return new Point(localPoint2.x - localPoint1.x, localPoint2.y - localPoint1.y);
    }
    Point localPoint1 = new Point();
    paramView.getGlobalVisibleRect(new Rect(), localPoint1);
    return localPoint1;
  }
  
  int c()
  {
    return this.e.getMeasuredHeight();
  }
  
  public void onClick(View paramView)
  {
    JSONObject localJSONObject1;
    Object localObject3;
    for (;;)
    {
      synchronized (this.d)
      {
        if (this.i == null) {
          return;
        }
        localJSONObject1 = new JSONObject();
        localObject3 = this.g.entrySet().iterator();
        if (!((Iterator)localObject3).hasNext()) {
          break;
        }
        localObject1 = (Map.Entry)((Iterator)localObject3).next();
        View localView = (View)((WeakReference)((Map.Entry)localObject1).getValue()).get();
        if (localView == null) {
          continue;
        }
        Point localPoint = b(localView);
        JSONObject localJSONObject2 = new JSONObject();
        try
        {
          localJSONObject2.put("width", a(localView.getWidth()));
          localJSONObject2.put("height", a(localView.getHeight()));
          localJSONObject2.put("x", a(localPoint.x));
          localJSONObject2.put("y", a(localPoint.y));
          localJSONObject1.put((String)((Map.Entry)localObject1).getKey(), localJSONObject2);
        }
        catch (JSONException localJSONException2)
        {
          localObject1 = String.valueOf((String)((Map.Entry)localObject1).getKey());
          if (((String)localObject1).length() == 0) {
            break label236;
          }
        }
        localObject1 = "Unable to get view rectangle for view ".concat((String)localObject1);
        abr.d((String)localObject1);
      }
      label236:
      localObject1 = new String("Unable to get view rectangle for view ");
    }
    Object localObject1 = new JSONObject();
    try
    {
      ((JSONObject)localObject1).put("x", a(this.b));
      ((JSONObject)localObject1).put("y", a(this.c));
      localObject3 = new JSONObject();
    }
    catch (JSONException localJSONException1)
    {
      try
      {
        ((JSONObject)localObject3).put("width", a(b()));
        ((JSONObject)localObject3).put("height", a(c()));
        if ((this.h != null) && (this.h.a().equals(paramView))) {
          if (((this.i instanceof h)) && (((h)this.i).c() != null))
          {
            ((h)this.i).c().a(paramView, "1007", localJSONObject1, (JSONObject)localObject1, (JSONObject)localObject3);
            return;
            localJSONException1 = localJSONException1;
            abr.d("Unable to get click location");
          }
        }
      }
      catch (JSONException localJSONException3)
      {
        for (;;)
        {
          abr.d("Unable to get native ad view bounding box");
          continue;
          this.i.a(paramView, "1007", localJSONObject1, (JSONObject)localObject1, localJSONException1);
          continue;
          this.i.a(paramView, this.g, localJSONObject1, (JSONObject)localObject1, localJSONException1);
        }
      }
    }
  }
  
  public void onGlobalLayout()
  {
    synchronized (this.d)
    {
      if (this.a)
      {
        int j = b();
        int k = c();
        if ((j != 0) && (k != 0) && (this.f != null))
        {
          this.f.setLayoutParams(new FrameLayout.LayoutParams(j, k));
          this.a = false;
        }
      }
      if (this.i != null) {
        this.i.a(this.e);
      }
      return;
    }
  }
  
  public void onScrollChanged()
  {
    synchronized (this.d)
    {
      if (this.i != null) {
        this.i.a(this.e);
      }
      return;
    }
  }
  
  public boolean onTouch(View arg1, MotionEvent paramMotionEvent)
  {
    synchronized (this.d)
    {
      if (this.i == null) {
        return false;
      }
      Point localPoint = a(paramMotionEvent);
      this.b = localPoint.x;
      this.c = localPoint.y;
      paramMotionEvent = MotionEvent.obtain(paramMotionEvent);
      paramMotionEvent.setLocation(localPoint.x, localPoint.y);
      this.i.a(paramMotionEvent);
      paramMotionEvent.recycle();
      return false;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/formats/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */