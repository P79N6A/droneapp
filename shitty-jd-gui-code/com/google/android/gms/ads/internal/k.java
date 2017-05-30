package com.google.android.gms.ads.internal;

import android.content.Context;
import android.support.v4.util.SimpleArrayMap;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.ag;
import com.google.android.gms.ads.internal.client.ah;
import com.google.android.gms.ads.internal.client.ai.a;
import com.google.android.gms.ads.internal.client.ao;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.vf;
import com.google.android.gms.internal.vg;
import com.google.android.gms.internal.vh;
import com.google.android.gms.internal.vi;
import com.google.android.gms.internal.xq;

@aaa
public class k
  extends ai.a
{
  private ag a;
  private vf b;
  private vg c;
  private SimpleArrayMap<String, vh> d;
  private SimpleArrayMap<String, vi> e;
  private NativeAdOptionsParcel f;
  private ao g;
  private final Context h;
  private final xq i;
  private final String j;
  private final VersionInfoParcel k;
  private final d l;
  
  public k(Context paramContext, String paramString, xq paramxq, VersionInfoParcel paramVersionInfoParcel, d paramd)
  {
    this.h = paramContext;
    this.j = paramString;
    this.i = paramxq;
    this.k = paramVersionInfoParcel;
    this.e = new SimpleArrayMap();
    this.d = new SimpleArrayMap();
    this.l = paramd;
  }
  
  public ah a()
  {
    return new j(this.h, this.j, this.i, this.k, this.a, this.b, this.c, this.e, this.d, this.f, this.g, this.l);
  }
  
  public void a(ag paramag)
  {
    this.a = paramag;
  }
  
  public void a(ao paramao)
  {
    this.g = paramao;
  }
  
  public void a(NativeAdOptionsParcel paramNativeAdOptionsParcel)
  {
    this.f = paramNativeAdOptionsParcel;
  }
  
  public void a(vf paramvf)
  {
    this.b = paramvf;
  }
  
  public void a(vg paramvg)
  {
    this.c = paramvg;
  }
  
  public void a(String paramString, vi paramvi, vh paramvh)
  {
    if (TextUtils.isEmpty(paramString)) {
      throw new IllegalArgumentException("Custom template ID for native custom template ad is empty. Please provide a valid template id.");
    }
    this.e.put(paramString, paramvi);
    this.d.put(paramString, paramvh);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */