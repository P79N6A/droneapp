package com.fimi.soul.base;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.Window;
import com.fimi.kernel.d.b;
import com.fimi.kernel.utils.v;
import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.d.b;
import com.xiaomi.mistatistic.sdk.MiStatInterface;

@SuppressLint({"NewApi"})
@TargetApi(11)
public class BaseActivity
  extends BaseFimiActivity
  implements d.b
{
  public DroidPlannerApp dpa;
  public a drone;
  protected v preferencesUtil;
  public b speakTTs;
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.dpa = ((DroidPlannerApp)getApplication());
    this.drone = this.dpa.a;
    paramBundle = (ViewGroup)getWindow().getDecorView();
    this.preferencesUtil = v.a(this);
    this.speakTTs = b.a(this);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
  }
  
  public void onDroneEvent(d.a parama, a parama1) {}
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 16908332)
    {
      finish();
      return true;
    }
    return super.onOptionsItemSelected(paramMenuItem);
  }
  
  protected void onPause()
  {
    super.onPause();
    MiStatInterface.recordPageEnd();
  }
  
  protected void onResume()
  {
    super.onResume();
    if (getTitle() != null) {}
    for (String str = getTitle().toString();; str = "")
    {
      MiStatInterface.recordPageStart(this, str);
      return;
    }
  }
  
  protected void onStart()
  {
    super.onStart();
    this.drone.a(this);
  }
  
  protected void onStop()
  {
    super.onStop();
    this.drone.b(this);
  }
  
  public void setContentView(int paramInt)
  {
    setAbContentView(paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/base/BaseActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */