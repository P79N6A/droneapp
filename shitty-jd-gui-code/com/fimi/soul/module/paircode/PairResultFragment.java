package com.fimi.soul.module.paircode;

import android.app.Activity;
import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fimi.kernel.view.progress.ProgressView;
import com.fimi.soul.biz.e.d;
import com.fimi.soul.utils.ao;
import java.util.Timer;
import java.util.TimerTask;

public class PairResultFragment
  extends Fragment
  implements View.OnClickListener, a
{
  RelativeLayout a;
  RelativeLayout b;
  RelativeLayout c;
  public int d = 0;
  TextView e;
  TextView f;
  TextView g;
  TextView h;
  Button i;
  Button j;
  Button k;
  ProgressView l;
  PairCodeActivity m;
  View n;
  Timer o;
  private final int p = 2;
  private final int q = 3;
  private final int r = 4;
  private final int s = -1;
  private final int t = 0;
  private final int u = 256;
  private Handler v = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      super.handleMessage(paramAnonymousMessage);
      switch (paramAnonymousMessage.what)
      {
      default: 
        return;
      }
      PairResultFragment.this.l.setCurrentCount(PairResultFragment.this.d);
      PairResultFragment.this.g.setText(String.valueOf(PairResultFragment.this.d));
    }
  };
  
  private void a(View paramView)
  {
    this.b = ((RelativeLayout)paramView.findViewById(2131690453));
    this.h = ((TextView)this.b.findViewById(2131690455));
    this.a = ((RelativeLayout)paramView.findViewById(2131690466));
    this.c = ((RelativeLayout)paramView.findViewById(2131690465));
    this.l = ((ProgressView)this.n.findViewById(2131690464));
    this.l.setFrontColor(getResources().getColor(2131624293));
    this.l.setMaxCount(100.0F);
    this.l.setCurrentCount(0.0F);
    this.e = ((TextView)this.n.findViewById(2131690463));
    this.f = ((TextView)this.n.findViewById(2131690462));
    this.g = ((TextView)this.n.findViewById(2131690460));
    ao.b(getActivity().getAssets(), new View[] { this.g });
    this.i = ((Button)this.n.findViewById(2131690457));
    this.j = ((Button)this.n.findViewById(2131690458));
    this.k = ((Button)this.n.findViewById(2131690467));
    this.k.setOnClickListener(this);
    this.i.setOnClickListener(this);
    this.j.setOnClickListener(this);
    ao.a(getActivity().getAssets(), new View[] { this.e, this.f, this.g, this.i, this.j, this.k });
  }
  
  private void a(a parama)
  {
    this.b.setVisibility(8);
    this.a.setVisibility(8);
    this.c.setVisibility(8);
    switch (3.a[parama.ordinal()])
    {
    default: 
    case 1: 
      do
      {
        return;
        this.c.setVisibility(0);
        if (this.d == -1)
        {
          this.c.setVisibility(8);
          this.h.setText(getResources().getString(2131362557));
          this.b.setVisibility(0);
          parama = this.m;
          PairCodeActivity.a = false;
          return;
        }
        if (this.d != 100) {
          break;
        }
        this.c.setVisibility(8);
        this.b.setVisibility(8);
        this.a.setVisibility(0);
      } while ((d.a().k()) || (this.o == null));
      this.o.cancel();
      this.o = null;
      return;
      if (d.a().k())
      {
        this.l.setCurrentCount(this.d);
        this.g.setText(String.valueOf(this.d));
        return;
      }
      this.o = new Timer();
      parama = new TimerTask()
      {
        public void run()
        {
          PairResultFragment.a(PairResultFragment.this).sendEmptyMessage(256);
          PairResultFragment.this.d = 10;
        }
      };
      this.o.schedule(parama, 200L, 200L);
      return;
    case 2: 
      this.b.setVisibility(0);
      return;
    }
    this.h.setText(getResources().getString(2131362552));
    this.b.setVisibility(0);
  }
  
  public void a(int paramInt) {}
  
  public void a(int paramInt1, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return;
    case 2: 
      this.d = paramInt2;
      a(a.a);
      return;
    case 3: 
      a(a.b);
      return;
    }
    a(a.c);
  }
  
  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    this.m = ((PairCodeActivity)paramActivity);
    this.m.a(this);
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131690457: 
      getActivity().finish();
      return;
    case 2131690458: 
      this.m.a();
      return;
    }
    getActivity().finish();
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.n = paramLayoutInflater.inflate(2130968759, null);
    a(this.n);
    return this.n;
  }
  
  public static enum a
  {
    private a() {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/paircode/PairResultFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */