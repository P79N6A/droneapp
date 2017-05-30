package com.fimi.soul.module.flyplannermedia;

import android.app.Activity;
import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.MotionEventCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.TextView;
import com.fimi.kernel.utils.p;
import com.fimi.kernel.utils.t;
import com.fimi.soul.b.f.a;
import com.fimi.soul.b.f.b;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.camera.b;
import com.fimi.soul.biz.camera.b.e;
import com.fimi.soul.biz.camera.entity.X11FileInfo;
import com.fimi.soul.biz.camera.entity.X11FileSystem;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.biz.camera.entity.X11SystemConfig;
import com.fimi.soul.drone.a;
import com.fimi.soul.entity.WifiDistanceFile;
import com.fimi.soul.utils.ao;
import com.fimi.soul.utils.j;
import com.fimi.soul.view.MyGridView;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class DroneBaseMediaFragment
  extends Fragment
  implements AdapterView.OnItemLongClickListener, com.fimi.soul.biz.camera.b.d, e<X11RespCmd>
{
  protected com.fimi.soul.b.f a;
  float b = 0.0F;
  List<X11FileInfo> c = null;
  private MyGridView d = null;
  private TextView e = null;
  private com.fimi.soul.biz.camera.d f;
  private boolean g = false;
  private boolean h = false;
  private a i;
  private boolean j = false;
  private boolean k = false;
  private boolean l = false;
  
  private DroneMediaTabActivity o()
  {
    return (DroneMediaTabActivity)getActivity();
  }
  
  abstract void a(GridView paramGridView);
  
  public void a(WifiDistanceFile paramWifiDistanceFile)
  {
    if (((paramWifiDistanceFile == null) || (this.c == null) || (this.c.size() == 0)) && (!this.l)) {
      this.c = m().k().getCurDirFileList();
    }
    this.l = true;
    Object localObject;
    if ((this.c != null) && (this.c.size() > 0))
    {
      localObject = null;
      Iterator localIterator = this.c.iterator();
      if (localIterator.hasNext())
      {
        X11FileInfo localX11FileInfo = (X11FileInfo)localIterator.next();
        if (!localX11FileInfo.getAbsolutePath().equals(paramWifiDistanceFile.getAbsolutePath())) {
          break label137;
        }
        localObject = localX11FileInfo;
      }
    }
    label137:
    for (;;)
    {
      break;
      if (localObject != null) {
        this.c.remove(localObject);
      }
      return;
    }
  }
  
  public void a(List<WifiDistanceFile> paramList)
  {
    if ((paramList == null) || (paramList.size() == 0) || (this.c == null) || (this.c.size() == 0)) {}
    for (;;)
    {
      return;
      Log.d("moweiru", "toDeleteFiles=" + ((WifiDistanceFile)paramList.get(0)).getName());
      Object localObject = new ArrayList();
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        WifiDistanceFile localWifiDistanceFile = (WifiDistanceFile)paramList.next();
        Iterator localIterator = this.c.iterator();
        while (localIterator.hasNext())
        {
          X11FileInfo localX11FileInfo = (X11FileInfo)localIterator.next();
          if (localX11FileInfo.getName().equals(localWifiDistanceFile.getName())) {
            ((List)localObject).add(localX11FileInfo);
          }
        }
      }
      if ((localObject != null) && (((List)localObject).size() > 0))
      {
        paramList = ((List)localObject).iterator();
        while (paramList.hasNext())
        {
          localObject = (X11FileInfo)paramList.next();
          this.c.remove(localObject);
        }
      }
    }
  }
  
  protected void a(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }
  
  protected boolean a()
  {
    return this.h;
  }
  
  protected com.fimi.soul.b.f b()
  {
    return this.a;
  }
  
  protected void b(boolean paramBoolean)
  {
    View localView = o().b();
    if (paramBoolean) {}
    for (int m = 0;; m = 8)
    {
      localView.setVisibility(m);
      return;
    }
  }
  
  protected Button c()
  {
    return (Button)o().b().findViewById(2131690481);
  }
  
  protected void c(boolean paramBoolean)
  {
    View localView = o().a();
    if (paramBoolean) {}
    for (int m = 0;; m = 8)
    {
      localView.setVisibility(m);
      return;
    }
  }
  
  protected TextView d()
  {
    return this.e;
  }
  
  protected void d(boolean paramBoolean)
  {
    if (o() != null) {
      o().a(paramBoolean);
    }
  }
  
  public List<X11FileInfo> e()
  {
    return this.c;
  }
  
  protected void e(boolean paramBoolean)
  {
    View localView = o().a().findViewById(2131690475);
    if (paramBoolean) {}
    for (int m = 0;; m = 8)
    {
      localView.setVisibility(m);
      return;
    }
  }
  
  protected Button f()
  {
    return (Button)o().b().findViewById(2131690480);
  }
  
  protected void f(boolean paramBoolean)
  {
    View localView = o().a().findViewById(2131690473);
    if (paramBoolean) {}
    localView.setVisibility(8);
  }
  
  protected TextView g()
  {
    return (TextView)o().b().findViewById(2131690482);
  }
  
  protected void g(boolean paramBoolean)
  {
    View localView;
    if ((o() != null) && (o().findViewById(2131690215) != null))
    {
      localView = o().findViewById(2131690215);
      if (!paramBoolean) {
        break label41;
      }
    }
    label41:
    for (int m = 0;; m = 8)
    {
      localView.setVisibility(m);
      return;
    }
  }
  
  public String h()
  {
    Object localObject = new File(j.o());
    if ((localObject != null) && (((File)localObject).exists()))
    {
      localObject = ((File)localObject).listFiles();
      int i1 = 0;
      int n = 0;
      for (int m = 0;; m = i3)
      {
        i3 = n;
        i2 = m;
        if (i1 >= localObject.length) {
          break;
        }
        String str = localObject[i1].getName();
        i2 = n;
        if (str.endsWith(".MP4")) {
          i2 = n + 1;
        }
        i3 = m;
        if (str.endsWith(".jpg")) {
          i3 = m + 1;
        }
        i1 += 1;
        n = i2;
      }
    }
    int i3 = 0;
    int i2 = 0;
    return String.format(getActivity().getResources().getString(2131362436), new Object[] { i2 + "", i3 + "" });
  }
  
  protected void h(boolean paramBoolean)
  {
    b(paramBoolean);
    c(paramBoolean);
    if (paramBoolean)
    {
      this.d.setPadding(0, 0, 0, (int)p.a(getActivity(), 60.0F));
      b().a(f.a.b);
      f().setText(getString(2131362655));
      this.g = false;
      return;
    }
    this.d.setPadding(0, 0, 0, 0);
    b().a(f.a.a);
    b().g();
  }
  
  public String i()
  {
    if (!this.l) {
      this.c = m().k().getCurDirFileList();
    }
    if ((this.c != null) && (this.c.size() == 0)) {
      return "";
    }
    Iterator localIterator = this.c.iterator();
    long l1 = 0L;
    int n = 0;
    int m = 0;
    X11FileInfo localX11FileInfo;
    if (localIterator.hasNext())
    {
      localX11FileInfo = (X11FileInfo)localIterator.next();
      if (!localX11FileInfo.getName().endsWith(".MP4")) {
        break label301;
      }
      m += 1;
    }
    label301:
    for (;;)
    {
      int i1 = n;
      if (localX11FileInfo.getName().endsWith(".jpg")) {
        i1 = n + 1;
      }
      l1 = localX11FileInfo.getSize() / 1024L + l1;
      n = i1;
      break;
      double d1 = (float)m().i().getFreeKBSpace() / 1048576.0F;
      double d2 = (float)m().i().getTotalKBSpace() / 1048576.0F;
      return String.format(getActivity().getResources().getString(2131362534), new Object[] { n + "", m + "", t.a(d1, 2) + "", t.a(d2, 2) + "" });
    }
  }
  
  protected ImageButton j()
  {
    return (ImageButton)o().a().findViewById(2131690474);
  }
  
  protected ImageButton k()
  {
    return (ImageButton)o().a().findViewById(2131690478);
  }
  
  protected ImageButton l()
  {
    return (ImageButton)o().a().findViewById(2131690476);
  }
  
  protected com.fimi.soul.biz.camera.d m()
  {
    if (this.f == null) {
      this.f = ((com.fimi.soul.biz.camera.d)b.a().d());
    }
    return this.f;
  }
  
  public void n()
  {
    this.d.setAdapter(this.a);
  }
  
  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    this.i = ((DroidPlannerApp)paramActivity.getApplication()).a;
  }
  
  @Nullable
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(2130968687, null);
    this.d = ((MyGridView)paramLayoutInflater.findViewById(2131690217));
    if (this.a == null)
    {
      this.a = new com.fimi.soul.b.f(getActivity(), this.d);
      this.a.a(a());
      this.a.a(this.i);
    }
    this.e = ((TextView)paramLayoutInflater.findViewById(2131690216));
    ao.a(o().getAssets(), new View[] { this.e });
    this.d.setAdapter(this.a);
    this.d.setOnItemLongClickListener(this);
    this.d.setOnItemClickListener(this.a);
    this.d.setOnScrollListener(new AbsListView.OnScrollListener()
    {
      private int b;
      private int c;
      
      public void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        this.b = paramAnonymousInt1;
        this.c = paramAnonymousInt2;
        DroneBaseMediaFragment.this.a.a(paramAnonymousAbsListView, paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3);
      }
      
      public void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
        DroneBaseMediaFragment.this.a.a(paramAnonymousAbsListView, paramAnonymousInt);
        if ((paramAnonymousInt == 1) && (this.b == 0) && (DroneBaseMediaFragment.a(DroneBaseMediaFragment.this)) && (DroneBaseMediaFragment.this.a.e() != f.a.b)) {
          if (!DroneBaseMediaFragment.b(DroneBaseMediaFragment.this))
          {
            if (!DroneBaseMediaFragment.c(DroneBaseMediaFragment.this))
            {
              DroneBaseMediaFragment.d(DroneBaseMediaFragment.this).setText(DroneBaseMediaFragment.this.h());
              DroneBaseMediaFragment.a(DroneBaseMediaFragment.this, true);
            }
          }
          else {
            DroneBaseMediaFragment.d(DroneBaseMediaFragment.this).setVisibility(0);
          }
        }
        for (;;)
        {
          if ((DroneBaseMediaFragment.this.m().k().getCurDirFileList().size() > DroneBaseMediaFragment.e(DroneBaseMediaFragment.this).getCount()) && (this.b + this.c >= DroneBaseMediaFragment.e(DroneBaseMediaFragment.this).getCount()) && (paramAnonymousInt == 0)) {
            DroneBaseMediaFragment.this.a(DroneBaseMediaFragment.e(DroneBaseMediaFragment.this));
          }
          return;
          DroneBaseMediaFragment.d(DroneBaseMediaFragment.this).setText(DroneBaseMediaFragment.this.i());
          break;
          DroneBaseMediaFragment.d(DroneBaseMediaFragment.this).setVisibility(8);
        }
      }
    });
    this.d.setOnTouchListener(new View.OnTouchListener()
    {
      public boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        float f = paramAnonymousMotionEvent.getY();
        int i = MotionEventCompat.getActionMasked(paramAnonymousMotionEvent);
        if (i == 2)
        {
          if (DroneBaseMediaFragment.this.b - f >= 0.0F) {
            break label78;
          }
          DroneBaseMediaFragment.b(DroneBaseMediaFragment.this, true);
        }
        for (;;)
        {
          if (i == 0)
          {
            DroneBaseMediaFragment.this.b = f;
            DroneBaseMediaFragment.a(DroneBaseMediaFragment.this, false);
          }
          if (i == 1) {
            DroneBaseMediaFragment.this.b = 0.0F;
          }
          return false;
          label78:
          DroneBaseMediaFragment.b(DroneBaseMediaFragment.this, false);
        }
      }
    });
    this.a.a(new f.b()
    {
      public void a(int paramAnonymousInt)
      {
        String str = String.format(DroneBaseMediaFragment.this.getActivity().getString(2131362455), new Object[] { Integer.valueOf(paramAnonymousInt) });
        DroneBaseMediaFragment.this.g().setText(str);
      }
    });
    c().setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        DroneBaseMediaFragment.this.h(false);
      }
    });
    f().setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        if (DroneBaseMediaFragment.f(DroneBaseMediaFragment.this))
        {
          DroneBaseMediaFragment.this.b().g();
          DroneBaseMediaFragment.this.f().setText(2131362655);
          paramAnonymousView = DroneBaseMediaFragment.this;
          if (DroneBaseMediaFragment.f(DroneBaseMediaFragment.this)) {
            break label81;
          }
        }
        label81:
        for (boolean bool = true;; bool = false)
        {
          DroneBaseMediaFragment.c(paramAnonymousView, bool);
          return;
          DroneBaseMediaFragment.this.f().setText(2131362863);
          DroneBaseMediaFragment.this.b().f();
          break;
        }
      }
    });
    return paramLayoutInflater;
  }
  
  public boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    h(true);
    return false;
  }
  
  public void onResume()
  {
    super.onResume();
    if (!m().d()) {
      m().t().b();
    }
    m().a(this);
    m().a(this);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/flyplannermedia/DroneBaseMediaFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */