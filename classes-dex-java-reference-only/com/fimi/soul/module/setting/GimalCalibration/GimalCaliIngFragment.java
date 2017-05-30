package com.fimi.soul.module.setting.GimalCalibration;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.kernel.view.progress.ProgressView;
import com.fimi.soul.utils.ao;

public class GimalCaliIngFragment
  extends Fragment
  implements View.OnClickListener
{
  private static final int i = 100;
  private TextView a;
  private TextView b;
  private TextView c;
  private TextView d;
  private TextView e;
  private Button f;
  private ProgressView g;
  private a h;
  
  private void a(View paramView)
  {
    this.a = ((TextView)paramView.findViewById(2131689748).findViewById(2131690327));
    this.a.setText(2131362296);
    this.b = ((TextView)paramView.findViewById(2131690297));
    this.c = ((TextView)paramView.findViewById(2131690298));
    this.d = ((TextView)paramView.findViewById(2131690299));
    this.e = ((TextView)paramView.findViewById(2131690300));
    this.f = ((Button)paramView.findViewById(2131689748).findViewById(2131690535));
    this.f.setOnClickListener(this);
    this.g = ((ProgressView)paramView.findViewById(2131689752));
    this.g.setMaxCount(100.0F);
    ao.a(getActivity().getAssets(), new View[] { this.a, this.d, this.f });
    ao.b(getActivity().getAssets(), new View[] { this.b, this.c });
  }
  
  public void a(int paramInt)
  {
    this.b.setText(paramInt + "");
    this.g.setCurrentCount(paramInt);
  }
  
  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    this.h = ((a)paramActivity);
  }
  
  public void onClick(View paramView)
  {
    if ((paramView.getId() == 2131690535) && (this.h != null)) {
      this.h.a();
    }
  }
  
  @Nullable
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(2130968703, null);
    a(paramLayoutInflater);
    return paramLayoutInflater;
  }
  
  public void onDetach()
  {
    super.onDetach();
    if (this.h != null) {
      this.h = null;
    }
  }
  
  static abstract interface a
  {
    public abstract void a();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/setting/GimalCalibration/GimalCaliIngFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */