package com.fimi.soul.biz.update;

import android.content.Context;
import com.fimi.kernel.c;
import com.fimi.kernel.utils.f;
import com.fimi.kernel.utils.n;
import com.fimi.kernel.utils.t;
import com.fimi.soul.biz.e.d;
import com.fimi.soul.entity.FirmwareInfo;
import com.fimi.soul.entity.UpdateVersonBean;
import com.fimi.soul.entity.UpgradeDetInfo;
import com.fimi.soul.entity.UpgradeResultInfo;
import com.fimi.soul.entity.User;
import com.fimi.soul.module.update.a.e;
import com.fimi.soul.utils.j;
import com.google.gson.Gson;
import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class l
{
  public static final String a = "/fw_upgrade/Camera_Log/";
  public static final String b = "/fw_upgrade/X6_Log/";
  public static final String c = "10010";
  public static final long d = 524288L;
  public static final String e = "sp_update_camara_version";
  public static final String f = "sp_update_x6_version";
  private static HashMap<Integer, Integer> g = null;
  
  public static long a(List<UpdateVersonBean> paramList)
  {
    paramList = paramList.iterator();
    for (long l = 0L; paramList.hasNext(); l = Long.valueOf(((UpdateVersonBean)paramList.next()).getSize()).longValue() + l) {}
    return l;
  }
  
  public static UpgradeResultInfo a(Context paramContext)
  {
    UpgradeResultInfo localUpgradeResultInfo = new UpgradeResultInfo();
    paramContext = com.fimi.soul.base.a.b(paramContext);
    if (paramContext != null) {
      localUpgradeResultInfo.setUserID(paramContext.getUserID());
    }
    paramContext = new Gson();
    c(paramContext.toJson(d()));
    localUpgradeResultInfo.setJsonStr(paramContext.toJson(d()));
    return localUpgradeResultInfo;
  }
  
  public static File a(a parama)
  {
    File localFile = null;
    if (parama == a.a) {
      localFile = new File(j.a() + "/fw_upgrade/Camera_Log/");
    }
    if (parama == a.b) {
      localFile = new File(j.a() + "/fw_upgrade/X6_Log/");
    }
    if (!localFile.exists()) {
      localFile.mkdirs();
    }
    parama = new File(localFile, f.a(new Date(), "yyyy-MM-dd") + ".txt");
    try
    {
      if ((parama.exists()) && (parama.length() > 524288L)) {
        parama.delete();
      }
      if (!parama.exists()) {
        parama.createNewFile();
      }
      return parama;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return parama;
  }
  
  public static String a(int paramInt)
  {
    if (paramInt <= 60) {}
    for (paramInt = 1;; paramInt = (int)Math.ceil(paramInt / 60.0D)) {
      return String.valueOf(paramInt);
    }
  }
  
  private static String a(com.fimi.soul.drone.e.a parama)
  {
    return "" + parama.d() + parama.e() + parama.g() + parama.f();
  }
  
  public static String a(String paramString)
  {
    return "vmlinux_" + paramString + ".bin";
  }
  
  public static String a(String paramString1, String paramString2)
  {
    return "X6E-RC-5G-" + paramString2 + "_" + paramString1 + ".bin";
  }
  
  public static HashMap<Integer, Integer> a()
  {
    if ((g == null) || (g.isEmpty()))
    {
      g = new HashMap();
      g.put(Integer.valueOf(0), Integer.valueOf(210));
      g.put(Integer.valueOf(1), Integer.valueOf(20));
      g.put(Integer.valueOf(9), Integer.valueOf(120));
      g.put(Integer.valueOf(10), Integer.valueOf(40));
      g.put(Integer.valueOf(3), Integer.valueOf(180));
      g.put(Integer.valueOf(6), Integer.valueOf(50));
      g.put(Integer.valueOf(4), Integer.valueOf(150));
      g.put(Integer.valueOf(11), Integer.valueOf(60));
      g.put(Integer.valueOf(15), Integer.valueOf(60));
      g.put(Integer.valueOf(14), Integer.valueOf(60));
      g.put(Integer.valueOf(13), Integer.valueOf(600));
      g.put(Integer.valueOf(253), Integer.valueOf(600));
      g.put(Integer.valueOf(5), Integer.valueOf(60));
    }
    return g;
  }
  
  /* Error */
  public static void a(File paramFile, String paramString)
  {
    // Byte code:
    //   0: new 224	java/io/RandomAccessFile
    //   3: dup
    //   4: aload_0
    //   5: invokevirtual 228	java/io/File:getAbsoluteFile	()Ljava/io/File;
    //   8: ldc -26
    //   10: invokespecial 231	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   13: astore_2
    //   14: aload_2
    //   15: astore_0
    //   16: aload_2
    //   17: aload_2
    //   18: invokevirtual 232	java/io/RandomAccessFile:length	()J
    //   21: invokevirtual 236	java/io/RandomAccessFile:seek	(J)V
    //   24: aload_2
    //   25: astore_0
    //   26: aload_2
    //   27: new 115	java/lang/StringBuilder
    //   30: dup
    //   31: invokespecial 116	java/lang/StringBuilder:<init>	()V
    //   34: ldc -18
    //   36: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   39: invokestatic 241	com/fimi/soul/utils/q:a	()Ljava/lang/String;
    //   42: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   45: ldc -13
    //   47: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   50: new 167	java/lang/String
    //   53: dup
    //   54: aload_1
    //   55: ldc -11
    //   57: invokevirtual 249	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   60: ldc -5
    //   62: invokespecial 254	java/lang/String:<init>	([BLjava/lang/String;)V
    //   65: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   68: invokevirtual 127	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   71: invokevirtual 257	java/io/RandomAccessFile:writeBytes	(Ljava/lang/String;)V
    //   74: aload_2
    //   75: ifnull +7 -> 82
    //   78: aload_2
    //   79: invokevirtual 260	java/io/RandomAccessFile:close	()V
    //   82: return
    //   83: astore_0
    //   84: aload_0
    //   85: invokevirtual 261	java/io/IOException:printStackTrace	()V
    //   88: return
    //   89: astore_3
    //   90: aconst_null
    //   91: astore_1
    //   92: aload_1
    //   93: astore_0
    //   94: aload_3
    //   95: invokevirtual 261	java/io/IOException:printStackTrace	()V
    //   98: aload_1
    //   99: ifnull -17 -> 82
    //   102: aload_1
    //   103: invokevirtual 260	java/io/RandomAccessFile:close	()V
    //   106: return
    //   107: astore_0
    //   108: aload_0
    //   109: invokevirtual 261	java/io/IOException:printStackTrace	()V
    //   112: return
    //   113: astore_1
    //   114: aconst_null
    //   115: astore_0
    //   116: aload_0
    //   117: ifnull +7 -> 124
    //   120: aload_0
    //   121: invokevirtual 260	java/io/RandomAccessFile:close	()V
    //   124: aload_1
    //   125: athrow
    //   126: astore_0
    //   127: aload_0
    //   128: invokevirtual 261	java/io/IOException:printStackTrace	()V
    //   131: goto -7 -> 124
    //   134: astore_1
    //   135: goto -19 -> 116
    //   138: astore_3
    //   139: aload_2
    //   140: astore_1
    //   141: goto -49 -> 92
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	144	0	paramFile	File
    //   0	144	1	paramString	String
    //   13	127	2	localRandomAccessFile	java.io.RandomAccessFile
    //   89	6	3	localIOException1	java.io.IOException
    //   138	1	3	localIOException2	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   78	82	83	java/io/IOException
    //   0	14	89	java/io/IOException
    //   102	106	107	java/io/IOException
    //   0	14	113	finally
    //   120	124	126	java/io/IOException
    //   16	24	134	finally
    //   26	74	134	finally
    //   94	98	134	finally
    //   16	24	138	java/io/IOException
    //   26	74	138	java/io/IOException
  }
  
  public static int b(int paramInt)
  {
    int i = 1;
    switch (paramInt)
    {
    default: 
      i = -1;
    case 4: 
    case 13: 
      return i;
    case 0: 
      return 8;
    case 1: 
      return 11;
    case 11: 
      return 12;
    case 6: 
      return 4;
    case 3: 
      return 3;
    case 9: 
      return 5;
    case 10: 
      return 6;
    case 15: 
      return 13;
    case 14: 
      return 10;
    case 253: 
      return 7;
    }
    return 9;
  }
  
  public static long b(List<FirmwareInfo> paramList)
  {
    paramList = paramList.iterator();
    for (long l = 0L; paramList.hasNext(); l = ((FirmwareInfo)paramList.next()).getFileSize() + l) {}
    return l;
  }
  
  public static String b()
  {
    List localList = com.fimi.soul.module.update.a.a.a().e();
    if ((localList != null) && (localList.size() > 0)) {
      return String.valueOf(t.a(a(localList) / 1024.0D / 1024.0D, 2));
    }
    return null;
  }
  
  public static String b(String paramString1, String paramString2)
  {
    return "X6E-DR-5G-" + paramString2 + "_" + paramString1 + ".bin";
  }
  
  public static void b(String paramString)
  {
    a(a(a.b), paramString);
  }
  
  public static int c(int paramInt)
  {
    int i;
    if (paramInt == 17) {
      i = 0;
    }
    do
    {
      return i;
      if (paramInt == 16) {
        return 1;
      }
      if (paramInt == 12) {
        return 3;
      }
      if (paramInt == 18) {
        return 10;
      }
      if (paramInt == 19) {
        return 9;
      }
      if (paramInt == 20) {
        return 6;
      }
      i = paramInt;
    } while (paramInt != 23);
    return 5;
  }
  
  public static String c()
  {
    List localList = com.fimi.soul.module.update.a.a.a().d();
    if ((localList != null) && (localList.size() > 0)) {
      return String.valueOf(t.a(b(localList) / 1024.0D / 1024.0D, 2));
    }
    return null;
  }
  
  public static void c(String paramString)
  {
    a(a(a.a), paramString);
  }
  
  public static UpgradeDetInfo d()
  {
    UpgradeDetInfo localUpgradeDetInfo = new UpgradeDetInfo();
    Object localObject = com.fimi.soul.module.update.a.a.a();
    if (localObject == null) {
      return localUpgradeDetInfo;
    }
    e locale = ((com.fimi.soul.module.update.a.a)localObject).a(0);
    localUpgradeDetInfo.setFcHwVersion(locale.c());
    localUpgradeDetInfo.setFcID(locale.i());
    localUpgradeDetInfo.setFcSwVersion(locale.b() + "");
    locale = ((com.fimi.soul.module.update.a.a)localObject).a(1);
    localUpgradeDetInfo.setRcHwVersion(locale.c());
    localUpgradeDetInfo.setRcSwVersion(locale.b() + "");
    localUpgradeDetInfo.setRcID(locale.i());
    locale = ((com.fimi.soul.module.update.a.a)localObject).a(10);
    localUpgradeDetInfo.setNoFlyHwVersion(locale.c());
    localUpgradeDetInfo.setNoFlySwVersion(locale.b() + "");
    localUpgradeDetInfo.setNoFlyID(locale.i());
    locale = ((com.fimi.soul.module.update.a.a)localObject).a(3);
    localUpgradeDetInfo.setGcHwVersion(locale.c());
    localUpgradeDetInfo.setGcSwVersion(locale.b() + "");
    localUpgradeDetInfo.setGcID(locale.i());
    locale = ((com.fimi.soul.module.update.a.a)localObject).a(9);
    localUpgradeDetInfo.setX2HwVersion(locale.c());
    localUpgradeDetInfo.setX2SwVersion(locale.b() + "");
    localUpgradeDetInfo.setX2ID(locale.i());
    locale = ((com.fimi.soul.module.update.a.a)localObject).a(6);
    localUpgradeDetInfo.setServoHwVersion(locale.c());
    localUpgradeDetInfo.setServoSwVersion(locale.b() + "");
    localUpgradeDetInfo.setServoID(locale.i());
    locale = ((com.fimi.soul.module.update.a.a)localObject).a(4);
    localUpgradeDetInfo.setX1HwVersion(locale.c());
    localUpgradeDetInfo.setX1SwVersion(locale.b() + "");
    localUpgradeDetInfo.setX1ID(locale.i());
    localObject = ((com.fimi.soul.module.update.a.a)localObject).a(4);
    localUpgradeDetInfo.setX6HwVersion(((e)localObject).c());
    localUpgradeDetInfo.setX6SwVersion(((e)localObject).b() + "");
    localUpgradeDetInfo.setX6ID(((e)localObject).i());
    return localUpgradeDetInfo;
  }
  
  public static void d(String paramString)
  {
    c.c().a("sp_update_x6_version", paramString);
  }
  
  public static boolean d(int paramInt)
  {
    return (paramInt == 199) || (paramInt == 201) || (paramInt == 202) || (paramInt == 203) || (paramInt == 204) || (paramInt == 106) || (paramInt == 193);
  }
  
  public static void e()
  {
    d(null);
    e(null);
  }
  
  public static void e(String paramString)
  {
    c.c().a("sp_update_camara_version", paramString);
  }
  
  public static String f()
  {
    String str = c.c().a("sp_camera_version");
    if (str != null) {
      return String.valueOf(n.n(str));
    }
    return "";
  }
  
  public static String g()
  {
    String str = d.a().d();
    int i = -1;
    if (str != null) {
      i = Integer.valueOf(n.n(str)).intValue();
    }
    return String.valueOf(i);
  }
  
  public static enum a
  {
    private a() {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/update/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */