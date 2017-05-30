package com.fimi.soul.base;

import com.fimi.kernel.BaseApplication;
import com.fimi.soul.biz.manager.d;
import com.fimi.soul.utils.r;
import java.io.PrintStream;

public class ErrorReportApp
  extends BaseApplication
{
  private Thread.UncaughtExceptionHandler a;
  private Thread.UncaughtExceptionHandler b = new Thread.UncaughtExceptionHandler()
  {
    public void uncaughtException(Thread paramAnonymousThread, Throwable paramAnonymousThrowable)
    {
      new ErrorReportApp.a(ErrorReportApp.this, paramAnonymousThrowable).a();
      ErrorReportApp.a(ErrorReportApp.this).uncaughtException(paramAnonymousThread, paramAnonymousThrowable);
    }
  };
  
  public void onCreate()
  {
    super.onCreate();
    this.a = Thread.getDefaultUncaughtExceptionHandler();
    Thread.setDefaultUncaughtExceptionHandler(this.b);
  }
  
  class a
  {
    private Throwable b;
    
    public a(Throwable paramThrowable)
    {
      this.b = paramThrowable;
    }
    
    public void a()
    {
      try
      {
        Object localObject = new StringBuffer();
        ((StringBuffer)localObject).append(this.b.toString());
        StackTraceElement[] arrayOfStackTraceElement = this.b.getStackTrace();
        int j = arrayOfStackTraceElement.length;
        int i = 0;
        while (i < j)
        {
          StackTraceElement localStackTraceElement = arrayOfStackTraceElement[i];
          ((StringBuffer)localObject).append(", Class Name:");
          ((StringBuffer)localObject).append(localStackTraceElement.getClassName());
          ((StringBuffer)localObject).append(" , Method Name:");
          ((StringBuffer)localObject).append(localStackTraceElement.getMethodName());
          ((StringBuffer)localObject).append(" , LineNumber:");
          ((StringBuffer)localObject).append(localStackTraceElement.getLineNumber());
          i += 1;
        }
        d.a(ErrorReportApp.this.getApplicationContext()).a(((StringBuffer)localObject).toString());
        localObject = new PrintStream(r.b());
        this.b.printStackTrace((PrintStream)localObject);
        ((PrintStream)localObject).close();
        return;
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/base/ErrorReportApp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */