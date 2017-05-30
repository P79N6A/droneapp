package com.fimi.soul.biz.d;

import android.location.Location;
import android.widget.ImageButton;
import com.fimi.soul.drone.h.ag;
import com.google.android.gms.maps.b;
import com.google.android.gms.maps.c;
import com.google.android.gms.maps.c.a;
import com.google.android.gms.maps.model.LatLng;
import java.lang.ref.WeakReference;

public class a
{
  private static a e;
  public volatile a a = a.b;
  private ImageButton b;
  private com.fimi.soul.drone.a c;
  private int d = 0;
  private WeakReference<ImageButton> f;
  private volatile boolean g = true;
  private int h = 18;
  
  public static a a()
  {
    if (e == null) {
      e = new a();
    }
    return e;
  }
  
  public void a(int paramInt)
  {
    if ((this.b != null) && (this.d != paramInt))
    {
      this.b.setImageResource(paramInt);
      this.d = paramInt;
    }
  }
  
  public void a(ImageButton paramImageButton, com.fimi.soul.drone.a parama)
  {
    this.f = new WeakReference(paramImageButton);
    this.b = ((ImageButton)this.f.get());
    this.c = parama;
    b();
  }
  
  public void a(a parama)
  {
    this.a = parama;
  }
  
  public void a(LatLng paramLatLng)
  {
    c localc = this.c.aa();
    if ((localc != null) && (paramLatLng != null)) {
      localc.a(b.a(paramLatLng), 300, new c.a()
      {
        public void a() {}
        
        public void b() {}
      });
    }
  }
  
  public void a(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }
  
  public void b()
  {
    if ((this.c.U()) && (this.c.u().c() >= 3))
    {
      if (this.a == a.c)
      {
        a(a.c);
        a(2130903042);
        return;
      }
      a(a.b);
      a(2130903043);
      return;
    }
    a(a.a);
    a(2130838263);
  }
  
  public a c()
  {
    return this.a;
  }
  
  public void d()
  {
    c localc = this.c.aa();
    if (localc != null) {}
    switch (2.a[this.a.ordinal()])
    {
    default: 
    case 1: 
    case 2: 
      Location localLocation;
      do
      {
        return;
        a(2130903042);
        a(a.c);
        localc.a(b.b(this.h));
        return;
        localLocation = this.c.b();
      } while (localLocation == null);
      localc.b(b.a(new LatLng(localLocation.getLatitude(), localLocation.getLongitude()), 18.0F));
      return;
    }
    a(2130903043);
    a(a.b);
  }
  
  public boolean e()
  {
    return this.g;
  }
  
  public static enum a
  {
    private a() {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */