package com.fimi.soul.module.setting;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;
import com.fimi.kernel.utils.z;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.drone.a;
import com.fimi.soul.drone.c.a.a.bf;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.drone.droneconnection.connection.f.a;
import com.fimi.soul.drone.h.c;
import java.util.ArrayList;
import java.util.List;

public class RightRollerSetActivity
  extends FragmentActivity
  implements View.OnClickListener, d.b
{
  g a;
  a b;
  ListView c;
  Button d;
  Intent e;
  boolean f = true;
  String g = "";
  int h = -1;
  boolean i = false;
  
  private void a(a parama)
  {
    bf localbf;
    if (parama != a.c)
    {
      localbf = new bf();
      localbf.d = 115;
      localbf.e = 1;
      if (parama != a.a) {
        break label85;
      }
      localbf.f = 1;
      this.e.putExtra("content", getString(2131362185));
    }
    for (;;)
    {
      this.b.T().a(localbf.a());
      this.i = true;
      setResult(-1, this.e);
      return;
      label85:
      if (parama == a.b)
      {
        localbf.f = 2;
        this.e.putExtra("content", getString(2131362414));
      }
    }
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
    setContentView(2130968779);
    this.d = ((Button)findViewById(2131690535));
    this.d.setOnClickListener(this);
    this.c = ((ListView)findViewById(2131690536));
    getWindow().addFlags(128);
  }
  
  public void onDroneEvent(d.a parama, a parama1)
  {
    if ((parama1.T().a()) && (parama1.U())) {
      switch (3.a[parama.ordinal()])
      {
      }
    }
    do
    {
      return;
      parama = parama1.L();
    } while ((parama == null) || (parama.b() != 115) || (!this.i));
    if (parama.c() == 2) {
      switch (parama.d)
      {
      default: 
        z.a(this, getString(2131362690));
      }
    }
    for (;;)
    {
      this.i = false;
      return;
      this.a.a(1);
      this.h = 1;
      break;
      this.a.a(0);
      this.h = 0;
      break;
      if ((parama.c() == 4) || (parama.c() == 6))
      {
        z.a(this, getString(2131362696));
        this.h = -1;
      }
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    this.e = getIntent();
    if ((!this.b.T().a()) || (!this.b.U()))
    {
      this.c.setClickable(false);
      this.a.a(true);
    }
    do
    {
      do
      {
        return;
        this.f = this.e.getBooleanExtra("GPS_ATTI", false);
        if (this.e.getStringExtra("curModel") != null) {}
        for (String str = this.e.getStringExtra("curModel");; str = "")
        {
          this.g = str;
          if ((this.a == null) || (!this.f)) {
            break;
          }
          this.a.b(true);
          this.a.a(2);
          this.c.setClickable(false);
          return;
        }
      } while ((this.f) || (this.a == null));
      this.c.setClickable(true);
      this.a.b(false);
      if (this.g.equals(getString(2131362185)))
      {
        this.a.a(1);
        return;
      }
    } while (!this.g.equals(getString(2131362414)));
    this.a.a(0);
  }
  
  public void onStart()
  {
    super.onStart();
    this.b = ((DroidPlannerApp)getApplication()).a;
    this.b.a(this);
    String[] arrayOfString = getResources().getStringArray(2131558415);
    ArrayList localArrayList = new ArrayList();
    if ((arrayOfString != null) && (arrayOfString.length > 0))
    {
      int k = arrayOfString.length;
      int j = 0;
      while (j < k)
      {
        String str = arrayOfString[j];
        h localh = new h();
        localh.a(false);
        localh.a(str);
        localArrayList.add(localh);
        j += 1;
      }
    }
    this.a = new g(this, localArrayList);
    this.c.setAdapter(this.a);
    this.c.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, final int paramAnonymousInt, long paramAnonymousLong)
      {
        if ((!RightRollerSetActivity.this.b.T().a()) || (!RightRollerSetActivity.this.b.U()))
        {
          z.a(RightRollerSetActivity.this, RightRollerSetActivity.this.getString(2131362647));
          return;
        }
        switch (paramAnonymousInt)
        {
        }
        for (;;)
        {
          paramAnonymousView.setOnTouchListener(new View.OnTouchListener()
          {
            public boolean onTouch(View paramAnonymous2View, MotionEvent paramAnonymous2MotionEvent)
            {
              return (paramAnonymousInt == RightRollerSetActivity.this.h) || (paramAnonymousInt == 2);
            }
          });
          return;
          RightRollerSetActivity.a(RightRollerSetActivity.this, RightRollerSetActivity.a.b);
          continue;
          RightRollerSetActivity.a(RightRollerSetActivity.this, RightRollerSetActivity.a.a);
        }
      }
    });
    this.c.setOnTouchListener(new View.OnTouchListener()
    {
      public boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        return (RightRollerSetActivity.this.f) || (!RightRollerSetActivity.this.b.U()) || (!RightRollerSetActivity.this.b.T().a());
      }
    });
  }
  
  protected void onStop()
  {
    super.onStop();
    if (this.b != null) {
      this.b.b(this);
    }
  }
  
  public static enum a
  {
    private a() {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/setting/RightRollerSetActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */