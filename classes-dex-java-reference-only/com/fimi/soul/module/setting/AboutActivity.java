package com.fimi.soul.module.setting;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.kernel.c.a;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.module.update.a.g;
import com.fimi.soul.utils.ao;

public class AboutActivity
  extends BaseActivity
  implements View.OnClickListener
{
  private static final int F = 1;
  private static final int G = 0;
  private static final int H = 1;
  private TextView A;
  private TextView B;
  private TextView C;
  private TextView D;
  private com.fimi.soul.biz.camera.d E;
  private int I = 0;
  g a;
  private Button b;
  private Button c;
  private TextView d;
  private TextView e;
  private ImageView f;
  private TextView g;
  private com.fimi.soul.module.update.a.b h;
  private TextView i;
  private TextView j;
  private TextView k;
  private TextView l;
  private TextView m;
  private TextView n;
  private TextView o;
  private TextView p;
  private TextView q;
  private TextView r;
  private TextView s;
  private TextView t;
  private TextView u;
  private TextView v;
  private TextView w;
  private TextView x;
  private TextView y;
  private TextView z;
  
  private String a(int paramInt)
  {
    return String.valueOf(paramInt);
  }
  
  private void a()
  {
    this.b = ((Button)findViewById(2131689680));
    this.b.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        AboutActivity.this.finish();
      }
    });
  }
  
  private void b()
  {
    this.g = ((TextView)findViewById(2131689708));
    this.d = ((TextView)findViewById(2131689684));
    this.e = ((TextView)findViewById(2131689709));
    this.e.setOnClickListener(this);
    this.e.getPaint().setFlags(8);
    this.e.getPaint().setAntiAlias(true);
    this.d.setText(getString(2131361954, new Object[] { ao.d(this) }));
    this.c = ((Button)findViewById(2131689707));
    this.c.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        paramAnonymousView = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + AboutActivity.this.getPackageName()));
        paramAnonymousView.addFlags(268435456);
        AboutActivity.this.startActivity(paramAnonymousView);
      }
    });
    this.f = ((ImageView)findViewById(2131689683));
    this.m = ((TextView)findViewById(2131689696));
    this.i = ((TextView)findViewById(2131689686));
    this.k = ((TextView)findViewById(2131689690));
    this.j = ((TextView)findViewById(2131689688));
    this.l = ((TextView)findViewById(2131689692));
    this.n = ((TextView)findViewById(2131689698));
    this.o = ((TextView)findViewById(2131689700));
    this.p = ((TextView)findViewById(2131689702));
    this.t = ((TextView)findViewById(2131689685));
    this.u = ((TextView)findViewById(2131689687));
    this.v = ((TextView)findViewById(2131689689));
    this.w = ((TextView)findViewById(2131689691));
    this.x = ((TextView)findViewById(2131689695));
    this.y = ((TextView)findViewById(2131689697));
    this.z = ((TextView)findViewById(2131689699));
    this.A = ((TextView)findViewById(2131689701));
    this.q = ((TextView)findViewById(2131689694));
    this.r = ((TextView)findViewById(2131689706));
    this.B = ((TextView)findViewById(2131689705));
    this.C = ((TextView)findViewById(2131689693));
    if (!com.fimi.soul.biz.e.d.a().k())
    {
      this.B.setVisibility(8);
      this.r.setVisibility(8);
    }
    this.D = ((TextView)findViewById(2131689703));
    this.s = ((TextView)findViewById(2131689704));
    this.s.setVisibility(8);
    this.D.setVisibility(8);
    this.a = new g(this, this.drone);
  }
  
  private void c()
  {
    this.h = ((com.fimi.soul.module.update.a.b)com.fimi.kernel.c.c().a("sp_firmware_cache", com.fimi.soul.module.update.a.b.class));
    if ((this.h != null) && (this.h.b() > 0))
    {
      this.l.setText(a(this.h.b()));
      if ((this.h == null) || (this.h.a() <= 0)) {
        break label477;
      }
      this.i.setText(a(this.h.a()));
      label89:
      if ((this.h == null) || (this.h.c() <= 0)) {
        break label498;
      }
      this.n.setText(a(this.h.c()));
      label124:
      if ((this.h == null) || (this.h.h() <= 0)) {
        break label519;
      }
      this.o.setText(a(this.h.h()));
      label159:
      if ((this.h == null) || (this.h.f() <= 0)) {
        break label540;
      }
      this.k.setText(a(this.h.f()));
      label194:
      if ((this.h == null) || (this.h.g() <= 0)) {
        break label561;
      }
      this.p.setText(a(this.h.g()));
      label229:
      if ((this.h == null) || (this.h.e() <= 0)) {
        break label582;
      }
      this.q.setText(a(this.h.e()));
      label264:
      if ((this.h == null) || (this.h.n() <= 0)) {
        break label603;
      }
      this.m.setText(this.h.n() + "");
      label314:
      if ((TextUtils.isEmpty(com.fimi.soul.biz.e.c.a().e())) || (Integer.valueOf(com.fimi.soul.biz.e.c.a().e()).intValue() <= 0)) {
        break label624;
      }
      this.r.setText(com.fimi.soul.biz.e.c.a().e() + "");
      label373:
      if ((this.h == null) || (this.h.l() <= 0)) {
        break label645;
      }
      this.j.setText(a(this.h.l()));
      label408:
      if ((this.h == null) || (this.h.o() <= 0)) {
        break label666;
      }
      this.s.setText(a(this.h.o()));
    }
    for (;;)
    {
      if (this.I != 1) {
        d();
      }
      return;
      if (this.I != 1) {
        break;
      }
      this.l.setText(2131362513);
      break;
      label477:
      if (this.I != 1) {
        break label89;
      }
      this.i.setText(2131362513);
      break label89;
      label498:
      if (this.I != 1) {
        break label124;
      }
      this.n.setText(2131362513);
      break label124;
      label519:
      if (this.I != 1) {
        break label159;
      }
      this.o.setText(2131362513);
      break label159;
      label540:
      if (this.I != 1) {
        break label194;
      }
      this.k.setText(2131362513);
      break label194;
      label561:
      if (this.I != 1) {
        break label229;
      }
      this.p.setText(2131362513);
      break label229;
      label582:
      if (this.I != 1) {
        break label264;
      }
      this.q.setText(2131362513);
      break label264;
      label603:
      if (this.I != 1) {
        break label314;
      }
      this.m.setText(2131362513);
      break label314;
      label624:
      if (this.I != 1) {
        break label373;
      }
      this.r.setText(2131362513);
      break label373;
      label645:
      if (this.I != 1) {
        break label408;
      }
      this.j.setText(2131362513);
      break label408;
      label666:
      if (this.I == 1) {
        this.s.setText(2131362513);
      }
    }
  }
  
  private void d()
  {
    this.I = 1;
    new Thread(new Runnable()
    {
      public void run()
      {
        AboutActivity.this.a.b();
      }
    }).start();
    getHandler().sendEmptyMessageDelayed(1, 2200L);
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    }
    paramView = new Intent(this, ShowTextActivity.class);
    paramView.putExtra("URL_ONLINE", "https://fimiservice-us.mi-ae.com/statement.html");
    paramView.putExtra("URL_TITLE", 2131361965);
    paramView.putExtra("URL_LOCAL", "file:///android_asset/statement.html");
    startActivity(paramView);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968605);
    this.E = ((com.fimi.soul.biz.camera.d)com.fimi.soul.biz.camera.b.a().d());
    a();
    b();
    c();
    ao.a(getAssets(), new View[] { this.d, this.e, this.b, this.g, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.q, this.r, this.B, this.C });
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if (this.a != null) {
      this.a.c();
    }
  }
  
  public void onHandleMessage(Message paramMessage)
  {
    if (paramMessage.what == 1) {
      c();
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/setting/AboutActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */