package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.g;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Map;
import org.json.JSONObject;

@aaa
class adb
  extends FrameLayout
  implements acy
{
  private static final int a = Color.argb(0, 0, 0, 0);
  private final acy b;
  private final acx c;
  
  public adb(acy paramacy)
  {
    super(paramacy.getContext());
    this.b = paramacy;
    this.c = new acx(paramacy.g(), this, this);
    paramacy = this.b.l();
    if (paramacy != null) {
      paramacy.a(this);
    }
    addView(this.b.b());
  }
  
  public boolean A()
  {
    return this.b.A();
  }
  
  public void B()
  {
    this.b.B();
  }
  
  public void C()
  {
    this.b.C();
  }
  
  public void D()
  {
    this.b.D();
  }
  
  public void E()
  {
    this.b.E();
  }
  
  public View.OnClickListener F()
  {
    return this.b.F();
  }
  
  @Nullable
  public g G()
  {
    return this.b.G();
  }
  
  public void H()
  {
    setBackgroundColor(a);
    this.b.setBackgroundColor(a);
  }
  
  public WebView a()
  {
    return this.b.a();
  }
  
  public void a(int paramInt)
  {
    this.b.a(paramInt);
  }
  
  public void a(Context paramContext)
  {
    this.b.a(paramContext);
  }
  
  public void a(Context paramContext, AdSizeParcel paramAdSizeParcel, un paramun)
  {
    this.c.c();
    this.b.a(paramContext, paramAdSizeParcel, paramun);
  }
  
  public void a(AdSizeParcel paramAdSizeParcel)
  {
    this.b.a(paramAdSizeParcel);
  }
  
  public void a(@Nullable g paramg)
  {
    this.b.a(paramg);
  }
  
  public void a(com.google.android.gms.ads.internal.overlay.d paramd)
  {
    this.b.a(paramd);
  }
  
  public void a(add paramadd)
  {
    this.b.a(paramadd);
  }
  
  public void a(tf paramtf, boolean paramBoolean)
  {
    this.b.a(paramtf, paramBoolean);
  }
  
  public void a(String paramString)
  {
    this.b.a(paramString);
  }
  
  public void a(String paramString, vt paramvt)
  {
    this.b.a(paramString, paramvt);
  }
  
  public void a(String paramString1, String paramString2)
  {
    this.b.a(paramString1, paramString2);
  }
  
  public void a(String paramString, Map<String, ?> paramMap)
  {
    this.b.a(paramString, paramMap);
  }
  
  public void a(String paramString, JSONObject paramJSONObject)
  {
    this.b.a(paramString, paramJSONObject);
  }
  
  public void a(boolean paramBoolean)
  {
    this.b.a(paramBoolean);
  }
  
  public View b()
  {
    return this;
  }
  
  public void b(int paramInt)
  {
    this.b.b(paramInt);
  }
  
  public void b(com.google.android.gms.ads.internal.overlay.d paramd)
  {
    this.b.b(paramd);
  }
  
  public void b(String paramString)
  {
    this.b.b(paramString);
  }
  
  public void b(String paramString, vt paramvt)
  {
    this.b.b(paramString, paramvt);
  }
  
  public void b(String paramString, JSONObject paramJSONObject)
  {
    this.b.b(paramString, paramJSONObject);
  }
  
  public void b(boolean paramBoolean)
  {
    this.b.b(paramBoolean);
  }
  
  public void c()
  {
    this.b.c();
  }
  
  public void c(boolean paramBoolean)
  {
    this.b.c(paramBoolean);
  }
  
  public void d()
  {
    this.b.d();
  }
  
  public void d(boolean paramBoolean)
  {
    this.b.d(paramBoolean);
  }
  
  public void destroy()
  {
    this.b.destroy();
  }
  
  public void e()
  {
    this.b.e();
  }
  
  public Activity f()
  {
    return this.b.f();
  }
  
  public Context g()
  {
    return this.b.g();
  }
  
  public com.google.android.gms.ads.internal.d h()
  {
    return this.b.h();
  }
  
  public com.google.android.gms.ads.internal.overlay.d i()
  {
    return this.b.i();
  }
  
  public com.google.android.gms.ads.internal.overlay.d j()
  {
    return this.b.j();
  }
  
  public AdSizeParcel k()
  {
    return this.b.k();
  }
  
  public acz l()
  {
    return this.b.l();
  }
  
  public void loadData(String paramString1, String paramString2, String paramString3)
  {
    this.b.loadData(paramString1, paramString2, paramString3);
  }
  
  public void loadDataWithBaseURL(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    this.b.loadDataWithBaseURL(paramString1, paramString2, paramString3, paramString4, paramString5);
  }
  
  public void loadUrl(String paramString)
  {
    this.b.loadUrl(paramString);
  }
  
  public boolean m()
  {
    return this.b.m();
  }
  
  public ro n()
  {
    return this.b.n();
  }
  
  public VersionInfoParcel o()
  {
    return this.b.o();
  }
  
  public void onPause()
  {
    this.c.b();
    this.b.onPause();
  }
  
  public void onResume()
  {
    this.b.onResume();
  }
  
  public boolean p()
  {
    return this.b.p();
  }
  
  public int q()
  {
    return this.b.q();
  }
  
  public boolean r()
  {
    return this.b.r();
  }
  
  public void s()
  {
    this.c.c();
    this.b.s();
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.b.setOnClickListener(paramOnClickListener);
  }
  
  public void setOnTouchListener(View.OnTouchListener paramOnTouchListener)
  {
    this.b.setOnTouchListener(paramOnTouchListener);
  }
  
  public void setWebChromeClient(WebChromeClient paramWebChromeClient)
  {
    this.b.setWebChromeClient(paramWebChromeClient);
  }
  
  public void setWebViewClient(WebViewClient paramWebViewClient)
  {
    this.b.setWebViewClient(paramWebViewClient);
  }
  
  public void stopLoading()
  {
    this.b.stopLoading();
  }
  
  public boolean t()
  {
    return this.b.t();
  }
  
  public boolean u()
  {
    return this.b.u();
  }
  
  public String v()
  {
    return this.b.v();
  }
  
  public acx w()
  {
    return this.c;
  }
  
  public ul x()
  {
    return this.b.x();
  }
  
  public um y()
  {
    return this.b.y();
  }
  
  public add z()
  {
    return this.b.z();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/adb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */