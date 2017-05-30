package com.fimi.soul.module.setting;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.kernel.c;
import com.fimi.kernel.utils.z;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.drone.a;
import com.fimi.soul.entity.FlightTimeInfo;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.utils.FlyLogTools;
import com.fimi.soul.utils.ao;
import java.io.File;
import java.text.DecimalFormat;

public class FlyRecordActivity
  extends BaseActivity
  implements View.OnClickListener
{
  TextView a;
  TextView b;
  TextView c;
  TextView d;
  TextView e;
  TextView f;
  TextView g;
  DroidPlannerApp h;
  a i;
  ImageView j;
  FlyLogTools k;
  private final int l = 16;
  private Handler m = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      super.handleMessage(paramAnonymousMessage);
      Bundle localBundle = paramAnonymousMessage.getData();
      long l1 = localBundle.getLong("fly_distance");
      long l2 = localBundle.getLong("flyTime");
      int i = localBundle.getInt("fly_count");
      switch (paramAnonymousMessage.what)
      {
      default: 
        return;
      }
      FlyRecordActivity.this.a(i, l2, l1);
    }
  };
  
  void a(int paramInt, long paramLong1, long paramLong2)
  {
    this.c.setText(String.format("%d", new Object[] { Integer.valueOf(paramInt) }));
    long l1 = paramLong1;
    if (paramLong1 > 0L) {
      l1 = paramLong1 / 60L;
    }
    this.b.setText(String.format("%d", new Object[] { Long.valueOf(l1) }));
    double d1 = paramLong2 / 1000.0D;
    DecimalFormat localDecimalFormat = new DecimalFormat("######0.00");
    this.a.setText(String.format("%s", new Object[] { localDecimalFormat.format(d1) }));
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    }
    finish();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968682);
    this.d = ((TextView)findViewById(2131690176));
    this.a = ((TextView)findViewById(2131690191));
    this.b = ((TextView)findViewById(2131690194));
    this.c = ((TextView)findViewById(2131690198));
    this.e = ((TextView)findViewById(2131690190));
    this.f = ((TextView)findViewById(2131690193));
    this.g = ((TextView)findViewById(2131690197));
    this.j = ((ImageView)findViewById(2131689874));
    this.j.setOnClickListener(this);
    ao.b(getAssets(), new View[] { this.a, this.b, this.c });
    ao.a(getAssets(), new View[] { this.e, this.f, this.g, this.d });
    getWindow().addFlags(128);
  }
  
  protected void onResume()
  {
    super.onResume();
    this.h = ((DroidPlannerApp)getApplication());
    this.i = this.h.a;
    this.k.a(new a(null));
  }
  
  protected void onStart()
  {
    super.onStart();
    this.k = FlyLogTools.a(this);
  }
  
  private class a
    implements k
  {
    private a() {}
    
    public void a(PlaneMsg paramPlaneMsg, File paramFile)
    {
      if (paramPlaneMsg.isSuccess())
      {
        c.c();
        paramPlaneMsg = (FlightTimeInfo)paramPlaneMsg.getData();
        paramFile = new Message();
        Bundle localBundle = new Bundle();
        long l1 = paramPlaneMsg.getTotalFlyTime();
        int i = paramPlaneMsg.getFlyCount();
        long l2 = paramPlaneMsg.getTotalDistance();
        localBundle.putLong("flyTime", l1);
        localBundle.putInt("fly_count", i);
        localBundle.putLong("fly_distance", l2);
        paramFile.what = 16;
        paramFile.setData(localBundle);
        FlyRecordActivity.a(FlyRecordActivity.this).sendMessage(paramFile);
        return;
      }
      z.a(FlyRecordActivity.this, FlyRecordActivity.this.getString(2131361972));
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/setting/FlyRecordActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */