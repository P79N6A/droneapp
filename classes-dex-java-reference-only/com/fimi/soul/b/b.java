package com.fimi.soul.b;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fimi.kernel.utils.g;
import com.fimi.kernel.utils.v;
import com.fimi.kernel.utils.z;
import com.fimi.kernel.view.button.SwitchButton;
import com.fimi.kernel.view.button.SwitchButton.a;
import com.fimi.soul.biz.camera.entity.X11DeviceInfo;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.biz.camera.entity.X11SystemConfig;
import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.utils.ao;
import com.fimi.soul.utils.j;
import com.fimi.soul.view.f.a;
import java.io.File;

public class b
  extends BaseAdapter
  implements AdapterView.OnItemClickListener, com.fimi.soul.biz.camera.b.e<X11RespCmd>
{
  private static final float a = 0.064F;
  private Context b;
  private com.fimi.soul.biz.camera.d c;
  private int d;
  private int e;
  private int f;
  private boolean g = false;
  private String h;
  private String i;
  private X11DeviceInfo j;
  private boolean k = true;
  private boolean l = false;
  private boolean m = false;
  private a n;
  private SharedPreferences o;
  
  public b(Context paramContext, a parama)
  {
    this.n = parama;
    this.b = paramContext;
    this.c = ((com.fimi.soul.biz.camera.d)com.fimi.soul.biz.camera.b.a().d());
    this.j = this.c.i().getX11DeviceInfo();
    this.g = com.fimi.soul.biz.camera.b.a().c();
    this.o = v.a(paramContext).a();
    a();
    c();
  }
  
  private void a(a parama)
  {
    if (this.l) {
      parama.e.a(true, false);
    }
    for (;;)
    {
      parama.e.setVisibility(0);
      parama.b.setVisibility(0);
      parama.b.setText(2131362899);
      parama.e.setOnSwitchListener(new SwitchButton.a()
      {
        public void a(View paramAnonymousView, boolean paramAnonymousBoolean)
        {
          paramAnonymousView = (SwitchButton)paramAnonymousView.findViewById(2131689906);
          if (!b.a(b.this))
          {
            z.a(b.b(b.this), b.b(b.this).getString(2131362678), z.b);
            if (b.c(b.this))
            {
              paramAnonymousView.a(true, false);
              return;
            }
            paramAnonymousView.a(false, false);
            return;
          }
          if (!b.a(b.this))
          {
            z.a(b.b(b.this), b.b(b.this).getString(2131362678), z.b);
            if (b.c(b.this))
            {
              paramAnonymousView.a(true, false);
              return;
            }
            paramAnonymousView.a(false, false);
            return;
          }
          if (b.c(b.this))
          {
            b.a(b.this, false);
            paramAnonymousView.a(false, true);
            b.a(b.this, "video_only");
          }
          for (;;)
          {
            b.b(b.this, "video_mode");
            if (!b.d(b.this)) {
              break;
            }
            b.e(b.this).r().f();
            return;
            b.a(b.this, true);
            paramAnonymousView.a(true, true);
            b.a(b.this, "video_av");
          }
        }
      });
      return;
      parama.e.a(false, false);
    }
  }
  
  private void a(a parama, ViewGroup.LayoutParams paramLayoutParams)
  {
    parama.a.setVisibility(8);
    parama.e.setVisibility(8);
    parama.d.setBackgroundResource(0);
    parama.b.setTextColor(this.b.getResources().getColor(2131624291));
    parama.b.setAlpha(1.0F);
    parama.c.setVisibility(8);
    parama.e.setOnSwitchListener(null);
    paramLayoutParams.height = ((int)this.b.getResources().getDimension(2131296501));
    parama.d.setLayoutParams(paramLayoutParams);
  }
  
  private void a(a parama, String paramString)
  {
    parama.a.setVisibility(0);
    parama.b.setVisibility(0);
    parama.a.setText(paramString);
    parama.b.setVisibility(4);
    parama.d.setBackgroundResource(2131624131);
    parama.a(true);
  }
  
  private void a(a parama, String paramString, boolean paramBoolean)
  {
    parama.b.setVisibility(0);
    parama.b.setText(paramString);
    if (paramBoolean)
    {
      parama.b.setTextColor(this.b.getResources().getColor(2131624174));
      parama.c.setVisibility(0);
    }
    for (;;)
    {
      parama.a(false);
      return;
      parama.b.setTextColor(this.b.getResources().getColor(2131624292));
      parama.c.setVisibility(4);
    }
  }
  
  private void b(a parama)
  {
    this.m = this.o.getBoolean("Show_9_Grid", false);
    if (this.m) {
      parama.e.a(true, false);
    }
    for (;;)
    {
      parama.e.setVisibility(0);
      parama.b.setVisibility(0);
      parama.b.setText(2131362321);
      parama.e.setOnSwitchListener(new SwitchButton.a()
      {
        public void a(View paramAnonymousView, boolean paramAnonymousBoolean)
        {
          paramAnonymousView = (SwitchButton)paramAnonymousView.findViewById(2131689906);
          if (paramAnonymousBoolean)
          {
            b.f(b.this).edit().putBoolean("Show_9_Grid", true).commit();
            b.g(b.this).a(d.a.bZ);
            b.b(b.this, true);
            paramAnonymousView.setSwitchState(true);
            return;
          }
          b.f(b.this).edit().putBoolean("Show_9_Grid", false).commit();
          b.g(b.this).a(d.a.ca);
          b.b(b.this, false);
          paramAnonymousView.setSwitchState(false);
        }
      });
      return;
      parama.e.a(false, false);
    }
  }
  
  private void b(a parama, ViewGroup.LayoutParams paramLayoutParams)
  {
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    ((Activity)this.b).getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
    paramLayoutParams.height = (localDisplayMetrics.heightPixels * 0);
    parama.d.setLayoutParams(paramLayoutParams);
    parama.d.setBackgroundResource(2131624131);
  }
  
  private void b(a parama, String paramString, boolean paramBoolean)
  {
    parama.b.setVisibility(0);
    parama.e.setVisibility(0);
    parama.b.setText(paramString);
    parama.e.setSwitchState(paramBoolean);
  }
  
  private void c()
  {
    Object localObject2 = this.c.i().getVideoResolution();
    String str1 = this.c.i().getPhotoSize();
    String str2 = this.c.i().getImage_format();
    if (localObject2 == null) {
      return;
    }
    Object localObject1 = localObject2;
    if (localObject2 != null) {
      localObject1 = ((String)localObject2).trim();
    }
    localObject2 = str1;
    if (str1 != null) {
      localObject2 = str1.trim();
    }
    if (this.k)
    {
      if ("1920x1080 30P 16:9".contains((CharSequence)localObject1)) {
        this.e = b.c.ordinal();
      }
      if ("1920x1080 60P 16:9".contains((CharSequence)localObject1)) {
        this.e = b.b.ordinal();
      }
      if ("1280x720 120P 16:9".contains((CharSequence)localObject1)) {
        this.e = b.d.ordinal();
      }
      if (localObject2 != null)
      {
        if ("12M (4608x2592 16:9)".contains((CharSequence)localObject2)) {
          this.d = b.i.ordinal();
        }
        if ("16M (4608x3456 4:3)".contains((CharSequence)localObject2)) {
          this.d = b.h.ordinal();
        }
        if ("8M (3264x2448 4:3)".contains((CharSequence)localObject2)) {
          this.d = b.j.ordinal();
        }
      }
    }
    while ("video_only".equals(this.c.i().getVideoMode()))
    {
      this.l = false;
      return;
      if ("3840x2160 30P 16:9".contains((CharSequence)localObject1)) {
        this.e = c.b.ordinal();
      }
      if ("2560x1440 60P 16:9".contains((CharSequence)localObject1)) {
        this.e = c.c.ordinal();
      }
      if ("1920x1080 30P 16:9".contains((CharSequence)localObject1)) {
        this.e = c.f.ordinal();
      }
      if ("1920x1080 60P 16:9".contains((CharSequence)localObject1)) {
        this.e = c.e.ordinal();
      }
      if ("1920x1080 100P 16:9".contains((CharSequence)localObject1)) {
        this.e = c.d.ordinal();
      }
      if (localObject2 != null)
      {
        if ("12M (4000x3000 4:3)".contains((CharSequence)localObject2)) {
          this.d = c.h.ordinal();
        }
        if ("8M (3840x2160 16:9)".contains((CharSequence)localObject2)) {
          this.d = c.i.ordinal();
        }
      }
      if ((str2 != null) && (!"".equals(str2)))
      {
        if ("JPG".equals(str2)) {
          this.f = c.k.ordinal();
        }
        if ("JPG+DNG".equals(str2)) {
          this.f = c.l.ordinal();
        }
      }
    }
    this.l = true;
  }
  
  private boolean d()
  {
    return this.c.d();
  }
  
  public void a()
  {
    if (com.fimi.soul.biz.e.d.a().k()) {}
    for (this.k = false;; this.k = true)
    {
      this.c.r().b();
      return;
    }
  }
  
  public void a(boolean paramBoolean, X11RespCmd paramX11RespCmd)
  {
    switch (paramX11RespCmd.getMsg_id())
    {
    default: 
    case 2: 
    case 260: 
    case 11: 
    case 257: 
      do
      {
        do
        {
          do
          {
            return;
            if (!paramBoolean) {
              break;
            }
          } while ("camera_clock".equals(paramX11RespCmd.getType()));
          z.a(this.b, this.b.getString(2131362690), z.c);
          this.c.r().b();
          return;
          z.a(this.b, this.b.getString(2131362696), z.c);
          com.fimi.kernel.c.b().c();
          return;
          this.c.r().a(this.h, this.i);
          com.fimi.kernel.c.b().a();
        } while (this.j.getChip() != null);
        this.c.r().d();
        return;
        this.c.r().b();
        return;
      } while (paramBoolean);
      com.fimi.kernel.c.b().c();
      z.a(this.b, this.b.getString(2131362036), z.c);
      return;
    case 3: 
      com.fimi.kernel.c.b().c();
      c();
      notifyDataSetChanged();
      return;
    case 4: 
      if (paramBoolean)
      {
        g.b(new File(j.n()));
        z.a(this.b, this.b.getString(2131362291), z.c);
        this.c.r().c(com.fimi.soul.biz.camera.e.cy);
        this.c.a(true);
      }
      for (;;)
      {
        com.fimi.kernel.c.b().c();
        return;
        z.a(this.b, this.b.getString(2131362289), z.c);
      }
    }
    com.fimi.kernel.c.b().c();
  }
  
  public void b()
  {
    if (this.c != null)
    {
      this.c.a(this);
      if (com.fimi.soul.biz.e.d.a().m()) {
        break label25;
      }
    }
    label25:
    while (this.c.d()) {
      return;
    }
    com.fimi.kernel.c.b().a();
    this.c.t().b();
  }
  
  public int getCount()
  {
    if (this.k) {
      return b.values().length;
    }
    return c.values().length;
  }
  
  public Object getItem(int paramInt)
  {
    return Integer.valueOf(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    boolean bool2 = true;
    boolean bool3 = true;
    Object localObject;
    if (paramView == null)
    {
      localObject = new a(null);
      paramView = ((a)localObject).a(paramViewGroup);
      paramView.setTag(localObject);
      paramViewGroup = (ViewGroup)localObject;
      a(paramViewGroup, paramView.getLayoutParams());
      if (!this.k) {
        break label693;
      }
      if (paramInt == b.a.ordinal()) {
        a(paramViewGroup, this.b.getString(2131362597));
      }
      if (paramInt == b.c.ordinal())
      {
        localObject = this.b.getString(2131362544);
        if (this.e != b.c.ordinal()) {
          break label657;
        }
        bool1 = true;
        label116:
        a(paramViewGroup, (String)localObject, bool1);
      }
      if (paramInt == b.b.ordinal())
      {
        localObject = this.b.getString(2131362547);
        if (this.e != b.b.ordinal()) {
          break label663;
        }
        bool1 = true;
        label163:
        a(paramViewGroup, (String)localObject, bool1);
      }
      if (paramInt == b.d.ordinal())
      {
        if (this.e != b.d.ordinal()) {
          break label669;
        }
        bool1 = true;
        label198:
        a(paramViewGroup, "1280x720", bool1);
      }
      if (paramInt == b.g.ordinal()) {
        a(paramViewGroup, this.b.getString(2131362572));
      }
      if (paramInt == b.h.ordinal())
      {
        localObject = this.b.getString(2131362541);
        if (this.d != b.h.ordinal()) {
          break label675;
        }
        bool1 = true;
        label271:
        a(paramViewGroup, (String)localObject, bool1);
      }
      if (paramInt == b.i.ordinal())
      {
        localObject = this.b.getString(2131362539);
        if (this.d != b.i.ordinal()) {
          break label681;
        }
        bool1 = true;
        label318:
        a(paramViewGroup, (String)localObject, bool1);
      }
      if (paramInt == b.j.ordinal())
      {
        localObject = this.b.getString(2131362542);
        if (this.d != b.j.ordinal()) {
          break label687;
        }
      }
    }
    label657:
    label663:
    label669:
    label675:
    label681:
    label687:
    for (boolean bool1 = bool3;; bool1 = false)
    {
      a(paramViewGroup, (String)localObject, bool1);
      if (paramInt == b.m.ordinal()) {
        a(paramViewGroup, this.b.getString(2131362654));
      }
      if (paramInt == b.n.ordinal())
      {
        paramViewGroup.b.setVisibility(0);
        paramViewGroup.b.setText(this.b.getString(2131362041));
        paramViewGroup.b.setTextColor(this.b.getResources().getColor(2131624292));
      }
      if (paramInt == b.e.ordinal()) {
        a(paramViewGroup, this.b.getString(2131361976));
      }
      if (paramInt == b.f.ordinal()) {
        a(paramViewGroup);
      }
      if (paramInt == b.o.ordinal())
      {
        localObject = paramView.getLayoutParams();
        ((ViewGroup.LayoutParams)localObject).height = ((int)this.b.getResources().getDimension(2131296500));
        paramViewGroup.d.setLayoutParams((ViewGroup.LayoutParams)localObject);
        paramViewGroup.d.setBackgroundResource(2131624131);
        paramViewGroup.a.setVisibility(8);
        paramViewGroup.e.setVisibility(8);
        paramViewGroup.c.setVisibility(8);
        paramViewGroup.b.setVisibility(8);
        paramViewGroup.a(false);
      }
      if (paramInt == b.k.ordinal()) {
        a(paramViewGroup, this.b.getString(2131362322));
      }
      if (paramInt == b.l.ordinal())
      {
        b(paramViewGroup);
        paramViewGroup.e.setTag(Integer.valueOf(b.l.ordinal()));
      }
      return paramView;
      paramViewGroup = (a)paramView.getTag();
      break;
      bool1 = false;
      break label116;
      bool1 = false;
      break label163;
      bool1 = false;
      break label198;
      bool1 = false;
      break label271;
      bool1 = false;
      break label318;
    }
    label693:
    if (paramInt == c.a.ordinal()) {
      a(paramViewGroup, this.b.getString(2131362597));
    }
    if (paramInt == c.c.ordinal())
    {
      localObject = this.b.getString(2131362549);
      if (this.e == c.c.ordinal())
      {
        bool1 = true;
        label756:
        a(paramViewGroup, (String)localObject, bool1);
      }
    }
    else
    {
      if (paramInt == c.f.ordinal())
      {
        localObject = this.b.getString(2131362546);
        if (this.e != c.f.ordinal()) {
          break label1429;
        }
        bool1 = true;
        label803:
        a(paramViewGroup, (String)localObject, bool1);
      }
      if (paramInt == c.e.ordinal())
      {
        localObject = this.b.getString(2131362548);
        if (this.e != c.e.ordinal()) {
          break label1435;
        }
        bool1 = true;
        label850:
        a(paramViewGroup, (String)localObject, bool1);
      }
      if (paramInt == c.d.ordinal())
      {
        localObject = this.b.getString(2131362545);
        if (this.e != c.d.ordinal()) {
          break label1441;
        }
        bool1 = true;
        label897:
        a(paramViewGroup, (String)localObject, bool1);
      }
      if (paramInt == c.b.ordinal())
      {
        localObject = this.b.getString(2131362550);
        if (this.e != c.b.ordinal()) {
          break label1447;
        }
        bool1 = true;
        label944:
        a(paramViewGroup, (String)localObject, bool1);
      }
      if (paramInt == c.g.ordinal()) {
        a(paramViewGroup, this.b.getString(2131362572));
      }
      if (paramInt == c.h.ordinal())
      {
        localObject = this.b.getString(2131362540);
        if (this.d != c.h.ordinal()) {
          break label1453;
        }
        bool1 = true;
        label1016:
        a(paramViewGroup, (String)localObject, bool1);
      }
      if (paramInt == c.i.ordinal())
      {
        localObject = this.b.getString(2131362543);
        if (this.d != c.i.ordinal()) {
          break label1459;
        }
        bool1 = true;
        label1063:
        a(paramViewGroup, (String)localObject, bool1);
      }
      if (paramInt == c.o.ordinal()) {
        a(paramViewGroup, this.b.getString(2131362654));
      }
      if (paramInt == c.p.ordinal())
      {
        paramViewGroup.b.setVisibility(0);
        paramViewGroup.b.setText(this.b.getString(2131362041));
        paramViewGroup.b.setTextColor(this.b.getResources().getColor(2131624292));
      }
      if (paramInt == c.j.ordinal()) {
        a(paramViewGroup, this.b.getString(2131362332));
      }
      if (paramInt == c.k.ordinal())
      {
        localObject = this.b.getString(2131362333);
        if (this.f != c.k.ordinal()) {
          break label1465;
        }
        bool1 = true;
        label1214:
        a(paramViewGroup, (String)localObject, bool1);
      }
      if (paramInt == c.l.ordinal())
      {
        localObject = this.b.getString(2131362334);
        if (this.f != c.l.ordinal()) {
          break label1471;
        }
      }
    }
    label1429:
    label1435:
    label1441:
    label1447:
    label1453:
    label1459:
    label1465:
    label1471:
    for (bool1 = bool2;; bool1 = false)
    {
      a(paramViewGroup, (String)localObject, bool1);
      if (paramInt == c.m.ordinal()) {
        a(paramViewGroup, this.b.getString(2131362322));
      }
      if (paramInt == c.n.ordinal())
      {
        b(paramViewGroup);
        paramViewGroup.e.setTag(Integer.valueOf(c.n.ordinal()));
      }
      if (paramInt != c.q.ordinal()) {
        break;
      }
      localObject = paramView.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject).height = ((int)this.b.getResources().getDimension(2131296500));
      paramViewGroup.d.setLayoutParams((ViewGroup.LayoutParams)localObject);
      paramViewGroup.d.setBackgroundResource(2131624131);
      paramViewGroup.a.setVisibility(8);
      paramViewGroup.e.setVisibility(8);
      paramViewGroup.c.setVisibility(8);
      paramViewGroup.b.setVisibility(8);
      paramViewGroup.a(false);
      return paramView;
      bool1 = false;
      break label756;
      bool1 = false;
      break label803;
      bool1 = false;
      break label850;
      bool1 = false;
      break label897;
      bool1 = false;
      break label944;
      bool1 = false;
      break label1016;
      bool1 = false;
      break label1063;
      bool1 = false;
      break label1214;
    }
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (this.k)
    {
      if ((paramInt != b.n.ordinal()) && (paramInt != b.l.ordinal())) {
        this.c.r().f();
      }
      if ((paramInt != b.c.ordinal()) || (!this.k)) {
        break label129;
      }
      if (d()) {
        break label115;
      }
      z.a(this.b, this.b.getString(2131362678), z.b);
    }
    for (;;)
    {
      return;
      if ((paramInt == c.p.ordinal()) || (paramInt == c.n.ordinal())) {
        break;
      }
      this.c.r().f();
      break;
      label115:
      this.h = "video_resolution";
      this.i = "1920x1080 30P 16:9";
      label129:
      if ((paramInt == b.b.ordinal()) && (this.k))
      {
        if (!d())
        {
          z.a(this.b, this.b.getString(2131362678), z.b);
          return;
        }
        this.h = "video_resolution";
        this.i = "1920x1080 60P 16:9";
      }
      if ((paramInt == b.d.ordinal()) && (this.k))
      {
        if (!d())
        {
          z.a(this.b, this.b.getString(2131362678), z.b);
          return;
        }
        this.h = "video_resolution";
        this.i = "1280x720 120P 16:9";
      }
      if ((paramInt == b.h.ordinal()) && (this.k))
      {
        if (!d())
        {
          z.a(this.b, this.b.getString(2131362678), z.b);
          return;
        }
        this.h = "photo_size";
        this.i = "16M (4608x3456 4:3)";
      }
      if ((paramInt == b.j.ordinal()) && (this.k))
      {
        if (!d())
        {
          z.a(this.b, this.b.getString(2131362678), z.b);
          return;
        }
        this.h = "photo_size";
        this.i = "8M (3264x2448 4:3)";
      }
      if ((paramInt == b.i.ordinal()) && (this.k))
      {
        if (!d())
        {
          z.a(this.b, this.b.getString(2131362678), z.b);
          return;
        }
        this.h = "photo_size";
        this.i = "12M (4608x2592 16:9)";
      }
      if ((paramInt == c.b.ordinal()) && (!this.k))
      {
        if (!d())
        {
          z.a(this.b, this.b.getString(2131362678), z.b);
          return;
        }
        this.h = "video_resolution";
        this.i = "3840x2160 30P 16:9";
      }
      if ((paramInt == c.c.ordinal()) && (!this.k))
      {
        if (!d())
        {
          z.a(this.b, this.b.getString(2131362678), z.b);
          return;
        }
        this.h = "video_resolution";
        this.i = "2560x1440 60P 16:9";
      }
      if ((paramInt == c.f.ordinal()) && (!this.k))
      {
        if (!d())
        {
          z.a(this.b, this.b.getString(2131362678), z.b);
          return;
        }
        this.h = "video_resolution";
        this.i = "1920x1080 30P 16:9";
      }
      if ((paramInt == c.e.ordinal()) && (!this.k))
      {
        if (!d())
        {
          z.a(this.b, this.b.getString(2131362678), z.b);
          return;
        }
        this.h = "video_resolution";
        this.i = "1920x1080 60P 16:9";
      }
      if ((paramInt == c.d.ordinal()) && (!this.k))
      {
        if (!d())
        {
          z.a(this.b, this.b.getString(2131362678), z.b);
          return;
        }
        this.h = "video_resolution";
        this.i = "1920x1080 100P 16:9";
      }
      if ((paramInt == c.k.ordinal()) && (!this.k))
      {
        if (!d())
        {
          z.a(this.b, this.b.getString(2131362678), z.b);
          return;
        }
        this.h = "photo_format";
        this.i = "JPG";
      }
      if ((paramInt == c.l.ordinal()) && (!this.k))
      {
        if (!d())
        {
          z.a(this.b, this.b.getString(2131362678), z.b);
          return;
        }
        this.h = "photo_format";
        this.i = "JPG+DNG";
      }
      if ((paramInt == c.n.ordinal()) && (!this.k))
      {
        paramAdapterView = (SwitchButton)paramView.findViewById(2131689906);
        if (this.o.getBoolean("Show_9_Grid", false))
        {
          paramAdapterView.a(false, true);
          this.n.a(d.a.ca);
          this.o.edit().putBoolean("Show_9_Grid", false).commit();
        }
      }
      else if ((paramInt == b.l.ordinal()) && (this.k))
      {
        paramAdapterView = (SwitchButton)paramView.findViewById(2131689906);
        if (!this.o.getBoolean("Show_9_Grid", false)) {
          break label1088;
        }
        paramAdapterView.a(false, true);
        this.n.a(d.a.ca);
        this.o.edit().putBoolean("Show_9_Grid", false).commit();
      }
      for (;;)
      {
        if ((paramInt == c.i.ordinal()) && (!this.k))
        {
          if (!d())
          {
            z.a(this.b, this.b.getString(2131362678), z.b);
            return;
            paramAdapterView.a(true, true);
            this.n.a(d.a.bZ);
            this.o.edit().putBoolean("Show_9_Grid", true).commit();
            break;
            label1088:
            paramAdapterView.a(true, true);
            this.n.a(d.a.bZ);
            this.o.edit().putBoolean("Show_9_Grid", true).commit();
            continue;
          }
          this.h = "photo_size";
          this.i = "8M (3840x2160 16:9)";
        }
      }
      if ((paramInt == c.h.ordinal()) && (!this.k))
      {
        if (!d())
        {
          z.a(this.b, this.b.getString(2131362678), z.b);
          return;
        }
        this.h = "photo_size";
        this.i = "12M (4000x3000 4:3)";
      }
      if (((this.k) && (paramInt == b.n.ordinal())) || ((paramInt == c.p.ordinal()) && (!this.k)))
      {
        if (!d())
        {
          z.a(this.b, this.b.getString(2131362510), z.b);
          return;
        }
        if (!this.c.h()) {
          break label1408;
        }
        new f.a(this.b).a(this.b.getString(2131362926)).a(this.b.getResources().getColor(2131624046)).b(this.b.getString(2131362288), new DialogInterface.OnClickListener()
        {
          public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            b.e(b.this).r().c();
            com.fimi.kernel.c.b().a();
          }
        }).a(this.b.getString(2131362051), new DialogInterface.OnClickListener()
        {
          public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
        }).a().show();
      }
      while ((paramInt == b.f.ordinal()) && (this.k))
      {
        if (d()) {
          break label1431;
        }
        z.a(this.b, this.b.getString(2131362678), z.b);
        return;
        label1408:
        z.a(this.b, this.b.getString(2131362290), z.b);
      }
    }
    label1431:
    this.h = "video_mode";
    if (this.l)
    {
      this.l = false;
      this.i = "video_only";
      return;
    }
    this.l = true;
    this.i = "video_av";
  }
  
  private class a
  {
    TextView a;
    TextView b;
    ImageView c;
    RelativeLayout d;
    SwitchButton e;
    
    private a() {}
    
    public View a(ViewGroup paramViewGroup)
    {
      paramViewGroup = LayoutInflater.from(b.b(b.this)).inflate(2130968711, paramViewGroup, false);
      this.d = ((RelativeLayout)paramViewGroup.findViewById(2131689894));
      this.a = ((TextView)paramViewGroup.findViewById(2131689899));
      this.c = ((ImageView)paramViewGroup.findViewById(2131690323));
      this.b = ((TextView)paramViewGroup.findViewById(2131689901));
      this.e = ((SwitchButton)paramViewGroup.findViewById(2131689906));
      ao.a(b.b(b.this).getAssets(), new View[] { this.a, this.b });
      return paramViewGroup;
    }
    
    public void a(boolean paramBoolean)
    {
      this.d.setClickable(paramBoolean);
    }
  }
  
  static enum b
  {
    private b() {}
  }
  
  static enum c
  {
    private c() {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */