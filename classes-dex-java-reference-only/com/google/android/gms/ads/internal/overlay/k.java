package com.google.android.gms.ads.internal.overlay;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.ads.internal.d;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abv;
import com.google.android.gms.internal.acy;
import com.google.android.gms.internal.ub;
import com.google.android.gms.internal.uf;
import com.google.android.gms.internal.un;
import java.util.HashMap;

@aaa
public class k
  extends FrameLayout
  implements h
{
  private final acy a;
  private final FrameLayout b;
  private final y c;
  @Nullable
  private i d;
  private boolean e;
  private boolean f;
  private long g;
  private long h;
  private String i;
  
  public k(Context paramContext, acy paramacy, int paramInt, boolean paramBoolean, un paramun)
  {
    super(paramContext);
    this.a = paramacy;
    this.b = new FrameLayout(paramContext);
    addView(this.b, new FrameLayout.LayoutParams(-1, -1));
    n.a(paramacy.h());
    this.d = paramacy.h().b.a(paramContext, paramacy, paramInt, paramBoolean, paramun);
    if (this.d != null)
    {
      this.b.addView(this.d, new FrameLayout.LayoutParams(-1, -1, 17));
      if (((Boolean)uf.B.c()).booleanValue()) {
        l();
      }
    }
    this.c = new y(this);
    this.c.b();
    if (this.d != null) {
      this.d.a(this);
    }
    if (this.d == null) {
      a("AdVideoUnderlay Error", "Allocating player failed.");
    }
  }
  
  public static void a(acy paramacy)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("event", "no_video_view");
    paramacy.a("onVideoEvent", localHashMap);
  }
  
  private void a(String paramString, String... paramVarArgs)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("event", paramString);
    int k = paramVarArgs.length;
    int j = 0;
    paramString = null;
    if (j < k)
    {
      String str = paramVarArgs[j];
      if (paramString == null) {}
      for (paramString = str;; paramString = null)
      {
        j += 1;
        break;
        localHashMap.put(paramString, str);
      }
    }
    this.a.a("onVideoEvent", localHashMap);
  }
  
  private void o()
  {
    if (this.a.f() == null) {
      break label12;
    }
    label12:
    while (this.e) {
      return;
    }
    if ((this.a.f().getWindow().getAttributes().flags & 0x80) != 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.f = bool;
      if (this.f) {
        break;
      }
      this.a.f().getWindow().addFlags(128);
      this.e = true;
      return;
    }
  }
  
  private void p()
  {
    if (this.a.f() == null) {}
    while ((!this.e) || (this.f)) {
      return;
    }
    this.a.f().getWindow().clearFlags(128);
    this.e = false;
  }
  
  public void a()
  {
    abv.a.post(new Runnable()
    {
      public void run()
      {
        k.a(k.this, "surfaceCreated", new String[0]);
      }
    });
  }
  
  public void a(float paramFloat)
  {
    if (this.d == null) {
      return;
    }
    this.d.a(paramFloat);
  }
  
  public void a(float paramFloat1, float paramFloat2)
  {
    if (this.d != null) {
      this.d.a(paramFloat1, paramFloat2);
    }
  }
  
  public void a(int paramInt)
  {
    if (this.d == null) {
      return;
    }
    this.d.a(paramInt);
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt3 == 0) || (paramInt4 == 0)) {
      return;
    }
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(paramInt3, paramInt4);
    localLayoutParams.setMargins(paramInt1, paramInt2, 0, 0);
    this.b.setLayoutParams(localLayoutParams);
    requestLayout();
  }
  
  @TargetApi(14)
  public void a(MotionEvent paramMotionEvent)
  {
    if (this.d == null) {
      return;
    }
    this.d.dispatchTouchEvent(paramMotionEvent);
  }
  
  public void a(String paramString)
  {
    this.i = paramString;
  }
  
  public void a(String paramString1, @Nullable String paramString2)
  {
    a("error", new String[] { "what", paramString1, "extra", paramString2 });
  }
  
  public void b()
  {
    if (this.d == null) {}
    while (this.h != 0L) {
      return;
    }
    a("canplaythrough", new String[] { "duration", String.valueOf(this.d.getDuration() / 1000.0F), "videoWidth", String.valueOf(this.d.getVideoWidth()), "videoHeight", String.valueOf(this.d.getVideoHeight()) });
  }
  
  public void c()
  {
    o();
  }
  
  public void d()
  {
    a("pause", new String[0]);
    p();
  }
  
  public void e()
  {
    a("ended", new String[0]);
    p();
  }
  
  public void f()
  {
    this.h = this.g;
    abv.a.post(new Runnable()
    {
      public void run()
      {
        k.a(k.this, "surfaceDestroyed", new String[0]);
      }
    });
  }
  
  public void g()
  {
    if (this.d == null) {
      return;
    }
    if (!TextUtils.isEmpty(this.i))
    {
      this.d.setVideoPath(this.i);
      return;
    }
    a("no_src", new String[0]);
  }
  
  public void h()
  {
    if (this.d == null) {
      return;
    }
    this.d.d();
  }
  
  public void i()
  {
    if (this.d == null) {
      return;
    }
    this.d.c();
  }
  
  public void j()
  {
    if (this.d == null) {
      return;
    }
    this.d.e();
  }
  
  public void k()
  {
    if (this.d == null) {
      return;
    }
    this.d.f();
  }
  
  @TargetApi(14)
  public void l()
  {
    if (this.d == null) {
      return;
    }
    TextView localTextView = new TextView(this.d.getContext());
    String str = String.valueOf(this.d.a());
    if (str.length() != 0) {}
    for (str = "AdMob - ".concat(str);; str = new String("AdMob - "))
    {
      localTextView.setText(str);
      localTextView.setTextColor(-65536);
      localTextView.setBackgroundColor(65280);
      this.b.addView(localTextView, new FrameLayout.LayoutParams(-2, -2, 17));
      this.b.bringChildToFront(localTextView);
      return;
    }
  }
  
  public void m()
  {
    this.c.a();
    if (this.d != null) {
      this.d.b();
    }
    p();
  }
  
  void n()
  {
    if (this.d == null) {}
    long l;
    do
    {
      return;
      l = this.d.getCurrentPosition();
    } while ((this.g == l) || (l <= 0L));
    a("timeupdate", new String[] { "time", String.valueOf((float)l / 1000.0F) });
    this.g = l;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/overlay/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */