package com.google.android.gms.ads.internal.formats;

import android.content.Context;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.c.f;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.acy;
import com.google.android.gms.internal.ro;
import com.google.android.gms.internal.xu;
import com.google.android.gms.internal.xv;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

@aaa
public class h
  extends j
{
  @Nullable
  private xu a;
  @Nullable
  private xv b;
  private final q c;
  @Nullable
  private i d;
  private boolean e = false;
  private Object f = new Object();
  
  private h(Context paramContext, q paramq, ro paramro, i.a parama)
  {
    super(paramContext, paramq, null, paramro, null, parama, null, null);
    this.c = paramq;
  }
  
  public h(Context paramContext, q paramq, ro paramro, xu paramxu, i.a parama)
  {
    this(paramContext, paramq, paramro, parama);
    this.a = paramxu;
  }
  
  public h(Context paramContext, q paramq, ro paramro, xv paramxv, i.a parama)
  {
    this(paramContext, paramq, paramro, parama);
    this.b = paramxv;
  }
  
  @Nullable
  public b a(View.OnClickListener paramOnClickListener)
  {
    return null;
  }
  
  public void a()
  {
    d.b("recordImpression must be called on the main UI thread.");
    for (;;)
    {
      synchronized (this.f)
      {
        a(true);
        if (this.d != null)
        {
          this.d.a();
          this.c.B();
          return;
        }
        try
        {
          if ((this.a != null) && (!this.a.j()))
          {
            this.a.i();
            this.c.B();
          }
        }
        catch (RemoteException localRemoteException)
        {
          abr.d("Failed to call recordImpression", localRemoteException);
        }
      }
      if ((this.b != null) && (!this.b.h()))
      {
        this.b.g();
        this.c.B();
      }
    }
  }
  
  public void a(View paramView, Map<String, WeakReference<View>> arg2)
  {
    synchronized (this.f)
    {
      try
      {
        if (this.a != null) {
          this.a.c(f.a(paramView));
        }
        for (;;)
        {
          return;
          if (this.b != null) {
            this.b.c(f.a(paramView));
          }
        }
      }
      catch (RemoteException paramView)
      {
        for (;;)
        {
          abr.d("Failed to call untrackView", paramView);
        }
      }
    }
  }
  
  public void a(View paramView, Map<String, WeakReference<View>> arg2, View.OnTouchListener paramOnTouchListener, View.OnClickListener paramOnClickListener)
  {
    synchronized (this.f)
    {
      this.e = true;
      try
      {
        if (this.a != null) {
          this.a.b(f.a(paramView));
        }
        for (;;)
        {
          this.e = false;
          return;
          if (this.b != null) {
            this.b.b(f.a(paramView));
          }
        }
      }
      catch (RemoteException paramView)
      {
        for (;;)
        {
          abr.d("Failed to call prepareAd", paramView);
        }
      }
    }
  }
  
  public void a(View paramView, Map<String, WeakReference<View>> paramMap, JSONObject paramJSONObject1, JSONObject paramJSONObject2, JSONObject paramJSONObject3)
  {
    d.b("performClick must be called on the main UI thread.");
    synchronized (this.f)
    {
      if (this.d != null)
      {
        this.d.a(paramView, paramMap, paramJSONObject1, paramJSONObject2, paramJSONObject3);
        this.c.e();
      }
      for (;;)
      {
        return;
        try
        {
          if ((this.a != null) && (!this.a.k()))
          {
            this.a.a(f.a(paramView));
            this.c.e();
          }
          if ((this.b == null) || (this.b.i())) {
            continue;
          }
          this.b.a(f.a(paramView));
          this.c.e();
        }
        catch (RemoteException paramView)
        {
          abr.d("Failed to call performClick", paramView);
        }
      }
    }
  }
  
  public void a(@Nullable i parami)
  {
    synchronized (this.f)
    {
      this.d = parami;
      return;
    }
  }
  
  public boolean b()
  {
    synchronized (this.f)
    {
      boolean bool = this.e;
      return bool;
    }
  }
  
  public i c()
  {
    synchronized (this.f)
    {
      i locali = this.d;
      return locali;
    }
  }
  
  @Nullable
  public acy d()
  {
    return null;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/formats/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */