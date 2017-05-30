package com.fimi.soul.utils;

import android.app.Activity;
import android.os.Vibrator;

public class ap
{
  public static void a(Activity paramActivity, long paramLong)
  {
    ((Vibrator)paramActivity.getSystemService("vibrator")).vibrate(paramLong);
  }
  
  public static void a(Activity paramActivity, long[] paramArrayOfLong, boolean paramBoolean)
  {
    paramActivity = (Vibrator)paramActivity.getSystemService("vibrator");
    if (paramBoolean) {}
    for (int i = 1;; i = -1)
    {
      paramActivity.vibrate(paramArrayOfLong, i);
      return;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/utils/ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */