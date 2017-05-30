package com.fimi.soul.module.remote;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.KeyEvent;
import android.view.Window;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.module.b.d;
import com.fimi.soul.view.f;
import com.fimi.soul.view.f.a;
import java.util.Iterator;
import java.util.List;

public class RemoteCalibration
  extends BaseActivity
  implements d.b, BaseRemoteFragment.a
{
  private RemoteMidCalibrationFragment a;
  private BaseRemoteFragment b;
  private FragmentManager c;
  private d d;
  private RemoteRollerFragment e;
  
  public void a()
  {
    f.a locala = new f.a(this);
    locala.a(getString(2131362360));
    locala.b(getString(2131362051), new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        paramAnonymousDialogInterface.dismiss();
      }
    }).a(getString(2131362175), new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        paramAnonymousDialogInterface.dismiss();
        RemoteCalibration.a(RemoteCalibration.this).n();
        RemoteCalibration.a(RemoteCalibration.this).m();
        RemoteCalibration.this.finish();
      }
    }).a().show();
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    this.c.beginTransaction().hide(this.c.findFragmentById(paramInt1)).commitAllowingStateLoss();
    this.c.beginTransaction().show(this.c.findFragmentById(paramInt2)).commitAllowingStateLoss();
  }
  
  public void a(int paramInt1, int paramInt2, String paramString, boolean paramBoolean)
  {
    if (!(this.c.findFragmentById(paramInt1) instanceof ErrorCaliBretionFragment))
    {
      this.c.beginTransaction().hide(this.c.findFragmentById(paramInt1)).commitAllowingStateLoss();
      if ((this.c.findFragmentById(paramInt2) != null) && ((this.c.findFragmentById(paramInt2) instanceof ErrorCaliBretionFragment)))
      {
        ErrorCaliBretionFragment localErrorCaliBretionFragment = (ErrorCaliBretionFragment)this.c.findFragmentById(paramInt2);
        localErrorCaliBretionFragment.a(paramString, paramBoolean);
        if (localErrorCaliBretionFragment.isHidden()) {
          this.c.beginTransaction().show(localErrorCaliBretionFragment).commitAllowingStateLoss();
        }
      }
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968777);
    getWindow().setFlags(128, 128);
    this.d = d.a(this.drone);
    this.c = getSupportFragmentManager();
    if (paramBundle == null)
    {
      this.b = ((BaseRemoteFragment)this.c.findFragmentById(2131690526));
      if (this.b == null)
      {
        this.b = new BaseRemoteFragment();
        this.c.beginTransaction().add(2131690526, this.b).commit();
      }
      this.e = ((RemoteRollerFragment)this.c.findFragmentById(2131690532));
      if (this.e == null) {
        this.e = new RemoteRollerFragment();
      }
      this.c.beginTransaction().add(2131690532, this.e).commit();
      Object localObject = (RemoteMidcalingFragment)this.c.findFragmentById(2131690529);
      paramBundle = (Bundle)localObject;
      if (localObject == null) {
        paramBundle = new RemoteMidcalingFragment();
      }
      this.c.beginTransaction().add(2131690529, paramBundle).hide(paramBundle).commit();
      localObject = (RemoteEndCaliFragment)this.c.findFragmentById(2131690530);
      paramBundle = (Bundle)localObject;
      if (localObject == null) {
        paramBundle = new RemoteEndCaliFragment();
      }
      this.c.beginTransaction().add(2131690530, paramBundle).hide(paramBundle).commit();
      localObject = (CarliRemoteFragment)this.c.findFragmentById(2131690531);
      paramBundle = (Bundle)localObject;
      if (localObject == null) {
        paramBundle = new CarliRemoteFragment();
      }
      this.c.beginTransaction().add(2131690531, paramBundle).hide(paramBundle).commit();
      localObject = (WhellRemoteFragment)this.c.findFragmentById(2131690533);
      paramBundle = (Bundle)localObject;
      if (localObject == null) {
        paramBundle = new WhellRemoteFragment();
      }
      this.c.beginTransaction().replace(2131690533, paramBundle).hide(paramBundle).commit();
      localObject = (ErrorCaliBretionFragment)this.c.findFragmentById(2131690534);
      paramBundle = (Bundle)localObject;
      if (localObject == null) {
        paramBundle = new ErrorCaliBretionFragment();
      }
      this.c.beginTransaction().add(2131690534, paramBundle).hide(paramBundle).commit();
    }
  }
  
  public void onDroneEvent(d.a parama, com.fimi.soul.drone.a parama1)
  {
    switch (3.a[parama.ordinal()])
    {
    }
    do
    {
      return;
      while (!parama.hasNext())
      {
        com.fimi.soul.module.calibcompass.a.a().a("98");
        return;
        parama = this.c.getFragments().iterator();
      }
      parama1 = (Fragment)parama.next();
    } while ((!parama1.isVisible()) || (this.e == null) || (this.e.isVisible()));
    a(parama1.getId(), 2131690534, getString(2131362019), false);
  }
  
  public void onHandleMessage(Message paramMessage)
  {
    super.onHandleMessage(paramMessage);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      if ((this.e != null) && (this.e.isVisible())) {
        finish();
      }
      for (;;)
      {
        return false;
        a();
      }
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
  }
  
  protected void onStart()
  {
    super.onStart();
    this.drone.a(this);
    this.d.j();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/remote/RemoteCalibration.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */