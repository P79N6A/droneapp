package com.facebook.common.executors;

import android.os.Handler;
import android.os.Looper;

public class UiThreadImmediateExecutorService
  extends HandlerExecutorServiceImpl
{
  private static UiThreadImmediateExecutorService sInstance = null;
  
  private UiThreadImmediateExecutorService()
  {
    super(new Handler(Looper.getMainLooper()));
  }
  
  public static UiThreadImmediateExecutorService getInstance()
  {
    if (sInstance == null) {
      sInstance = new UiThreadImmediateExecutorService();
    }
    return sInstance;
  }
  
  public void execute(Runnable paramRunnable)
  {
    if (isHandlerThread())
    {
      paramRunnable.run();
      return;
    }
    super.execute(paramRunnable);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/common/executors/UiThreadImmediateExecutorService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */