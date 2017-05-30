package com.fimi.soul.service;

import android.app.IntentService;
import android.content.Intent;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.module.update.a.a;
import com.fimi.soul.module.update.a.e;
import com.fimi.soul.module.update.a.g;

public class RequestVersionService
  extends IntentService
{
  public static final String a = "RequestVersionService";
  
  public RequestVersionService()
  {
    super("RequestVersionService");
  }
  
  public RequestVersionService(String paramString)
  {
    super(paramString);
  }
  
  protected void onHandleIntent(Intent paramIntent)
  {
    paramIntent = new g(this, ((DroidPlannerApp)getApplication()).a);
    int i = 0;
    for (;;)
    {
      if (i < 5)
      {
        paramIntent.a();
        if (a.a().a(0).b() <= 0) {}
      }
      else
      {
        return;
      }
      i += 1;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/service/RequestVersionService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */