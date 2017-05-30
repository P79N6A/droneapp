package com.google.android.gms.internal;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.ac;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.a;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

@aaa
public class zv
{
  private final Object a = new Object();
  private final Context b;
  private final ro c;
  private final abi.a d;
  private final un e;
  private final q f;
  private ViewTreeObserver.OnGlobalLayoutListener g;
  private ViewTreeObserver.OnScrollChangedListener h;
  private ach i;
  private int j = -1;
  private int k = -1;
  
  public zv(Context paramContext, ro paramro, abi.a parama, un paramun, q paramq)
  {
    this.b = paramContext;
    this.c = paramro;
    this.d = parama;
    this.e = paramun;
    this.f = paramq;
    this.i = new ach(200L);
  }
  
  private ViewTreeObserver.OnGlobalLayoutListener a(WeakReference<acy> paramWeakReference)
  {
    if (this.g == null) {
      this.g = new zv.3(this, paramWeakReference);
    }
    return this.g;
  }
  
  private void a(acy paramacy)
  {
    paramacy = paramacy.l();
    paramacy.a("/video", vs.n);
    paramacy.a("/videoMeta", vs.o);
    paramacy.a("/precache", vs.p);
    paramacy.a("/delayPageLoaded", vs.s);
    paramacy.a("/instrument", vs.q);
    paramacy.a("/log", vs.i);
    paramacy.a("/videoClicked", vs.j);
    paramacy.a("/trackActiveViewUnit", new zv.2(this));
  }
  
  private void a(WeakReference<acy> paramWeakReference, boolean paramBoolean)
  {
    if (paramWeakReference == null) {}
    do
    {
      return;
      paramWeakReference = (acy)paramWeakReference.get();
    } while ((paramWeakReference == null) || (paramWeakReference.b() == null) || ((paramBoolean) && (!this.i.a())));
    ??? = paramWeakReference.b();
    int[] arrayOfInt = new int[2];
    ((View)???).getLocationOnScreen(arrayOfInt);
    int m = ac.a().b(this.b, arrayOfInt[0]);
    int n = ac.a().b(this.b, arrayOfInt[1]);
    for (;;)
    {
      synchronized (this.a)
      {
        if ((this.j != m) || (this.k != n))
        {
          this.j = m;
          this.k = n;
          paramWeakReference = paramWeakReference.l();
          m = this.j;
          n = this.k;
          if (!paramBoolean)
          {
            paramBoolean = true;
            paramWeakReference.a(m, n, paramBoolean);
          }
        }
        else
        {
          return;
        }
      }
      paramBoolean = false;
    }
  }
  
  private ViewTreeObserver.OnScrollChangedListener b(WeakReference<acy> paramWeakReference)
  {
    if (this.h == null) {
      this.h = new zv.4(this, paramWeakReference);
    }
    return this.h;
  }
  
  public aco<acy> a(JSONObject paramJSONObject)
  {
    acl localacl = new acl();
    u.e().a(new zv.1(this, paramJSONObject, localacl));
    return localacl;
  }
  
  acy a()
  {
    return u.f().a(this.b, AdSizeParcel.a(this.b), false, false, this.c, this.d.a.k, this.e, null, this.f.n());
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/zv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */