package com.google.android.gms.tagmanager;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public class TagManagerService
  extends Service
{
  @WorkerThread
  @KeepName
  public static void initialize(Context paramContext)
  {
    l.b(paramContext);
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    initialize(this);
    return l.a(this);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/tagmanager/TagManagerService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */