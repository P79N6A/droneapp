package com.fimi.soul.biz.c;

import android.content.Context;
import android.content.res.Resources;
import com.fimi.soul.drone.a;
import com.fimi.soul.drone.h.ag;
import com.google.android.gms.maps.c;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.g;
import java.util.List;

public class b
{
  public volatile boolean a;
  private c b;
  private Context c;
  private a d;
  private g e;
  private com.google.android.gms.maps.model.i f;
  
  public b(c paramc, Context paramContext, a parama)
  {
    this.d = parama;
    this.b = paramc;
    this.c = paramContext;
  }
  
  public void a()
  {
    a(new LatLng(this.d.u().e(), this.d.u().d()));
  }
  
  public void a(LatLng paramLatLng)
  {
    if (this.e == null)
    {
      this.e = this.b.a(new MarkerOptions().a(j.a(2130838206)).a(paramLatLng));
      this.e.a(0.5F, 0.88F);
      this.e.a(this);
    }
  }
  
  public void b()
  {
    if (this.e != null) {
      this.e.a(j.a(2130838209));
    }
  }
  
  public void b(LatLng paramLatLng)
  {
    List localList = d.k().b();
    if ((localList != null) && (!localList.contains(paramLatLng)))
    {
      localList.add(paramLatLng);
      if (localList.size() >= 2)
      {
        if (this.f != null) {
          break label80;
        }
        this.f = this.b.a(i.a(localList, 4, this.c.getResources().getColor(2131624058)).b(50.0F));
      }
    }
    return;
    label80:
    this.f.a(localList);
  }
  
  public void c()
  {
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
  
  public void d()
  {
    this.a = false;
    if (this.e != null)
    {
      this.e.a(this.d.d.getString(2131362123));
      this.e.h();
    }
  }
  
  public void e()
  {
    this.a = false;
    if (this.e != null) {
      this.e.i();
    }
  }
  
  public void f()
  {
    this.a = true;
    if (this.e != null) {
      this.e.i();
    }
  }
  
  public boolean g()
  {
    return this.e == null;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */