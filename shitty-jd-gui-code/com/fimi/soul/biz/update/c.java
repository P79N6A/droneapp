package com.fimi.soul.biz.update;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.fimi.kernel.b;
import com.fimi.kernel.c.a;
import com.fimi.soul.entity.UpdateVersonBean;
import com.fimi.soul.utils.j;
import com.google.gson.Gson;

public abstract class c
  extends b
{
  protected static final int a = 9898;
  public static boolean b = false;
  public static boolean c = false;
  public static final int d = -1;
  public static final int e = -2;
  private i f;
  private long g;
  private UpdateVersonBean h;
  private UpdateVersonBean i;
  private Gson j = new Gson();
  
  private void a(int paramInt1, int paramInt2, int paramInt3)
  {
    Message localMessage = new Message();
    localMessage.what = 9898;
    localMessage.arg1 = paramInt1;
    localMessage.arg2 = paramInt2;
    Bundle localBundle = new Bundle();
    localBundle.putInt("arg3", paramInt3);
    localMessage.setData(localBundle);
    a().sendMessage(localMessage);
  }
  
  protected void a(Message paramMessage)
  {
    boolean bool = true;
    if (paramMessage.what == 9898) {
      if (paramMessage.arg1 != 1) {
        break label49;
      }
    }
    for (;;)
    {
      this.f.a(bool, paramMessage.arg2, this.g, paramMessage.getData().getInt("arg3"));
      return;
      label49:
      bool = false;
    }
  }
  
  protected void a(UpdateVersonBean paramUpdateVersonBean)
  {
    this.i = paramUpdateVersonBean;
  }
  
  protected void a(final UpdateVersonBean paramUpdateVersonBean, final String paramString, i parami)
  {
    this.f = parami;
    Log.d("moweiru", "downloadFile");
    a(new Runnable()
    {
      /* Error */
      public void run()
      {
        // Byte code:
        //   0: aconst_null
        //   1: astore 6
        //   3: aconst_null
        //   4: astore 5
        //   6: new 33	java/net/URL
        //   9: dup
        //   10: aload_0
        //   11: getfield 22	com/fimi/soul/biz/update/c$1:a	Lcom/fimi/soul/entity/UpdateVersonBean;
        //   14: invokevirtual 39	com/fimi/soul/entity/UpdateVersonBean:getUrl	()Ljava/lang/String;
        //   17: invokespecial 42	java/net/URL:<init>	(Ljava/lang/String;)V
        //   20: invokevirtual 46	java/net/URL:openConnection	()Ljava/net/URLConnection;
        //   23: checkcast 48	java/net/HttpURLConnection
        //   26: astore 7
        //   28: aload 7
        //   30: ldc 49
        //   32: invokevirtual 53	java/net/HttpURLConnection:setConnectTimeout	(I)V
        //   35: aload 7
        //   37: ldc 54
        //   39: invokevirtual 57	java/net/HttpURLConnection:setReadTimeout	(I)V
        //   42: aload 7
        //   44: ldc 59
        //   46: invokevirtual 62	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
        //   49: new 64	java/io/File
        //   52: dup
        //   53: aload_0
        //   54: getfield 24	com/fimi/soul/biz/update/c$1:b	Ljava/lang/String;
        //   57: invokespecial 65	java/io/File:<init>	(Ljava/lang/String;)V
        //   60: astore 8
        //   62: aload 8
        //   64: invokevirtual 69	java/io/File:exists	()Z
        //   67: ifne +9 -> 76
        //   70: aload 8
        //   72: invokevirtual 72	java/io/File:createNewFile	()Z
        //   75: pop
        //   76: aload 7
        //   78: invokevirtual 76	java/net/HttpURLConnection:getResponseCode	()I
        //   81: sipush 200
        //   84: if_icmpne +400 -> 484
        //   87: aload 7
        //   89: invokevirtual 80	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
        //   92: astore 4
        //   94: new 82	java/io/FileOutputStream
        //   97: dup
        //   98: aload 8
        //   100: invokespecial 85	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
        //   103: astore 5
        //   105: aload_0
        //   106: getfield 20	com/fimi/soul/biz/update/c$1:c	Lcom/fimi/soul/biz/update/c;
        //   109: aload 7
        //   111: invokevirtual 88	java/net/HttpURLConnection:getContentLength	()I
        //   114: i2l
        //   115: invokestatic 91	com/fimi/soul/biz/update/c:a	(Lcom/fimi/soul/biz/update/c;J)J
        //   118: pop2
        //   119: sipush 2048
        //   122: newarray <illegal type>
        //   124: astore 6
        //   126: iconst_0
        //   127: istore_1
        //   128: aload 4
        //   130: aload 6
        //   132: invokevirtual 97	java/io/InputStream:read	([B)I
        //   135: istore_2
        //   136: iload_2
        //   137: iconst_m1
        //   138: if_icmpeq +190 -> 328
        //   141: getstatic 100	com/fimi/soul/biz/update/c:c	Z
        //   144: istore_3
        //   145: iload_3
        //   146: ifeq +37 -> 183
        //   149: aload 4
        //   151: ifnull +8 -> 159
        //   154: aload 4
        //   156: invokevirtual 103	java/io/InputStream:close	()V
        //   159: aload 5
        //   161: ifnull +13 -> 174
        //   164: aload 5
        //   166: invokevirtual 106	java/io/FileOutputStream:flush	()V
        //   169: aload 5
        //   171: invokevirtual 107	java/io/FileOutputStream:close	()V
        //   174: return
        //   175: astore 4
        //   177: aload 4
        //   179: invokevirtual 110	java/lang/Exception:printStackTrace	()V
        //   182: return
        //   183: getstatic 112	com/fimi/soul/biz/update/c:b	Z
        //   186: istore_3
        //   187: iload_3
        //   188: ifeq +37 -> 225
        //   191: aload 4
        //   193: ifnull +8 -> 201
        //   196: aload 4
        //   198: invokevirtual 103	java/io/InputStream:close	()V
        //   201: aload 5
        //   203: ifnull -29 -> 174
        //   206: aload 5
        //   208: invokevirtual 106	java/io/FileOutputStream:flush	()V
        //   211: aload 5
        //   213: invokevirtual 107	java/io/FileOutputStream:close	()V
        //   216: return
        //   217: astore 4
        //   219: aload 4
        //   221: invokevirtual 110	java/lang/Exception:printStackTrace	()V
        //   224: return
        //   225: aload 5
        //   227: aload 6
        //   229: iconst_0
        //   230: iload_2
        //   231: invokevirtual 116	java/io/FileOutputStream:write	([BII)V
        //   234: iload_1
        //   235: iload_2
        //   236: iadd
        //   237: istore_1
        //   238: aload_0
        //   239: getfield 20	com/fimi/soul/biz/update/c$1:c	Lcom/fimi/soul/biz/update/c;
        //   242: iconst_0
        //   243: iload_1
        //   244: aload_0
        //   245: getfield 22	com/fimi/soul/biz/update/c$1:a	Lcom/fimi/soul/entity/UpdateVersonBean;
        //   248: invokevirtual 119	com/fimi/soul/entity/UpdateVersonBean:getSysid	()I
        //   251: invokestatic 122	com/fimi/soul/biz/update/c:a	(Lcom/fimi/soul/biz/update/c;III)V
        //   254: goto -126 -> 128
        //   257: astore 6
        //   259: aload 5
        //   261: astore 6
        //   263: aload 4
        //   265: astore 5
        //   267: aload 6
        //   269: astore 4
        //   271: getstatic 112	com/fimi/soul/biz/update/c:b	Z
        //   274: ifne +20 -> 294
        //   277: aload_0
        //   278: getfield 20	com/fimi/soul/biz/update/c$1:c	Lcom/fimi/soul/biz/update/c;
        //   281: iconst_1
        //   282: bipush -2
        //   284: aload_0
        //   285: getfield 22	com/fimi/soul/biz/update/c$1:a	Lcom/fimi/soul/entity/UpdateVersonBean;
        //   288: invokevirtual 119	com/fimi/soul/entity/UpdateVersonBean:getSysid	()I
        //   291: invokestatic 122	com/fimi/soul/biz/update/c:a	(Lcom/fimi/soul/biz/update/c;III)V
        //   294: aload 5
        //   296: ifnull +8 -> 304
        //   299: aload 5
        //   301: invokevirtual 103	java/io/InputStream:close	()V
        //   304: aload 4
        //   306: ifnull -132 -> 174
        //   309: aload 4
        //   311: invokevirtual 106	java/io/FileOutputStream:flush	()V
        //   314: aload 4
        //   316: invokevirtual 107	java/io/FileOutputStream:close	()V
        //   319: return
        //   320: astore 4
        //   322: aload 4
        //   324: invokevirtual 110	java/lang/Exception:printStackTrace	()V
        //   327: return
        //   328: aload_0
        //   329: getfield 20	com/fimi/soul/biz/update/c$1:c	Lcom/fimi/soul/biz/update/c;
        //   332: iconst_1
        //   333: iconst_0
        //   334: aload_0
        //   335: getfield 22	com/fimi/soul/biz/update/c$1:a	Lcom/fimi/soul/entity/UpdateVersonBean;
        //   338: invokevirtual 119	com/fimi/soul/entity/UpdateVersonBean:getSysid	()I
        //   341: invokestatic 122	com/fimi/soul/biz/update/c:a	(Lcom/fimi/soul/biz/update/c;III)V
        //   344: aload 4
        //   346: ifnull +8 -> 354
        //   349: aload 4
        //   351: invokevirtual 103	java/io/InputStream:close	()V
        //   354: aload 5
        //   356: ifnull -182 -> 174
        //   359: aload 5
        //   361: invokevirtual 106	java/io/FileOutputStream:flush	()V
        //   364: aload 5
        //   366: invokevirtual 107	java/io/FileOutputStream:close	()V
        //   369: return
        //   370: astore 4
        //   372: aload 4
        //   374: invokevirtual 110	java/lang/Exception:printStackTrace	()V
        //   377: return
        //   378: astore 5
        //   380: aconst_null
        //   381: astore 4
        //   383: aload 4
        //   385: ifnull +8 -> 393
        //   388: aload 4
        //   390: invokevirtual 103	java/io/InputStream:close	()V
        //   393: aload 6
        //   395: ifnull +13 -> 408
        //   398: aload 6
        //   400: invokevirtual 106	java/io/FileOutputStream:flush	()V
        //   403: aload 6
        //   405: invokevirtual 107	java/io/FileOutputStream:close	()V
        //   408: aload 5
        //   410: athrow
        //   411: astore 4
        //   413: aload 4
        //   415: invokevirtual 110	java/lang/Exception:printStackTrace	()V
        //   418: goto -10 -> 408
        //   421: astore 5
        //   423: goto -40 -> 383
        //   426: astore 7
        //   428: aload 5
        //   430: astore 6
        //   432: aload 7
        //   434: astore 5
        //   436: goto -53 -> 383
        //   439: astore 6
        //   441: aload 5
        //   443: astore 7
        //   445: aload 6
        //   447: astore 5
        //   449: aload 4
        //   451: astore 6
        //   453: aload 7
        //   455: astore 4
        //   457: goto -74 -> 383
        //   460: astore 4
        //   462: aconst_null
        //   463: astore 4
        //   465: goto -194 -> 271
        //   468: astore 5
        //   470: aconst_null
        //   471: astore 6
        //   473: aload 4
        //   475: astore 5
        //   477: aload 6
        //   479: astore 4
        //   481: goto -210 -> 271
        //   484: aconst_null
        //   485: astore 5
        //   487: aconst_null
        //   488: astore 4
        //   490: goto -146 -> 344
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	493	0	this	1
        //   127	117	1	i	int
        //   135	102	2	j	int
        //   144	44	3	bool	boolean
        //   92	63	4	localInputStream	java.io.InputStream
        //   175	22	4	localException1	Exception
        //   217	47	4	localException2	Exception
        //   269	46	4	localObject1	Object
        //   320	30	4	localException3	Exception
        //   370	3	4	localException4	Exception
        //   381	8	4	localObject2	Object
        //   411	39	4	localException5	Exception
        //   455	1	4	localObject3	Object
        //   460	1	4	localException6	Exception
        //   463	26	4	localObject4	Object
        //   4	361	5	localObject5	Object
        //   378	31	5	localObject6	Object
        //   421	8	5	localObject7	Object
        //   434	14	5	localObject8	Object
        //   468	1	5	localException7	Exception
        //   475	11	5	localObject9	Object
        //   1	227	6	arrayOfByte	byte[]
        //   257	1	6	localException8	Exception
        //   261	170	6	localObject10	Object
        //   439	7	6	localObject11	Object
        //   451	27	6	localObject12	Object
        //   26	84	7	localHttpURLConnection	java.net.HttpURLConnection
        //   426	7	7	localObject13	Object
        //   443	11	7	localObject14	Object
        //   60	39	8	localFile	java.io.File
        // Exception table:
        //   from	to	target	type
        //   154	159	175	java/lang/Exception
        //   164	174	175	java/lang/Exception
        //   196	201	217	java/lang/Exception
        //   206	216	217	java/lang/Exception
        //   105	126	257	java/lang/Exception
        //   128	136	257	java/lang/Exception
        //   141	145	257	java/lang/Exception
        //   183	187	257	java/lang/Exception
        //   225	234	257	java/lang/Exception
        //   238	254	257	java/lang/Exception
        //   328	344	257	java/lang/Exception
        //   299	304	320	java/lang/Exception
        //   309	319	320	java/lang/Exception
        //   349	354	370	java/lang/Exception
        //   359	369	370	java/lang/Exception
        //   6	76	378	finally
        //   76	94	378	finally
        //   388	393	411	java/lang/Exception
        //   398	408	411	java/lang/Exception
        //   94	105	421	finally
        //   105	126	426	finally
        //   128	136	426	finally
        //   141	145	426	finally
        //   183	187	426	finally
        //   225	234	426	finally
        //   238	254	426	finally
        //   328	344	426	finally
        //   271	294	439	finally
        //   6	76	460	java/lang/Exception
        //   76	94	460	java/lang/Exception
        //   94	105	468	java/lang/Exception
      }
    });
  }
  
  protected void b(UpdateVersonBean paramUpdateVersonBean)
  {
    this.h = paramUpdateVersonBean;
  }
  
  protected void c(UpdateVersonBean paramUpdateVersonBean)
  {
    if (paramUpdateVersonBean != null)
    {
      this.h = paramUpdateVersonBean;
      com.fimi.kernel.c.c().a(getClass().toString(), paramUpdateVersonBean);
    }
  }
  
  protected String d(UpdateVersonBean paramUpdateVersonBean)
  {
    String str = "";
    int k = paramUpdateVersonBean.getSysid();
    if (k == 0) {
      paramUpdateVersonBean = "mifc";
    }
    for (;;)
    {
      return j.p() + paramUpdateVersonBean;
      if (k == 3)
      {
        paramUpdateVersonBean = "micc";
      }
      else if (k == 1)
      {
        paramUpdateVersonBean = "mirc";
      }
      else if (k == 2)
      {
        paramUpdateVersonBean = "mirec";
      }
      else if (k == 10)
      {
        paramUpdateVersonBean = "misafety";
      }
      else if (k == 9)
      {
        paramUpdateVersonBean = "mils";
      }
      else if (k == 6)
      {
        paramUpdateVersonBean = "misf";
      }
      else if (k == 4)
      {
        paramUpdateVersonBean = "firmware.zip";
      }
      else if (k == 11)
      {
        paramUpdateVersonBean = l.a(paramUpdateVersonBean.getFileEncode());
      }
      else if (k == 15)
      {
        paramUpdateVersonBean = l.a(paramUpdateVersonBean.getFileEncode(), paramUpdateVersonBean.getNewVersion() + "");
      }
      else if (k == 14)
      {
        paramUpdateVersonBean = l.b(paramUpdateVersonBean.getFileEncode(), paramUpdateVersonBean.getNewVersion() + "");
      }
      else if (k == 17)
      {
        paramUpdateVersonBean = "MI_FC_4K";
      }
      else if (k == 16)
      {
        paramUpdateVersonBean = "MI_RC_4K";
      }
      else if (k == 12)
      {
        paramUpdateVersonBean = "MI_GC_4K";
      }
      else if (k == 13)
      {
        paramUpdateVersonBean = "firmware-4k.zip";
      }
      else if (k == 18)
      {
        paramUpdateVersonBean = "safe-4k";
      }
      else if (k == 19)
      {
        paramUpdateVersonBean = "mils-4k";
      }
      else if (k == 20)
      {
        paramUpdateVersonBean = "misf-4k";
      }
      else if (k == 253)
      {
        paramUpdateVersonBean = "fc-bootloader-1080";
      }
      else if (k == 5)
      {
        paramUpdateVersonBean = "mi_power_battery";
      }
      else
      {
        paramUpdateVersonBean = str;
        if (k == 23) {
          paramUpdateVersonBean = "mi_power_battery_4K";
        }
      }
    }
  }
  
  protected Gson g()
  {
    return this.j;
  }
  
  protected UpdateVersonBean h()
  {
    return this.i;
  }
  
  protected UpdateVersonBean i()
  {
    return this.h;
  }
  
  public UpdateVersonBean j()
  {
    if (this.h == null) {
      this.h = ((UpdateVersonBean)com.fimi.kernel.c.c().a(getClass().toString(), UpdateVersonBean.class));
    }
    if (this.h == null) {
      this.h = new UpdateVersonBean();
    }
    return this.h;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/update/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */