package com.fimi.soul.service;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiManager.MulticastLock;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import com.fimi.soul.base.a;
import com.fimi.soul.utils.ao;
import com.fimi.soul.utils.c;
import com.fimi.soul.utils.j;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Stack;

public class CameraSocketService
  extends Service
{
  public static final int a = 26112;
  public static final int b = 1200;
  public static final int c = 32;
  public static final int d = 1001;
  public static final int e = 2001;
  public static final int f = 0;
  public static final int g = 1;
  public static final int h = 2;
  public static final int i = 3;
  public static final int j = 4;
  public static final int k = 5;
  public static final int l = 7;
  public static final int m = 8;
  public static final String n = "/uDiskFile.txt";
  private static final int s = 3000;
  private static Stack<Thread> y = new Stack();
  private DataInputStream A = null;
  private DataOutputStream B = null;
  private ServerSocket C = null;
  private Handler D = new Handler();
  private b E = b.b;
  private h F = null;
  private WifiManager.MulticastLock G;
  private BroadcastReceiver H = new BroadcastReceiver()
  {
    public void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
    {
      if (("android.net.conn.CONNECTIVITY_CHANGE".equals(paramAnonymousIntent.getAction())) && (ao.b(paramAnonymousContext))) {
        CameraSocketService.b(CameraSocketService.this, false);
      }
    }
  };
  private final byte[] I = { 0, 102, 0, 0, -47, 7, 2, 0, 65, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
  private final byte[] J = new byte[65];
  private final byte[] K = { 0, 102, 1, 0, -47, 7, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
  private final byte[] L = { 0, 102, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
  private final byte[] M = { 0, 102, 1, 0, 32, 0, 32, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
  private final byte[] N = { 0, 102, 0, 0, -47, 7, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
  public c o = new c();
  private MulticastSocket p;
  private String q = "224.0.0.1";
  private InetAddress r;
  private String t = null;
  private boolean u = false;
  private boolean v = false;
  private boolean w = false;
  private String x = null;
  private Socket z = null;
  
  private void a(DataInputStream paramDataInputStream)
  {
    boolean bool = false;
    Object localObject = new byte[68];
    label164:
    for (;;)
    {
      try
      {
        long l1;
        if (paramDataInputStream.read((byte[])localObject) != -1)
        {
          l1 = c.b((byte[])localObject, 64);
          if (l1 > 0L)
          {
            localObject = new File(j.j());
            if (!((File)localObject).exists()) {
              ((File)localObject).mkdir();
            }
            localObject = j.l() + this.t;
            if (!"/uDiskFile.txt".equalsIgnoreCase(this.t)) {
              break label164;
            }
            localObject = j.j() + this.t;
          }
        }
        try
        {
          c.a(this.B, this.K);
          this.u = true;
          c.a((String)localObject, l1, paramDataInputStream, this, bool);
          this.u = false;
          return;
        }
        catch (Exception paramDataInputStream)
        {
          paramDataInputStream.printStackTrace();
          return;
        }
        bool = true;
      }
      catch (IOException paramDataInputStream)
      {
        paramDataInputStream.printStackTrace();
        return;
      }
    }
  }
  
  /* Error */
  private void a(Socket paramSocket)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 6
    //   3: sipush 1024
    //   6: newarray <illegal type>
    //   8: astore 8
    //   10: iconst_0
    //   11: istore 4
    //   13: iconst_0
    //   14: istore_2
    //   15: aload_0
    //   16: getfield 126	com/fimi/soul/service/CameraSocketService:A	Ljava/io/DataInputStream;
    //   19: ifnull +179 -> 198
    //   22: aload_0
    //   23: getfield 126	com/fimi/soul/service/CameraSocketService:A	Ljava/io/DataInputStream;
    //   26: aload 8
    //   28: invokevirtual 180	java/io/DataInputStream:read	([B)I
    //   31: iconst_m1
    //   32: if_icmpeq +166 -> 198
    //   35: aload_0
    //   36: iconst_1
    //   37: putfield 118	com/fimi/soul/service/CameraSocketService:v	Z
    //   40: iload 6
    //   42: istore 7
    //   44: iload 4
    //   46: istore 5
    //   48: iload_2
    //   49: istore_3
    //   50: sipush 26112
    //   53: aload 8
    //   55: iconst_0
    //   56: invokestatic 233	com/fimi/soul/utils/c:a	([BI)I
    //   59: if_icmpne +53 -> 112
    //   62: aload 8
    //   64: iconst_2
    //   65: invokestatic 233	com/fimi/soul/utils/c:a	([BI)I
    //   68: istore 7
    //   70: aload 8
    //   72: iconst_4
    //   73: invokestatic 233	com/fimi/soul/utils/c:a	([BI)I
    //   76: istore_3
    //   77: aload 8
    //   79: bipush 6
    //   81: invokestatic 233	com/fimi/soul/utils/c:a	([BI)I
    //   84: istore 5
    //   86: new 204	java/lang/StringBuilder
    //   89: dup
    //   90: invokespecial 205	java/lang/StringBuilder:<init>	()V
    //   93: ldc -21
    //   95: invokevirtual 211	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   98: iload_3
    //   99: invokevirtual 238	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   102: invokevirtual 214	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   105: aload_0
    //   106: invokevirtual 244	java/lang/Object:getClass	()Ljava/lang/Class;
    //   109: invokestatic 249	com/fimi/soul/base/a:a	(Ljava/lang/String;Ljava/lang/Class;)V
    //   112: iload_3
    //   113: sipush 1200
    //   116: if_icmpne +40 -> 156
    //   119: aload_0
    //   120: aload_0
    //   121: getfield 126	com/fimi/soul/service/CameraSocketService:A	Ljava/io/DataInputStream;
    //   124: invokespecial 251	com/fimi/soul/service/CameraSocketService:a	(Ljava/io/DataInputStream;)V
    //   127: iload 7
    //   129: istore 6
    //   131: iload 5
    //   133: istore 4
    //   135: iload_3
    //   136: istore_2
    //   137: goto -122 -> 15
    //   140: astore 8
    //   142: aload 8
    //   144: invokevirtual 230	java/io/IOException:printStackTrace	()V
    //   147: aload_1
    //   148: ifnull +7 -> 155
    //   151: aload_1
    //   152: invokevirtual 256	java/net/Socket:close	()V
    //   155: return
    //   156: iload 7
    //   158: istore 6
    //   160: iload 5
    //   162: istore 4
    //   164: iload_3
    //   165: istore_2
    //   166: iload_3
    //   167: sipush 2001
    //   170: if_icmpeq -155 -> 15
    //   173: iload_3
    //   174: sipush 1001
    //   177: if_icmpne +113 -> 290
    //   180: iload 7
    //   182: iconst_1
    //   183: if_icmpne +87 -> 270
    //   186: iload 5
    //   188: bipush 7
    //   190: if_icmpne +23 -> 213
    //   193: aload_0
    //   194: iconst_0
    //   195: putfield 118	com/fimi/soul/service/CameraSocketService:v	Z
    //   198: aload_1
    //   199: ifnull -44 -> 155
    //   202: aload_1
    //   203: invokevirtual 256	java/net/Socket:close	()V
    //   206: return
    //   207: astore_1
    //   208: aload_1
    //   209: invokevirtual 230	java/io/IOException:printStackTrace	()V
    //   212: return
    //   213: iload 7
    //   215: istore 6
    //   217: iload 5
    //   219: istore 4
    //   221: iload_3
    //   222: istore_2
    //   223: iload 5
    //   225: iconst_2
    //   226: if_icmpne -211 -> 15
    //   229: aload_0
    //   230: iconst_2
    //   231: iconst_1
    //   232: aload_0
    //   233: getfield 114	com/fimi/soul/service/CameraSocketService:t	Ljava/lang/String;
    //   236: invokevirtual 259	com/fimi/soul/service/CameraSocketService:a	(IZLjava/lang/String;)V
    //   239: aload_0
    //   240: aconst_null
    //   241: putfield 114	com/fimi/soul/service/CameraSocketService:t	Ljava/lang/String;
    //   244: iload 7
    //   246: istore 6
    //   248: iload 5
    //   250: istore 4
    //   252: iload_3
    //   253: istore_2
    //   254: goto -239 -> 15
    //   257: astore 8
    //   259: aload_1
    //   260: ifnull +7 -> 267
    //   263: aload_1
    //   264: invokevirtual 256	java/net/Socket:close	()V
    //   267: aload 8
    //   269: athrow
    //   270: aload_0
    //   271: iconst_2
    //   272: iconst_0
    //   273: aconst_null
    //   274: invokevirtual 259	com/fimi/soul/service/CameraSocketService:a	(IZLjava/lang/String;)V
    //   277: iload 7
    //   279: istore 6
    //   281: iload 5
    //   283: istore 4
    //   285: iload_3
    //   286: istore_2
    //   287: goto -272 -> 15
    //   290: iload 7
    //   292: istore 6
    //   294: iload 5
    //   296: istore 4
    //   298: iload_3
    //   299: istore_2
    //   300: iload_3
    //   301: bipush 32
    //   303: if_icmpne -288 -> 15
    //   306: aload_0
    //   307: iload_3
    //   308: iconst_1
    //   309: ldc_w 261
    //   312: invokevirtual 259	com/fimi/soul/service/CameraSocketService:a	(IZLjava/lang/String;)V
    //   315: iload 7
    //   317: istore 6
    //   319: iload 5
    //   321: istore 4
    //   323: iload_3
    //   324: istore_2
    //   325: goto -310 -> 15
    //   328: astore_1
    //   329: aload_1
    //   330: invokevirtual 230	java/io/IOException:printStackTrace	()V
    //   333: return
    //   334: astore_1
    //   335: aload_1
    //   336: invokevirtual 230	java/io/IOException:printStackTrace	()V
    //   339: goto -72 -> 267
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	342	0	this	CameraSocketService
    //   0	342	1	paramSocket	Socket
    //   14	311	2	i1	int
    //   49	275	3	i2	int
    //   11	311	4	i3	int
    //   46	274	5	i4	int
    //   1	317	6	i5	int
    //   42	274	7	i6	int
    //   8	70	8	arrayOfByte	byte[]
    //   140	3	8	localIOException	IOException
    //   257	11	8	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   15	40	140	java/io/IOException
    //   50	112	140	java/io/IOException
    //   119	127	140	java/io/IOException
    //   193	198	140	java/io/IOException
    //   229	244	140	java/io/IOException
    //   270	277	140	java/io/IOException
    //   306	315	140	java/io/IOException
    //   202	206	207	java/io/IOException
    //   15	40	257	finally
    //   50	112	257	finally
    //   119	127	257	finally
    //   142	147	257	finally
    //   193	198	257	finally
    //   229	244	257	finally
    //   270	277	257	finally
    //   306	315	257	finally
    //   151	155	328	java/io/IOException
    //   263	267	334	java/io/IOException
  }
  
  private void i()
  {
    try
    {
      this.p = new MulticastSocket(58880);
      this.r = InetAddress.getByName(this.q);
      this.p.joinGroup(this.r);
      Thread localThread = new Thread(new g());
      localThread.start();
      y.add(localThread);
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  private void j()
  {
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
    registerReceiver(this.H, localIntentFilter);
  }
  
  private void k()
  {
    if (!this.w) {}
    try
    {
      this.C = new ServerSocket(58885);
      new Thread(new a()).start();
      a.a("startSocketServer " + this.w, CameraSocketService.class);
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        localIOException.printStackTrace();
      }
    }
  }
  
  private void l()
  {
    c.a(this.B, this.N);
  }
  
  public void a()
  {
    if (this.v)
    {
      this.t = "/uDiskFile.txt";
      c.a(this.B, this.I);
      this.J[0] = 0;
      c.a(this.B, this.J);
      this.E = b.a;
      return;
    }
    a(7, this.v, "disConnect..");
  }
  
  public void a(final int paramInt, final boolean paramBoolean, final String paramString)
  {
    this.D.post(new Runnable()
    {
      public void run()
      {
        if (CameraSocketService.a(CameraSocketService.this) != null) {
          CameraSocketService.a(CameraSocketService.this).a(paramInt, paramBoolean, paramString);
        }
      }
    });
  }
  
  public void a(h paramh)
  {
    this.F = paramh;
    this.F.a(8, g(), "chanager state");
  }
  
  public void a(String paramString1, String paramString2)
  {
    int i1 = 0;
    if (this.E == b.b)
    {
      a(5, this.v, "error mode..");
      return;
    }
    if (this.v)
    {
      this.t = paramString1;
      c.a(this.B, this.I);
      paramString1 = new byte[65];
      paramString1[0] = 2;
      paramString2 = paramString2.getBytes();
      while (i1 < paramString2.length)
      {
        if (i1 + 1 < paramString1.length) {
          paramString1[(i1 + 1)] = paramString2[i1];
        }
        i1 += 1;
      }
      c.a(this.B, paramString1);
      return;
    }
    a(7, this.v, "disConnect..");
  }
  
  public void b()
  {
    if ((this.v) && (this.E != b.b))
    {
      c.a(this.B, this.I);
      this.J[0] = 1;
      c.a(this.B, this.J);
      this.E = b.b;
    }
    if (!this.v) {
      a(7, this.v, "disConnect..");
    }
    while (this.E != b.b) {
      return;
    }
    a(0, this.v, "Connected..");
  }
  
  public b c()
  {
    return this.E;
  }
  
  public void d()
  {
    int i1 = 0;
    a.a("stopSocketServer", CameraSocketService.class);
    if ((this.w) && (this.C != null)) {}
    try
    {
      this.w = false;
      if ((this.z != null) && (!this.z.isClosed()))
      {
        this.z.close();
        this.z = null;
      }
      if (this.B != null)
      {
        this.B.close();
        this.B = null;
      }
      this.C.close();
      this.C = null;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        int i2;
        localIOException.printStackTrace();
      }
      y.clear();
      if (!g()) {
        return;
      }
      l();
    }
    i2 = y.size();
    while (i1 < i2)
    {
      if ((y.get(i1) != null) && (!((Thread)y.get(i1)).isInterrupted())) {
        ((Thread)y.get(i1)).interrupt();
      }
      i1 += 1;
    }
  }
  
  public void e()
  {
    Thread localThread = new Thread(new e());
    localThread.start();
    y.add(localThread);
  }
  
  public String f()
  {
    return this.x;
  }
  
  public boolean g()
  {
    return this.v;
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    return this.o;
  }
  
  public void onCreate()
  {
    super.onCreate();
    a.a("onCreate", CameraSocketService.class);
    this.G = ((WifiManager)getSystemService("wifi")).createMulticastLock("multicastLock");
    k();
    i();
    j();
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    d();
    unregisterReceiver(this.H);
  }
  
  public class a
    implements Runnable
  {
    public a() {}
    
    /* Error */
    public void run()
    {
      // Byte code:
      //   0: ldc 27
      //   2: ldc 8
      //   4: invokestatic 32	com/fimi/soul/base/a:a	(Ljava/lang/String;Ljava/lang/Class;)V
      //   7: aload_0
      //   8: getfield 14	com/fimi/soul/service/CameraSocketService$a:a	Lcom/fimi/soul/service/CameraSocketService;
      //   11: invokestatic 36	com/fimi/soul/service/CameraSocketService:d	(Lcom/fimi/soul/service/CameraSocketService;)Ljava/net/ServerSocket;
      //   14: invokevirtual 42	java/net/ServerSocket:accept	()Ljava/net/Socket;
      //   17: astore_1
      //   18: aload_0
      //   19: getfield 14	com/fimi/soul/service/CameraSocketService$a:a	Lcom/fimi/soul/service/CameraSocketService;
      //   22: invokestatic 46	com/fimi/soul/service/CameraSocketService:e	(Lcom/fimi/soul/service/CameraSocketService;)Ljava/io/DataInputStream;
      //   25: ifnull +22 -> 47
      //   28: aload_0
      //   29: getfield 14	com/fimi/soul/service/CameraSocketService$a:a	Lcom/fimi/soul/service/CameraSocketService;
      //   32: invokestatic 46	com/fimi/soul/service/CameraSocketService:e	(Lcom/fimi/soul/service/CameraSocketService;)Ljava/io/DataInputStream;
      //   35: invokevirtual 51	java/io/DataInputStream:close	()V
      //   38: aload_0
      //   39: getfield 14	com/fimi/soul/service/CameraSocketService$a:a	Lcom/fimi/soul/service/CameraSocketService;
      //   42: aconst_null
      //   43: invokestatic 54	com/fimi/soul/service/CameraSocketService:a	(Lcom/fimi/soul/service/CameraSocketService;Ljava/io/DataInputStream;)Ljava/io/DataInputStream;
      //   46: pop
      //   47: aload_0
      //   48: getfield 14	com/fimi/soul/service/CameraSocketService$a:a	Lcom/fimi/soul/service/CameraSocketService;
      //   51: invokestatic 58	com/fimi/soul/service/CameraSocketService:f	(Lcom/fimi/soul/service/CameraSocketService;)Ljava/io/DataOutputStream;
      //   54: ifnull +22 -> 76
      //   57: aload_0
      //   58: getfield 14	com/fimi/soul/service/CameraSocketService$a:a	Lcom/fimi/soul/service/CameraSocketService;
      //   61: invokestatic 58	com/fimi/soul/service/CameraSocketService:f	(Lcom/fimi/soul/service/CameraSocketService;)Ljava/io/DataOutputStream;
      //   64: invokevirtual 61	java/io/DataOutputStream:close	()V
      //   67: aload_0
      //   68: getfield 14	com/fimi/soul/service/CameraSocketService$a:a	Lcom/fimi/soul/service/CameraSocketService;
      //   71: aconst_null
      //   72: invokestatic 64	com/fimi/soul/service/CameraSocketService:a	(Lcom/fimi/soul/service/CameraSocketService;Ljava/io/DataOutputStream;)Ljava/io/DataOutputStream;
      //   75: pop
      //   76: aload_0
      //   77: getfield 14	com/fimi/soul/service/CameraSocketService$a:a	Lcom/fimi/soul/service/CameraSocketService;
      //   80: invokestatic 68	com/fimi/soul/service/CameraSocketService:g	(Lcom/fimi/soul/service/CameraSocketService;)Ljava/net/Socket;
      //   83: ifnull +22 -> 105
      //   86: aload_0
      //   87: getfield 14	com/fimi/soul/service/CameraSocketService$a:a	Lcom/fimi/soul/service/CameraSocketService;
      //   90: invokestatic 68	com/fimi/soul/service/CameraSocketService:g	(Lcom/fimi/soul/service/CameraSocketService;)Ljava/net/Socket;
      //   93: invokevirtual 71	java/net/Socket:close	()V
      //   96: aload_0
      //   97: getfield 14	com/fimi/soul/service/CameraSocketService$a:a	Lcom/fimi/soul/service/CameraSocketService;
      //   100: aconst_null
      //   101: invokestatic 74	com/fimi/soul/service/CameraSocketService:a	(Lcom/fimi/soul/service/CameraSocketService;Ljava/net/Socket;)Ljava/net/Socket;
      //   104: pop
      //   105: aload_0
      //   106: getfield 14	com/fimi/soul/service/CameraSocketService$a:a	Lcom/fimi/soul/service/CameraSocketService;
      //   109: iconst_1
      //   110: invokestatic 77	com/fimi/soul/service/CameraSocketService:a	(Lcom/fimi/soul/service/CameraSocketService;Z)Z
      //   113: pop
      //   114: new 79	java/lang/Thread
      //   117: dup
      //   118: new 81	com/fimi/soul/service/CameraSocketService$d
      //   121: dup
      //   122: aload_0
      //   123: getfield 14	com/fimi/soul/service/CameraSocketService$a:a	Lcom/fimi/soul/service/CameraSocketService;
      //   126: aload_1
      //   127: invokespecial 84	com/fimi/soul/service/CameraSocketService$d:<init>	(Lcom/fimi/soul/service/CameraSocketService;Ljava/net/Socket;)V
      //   130: invokespecial 87	java/lang/Thread:<init>	(Ljava/lang/Runnable;)V
      //   133: astore_2
      //   134: aload_2
      //   135: invokevirtual 90	java/lang/Thread:start	()V
      //   138: invokestatic 94	com/fimi/soul/service/CameraSocketService:h	()Ljava/util/Stack;
      //   141: aload_2
      //   142: invokevirtual 100	java/util/Stack:add	(Ljava/lang/Object;)Z
      //   145: pop
      //   146: aload_0
      //   147: getfield 14	com/fimi/soul/service/CameraSocketService$a:a	Lcom/fimi/soul/service/CameraSocketService;
      //   150: aload_1
      //   151: invokevirtual 104	java/net/Socket:getInetAddress	()Ljava/net/InetAddress;
      //   154: invokevirtual 110	java/net/InetAddress:getHostAddress	()Ljava/lang/String;
      //   157: invokestatic 113	com/fimi/soul/service/CameraSocketService:a	(Lcom/fimi/soul/service/CameraSocketService;Ljava/lang/String;)Ljava/lang/String;
      //   160: pop
      //   161: new 115	java/lang/StringBuilder
      //   164: dup
      //   165: invokespecial 116	java/lang/StringBuilder:<init>	()V
      //   168: ldc 118
      //   170: invokevirtual 122	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   173: aload_0
      //   174: getfield 14	com/fimi/soul/service/CameraSocketService$a:a	Lcom/fimi/soul/service/CameraSocketService;
      //   177: invokestatic 125	com/fimi/soul/service/CameraSocketService:h	(Lcom/fimi/soul/service/CameraSocketService;)Ljava/lang/String;
      //   180: invokevirtual 122	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   183: invokevirtual 128	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   186: ldc 8
      //   188: invokestatic 32	com/fimi/soul/base/a:a	(Ljava/lang/String;Ljava/lang/Class;)V
      //   191: aload_0
      //   192: getfield 14	com/fimi/soul/service/CameraSocketService$a:a	Lcom/fimi/soul/service/CameraSocketService;
      //   195: invokestatic 68	com/fimi/soul/service/CameraSocketService:g	(Lcom/fimi/soul/service/CameraSocketService;)Ljava/net/Socket;
      //   198: ifnonnull +197 -> 395
      //   201: aload_0
      //   202: getfield 14	com/fimi/soul/service/CameraSocketService$a:a	Lcom/fimi/soul/service/CameraSocketService;
      //   205: invokestatic 125	com/fimi/soul/service/CameraSocketService:h	(Lcom/fimi/soul/service/CameraSocketService;)Ljava/lang/String;
      //   208: astore_1
      //   209: aload_1
      //   210: ifnull +185 -> 395
      //   213: ldc2_w 129
      //   216: invokestatic 134	java/lang/Thread:sleep	(J)V
      //   219: aload_0
      //   220: getfield 14	com/fimi/soul/service/CameraSocketService$a:a	Lcom/fimi/soul/service/CameraSocketService;
      //   223: new 70	java/net/Socket
      //   226: dup
      //   227: aload_0
      //   228: getfield 14	com/fimi/soul/service/CameraSocketService$a:a	Lcom/fimi/soul/service/CameraSocketService;
      //   231: invokestatic 125	com/fimi/soul/service/CameraSocketService:h	(Lcom/fimi/soul/service/CameraSocketService;)Ljava/lang/String;
      //   234: ldc -121
      //   236: invokespecial 138	java/net/Socket:<init>	(Ljava/lang/String;I)V
      //   239: invokestatic 74	com/fimi/soul/service/CameraSocketService:a	(Lcom/fimi/soul/service/CameraSocketService;Ljava/net/Socket;)Ljava/net/Socket;
      //   242: pop
      //   243: new 115	java/lang/StringBuilder
      //   246: dup
      //   247: invokespecial 116	java/lang/StringBuilder:<init>	()V
      //   250: ldc -116
      //   252: invokevirtual 122	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   255: aload_0
      //   256: getfield 14	com/fimi/soul/service/CameraSocketService$a:a	Lcom/fimi/soul/service/CameraSocketService;
      //   259: invokestatic 68	com/fimi/soul/service/CameraSocketService:g	(Lcom/fimi/soul/service/CameraSocketService;)Ljava/net/Socket;
      //   262: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   265: invokevirtual 128	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   268: ldc 8
      //   270: invokestatic 32	com/fimi/soul/base/a:a	(Ljava/lang/String;Ljava/lang/Class;)V
      //   273: aload_0
      //   274: getfield 14	com/fimi/soul/service/CameraSocketService$a:a	Lcom/fimi/soul/service/CameraSocketService;
      //   277: invokestatic 68	com/fimi/soul/service/CameraSocketService:g	(Lcom/fimi/soul/service/CameraSocketService;)Ljava/net/Socket;
      //   280: ifnull -89 -> 191
      //   283: aload_0
      //   284: getfield 14	com/fimi/soul/service/CameraSocketService$a:a	Lcom/fimi/soul/service/CameraSocketService;
      //   287: new 48	java/io/DataInputStream
      //   290: dup
      //   291: aload_0
      //   292: getfield 14	com/fimi/soul/service/CameraSocketService$a:a	Lcom/fimi/soul/service/CameraSocketService;
      //   295: invokestatic 68	com/fimi/soul/service/CameraSocketService:g	(Lcom/fimi/soul/service/CameraSocketService;)Ljava/net/Socket;
      //   298: invokevirtual 147	java/net/Socket:getInputStream	()Ljava/io/InputStream;
      //   301: invokespecial 150	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
      //   304: invokestatic 54	com/fimi/soul/service/CameraSocketService:a	(Lcom/fimi/soul/service/CameraSocketService;Ljava/io/DataInputStream;)Ljava/io/DataInputStream;
      //   307: pop
      //   308: aload_0
      //   309: getfield 14	com/fimi/soul/service/CameraSocketService$a:a	Lcom/fimi/soul/service/CameraSocketService;
      //   312: new 60	java/io/DataOutputStream
      //   315: dup
      //   316: aload_0
      //   317: getfield 14	com/fimi/soul/service/CameraSocketService$a:a	Lcom/fimi/soul/service/CameraSocketService;
      //   320: invokestatic 68	com/fimi/soul/service/CameraSocketService:g	(Lcom/fimi/soul/service/CameraSocketService;)Ljava/net/Socket;
      //   323: invokevirtual 154	java/net/Socket:getOutputStream	()Ljava/io/OutputStream;
      //   326: invokespecial 157	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
      //   329: invokestatic 64	com/fimi/soul/service/CameraSocketService:a	(Lcom/fimi/soul/service/CameraSocketService;Ljava/io/DataOutputStream;)Ljava/io/DataOutputStream;
      //   332: pop
      //   333: aload_0
      //   334: getfield 14	com/fimi/soul/service/CameraSocketService$a:a	Lcom/fimi/soul/service/CameraSocketService;
      //   337: iconst_1
      //   338: invokestatic 160	com/fimi/soul/service/CameraSocketService:b	(Lcom/fimi/soul/service/CameraSocketService;Z)Z
      //   341: pop
      //   342: new 79	java/lang/Thread
      //   345: dup
      //   346: new 162	com/fimi/soul/service/CameraSocketService$f
      //   349: dup
      //   350: aload_0
      //   351: getfield 14	com/fimi/soul/service/CameraSocketService$a:a	Lcom/fimi/soul/service/CameraSocketService;
      //   354: invokespecial 164	com/fimi/soul/service/CameraSocketService$f:<init>	(Lcom/fimi/soul/service/CameraSocketService;)V
      //   357: invokespecial 87	java/lang/Thread:<init>	(Ljava/lang/Runnable;)V
      //   360: astore_1
      //   361: aload_1
      //   362: invokevirtual 90	java/lang/Thread:start	()V
      //   365: invokestatic 94	com/fimi/soul/service/CameraSocketService:h	()Ljava/util/Stack;
      //   368: aload_1
      //   369: invokevirtual 100	java/util/Stack:add	(Ljava/lang/Object;)Z
      //   372: pop
      //   373: aload_0
      //   374: getfield 14	com/fimi/soul/service/CameraSocketService$a:a	Lcom/fimi/soul/service/CameraSocketService;
      //   377: iconst_0
      //   378: aload_0
      //   379: getfield 14	com/fimi/soul/service/CameraSocketService$a:a	Lcom/fimi/soul/service/CameraSocketService;
      //   382: invokestatic 168	com/fimi/soul/service/CameraSocketService:i	(Lcom/fimi/soul/service/CameraSocketService;)Z
      //   385: aload_0
      //   386: getfield 14	com/fimi/soul/service/CameraSocketService$a:a	Lcom/fimi/soul/service/CameraSocketService;
      //   389: invokestatic 125	com/fimi/soul/service/CameraSocketService:h	(Lcom/fimi/soul/service/CameraSocketService;)Ljava/lang/String;
      //   392: invokevirtual 171	com/fimi/soul/service/CameraSocketService:a	(IZLjava/lang/String;)V
      //   395: aload_0
      //   396: getfield 14	com/fimi/soul/service/CameraSocketService$a:a	Lcom/fimi/soul/service/CameraSocketService;
      //   399: invokestatic 68	com/fimi/soul/service/CameraSocketService:g	(Lcom/fimi/soul/service/CameraSocketService;)Ljava/net/Socket;
      //   402: ifnull -402 -> 0
      //   405: aload_0
      //   406: getfield 14	com/fimi/soul/service/CameraSocketService$a:a	Lcom/fimi/soul/service/CameraSocketService;
      //   409: aload_0
      //   410: getfield 14	com/fimi/soul/service/CameraSocketService$a:a	Lcom/fimi/soul/service/CameraSocketService;
      //   413: invokestatic 68	com/fimi/soul/service/CameraSocketService:g	(Lcom/fimi/soul/service/CameraSocketService;)Ljava/net/Socket;
      //   416: invokestatic 173	com/fimi/soul/service/CameraSocketService:b	(Lcom/fimi/soul/service/CameraSocketService;Ljava/net/Socket;)V
      //   419: goto -419 -> 0
      //   422: astore_1
      //   423: aload_1
      //   424: invokevirtual 176	java/io/IOException:printStackTrace	()V
      //   427: goto -427 -> 0
      //   430: astore_1
      //   431: aload_1
      //   432: invokevirtual 177	java/net/UnknownHostException:printStackTrace	()V
      //   435: goto -244 -> 191
      //   438: astore_1
      //   439: aload_1
      //   440: invokevirtual 176	java/io/IOException:printStackTrace	()V
      //   443: goto -252 -> 191
      //   446: astore_1
      //   447: aload_1
      //   448: invokevirtual 178	java/lang/InterruptedException:printStackTrace	()V
      //   451: goto -260 -> 191
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	454	0	this	a
      //   17	352	1	localObject	Object
      //   422	2	1	localIOException1	IOException
      //   430	2	1	localUnknownHostException	java.net.UnknownHostException
      //   438	2	1	localIOException2	IOException
      //   446	2	1	localInterruptedException	InterruptedException
      //   133	9	2	localThread	Thread
      // Exception table:
      //   from	to	target	type
      //   0	47	422	java/io/IOException
      //   47	76	422	java/io/IOException
      //   76	105	422	java/io/IOException
      //   105	191	422	java/io/IOException
      //   191	209	422	java/io/IOException
      //   395	419	422	java/io/IOException
      //   431	435	422	java/io/IOException
      //   439	443	422	java/io/IOException
      //   447	451	422	java/io/IOException
      //   213	395	430	java/net/UnknownHostException
      //   213	395	438	java/io/IOException
      //   213	395	446	java/lang/InterruptedException
    }
  }
  
  public static enum b
  {
    private b() {}
  }
  
  public class c
    extends Binder
  {
    public c() {}
    
    public CameraSocketService a()
    {
      return CameraSocketService.this;
    }
  }
  
  public class d
    implements Runnable
  {
    private DataInputStream b = null;
    
    public d(Socket paramSocket)
    {
      try
      {
        this.b = new DataInputStream(paramSocket.getInputStream());
        return;
      }
      catch (IOException this$1)
      {
        CameraSocketService.this.printStackTrace();
      }
    }
    
    public void run()
    {
      byte[] arrayOfByte = new byte['က'];
      try
      {
        for (;;)
        {
          int i = this.b.read(arrayOfByte);
          if (i == -1) {
            break;
          }
          String str = new String(arrayOfByte, 0, i, "UTF-8");
          if (str != null) {
            CameraSocketService.this.a(3, true, str);
          }
        }
        return;
      }
      catch (IOException localIOException)
      {
        localIOException.printStackTrace();
      }
    }
  }
  
  public class e
    implements Runnable
  {
    public e() {}
    
    public void run()
    {
      c.a(CameraSocketService.l(CameraSocketService.this));
      byte[] arrayOfByte1 = new byte[28];
      byte[] arrayOfByte2 = ao.f(CameraSocketService.this).getBytes();
      int i = 0;
      while (i < arrayOfByte2.length)
      {
        arrayOfByte1[i] = arrayOfByte2[i];
        i += 1;
      }
      arrayOfByte1[20] = 5;
      arrayOfByte1[21] = -26;
      arrayOfByte1[22] = 0;
      arrayOfByte1[23] = 0;
      arrayOfByte1[24] = 1;
      arrayOfByte1[25] = 0;
      arrayOfByte1[26] = 0;
      arrayOfByte1[27] = 0;
      c.a(arrayOfByte1);
      try
      {
        Thread.sleep(3000L);
        if (!CameraSocketService.this.g()) {
          CameraSocketService.this.a(7, CameraSocketService.i(CameraSocketService.this), "refuse connect");
        }
        return;
      }
      catch (InterruptedException localInterruptedException)
      {
        localInterruptedException.printStackTrace();
      }
    }
  }
  
  public class f
    implements Runnable
  {
    public f() {}
    
    public void run()
    {
      for (;;)
      {
        if (CameraSocketService.i(CameraSocketService.this)) {
          try
          {
            Thread.sleep(10000L);
            if (!CameraSocketService.j(CameraSocketService.this))
            {
              CameraSocketService.b(CameraSocketService.this, false);
              c.a(CameraSocketService.f(CameraSocketService.this), CameraSocketService.k(CameraSocketService.this));
            }
          }
          catch (InterruptedException localInterruptedException1)
          {
            try
            {
              Thread.sleep(3000L);
              if (!CameraSocketService.i(CameraSocketService.this))
              {
                CameraSocketService.this.a(7, true, "HEARTBEATBROADCAST disConnect....");
                CameraSocketService.this.e();
                continue;
                localInterruptedException1 = localInterruptedException1;
                localInterruptedException1.printStackTrace();
              }
            }
            catch (InterruptedException localInterruptedException2)
            {
              for (;;)
              {
                localInterruptedException2.printStackTrace();
              }
            }
          }
        }
      }
    }
  }
  
  public class g
    implements Runnable
  {
    public g() {}
    
    public void run()
    {
      byte[] arrayOfByte = new byte['Ѐ'];
      DatagramPacket localDatagramPacket = new DatagramPacket(arrayOfByte, 1024);
      try
      {
        for (;;)
        {
          CameraSocketService.b(CameraSocketService.this).acquire();
          CameraSocketService.c(CameraSocketService.this).receive(localDatagramPacket);
          String str = new String(arrayOfByte, 0, localDatagramPacket.getLength());
          CameraSocketService.this.a(-1, true, str + localDatagramPacket.getAddress().getHostAddress());
          CameraSocketService.b(CameraSocketService.this).release();
        }
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
      }
    }
  }
  
  public static abstract interface h
  {
    public abstract void a(int paramInt, boolean paramBoolean, String paramString);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/service/CameraSocketService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */