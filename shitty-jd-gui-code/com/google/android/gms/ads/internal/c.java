package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abi;
import com.google.android.gms.internal.abi.a;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.abv;
import com.google.android.gms.internal.aby;
import com.google.android.gms.internal.acy;
import com.google.android.gms.internal.acz;
import com.google.android.gms.internal.ada;
import com.google.android.gms.internal.ti;
import com.google.android.gms.internal.ub;
import com.google.android.gms.internal.uf;
import com.google.android.gms.internal.un;
import com.google.android.gms.internal.uo;
import com.google.android.gms.internal.uq;
import com.google.android.gms.internal.ur;
import com.google.android.gms.internal.vt;
import com.google.android.gms.internal.wy;
import com.google.android.gms.internal.xq;
import com.google.android.gms.internal.yo;
import com.google.android.gms.internal.zn;
import java.util.Map;

@aaa
public abstract class c
  extends b
  implements h, yo
{
  public c(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, xq paramxq, VersionInfoParcel paramVersionInfoParcel, d paramd)
  {
    super(paramContext, paramAdSizeParcel, paramString, paramxq, paramVersionInfoParcel, paramd);
  }
  
  public void E()
  {
    e();
  }
  
  public void F()
  {
    B();
    h();
  }
  
  public void G()
  {
    p();
  }
  
  protected acy a(abi.a parama, @Nullable e parame, @Nullable com.google.android.gms.ads.internal.safebrowsing.c paramc)
  {
    acy localacy1 = null;
    View localView = this.f.f.getNextView();
    if ((localView instanceof acy))
    {
      localacy1 = (acy)localView;
      if (!((Boolean)uf.ai.c()).booleanValue()) {
        break label223;
      }
      abr.a("Reusing webview...");
      localacy1.a(this.f.c, this.f.i, this.a);
    }
    for (;;)
    {
      acy localacy2 = localacy1;
      if (localacy1 == null)
      {
        if (localView != null) {
          this.f.f.removeView(localView);
        }
        localacy1 = u.f().a(this.f.c, this.f.i, false, false, this.f.d, this.f.e, this.a, this, this.i);
        localacy2 = localacy1;
        if (this.f.i.h == null)
        {
          a(localacy1.b());
          localacy2 = localacy1;
        }
      }
      localacy2.l().a(this, this, this, this, false, this, null, parame, this, paramc);
      a(localacy2);
      localacy2.b(parama.a.w);
      return localacy2;
      label223:
      localacy1.destroy();
      localacy1 = null;
    }
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    r();
  }
  
  protected void a(final abi.a parama, final un paramun)
  {
    if (parama.e != -2)
    {
      abv.a.post(new Runnable()
      {
        public void run()
        {
          c.this.b(new abi(parama, null, null, null, null, null, null, null));
        }
      });
      return;
    }
    if (parama.d != null) {
      this.f.i = parama.d;
    }
    if ((parama.b.h) && (!parama.b.B))
    {
      this.f.E = 0;
      this.f.h = u.d().a(this.f.c, this, parama, this.f.d, null, this.j, this, paramun);
      return;
    }
    final com.google.android.gms.ads.internal.safebrowsing.c localc = this.i.d.a(this.f.c, parama.b);
    abv.a.post(new Runnable()
    {
      public void run()
      {
        if ((parama.b.s) && (c.this.f.y != null))
        {
          Object localObject = null;
          if (parama.b.b != null) {
            localObject = u.e().a(parama.b.b);
          }
          localObject = new uo(c.this, (String)localObject, parama.b.c);
          c.this.f.E = 1;
          try
          {
            c.this.d = false;
            c.this.f.y.a((uq)localObject);
            return;
          }
          catch (RemoteException localRemoteException)
          {
            abr.d("Could not call the onCustomRenderedAdLoadedListener.", localRemoteException);
            c.this.d = true;
          }
        }
        final e locale = new e(c.this.f.c, parama);
        acy localacy = c.this.a(parama, locale, localc);
        localacy.setOnTouchListener(new View.OnTouchListener()
        {
          public boolean onTouch(View paramAnonymous2View, MotionEvent paramAnonymous2MotionEvent)
          {
            locale.a();
            return false;
          }
        });
        localacy.setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramAnonymous2View)
          {
            locale.a();
          }
        });
        c.this.f.E = 0;
        c.this.f.h = u.d().a(c.this.f.c, c.this, parama, c.this.f.d, localacy, c.this.j, c.this, paramun);
      }
    });
  }
  
  public void a(ur paramur)
  {
    com.google.android.gms.common.internal.d.b("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
    this.f.y = paramur;
  }
  
  protected void a(wy paramwy)
  {
    paramwy.a("/trackActiveViewUnit", new vt()
    {
      public void a(acy paramAnonymousacy, Map<String, String> paramAnonymousMap)
      {
        if (c.this.f.j != null)
        {
          c.this.h.a(c.this.f.i, c.this.f.j, paramAnonymousacy.b(), paramAnonymousacy);
          return;
        }
        abr.d("Request to enable ActiveView before adState is available.");
      }
    });
  }
  
  protected boolean a(@Nullable abi paramabi1, abi paramabi2)
  {
    if ((this.f.e()) && (this.f.f != null)) {
      this.f.f.a().b(paramabi2.C);
    }
    return super.a(paramabi1, paramabi2);
  }
  
  public void b(View paramView)
  {
    this.f.D = paramView;
    b(new abi(this.f.k, null, null, null, null, null, null, null));
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */