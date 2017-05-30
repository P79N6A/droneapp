package com.fimi.soul.module.droneTrack;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fimi.soul.drone.h.ag;
import com.fimi.soul.drone.h.z;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.c.b;
import com.google.android.gms.maps.f;
import com.google.android.gms.maps.j;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.g;
import com.google.android.gms.maps.model.i;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class PalyBackMapFragment
  extends SupportMapFragment
  implements com.fimi.soul.module.droneFragment.d, c.b, f
{
  protected com.google.android.gms.maps.c a;
  private SharedPreferences b;
  private d c;
  private g d;
  private g e;
  private i f;
  private boolean g = true;
  private List<com.google.android.gms.maps.model.c> h = new CopyOnWriteArrayList();
  private com.google.android.gms.maps.model.c i;
  private com.google.android.gms.maps.model.c j;
  
  private g a(LatLng paramLatLng)
  {
    if (this.a == null) {
      return null;
    }
    return this.a.a(new MarkerOptions().a(com.google.android.gms.maps.model.b.a(2130838159)).a(paramLatLng));
  }
  
  private String a(double paramDouble)
  {
    try
    {
      String str = String.format("%.8f", new Object[] { Double.valueOf(paramDouble) });
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private void a(LatLng paramLatLng, int paramInt1, int paramInt2)
  {
    int k = this.b.getInt("Amptype", 1);
    if (paramInt2 == 3) {
      if (this.j != null)
      {
        this.j.a(paramLatLng);
        if (paramInt1 != this.j.d()) {
          this.j.a(paramInt1 + 100);
        }
        if ((this.i == null) || (!this.h.contains(this.i))) {
          break label270;
        }
        this.i.a(paramLatLng);
        if (paramInt1 != this.i.d()) {
          this.i.a(paramInt1);
        }
      }
    }
    for (;;)
    {
      if (!this.h.contains(this.i)) {
        this.h.add(this.i);
      }
      return;
      if (this.a == null) {
        break;
      }
      com.google.android.gms.maps.c localc = this.a;
      CircleOptions localCircleOptions = new CircleOptions().a(paramLatLng).a(paramInt1 + 100).a(Color.argb(127, 0, 0, 0)).a(2.0F);
      if (1 == k) {}
      for (paramInt2 = Color.argb(204, 198, 200, 203);; paramInt2 = Color.argb(204, 101, 104, 106))
      {
        this.j = localc.a(localCircleOptions.b(paramInt2));
        break;
      }
      if (this.j == null) {
        break;
      }
      this.j.a();
      this.j = null;
      break;
      label270:
      if (this.a != null) {
        this.i = this.a.a(new CircleOptions().a(paramLatLng).a(paramInt1).a(Color.argb(127, 255, 54, 0)).a(2.0F).b(Color.argb(51, 255, 54, 0)).b(100.0F));
      }
    }
  }
  
  private i b(List<LatLng> paramList)
  {
    if (this.a == null) {
      return null;
    }
    paramList = new PolylineOptions().a(paramList).a(Color.rgb(255, 42, 92)).a(3.0F);
    return this.a.a(paramList);
  }
  
  private void f()
  {
    this.a.a(this.b.getInt("DroneMapType", 1));
    if (this.c != null) {
      this.c.a(this.a.g());
    }
    this.a.a(false);
    this.a.m().a(false);
    this.a.a(this);
  }
  
  /* Error */
  private float g()
  {
    // Byte code:
    //   0: fconst_0
    //   1: fstore_2
    //   2: aload_0
    //   3: monitorenter
    //   4: fload_2
    //   5: fstore_1
    //   6: aload_0
    //   7: getfield 44	com/fimi/soul/module/droneTrack/PalyBackMapFragment:a	Lcom/google/android/gms/maps/c;
    //   10: ifnull +22 -> 32
    //   13: aload_0
    //   14: getfield 44	com/fimi/soul/module/droneTrack/PalyBackMapFragment:a	Lcom/google/android/gms/maps/c;
    //   17: invokevirtual 202	com/google/android/gms/maps/c:a	()Lcom/google/android/gms/maps/model/CameraPosition;
    //   20: astore_3
    //   21: fload_2
    //   22: fstore_1
    //   23: aload_3
    //   24: ifnull +8 -> 32
    //   27: aload_3
    //   28: getfield 207	com/google/android/gms/maps/model/CameraPosition:d	F
    //   31: fstore_1
    //   32: aload_0
    //   33: monitorexit
    //   34: fload_1
    //   35: freturn
    //   36: astore_3
    //   37: aload_0
    //   38: monitorexit
    //   39: aload_3
    //   40: athrow
    //   41: astore_3
    //   42: fload_2
    //   43: fstore_1
    //   44: goto -12 -> 32
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	47	0	this	PalyBackMapFragment
    //   5	39	1	f1	float
    //   1	42	2	f2	float
    //   20	8	3	localCameraPosition	com.google.android.gms.maps.model.CameraPosition
    //   36	4	3	localObject	Object
    //   41	1	3	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   6	21	36	finally
    //   27	32	36	finally
    //   6	21	41	java/lang/Exception
    //   27	32	41	java/lang/Exception
  }
  
  public int a()
  {
    int k = 2;
    if (this.b.getInt("DroneMapType", 1) == 1) {
      this.b.edit().putInt("DroneMapType", 2).commit();
    }
    for (;;)
    {
      if (this.a != null) {
        this.a.a(k);
      }
      return k;
      this.b.edit().putInt("DroneMapType", 1).commit();
      k = 1;
    }
  }
  
  public View a(g paramg)
  {
    View localView = LayoutInflater.from(getActivity()).inflate(2130968771, null);
    ((TextView)localView.findViewById(2131690509)).setText(paramg.e());
    return localView;
  }
  
  public void a(float paramFloat)
  {
    if (this.e != null)
    {
      float f2 = g();
      float f1 = paramFloat;
      if (paramFloat < 0.0F) {
        f1 = paramFloat + 360.0F;
      }
      this.e.b(f2 + f1);
    }
  }
  
  public void a(com.fimi.soul.drone.h.a.b paramb)
  {
    a(new LatLng(paramb.j(), paramb.k()), paramb.g() * 10, paramb.i());
  }
  
  public void a(ag paramag)
  {
    Object localObject = new LatLng(paramag.e(), paramag.d());
    paramag = com.fimi.soul.module.droneTrack.a.b.a().c();
    if (!paramag.contains(localObject)) {
      paramag.add(localObject);
    }
    if (this.e == null)
    {
      this.e = a((LatLng)localObject);
      if (this.e != null) {
        this.e.a(0.5F, 0.5F);
      }
    }
    for (;;)
    {
      if (this.e != null)
      {
        String str = a(((LatLng)localObject).a);
        localObject = a(((LatLng)localObject).b);
        this.e.a(str + "，" + (String)localObject);
        this.e.h();
      }
      a(paramag);
      return;
      this.e.a((LatLng)localObject);
    }
  }
  
  public void a(z paramz)
  {
    paramz = new LatLng(paramz.b(), paramz.c());
    if (this.d == null)
    {
      if (this.a != null) {
        this.d = this.a.a(new MarkerOptions().a(com.google.android.gms.maps.model.b.a(2130837978)).a(paramz));
      }
      return;
    }
    this.d.a(paramz);
  }
  
  public void a(com.google.android.gms.maps.c paramc) {}
  
  public void a(LatLng paramLatLng, List<LatLng> paramList)
  {
    if ((paramLatLng == null) || (paramList == null)) {
      return;
    }
    if (this.e != null) {
      this.e.a(paramLatLng);
    }
    for (;;)
    {
      if (this.e != null)
      {
        String str = a(paramLatLng.a);
        paramLatLng = a(paramLatLng.b);
        this.e.a(str + "，" + paramLatLng);
        this.e.h();
      }
      a(paramList);
      return;
      this.e = a(paramLatLng);
      this.e.a(0.5F, 0.5F);
    }
  }
  
  public void a(List<LatLng> paramList)
  {
    if (paramList == null) {}
    for (;;)
    {
      return;
      if (this.f == null) {
        this.f = b(paramList);
      }
      while ((this.g) && (this.a != null))
      {
        a(false);
        this.a.a(com.google.android.gms.maps.b.a((LatLng)paramList.get(0), 18.0F));
        return;
        this.f.a(paramList);
      }
    }
  }
  
  public void a(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }
  
  public View b(g paramg)
  {
    return null;
  }
  
  public void b()
  {
    if (this.d != null)
    {
      this.d.a();
      this.d = null;
    }
    if (this.e != null)
    {
      this.e.a();
      this.e = null;
    }
    if (this.f != null)
    {
      this.f.a();
      this.f = null;
    }
  }
  
  public void b(com.google.android.gms.maps.c paramc)
  {
    if (paramc != null)
    {
      this.a = paramc;
      f();
    }
  }
  
  public boolean c()
  {
    return this.g;
  }
  
  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    this.c = ((d)paramActivity);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.b = PreferenceManager.getDefaultSharedPreferences(getActivity());
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = super.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
    a(this);
    return paramLayoutInflater;
  }
  
  public void onDestroy()
  {
    if (this.c != null) {
      this.c = null;
    }
    if (this.d != null)
    {
      this.d.a();
      this.d = null;
    }
    if (this.e != null)
    {
      this.e.a();
      this.e = null;
    }
    if (this.f != null)
    {
      this.f.a();
      this.f = null;
    }
    if (this.i != null)
    {
      this.i.a();
      this.i = null;
    }
    if (this.j != null)
    {
      this.j.a();
      this.j = null;
    }
    this.h.clear();
    super.onDestroy();
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/droneTrack/PalyBackMapFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */