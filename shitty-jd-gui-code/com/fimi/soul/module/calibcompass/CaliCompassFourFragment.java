package com.fimi.soul.module.calibcompass;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.fimi.kernel.c.c;
import com.fimi.soul.biz.manager.MyLocationManager;
import com.fimi.soul.entity.CheckCampssBeann;
import com.fimi.soul.module.b.d;
import com.fimi.soul.module.login.LoginActivity;
import com.fimi.soul.utils.ao;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

public class CaliCompassFourFragment
  extends BaseCaliCompassFragment
{
  private TextView f;
  private TextView g;
  private TextView h;
  private Button i;
  private boolean j;
  private Handler k = new Handler();
  private Runnable l = new Runnable()
  {
    public void run()
    {
      if (CaliCompassFourFragment.a(CaliCompassFourFragment.this))
      {
        Intent localIntent = new Intent(CaliCompassFourFragment.this.getActivity(), LoginActivity.class);
        localIntent.putExtra("login", false);
        CaliCompassFourFragment.this.startActivity(localIntent);
        CaliCompassFourFragment.this.getActivity().finish();
        return;
      }
      CaliCompassFourFragment.this.getActivity().setResult(0);
      CaliCompassFourFragment.this.getActivity().finish();
    }
  };
  
  private void a(View paramView)
  {
    this.f = ((TextView)paramView.findViewById(2131689628));
    this.g = ((TextView)paramView.findViewById(2131689938));
    this.h = ((TextView)paramView.findViewById(2131689942));
    this.i = ((Button)paramView.findViewById(2131689943));
    this.i.setOnClickListener(this);
    ao.a(getActivity().getAssets(), new View[] { this.f, this.g, this.h, this.i });
  }
  
  public void a()
  {
    d.a(this.b).a((byte)1, (byte)1, (byte)4);
    getActivity().finish();
  }
  
  public void a(boolean paramBoolean)
  {
    this.j = paramBoolean;
  }
  
  public void onClick(View paramView)
  {
    super.onClick(paramView);
    if (paramView.getId() == 2131689943) {
      this.k.postDelayed(this.l, 300L);
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(2130968645, null);
    a(paramLayoutInflater);
    return paramLayoutInflater;
  }
  
  public void onHiddenChanged(boolean paramBoolean)
  {
    super.onHiddenChanged(paramBoolean);
    CheckCampssBeann localCheckCampssBeann;
    if ((!paramBoolean) && (isVisible()))
    {
      localCheckCampssBeann = (CheckCampssBeann)c.a().a("checkcampass", CheckCampssBeann.class);
      if (localCheckCampssBeann == null) {
        break label95;
      }
    }
    for (List localList = localCheckCampssBeann.getListLatlng();; localList = localCheckCampssBeann.getListLatlng())
    {
      Location localLocation = MyLocationManager.a(getActivity()).c();
      if (localLocation != null)
      {
        localList.add(new LatLng(localLocation.getLatitude(), localLocation.getLongitude()));
        localCheckCampssBeann.setListLatlng(localList);
        c.a().a("checkcampass", localCheckCampssBeann);
      }
      return;
      label95:
      localCheckCampssBeann = new CheckCampssBeann();
    }
  }
  
  public void onResume()
  {
    super.onResume();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/calibcompass/CaliCompassFourFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */