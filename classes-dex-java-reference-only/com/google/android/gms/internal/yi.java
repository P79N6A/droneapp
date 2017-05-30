package com.google.android.gms.internal;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.ac;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.a;
import com.google.android.gms.common.util.f;
import java.util.Map;
import java.util.Set;

@aaa
public class yi
  extends yn
{
  static final Set<String> a = f.a(new String[] { "top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center" });
  private String b = "top-right";
  private boolean c = true;
  private int d = 0;
  private int e = 0;
  private int f = -1;
  private int g = 0;
  private int h = 0;
  private int i = -1;
  private final Object j = new Object();
  private final acy k;
  private final Activity l;
  private AdSizeParcel m;
  private ImageView n;
  private LinearLayout o;
  private yo p;
  private PopupWindow q;
  private RelativeLayout r;
  private ViewGroup s;
  
  public yi(acy paramacy, yo paramyo)
  {
    super(paramacy, "resize");
    this.k = paramacy;
    this.l = paramacy.f();
    this.p = paramyo;
  }
  
  private void b(Map<String, String> paramMap)
  {
    if (!TextUtils.isEmpty((CharSequence)paramMap.get("width"))) {
      this.i = u.e().b((String)paramMap.get("width"));
    }
    if (!TextUtils.isEmpty((CharSequence)paramMap.get("height"))) {
      this.f = u.e().b((String)paramMap.get("height"));
    }
    if (!TextUtils.isEmpty((CharSequence)paramMap.get("offsetX"))) {
      this.g = u.e().b((String)paramMap.get("offsetX"));
    }
    if (!TextUtils.isEmpty((CharSequence)paramMap.get("offsetY"))) {
      this.h = u.e().b((String)paramMap.get("offsetY"));
    }
    if (!TextUtils.isEmpty((CharSequence)paramMap.get("allowOffscreen"))) {
      this.c = Boolean.parseBoolean((String)paramMap.get("allowOffscreen"));
    }
    paramMap = (String)paramMap.get("customClosePosition");
    if (!TextUtils.isEmpty(paramMap)) {
      this.b = paramMap;
    }
  }
  
  private int[] d()
  {
    if (!c()) {
      return null;
    }
    if (this.c) {
      return new int[] { this.d + this.g, this.e + this.h };
    }
    int[] arrayOfInt1 = u.e().b(this.l);
    int[] arrayOfInt2 = u.e().d(this.l);
    int i4 = arrayOfInt1[0];
    int i2 = this.d + this.g;
    int i3 = this.e + this.h;
    int i1;
    if (i2 < 0)
    {
      i1 = 0;
      if (i3 >= arrayOfInt2[0]) {
        break label149;
      }
      i2 = arrayOfInt2[0];
    }
    for (;;)
    {
      return new int[] { i1, i2 };
      i1 = i2;
      if (this.i + i2 <= i4) {
        break;
      }
      i1 = i4 - this.i;
      break;
      label149:
      i2 = i3;
      if (this.f + i3 > arrayOfInt2[1]) {
        i2 = arrayOfInt2[1] - this.f;
      }
    }
  }
  
  void a(int paramInt1, int paramInt2)
  {
    if (this.p != null) {
      this.p.a(paramInt1, paramInt2, this.i, this.f);
    }
  }
  
  public void a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    synchronized (this.j)
    {
      this.d = paramInt1;
      this.e = paramInt2;
      if ((this.q != null) && (paramBoolean))
      {
        int[] arrayOfInt = d();
        if (arrayOfInt != null)
        {
          this.q.update(ac.a().a(this.l, arrayOfInt[0]), ac.a().a(this.l, arrayOfInt[1]), this.q.getWidth(), this.q.getHeight());
          b(arrayOfInt[0], arrayOfInt[1]);
        }
      }
      else
      {
        return;
      }
      a(true);
    }
  }
  
  public void a(Map<String, String> paramMap)
  {
    synchronized (this.j)
    {
      if (this.l == null)
      {
        b("Not an activity context. Cannot resize.");
        return;
      }
      if (this.k.k() == null)
      {
        b("Webview is not yet available, size is not set.");
        return;
      }
    }
    if (this.k.k().e)
    {
      b("Is interstitial. Cannot resize an interstitial.");
      return;
    }
    if (this.k.p())
    {
      b("Cannot resize an expanded banner.");
      return;
    }
    b(paramMap);
    if (!a())
    {
      b("Invalid width and height options. Cannot resize.");
      return;
    }
    paramMap = this.l.getWindow();
    if ((paramMap == null) || (paramMap.getDecorView() == null))
    {
      b("Activity context is not ready, cannot get window or decor view.");
      return;
    }
    int[] arrayOfInt = d();
    if (arrayOfInt == null)
    {
      b("Resize location out of screen or close button is not visible.");
      return;
    }
    int i1 = ac.a().a(this.l, this.i);
    int i2 = ac.a().a(this.l, this.f);
    Object localObject2 = this.k.b().getParent();
    if ((localObject2 != null) && ((localObject2 instanceof ViewGroup)))
    {
      ((ViewGroup)localObject2).removeView(this.k.b());
      if (this.q == null)
      {
        this.s = ((ViewGroup)localObject2);
        localObject2 = u.e().a(this.k.b());
        this.n = new ImageView(this.l);
        this.n.setImageBitmap((Bitmap)localObject2);
        this.m = this.k.k();
        this.s.addView(this.n);
        this.r = new RelativeLayout(this.l);
        this.r.setBackgroundColor(0);
        this.r.setLayoutParams(new ViewGroup.LayoutParams(i1, i2));
        this.q = u.e().a(this.r, i1, i2, false);
        this.q.setOutsideTouchable(true);
        this.q.setTouchable(true);
        localObject2 = this.q;
        if (this.c) {
          break label1083;
        }
      }
    }
    label1024:
    label1038:
    label1040:
    label1083:
    for (boolean bool = true;; bool = false)
    {
      ((PopupWindow)localObject2).setClippingEnabled(bool);
      this.r.addView(this.k.b(), -1, -1);
      this.o = new LinearLayout(this.l);
      localObject2 = new RelativeLayout.LayoutParams(ac.a().a(this.l, 50), ac.a().a(this.l, 50));
      String str = this.b;
      switch (str.hashCode())
      {
      }
      for (;;)
      {
        ((RelativeLayout.LayoutParams)localObject2).addRule(10);
        ((RelativeLayout.LayoutParams)localObject2).addRule(11);
        for (;;)
        {
          this.o.setOnClickListener(new yi.1(this));
          this.o.setContentDescription("Close button");
          this.r.addView(this.o, (ViewGroup.LayoutParams)localObject2);
          try
          {
            this.q.showAtLocation(paramMap.getDecorView(), 0, ac.a().a(this.l, arrayOfInt[0]), ac.a().a(this.l, arrayOfInt[1]));
            a(arrayOfInt[0], arrayOfInt[1]);
            this.k.a(new AdSizeParcel(this.l, new d(this.i, this.f)));
            b(arrayOfInt[0], arrayOfInt[1]);
            d("resized");
            return;
          }
          catch (RuntimeException paramMap)
          {
            paramMap = String.valueOf(paramMap.getMessage());
            if (paramMap.length() == 0) {
              break label1024;
            }
            for (paramMap = "Cannot show popup window: ".concat(paramMap);; paramMap = new String("Cannot show popup window: "))
            {
              b(paramMap);
              this.r.removeView(this.k.b());
              if (this.s != null)
              {
                this.s.removeView(this.n);
                this.s.addView(this.k.b());
                this.k.a(this.m);
              }
              return;
            }
            i1 = -1;
            switch (i1)
            {
            }
          }
          this.q.dismiss();
          break;
          b("Webview is detached, probably in the middle of a resize or expand.");
          return;
          if (!str.equals("top-left")) {
            break label1038;
          }
          i1 = 0;
          break label1040;
          if (!str.equals("top-center")) {
            break label1038;
          }
          i1 = 1;
          break label1040;
          if (!str.equals("center")) {
            break label1038;
          }
          i1 = 2;
          break label1040;
          if (!str.equals("bottom-left")) {
            break label1038;
          }
          i1 = 3;
          break label1040;
          if (!str.equals("bottom-center")) {
            break label1038;
          }
          i1 = 4;
          break label1040;
          if (!str.equals("bottom-right")) {
            break label1038;
          }
          i1 = 5;
          break label1040;
          ((RelativeLayout.LayoutParams)localObject2).addRule(10);
          ((RelativeLayout.LayoutParams)localObject2).addRule(9);
          continue;
          ((RelativeLayout.LayoutParams)localObject2).addRule(10);
          ((RelativeLayout.LayoutParams)localObject2).addRule(14);
          continue;
          ((RelativeLayout.LayoutParams)localObject2).addRule(13);
          continue;
          ((RelativeLayout.LayoutParams)localObject2).addRule(12);
          ((RelativeLayout.LayoutParams)localObject2).addRule(9);
          continue;
          ((RelativeLayout.LayoutParams)localObject2).addRule(12);
          ((RelativeLayout.LayoutParams)localObject2).addRule(14);
          continue;
          ((RelativeLayout.LayoutParams)localObject2).addRule(12);
          ((RelativeLayout.LayoutParams)localObject2).addRule(11);
        }
      }
    }
  }
  
  public void a(boolean paramBoolean)
  {
    synchronized (this.j)
    {
      if (this.q != null)
      {
        this.q.dismiss();
        this.r.removeView(this.k.b());
        if (this.s != null)
        {
          this.s.removeView(this.n);
          this.s.addView(this.k.b());
          this.k.a(this.m);
        }
        if (paramBoolean)
        {
          d("default");
          if (this.p != null) {
            this.p.G();
          }
        }
        this.q = null;
        this.r = null;
        this.s = null;
        this.o = null;
      }
      return;
    }
  }
  
  boolean a()
  {
    return (this.i > -1) && (this.f > -1);
  }
  
  void b(int paramInt1, int paramInt2)
  {
    a(paramInt1, paramInt2 - u.e().d(this.l)[0], this.i, this.f);
  }
  
  public boolean b()
  {
    for (;;)
    {
      synchronized (this.j)
      {
        if (this.q != null)
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  public void c(int paramInt1, int paramInt2)
  {
    this.d = paramInt1;
    this.e = paramInt2;
  }
  
  boolean c()
  {
    Object localObject = u.e().b(this.l);
    int[] arrayOfInt = u.e().d(this.l);
    int i3 = localObject[0];
    int i1 = localObject[1];
    if ((this.i < 50) || (this.i > i3))
    {
      abr.d("Width is too small or too large.");
      return false;
    }
    if ((this.f < 50) || (this.f > i1))
    {
      abr.d("Height is too small or too large.");
      return false;
    }
    if ((this.f == i1) && (this.i == i3))
    {
      abr.d("Cannot resize to a full-screen ad.");
      return false;
    }
    label188:
    int i2;
    if (this.c)
    {
      localObject = this.b;
      i1 = -1;
      switch (((String)localObject).hashCode())
      {
      default: 
        switch (i1)
        {
        default: 
          i2 = this.d + this.g + this.i - 50;
          i1 = this.e + this.h;
        }
        break;
      }
    }
    while ((i2 >= 0) && (i2 + 50 <= i3) && (i1 >= arrayOfInt[0]) && (i1 + 50 <= arrayOfInt[1]))
    {
      return true;
      if (!((String)localObject).equals("top-left")) {
        break label188;
      }
      i1 = 0;
      break label188;
      if (!((String)localObject).equals("top-center")) {
        break label188;
      }
      i1 = 1;
      break label188;
      if (!((String)localObject).equals("center")) {
        break label188;
      }
      i1 = 2;
      break label188;
      if (!((String)localObject).equals("bottom-left")) {
        break label188;
      }
      i1 = 3;
      break label188;
      if (!((String)localObject).equals("bottom-center")) {
        break label188;
      }
      i1 = 4;
      break label188;
      if (!((String)localObject).equals("bottom-right")) {
        break label188;
      }
      i1 = 5;
      break label188;
      i1 = this.d;
      i2 = this.g + i1;
      i1 = this.e + this.h;
      continue;
      i2 = this.d + this.g + this.i / 2 - 25;
      i1 = this.e + this.h;
      continue;
      i2 = this.d + this.g + this.i / 2 - 25;
      i1 = this.e + this.h + this.f / 2 - 25;
      continue;
      i1 = this.d;
      i2 = this.g + i1;
      i1 = this.e + this.h + this.f - 50;
      continue;
      i2 = this.d + this.g + this.i / 2 - 25;
      i1 = this.e + this.h + this.f - 50;
      continue;
      i2 = this.d + this.g + this.i - 50;
      i1 = this.e + this.h + this.f - 50;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/yi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */