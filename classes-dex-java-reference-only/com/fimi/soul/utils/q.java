package com.fimi.soul.utils;

import android.os.Environment;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class q
{
  public static String a()
  {
    return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss", Locale.US).format(new Date());
  }
  
  public static boolean b()
  {
    return "mounted".equals(Environment.getExternalStorageState());
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/utils/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */