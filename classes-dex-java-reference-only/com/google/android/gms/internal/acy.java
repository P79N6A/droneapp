package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.g;
import com.google.android.gms.ads.internal.s;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Map;
import org.json.JSONObject;

@aaa
public abstract interface acy
  extends s, tg, wy
{
  public abstract boolean A();
  
  public abstract void B();
  
  public abstract void E();
  
  @Nullable
  public abstract View.OnClickListener F();
  
  public abstract g G();
  
  public abstract void H();
  
  public abstract WebView a();
  
  public abstract void a(int paramInt);
  
  public abstract void a(Context paramContext);
  
  public abstract void a(Context paramContext, AdSizeParcel paramAdSizeParcel, un paramun);
  
  public abstract void a(AdSizeParcel paramAdSizeParcel);
  
  public abstract void a(g paramg);
  
  public abstract void a(com.google.android.gms.ads.internal.overlay.d paramd);
  
  public abstract void a(add paramadd);
  
  public abstract void a(String paramString);
  
  public abstract void a(String paramString1, String paramString2);
  
  public abstract void a(String paramString, Map<String, ?> paramMap);
  
  public abstract void a(String paramString, JSONObject paramJSONObject);
  
  public abstract void a(boolean paramBoolean);
  
  public abstract View b();
  
  public abstract void b(int paramInt);
  
  public abstract void b(com.google.android.gms.ads.internal.overlay.d paramd);
  
  public abstract void b(String paramString);
  
  public abstract void b(boolean paramBoolean);
  
  public abstract void c();
  
  public abstract void c(boolean paramBoolean);
  
  public abstract void d();
  
  public abstract void d(boolean paramBoolean);
  
  public abstract void destroy();
  
  public abstract void e();
  
  public abstract Activity f();
  
  public abstract Context g();
  
  public abstract Context getContext();
  
  public abstract ViewGroup.LayoutParams getLayoutParams();
  
  public abstract void getLocationOnScreen(int[] paramArrayOfInt);
  
  public abstract int getMeasuredHeight();
  
  public abstract int getMeasuredWidth();
  
  public abstract ViewParent getParent();
  
  public abstract com.google.android.gms.ads.internal.d h();
  
  public abstract com.google.android.gms.ads.internal.overlay.d i();
  
  public abstract com.google.android.gms.ads.internal.overlay.d j();
  
  public abstract AdSizeParcel k();
  
  @Nullable
  public abstract acz l();
  
  public abstract void loadData(String paramString1, String paramString2, String paramString3);
  
  public abstract void loadDataWithBaseURL(String paramString1, String paramString2, String paramString3, String paramString4, @Nullable String paramString5);
  
  public abstract void loadUrl(String paramString);
  
  public abstract boolean m();
  
  public abstract void measure(int paramInt1, int paramInt2);
  
  public abstract ro n();
  
  public abstract VersionInfoParcel o();
  
  public abstract void onPause();
  
  public abstract void onResume();
  
  public abstract boolean p();
  
  public abstract int q();
  
  public abstract boolean r();
  
  public abstract void s();
  
  public abstract void setBackgroundColor(int paramInt);
  
  public abstract void setOnClickListener(View.OnClickListener paramOnClickListener);
  
  public abstract void setOnTouchListener(View.OnTouchListener paramOnTouchListener);
  
  public abstract void setWebChromeClient(WebChromeClient paramWebChromeClient);
  
  public abstract void setWebViewClient(WebViewClient paramWebViewClient);
  
  public abstract void stopLoading();
  
  public abstract boolean t();
  
  public abstract boolean u();
  
  public abstract String v();
  
  @Nullable
  public abstract acx w();
  
  @Nullable
  public abstract ul x();
  
  public abstract um y();
  
  @Nullable
  public abstract add z();
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/acy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */