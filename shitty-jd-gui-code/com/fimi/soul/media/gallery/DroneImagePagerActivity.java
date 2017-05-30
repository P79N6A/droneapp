package com.fimi.soul.media.gallery;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import cn.sharesdk.framework.ShareSDK;
import com.fimi.kernel.b.b.b.a;
import com.fimi.kernel.b.b.b.d;
import com.fimi.kernel.b.b.c;
import com.fimi.kernel.b.b.c.b;
import com.fimi.kernel.utils.t;
import com.fimi.kernel.utils.v;
import com.fimi.kernel.utils.z;
import com.fimi.kernel.view.dialog.a;
import com.fimi.kernel.view.progress.ProgressView;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.biz.camera.b.e;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.biz.manager.p;
import com.fimi.soul.biz.manager.p.b;
import com.fimi.soul.entity.ShareInfo;
import com.fimi.soul.entity.WifiDistanceFile;
import com.fimi.soul.media.player.FermiPlayerActivity;
import com.fimi.soul.utils.ao;
import com.fimi.soul.utils.j;
import com.fimi.soul.view.HackyViewPager;
import com.fimi.soul.view.f.a;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DroneImagePagerActivity
  extends BaseActivity
  implements View.OnClickListener, b.d, c.b, e<X11RespCmd>
{
  public static final String a = "image_index";
  public static final String b = "extra_type";
  public static final String c = "image_urls";
  public static final String d = "image_drone_media";
  public static final String e = "image_drone_local";
  public static final String f = "video_duration";
  private static final String l = "STATE_POSITION";
  private ImageButton A;
  private DroneImagePagerAdapter B;
  private c C;
  private com.fimi.kernel.b.b.b D;
  private ProgressView E;
  private p F;
  private Button G;
  private Button H;
  private TextView I;
  private TextView J;
  private TextView K;
  private int L;
  private List<WifiDistanceFile> M;
  public String g = "";
  public String h = "";
  v i;
  String j = "ispopDialog";
  String k = "isdeleteTF";
  private com.fimi.soul.biz.camera.d m;
  private boolean n = false;
  private HackyViewPager o;
  private int p;
  private TextView q;
  private View r;
  private View s;
  private View t;
  private boolean u = true;
  private ArrayList<String> v;
  private ArrayList<String> w;
  private ArrayList<String> x;
  private ImageButton y;
  private ImageButton z;
  
  private String a(int paramInt)
  {
    String str2 = "";
    String str1 = str2;
    if (this.v != null)
    {
      str1 = str2;
      if (this.v.size() > 0)
      {
        str1 = ((String)this.v.get(paramInt)).toString();
        if (!str1.contains("THUMB_")) {
          break label90;
        }
        str1 = ((String)this.v.get(paramInt)).substring(((String)this.v.get(paramInt)).lastIndexOf("/") + 1).replace("THUMB_", "");
      }
    }
    return str1;
    label90:
    if (str1.contains("_THM")) {
      return ((String)this.v.get(paramInt)).substring(((String)this.v.get(paramInt)).lastIndexOf("/") + 1).replace("_THM", "");
    }
    return ((String)this.v.get(paramInt)).substring(((String)this.v.get(paramInt)).lastIndexOf("/") + 1);
  }
  
  private void a()
  {
    this.q = ((TextView)this.s.findViewById(2131690493));
    this.q.setVisibility(0);
    ao.a(getAssets(), new View[] { this.q });
    this.p = getIntent().getIntExtra("image_index", 0);
    this.o = ((HackyViewPager)findViewById(2131689779));
    if (this.n) {}
    for (this.B = new DroneImagePagerAdapter(getSupportFragmentManager(), this.v, this.w);; this.B = new DroneImagePagerAdapter(getSupportFragmentManager(), this.v))
    {
      this.B.a(this.o);
      this.B.a(new com.fimi.soul.view.photodraweeview.d()
      {
        public void a(View paramAnonymousView, float paramAnonymousFloat1, float paramAnonymousFloat2)
        {
          DroneImagePagerActivity.a(DroneImagePagerActivity.this, DroneImagePagerActivity.f(DroneImagePagerActivity.this).a(DroneImagePagerActivity.this, DroneImagePagerActivity.e(DroneImagePagerActivity.this)));
          if (DroneImagePagerActivity.g(DroneImagePagerActivity.this) == null)
          {
            paramAnonymousView = DroneImagePagerActivity.this;
            if (DroneImagePagerActivity.h(DroneImagePagerActivity.this)) {
              break label93;
            }
          }
          label93:
          for (boolean bool = true;; bool = false)
          {
            DroneImagePagerActivity.a(paramAnonymousView, bool);
            DroneImagePagerActivity.this.c(DroneImagePagerActivity.h(DroneImagePagerActivity.this));
            DroneImagePagerActivity.this.b(DroneImagePagerActivity.h(DroneImagePagerActivity.this));
            return;
          }
        }
      });
      this.o.setAdapter(this.B);
      this.o.setOnPageChangeListener(new ViewPager.OnPageChangeListener()
      {
        public void onPageScrollStateChanged(int paramAnonymousInt) {}
        
        public void onPageScrolled(int paramAnonymousInt1, float paramAnonymousFloat, int paramAnonymousInt2)
        {
          Log.v("mPager", "arg0=" + paramAnonymousInt1);
          if ((paramAnonymousInt2 == 0) && (paramAnonymousFloat == 0.0D) && (DroneImagePagerActivity.i(DroneImagePagerActivity.this).a(paramAnonymousInt1) != null)) {
            DroneImagePagerActivity.i(DroneImagePagerActivity.this).a(paramAnonymousInt1).b();
          }
        }
        
        public void onPageSelected(int paramAnonymousInt)
        {
          DroneImagePagerActivity.a(DroneImagePagerActivity.this, true);
          String str = DroneImagePagerActivity.a(DroneImagePagerActivity.this, paramAnonymousInt);
          DroneImagePagerActivity.j(DroneImagePagerActivity.this).setText(str);
          DroneImagePagerActivity.k(DroneImagePagerActivity.this);
          if (str.endsWith(".MP4")) {
            DroneImagePagerActivity.l(DroneImagePagerActivity.this).setVisibility(0);
          }
          for (;;)
          {
            DroneImagePagerActivity.m(DroneImagePagerActivity.this);
            return;
            DroneImagePagerActivity.l(DroneImagePagerActivity.this).setVisibility(8);
          }
        }
      });
      this.o.setCurrentItem(this.p);
      String str = a(this.p);
      this.q.setText(str);
      return;
    }
  }
  
  private void b()
  {
    View localView1 = this.r.findViewById(2131690475);
    View localView2 = this.r.findViewById(2131690473);
    this.y = ((ImageButton)this.s.findViewById(2131690492));
    this.z = ((ImageButton)this.r.findViewById(2131690476));
    ImageButton localImageButton1 = (ImageButton)this.r.findViewById(2131690474);
    ImageButton localImageButton2 = (ImageButton)this.r.findViewById(2131690478);
    this.G.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        paramAnonymousView = j.b(DroneImagePagerActivity.n(DroneImagePagerActivity.this));
        if ((DroneImagePagerActivity.g(DroneImagePagerActivity.this) != null) && (DroneImagePagerActivity.g(DroneImagePagerActivity.this).g() != b.a.e))
        {
          paramAnonymousView = new File(paramAnonymousView.replace("file://", ""));
          if (paramAnonymousView.exists()) {
            paramAnonymousView.delete();
          }
          DroneImagePagerActivity.a(DroneImagePagerActivity.this).setScrollble(true);
          DroneImagePagerActivity.f(DroneImagePagerActivity.this).a(DroneImagePagerActivity.g(DroneImagePagerActivity.this));
          DroneImagePagerActivity.this.c(false);
          DroneImagePagerActivity.this.a(false);
          DroneImagePagerActivity.this.b(false);
          DroneImagePagerActivity.k(DroneImagePagerActivity.this);
        }
      }
    });
    this.H.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        if (DroneImagePagerActivity.g(DroneImagePagerActivity.this) != null)
        {
          DroneImagePagerActivity.g(DroneImagePagerActivity.this).c();
          DroneImagePagerActivity.o(DroneImagePagerActivity.this).setVisibility(8);
          DroneImagePagerActivity.p(DroneImagePagerActivity.this).setVisibility(0);
        }
      }
    });
    if ((this.n) && (!com.fimi.soul.biz.camera.b.c(g())))
    {
      localView2.setVisibility(8);
      localView1.setVisibility(0);
      c(true);
      b(true);
      this.z.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          if (DroneImagePagerActivity.this.i.a().getBoolean(DroneImagePagerActivity.this.j, false))
          {
            DroneImagePagerActivity.q(DroneImagePagerActivity.this);
            return;
          }
          DroneImagePagerActivity.r(DroneImagePagerActivity.this);
        }
      });
      localImageButton2.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          new f.a(DroneImagePagerActivity.this).a(DroneImagePagerActivity.this.getString(2131362176)).a(DroneImagePagerActivity.this.getResources().getColor(2131624046)).b(DroneImagePagerActivity.this.getString(2131362121), new DialogInterface.OnClickListener()
          {
            public void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              DroneImagePagerActivity.t(DroneImagePagerActivity.this).s().c(((WifiDistanceFile)DroneImagePagerActivity.s(DroneImagePagerActivity.this).get(DroneImagePagerActivity.a(DroneImagePagerActivity.this).getCurrentItem())).getAbsolutePath());
            }
          }).a(DroneImagePagerActivity.this.getString(2131362051), new DialogInterface.OnClickListener()
          {
            public void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int) {}
          }).a().show();
        }
      });
      this.y.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          DroneImagePagerActivity.this.finish();
        }
      });
      return;
    }
    if ((this.n) && (com.fimi.soul.biz.camera.b.c(g())))
    {
      this.t.setVisibility(8);
      str = g();
      Log.i("Good", "urlString:" + str);
      if (str.endsWith(".MP4")) {
        localView2.setVisibility(8);
      }
      for (;;)
      {
        localView1.setVisibility(8);
        localImageButton1.setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramAnonymousView)
          {
            if (ao.b(DroneImagePagerActivity.this))
            {
              DroneImagePagerActivity.u(DroneImagePagerActivity.this);
              return;
            }
            z.a(DroneImagePagerActivity.this, 2131362440, 1000);
          }
        });
        localImageButton2.setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramAnonymousView)
          {
            new f.a(DroneImagePagerActivity.this).a(DroneImagePagerActivity.this.getString(2131362176)).a(DroneImagePagerActivity.this.getResources().getColor(2131624046)).b(DroneImagePagerActivity.this.getString(2131362121), new DialogInterface.OnClickListener()
            {
              public void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                DroneImagePagerActivity.t(DroneImagePagerActivity.this).s().c(((WifiDistanceFile)DroneImagePagerActivity.s(DroneImagePagerActivity.this).get(DroneImagePagerActivity.a(DroneImagePagerActivity.this).getCurrentItem())).getAbsolutePath());
              }
            }).a(DroneImagePagerActivity.this.getString(2131362051), new DialogInterface.OnClickListener()
            {
              public void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int) {}
            }).a().show();
          }
        });
        break;
        localView2.setVisibility(0);
      }
    }
    String str = h();
    Log.i("Good", "urlString:" + str);
    if (str.endsWith(".MP4")) {
      localView2.setVisibility(8);
    }
    for (;;)
    {
      localView1.setVisibility(8);
      b(true);
      c(true);
      localImageButton1.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          if (ao.b(DroneImagePagerActivity.this))
          {
            DroneImagePagerActivity.u(DroneImagePagerActivity.this);
            return;
          }
          z.a(DroneImagePagerActivity.this, 2131362440, 1000);
        }
      });
      localImageButton2.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          new f.a(DroneImagePagerActivity.this).a(DroneImagePagerActivity.this.getString(2131362176)).a(DroneImagePagerActivity.this.getResources().getColor(2131624046)).b(DroneImagePagerActivity.this.getString(2131362121), new DialogInterface.OnClickListener()
          {
            public void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              paramAnonymous2DialogInterface = new File(DroneImagePagerActivity.e(DroneImagePagerActivity.this).replace("file://", ""));
              if ((paramAnonymous2DialogInterface.isFile()) && (paramAnonymous2DialogInterface.exists())) {
                paramAnonymous2DialogInterface.delete();
              }
              paramAnonymous2DialogInterface = new Intent();
              paramAnonymous2DialogInterface.putExtra("del_file", DroneImagePagerActivity.e(DroneImagePagerActivity.this));
              DroneImagePagerActivity.this.setResult(1, paramAnonymous2DialogInterface);
              DroneImagePagerActivity.this.finish();
            }
          }).a(DroneImagePagerActivity.this.getString(2131362051), new DialogInterface.OnClickListener()
          {
            public void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int) {}
          }).a().show();
        }
      });
      break;
      localView2.setVisibility(0);
    }
  }
  
  private void c()
  {
    String str = j.b(g());
    this.r.setVisibility(8);
    this.t.setVisibility(0);
    this.I.setText(String.format(getString(2131362167), new Object[] { g() }));
    this.J.setText("0%");
    this.K.setText("0.00 KB/s");
    this.E.setMaxCount((float)((WifiDistanceFile)this.M.get(this.o.getCurrentItem())).getSize());
    this.E.setCurrentCount(0.0F);
    this.C.a(h(), (String)this.x.get(this.o.getCurrentItem()), ((WifiDistanceFile)this.M.get(this.o.getCurrentItem())).getSize(), Boolean.valueOf(false), str);
    this.C.a(this);
  }
  
  private void d()
  {
    new com.fimi.soul.view.b().a(this, getString(2131362166), getString(2131362051), getString(2131362121), Boolean.valueOf(false), getString(2131362620), new a()
    {
      public void a(int paramAnonymousInt) {}
      
      public void a(int paramAnonymousInt, Boolean paramAnonymousBoolean)
      {
        if (paramAnonymousInt == -2) {
          if (paramAnonymousBoolean.booleanValue())
          {
            DroneImagePagerActivity.this.i.a().edit().putBoolean(DroneImagePagerActivity.this.j, false).commit();
            DroneImagePagerActivity.this.i.a().edit().putBoolean(DroneImagePagerActivity.this.k, false).commit();
          }
        }
        for (;;)
        {
          DroneImagePagerActivity.r(DroneImagePagerActivity.this);
          return;
          DroneImagePagerActivity.this.i.a().edit().putBoolean(DroneImagePagerActivity.this.j, true).commit();
          DroneImagePagerActivity.this.i.a().edit().putBoolean(DroneImagePagerActivity.this.k, false).commit();
          continue;
          if (paramAnonymousInt == -1) {
            if (paramAnonymousBoolean.booleanValue())
            {
              DroneImagePagerActivity.this.i.a().edit().putBoolean(DroneImagePagerActivity.this.j, false).commit();
              DroneImagePagerActivity.this.i.a().edit().putBoolean(DroneImagePagerActivity.this.k, true).commit();
            }
            else
            {
              DroneImagePagerActivity.this.i.a().edit().putBoolean(DroneImagePagerActivity.this.j, true).commit();
              DroneImagePagerActivity.this.i.a().edit().putBoolean(DroneImagePagerActivity.this.k, true).commit();
            }
          }
        }
      }
    });
  }
  
  private void e()
  {
    ShareInfo localShareInfo = new ShareInfo();
    if (this.n) {
      localShareInfo.setUrl(com.fimi.soul.biz.camera.b.d(g()));
    }
    for (;;)
    {
      this.F.a(new p.b()
      {
        public void a(int paramAnonymousInt)
        {
          DroneImagePagerActivity.a(DroneImagePagerActivity.this).setDrawingCacheEnabled(false);
        }
      });
      this.F.a(localShareInfo);
      return;
      localShareInfo.setUrl(((String)this.v.get(this.o.getCurrentItem())).replace("file://", ""));
    }
  }
  
  private void f()
  {
    a(false);
    this.C = c.a(getApplicationContext());
    this.C.a(this);
    this.D = this.C.a(this, h());
    if ((this.D != null) && ((this.D.g() == b.a.c) || (this.D.g() == b.a.d)))
    {
      a(true);
      this.H.setVisibility(4);
      this.G.setVisibility(0);
      l1 = this.D.i();
      l2 = this.D.k();
      this.E.setMaxCount((float)l1);
      this.E.setCurrentCount((float)l2);
      this.I.setText(String.format(getString(2131362167), new Object[] { g() }));
      this.J.setText(l2 / (l1 / 100L) + "%");
      this.K.setText("0.00 KB/s");
      this.D.a(this);
    }
    while ((this.D == null) || ((this.D.g() != b.a.b) && (this.D.g() != b.a.a))) {
      return;
    }
    a(true);
    this.H.setVisibility(0);
    this.G.setVisibility(8);
    long l1 = this.D.i();
    long l2 = this.D.k();
    this.E.setMaxCount((float)l1);
    this.E.setCurrentCount((float)l2);
    this.I.setText(String.format(getString(2131362167), new Object[] { g() }));
    this.J.setText(l2 / (l1 / 100L) + "%");
    this.K.setText("");
    this.D.a(this);
  }
  
  private String g()
  {
    return a(this.o.getCurrentItem());
  }
  
  private String h()
  {
    String str2 = (String)this.v.get(this.o.getCurrentItem());
    String str1 = str2;
    if (str2.contains("&&")) {
      str1 = str2.split("&&")[1];
    }
    return str1;
  }
  
  private void i()
  {
    int i1 = 0;
    while (i1 < this.v.size())
    {
      String str = a(i1);
      if (com.fimi.soul.biz.camera.b.b(str))
      {
        str = String.format("file://%s", new Object[] { com.fimi.soul.biz.camera.b.e(str) });
        Log.d("Good", "Downloaded:" + str);
        this.v.set(i1, str);
      }
      i1 += 1;
    }
  }
  
  public void a(b.a parama, com.fimi.kernel.b.b.b paramb)
  {
    if (!this.n) {}
    while (!paramb.h().equals(j.b(g()))) {
      return;
    }
    if (parama == b.a.e)
    {
      a(false);
      this.o.setScrollble(true);
      b();
      this.E.setCurrentCount(0.0F);
      this.I.setText("0%");
      if (this.i.a().getBoolean(this.k, false)) {
        this.m.s().c(g());
      }
      c.a(this).a(this.D);
      return;
    }
    this.E.setMaxCount((float)paramb.i());
    this.E.setCurrentCount((float)paramb.k());
    long l1 = paramb.l();
    if ((l1 >= 0L) && (l1 < 102400L))
    {
      parama = t.b((float)(l1 / 1024L), 2);
      this.K.setText(parama + " KB/s");
    }
    for (;;)
    {
      parama = paramb.k() / (paramb.i() / 100L) + "%";
      this.J.setText(parama);
      return;
      if ((l1 >= 102400L) && (l1 < 1024000L))
      {
        l1 = (int)(l1 / 1024L);
        this.K.setText(l1 + " KB/s");
      }
      else if (l1 >= 1024000L)
      {
        parama = t.b((float)l1 / 1048576.0F, 2);
        this.K.setText(parama + " MB/s");
      }
    }
  }
  
  public void a(List<com.fimi.kernel.b.b.b> paramList, boolean paramBoolean, com.fimi.kernel.b.b.b paramb)
  {
    if (paramb != null)
    {
      this.D = paramb;
      if (!isFinishing()) {
        this.D.a(this);
      }
    }
  }
  
  protected void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.r.setVisibility(8);
      this.t.setVisibility(0);
      return;
    }
    this.r.setVisibility(0);
    this.t.setVisibility(4);
  }
  
  public void a(boolean paramBoolean, X11RespCmd paramX11RespCmd)
  {
    if ((paramBoolean) && (this.n)) {
      switch (paramX11RespCmd.getMsg_id())
      {
      }
    }
    while ((paramBoolean) || (!this.n))
    {
      return;
      if (this.w.get(this.o.getCurrentItem()) != null)
      {
        paramX11RespCmd = new File(((String)this.w.get(this.o.getCurrentItem())).replace("file://", ""));
        if (paramX11RespCmd.exists()) {
          paramX11RespCmd.delete();
        }
      }
      this.m.a(true);
      paramX11RespCmd = new Intent();
      Bundle localBundle = new Bundle();
      if (this.M.size() > this.o.getCurrentItem()) {
        localBundle.putSerializable("wifiDistanceFile", (Serializable)this.M.get(this.o.getCurrentItem()));
      }
      paramX11RespCmd.putExtras(localBundle);
      setResult(2, paramX11RespCmd);
      finish();
      return;
    }
    switch (paramX11RespCmd.getMsg_id())
    {
    default: 
      return;
    }
    z.a(this, getResources().getString(2131362119), z.b);
  }
  
  protected void b(boolean paramBoolean)
  {
    View localView = this.r;
    if (paramBoolean) {}
    for (int i1 = 0;; i1 = 8)
    {
      localView.setVisibility(i1);
      return;
    }
  }
  
  protected void c(boolean paramBoolean)
  {
    View localView = this.s;
    if (paramBoolean) {}
    for (int i1 = 0;; i1 = 8)
    {
      localView.setVisibility(i1);
      return;
    }
  }
  
  public void finish()
  {
    overridePendingTransition(17432576, 17432577);
    super.finish();
  }
  
  public void onClick(View paramView) {}
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968618);
    ShareSDK.initSDK(this);
    this.A = ((ImageButton)findViewById(2131689781));
    getWindow().setFlags(128, 128);
    this.m = ((com.fimi.soul.biz.camera.d)com.fimi.soul.biz.camera.b.a().d());
    this.m.a(this);
    findViewById(2131690491).setBackgroundResource(2131624111);
    findViewById(2131690483).setBackgroundResource(2131624111);
    this.s = findViewById(2131690490);
    this.s.setOnClickListener(this);
    this.r = findViewById(2131690472);
    this.r.setOnClickListener(this);
    this.r.setBackgroundResource(2130838541);
    this.t = findViewById(2131690483);
    this.I = ((TextView)findViewById(2131690484));
    this.J = ((TextView)findViewById(2131690486));
    this.K = ((TextView)findViewById(2131690485));
    this.G = ((Button)findViewById(2131690488));
    this.H = ((Button)findViewById(2131690489));
    ao.a(getAssets(), new View[] { this.G, this.H, this.I, this.J, this.K });
    this.E = ((ProgressView)this.t.findViewById(2131690487));
    this.E.setFrontColor(-42978);
    this.M = com.fimi.soul.b.f.a;
    this.v = getIntent().getStringArrayListExtra("image_urls");
    this.w = getIntent().getStringArrayListExtra("image_drone_local");
    this.n = getIntent().getBooleanExtra("image_drone_media", false);
    this.x = getIntent().getStringArrayListExtra("video_duration");
    if (getIntent().getIntExtra("extra_type", 1) == 2) {
      this.A.setVisibility(0);
    }
    for (;;)
    {
      if (paramBundle != null) {
        this.p = paramBundle.getInt("STATE_POSITION");
      }
      this.F = new p(this);
      a();
      b();
      f();
      this.A.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          DroneImagePagerActivity.this.h = ((String)DroneImagePagerActivity.b(DroneImagePagerActivity.this).get(DroneImagePagerActivity.a(DroneImagePagerActivity.this).getCurrentItem()));
          if (DroneImagePagerActivity.c(DroneImagePagerActivity.this) != null) {
            DroneImagePagerActivity.this.g = ((String)DroneImagePagerActivity.c(DroneImagePagerActivity.this).get(DroneImagePagerActivity.a(DroneImagePagerActivity.this).getCurrentItem()));
          }
          paramAnonymousView = new Intent(DroneImagePagerActivity.this, FermiPlayerActivity.class);
          if (DroneImagePagerActivity.this.h != null) {
            paramAnonymousView.putExtra("SP_KEY_PLAYER_ADDR_VideoDialogFragment", DroneImagePagerActivity.this.h.split("&&")[0]);
          }
          for (;;)
          {
            paramAnonymousView.putExtra("SP_KEY_PLAYER_IS_REMOTE_ADDR_VideoDialogFragment", DroneImagePagerActivity.this.g);
            paramAnonymousView.putExtra("play_start", true);
            paramAnonymousView.putExtra("online_file", DroneImagePagerActivity.d(DroneImagePagerActivity.this));
            DroneImagePagerActivity.this.startActivity(paramAnonymousView);
            return;
            paramAnonymousView.putExtra("SP_KEY_PLAYER_ADDR_VideoDialogFragment", DroneImagePagerActivity.c(DroneImagePagerActivity.this));
          }
        }
      });
      return;
      this.A.setVisibility(8);
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    if ((this.D != null) && (this.D.g() == b.a.b))
    {
      this.H.setVisibility(0);
      this.G.setVisibility(8);
      long l1 = this.D.i();
      long l2 = this.D.k();
      this.E.setMaxCount((float)l1);
      this.E.setCurrentCount((float)l2);
      this.I.setText(String.format(getString(2131362167), new Object[] { g() }));
      this.J.setText(l2 / (l1 / 100L) + "%");
      return;
    }
    this.H.setVisibility(8);
    this.G.setVisibility(0);
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    paramBundle.putInt("STATE_POSITION", this.o.getCurrentItem());
  }
  
  protected void onStart()
  {
    super.onStart();
    this.i = v.a(this);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/media/gallery/DroneImagePagerActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */