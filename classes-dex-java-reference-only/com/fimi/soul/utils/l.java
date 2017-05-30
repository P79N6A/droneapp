package com.fimi.soul.utils;

import android.app.ProgressDialog;
import android.os.Handler;
import android.os.Message;
import java.io.PrintStream;

public class l
  implements Runnable
{
  private Handler a;
  private ProgressDialog b;
  private String c;
  
  public l(String paramString, Handler paramHandler)
  {
    this.c = paramString;
    this.a = paramHandler;
  }
  
  public void run()
  {
    System.out.println("下载线程开启");
    new Message().what = ab.a(this.c, "temp_update.apk", j.i(), this.a);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/utils/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */