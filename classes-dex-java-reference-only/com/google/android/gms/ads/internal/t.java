package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.SearchAdRequestParcel;
import com.google.android.gms.ads.internal.client.VideoOptionsParcel;
import com.google.android.gms.ads.internal.client.ac;
import com.google.android.gms.ads.internal.client.af;
import com.google.android.gms.ads.internal.client.ag;
import com.google.android.gms.ads.internal.client.ak.a;
import com.google.android.gms.ads.internal.client.am;
import com.google.android.gms.ads.internal.client.ao;
import com.google.android.gms.ads.internal.client.c;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.a;
import com.google.android.gms.c.e;
import com.google.android.gms.c.f;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.abu;
import com.google.android.gms.internal.sy;
import com.google.android.gms.internal.sz;
import com.google.android.gms.internal.ub;
import com.google.android.gms.internal.uf;
import com.google.android.gms.internal.ur;
import com.google.android.gms.internal.yy;
import com.google.android.gms.internal.zd;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@aaa
public class t
  extends ak.a
{
  private final VersionInfoParcel a;
  private final AdSizeParcel b;
  private final Future<sy> c;
  private final Context d;
  private final b e;
  @Nullable
  private WebView f;
  @Nullable
  private ag g;
  @Nullable
  private sy h;
  private AsyncTask<Void, Void, Void> i;
  
  public t(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, VersionInfoParcel paramVersionInfoParcel)
  {
    this.d = paramContext;
    this.a = paramVersionInfoParcel;
    this.b = paramAdSizeParcel;
    this.f = new WebView(this.d);
    this.c = p();
    this.e = new b(paramString);
    o();
  }
  
  private String c(String paramString)
  {
    if (this.h == null) {
      return paramString;
    }
    paramString = Uri.parse(paramString);
    try
    {
      Uri localUri = this.h.b(paramString, this.d);
      paramString = localUri;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        abr.d("Unable to process ad data", localRemoteException);
      }
    }
    catch (sz localsz)
    {
      for (;;)
      {
        abr.d("Unable to parse ad click url", localsz);
      }
    }
    return paramString.toString();
  }
  
  private void d(String paramString)
  {
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.setData(Uri.parse(paramString));
    this.d.startActivity(localIntent);
  }
  
  private void o()
  {
    a(0);
    this.f.setVerticalScrollBarEnabled(false);
    this.f.getSettings().setJavaScriptEnabled(true);
    this.f.setWebViewClient(new WebViewClient()
    {
      public void onReceivedError(WebView paramAnonymousWebView, WebResourceRequest paramAnonymousWebResourceRequest, WebResourceError paramAnonymousWebResourceError)
      {
        if (t.a(t.this) != null) {}
        try
        {
          t.a(t.this).a(0);
          return;
        }
        catch (RemoteException paramAnonymousWebView)
        {
          abr.d("Could not call AdListener.onAdFailedToLoad().", paramAnonymousWebView);
        }
      }
      
      public boolean shouldOverrideUrlLoading(WebView paramAnonymousWebView, String paramAnonymousString)
      {
        if (paramAnonymousString.startsWith(t.this.n())) {
          return false;
        }
        if (paramAnonymousString.startsWith((String)uf.ci.c()))
        {
          if (t.a(t.this) != null) {}
          try
          {
            t.a(t.this).a(3);
            t.this.a(0);
            return true;
          }
          catch (RemoteException paramAnonymousWebView)
          {
            for (;;)
            {
              abr.d("Could not call AdListener.onAdFailedToLoad().", paramAnonymousWebView);
            }
          }
        }
        if (paramAnonymousString.startsWith((String)uf.cj.c()))
        {
          if (t.a(t.this) != null) {}
          try
          {
            t.a(t.this).a(0);
            t.this.a(0);
            return true;
          }
          catch (RemoteException paramAnonymousWebView)
          {
            for (;;)
            {
              abr.d("Could not call AdListener.onAdFailedToLoad().", paramAnonymousWebView);
            }
          }
        }
        if (paramAnonymousString.startsWith((String)uf.ck.c()))
        {
          if (t.a(t.this) != null) {}
          try
          {
            t.a(t.this).c();
            int i = t.this.b(paramAnonymousString);
            t.this.a(i);
            return true;
          }
          catch (RemoteException paramAnonymousWebView)
          {
            for (;;)
            {
              abr.d("Could not call AdListener.onAdLoaded().", paramAnonymousWebView);
            }
          }
        }
        if (paramAnonymousString.startsWith("gmsg://")) {
          return true;
        }
        if (t.a(t.this) != null) {}
        try
        {
          t.a(t.this).b();
          paramAnonymousWebView = t.a(t.this, paramAnonymousString);
          t.b(t.this, paramAnonymousWebView);
          return true;
        }
        catch (RemoteException paramAnonymousWebView)
        {
          for (;;)
          {
            abr.d("Could not call AdListener.onAdLeftApplication().", paramAnonymousWebView);
          }
        }
      }
    });
    this.f.setOnTouchListener(new View.OnTouchListener()
    {
      public boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        if (t.b(t.this) != null) {}
        try
        {
          t.b(t.this).a(paramAnonymousMotionEvent);
          return false;
        }
        catch (RemoteException paramAnonymousView)
        {
          for (;;)
          {
            abr.d("Unable to process ad data", paramAnonymousView);
          }
        }
      }
    });
  }
  
  private Future<sy> p()
  {
    abu.a(new Callable()
    {
      public sy a()
      {
        return new sy(t.c(t.this).b, t.d(t.this), false);
      }
    });
  }
  
  public e a()
  {
    com.google.android.gms.common.internal.d.b("getAdFrame must be called on the main UI thread.");
    return f.a(this.f);
  }
  
  void a(int paramInt)
  {
    if (this.f == null) {
      return;
    }
    ViewGroup.LayoutParams localLayoutParams = new ViewGroup.LayoutParams(-1, paramInt);
    this.f.setLayoutParams(localLayoutParams);
  }
  
  public void a(AdSizeParcel paramAdSizeParcel)
  {
    throw new IllegalStateException("AdSize must be set before initialization");
  }
  
  public void a(VideoOptionsParcel paramVideoOptionsParcel)
  {
    throw new IllegalStateException("Unused method");
  }
  
  public void a(af paramaf)
  {
    throw new IllegalStateException("Unused method");
  }
  
  public void a(ag paramag)
  {
    this.g = paramag;
  }
  
  public void a(am paramam)
  {
    throw new IllegalStateException("Unused method");
  }
  
  public void a(ao paramao)
  {
    throw new IllegalStateException("Unused method");
  }
  
  public void a(com.google.android.gms.ads.internal.reward.client.d paramd)
  {
    throw new IllegalStateException("Unused method");
  }
  
  public void a(ur paramur)
  {
    throw new IllegalStateException("Unused method");
  }
  
  public void a(yy paramyy)
  {
    throw new IllegalStateException("Unused method");
  }
  
  public void a(zd paramzd, String paramString)
  {
    throw new IllegalStateException("Unused method");
  }
  
  public void a(String paramString)
  {
    throw new IllegalStateException("Unused method");
  }
  
  public void a(boolean paramBoolean) {}
  
  public boolean a(AdRequestParcel paramAdRequestParcel)
  {
    com.google.android.gms.common.internal.d.a(this.f, "This Search Ad has already been torn down");
    this.e.a(paramAdRequestParcel);
    this.i = new a(null).execute(new Void[0]);
    return true;
  }
  
  int b(String paramString)
  {
    paramString = Uri.parse(paramString).getQueryParameter("height");
    if (TextUtils.isEmpty(paramString)) {
      return 0;
    }
    try
    {
      int j = ac.a().a(this.d, Integer.parseInt(paramString));
      return j;
    }
    catch (NumberFormatException paramString) {}
    return 0;
  }
  
  public void b()
  {
    com.google.android.gms.common.internal.d.b("destroy must be called on the main UI thread.");
    this.i.cancel(true);
    this.c.cancel(true);
    this.f.destroy();
    this.f = null;
  }
  
  public boolean c()
  {
    return false;
  }
  
  public void c_()
  {
    com.google.android.gms.common.internal.d.b("resume must be called on the main UI thread.");
  }
  
  public void d()
  {
    com.google.android.gms.common.internal.d.b("pause must be called on the main UI thread.");
  }
  
  public void f()
  {
    throw new IllegalStateException("Unused method");
  }
  
  public void g_() {}
  
  public void h()
  {
    throw new IllegalStateException("Unused method");
  }
  
  public AdSizeParcel i()
  {
    return this.b;
  }
  
  @Nullable
  public String j()
  {
    return null;
  }
  
  public boolean k()
  {
    return false;
  }
  
  @Nullable
  public c l()
  {
    return null;
  }
  
  String m()
  {
    Object localObject1 = new Uri.Builder();
    ((Uri.Builder)localObject1).scheme("https://").appendEncodedPath((String)uf.cl.c());
    ((Uri.Builder)localObject1).appendQueryParameter("query", this.e.b());
    ((Uri.Builder)localObject1).appendQueryParameter("pubId", this.e.c());
    Object localObject3 = this.e.d();
    Iterator localIterator = ((Map)localObject3).keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      ((Uri.Builder)localObject1).appendQueryParameter(str, (String)((Map)localObject3).get(str));
    }
    localObject3 = ((Uri.Builder)localObject1).build();
    if (this.h != null) {}
    try
    {
      localObject1 = this.h.a((Uri)localObject3, this.d);
      localObject3 = String.valueOf(n());
      localObject1 = String.valueOf(((Uri)localObject1).getEncodedQuery());
      return String.valueOf(localObject3).length() + 1 + String.valueOf(localObject1).length() + (String)localObject3 + "#" + (String)localObject1;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        abr.d("Unable to process ad data", localRemoteException);
        Object localObject2 = localObject3;
      }
    }
    catch (sz localsz)
    {
      for (;;) {}
    }
  }
  
  String n()
  {
    String str1 = this.e.a();
    if (TextUtils.isEmpty(str1)) {
      str1 = "www.google.com";
    }
    for (;;)
    {
      String str2 = String.valueOf("https://");
      String str3 = (String)uf.cl.c();
      return String.valueOf(str2).length() + 0 + String.valueOf(str1).length() + String.valueOf(str3).length() + str2 + str1 + str3;
    }
  }
  
  private class a
    extends AsyncTask<Void, Void, Void>
  {
    private a() {}
    
    protected Void a(Void... paramVarArgs)
    {
      try
      {
        t.a(t.this, (sy)t.e(t.this).get(((Long)uf.cn.c()).longValue(), TimeUnit.MILLISECONDS));
        return null;
      }
      catch (InterruptedException paramVarArgs)
      {
        for (;;)
        {
          abr.d("Failed to load ad data", paramVarArgs);
        }
      }
      catch (TimeoutException paramVarArgs)
      {
        for (;;)
        {
          abr.d("Timed out waiting for ad data");
        }
      }
      catch (ExecutionException paramVarArgs)
      {
        for (;;) {}
      }
    }
    
    protected void a(Void paramVoid)
    {
      paramVoid = t.this.m();
      if (t.f(t.this) != null) {
        t.f(t.this).loadUrl(paramVoid);
      }
    }
  }
  
  private static class b
  {
    private final String a;
    private final Map<String, String> b;
    private String c;
    private String d;
    
    public b(String paramString)
    {
      this.a = paramString;
      this.b = new TreeMap();
    }
    
    public String a()
    {
      return this.d;
    }
    
    public void a(AdRequestParcel paramAdRequestParcel)
    {
      this.c = paramAdRequestParcel.j.o;
      if (paramAdRequestParcel.m != null) {}
      for (paramAdRequestParcel = paramAdRequestParcel.m.getBundle(AdMobAdapter.class.getName());; paramAdRequestParcel = null)
      {
        if (paramAdRequestParcel == null) {}
        for (;;)
        {
          return;
          String str1 = (String)uf.cm.c();
          Iterator localIterator = paramAdRequestParcel.keySet().iterator();
          while (localIterator.hasNext())
          {
            String str2 = (String)localIterator.next();
            if (str1.equals(str2)) {
              this.d = paramAdRequestParcel.getString(str2);
            } else if (str2.startsWith("csa_")) {
              this.b.put(str2.substring("csa_".length()), paramAdRequestParcel.getString(str2));
            }
          }
        }
      }
    }
    
    public String b()
    {
      return this.c;
    }
    
    public String c()
    {
      return this.a;
    }
    
    public Map<String, String> d()
    {
      return this.b;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */