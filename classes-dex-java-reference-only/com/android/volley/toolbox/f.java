package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.b;
import com.android.volley.b.a;
import com.android.volley.v;
import java.io.EOFException;
import java.io.File;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class f
  implements b
{
  private static final int e = 5242880;
  private static final float f = 0.9F;
  private static final int g = 538247942;
  private final Map<String, a> a = new LinkedHashMap(16, 0.75F, true);
  private long b = 0L;
  private final File c;
  private final int d;
  
  public f(File paramFile)
  {
    this(paramFile, 5242880);
  }
  
  public f(File paramFile, int paramInt)
  {
    this.c = paramFile;
    this.d = paramInt;
  }
  
  static int a(InputStream paramInputStream)
  {
    return 0x0 | e(paramInputStream) << 0 | e(paramInputStream) << 8 | e(paramInputStream) << 16 | e(paramInputStream) << 24;
  }
  
  private void a(int paramInt)
  {
    if (this.b + paramInt < this.d) {}
    label119:
    label229:
    label233:
    for (;;)
    {
      return;
      if (v.b) {
        v.a("Pruning old cache entries.", new Object[0]);
      }
      long l1 = this.b;
      long l2 = SystemClock.elapsedRealtime();
      Iterator localIterator = this.a.entrySet().iterator();
      int i = 0;
      a locala;
      if (localIterator.hasNext())
      {
        locala = (a)((Map.Entry)localIterator.next()).getValue();
        if (c(locala.b).delete())
        {
          this.b -= locala.a;
          localIterator.remove();
          i += 1;
          if ((float)(this.b + paramInt) >= this.d * 0.9F) {
            break label229;
          }
        }
      }
      for (;;)
      {
        if (!v.b) {
          break label233;
        }
        v.a("pruned %d files, %d bytes, %d ms", new Object[] { Integer.valueOf(i), Long.valueOf(this.b - l1), Long.valueOf(SystemClock.elapsedRealtime() - l2) });
        return;
        v.b("Could not delete cache entry for key=%s, filename=%s", new Object[] { locala.b, d(locala.b) });
        break label119;
        break;
      }
    }
  }
  
  static void a(OutputStream paramOutputStream, int paramInt)
  {
    paramOutputStream.write(paramInt >> 0 & 0xFF);
    paramOutputStream.write(paramInt >> 8 & 0xFF);
    paramOutputStream.write(paramInt >> 16 & 0xFF);
    paramOutputStream.write(paramInt >> 24 & 0xFF);
  }
  
  static void a(OutputStream paramOutputStream, long paramLong)
  {
    paramOutputStream.write((byte)(int)(paramLong >>> 0));
    paramOutputStream.write((byte)(int)(paramLong >>> 8));
    paramOutputStream.write((byte)(int)(paramLong >>> 16));
    paramOutputStream.write((byte)(int)(paramLong >>> 24));
    paramOutputStream.write((byte)(int)(paramLong >>> 32));
    paramOutputStream.write((byte)(int)(paramLong >>> 40));
    paramOutputStream.write((byte)(int)(paramLong >>> 48));
    paramOutputStream.write((byte)(int)(paramLong >>> 56));
  }
  
  static void a(OutputStream paramOutputStream, String paramString)
  {
    paramString = paramString.getBytes("UTF-8");
    a(paramOutputStream, paramString.length);
    paramOutputStream.write(paramString, 0, paramString.length);
  }
  
  private void a(String paramString, a parama)
  {
    if (!this.a.containsKey(paramString)) {}
    a locala;
    long l;
    for (this.b += parama.a;; this.b = (parama.a - locala.a + l))
    {
      this.a.put(paramString, parama);
      return;
      locala = (a)this.a.get(paramString);
      l = this.b;
    }
  }
  
  static void a(Map<String, String> paramMap, OutputStream paramOutputStream)
  {
    if (paramMap != null)
    {
      a(paramOutputStream, paramMap.size());
      paramMap = paramMap.entrySet().iterator();
      while (paramMap.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramMap.next();
        a(paramOutputStream, (String)localEntry.getKey());
        a(paramOutputStream, (String)localEntry.getValue());
      }
    }
    a(paramOutputStream, 0);
  }
  
  private static byte[] a(InputStream paramInputStream, int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    int i = 0;
    while (i < paramInt)
    {
      int j = paramInputStream.read(arrayOfByte, i, paramInt - i);
      if (j == -1) {
        break;
      }
      i += j;
    }
    if (i != paramInt) {
      throw new IOException("Expected " + paramInt + " bytes, read " + i + " bytes");
    }
    return arrayOfByte;
  }
  
  static long b(InputStream paramInputStream)
  {
    return 0L | (e(paramInputStream) & 0xFF) << 0 | (e(paramInputStream) & 0xFF) << 8 | (e(paramInputStream) & 0xFF) << 16 | (e(paramInputStream) & 0xFF) << 24 | (e(paramInputStream) & 0xFF) << 32 | (e(paramInputStream) & 0xFF) << 40 | (e(paramInputStream) & 0xFF) << 48 | (e(paramInputStream) & 0xFF) << 56;
  }
  
  static String c(InputStream paramInputStream)
  {
    return new String(a(paramInputStream, (int)b(paramInputStream)), "UTF-8");
  }
  
  private String d(String paramString)
  {
    int i = paramString.length() / 2;
    int j = paramString.substring(0, i).hashCode();
    return String.valueOf(j) + String.valueOf(paramString.substring(i).hashCode());
  }
  
  static Map<String, String> d(InputStream paramInputStream)
  {
    int j = a(paramInputStream);
    if (j == 0) {}
    for (Object localObject = Collections.emptyMap();; localObject = new HashMap(j))
    {
      int i = 0;
      while (i < j)
      {
        ((Map)localObject).put(c(paramInputStream).intern(), c(paramInputStream).intern());
        i += 1;
      }
    }
    return (Map<String, String>)localObject;
  }
  
  private static int e(InputStream paramInputStream)
  {
    int i = paramInputStream.read();
    if (i == -1) {
      throw new EOFException();
    }
    return i;
  }
  
  private void e(String paramString)
  {
    a locala = (a)this.a.get(paramString);
    if (locala != null)
    {
      this.b -= locala.a;
      this.a.remove(paramString);
    }
  }
  
  /* Error */
  public b.a a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 45	com/android/volley/toolbox/f:a	Ljava/util/Map;
    //   6: aload_1
    //   7: invokeinterface 168 2 0
    //   12: checkcast 10	com/android/volley/toolbox/f$a
    //   15: astore 4
    //   17: aload 4
    //   19: ifnonnull +9 -> 28
    //   22: aconst_null
    //   23: astore_1
    //   24: aload_0
    //   25: monitorexit
    //   26: aload_1
    //   27: areturn
    //   28: aload_0
    //   29: aload_1
    //   30: invokevirtual 104	com/android/volley/toolbox/f:c	(Ljava/lang/String;)Ljava/io/File;
    //   33: astore 5
    //   35: new 13	com/android/volley/toolbox/f$b
    //   38: dup
    //   39: new 271	java/io/BufferedInputStream
    //   42: dup
    //   43: new 273	java/io/FileInputStream
    //   46: dup
    //   47: aload 5
    //   49: invokespecial 275	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   52: invokespecial 278	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   55: aconst_null
    //   56: invokespecial 281	com/android/volley/toolbox/f$b:<init>	(Ljava/io/InputStream;Lcom/android/volley/toolbox/f$1;)V
    //   59: astore_3
    //   60: aload_3
    //   61: astore_2
    //   62: aload_3
    //   63: invokestatic 284	com/android/volley/toolbox/f$a:a	(Ljava/io/InputStream;)Lcom/android/volley/toolbox/f$a;
    //   66: pop
    //   67: aload_3
    //   68: astore_2
    //   69: aload 4
    //   71: aload_3
    //   72: aload 5
    //   74: invokevirtual 286	java/io/File:length	()J
    //   77: aload_3
    //   78: invokestatic 289	com/android/volley/toolbox/f$b:a	(Lcom/android/volley/toolbox/f$b;)I
    //   81: i2l
    //   82: lsub
    //   83: l2i
    //   84: invokestatic 222	com/android/volley/toolbox/f:a	(Ljava/io/InputStream;I)[B
    //   87: invokevirtual 292	com/android/volley/toolbox/f$a:a	([B)Lcom/android/volley/b$a;
    //   90: astore 4
    //   92: aload 4
    //   94: astore_2
    //   95: aload_2
    //   96: astore_1
    //   97: aload_3
    //   98: ifnull -74 -> 24
    //   101: aload_3
    //   102: invokevirtual 295	com/android/volley/toolbox/f$b:close	()V
    //   105: aload_2
    //   106: astore_1
    //   107: goto -83 -> 24
    //   110: astore_1
    //   111: aconst_null
    //   112: astore_1
    //   113: goto -89 -> 24
    //   116: astore 4
    //   118: aconst_null
    //   119: astore_3
    //   120: aload_3
    //   121: astore_2
    //   122: ldc_w 297
    //   125: iconst_2
    //   126: anewarray 4	java/lang/Object
    //   129: dup
    //   130: iconst_0
    //   131: aload 5
    //   133: invokevirtual 300	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   136: aastore
    //   137: dup
    //   138: iconst_1
    //   139: aload 4
    //   141: invokevirtual 301	java/io/IOException:toString	()Ljava/lang/String;
    //   144: aastore
    //   145: invokestatic 134	com/android/volley/v:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   148: aload_3
    //   149: astore_2
    //   150: aload_0
    //   151: aload_1
    //   152: invokevirtual 303	com/android/volley/toolbox/f:b	(Ljava/lang/String;)V
    //   155: aload_3
    //   156: ifnull +7 -> 163
    //   159: aload_3
    //   160: invokevirtual 295	com/android/volley/toolbox/f$b:close	()V
    //   163: aconst_null
    //   164: astore_1
    //   165: goto -141 -> 24
    //   168: astore_1
    //   169: aconst_null
    //   170: astore_1
    //   171: goto -147 -> 24
    //   174: astore 4
    //   176: aconst_null
    //   177: astore_3
    //   178: aload_3
    //   179: astore_2
    //   180: ldc_w 297
    //   183: iconst_2
    //   184: anewarray 4	java/lang/Object
    //   187: dup
    //   188: iconst_0
    //   189: aload 5
    //   191: invokevirtual 300	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   194: aastore
    //   195: dup
    //   196: iconst_1
    //   197: aload 4
    //   199: invokevirtual 304	java/lang/NegativeArraySizeException:toString	()Ljava/lang/String;
    //   202: aastore
    //   203: invokestatic 134	com/android/volley/v:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   206: aload_3
    //   207: astore_2
    //   208: aload_0
    //   209: aload_1
    //   210: invokevirtual 303	com/android/volley/toolbox/f:b	(Ljava/lang/String;)V
    //   213: aload_3
    //   214: ifnull +7 -> 221
    //   217: aload_3
    //   218: invokevirtual 295	com/android/volley/toolbox/f$b:close	()V
    //   221: aconst_null
    //   222: astore_1
    //   223: goto -199 -> 24
    //   226: astore_1
    //   227: aconst_null
    //   228: astore_1
    //   229: goto -205 -> 24
    //   232: astore_1
    //   233: aconst_null
    //   234: astore_2
    //   235: aload_2
    //   236: ifnull +7 -> 243
    //   239: aload_2
    //   240: invokevirtual 295	com/android/volley/toolbox/f$b:close	()V
    //   243: aload_1
    //   244: athrow
    //   245: astore_1
    //   246: aload_0
    //   247: monitorexit
    //   248: aload_1
    //   249: athrow
    //   250: astore_1
    //   251: aconst_null
    //   252: astore_1
    //   253: goto -229 -> 24
    //   256: astore_1
    //   257: goto -22 -> 235
    //   260: astore 4
    //   262: goto -84 -> 178
    //   265: astore 4
    //   267: goto -147 -> 120
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	270	0	this	f
    //   0	270	1	paramString	String
    //   61	179	2	localObject1	Object
    //   59	159	3	localb	b
    //   15	78	4	localObject2	Object
    //   116	24	4	localIOException1	IOException
    //   174	24	4	localNegativeArraySizeException1	NegativeArraySizeException
    //   260	1	4	localNegativeArraySizeException2	NegativeArraySizeException
    //   265	1	4	localIOException2	IOException
    //   33	157	5	localFile	File
    // Exception table:
    //   from	to	target	type
    //   101	105	110	java/io/IOException
    //   35	60	116	java/io/IOException
    //   159	163	168	java/io/IOException
    //   35	60	174	java/lang/NegativeArraySizeException
    //   217	221	226	java/io/IOException
    //   35	60	232	finally
    //   2	17	245	finally
    //   28	35	245	finally
    //   101	105	245	finally
    //   159	163	245	finally
    //   217	221	245	finally
    //   239	243	245	finally
    //   243	245	245	finally
    //   239	243	250	java/io/IOException
    //   62	67	256	finally
    //   69	92	256	finally
    //   122	148	256	finally
    //   150	155	256	finally
    //   180	206	256	finally
    //   208	213	256	finally
    //   62	67	260	java/lang/NegativeArraySizeException
    //   69	92	260	java/lang/NegativeArraySizeException
    //   62	67	265	java/io/IOException
    //   69	92	265	java/io/IOException
  }
  
  /* Error */
  public void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 49	com/android/volley/toolbox/f:c	Ljava/io/File;
    //   6: invokevirtual 307	java/io/File:exists	()Z
    //   9: ifne +36 -> 45
    //   12: aload_0
    //   13: getfield 49	com/android/volley/toolbox/f:c	Ljava/io/File;
    //   16: invokevirtual 310	java/io/File:mkdirs	()Z
    //   19: ifne +23 -> 42
    //   22: ldc_w 312
    //   25: iconst_1
    //   26: anewarray 4	java/lang/Object
    //   29: dup
    //   30: iconst_0
    //   31: aload_0
    //   32: getfield 49	com/android/volley/toolbox/f:c	Ljava/io/File;
    //   35: invokevirtual 300	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   38: aastore
    //   39: invokestatic 314	com/android/volley/v:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   42: aload_0
    //   43: monitorexit
    //   44: return
    //   45: aload_0
    //   46: getfield 49	com/android/volley/toolbox/f:c	Ljava/io/File;
    //   49: invokevirtual 318	java/io/File:listFiles	()[Ljava/io/File;
    //   52: astore 5
    //   54: aload 5
    //   56: ifnull -14 -> 42
    //   59: aload 5
    //   61: arraylength
    //   62: istore_2
    //   63: iconst_0
    //   64: istore_1
    //   65: iload_1
    //   66: iload_2
    //   67: if_icmpge -25 -> 42
    //   70: aload 5
    //   72: iload_1
    //   73: aaload
    //   74: astore 6
    //   76: aconst_null
    //   77: astore_3
    //   78: new 271	java/io/BufferedInputStream
    //   81: dup
    //   82: new 273	java/io/FileInputStream
    //   85: dup
    //   86: aload 6
    //   88: invokespecial 275	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   91: invokespecial 278	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   94: astore 4
    //   96: aload 4
    //   98: astore_3
    //   99: aload 4
    //   101: invokestatic 284	com/android/volley/toolbox/f$a:a	(Ljava/io/InputStream;)Lcom/android/volley/toolbox/f$a;
    //   104: astore 7
    //   106: aload 4
    //   108: astore_3
    //   109: aload 7
    //   111: aload 6
    //   113: invokevirtual 286	java/io/File:length	()J
    //   116: putfield 111	com/android/volley/toolbox/f$a:a	J
    //   119: aload 4
    //   121: astore_3
    //   122: aload_0
    //   123: aload 7
    //   125: getfield 101	com/android/volley/toolbox/f$a:b	Ljava/lang/String;
    //   128: aload 7
    //   130: invokespecial 320	com/android/volley/toolbox/f:a	(Ljava/lang/String;Lcom/android/volley/toolbox/f$a;)V
    //   133: aload 4
    //   135: ifnull +8 -> 143
    //   138: aload 4
    //   140: invokevirtual 321	java/io/BufferedInputStream:close	()V
    //   143: iload_1
    //   144: iconst_1
    //   145: iadd
    //   146: istore_1
    //   147: goto -82 -> 65
    //   150: astore_3
    //   151: aconst_null
    //   152: astore 4
    //   154: aload 6
    //   156: ifnull +12 -> 168
    //   159: aload 4
    //   161: astore_3
    //   162: aload 6
    //   164: invokevirtual 109	java/io/File:delete	()Z
    //   167: pop
    //   168: aload 4
    //   170: ifnull -27 -> 143
    //   173: aload 4
    //   175: invokevirtual 321	java/io/BufferedInputStream:close	()V
    //   178: goto -35 -> 143
    //   181: astore_3
    //   182: goto -39 -> 143
    //   185: astore 5
    //   187: aload_3
    //   188: astore 4
    //   190: aload 5
    //   192: astore_3
    //   193: aload 4
    //   195: ifnull +8 -> 203
    //   198: aload 4
    //   200: invokevirtual 321	java/io/BufferedInputStream:close	()V
    //   203: aload_3
    //   204: athrow
    //   205: astore_3
    //   206: aload_0
    //   207: monitorexit
    //   208: aload_3
    //   209: athrow
    //   210: astore_3
    //   211: goto -68 -> 143
    //   214: astore 4
    //   216: goto -13 -> 203
    //   219: astore 5
    //   221: aload_3
    //   222: astore 4
    //   224: aload 5
    //   226: astore_3
    //   227: goto -34 -> 193
    //   230: astore_3
    //   231: goto -77 -> 154
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	234	0	this	f
    //   64	83	1	i	int
    //   62	6	2	j	int
    //   77	45	3	localObject1	Object
    //   150	1	3	localIOException1	IOException
    //   161	1	3	localObject2	Object
    //   181	7	3	localIOException2	IOException
    //   192	12	3	localObject3	Object
    //   205	4	3	localObject4	Object
    //   210	12	3	localIOException3	IOException
    //   226	1	3	localObject5	Object
    //   230	1	3	localIOException4	IOException
    //   94	105	4	localObject6	Object
    //   214	1	4	localIOException5	IOException
    //   222	1	4	localIOException6	IOException
    //   52	19	5	arrayOfFile	File[]
    //   185	6	5	localObject7	Object
    //   219	6	5	localObject8	Object
    //   74	89	6	localFile	File
    //   104	25	7	locala	a
    // Exception table:
    //   from	to	target	type
    //   78	96	150	java/io/IOException
    //   173	178	181	java/io/IOException
    //   78	96	185	finally
    //   2	42	205	finally
    //   45	54	205	finally
    //   59	63	205	finally
    //   138	143	205	finally
    //   173	178	205	finally
    //   198	203	205	finally
    //   203	205	205	finally
    //   138	143	210	java/io/IOException
    //   198	203	214	java/io/IOException
    //   99	106	219	finally
    //   109	119	219	finally
    //   122	133	219	finally
    //   162	168	219	finally
    //   99	106	230	java/io/IOException
    //   109	119	230	java/io/IOException
    //   122	133	230	java/io/IOException
  }
  
  /* Error */
  public void a(String paramString, b.a parama)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_2
    //   4: getfield 327	com/android/volley/b$a:a	[B
    //   7: arraylength
    //   8: invokespecial 329	com/android/volley/toolbox/f:a	(I)V
    //   11: aload_0
    //   12: aload_1
    //   13: invokevirtual 104	com/android/volley/toolbox/f:c	(Ljava/lang/String;)Ljava/io/File;
    //   16: astore_3
    //   17: new 331	java/io/BufferedOutputStream
    //   20: dup
    //   21: new 333	java/io/FileOutputStream
    //   24: dup
    //   25: aload_3
    //   26: invokespecial 334	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   29: invokespecial 337	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   32: astore 4
    //   34: new 10	com/android/volley/toolbox/f$a
    //   37: dup
    //   38: aload_1
    //   39: aload_2
    //   40: invokespecial 339	com/android/volley/toolbox/f$a:<init>	(Ljava/lang/String;Lcom/android/volley/b$a;)V
    //   43: astore 5
    //   45: aload 5
    //   47: aload 4
    //   49: invokevirtual 342	com/android/volley/toolbox/f$a:a	(Ljava/io/OutputStream;)Z
    //   52: ifne +61 -> 113
    //   55: aload 4
    //   57: invokevirtual 343	java/io/BufferedOutputStream:close	()V
    //   60: ldc_w 345
    //   63: iconst_1
    //   64: anewarray 4	java/lang/Object
    //   67: dup
    //   68: iconst_0
    //   69: aload_3
    //   70: invokevirtual 300	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   73: aastore
    //   74: invokestatic 134	com/android/volley/v:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   77: new 191	java/io/IOException
    //   80: dup
    //   81: invokespecial 346	java/io/IOException:<init>	()V
    //   84: athrow
    //   85: astore_1
    //   86: aload_3
    //   87: invokevirtual 109	java/io/File:delete	()Z
    //   90: ifne +20 -> 110
    //   93: ldc_w 348
    //   96: iconst_1
    //   97: anewarray 4	java/lang/Object
    //   100: dup
    //   101: iconst_0
    //   102: aload_3
    //   103: invokevirtual 300	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   106: aastore
    //   107: invokestatic 134	com/android/volley/v:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   110: aload_0
    //   111: monitorexit
    //   112: return
    //   113: aload 4
    //   115: aload_2
    //   116: getfield 327	com/android/volley/b$a:a	[B
    //   119: invokevirtual 351	java/io/BufferedOutputStream:write	([B)V
    //   122: aload 4
    //   124: invokevirtual 343	java/io/BufferedOutputStream:close	()V
    //   127: aload_0
    //   128: aload_1
    //   129: aload 5
    //   131: invokespecial 320	com/android/volley/toolbox/f:a	(Ljava/lang/String;Lcom/android/volley/toolbox/f$a;)V
    //   134: goto -24 -> 110
    //   137: astore_1
    //   138: aload_0
    //   139: monitorexit
    //   140: aload_1
    //   141: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	142	0	this	f
    //   0	142	1	paramString	String
    //   0	142	2	parama	b.a
    //   16	87	3	localFile	File
    //   32	91	4	localBufferedOutputStream	java.io.BufferedOutputStream
    //   43	87	5	locala	a
    // Exception table:
    //   from	to	target	type
    //   17	85	85	java/io/IOException
    //   113	134	85	java/io/IOException
    //   2	17	137	finally
    //   17	85	137	finally
    //   86	110	137	finally
    //   113	134	137	finally
  }
  
  public void a(String paramString, boolean paramBoolean)
  {
    try
    {
      b.a locala = a(paramString);
      if (locala != null)
      {
        locala.f = 0L;
        if (paramBoolean) {
          locala.e = 0L;
        }
        a(paramString, locala);
      }
      return;
    }
    finally {}
  }
  
  public void b()
  {
    int i = 0;
    try
    {
      File[] arrayOfFile = this.c.listFiles();
      if (arrayOfFile != null)
      {
        int j = arrayOfFile.length;
        while (i < j)
        {
          arrayOfFile[i].delete();
          i += 1;
        }
      }
      this.a.clear();
      this.b = 0L;
      v.b("Cache cleared.", new Object[0]);
      return;
    }
    finally {}
  }
  
  public void b(String paramString)
  {
    try
    {
      boolean bool = c(paramString).delete();
      e(paramString);
      if (!bool) {
        v.b("Could not delete cache entry for key=%s, filename=%s", new Object[] { paramString, d(paramString) });
      }
      return;
    }
    finally {}
  }
  
  public File c(String paramString)
  {
    return new File(this.c, d(paramString));
  }
  
  static class a
  {
    public long a;
    public String b;
    public String c;
    public long d;
    public long e;
    public long f;
    public long g;
    public Map<String, String> h;
    
    private a() {}
    
    public a(String paramString, b.a parama)
    {
      this.b = paramString;
      this.a = parama.a.length;
      this.c = parama.b;
      this.d = parama.c;
      this.e = parama.d;
      this.f = parama.e;
      this.g = parama.f;
      this.h = parama.g;
    }
    
    public static a a(InputStream paramInputStream)
    {
      a locala = new a();
      if (f.a(paramInputStream) != 538247942) {
        throw new IOException();
      }
      locala.b = f.c(paramInputStream);
      locala.c = f.c(paramInputStream);
      if (locala.c.equals("")) {
        locala.c = null;
      }
      locala.d = f.b(paramInputStream);
      locala.e = f.b(paramInputStream);
      locala.f = f.b(paramInputStream);
      locala.g = f.b(paramInputStream);
      locala.h = f.d(paramInputStream);
      return locala;
    }
    
    public b.a a(byte[] paramArrayOfByte)
    {
      b.a locala = new b.a();
      locala.a = paramArrayOfByte;
      locala.b = this.c;
      locala.c = this.d;
      locala.d = this.e;
      locala.e = this.f;
      locala.f = this.g;
      locala.g = this.h;
      return locala;
    }
    
    public boolean a(OutputStream paramOutputStream)
    {
      try
      {
        f.a(paramOutputStream, 538247942);
        f.a(paramOutputStream, this.b);
        if (this.c == null) {}
        for (String str = "";; str = this.c)
        {
          f.a(paramOutputStream, str);
          f.a(paramOutputStream, this.d);
          f.a(paramOutputStream, this.e);
          f.a(paramOutputStream, this.f);
          f.a(paramOutputStream, this.g);
          f.a(this.h, paramOutputStream);
          paramOutputStream.flush();
          return true;
        }
        return false;
      }
      catch (IOException paramOutputStream)
      {
        v.b("%s", new Object[] { paramOutputStream.toString() });
      }
    }
  }
  
  private static class b
    extends FilterInputStream
  {
    private int a = 0;
    
    private b(InputStream paramInputStream)
    {
      super();
    }
    
    public int read()
    {
      int i = super.read();
      if (i != -1) {
        this.a += 1;
      }
      return i;
    }
    
    public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      paramInt1 = super.read(paramArrayOfByte, paramInt1, paramInt2);
      if (paramInt1 != -1) {
        this.a += paramInt1;
      }
      return paramInt1;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/android/volley/toolbox/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */