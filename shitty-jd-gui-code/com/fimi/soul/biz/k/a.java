package com.fimi.soul.biz.k;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.Point;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
import com.fimi.kernel.utils.x;
import com.fimi.soul.entity.DynamicDYZ_Entity;
import com.fimi.soul.utils.af;
import com.fimi.soul.utils.ag;
import com.fimi.soul.utils.ao;
import com.fimi.soul.utils.y;
import com.fimi.soul.utils.z;
import com.google.android.gms.maps.h;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

public class a
{
  final List<LatLng> a = new ArrayList();
  Handler b = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      super.handleMessage(paramAnonymousMessage);
      if (paramAnonymousMessage.what == 100) {
        try
        {
          if (a.a(a.this).a().b < 10.0F)
          {
            paramAnonymousMessage = a.b(a.this).iterator();
            while (paramAnonymousMessage.hasNext())
            {
              ((com.google.android.gms.maps.model.c)paramAnonymousMessage.next()).a();
              continue;
              return;
            }
          }
        }
        catch (Exception paramAnonymousMessage)
        {
          paramAnonymousMessage.printStackTrace();
        }
      }
      for (;;)
      {
        a.b(a.this).clear();
        a.this.a.clear();
        paramAnonymousMessage = new Point(0, 0);
        paramAnonymousMessage = a.a(a.this).n().a(paramAnonymousMessage);
        Object localObject = a.a(a.this).a().a;
        if (localObject != null)
        {
          double d2 = y.c(paramAnonymousMessage, (LatLng)localObject).a();
          double d1 = d2;
          if (d2 < 20000.0D) {
            d1 = 20000.0D;
          }
          d1 /= 111000.0D;
          if (a.c(a.this) != null)
          {
            paramAnonymousMessage = a.c(a.this).rawQuery("SELECT LAT,LON,CLASS from dmz_tb where LAT > " + (((LatLng)localObject).a - d1) + " and LAT <" + (((LatLng)localObject).a + d1) + " and LON >" + (((LatLng)localObject).b - d1) + " and LON < " + (d1 + ((LatLng)localObject).b), null);
            if ((paramAnonymousMessage != null) && (paramAnonymousMessage.getCount() > 0)) {
              while (paramAnonymousMessage.moveToNext())
              {
                d1 = paramAnonymousMessage.getFloat(paramAnonymousMessage.getColumnIndex("LAT"));
                d2 = paramAnonymousMessage.getFloat(paramAnonymousMessage.getColumnIndex("LON"));
                int i = (byte)paramAnonymousMessage.getInt(paramAnonymousMessage.getColumnIndex("CLASS"));
                localObject = new LatLng(d1, d2);
                a.a(a.this, (LatLng)localObject, ((i & 0x3F) + 1) * 1000, a.d(a.this));
              }
            }
            if (paramAnonymousMessage != null) {
              paramAnonymousMessage.close();
            }
          }
          if ((a.e(a.this) != null) && (a.e(a.this).size() > 0))
          {
            paramAnonymousMessage = a.e(a.this).iterator();
            while (paramAnonymousMessage.hasNext())
            {
              localObject = (DynamicDYZ_Entity)paramAnonymousMessage.next();
              LatLng localLatLng = new LatLng(((DynamicDYZ_Entity)localObject).getLatitude(), ((DynamicDYZ_Entity)localObject).getLogitude());
              a.a(a.this, localLatLng, ((DynamicDYZ_Entity)localObject).getRadius(), a.f(a.this));
            }
          }
        }
      }
    }
  };
  private AsyncTask c;
  private SQLiteDatabase d;
  private com.google.android.gms.maps.c e;
  private List<com.google.android.gms.maps.model.c> f;
  private CircleOptions g;
  private CircleOptions h;
  private ExecutorService i;
  private List<DynamicDYZ_Entity> j;
  private Context k;
  private final int l = 100;
  
  public a(Context paramContext, com.google.android.gms.maps.c paramc)
  {
    this.k = paramContext;
    this.e = paramc;
    this.f = b.a().b();
    a(paramContext);
    this.i = x.a();
    c();
  }
  
  private void a(Context paramContext)
  {
    try
    {
      paramContext = new File(ao.o(paramContext));
      if (paramContext.exists()) {
        this.d = SQLiteDatabase.openDatabase(paramContext.getPath(), null, 0);
      }
      return;
    }
    catch (Exception paramContext) {}
  }
  
  private void a(LatLng paramLatLng, int paramInt, CircleOptions paramCircleOptions)
  {
    if (!com.fimi.soul.biz.n.a.a().b()) {
      paramLatLng = z.a(paramLatLng.a, paramLatLng.b);
    }
    for (paramLatLng = new LatLng(paramLatLng.a(), paramLatLng.b());; paramLatLng = new LatLng(paramLatLng.a, paramLatLng.b))
    {
      if (!this.a.contains(paramLatLng))
      {
        this.a.add(paramLatLng);
        paramLatLng = this.e.a(paramCircleOptions.a(paramLatLng).a(paramInt));
        if (!this.f.contains(paramLatLng)) {
          this.f.add(paramLatLng);
        }
      }
      return;
    }
  }
  
  private void c()
  {
    this.g = new CircleOptions().a(8000.0D).a(Color.argb(127, 255, 54, 0)).a(2.0F).b(Color.argb(51, 255, 54, 0)).b(100.0F);
    this.h = new CircleOptions().a(8000.0D).a(this.k.getResources().getColor(2131624108)).a(2.0F).b(Color.argb(51, 255, 54, 0)).b(100.0F);
  }
  
  public void a()
  {
    this.b.sendEmptyMessage(100);
  }
  
  public void a(List<DynamicDYZ_Entity> paramList)
  {
    this.j = paramList;
  }
  
  public void b()
  {
    if ((this.d != null) && (this.d.isOpen())) {
      this.d.close();
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/k/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */