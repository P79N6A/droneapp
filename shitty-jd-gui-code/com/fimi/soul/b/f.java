package com.fimi.soul.b;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ThumbnailUtils;
import android.os.AsyncTask;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.fimi.kernel.b.b.b.a;
import com.fimi.kernel.b.b.b.d;
import com.fimi.kernel.b.b.c;
import com.fimi.kernel.utils.p;
import com.fimi.kernel.utils.s;
import com.fimi.kernel.utils.x;
import com.fimi.kernel.utils.z;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.camera.d;
import com.fimi.soul.drone.a;
import com.fimi.soul.entity.WifiDistanceFile;
import com.fimi.soul.media.gallery.DroneImagePagerActivity;
import com.fimi.soul.media.player.FermiPlayerUtils;
import com.fimi.soul.utils.ao;
import com.fimi.soul.utils.aq;
import com.fimi.soul.utils.j;
import com.fimi.soul.utils.v;
import com.fimi.soul.view.MediaImageLoadingView;
import com.fimi.soul.view.MyGridView;
import com.fimi.soul.view.StrokeDigitalView;
import com.fimi.soul.view.StrokeTextView;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class f
  extends BaseAdapter
  implements AdapterView.OnItemClickListener
{
  public static List<WifiDistanceFile> a;
  ExecutorService b = Executors.newFixedThreadPool(3);
  Object c = new Object();
  private int d;
  private int e;
  private boolean f = true;
  private boolean g = false;
  private Context h;
  private List<e> i;
  private List<WifiDistanceFile> j;
  private a k = a.a;
  private b l;
  private int m = 0;
  private boolean n = false;
  private a o;
  private d p;
  private float q;
  private Set<c> r;
  private MyGridView s;
  private aq t;
  private HashMap u = null;
  private HashMap<Integer, d> v = new HashMap();
  private Boolean w = Boolean.valueOf(true);
  private int x = 0;
  private int y = 0;
  
  public f(Context paramContext, MyGridView paramMyGridView)
  {
    this.h = paramContext;
    this.i = new ArrayList();
    this.j = new ArrayList();
    this.r = new HashSet();
    this.t = aq.a();
    this.u = DroidPlannerApp.c();
    this.s = paramMyGridView;
    if (p.b(paramContext) < p.a(paramContext)) {}
    for (float f1 = p.b(paramContext);; f1 = p.a(paramContext))
    {
      this.q = f1;
      return;
    }
  }
  
  private d a(View paramView)
  {
    d locald = new d();
    locald.c = ((ImageView)paramView.findViewById(2131690336));
    locald.b = ((SimpleDraweeView)paramView.findViewById(2131690335));
    locald.d = ((ImageView)paramView.findViewById(2131690341));
    locald.e = ((MediaImageLoadingView)paramView.findViewById(2131690340));
    locald.m = ((ImageView)paramView.findViewById(2131690339));
    locald.f = ((StrokeDigitalView)paramView.findViewById(2131690337));
    locald.a = paramView.findViewById(2131690338);
    locald.g = ((ImageView)paramView.findViewById(2131690344));
    locald.h = ((TextView)paramView.findViewById(2131689872));
    locald.i = ((ImageView)paramView.findViewById(2131690343));
    locald.j = ((StrokeTextView)paramView.findViewById(2131690342));
    ao.a(this.h.getAssets(), new View[] { locald.h });
    return locald;
  }
  
  private void a(int paramInt1, int paramInt2)
  {
    int i1 = paramInt1;
    for (;;)
    {
      if (i1 < paramInt1 + paramInt2) {}
      Object localObject2;
      String str2;
      String str3;
      Bitmap localBitmap;
      String str4;
      for (;;)
      {
        try
        {
          localObject2 = (WifiDistanceFile)this.j.get(i1);
          if (((WifiDistanceFile)localObject2).getDownloadTaskInfo() != null) {
            break label356;
          }
          if ((!b()) || (((WifiDistanceFile)localObject2).getType() != 2)) {
            break label202;
          }
          str2 = ((WifiDistanceFile)localObject2).getName();
          String str1 = ((WifiDistanceFile)localObject2).getRemoteThmUrl();
          str2 = j.a(str2, ((WifiDistanceFile)localObject2).getDateString());
          if (str2 == null) {
            break label356;
          }
          str2 = str2.replace("file://", "");
          str3 = "getdur" + str2;
          localBitmap = a(str2);
          str4 = (String)this.u.get(str3);
          if (localBitmap != null) {
            break;
          }
          localObject2 = new c();
          this.r.add(localObject2);
          ((c)localObject2).executeOnExecutor(this.b, new String[] { str1, str2 });
        }
        catch (Exception localException)
        {
          localException.printStackTrace();
        }
        return;
        label202:
        if (((WifiDistanceFile)localObject2).getType() == 1)
        {
          str2 = ((WifiDistanceFile)localObject2).getLocalThumbnailPath();
          localObject1 = "";
        }
        else
        {
          str2 = ((WifiDistanceFile)localObject2).getPath();
          localObject1 = "";
        }
      }
      Object localObject1 = (ImageView)this.s.findViewWithTag(str2);
      TextView localTextView = (TextView)this.s.findViewWithTag(str3);
      if ((!b()) && (((WifiDistanceFile)localObject2).getType() == 2))
      {
        if ((localTextView == null) || (str4 == null)) {
          break label341;
        }
        localTextView.setVisibility(0);
        localTextView.setText((String)this.u.get(str3));
      }
      while ((localObject1 != null) && (localBitmap != null))
      {
        a((ImageView)localObject1, str2, localBitmap);
        break;
        label341:
        if (localTextView != null) {
          localTextView.setVisibility(8);
        }
      }
      label356:
      i1 += 1;
    }
  }
  
  @TargetApi(16)
  private void a(ImageView paramImageView, String paramString, Bitmap paramBitmap)
  {
    if (paramBitmap == null)
    {
      paramImageView.setBackgroundResource(2130837953);
      return;
    }
    paramImageView.setBackground(s.a(paramBitmap));
    paramImageView.invalidate();
  }
  
  @TargetApi(16)
  private void a(b.a parama, d paramd)
  {
    ImageView localImageView = paramd.d;
    String str = paramd.k.getLocalDownloadCachePath();
    switch (3.a[parama.ordinal()])
    {
    default: 
      return;
    case 5: 
      paramd.e.setVisibility(8);
      paramd.h.setVisibility(8);
      localImageView.setVisibility(8);
      localImageView.setImageDrawable(null);
      paramd.m.setVisibility(8);
      return;
    case 4: 
      localImageView.setImageResource(2130838358);
      paramd.e.a();
      parama = a(str);
      if (parama != null)
      {
        paramd.m.setVisibility(0);
        paramd.b.setBackground(s.a(parama));
      }
      for (;;)
      {
        localImageView.setVisibility(0);
        return;
        paramd.m.setVisibility(8);
        paramd.b.setBackgroundResource(2130837953);
      }
    case 3: 
      paramd.h.setText(2131362159);
      localImageView.setImageResource(2130837858);
      paramd.e.b();
      return;
    case 2: 
      paramd.h.setText(2131362569);
      paramd.h.setVisibility(0);
      localImageView.setImageResource(2130837895);
      return;
    }
    paramd.h.setVisibility(0);
    localImageView.setImageResource(2130837895);
  }
  
  @TargetApi(16)
  private void a(d paramd, int paramInt, com.fimi.kernel.b.b.b paramb)
  {
    Object localObject;
    String str1;
    if ((b()) && (paramd.k.getType() == 2))
    {
      localObject = paramd.k.getName();
      str1 = paramd.k.getRemoteThmUrl();
      localObject = j.a((String)localObject, paramd.k.getDateString());
      paramd.k.setLocalThumbnailPath((String)localObject);
    }
    while (localObject == null)
    {
      return;
      if ((!b()) && (paramb != null) && (paramb.g() != b.a.e))
      {
        localObject = paramd.k.getLocalDownloadCachePath();
        str1 = "";
      }
      else if (paramd.k.getType() == 1)
      {
        localObject = paramd.k.getLocalThumbnailPath();
        str1 = "";
      }
      else
      {
        localObject = paramd.k.getPath();
        str1 = "";
      }
    }
    String str2 = ((String)localObject).replace("file://", "");
    if (b())
    {
      localObject = "getdur_online" + str2;
      label191:
      if ((!b()) && (paramd.k.getType() == 2))
      {
        paramd.f.setTag(localObject);
        String str3 = (String)this.u.get(localObject);
        if (str3 == null) {
          break label405;
        }
        paramd.f.setVisibility(0);
        paramd.f.setText(str3);
      }
      label254:
      paramd.b.setTag(str2);
      paramd.f.setTag(localObject);
      localObject = a(str2);
      if ((paramb == null) || (paramb.g() == b.a.e)) {
        break label452;
      }
      paramd.m.setVisibility(0);
    }
    for (;;)
    {
      a(paramd.b, str2, (Bitmap)localObject);
      if ((paramInt >= 12) || (localObject != null)) {
        break;
      }
      a(str2, paramd.b);
      paramd = new c();
      this.r.add(paramd);
      paramd.executeOnExecutor(this.b, new String[] { str1, str2 });
      return;
      localObject = "getdur_local" + str2;
      break label191;
      label405:
      if (paramd.k.getDurationString() != null)
      {
        paramd.f.setVisibility(0);
        paramd.f.setText(paramd.k.getDurationString());
        break label254;
      }
      paramd.f.setVisibility(8);
      break label254;
      label452:
      paramd.m.setVisibility(8);
    }
  }
  
  @TargetApi(16)
  private void a(String paramString, ImageView paramImageView)
  {
    paramString = a(paramString);
    paramImageView.setBackground(null);
    if (paramString != null)
    {
      paramImageView.setBackground(s.a(paramString));
      return;
    }
    paramImageView.setBackgroundResource(2130837953);
  }
  
  public Bitmap a(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    return this.t.a(paramString);
  }
  
  public void a()
  {
    this.g = true;
  }
  
  public void a(int paramInt)
  {
    this.i.remove(paramInt);
    notifyDataSetChanged();
  }
  
  public void a(int paramInt, d paramd)
  {
    boolean bool = false;
    if (this.k != a.b) {
      return;
    }
    e locale;
    if ((paramInt >= 0) && (paramInt < this.i.size()))
    {
      locale = (e)this.i.get(paramInt);
      Log.d("Good", "total " + this.i.size() + " index " + paramInt);
      if (!locale.b) {
        break label163;
      }
      this.m -= 1;
      paramd.g.setVisibility(8);
      paramd.i.setVisibility(8);
    }
    for (;;)
    {
      if (!locale.b) {
        bool = true;
      }
      locale.b = bool;
      if (this.l == null) {
        break;
      }
      this.l.a(this.m);
      return;
      label163:
      this.m += 1;
      paramd.g.setVisibility(0);
      paramd.i.setVisibility(0);
    }
  }
  
  public void a(AbsListView paramAbsListView, int paramInt)
  {
    if (paramInt == 0)
    {
      a(this.d, this.e);
      this.w = Boolean.valueOf(true);
      this.x = this.d;
      this.y = this.e;
      return;
    }
    j();
    this.w = Boolean.valueOf(false);
  }
  
  public void a(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    this.d = paramInt1;
    this.e = paramInt2;
    if ((this.f) && (paramInt2 > 0))
    {
      a(paramInt1, paramInt2);
      this.f = false;
    }
    if ((this.w.booleanValue()) && (this.x + this.y < this.d + this.e))
    {
      this.x = this.d;
      this.y = this.e;
      a(this.d, this.e);
    }
  }
  
  public void a(a parama)
  {
    this.k = parama;
  }
  
  public void a(b paramb)
  {
    this.l = paramb;
  }
  
  public void a(a parama)
  {
    this.o = parama;
  }
  
  public void a(WifiDistanceFile paramWifiDistanceFile)
  {
    if (!this.j.contains(paramWifiDistanceFile))
    {
      this.j.add(paramWifiDistanceFile);
      paramWifiDistanceFile = new e(paramWifiDistanceFile);
      this.i.add(paramWifiDistanceFile);
    }
    notifyDataSetChanged();
  }
  
  public void a(String paramString, Bitmap paramBitmap)
  {
    if (a(paramString) == null) {
      this.t.a(paramString, paramBitmap);
    }
  }
  
  public void a(List<WifiDistanceFile> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext()) {
      localArrayList.add(new e((WifiDistanceFile)localIterator.next()));
    }
    this.i = localArrayList;
    this.j = paramList;
  }
  
  public void a(boolean paramBoolean)
  {
    this.n = paramBoolean;
  }
  
  public void b(WifiDistanceFile paramWifiDistanceFile)
  {
    if (this.j.contains(paramWifiDistanceFile))
    {
      int i1 = this.j.indexOf(paramWifiDistanceFile);
      this.j.remove(i1);
      this.i.remove(i1);
    }
    notifyDataSetChanged();
  }
  
  public void b(String paramString)
  {
    Iterator localIterator = this.i.iterator();
    while (localIterator.hasNext())
    {
      e locale = (e)localIterator.next();
      if (locale.a.getPath().equals(paramString)) {
        this.i.remove(locale);
      }
    }
    notifyDataSetChanged();
  }
  
  public boolean b()
  {
    return this.n;
  }
  
  public List<WifiDistanceFile> c()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.i.iterator();
    while (localIterator.hasNext())
    {
      e locale = (e)localIterator.next();
      if (locale.b) {
        localArrayList.add(locale.a);
      }
    }
    return localArrayList;
  }
  
  public void c(WifiDistanceFile paramWifiDistanceFile)
  {
    int i1 = 0;
    while (i1 < this.j.size())
    {
      if (paramWifiDistanceFile.getName().equals(((WifiDistanceFile)this.j.get(i1)).getName()))
      {
        this.j.remove(i1);
        this.i.remove(i1);
        notifyDataSetChanged();
      }
      i1 += 1;
    }
  }
  
  public List<WifiDistanceFile> d()
  {
    return this.j;
  }
  
  public a e()
  {
    return this.k;
  }
  
  public void f()
  {
    Iterator localIterator = this.i.iterator();
    while (localIterator.hasNext()) {
      ((e)localIterator.next()).b = true;
    }
    this.m = this.i.size();
    if (this.l != null) {
      this.l.a(this.m);
    }
    notifyDataSetChanged();
  }
  
  public void g()
  {
    Iterator localIterator = this.i.iterator();
    while (localIterator.hasNext()) {
      ((e)localIterator.next()).b = false;
    }
    this.m = 0;
    if (this.l != null) {
      this.l.a(this.m);
    }
    notifyDataSetChanged();
  }
  
  public int getCount()
  {
    if (this.i != null) {
      return this.i.size();
    }
    return 0;
  }
  
  public Object getItem(int paramInt)
  {
    return this.i.get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  @TargetApi(16)
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    this.s = ((MyGridView)paramViewGroup);
    Object localObject = (e)this.i.get(paramInt);
    final com.fimi.kernel.b.b.b localb;
    label178:
    label202:
    String str;
    if (paramView == null)
    {
      paramView = LayoutInflater.from(this.h).inflate(2130968720, null);
      paramViewGroup = a(paramView);
      paramViewGroup.k = ((e)localObject).a;
      paramView.setLayoutParams(new AbsListView.LayoutParams(-1, (int)((this.q - p.a(this.h, 50.0F) - 4.0F * p.a(this.h, 5.0F)) / 3.0F)));
      paramView.setTag(paramViewGroup);
      paramViewGroup.l = paramInt;
      localb = ((e)localObject).a.getDownloadTaskInfo();
      if (!this.g) {
        this.v.put(Integer.valueOf(paramInt), paramViewGroup);
      }
      if (this.n) {
        break label528;
      }
      if (localb != null)
      {
        localb.a(Integer.valueOf(paramInt));
        localb.a(new b.d()
        {
          public void a(b.a paramAnonymousa, com.fimi.kernel.b.b.b paramAnonymousb)
          {
            f.d locald;
            if (paramAnonymousb.j() != null)
            {
              int i = ((Integer)paramAnonymousb.j()).intValue();
              locald = (f.d)f.a(f.this).get(Integer.valueOf(i));
              if (locald.l == i) {
                break label47;
              }
            }
            label47:
            long l1;
            long l2;
            do
            {
              c localc;
              do
              {
                return;
                localc = c.a(f.b(f.this));
                if (paramAnonymousa != b.a.a) {
                  break;
                }
              } while (paramAnonymousb == null);
              localc.c();
              f.a(f.this, paramAnonymousa, locald);
              return;
              l1 = paramAnonymousb.k() / (paramAnonymousb.i() / 100L);
              String str = locald.h.getText().toString().substring(3).replace("%", "");
              if ((!ao.e(str)) || (str.equals(""))) {
                break;
              }
              l2 = Long.parseLong(str);
              if (paramAnonymousb.g() == b.a.e)
              {
                f.a(f.this, paramAnonymousb.g(), locald);
                if (paramAnonymousb.n() != null)
                {
                  paramAnonymousa = paramAnonymousb.h().replace("file://", "");
                  f.this.a(paramAnonymousa, paramAnonymousb.n());
                  f.a(f.this, locald.b, paramAnonymousa, paramAnonymousb.n());
                  if (paramAnonymousb.a() != null)
                  {
                    f.c(f.this).put("getdur_local" + paramAnonymousa, paramAnonymousb.a());
                    locald.f.setVisibility(0);
                    locald.f.setText(paramAnonymousb.a());
                  }
                }
                localc.a(paramAnonymousb);
                localc.a();
                return;
              }
            } while (l2 == l1);
            if (paramAnonymousb.a() != null)
            {
              locald.f.setVisibility(0);
              locald.f.setText(paramAnonymousb.a());
            }
            locald.h.setVisibility(0);
            locald.h.setText(String.format(f.b(f.this).getString(2131362164), new Object[] { l1 + "%" }));
            locald.e.setVisibility(0);
            locald.e.setSweepAngle((float)l1);
            f.a(f.this, paramAnonymousa, locald);
            return;
            locald.h.setText(String.format(f.b(f.this).getString(2131362164), new Object[] { l1 + "%" }));
            locald.e.setVisibility(0);
            locald.e.setSweepAngle((float)l1);
            f.a(f.this, paramAnonymousa, locald);
          }
        });
      }
      if (!((e)localObject).b) {
        break label582;
      }
      paramViewGroup.g.setVisibility(0);
      paramViewGroup.i.setVisibility(0);
      paramViewGroup.k = ((e)localObject).a;
      paramViewGroup.c.setVisibility(8);
      paramViewGroup.f.setVisibility(4);
      paramViewGroup.d.setVisibility(4);
      paramViewGroup.e.setVisibility(4);
      paramViewGroup.b.setBackgroundResource(2130837953);
      paramViewGroup.b.invalidate();
      paramViewGroup.b.setTag(null);
      paramViewGroup.h.setVisibility(4);
      if (localb != null)
      {
        paramViewGroup.d.setVisibility(0);
        paramViewGroup.e.setVisibility(0);
        long l1 = localb.k() / (localb.i() / 100L);
        paramViewGroup.h.setVisibility(0);
        paramViewGroup.e.setSweepAngle((float)l1);
        paramViewGroup.h.setText(String.format(this.h.getString(2131362164), new Object[] { l1 + "%" }));
        if (l1 == 100L) {
          localb.f();
        }
        str = paramViewGroup.k.getLocalDownloadCachePath();
      }
      switch (3.a[localb.g().ordinal()])
      {
      default: 
        label452:
        if (paramViewGroup.k.getType() == 2)
        {
          paramViewGroup.c.setVisibility(0);
          if (paramViewGroup.k.getDurationString() == null) {
            break label853;
          }
          paramViewGroup.f.setVisibility(0);
          paramViewGroup.f.setText(paramViewGroup.k.getDurationString());
        }
        break;
      }
    }
    for (;;)
    {
      if (!this.g) {
        break label865;
      }
      this.g = false;
      return paramView;
      paramViewGroup = (d)paramView.getTag();
      break;
      label528:
      if (!com.fimi.soul.biz.camera.b.c(((e)localObject).a.getName()))
      {
        paramViewGroup.j.setVisibility(0);
        paramViewGroup.j.setText(this.h.getString(2131362511));
        break label178;
      }
      paramViewGroup.j.setVisibility(8);
      break label178;
      label582:
      paramViewGroup.g.setVisibility(8);
      paramViewGroup.i.setVisibility(8);
      break label202;
      paramViewGroup.h.setText(2131362569);
      paramViewGroup.d.setImageResource(2130837895);
      paramViewGroup.e.a();
      break label452;
      paramViewGroup.d.setVisibility(8);
      paramViewGroup.e.setVisibility(8);
      paramViewGroup.h.setVisibility(8);
      ((e)localObject).a.setDownloadTaskInfo(null);
      a(paramViewGroup, paramInt, localb);
      x.a(new Runnable()
      {
        public void run()
        {
          c.a(f.b(f.this)).a(localb);
        }
      });
      break label452;
      localObject = a(str);
      if (localObject != null)
      {
        paramViewGroup.m.setVisibility(0);
        paramViewGroup.b.setBackground(s.a((Bitmap)localObject));
      }
      for (;;)
      {
        paramViewGroup.d.setImageResource(2130838358);
        paramViewGroup.e.a();
        break;
        paramViewGroup.m.setVisibility(8);
        paramViewGroup.b.setBackgroundResource(2130837953);
      }
      localObject = a(str);
      if (localObject != null)
      {
        paramViewGroup.m.setVisibility(0);
        paramViewGroup.b.setBackground(s.a((Bitmap)localObject));
      }
      for (;;)
      {
        paramViewGroup.h.setText(2131362159);
        paramViewGroup.d.setImageResource(2130837858);
        paramViewGroup.e.b();
        break;
        paramViewGroup.m.setVisibility(8);
        paramViewGroup.b.setBackgroundResource(2130837953);
      }
      label853:
      paramViewGroup.f.setVisibility(8);
    }
    label865:
    a(paramViewGroup, paramInt, localb);
    return paramView;
  }
  
  public void h()
  {
    this.j.clear();
    this.i.clear();
    notifyDataSetChanged();
  }
  
  protected d i()
  {
    if (this.p == null) {
      this.p = ((d)com.fimi.soul.biz.camera.b.a().d());
    }
    return this.p;
  }
  
  public void j()
  {
    if (this.r != null)
    {
      Iterator localIterator = this.r.iterator();
      while (localIterator.hasNext()) {
        ((c)localIterator.next()).cancel(false);
      }
    }
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if ((this.n) && (!i().d()))
    {
      z.a(this.h, 2131362510, z.b);
      return;
    }
    a = new ArrayList();
    paramView = (d)paramView.getTag();
    if (this.k == a.b)
    {
      a(paramInt, paramView);
      return;
    }
    paramAdapterView = (e)this.i.get(paramInt);
    Object localObject = paramAdapterView.a.getDownloadTaskInfo();
    if ((localObject != null) && (((com.fimi.kernel.b.b.b)localObject).g() != b.a.e))
    {
      switch (3.a[localObject.g().ordinal()])
      {
      default: 
        return;
      case 1: 
        ((com.fimi.kernel.b.b.b)localObject).e();
        paramView.h.setText(this.h.getResources().getString(2131362569));
        paramView.d.setImageResource(2130837895);
        paramView.e.a();
        return;
      case 2: 
      case 3: 
        paramLong = ((com.fimi.kernel.b.b.b)localObject).k() / (((com.fimi.kernel.b.b.b)localObject).i() / 100L);
        Log.d("Good", "执行点击事件" + ((com.fimi.kernel.b.b.b)localObject).g());
        if (c.a(this.h).b() < 3) {
          ((com.fimi.kernel.b.b.b)localObject).c();
        }
        for (;;)
        {
          paramView.d.setImageResource(2130838358);
          paramView.e.a();
          paramView.h.setText(String.format(this.h.getString(2131362164), new Object[] { paramLong + "%" }));
          return;
          ((com.fimi.kernel.b.b.b)localObject).d();
        }
      }
      Log.d("Good", "执行点击事件->停止");
      ((com.fimi.kernel.b.b.b)localObject).e();
      paramView.h.setText(this.h.getResources().getString(2131362569));
      paramView.d.setImageResource(2130837895);
      paramView.e.a();
      c.a(this.h).c();
      return;
    }
    for (;;)
    {
      ArrayList localArrayList;
      Intent localIntent;
      int i1;
      e locale;
      try
      {
        paramView = new ArrayList();
        localObject = new ArrayList();
        localArrayList = new ArrayList();
        localIntent = new Intent(this.h, DroneImagePagerActivity.class);
        i1 = 0;
        if (i1 >= this.i.size()) {
          break label768;
        }
        locale = (e)this.i.get(i1);
        if (this.n)
        {
          if (locale.a.getType() == 2)
          {
            paramView.add(locale.a.getRemoteThmUrl() + "&&" + locale.a.getRemoteUrl());
            localArrayList.add(locale.a.getDurationString());
            ((List)localObject).add(locale.a.getLocalThumbnailPath());
            a.add(((e)this.i.get(i1)).a);
            localIntent.putExtra("image_drone_media", true);
            if (paramAdapterView.a != locale.a) {
              break label865;
            }
            paramInt = paramView.size() - 1;
            break label865;
          }
          paramView.add(locale.a.getRemoteUrl());
          localArrayList.add("");
          continue;
        }
        localb = locale.a.getDownloadTaskInfo();
      }
      catch (Resources.NotFoundException paramAdapterView)
      {
        paramAdapterView.printStackTrace();
        return;
      }
      com.fimi.kernel.b.b.b localb;
      if ((localb != null) && (localb.g() == b.a.e))
      {
        paramView.add(locale.a.getLocalThumbnailPath());
        ((List)localObject).add(locale.a.getPath());
      }
      if (localb == null)
      {
        paramView.add(locale.a.getLocalThumbnailPath());
        ((List)localObject).add(locale.a.getPath());
      }
      localIntent.putExtra("image_drone_media", false);
      continue;
      label768:
      localIntent.putExtra("image_urls", (Serializable)paramView);
      localIntent.putExtra("image_drone_local", (Serializable)localObject);
      localIntent.putExtra("image_index", paramInt);
      localIntent.putExtra("extra_type", paramAdapterView.a.getType());
      localIntent.putExtra("video_duration", (Serializable)localArrayList);
      ((Activity)this.h).startActivityForResult(localIntent, 0);
      ((Activity)this.h).overridePendingTransition(17432576, 17432577);
      return;
      label865:
      i1 += 1;
    }
  }
  
  public static enum a
  {
    private a() {}
  }
  
  public static abstract interface b
  {
    public abstract void a(int paramInt);
  }
  
  class c
    extends AsyncTask<String, Void, Bitmap>
  {
    String a = null;
    private String c;
    private String d;
    
    c() {}
    
    protected Bitmap a(String... paramVarArgs)
    {
      this.d = paramVarArgs[0];
      this.c = paramVarArgs[1];
      paramVarArgs = null;
      if ((!"".equalsIgnoreCase(this.d)) && (!new File(this.c).exists())) {
        if (FermiPlayerUtils.createRemoteVideoThumbnail(this.d, this.c)) {
          paramVarArgs = BitmapFactory.decodeFile(this.c);
        }
      }
      for (;;)
      {
        if (paramVarArgs != null) {
          f.this.a(this.c, paramVarArgs);
        }
        return paramVarArgs;
        if (v.c(this.c, f.b(f.this))) {
          paramVarArgs = ThumbnailUtils.createVideoThumbnail(this.c, 1);
        }
        Bitmap localBitmap;
        try
        {
          this.a = FermiPlayerUtils.getVideoDurationString(f.b(f.this), this.c, "mm:ss");
          if (f.this.b())
          {
            f.c(f.this).put("getdur_online" + this.c, this.a);
            continue;
          }
          f.c(f.this).put("getdur_local" + this.c, this.a);
        }
        catch (Exception localException) {}
        try
        {
          localBitmap = s.a(f.b(f.this), this.c, 160);
          paramVarArgs = localBitmap;
        }
        catch (IOException localIOException)
        {
          localIOException.printStackTrace();
        }
      }
    }
    
    @TargetApi(16)
    protected void a(Bitmap paramBitmap)
    {
      super.onPostExecute(paramBitmap);
      ImageView localImageView;
      TextView localTextView;
      if (f.this.b())
      {
        paramBitmap = "getdur_online" + this.c;
        localImageView = (ImageView)f.d(f.this).findViewWithTag(this.c);
        localTextView = (TextView)f.d(f.this).findViewWithTag(paramBitmap);
        if ((localTextView == null) || (this.a == null)) {
          break label179;
        }
        localTextView.setVisibility(0);
        localTextView.setText((String)f.c(f.this).get(paramBitmap));
      }
      for (;;)
      {
        paramBitmap = f.this.a(this.c);
        if ((paramBitmap != null) && (localImageView != null)) {
          f.a(f.this, localImageView, this.c, paramBitmap);
        }
        f.e(f.this).remove(this);
        return;
        paramBitmap = "getdur_local" + this.c;
        break;
        label179:
        if ((!f.this.b()) && (localTextView != null)) {
          localTextView.setVisibility(8);
        }
      }
    }
  }
  
  protected class d
  {
    View a;
    SimpleDraweeView b;
    ImageView c;
    ImageView d;
    MediaImageLoadingView e;
    StrokeDigitalView f;
    ImageView g;
    TextView h;
    ImageView i;
    StrokeTextView j;
    WifiDistanceFile k;
    int l;
    ImageView m;
    
    protected d() {}
  }
  
  class e
  {
    WifiDistanceFile a;
    boolean b;
    
    public e(WifiDistanceFile paramWifiDistanceFile)
    {
      this.a = paramWifiDistanceFile;
      this.b = false;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */