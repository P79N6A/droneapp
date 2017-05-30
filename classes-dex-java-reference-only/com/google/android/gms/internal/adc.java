package com.google.android.gms.internal;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.ac;
import com.google.android.gms.ads.internal.formats.g;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@aaa
class adc
  extends WebView
  implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, acy
{
  private ul A;
  private um B;
  private WeakReference<View.OnClickListener> C;
  private com.google.android.gms.ads.internal.overlay.d D;
  private ack E;
  private int F = -1;
  private int G = -1;
  private int H = -1;
  private int I = -1;
  private Map<String, wi> J;
  private final WindowManager K;
  boolean a = false;
  private final a b;
  private final Object c = new Object();
  @Nullable
  private final ro d;
  private final VersionInfoParcel e;
  private final com.google.android.gms.ads.internal.s f;
  private final com.google.android.gms.ads.internal.d g;
  private acz h;
  private com.google.android.gms.ads.internal.overlay.d i;
  private AdSizeParcel j;
  private boolean k;
  private boolean l;
  private boolean m;
  private boolean n;
  private Boolean o;
  private int p;
  private boolean q = true;
  private String r = "";
  private add s;
  private boolean t;
  private boolean u;
  private g v;
  private int w;
  private int x;
  private ul y;
  private ul z;
  
  protected adc(a parama, AdSizeParcel paramAdSizeParcel, boolean paramBoolean1, boolean paramBoolean2, @Nullable ro paramro, VersionInfoParcel paramVersionInfoParcel, un paramun, com.google.android.gms.ads.internal.s params, com.google.android.gms.ads.internal.d paramd)
  {
    super(parama);
    this.b = parama;
    this.j = paramAdSizeParcel;
    this.m = paramBoolean1;
    this.p = -1;
    this.d = paramro;
    this.e = paramVersionInfoParcel;
    this.f = params;
    this.g = paramd;
    this.K = ((WindowManager)getContext().getSystemService("window"));
    setBackgroundColor(0);
    paramAdSizeParcel = getSettings();
    paramAdSizeParcel.setAllowFileAccess(false);
    paramAdSizeParcel.setJavaScriptEnabled(true);
    paramAdSizeParcel.setSavePassword(false);
    paramAdSizeParcel.setSupportMultipleWindows(true);
    paramAdSizeParcel.setJavaScriptCanOpenWindowsAutomatically(true);
    if (Build.VERSION.SDK_INT >= 21) {
      paramAdSizeParcel.setMixedContentMode(2);
    }
    u.e().a(parama, paramVersionInfoParcel.b, paramAdSizeParcel);
    u.g().a(getContext(), paramAdSizeParcel);
    setDownloadListener(this);
    O();
    if (com.google.android.gms.common.util.s.f()) {
      addJavascriptInterface(new ade(this), "googleAdsJsInterface");
    }
    if (com.google.android.gms.common.util.s.a())
    {
      removeJavascriptInterface("accessibility");
      removeJavascriptInterface("accessibilityTraversal");
    }
    this.E = new ack(this.b.a(), this, this, null);
    a(paramun);
  }
  
  private void L()
  {
    synchronized (this.c)
    {
      this.o = u.i().j();
      Boolean localBoolean = this.o;
      if (localBoolean == null) {}
      try
      {
        evaluateJavascript("(function(){})()", null);
        a(Boolean.valueOf(true));
        return;
      }
      catch (IllegalStateException localIllegalStateException)
      {
        for (;;)
        {
          a(Boolean.valueOf(false));
        }
      }
    }
  }
  
  private void M()
  {
    uj.a(this.B.a(), this.z, new String[] { "aeh2" });
  }
  
  private void N()
  {
    uj.a(this.B.a(), this.z, new String[] { "aebb2" });
  }
  
  private void O()
  {
    for (;;)
    {
      synchronized (this.c)
      {
        if ((this.m) || (this.j.e))
        {
          if (Build.VERSION.SDK_INT < 14)
          {
            abr.a("Disabling hardware acceleration on an overlay.");
            P();
            return;
          }
          abr.a("Enabling hardware acceleration on an overlay.");
          Q();
        }
      }
      if (Build.VERSION.SDK_INT < 18)
      {
        abr.a("Disabling hardware acceleration on an AdView.");
        P();
      }
      else
      {
        abr.a("Enabling hardware acceleration on an AdView.");
        Q();
      }
    }
  }
  
  private void P()
  {
    synchronized (this.c)
    {
      if (!this.n) {
        u.g().c(this);
      }
      this.n = true;
      return;
    }
  }
  
  private void Q()
  {
    synchronized (this.c)
    {
      if (this.n) {
        u.g().b(this);
      }
      this.n = false;
      return;
    }
  }
  
  private void R()
  {
    synchronized (this.c)
    {
      this.J = null;
      return;
    }
  }
  
  private void S()
  {
    if (this.B == null) {}
    un localun;
    do
    {
      return;
      localun = this.B.a();
    } while ((localun == null) || (u.i().e() == null));
    u.i().e().a(localun);
  }
  
  static adc a(Context paramContext, AdSizeParcel paramAdSizeParcel, boolean paramBoolean1, boolean paramBoolean2, @Nullable ro paramro, VersionInfoParcel paramVersionInfoParcel, un paramun, com.google.android.gms.ads.internal.s params, com.google.android.gms.ads.internal.d paramd)
  {
    return new adc(new a(paramContext), paramAdSizeParcel, paramBoolean1, paramBoolean2, paramro, paramVersionInfoParcel, paramun, params, paramd);
  }
  
  private void a(un paramun)
  {
    S();
    this.B = new um(new un(true, "make_wv", this.j.b));
    this.B.a().a(paramun);
    this.z = uj.a(this.B.a());
    this.B.a("native:view_create", this.z);
    this.A = null;
    this.y = null;
  }
  
  private void e(boolean paramBoolean)
  {
    HashMap localHashMap = new HashMap();
    if (paramBoolean) {}
    for (String str = "1";; str = "0")
    {
      localHashMap.put("isVisible", str);
      a("onAdVisibilityChanged", localHashMap);
      return;
    }
  }
  
  public boolean A()
  {
    for (;;)
    {
      synchronized (this.c)
      {
        if (this.w > 0)
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  public void B()
  {
    this.E.a();
  }
  
  public void C()
  {
    synchronized (this.c)
    {
      this.a = true;
      if (this.f != null) {
        this.f.C();
      }
      return;
    }
  }
  
  public void D()
  {
    synchronized (this.c)
    {
      this.a = false;
      if (this.f != null) {
        this.f.D();
      }
      return;
    }
  }
  
  public void E()
  {
    if (this.A == null)
    {
      this.A = uj.a(this.B.a());
      this.B.a("native:view_load", this.A);
    }
  }
  
  public View.OnClickListener F()
  {
    return (View.OnClickListener)this.C.get();
  }
  
  public g G()
  {
    synchronized (this.c)
    {
      g localg = this.v;
      return localg;
    }
  }
  
  public void H()
  {
    setBackgroundColor(0);
  }
  
  public boolean I()
  {
    if ((!l().b()) && (!l().c())) {
      return false;
    }
    DisplayMetrics localDisplayMetrics = u.e().a(this.K);
    int i3 = ac.a().b(localDisplayMetrics, localDisplayMetrics.widthPixels);
    int i4 = ac.a().b(localDisplayMetrics, localDisplayMetrics.heightPixels);
    Object localObject = f();
    int i2;
    int i1;
    if ((localObject == null) || (((Activity)localObject).getWindow() == null))
    {
      i2 = i4;
      i1 = i3;
      label87:
      if ((this.G == i3) && (this.F == i4) && (this.H == i1) && (this.I == i2)) {
        break label234;
      }
      if ((this.G == i3) && (this.F == i4)) {
        break label236;
      }
    }
    label234:
    label236:
    for (boolean bool = true;; bool = false)
    {
      this.G = i3;
      this.F = i4;
      this.H = i1;
      this.I = i2;
      new yn(this).a(i3, i4, i1, i2, localDisplayMetrics.density, this.K.getDefaultDisplay().getRotation());
      return bool;
      localObject = u.e().a((Activity)localObject);
      i1 = ac.a().b(localDisplayMetrics, localObject[0]);
      i2 = ac.a().b(localDisplayMetrics, localObject[1]);
      break label87;
      break;
    }
  }
  
  Boolean J()
  {
    synchronized (this.c)
    {
      Boolean localBoolean = this.o;
      return localBoolean;
    }
  }
  
  vt K()
  {
    return new adc.1(this);
  }
  
  public WebView a()
  {
    return this;
  }
  
  public void a(int paramInt)
  {
    if (paramInt == 0) {
      N();
    }
    M();
    if (this.B.a() != null) {
      this.B.a().a("close_type", String.valueOf(paramInt));
    }
    HashMap localHashMap = new HashMap(2);
    localHashMap.put("closetype", String.valueOf(paramInt));
    localHashMap.put("version", this.e.b);
    a("onhide", localHashMap);
  }
  
  public void a(Context paramContext)
  {
    this.b.setBaseContext(paramContext);
    this.E.a(this.b.a());
  }
  
  public void a(Context paramContext, AdSizeParcel paramAdSizeParcel, un paramun)
  {
    synchronized (this.c)
    {
      this.E.b();
      a(paramContext);
      this.i = null;
      this.j = paramAdSizeParcel;
      this.m = false;
      this.k = false;
      this.r = "";
      this.p = -1;
      u.g().b(this);
      loadUrl("about:blank");
      this.h.m();
      setOnTouchListener(null);
      setOnClickListener(null);
      this.q = true;
      this.a = false;
      this.s = null;
      a(paramun);
      this.t = false;
      this.w = 0;
      u.B().a(this);
      R();
      return;
    }
  }
  
  public void a(AdSizeParcel paramAdSizeParcel)
  {
    synchronized (this.c)
    {
      this.j = paramAdSizeParcel;
      requestLayout();
      return;
    }
  }
  
  public void a(g paramg)
  {
    synchronized (this.c)
    {
      this.v = paramg;
      return;
    }
  }
  
  public void a(com.google.android.gms.ads.internal.overlay.d paramd)
  {
    synchronized (this.c)
    {
      this.i = paramd;
      return;
    }
  }
  
  public void a(add paramadd)
  {
    synchronized (this.c)
    {
      if (this.s != null)
      {
        abr.b("Attempt to create multiple AdWebViewVideoControllers.");
        return;
      }
      this.s = paramadd;
      return;
    }
  }
  
  public void a(tf arg1, boolean paramBoolean)
  {
    synchronized (this.c)
    {
      this.t = paramBoolean;
      e(paramBoolean);
      return;
    }
  }
  
  void a(Boolean paramBoolean)
  {
    synchronized (this.c)
    {
      this.o = paramBoolean;
      u.i().a(paramBoolean);
      return;
    }
  }
  
  public void a(String paramString)
  {
    synchronized (this.c)
    {
      try
      {
        super.loadUrl(paramString);
        return;
      }
      catch (Throwable paramString)
      {
        for (;;)
        {
          paramString = String.valueOf(paramString);
          abr.d(String.valueOf(paramString).length() + 24 + "Could not call loadUrl. " + paramString);
        }
      }
    }
  }
  
  @TargetApi(19)
  protected void a(String paramString, ValueCallback<String> paramValueCallback)
  {
    synchronized (this.c)
    {
      if (!r()) {
        evaluateJavascript(paramString, paramValueCallback);
      }
      do
      {
        return;
        abr.d("The webview is destroyed. Ignoring action.");
      } while (paramValueCallback == null);
      paramValueCallback.onReceiveValue(null);
    }
  }
  
  public void a(String paramString, vt paramvt)
  {
    if (this.h != null) {
      this.h.a(paramString, paramvt);
    }
  }
  
  public void a(String paramString1, String paramString2)
  {
    d(String.valueOf(paramString1).length() + 3 + String.valueOf(paramString2).length() + paramString1 + "(" + paramString2 + ");");
  }
  
  public void a(String paramString, Map<String, ?> paramMap)
  {
    try
    {
      paramMap = u.e().a(paramMap);
      b(paramString, paramMap);
      return;
    }
    catch (JSONException paramString)
    {
      abr.d("Could not convert parameters to JSON.");
    }
  }
  
  public void a(String paramString, JSONObject paramJSONObject)
  {
    JSONObject localJSONObject = paramJSONObject;
    if (paramJSONObject == null) {
      localJSONObject = new JSONObject();
    }
    a(paramString, localJSONObject.toString());
  }
  
  public void a(boolean paramBoolean)
  {
    synchronized (this.c)
    {
      this.m = paramBoolean;
      O();
      return;
    }
  }
  
  public View b()
  {
    return this;
  }
  
  public void b(int paramInt)
  {
    synchronized (this.c)
    {
      this.p = paramInt;
      if (this.i != null) {
        this.i.a(this.p);
      }
      return;
    }
  }
  
  public void b(com.google.android.gms.ads.internal.overlay.d paramd)
  {
    synchronized (this.c)
    {
      this.D = paramd;
      return;
    }
  }
  
  public void b(String paramString)
  {
    Object localObject = this.c;
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    try
    {
      this.r = str;
      return;
    }
    finally {}
  }
  
  public void b(String paramString, vt paramvt)
  {
    if (this.h != null) {
      this.h.b(paramString, paramvt);
    }
  }
  
  public void b(String paramString, JSONObject paramJSONObject)
  {
    Object localObject = paramJSONObject;
    if (paramJSONObject == null) {
      localObject = new JSONObject();
    }
    localObject = ((JSONObject)localObject).toString();
    paramJSONObject = new StringBuilder();
    paramJSONObject.append("(window.AFMA_ReceiveMessage || function() {})('");
    paramJSONObject.append(paramString);
    paramJSONObject.append("'");
    paramJSONObject.append(",");
    paramJSONObject.append((String)localObject);
    paramJSONObject.append(");");
    paramString = String.valueOf(paramJSONObject.toString());
    if (paramString.length() != 0) {}
    for (paramString = "Dispatching AFMA event: ".concat(paramString);; paramString = new String("Dispatching AFMA event: "))
    {
      abr.a(paramString);
      d(paramJSONObject.toString());
      return;
    }
  }
  
  public void b(boolean paramBoolean)
  {
    synchronized (this.c)
    {
      if (this.i != null)
      {
        this.i.a(this.h.b(), paramBoolean);
        return;
      }
      this.k = paramBoolean;
    }
  }
  
  public void c()
  {
    M();
    HashMap localHashMap = new HashMap(1);
    localHashMap.put("version", this.e.b);
    a("onhide", localHashMap);
  }
  
  protected void c(String paramString)
  {
    synchronized (this.c)
    {
      if (!r())
      {
        loadUrl(paramString);
        return;
      }
      abr.d("The webview is destroyed. Ignoring action.");
    }
  }
  
  public void c(boolean paramBoolean)
  {
    synchronized (this.c)
    {
      this.q = paramBoolean;
      return;
    }
  }
  
  public void d()
  {
    if (this.y == null)
    {
      uj.a(this.B.a(), this.z, new String[] { "aes2" });
      this.y = uj.a(this.B.a());
      this.B.a("native:view_show", this.y);
    }
    HashMap localHashMap = new HashMap(1);
    localHashMap.put("version", this.e.b);
    a("onshow", localHashMap);
  }
  
  protected void d(String paramString)
  {
    if (com.google.android.gms.common.util.s.h())
    {
      if (J() == null) {
        L();
      }
      if (J().booleanValue())
      {
        a(paramString, null);
        return;
      }
      paramString = String.valueOf(paramString);
      if (paramString.length() != 0) {}
      for (paramString = "javascript:".concat(paramString);; paramString = new String("javascript:"))
      {
        c(paramString);
        return;
      }
    }
    paramString = String.valueOf(paramString);
    if (paramString.length() != 0) {}
    for (paramString = "javascript:".concat(paramString);; paramString = new String("javascript:"))
    {
      c(paramString);
      return;
    }
  }
  
  public void d(boolean paramBoolean)
  {
    for (;;)
    {
      synchronized (this.c)
      {
        int i2 = this.w;
        if (paramBoolean)
        {
          i1 = 1;
          this.w = (i1 + i2);
          if ((this.w <= 0) && (this.i != null)) {
            this.i.s();
          }
          return;
        }
      }
      int i1 = -1;
    }
  }
  
  public void destroy()
  {
    synchronized (this.c)
    {
      S();
      this.E.b();
      if (this.i != null)
      {
        this.i.a();
        this.i.k();
        this.i = null;
      }
      this.h.m();
      if (this.l) {
        return;
      }
      u.B().a(this);
      R();
      this.l = true;
      abr.e("Initiating WebView self destruct sequence in 3...");
      this.h.g();
      return;
    }
  }
  
  public void e()
  {
    HashMap localHashMap = new HashMap(3);
    localHashMap.put("app_muted", String.valueOf(u.e().h()));
    localHashMap.put("app_volume", String.valueOf(u.e().g()));
    localHashMap.put("device_volume", String.valueOf(u.e().j(getContext())));
    a("volume", localHashMap);
  }
  
  @TargetApi(19)
  public void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback)
  {
    synchronized (this.c)
    {
      if (r())
      {
        abr.d("The webview is destroyed. Ignoring action.");
        if (paramValueCallback != null) {
          paramValueCallback.onReceiveValue(null);
        }
        return;
      }
      super.evaluateJavascript(paramString, paramValueCallback);
      return;
    }
  }
  
  public Activity f()
  {
    return this.b.a();
  }
  
  protected void finalize()
  {
    synchronized (this.c)
    {
      if (!this.l)
      {
        this.h.m();
        u.B().a(this);
        R();
      }
      super.finalize();
      return;
    }
  }
  
  public Context g()
  {
    return this.b.b();
  }
  
  public com.google.android.gms.ads.internal.d h()
  {
    return this.g;
  }
  
  public com.google.android.gms.ads.internal.overlay.d i()
  {
    synchronized (this.c)
    {
      com.google.android.gms.ads.internal.overlay.d locald = this.i;
      return locald;
    }
  }
  
  public com.google.android.gms.ads.internal.overlay.d j()
  {
    synchronized (this.c)
    {
      com.google.android.gms.ads.internal.overlay.d locald = this.D;
      return locald;
    }
  }
  
  public AdSizeParcel k()
  {
    synchronized (this.c)
    {
      AdSizeParcel localAdSizeParcel = this.j;
      return localAdSizeParcel;
    }
  }
  
  public acz l()
  {
    return this.h;
  }
  
  public void loadData(String paramString1, String paramString2, String paramString3)
  {
    synchronized (this.c)
    {
      if (!r())
      {
        super.loadData(paramString1, paramString2, paramString3);
        return;
      }
      abr.d("The webview is destroyed. Ignoring action.");
    }
  }
  
  public void loadDataWithBaseURL(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    synchronized (this.c)
    {
      if (!r())
      {
        super.loadDataWithBaseURL(paramString1, paramString2, paramString3, paramString4, paramString5);
        return;
      }
      abr.d("The webview is destroyed. Ignoring action.");
    }
  }
  
  public void loadUrl(String paramString)
  {
    for (;;)
    {
      synchronized (this.c)
      {
        boolean bool = r();
        if (!bool) {
          try
          {
            super.loadUrl(paramString);
            return;
          }
          catch (Throwable paramString)
          {
            paramString = String.valueOf(paramString);
            abr.d(String.valueOf(paramString).length() + 24 + "Could not call loadUrl. " + paramString);
            continue;
          }
        }
      }
      abr.d("The webview is destroyed. Ignoring action.");
    }
  }
  
  public boolean m()
  {
    synchronized (this.c)
    {
      boolean bool = this.k;
      return bool;
    }
  }
  
  public ro n()
  {
    return this.d;
  }
  
  public VersionInfoParcel o()
  {
    return this.e;
  }
  
  protected void onAttachedToWindow()
  {
    boolean bool2 = true;
    for (;;)
    {
      synchronized (this.c)
      {
        super.onAttachedToWindow();
        if (!r()) {
          this.E.c();
        }
        boolean bool1 = this.t;
        if ((l() != null) && (l().c()))
        {
          bool1 = bool2;
          if (!this.u)
          {
            Object localObject2 = l().d();
            if (localObject2 != null) {
              u.C().a(b(), (ViewTreeObserver.OnGlobalLayoutListener)localObject2);
            }
            localObject2 = l().e();
            if (localObject2 != null) {
              u.C().a(b(), (ViewTreeObserver.OnScrollChangedListener)localObject2);
            }
            this.u = true;
            bool1 = bool2;
          }
          e(bool1);
          return;
        }
      }
    }
  }
  
  protected void onDetachedFromWindow()
  {
    synchronized (this.c)
    {
      if (!r()) {
        this.E.d();
      }
      super.onDetachedFromWindow();
      if ((this.u) && (l() != null) && (l().c()) && (getViewTreeObserver() != null) && (getViewTreeObserver().isAlive()))
      {
        Object localObject2 = l().d();
        if (localObject2 != null) {
          u.g().a(getViewTreeObserver(), (ViewTreeObserver.OnGlobalLayoutListener)localObject2);
        }
        localObject2 = l().e();
        if (localObject2 != null) {
          getViewTreeObserver().removeOnScrollChangedListener((ViewTreeObserver.OnScrollChangedListener)localObject2);
        }
        this.u = false;
      }
      e(false);
      return;
    }
  }
  
  public void onDownloadStart(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong)
  {
    try
    {
      paramString2 = new Intent("android.intent.action.VIEW");
      paramString2.setDataAndType(Uri.parse(paramString1), paramString4);
      u.e().a(getContext(), paramString2);
      return;
    }
    catch (ActivityNotFoundException paramString2)
    {
      abr.a(String.valueOf(paramString1).length() + 51 + String.valueOf(paramString4).length() + "Couldn't find an Activity to view url/mimetype: " + paramString1 + " / " + paramString4);
    }
  }
  
  @TargetApi(21)
  protected void onDraw(Canvas paramCanvas)
  {
    if (r()) {}
    do
    {
      do
      {
        return;
      } while ((Build.VERSION.SDK_INT == 21) && (paramCanvas.isHardwareAccelerated()) && (!isAttachedToWindow()));
      super.onDraw(paramCanvas);
    } while ((l() == null) || (l().n() == null));
    l().n().a();
  }
  
  public boolean onGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    if (((Boolean)uf.ak.c()).booleanValue())
    {
      float f1 = paramMotionEvent.getAxisValue(9);
      float f2 = paramMotionEvent.getAxisValue(10);
      if (paramMotionEvent.getActionMasked() == 8) {}
      for (int i1 = 1; (i1 != 0) && (((f1 > 0.0F) && (!canScrollVertically(-1))) || ((f1 < 0.0F) && (!canScrollVertically(1))) || ((f2 > 0.0F) && (!canScrollHorizontally(-1))) || ((f2 < 0.0F) && (!canScrollHorizontally(1)))); i1 = 0) {
        return false;
      }
    }
    return super.onGenericMotionEvent(paramMotionEvent);
  }
  
  public void onGlobalLayout()
  {
    boolean bool = I();
    com.google.android.gms.ads.internal.overlay.d locald = i();
    if ((locald != null) && (bool)) {
      locald.p();
    }
  }
  
  @SuppressLint({"DrawAllocation"})
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i3 = Integer.MAX_VALUE;
    synchronized (this.c)
    {
      if (r())
      {
        setMeasuredDimension(0, 0);
        return;
      }
      if ((isInEditMode()) || (this.m) || (this.j.i))
      {
        super.onMeasure(paramInt1, paramInt2);
        return;
      }
    }
    float f1;
    int i1;
    if (this.j.j)
    {
      if ((((Boolean)uf.bS.c()).booleanValue()) || (!com.google.android.gms.common.util.s.f()))
      {
        super.onMeasure(paramInt1, paramInt2);
        return;
      }
      a("/contentHeight", K());
      d("(function() {  var height = -1;  if (document.body) { height = document.body.offsetHeight;}  else if (document.documentElement) {      height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  window.googleAdsJsInterface.notify(url);  })();");
      f1 = this.b.getResources().getDisplayMetrics().density;
      i1 = View.MeasureSpec.getSize(paramInt1);
    }
    int i4;
    int i2;
    switch (this.x)
    {
    case -1: 
      for (paramInt1 = (int)(f1 * this.x);; paramInt1 = View.MeasureSpec.getSize(paramInt2))
      {
        setMeasuredDimension(i1, paramInt1);
        return;
      }
      if (this.j.e)
      {
        DisplayMetrics localDisplayMetrics = new DisplayMetrics();
        this.K.getDefaultDisplay().getMetrics(localDisplayMetrics);
        setMeasuredDimension(localDisplayMetrics.widthPixels, localDisplayMetrics.heightPixels);
        return;
      }
      int i5 = View.MeasureSpec.getMode(paramInt1);
      i1 = View.MeasureSpec.getSize(paramInt1);
      i4 = View.MeasureSpec.getMode(paramInt2);
      i2 = View.MeasureSpec.getSize(paramInt2);
      if (i5 != Integer.MIN_VALUE) {
        if (i5 != 1073741824) {
          break;
        }
      }
      break;
    }
    for (;;)
    {
      if ((this.j.g > paramInt1) || (this.j.d > paramInt2))
      {
        f1 = this.b.getResources().getDisplayMetrics().density;
        paramInt1 = (int)(this.j.g / f1);
        paramInt2 = (int)(this.j.d / f1);
        i1 = (int)(i1 / f1);
        i2 = (int)(i2 / f1);
        abr.d(103 + "Not enough space to show ad. Needs " + paramInt1 + "x" + paramInt2 + " dp, but only has " + i1 + "x" + i2 + " dp.");
        if (getVisibility() != 8) {
          setVisibility(4);
        }
        setMeasuredDimension(0, 0);
      }
      for (;;)
      {
        return;
        if (getVisibility() != 8) {
          setVisibility(0);
        }
        setMeasuredDimension(this.j.g, this.j.d);
      }
      paramInt1 = Integer.MAX_VALUE;
      break label509;
      break;
      paramInt1 = i1;
      label509:
      if (i4 != Integer.MIN_VALUE)
      {
        paramInt2 = i3;
        if (i4 != 1073741824) {}
      }
      else
      {
        paramInt2 = i2;
      }
    }
  }
  
  public void onPause()
  {
    if (r()) {}
    for (;;)
    {
      return;
      try
      {
        if (com.google.android.gms.common.util.s.a())
        {
          super.onPause();
          return;
        }
      }
      catch (Exception localException)
      {
        abr.b("Could not pause webview.", localException);
      }
    }
  }
  
  public void onResume()
  {
    if (r()) {}
    for (;;)
    {
      return;
      try
      {
        if (com.google.android.gms.common.util.s.a())
        {
          super.onResume();
          return;
        }
      }
      catch (Exception localException)
      {
        abr.b("Could not resume webview.", localException);
      }
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (l().c()) {}
    for (;;)
    {
      synchronized (this.c)
      {
        if (this.v != null) {
          this.v.a(paramMotionEvent);
        }
        if (!r()) {
          break;
        }
        return false;
      }
      if (this.d != null) {
        this.d.a(paramMotionEvent);
      }
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public boolean p()
  {
    synchronized (this.c)
    {
      boolean bool = this.m;
      return bool;
    }
  }
  
  public int q()
  {
    synchronized (this.c)
    {
      int i1 = this.p;
      return i1;
    }
  }
  
  public boolean r()
  {
    synchronized (this.c)
    {
      boolean bool = this.l;
      return bool;
    }
  }
  
  public void s()
  {
    synchronized (this.c)
    {
      abr.e("Destroying WebView!");
      abv.a.post(new adc.2(this));
      return;
    }
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.C = new WeakReference(paramOnClickListener);
    super.setOnClickListener(paramOnClickListener);
  }
  
  public void setWebViewClient(WebViewClient paramWebViewClient)
  {
    super.setWebViewClient(paramWebViewClient);
    if ((paramWebViewClient instanceof acz)) {
      this.h = ((acz)paramWebViewClient);
    }
  }
  
  public void stopLoading()
  {
    if (r()) {
      return;
    }
    try
    {
      super.stopLoading();
      return;
    }
    catch (Exception localException)
    {
      abr.b("Could not stop loading webview.", localException);
    }
  }
  
  public boolean t()
  {
    synchronized (this.c)
    {
      boolean bool = this.q;
      return bool;
    }
  }
  
  public boolean u()
  {
    synchronized (this.c)
    {
      boolean bool = this.a;
      return bool;
    }
  }
  
  public String v()
  {
    synchronized (this.c)
    {
      String str = this.r;
      return str;
    }
  }
  
  public acx w()
  {
    return null;
  }
  
  public ul x()
  {
    return this.z;
  }
  
  public um y()
  {
    return this.B;
  }
  
  public add z()
  {
    synchronized (this.c)
    {
      add localadd = this.s;
      return localadd;
    }
  }
  
  @aaa
  public static class a
    extends MutableContextWrapper
  {
    private Activity a;
    private Context b;
    private Context c;
    
    public a(Context paramContext)
    {
      super();
      setBaseContext(paramContext);
    }
    
    public Activity a()
    {
      return this.a;
    }
    
    public Context b()
    {
      return this.c;
    }
    
    public Object getSystemService(String paramString)
    {
      return this.c.getSystemService(paramString);
    }
    
    public void setBaseContext(Context paramContext)
    {
      this.b = paramContext.getApplicationContext();
      if ((paramContext instanceof Activity)) {}
      for (Activity localActivity = (Activity)paramContext;; localActivity = null)
      {
        this.a = localActivity;
        this.c = paramContext;
        super.setBaseContext(this.b);
        return;
      }
    }
    
    public void startActivity(Intent paramIntent)
    {
      if (this.a != null)
      {
        this.a.startActivity(paramIntent);
        return;
      }
      paramIntent.setFlags(268435456);
      this.b.startActivity(paramIntent);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/adc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */