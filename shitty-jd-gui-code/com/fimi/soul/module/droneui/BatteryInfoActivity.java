package com.fimi.soul.module.droneui;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.kernel.c;
import com.fimi.kernel.utils.t;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.drone.d.f;
import com.fimi.soul.drone.h.d;
import com.fimi.soul.drone.h.u;
import com.fimi.soul.entity.BatteryUpdateSize;
import com.fimi.soul.module.update.a.b;
import com.fimi.soul.utils.ao;
import com.fimi.soul.view.BatteryCapacityView;
import com.fimi.soul.view.BatteryVoltageView;
import com.fimi.soul.view.BatteryVoltageView.a;

public class BatteryInfoActivity
  extends BaseActivity
  implements View.OnClickListener, d.b
{
  private static int A = 1;
  private static final int C = 1340;
  private static final int w = 75;
  private static final int x = 10;
  private boolean B = true;
  private com.fimi.soul.module.update.a.a D;
  private Handler E = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      super.handleMessage(paramAnonymousMessage);
      if ((paramAnonymousMessage.what == BatteryInfoActivity.a()) && (!BatteryInfoActivity.a(BatteryInfoActivity.this))) {
        f.i(BatteryInfoActivity.this.drone);
      }
    }
  };
  private float F;
  private float G;
  private boolean H = true;
  private Button a;
  private TextView b;
  private TextView c;
  private TextView d;
  private TextView e;
  private TextView f;
  private TextView g;
  private TextView h;
  private TextView i;
  private TextView j;
  private TextView k;
  private TextView l;
  private TextView m;
  private ImageView n;
  private BatteryCapacityView o;
  private BatteryVoltageView p;
  private BatteryVoltageView q;
  private BatteryVoltageView r;
  private BatteryVoltageView s;
  private com.fimi.soul.utils.a.a t;
  private boolean u = false;
  private b v;
  private int y = 0;
  private boolean z = true;
  
  private String a(int paramInt)
  {
    return t.b(paramInt / 100.0D + 2.0D, 2) + " V";
  }
  
  private void a(u paramu)
  {
    int i1 = paramu.c() & 0xFFFF;
    int i2 = paramu.b();
    int i3 = paramu.a() & 0xFF;
    int i4 = paramu.d();
    long l1 = paramu.e();
    long l2 = paramu.f();
    long l3 = paramu.g();
    long l4 = paramu.h();
    if (i1 > 0)
    {
      this.D.a(new com.fimi.soul.module.update.a.e(i3, i4, i1, String.valueOf(Long.valueOf(i2)), l1, l2, l3, l4));
      this.D.a(i3, i1);
    }
  }
  
  private void b()
  {
    String str;
    if (this.drone.U())
    {
      if (this.H) {
        com.fimi.soul.drone.d.e.a(this.drone);
      }
      str = this.drone.w().i() - 60 + getString(2131362830);
      if (this.drone.w().i() - 60 < 75) {
        break label149;
      }
      str = str + getString(2131361987);
      this.b.setTextColor(getResources().getColor(2131623954));
    }
    for (;;)
    {
      this.b.setText(" " + str);
      d();
      return;
      label149:
      if (this.drone.w().i() - 60 < 10)
      {
        str = str + getString(2131361990);
        this.b.setTextColor(getResources().getColor(2131623956));
      }
      else
      {
        str = str + getString(2131361991);
        this.b.setTextColor(getResources().getColor(2131624291));
      }
    }
  }
  
  private void c()
  {
    this.a = ((Button)findViewById(2131689874));
    this.a.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        BatteryInfoActivity.this.finish();
      }
    });
  }
  
  private void d()
  {
    this.F = this.drone.D().e();
    this.G = this.drone.D().d();
    int i1;
    int i3;
    double d1;
    Object localObject;
    double d2;
    label456:
    label509:
    label562:
    label615:
    double d3;
    double d4;
    double d5;
    if (this.F > 0.0F)
    {
      this.i.setText(" " + a(this.drone.w().a()));
      this.j.setText(" " + a(this.drone.w().b()));
      this.k.setText(" " + a(this.drone.w().c()));
      this.l.setText(" " + a(this.drone.w().d()));
      this.h.setText(" " + this.drone.D().d + "");
      i1 = this.drone.w().g();
      int i2 = i1;
      if (i1 < 0) {
        i2 = 0;
      }
      i3 = (int)(i2 / this.F * 100.0F);
      int i4 = (int)(i2 / this.G * 100.0F);
      i1 = i3;
      if (i3 < 0) {
        i1 = 0;
      }
      i3 = i1;
      if (i1 > 100) {
        i3 = 100;
      }
      if (i4 > 30) {
        break label1325;
      }
      this.o.setPercent(i4);
      this.g.setText(" " + (int)this.F + " mAH");
      this.c.setText(" " + i2 + " mAH");
      d1 = 4.35D - 3.2D;
      localObject = this.p;
      d2 = this.drone.w().a() / 100.0D + 2.0D - 3.2D;
      if (d2 <= 0.0D) {
        break label1337;
      }
      i1 = (int)(d2 / d1 * 100.0D);
      ((BatteryVoltageView)localObject).setPercent(i1);
      localObject = this.q;
      d2 = this.drone.w().b() / 100.0D + 2.0D - 3.2D;
      if (d2 <= 0.0D) {
        break label1343;
      }
      i1 = (int)(d2 / d1 * 100.0D);
      ((BatteryVoltageView)localObject).setPercent(i1);
      localObject = this.r;
      d2 = this.drone.w().c() / 100.0D + 2.0D - 3.2D;
      if (d2 <= 0.0D) {
        break label1349;
      }
      i1 = (int)(d2 / d1 * 100.0D);
      ((BatteryVoltageView)localObject).setPercent(i1);
      localObject = this.s;
      d2 = this.drone.w().d() / 100.0D + 2.0D - 3.2D;
      if (d2 <= 0.0D) {
        break label1355;
      }
      i1 = (int)(d2 / d1 * 100.0D);
      ((BatteryVoltageView)localObject).setPercent(i1);
      if (this.y >= 1340) {
        this.d.setText(this.drone.w().l() + "");
      }
      d2 = this.drone.w().a() / 100.0D + 2.0D;
      d3 = this.drone.w().b() / 100.0D + 2.0D;
      d4 = this.drone.w().c() / 100.0D + 2.0D;
      d5 = 2.0D + this.drone.w().d() / 100.0D;
      if (d2 <= d3) {
        break label1361;
      }
      d1 = d2;
      label760:
      if (d1 <= d4) {
        break label1367;
      }
      label767:
      if (d1 <= d5) {
        break label1373;
      }
      label774:
      localObject = new StringBuilder();
      i1 = 0;
      if ((a(d1, d2) <= 0.2D) && (d2 >= 3.0D)) {
        break label1517;
      }
      if (a(d1, d2) <= 0.4D) {
        break label1379;
      }
      this.i.setTextColor(getResources().getColor(2131623953));
      this.p.a(BatteryVoltageView.a.c);
      ((StringBuilder)localObject).append(getString(2131361992) + getString(2131361982));
      label883:
      i1 = 1;
      label886:
      if ((a(d1, d3) <= 0.2D) && (d3 >= 3.0D)) {
        break label1686;
      }
      if (i1 % 2 != 0) {
        ((StringBuilder)localObject).append(",");
      }
      if (a(d1, d3) <= 0.4D) {
        break label1547;
      }
      this.j.setTextColor(getResources().getColor(2131623953));
      this.q.a(BatteryVoltageView.a.c);
      ((StringBuilder)localObject).append(getString(2131361999) + getString(2131361982));
      label1002:
      i2 = i1 + 1;
      i1 = i2;
      if (i2 % 2 == 0)
      {
        ((StringBuilder)localObject).append("\n");
        i1 = i2;
      }
      label1032:
      if ((a(d1, d4) <= 0.2D) && (d4 >= 3.0D)) {
        break label1855;
      }
      if (i1 % 2 != 0) {
        ((StringBuilder)localObject).append(",");
      }
      if (a(d1, d4) <= 0.4D) {
        break label1716;
      }
      this.k.setTextColor(getResources().getColor(2131623953));
      this.r.a(BatteryVoltageView.a.c);
      ((StringBuilder)localObject).append(getString(2131361997) + getString(2131361982));
      label1148:
      i2 = i1 + 1;
      i1 = i2;
      if (i2 % 2 == 0)
      {
        ((StringBuilder)localObject).append("\n");
        i1 = i2;
      }
      label1178:
      if ((a(d1, d5) <= 0.2D) && (d5 >= 3.0D)) {
        break label2024;
      }
      if (i1 % 2 != 0) {
        ((StringBuilder)localObject).append(",");
      }
      if (a(d1, d5) <= 0.4D) {
        break label1885;
      }
      this.l.setTextColor(getResources().getColor(2131623953));
      this.s.a(BatteryVoltageView.a.c);
      ((StringBuilder)localObject).append(getString(2131361986) + getString(2131361982));
      label1294:
      if ((i1 + 1) % 2 == 0) {
        ((StringBuilder)localObject).append("\n");
      }
    }
    for (;;)
    {
      this.f.setText(((StringBuilder)localObject).toString());
      return;
      label1325:
      this.o.setPercent(i3);
      break;
      label1337:
      i1 = 0;
      break label456;
      label1343:
      i1 = 0;
      break label509;
      label1349:
      i1 = 0;
      break label562;
      label1355:
      i1 = 0;
      break label615;
      label1361:
      d1 = d3;
      break label760;
      label1367:
      d1 = d4;
      break label767;
      label1373:
      d1 = d5;
      break label774;
      label1379:
      if (d2 < 3.0D)
      {
        this.i.setTextColor(getResources().getColor(2131623954));
        this.p.a(BatteryVoltageView.a.b);
        ((StringBuilder)localObject).append(getString(2131361992) + getString(2131361993));
        break label883;
      }
      this.i.setTextColor(getResources().getColor(2131623954));
      this.p.a(BatteryVoltageView.a.b);
      ((StringBuilder)localObject).append(getString(2131361992) + getString(2131361994));
      break label883;
      label1517:
      this.p.a(BatteryVoltageView.a.a);
      this.i.setTextColor(getResources().getColor(2131623959));
      break label886;
      label1547:
      if (d3 < 3.0D)
      {
        this.j.setTextColor(getResources().getColor(2131623954));
        this.q.a(BatteryVoltageView.a.b);
        ((StringBuilder)localObject).append(getString(2131361999) + getString(2131361993));
        break label1002;
      }
      this.j.setTextColor(getResources().getColor(2131623954));
      this.q.a(BatteryVoltageView.a.b);
      ((StringBuilder)localObject).append(getString(2131361999) + getString(2131361994));
      break label1002;
      label1686:
      this.q.a(BatteryVoltageView.a.a);
      this.j.setTextColor(getResources().getColor(2131623959));
      break label1032;
      label1716:
      if (d4 < 3.0D)
      {
        this.k.setTextColor(getResources().getColor(2131623954));
        this.r.a(BatteryVoltageView.a.b);
        ((StringBuilder)localObject).append(getString(2131361997) + getString(2131361993));
        break label1148;
      }
      this.k.setTextColor(getResources().getColor(2131623954));
      this.r.a(BatteryVoltageView.a.b);
      ((StringBuilder)localObject).append(getString(2131361997) + getString(2131361994));
      break label1148;
      label1855:
      this.r.a(BatteryVoltageView.a.a);
      this.k.setTextColor(getResources().getColor(2131623959));
      break label1178;
      label1885:
      if (d5 < 3.0D)
      {
        this.l.setTextColor(getResources().getColor(2131623954));
        this.s.a(BatteryVoltageView.a.b);
        ((StringBuilder)localObject).append(getString(2131361986) + getString(2131361993));
        break label1294;
      }
      this.l.setTextColor(getResources().getColor(2131623954));
      this.s.a(BatteryVoltageView.a.b);
      ((StringBuilder)localObject).append(getString(2131361986) + getString(2131361994));
      break label1294;
      label2024:
      this.s.a(BatteryVoltageView.a.a);
      this.l.setTextColor(getResources().getColor(2131623959));
    }
  }
  
  private void e()
  {
    BatteryUpdateSize localBatteryUpdateSize1;
    if ((this.y >= 1342) && (!this.u))
    {
      localBatteryUpdateSize1 = new BatteryUpdateSize();
      localBatteryUpdateSize1.setBatteryId(com.fimi.soul.module.update.a.a.a().a(5).i());
      if (!TextUtils.isEmpty(localBatteryUpdateSize1.getBatteryId())) {
        break label50;
      }
    }
    label50:
    BatteryUpdateSize localBatteryUpdateSize2;
    do
    {
      return;
      localBatteryUpdateSize1.setBatteryUpdateSize(this.drone.w().m() / 20 * 20);
      if (localBatteryUpdateSize1.getBatteryUpdateSize() < 20)
      {
        this.t.d(localBatteryUpdateSize1);
        this.u = false;
        return;
      }
      localBatteryUpdateSize2 = this.t.b(localBatteryUpdateSize1);
      if (localBatteryUpdateSize2 == null)
      {
        localBatteryUpdateSize1.setMessageHintSize(1);
        this.t.a(localBatteryUpdateSize1);
        this.n.setVisibility(0);
        this.u = true;
        return;
      }
    } while (localBatteryUpdateSize2.getMessageHintSize() >= 3);
    localBatteryUpdateSize1.setMessageHintSize(localBatteryUpdateSize2.getMessageHintSize() + 1);
    this.t.c(localBatteryUpdateSize1);
    this.n.setVisibility(0);
    this.u = true;
  }
  
  public double a(double paramDouble1, double paramDouble2)
  {
    return (paramDouble1 * 100.0D - paramDouble2 * 100.0D) / 100.0D;
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    }
    if (this.m.getVisibility() == 0)
    {
      this.m.setVisibility(8);
      return;
    }
    this.m.setVisibility(0);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    getWindow().setFlags(128, 128);
    setContentView(2130968639);
    this.y = com.fimi.soul.module.update.a.a.a().a(5).b();
    this.f = ((TextView)findViewById(2131689931));
    this.b = ((TextView)findViewById(2131689921));
    this.o = ((BatteryCapacityView)findViewById(2131689909));
    this.c = ((TextView)findViewById(2131689912));
    this.g = ((TextView)findViewById(2131689914));
    this.h = ((TextView)findViewById(2131689916));
    this.i = ((TextView)findViewById(2131689924));
    this.j = ((TextView)findViewById(2131689926));
    this.k = ((TextView)findViewById(2131689928));
    this.l = ((TextView)findViewById(2131689930));
    this.p = ((BatteryVoltageView)findViewById(2131689923));
    this.q = ((BatteryVoltageView)findViewById(2131689925));
    this.r = ((BatteryVoltageView)findViewById(2131689927));
    this.s = ((BatteryVoltageView)findViewById(2131689929));
    this.d = ((TextView)findViewById(2131689919));
    this.e = ((TextView)findViewById(2131689918));
    if (this.y < 1340)
    {
      this.d.setVisibility(8);
      this.e.setVisibility(8);
    }
    this.n = ((ImageView)findViewById(2131689917));
    this.n.setVisibility(8);
    this.n.setOnClickListener(this);
    this.m = ((TextView)findViewById(2131689910));
    this.m.setVisibility(8);
    c();
    b();
    ao.a(getAssets(), getWindow().getDecorView());
    this.drone.a(this);
    f.i(this.drone);
    this.E.sendEmptyMessageDelayed(A, 200L);
    this.E.sendEmptyMessageDelayed(A, 400L);
    this.E.sendEmptyMessageDelayed(A, 600L);
    this.E.sendEmptyMessageDelayed(A, 800L);
    this.B = false;
    this.c.setSingleLine(true);
    this.c.setEllipsize(TextUtils.TruncateAt.MARQUEE);
    this.c.setMarqueeRepeatLimit(6);
    this.t = com.fimi.soul.utils.a.a.a(this);
    this.D = com.fimi.soul.module.update.a.a.a();
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    this.drone.b(this);
  }
  
  public void onDroneEvent(d.a parama, com.fimi.soul.drone.a parama1)
  {
    switch (3.a[parama.ordinal()])
    {
    }
    for (;;)
    {
      if (!parama1.U())
      {
        this.u = false;
        this.m.setVisibility(8);
        this.n.setVisibility(8);
        this.H = true;
        this.o.setPercent(-1);
        this.p.setPercent(0);
        this.q.setPercent(0);
        this.r.setPercent(0);
        this.s.setPercent(0);
        this.i.setText(getResources().getString(2131362517));
        this.j.setText(getResources().getString(2131362517));
        this.k.setText(getResources().getString(2131362517));
        this.l.setText(getResources().getString(2131362517));
        this.i.setTextColor(getResources().getColor(2131623959));
        this.j.setTextColor(getResources().getColor(2131623959));
        this.k.setTextColor(getResources().getColor(2131623959));
        this.l.setTextColor(getResources().getColor(2131623959));
        this.b.setTextColor(getResources().getColor(2131623959));
        this.c.setText(getString(2131362517));
        this.b.setText(getString(2131362517));
        this.h.setText(getString(2131362517));
        if (this.y >= 1340)
        {
          this.d.setText(getString(2131362517));
          this.d.setVisibility(8);
          this.e.setVisibility(8);
        }
        this.g.setText(getString(2131362517));
        this.f.setText("");
        this.z = false;
      }
      if ((parama1.U()) && (!this.z))
      {
        this.B = false;
        f.i(parama1);
        this.E.sendEmptyMessageDelayed(A, 200L);
        this.E.sendEmptyMessageDelayed(A, 400L);
        this.E.sendEmptyMessageDelayed(A, 600L);
        this.E.sendEmptyMessageDelayed(A, 800L);
        this.z = true;
      }
      do
      {
        return;
        b();
        this.H = false;
        break;
        b();
        e();
        break;
        this.v = ((b)c.c().a("sp_firmware_cache", b.class));
      } while (this.B);
      if (parama1.j().a() == 5)
      {
        this.y = (parama1.j().c() & 0xFFFF);
        this.B = true;
      }
      a(parama1.j());
      if (this.y >= 1340)
      {
        this.d.setVisibility(0);
        this.e.setVisibility(0);
      }
      else
      {
        this.d.setVisibility(8);
        this.e.setVisibility(8);
      }
    }
  }
  
  public void onHandleMessage(Message paramMessage) {}
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/droneui/BatteryInfoActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */