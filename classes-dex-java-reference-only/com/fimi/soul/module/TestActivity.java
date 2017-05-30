package com.fimi.soul.module;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.fimi.soul.view.EVview;
import java.util.Timer;
import java.util.TimerTask;

public class TestActivity
  extends Activity
{
  private EVview a;
  private int b = 0;
  private Handler c = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      super.handleMessage(paramAnonymousMessage);
      TestActivity.d(TestActivity.this).a(TestActivity.c(TestActivity.this));
    }
  };
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968677);
    this.a = ((EVview)findViewById(2131690140));
    new Timer().schedule(new TimerTask()
    {
      public void run()
      {
        TestActivity.a(TestActivity.this).sendEmptyMessage(0);
        TestActivity.b(TestActivity.this);
        if (TestActivity.c(TestActivity.this) == 12) {
          TestActivity.a(TestActivity.this, 0);
        }
      }
    }, 500L, 1000L);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/TestActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */