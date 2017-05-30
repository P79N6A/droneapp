package com.google.android.gms.ads.internal.formats;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.c.f;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.acy;
import com.google.android.gms.internal.acz;
import com.google.android.gms.internal.acz.a;
import com.google.android.gms.internal.ada;
import com.google.android.gms.internal.oq;
import com.google.android.gms.internal.ro;
import com.google.android.gms.internal.ub;
import com.google.android.gms.internal.uf;
import com.google.android.gms.internal.uu;
import com.google.android.gms.internal.uu.a;
import com.google.android.gms.internal.vt;
import com.google.android.gms.internal.wy;
import com.google.android.gms.internal.zt;
import com.google.android.gms.internal.zt.a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@aaa
public class j
  implements i
{
  private final Object a = new Object();
  private final q b;
  private final Context c;
  @Nullable
  private final JSONObject d;
  @Nullable
  private final zt e;
  @Nullable
  private final i.a f;
  private final ro g;
  @Nullable
  private final VersionInfoParcel h;
  private boolean i;
  private acy j;
  private String k;
  @Nullable
  private String l;
  private WeakReference<View> m = null;
  
  public j(Context paramContext, q paramq, @Nullable zt paramzt, ro paramro, @Nullable JSONObject paramJSONObject, @Nullable i.a parama, @Nullable VersionInfoParcel paramVersionInfoParcel, @Nullable String paramString)
  {
    this.c = paramContext;
    this.b = paramq;
    this.e = paramzt;
    this.g = paramro;
    this.d = paramJSONObject;
    this.f = parama;
    this.h = paramVersionInfoParcel;
    this.l = paramString;
  }
  
  public b a(View.OnClickListener paramOnClickListener)
  {
    Object localObject = this.f.m();
    if (localObject == null) {
      return null;
    }
    localObject = new b(this.c, (a)localObject);
    ((b)localObject).setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    ((b)localObject).a().setOnClickListener(paramOnClickListener);
    ((b)localObject).a().setContentDescription((CharSequence)uf.bQ.c());
    return (b)localObject;
  }
  
  @Nullable
  uu a(Object paramObject)
  {
    if ((paramObject instanceof IBinder)) {
      return uu.a.a((IBinder)paramObject);
    }
    return null;
  }
  
  public void a()
  {
    com.google.android.gms.common.internal.d.b("recordImpression must be called on the main UI thread.");
    a(true);
    try
    {
      final JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("ad", this.d);
      localJSONObject.put("ads_id", this.l);
      this.e.a(new zt.a()
      {
        public void a(wy paramAnonymouswy)
        {
          paramAnonymouswy.a("google.afma.nativeAds.handleImpressionPing", localJSONObject);
        }
      });
      this.b.a(this);
      return;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        abr.b("Unable to create impression JSON.", localJSONException);
      }
    }
  }
  
  public void a(MotionEvent paramMotionEvent)
  {
    this.g.a(paramMotionEvent);
  }
  
  public void a(View paramView)
  {
    synchronized (this.a)
    {
      if (this.i) {
        return;
      }
      if (!paramView.isShown()) {
        return;
      }
    }
    if (!paramView.getGlobalVisibleRect(new Rect(), null)) {
      return;
    }
    a();
  }
  
  public void a(View paramView, g paramg)
  {
    if (!(this.f instanceof d)) {}
    for (;;)
    {
      return;
      Object localObject = (d)this.f;
      FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-1, -1);
      if (((d)localObject).o() != null)
      {
        ((FrameLayout)paramView).addView(((d)localObject).o(), localLayoutParams);
        this.b.a(paramg);
        return;
      }
      if ((((d)localObject).b() != null) && (((d)localObject).b().size() > 0))
      {
        paramg = a(((d)localObject).b().get(0));
        if (paramg != null) {
          try
          {
            paramg = paramg.a();
            if (paramg != null)
            {
              paramg = (Drawable)f.a(paramg);
              localObject = i();
              ((ImageView)localObject).setImageDrawable(paramg);
              ((ImageView)localObject).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
              ((FrameLayout)paramView).addView((View)localObject, localLayoutParams);
              return;
            }
          }
          catch (RemoteException paramView)
          {
            abr.d("Could not get drawable from image");
          }
        }
      }
    }
  }
  
  public void a(View paramView, String paramString, @Nullable JSONObject paramJSONObject1, @Nullable JSONObject paramJSONObject2, @Nullable JSONObject paramJSONObject3)
  {
    com.google.android.gms.common.internal.d.b("performClick must be called on the main UI thread.");
    for (;;)
    {
      try
      {
        JSONObject localJSONObject1 = new JSONObject();
        localJSONObject1.put("asset", paramString);
        localJSONObject1.put("template", this.f.k());
        final JSONObject localJSONObject2 = new JSONObject();
        localJSONObject2.put("ad", this.d);
        localJSONObject2.put("click", localJSONObject1);
        if (this.b.c(this.f.l()) != null)
        {
          bool = true;
          localJSONObject2.put("has_custom_click_handler", bool);
          if (paramJSONObject1 != null) {
            localJSONObject2.put("view_rectangles", paramJSONObject1);
          }
          if (paramJSONObject2 != null) {
            localJSONObject2.put("click_point", paramJSONObject2);
          }
          if (paramJSONObject3 != null) {
            localJSONObject2.put("native_view_rectangle", paramJSONObject3);
          }
          try
          {
            paramJSONObject1 = this.d.optJSONObject("tracking_urls_and_actions");
            paramString = paramJSONObject1;
            if (paramJSONObject1 == null) {
              paramString = new JSONObject();
            }
            paramString = paramString.optString("click_string");
            localJSONObject1.put("click_signals", this.g.a().a(this.c, paramString, paramView));
          }
          catch (Exception paramView)
          {
            abr.b("Exception obtaining click signals", paramView);
            continue;
          }
          localJSONObject2.put("ads_id", this.l);
          this.e.a(new zt.a()
          {
            public void a(wy paramAnonymouswy)
            {
              paramAnonymouswy.a("google.afma.nativeAds.handleClickGmsg", localJSONObject2);
            }
          });
          return;
        }
      }
      catch (JSONException paramView)
      {
        abr.b("Unable to create click JSON.", paramView);
        return;
      }
      boolean bool = false;
    }
  }
  
  public void a(View paramView, Map<String, WeakReference<View>> paramMap)
  {
    paramView.setOnTouchListener(null);
    paramView.setClickable(false);
    paramView.setOnClickListener(null);
    paramView = paramMap.entrySet().iterator();
    while (paramView.hasNext())
    {
      paramMap = (View)((WeakReference)((Map.Entry)paramView.next()).getValue()).get();
      if (paramMap != null)
      {
        paramMap.setOnTouchListener(null);
        paramMap.setClickable(false);
        paramMap.setOnClickListener(null);
      }
    }
  }
  
  public void a(View paramView, Map<String, WeakReference<View>> paramMap, View.OnTouchListener paramOnTouchListener, View.OnClickListener paramOnClickListener)
  {
    if (!((Boolean)uf.bN.c()).booleanValue()) {}
    for (;;)
    {
      return;
      paramView.setOnTouchListener(paramOnTouchListener);
      paramView.setClickable(true);
      paramView.setOnClickListener(paramOnClickListener);
      paramView = paramMap.entrySet().iterator();
      while (paramView.hasNext())
      {
        paramMap = (View)((WeakReference)((Map.Entry)paramView.next()).getValue()).get();
        if (paramMap != null)
        {
          paramMap.setOnTouchListener(paramOnTouchListener);
          paramMap.setClickable(true);
          paramMap.setOnClickListener(paramOnClickListener);
        }
      }
    }
  }
  
  public void a(View paramView, Map<String, WeakReference<View>> paramMap, JSONObject paramJSONObject1, JSONObject paramJSONObject2, JSONObject paramJSONObject3)
  {
    com.google.android.gms.common.internal.d.b("performClick must be called on the main UI thread.");
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      if (paramView.equals((View)((WeakReference)localEntry.getValue()).get())) {
        a(paramView, (String)localEntry.getKey(), paramJSONObject1, paramJSONObject2, paramJSONObject3);
      }
    }
    do
    {
      return;
      if ("2".equals(this.f.k()))
      {
        a(paramView, "2099", paramJSONObject1, paramJSONObject2, paramJSONObject3);
        return;
      }
    } while (!"1".equals(this.f.k()));
    a(paramView, "1099", paramJSONObject1, paramJSONObject2, paramJSONObject3);
  }
  
  protected void a(boolean paramBoolean)
  {
    this.i = paramBoolean;
  }
  
  public void b(View paramView)
  {
    this.m = new WeakReference(paramView);
  }
  
  public acy d()
  {
    this.j = h();
    this.j.b().setVisibility(8);
    zt.a local3 = new zt.a()
    {
      public void a(final wy paramAnonymouswy)
      {
        paramAnonymouswy.a("/loadHtml", new vt()
        {
          public void a(acy paramAnonymous2acy, final Map<String, String> paramAnonymous2Map)
          {
            j.b(j.this).l().a(new acz.a()
            {
              public void a(acy paramAnonymous3acy, boolean paramAnonymous3Boolean)
              {
                j.a(j.this, (String)paramAnonymous2Map.get("id"));
                paramAnonymous3acy = new JSONObject();
                try
                {
                  paramAnonymous3acy.put("messageType", "htmlLoaded");
                  paramAnonymous3acy.put("id", j.a(j.this));
                  j.3.1.this.a.b("sendMessageToNativeJs", paramAnonymous3acy);
                  return;
                }
                catch (JSONException paramAnonymous3acy)
                {
                  abr.b("Unable to dispatch sendMessageToNativeJs event", paramAnonymous3acy);
                }
              }
            });
            paramAnonymous2acy = (String)paramAnonymous2Map.get("overlayHtml");
            paramAnonymous2Map = (String)paramAnonymous2Map.get("baseUrl");
            if (TextUtils.isEmpty(paramAnonymous2Map))
            {
              j.b(j.this).loadData(paramAnonymous2acy, "text/html", "UTF-8");
              return;
            }
            j.b(j.this).loadDataWithBaseURL(paramAnonymous2Map, paramAnonymous2acy, "text/html", "UTF-8", null);
          }
        });
        paramAnonymouswy.a("/showOverlay", new vt()
        {
          public void a(acy paramAnonymous2acy, Map<String, String> paramAnonymous2Map)
          {
            j.b(j.this).b().setVisibility(0);
          }
        });
        paramAnonymouswy.a("/hideOverlay", new vt()
        {
          public void a(acy paramAnonymous2acy, Map<String, String> paramAnonymous2Map)
          {
            j.b(j.this).b().setVisibility(8);
          }
        });
        j.b(j.this).l().a("/hideOverlay", new vt()
        {
          public void a(acy paramAnonymous2acy, Map<String, String> paramAnonymous2Map)
          {
            j.b(j.this).b().setVisibility(8);
          }
        });
        j.b(j.this).l().a("/sendMessageToSdk", new vt()
        {
          public void a(acy paramAnonymous2acy, Map<String, String> paramAnonymous2Map)
          {
            paramAnonymous2acy = new JSONObject();
            try
            {
              Iterator localIterator = paramAnonymous2Map.keySet().iterator();
              while (localIterator.hasNext())
              {
                String str = (String)localIterator.next();
                paramAnonymous2acy.put(str, paramAnonymous2Map.get(str));
              }
              paramAnonymous2acy.put("id", j.a(j.this));
            }
            catch (JSONException paramAnonymous2acy)
            {
              abr.b("Unable to dispatch sendMessageToNativeJs event", paramAnonymous2acy);
              return;
            }
            paramAnonymouswy.b("sendMessageToNativeJs", paramAnonymous2acy);
          }
        });
      }
    };
    this.e.a(local3);
    return this.j;
  }
  
  public View e()
  {
    if (this.m != null) {
      return (View)this.m.get();
    }
    return null;
  }
  
  public Context f()
  {
    return this.c;
  }
  
  public void g()
  {
    if (!(this.f instanceof d)) {
      return;
    }
    this.b.G();
  }
  
  acy h()
  {
    return u.f().a(this.c, AdSizeParcel.a(this.c), false, false, this.g, this.h);
  }
  
  ImageView i()
  {
    return new ImageView(this.c);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/formats/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */