package com.android.volley;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.os.Build.VERSION;
import java.util.concurrent.BlockingQueue;

public class h
  extends Thread
{
  private final BlockingQueue<n<?>> a;
  private final g b;
  private final b c;
  private final q d;
  private volatile boolean e = false;
  
  public h(BlockingQueue<n<?>> paramBlockingQueue, g paramg, b paramb, q paramq)
  {
    this.a = paramBlockingQueue;
    this.b = paramg;
    this.c = paramb;
    this.d = paramq;
  }
  
  @TargetApi(14)
  private void a(n<?> paramn)
  {
    if (Build.VERSION.SDK_INT >= 14) {
      TrafficStats.setThreadStatsTag(paramn.d());
    }
  }
  
  private void a(n<?> paramn, u paramu)
  {
    paramu = paramn.a(paramu);
    this.d.a(paramn, paramu);
  }
  
  public void a()
  {
    this.e = true;
    interrupt();
  }
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: bipush 10
    //   2: invokestatic 80	android/os/Process:setThreadPriority	(I)V
    //   5: invokestatic 86	android/os/SystemClock:elapsedRealtime	()J
    //   8: lstore_1
    //   9: aload_0
    //   10: getfield 24	com/android/volley/h:a	Ljava/util/concurrent/BlockingQueue;
    //   13: invokeinterface 92 1 0
    //   18: checkcast 45	com/android/volley/n
    //   21: astore_3
    //   22: aload_3
    //   23: ldc 94
    //   25: invokevirtual 97	com/android/volley/n:a	(Ljava/lang/String;)V
    //   28: aload_3
    //   29: invokevirtual 101	com/android/volley/n:m	()Z
    //   32: ifeq +43 -> 75
    //   35: aload_3
    //   36: ldc 103
    //   38: invokevirtual 105	com/android/volley/n:b	(Ljava/lang/String;)V
    //   41: goto -36 -> 5
    //   44: astore 4
    //   46: aload 4
    //   48: invokestatic 86	android/os/SystemClock:elapsedRealtime	()J
    //   51: lload_1
    //   52: lsub
    //   53: invokevirtual 108	com/android/volley/u:a	(J)V
    //   56: aload_0
    //   57: aload_3
    //   58: aload 4
    //   60: invokespecial 109	com/android/volley/h:a	(Lcom/android/volley/n;Lcom/android/volley/u;)V
    //   63: goto -58 -> 5
    //   66: astore_3
    //   67: aload_0
    //   68: getfield 22	com/android/volley/h:e	Z
    //   71: ifeq -66 -> 5
    //   74: return
    //   75: aload_0
    //   76: aload_3
    //   77: invokespecial 111	com/android/volley/h:a	(Lcom/android/volley/n;)V
    //   80: aload_0
    //   81: getfield 26	com/android/volley/h:b	Lcom/android/volley/g;
    //   84: aload_3
    //   85: invokeinterface 116 2 0
    //   90: astore 4
    //   92: aload_3
    //   93: ldc 118
    //   95: invokevirtual 97	com/android/volley/n:a	(Ljava/lang/String;)V
    //   98: aload 4
    //   100: getfield 122	com/android/volley/j:d	Z
    //   103: ifeq +76 -> 179
    //   106: aload_3
    //   107: invokevirtual 125	com/android/volley/n:B	()Z
    //   110: ifeq +69 -> 179
    //   113: aload_3
    //   114: ldc 127
    //   116: invokevirtual 105	com/android/volley/n:b	(Ljava/lang/String;)V
    //   119: goto -114 -> 5
    //   122: astore 4
    //   124: aload 4
    //   126: ldc -127
    //   128: iconst_1
    //   129: anewarray 131	java/lang/Object
    //   132: dup
    //   133: iconst_0
    //   134: aload 4
    //   136: invokevirtual 135	java/lang/Exception:toString	()Ljava/lang/String;
    //   139: aastore
    //   140: invokestatic 140	com/android/volley/v:a	(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   143: new 73	com/android/volley/u
    //   146: dup
    //   147: aload 4
    //   149: invokespecial 143	com/android/volley/u:<init>	(Ljava/lang/Throwable;)V
    //   152: astore 4
    //   154: aload 4
    //   156: invokestatic 86	android/os/SystemClock:elapsedRealtime	()J
    //   159: lload_1
    //   160: lsub
    //   161: invokevirtual 108	com/android/volley/u:a	(J)V
    //   164: aload_0
    //   165: getfield 30	com/android/volley/h:d	Lcom/android/volley/q;
    //   168: aload_3
    //   169: aload 4
    //   171: invokeinterface 64 3 0
    //   176: goto -171 -> 5
    //   179: aload_3
    //   180: aload 4
    //   182: invokevirtual 146	com/android/volley/n:a	(Lcom/android/volley/j;)Lcom/android/volley/p;
    //   185: astore 4
    //   187: aload_3
    //   188: ldc -108
    //   190: invokevirtual 97	com/android/volley/n:a	(Ljava/lang/String;)V
    //   193: aload_3
    //   194: invokevirtual 151	com/android/volley/n:w	()Z
    //   197: ifeq +35 -> 232
    //   200: aload 4
    //   202: getfield 156	com/android/volley/p:b	Lcom/android/volley/b$a;
    //   205: ifnull +27 -> 232
    //   208: aload_0
    //   209: getfield 28	com/android/volley/h:c	Lcom/android/volley/b;
    //   212: aload_3
    //   213: invokevirtual 159	com/android/volley/n:j	()Ljava/lang/String;
    //   216: aload 4
    //   218: getfield 156	com/android/volley/p:b	Lcom/android/volley/b$a;
    //   221: invokeinterface 164 3 0
    //   226: aload_3
    //   227: ldc -90
    //   229: invokevirtual 97	com/android/volley/n:a	(Ljava/lang/String;)V
    //   232: aload_3
    //   233: invokevirtual 169	com/android/volley/n:A	()V
    //   236: aload_0
    //   237: getfield 30	com/android/volley/h:d	Lcom/android/volley/q;
    //   240: aload_3
    //   241: aload 4
    //   243: invokeinterface 172 3 0
    //   248: goto -243 -> 5
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	251	0	this	h
    //   8	152	1	l	long
    //   21	37	3	localn	n
    //   66	175	3	localInterruptedException	InterruptedException
    //   44	15	4	localu	u
    //   90	9	4	localj	j
    //   122	26	4	localException	Exception
    //   152	90	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   22	41	44	com/android/volley/u
    //   75	119	44	com/android/volley/u
    //   179	232	44	com/android/volley/u
    //   232	248	44	com/android/volley/u
    //   9	22	66	java/lang/InterruptedException
    //   22	41	122	java/lang/Exception
    //   75	119	122	java/lang/Exception
    //   179	232	122	java/lang/Exception
    //   232	248	122	java/lang/Exception
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/android/volley/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */