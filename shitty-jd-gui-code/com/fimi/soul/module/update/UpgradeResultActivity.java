package com.fimi.soul.module.update;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.fimi.kernel.view.percent.PercentRelativeLayout;
import com.fimi.soul.b.g;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.entity.FirmwareInfo;
import com.fimi.soul.entity.UpgradeResultDetail;
import com.fimi.soul.utils.ao;
import com.fimi.soul.view.TranslationView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UpgradeResultActivity
  extends BaseActivity
  implements View.OnClickListener
{
  public static final String a = "result_list";
  StringBuffer b;
  StringBuffer c;
  TranslationView d;
  TextView e;
  g f;
  private TextView g;
  private TextView h;
  private TextView i;
  private TextView j;
  private Button k;
  private Button l;
  private Button m;
  private ImageView n;
  private PercentRelativeLayout o;
  private PercentRelativeLayout p;
  private PercentRelativeLayout q;
  private Button r;
  private Button s;
  private TextView t;
  private ListView u;
  private List<UpgradeResultDetail> v = new ArrayList();
  
  private String a(StringBuffer paramStringBuffer, int paramInt)
  {
    paramStringBuffer.deleteCharAt(paramStringBuffer.length() - 1);
    return String.format(getString(paramInt), new Object[] { paramStringBuffer.toString() });
  }
  
  private void c()
  {
    this.n = ((ImageView)findViewById(2131689755));
    this.g = ((TextView)findViewById(2131689754));
    this.h = ((TextView)findViewById(2131689864));
    this.i = ((TextView)findViewById(2131689865));
    this.k = ((Button)findViewById(2131689867));
    this.k.setOnClickListener(this);
    this.j = ((TextView)findViewById(2131689866));
    this.l = ((Button)findViewById(2131689868));
    this.l.setOnClickListener(this);
    this.m = ((Button)findViewById(2131689869));
    this.m.setOnClickListener(this);
    this.o = ((PercentRelativeLayout)findViewById(2131689863));
    this.p = ((PercentRelativeLayout)findViewById(2131689870));
    this.q = ((PercentRelativeLayout)findViewById(2131689862));
    ao.a(getAssets(), new View[] { this.g, this.h, this.i, this.j });
  }
  
  private void d()
  {
    Object localObject = (List)getIntent().getSerializableExtra("result_list");
    this.b = new StringBuffer();
    this.c = new StringBuffer();
    if ((localObject != null) && (((List)localObject).size() > 0))
    {
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        FirmwareInfo localFirmwareInfo = (FirmwareInfo)((Iterator)localObject).next();
        if (localFirmwareInfo.isUpgradeSuccess().booleanValue()) {
          this.b.append(localFirmwareInfo.getSysName() + getString(2131362888));
        } else {
          this.c.append(localFirmwareInfo.getSysName() + getString(2131362888));
        }
      }
    }
    if ((this.b.length() > 0) && (this.c.length() == 0))
    {
      this.i.setVisibility(8);
      this.j.setVisibility(8);
      this.h.setText(a(this.b, 2131362882));
      return;
    }
    if ((this.b.length() > 0) && (this.c.length() > 0))
    {
      this.i.setVisibility(0);
      this.h.setText(a(this.b, 2131362882));
      this.i.setText(a(this.c, 2131362881));
      this.j.setTextSize(2, 11.3F);
      this.j.setVisibility(0);
      this.j.setText(getString(2131362907));
      return;
    }
    this.i.setTextSize(2, 11.3F);
    this.i.setVisibility(0);
    this.h.setText(a(this.c, 2131362881));
    this.i.setText(getString(2131362907));
    this.j.setVisibility(4);
  }
  
  private void e()
  {
    List localList = (List)getIntent().getSerializableExtra("result_list");
    this.b = new StringBuffer();
    this.c = new StringBuffer();
    if ((localList != null) && (localList.size() > 0))
    {
      int i1 = 0;
      if (i1 < localList.size())
      {
        FirmwareInfo localFirmwareInfo = (FirmwareInfo)localList.get(i1);
        UpgradeResultDetail localUpgradeResultDetail;
        if (localFirmwareInfo.isUpgradeSuccess().booleanValue())
        {
          localUpgradeResultDetail = new UpgradeResultDetail();
          localUpgradeResultDetail.setDetail(localFirmwareInfo.getSysName() + getString(2131362887));
          localUpgradeResultDetail.setImg(2130838185);
          this.v.add(localUpgradeResultDetail);
          this.b.append(localFirmwareInfo.getSysName());
          if (i1 != localList.size() - 1) {
            this.b.append(getString(2131362888));
          }
        }
        for (;;)
        {
          i1 += 1;
          break;
          localUpgradeResultDetail = new UpgradeResultDetail();
          localUpgradeResultDetail.setDetail(localFirmwareInfo.getSysName() + getString(2131362878));
          localUpgradeResultDetail.setImg(2130838184);
          this.v.add(localUpgradeResultDetail);
          this.c.append(localFirmwareInfo.getSysName());
          if (i1 != localList.size() - 1) {
            this.c.append(getString(2131362888));
          }
        }
      }
    }
    if ((this.b.length() > 0) && (this.c.length() == 0))
    {
      this.i.setVisibility(8);
      this.j.setVisibility(8);
      this.l.setVisibility(8);
      this.m.setVisibility(8);
      this.b.append(getString(2131362887));
      this.h.setText(this.b.toString());
    }
    do
    {
      return;
      if ((this.b.length() == 0) && (this.c.length() > 0))
      {
        this.c.append(getString(2131362878));
        this.c.append(getString(2131362880));
        this.h.setText(this.c.toString());
        this.n.setBackgroundResource(2130838598);
        this.k.setVisibility(8);
        this.g.setText(getString(2131362877));
        return;
      }
    } while ((this.b.length() <= 0) || (this.c.length() <= 0));
    this.o.setVisibility(8);
    this.p.setVisibility(0);
    this.q.setBackgroundResource(2130838603);
    a();
    b();
  }
  
  public void a()
  {
    this.r = ((Button)findViewById(2131689842));
    ao.a(getAssets(), new View[] { this.r });
    this.r.setOnClickListener(this);
    this.s = ((Button)findViewById(2131689843));
    ao.a(getAssets(), new View[] { this.s });
    this.s.setOnClickListener(this);
    this.d = ((TranslationView)findViewById(2131689736));
    this.d.setVisibility(0);
    this.d.a();
    this.e = ((TextView)findViewById(2131689737));
    ao.a(getAssets(), new View[] { this.e });
    this.t = ((TextView)findViewById(2131689741));
    ao.a(getAssets(), new View[] { this.t });
    new StringBuilder().append(getString(2131362867));
    getString(2131362156);
    this.u = ((ListView)findViewById(2131689740));
  }
  
  public void b()
  {
    this.f = new g(this, this.v);
    this.u.setAdapter(this.f);
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131689867: 
      finish();
      return;
    case 2131689868: 
      finish();
      return;
    case 2131689869: 
      finish();
      return;
    case 2131689842: 
      finish();
      return;
    }
    finish();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968634);
    c();
    e();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/update/UpgradeResultActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */