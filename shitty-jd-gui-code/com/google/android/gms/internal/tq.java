package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.common.util.s;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@aaa
@TargetApi(14)
public class tq
  extends Thread
{
  private boolean a = false;
  private boolean b = false;
  private boolean c = false;
  private final Object d;
  private final to e;
  private final zz f;
  private final int g;
  private final int h;
  private final int i;
  private final int j;
  private final int k;
  
  public tq(to paramto, zz paramzz)
  {
    this.e = paramto;
    this.f = paramzz;
    this.d = new Object();
    this.h = ((Integer)uf.R.c()).intValue();
    this.i = ((Integer)uf.S.c()).intValue();
    this.j = ((Integer)uf.T.c()).intValue();
    this.k = ((Integer)uf.U.c()).intValue();
    this.g = ((Integer)uf.V.c()).intValue();
    setName("ContentFetchTask");
  }
  
  a a(@Nullable View paramView, tn paramtn)
  {
    int m = 0;
    if (paramView == null) {
      return new a(0, 0);
    }
    boolean bool = paramView.getGlobalVisibleRect(new Rect());
    if (((paramView instanceof TextView)) && (!(paramView instanceof EditText)))
    {
      paramView = ((TextView)paramView).getText();
      if (!TextUtils.isEmpty(paramView))
      {
        paramtn.b(paramView.toString(), bool);
        return new a(1, 0);
      }
      return new a(0, 0);
    }
    if (((paramView instanceof WebView)) && (!(paramView instanceof acy)))
    {
      paramtn.f();
      if (a((WebView)paramView, paramtn, bool)) {
        return new a(0, 1);
      }
      return new a(0, 0);
    }
    if ((paramView instanceof ViewGroup))
    {
      paramView = (ViewGroup)paramView;
      int n = 0;
      int i1 = 0;
      while (m < paramView.getChildCount())
      {
        a locala = a(paramView.getChildAt(m), paramtn);
        i1 += locala.a;
        n += locala.b;
        m += 1;
      }
      return new a(i1, n);
    }
    return new a(0, 0);
  }
  
  public void a()
  {
    synchronized (this.d)
    {
      if (this.a)
      {
        abr.a("Content hash thread already started, quiting...");
        return;
      }
      this.a = true;
      start();
      return;
    }
  }
  
  void a(@Nullable Activity paramActivity)
  {
    if (paramActivity == null) {}
    do
    {
      return;
      Object localObject2 = null;
      Object localObject1 = localObject2;
      try
      {
        if (paramActivity.getWindow() != null)
        {
          localObject1 = localObject2;
          if (paramActivity.getWindow().getDecorView() != null) {
            localObject1 = paramActivity.getWindow().getDecorView().findViewById(16908290);
          }
        }
      }
      catch (Throwable paramActivity)
      {
        for (;;)
        {
          abr.a("Failed getting root view of activity. Content not extracted.");
          localObject1 = localObject2;
        }
      }
    } while (localObject1 == null);
    a((View)localObject1);
  }
  
  void a(tn paramtn, WebView paramWebView, String paramString, boolean paramBoolean)
  {
    paramtn.e();
    try
    {
      if (!TextUtils.isEmpty(paramString))
      {
        paramString = new JSONObject(paramString).optString("text");
        if (TextUtils.isEmpty(paramWebView.getTitle())) {
          break label106;
        }
        paramWebView = String.valueOf(paramWebView.getTitle());
        paramtn.a(String.valueOf(paramWebView).length() + 1 + String.valueOf(paramString).length() + paramWebView + "\n" + paramString, paramBoolean);
      }
      while (paramtn.a())
      {
        this.e.b(paramtn);
        return;
        label106:
        paramtn.a(paramString, paramBoolean);
      }
      return;
    }
    catch (JSONException paramtn)
    {
      abr.a("Json string may be malformed.");
      return;
    }
    catch (Throwable paramtn)
    {
      abr.a("Failed to get webview content.", paramtn);
      this.f.a(paramtn, "ContentFetchTask.processWebViewContent");
    }
  }
  
  boolean a(ActivityManager.RunningAppProcessInfo paramRunningAppProcessInfo)
  {
    return paramRunningAppProcessInfo.importance == 100;
  }
  
  boolean a(Context paramContext)
  {
    paramContext = (PowerManager)paramContext.getSystemService("power");
    if (paramContext == null) {
      return false;
    }
    return paramContext.isScreenOn();
  }
  
  boolean a(@Nullable View paramView)
  {
    if (paramView == null) {
      return false;
    }
    paramView.post(new tq.1(this, paramView));
    return true;
  }
  
  @TargetApi(19)
  boolean a(WebView paramWebView, tn paramtn, boolean paramBoolean)
  {
    if (!s.h()) {
      return false;
    }
    paramtn.f();
    paramWebView.post(new tq.2(this, paramtn, paramWebView, paramBoolean));
    return true;
  }
  
  void b(View paramView)
  {
    try
    {
      tn localtn = new tn(this.h, this.i, this.j, this.k);
      paramView = a(paramView, localtn);
      localtn.g();
      if ((paramView.a == 0) && (paramView.b == 0)) {
        return;
      }
      if (((paramView.b != 0) || (localtn.i() != 0)) && ((paramView.b != 0) || (!this.e.a(localtn))))
      {
        this.e.c(localtn);
        return;
      }
    }
    catch (Exception paramView)
    {
      abr.b("Exception in fetchContentOnUIThread", paramView);
      this.f.a(paramView, "ContentFetchTask.fetchContent");
    }
  }
  
  boolean b()
  {
    try
    {
      Context localContext = u.h().b();
      if (localContext == null) {
        return false;
      }
      Object localObject = (ActivityManager)localContext.getSystemService("activity");
      KeyguardManager localKeyguardManager = (KeyguardManager)localContext.getSystemService("keyguard");
      if ((localObject != null) && (localKeyguardManager != null))
      {
        localObject = ((ActivityManager)localObject).getRunningAppProcesses();
        if (localObject == null) {
          return false;
        }
        localObject = ((List)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)((Iterator)localObject).next();
          if (Process.myPid() == localRunningAppProcessInfo.pid) {
            if ((a(localRunningAppProcessInfo)) && (!localKeyguardManager.inKeyguardRestrictedInputMode()))
            {
              boolean bool = a(localContext);
              if (bool) {
                return true;
              }
            }
          }
        }
        return false;
      }
    }
    catch (Throwable localThrowable)
    {
      return false;
    }
    return false;
  }
  
  public tn c()
  {
    return this.e.a();
  }
  
  public void d()
  {
    synchronized (this.d)
    {
      this.b = false;
      this.d.notifyAll();
      abr.a("ContentFetchThread: wakeup");
      return;
    }
  }
  
  public void e()
  {
    synchronized (this.d)
    {
      this.b = true;
      boolean bool = this.b;
      abr.a(42 + "ContentFetchThread: paused, mPause = " + bool);
      return;
    }
  }
  
  public boolean f()
  {
    return this.b;
  }
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 383	com/google/android/gms/internal/tq:b	()Z
    //   4: ifeq +102 -> 106
    //   7: invokestatic 319	com/google/android/gms/ads/internal/u:h	()Lcom/google/android/gms/internal/tp;
    //   10: invokevirtual 386	com/google/android/gms/internal/tp:a	()Landroid/app/Activity;
    //   13: astore_2
    //   14: aload_2
    //   15: ifnonnull +61 -> 76
    //   18: ldc_w 388
    //   21: invokestatic 162	com/google/android/gms/internal/abr:a	(Ljava/lang/String;)V
    //   24: aload_0
    //   25: invokevirtual 389	com/google/android/gms/internal/tq:e	()V
    //   28: aload_0
    //   29: getfield 85	com/google/android/gms/internal/tq:g	I
    //   32: sipush 1000
    //   35: imul
    //   36: i2l
    //   37: invokestatic 393	java/lang/Thread:sleep	(J)V
    //   40: aload_0
    //   41: getfield 46	com/google/android/gms/internal/tq:d	Ljava/lang/Object;
    //   44: astore_2
    //   45: aload_2
    //   46: monitorenter
    //   47: aload_0
    //   48: getfield 35	com/google/android/gms/internal/tq:b	Z
    //   51: istore_1
    //   52: iload_1
    //   53: ifeq +66 -> 119
    //   56: ldc_w 395
    //   59: invokestatic 162	com/google/android/gms/internal/abr:a	(Ljava/lang/String;)V
    //   62: aload_0
    //   63: getfield 46	com/google/android/gms/internal/tq:d	Ljava/lang/Object;
    //   66: invokevirtual 398	java/lang/Object:wait	()V
    //   69: goto -22 -> 47
    //   72: astore_3
    //   73: goto -26 -> 47
    //   76: aload_0
    //   77: aload_2
    //   78: invokevirtual 400	com/google/android/gms/internal/tq:a	(Landroid/app/Activity;)V
    //   81: goto -53 -> 28
    //   84: astore_2
    //   85: ldc_w 402
    //   88: aload_2
    //   89: invokestatic 312	com/google/android/gms/internal/abr:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   92: aload_0
    //   93: getfield 41	com/google/android/gms/internal/tq:f	Lcom/google/android/gms/internal/zz;
    //   96: aload_2
    //   97: ldc_w 404
    //   100: invokevirtual 252	com/google/android/gms/internal/zz:a	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   103: goto -63 -> 40
    //   106: ldc_w 406
    //   109: invokestatic 162	com/google/android/gms/internal/abr:a	(Ljava/lang/String;)V
    //   112: aload_0
    //   113: invokevirtual 389	com/google/android/gms/internal/tq:e	()V
    //   116: goto -88 -> 28
    //   119: aload_2
    //   120: monitorexit
    //   121: goto -121 -> 0
    //   124: astore_3
    //   125: aload_2
    //   126: monitorexit
    //   127: aload_3
    //   128: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	129	0	this	tq
    //   51	2	1	bool	boolean
    //   84	42	2	localThrowable	Throwable
    //   72	1	3	localInterruptedException	InterruptedException
    //   124	4	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   56	69	72	java/lang/InterruptedException
    //   0	14	84	java/lang/Throwable
    //   18	28	84	java/lang/Throwable
    //   28	40	84	java/lang/Throwable
    //   76	81	84	java/lang/Throwable
    //   106	116	84	java/lang/Throwable
    //   47	52	124	finally
    //   56	69	124	finally
    //   119	121	124	finally
    //   125	127	124	finally
  }
  
  @aaa
  class a
  {
    final int a;
    final int b;
    
    a(int paramInt1, int paramInt2)
    {
      this.a = paramInt1;
      this.b = paramInt2;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/tq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */