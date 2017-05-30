package com.fimi.soul.biz.j;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import com.fimi.soul.module.setting.FlyLogsActivity;
import com.fimi.soul.module.setting.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class h
  extends Handler
{
  private WeakReference<Activity> a;
  
  public h(Activity paramActivity)
  {
    this.a = new WeakReference(paramActivity);
  }
  
  public void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    Object localObject = (Activity)this.a.get();
    if ((localObject != null) && ((localObject instanceof FlyLogsActivity)))
    {
      localObject = (FlyLogsActivity)localObject;
      if (paramMessage.what == 10)
      {
        paramMessage = ((FlyLogsActivity)localObject).b();
        if (paramMessage != null)
        {
          ArrayList localArrayList = ((FlyLogsActivity)localObject).c();
          localArrayList.addAll((ArrayList)paramMessage.clone());
          ((FlyLogsActivity)localObject).a().a(localArrayList);
          paramMessage.clear();
        }
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/j/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */