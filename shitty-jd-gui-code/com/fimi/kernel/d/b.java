package com.fimi.kernel.d;

import android.content.Context;
import android.media.AudioManager;
import android.os.Environment;
import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.auth.AuthInfo;
import com.baidu.tts.client.SpeechError;
import com.baidu.tts.client.SpeechSynthesizer;
import com.baidu.tts.client.SpeechSynthesizerListener;
import com.baidu.tts.client.TtsMode;
import java.io.File;

public class b
  implements SpeechSynthesizerListener
{
  private static boolean a = false;
  private static final String d = "baiduTTS";
  private static final String e = "bd_etts_ch_speech_female.dat";
  private static final String f = "bd_etts_ch_text.dat";
  private static final String g = "temp_license";
  private static final String h = "bd_etts_speech_female_en.dat";
  private static final String i = "bd_etts_text_en.dat";
  private static boolean j = false;
  private static b k;
  private static Context l;
  private SpeechSynthesizer b;
  private String c;
  private boolean m;
  private AudioManager n;
  private int o;
  private int p;
  private boolean q;
  private a r;
  
  private b()
  {
    if (l != null)
    {
      this.n = ((AudioManager)l.getSystemService("audio"));
      this.o = this.n.getStreamVolume(3);
      this.p = this.n.getStreamMaxVolume(3);
    }
  }
  
  public static b a(Context paramContext)
  {
    l = paramContext;
    if (k == null) {}
    try
    {
      if (k == null) {
        k = new b();
      }
      return k;
    }
    finally {}
  }
  
  /* Error */
  private void a(boolean paramBoolean, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 8
    //   3: aconst_null
    //   4: astore 5
    //   6: aconst_null
    //   7: astore 7
    //   9: aconst_null
    //   10: astore 6
    //   12: new 93	java/io/File
    //   15: dup
    //   16: aload_3
    //   17: invokespecial 96	java/io/File:<init>	(Ljava/lang/String;)V
    //   20: astore 9
    //   22: iload_1
    //   23: ifne +15 -> 38
    //   26: iload_1
    //   27: ifne +104 -> 131
    //   30: aload 9
    //   32: invokevirtual 100	java/io/File:exists	()Z
    //   35: ifne +96 -> 131
    //   38: getstatic 59	com/fimi/kernel/d/b:l	Landroid/content/Context;
    //   41: invokevirtual 104	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   44: invokevirtual 110	android/content/res/Resources:getAssets	()Landroid/content/res/AssetManager;
    //   47: aload_2
    //   48: invokevirtual 116	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   51: astore_2
    //   52: aload_2
    //   53: astore 6
    //   55: new 118	java/io/FileOutputStream
    //   58: dup
    //   59: aload_3
    //   60: invokespecial 119	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   63: astore 5
    //   65: sipush 1024
    //   68: newarray <illegal type>
    //   70: astore_3
    //   71: aload_2
    //   72: aload_3
    //   73: iconst_0
    //   74: sipush 1024
    //   77: invokevirtual 125	java/io/InputStream:read	([BII)I
    //   80: istore 4
    //   82: iload 4
    //   84: iflt +48 -> 132
    //   87: aload 5
    //   89: aload_3
    //   90: iconst_0
    //   91: iload 4
    //   93: invokevirtual 129	java/io/FileOutputStream:write	([BII)V
    //   96: goto -25 -> 71
    //   99: astore 6
    //   101: aload_2
    //   102: astore_3
    //   103: aload 5
    //   105: astore_2
    //   106: aload 6
    //   108: astore 5
    //   110: aload 5
    //   112: invokevirtual 132	java/io/FileNotFoundException:printStackTrace	()V
    //   115: aload_2
    //   116: ifnull +7 -> 123
    //   119: aload_2
    //   120: invokevirtual 135	java/io/FileOutputStream:close	()V
    //   123: aload_3
    //   124: ifnull +7 -> 131
    //   127: aload_3
    //   128: invokevirtual 136	java/io/InputStream:close	()V
    //   131: return
    //   132: aload 5
    //   134: ifnull +8 -> 142
    //   137: aload 5
    //   139: invokevirtual 135	java/io/FileOutputStream:close	()V
    //   142: aload_2
    //   143: ifnull -12 -> 131
    //   146: aload_2
    //   147: invokevirtual 136	java/io/InputStream:close	()V
    //   150: return
    //   151: astore_2
    //   152: aload_2
    //   153: invokevirtual 137	java/io/IOException:printStackTrace	()V
    //   156: return
    //   157: astore_3
    //   158: aload_3
    //   159: invokevirtual 137	java/io/IOException:printStackTrace	()V
    //   162: goto -20 -> 142
    //   165: astore_2
    //   166: aload_2
    //   167: invokevirtual 137	java/io/IOException:printStackTrace	()V
    //   170: goto -47 -> 123
    //   173: astore_2
    //   174: aload_2
    //   175: invokevirtual 137	java/io/IOException:printStackTrace	()V
    //   178: return
    //   179: astore_3
    //   180: aconst_null
    //   181: astore_2
    //   182: aload 8
    //   184: astore 5
    //   186: aload 5
    //   188: astore 7
    //   190: aload_2
    //   191: astore 6
    //   193: aload_3
    //   194: invokevirtual 137	java/io/IOException:printStackTrace	()V
    //   197: aload 5
    //   199: ifnull +8 -> 207
    //   202: aload 5
    //   204: invokevirtual 135	java/io/FileOutputStream:close	()V
    //   207: aload_2
    //   208: ifnull -77 -> 131
    //   211: aload_2
    //   212: invokevirtual 136	java/io/InputStream:close	()V
    //   215: return
    //   216: astore_2
    //   217: aload_2
    //   218: invokevirtual 137	java/io/IOException:printStackTrace	()V
    //   221: return
    //   222: astore_3
    //   223: aload_3
    //   224: invokevirtual 137	java/io/IOException:printStackTrace	()V
    //   227: goto -20 -> 207
    //   230: astore_3
    //   231: aconst_null
    //   232: astore_2
    //   233: aload 5
    //   235: ifnull +8 -> 243
    //   238: aload 5
    //   240: invokevirtual 135	java/io/FileOutputStream:close	()V
    //   243: aload_2
    //   244: ifnull +7 -> 251
    //   247: aload_2
    //   248: invokevirtual 136	java/io/InputStream:close	()V
    //   251: aload_3
    //   252: athrow
    //   253: astore 5
    //   255: aload 5
    //   257: invokevirtual 137	java/io/IOException:printStackTrace	()V
    //   260: goto -17 -> 243
    //   263: astore_2
    //   264: aload_2
    //   265: invokevirtual 137	java/io/IOException:printStackTrace	()V
    //   268: goto -17 -> 251
    //   271: astore_3
    //   272: aload 7
    //   274: astore 5
    //   276: aload 6
    //   278: astore_2
    //   279: goto -46 -> 233
    //   282: astore_3
    //   283: goto -50 -> 233
    //   286: astore 5
    //   288: aload_3
    //   289: astore 6
    //   291: aload 5
    //   293: astore_3
    //   294: aload_2
    //   295: astore 5
    //   297: aload 6
    //   299: astore_2
    //   300: goto -67 -> 233
    //   303: astore_3
    //   304: aload 8
    //   306: astore 5
    //   308: goto -122 -> 186
    //   311: astore_3
    //   312: goto -126 -> 186
    //   315: astore 5
    //   317: aconst_null
    //   318: astore_2
    //   319: aload 6
    //   321: astore_3
    //   322: goto -212 -> 110
    //   325: astore 5
    //   327: aconst_null
    //   328: astore 6
    //   330: aload_2
    //   331: astore_3
    //   332: aload 6
    //   334: astore_2
    //   335: goto -225 -> 110
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	338	0	this	b
    //   0	338	1	paramBoolean	boolean
    //   0	338	2	paramString1	String
    //   0	338	3	paramString2	String
    //   80	12	4	i1	int
    //   4	235	5	localObject1	Object
    //   253	3	5	localIOException	java.io.IOException
    //   274	1	5	localObject2	Object
    //   286	6	5	localObject3	Object
    //   295	12	5	localObject4	Object
    //   315	1	5	localFileNotFoundException1	java.io.FileNotFoundException
    //   325	1	5	localFileNotFoundException2	java.io.FileNotFoundException
    //   10	44	6	str1	String
    //   99	8	6	localFileNotFoundException3	java.io.FileNotFoundException
    //   191	142	6	str2	String
    //   7	266	7	localObject5	Object
    //   1	304	8	localObject6	Object
    //   20	11	9	localFile	File
    // Exception table:
    //   from	to	target	type
    //   65	71	99	java/io/FileNotFoundException
    //   71	82	99	java/io/FileNotFoundException
    //   87	96	99	java/io/FileNotFoundException
    //   146	150	151	java/io/IOException
    //   137	142	157	java/io/IOException
    //   119	123	165	java/io/IOException
    //   127	131	173	java/io/IOException
    //   38	52	179	java/io/IOException
    //   211	215	216	java/io/IOException
    //   202	207	222	java/io/IOException
    //   38	52	230	finally
    //   238	243	253	java/io/IOException
    //   247	251	263	java/io/IOException
    //   55	65	271	finally
    //   193	197	271	finally
    //   65	71	282	finally
    //   71	82	282	finally
    //   87	96	282	finally
    //   110	115	286	finally
    //   55	65	303	java/io/IOException
    //   65	71	311	java/io/IOException
    //   71	82	311	java/io/IOException
    //   87	96	311	java/io/IOException
    //   38	52	315	java/io/FileNotFoundException
    //   55	65	325	java/io/FileNotFoundException
  }
  
  public static b b(Context paramContext)
  {
    l = paramContext;
    return k;
  }
  
  private void e(String paramString)
  {
    paramString = new File(paramString);
    if (!paramString.exists()) {
      paramString.mkdirs();
    }
  }
  
  private void g()
  {
    if (this.c == null)
    {
      String str = Environment.getExternalStorageDirectory().toString();
      this.c = (str + "/" + "baiduTTS");
    }
    e(this.c);
    a(false, "bd_etts_ch_speech_female.dat", this.c + "/" + "bd_etts_ch_speech_female.dat");
    a(false, "bd_etts_ch_text.dat", this.c + "/" + "bd_etts_ch_text.dat");
    a(false, "temp_license", this.c + "/" + "temp_license");
    a(false, "english/bd_etts_speech_female_en.dat", this.c + "/" + "bd_etts_speech_female_en.dat");
    a(false, "english/bd_etts_text_en.dat", this.c + "/" + "bd_etts_text_en.dat");
  }
  
  private void h()
  {
    this.b = SpeechSynthesizer.getInstance();
    this.b.setContext(l);
    this.b.setSpeechSynthesizerListener(this);
    this.b.setParam(SpeechSynthesizer.PARAM_TTS_TEXT_MODEL_FILE, this.c + "/" + "bd_etts_ch_text.dat");
    this.b.setParam(SpeechSynthesizer.PARAM_TTS_SPEECH_MODEL_FILE, this.c + "/" + "bd_etts_ch_speech_female.dat");
    this.b.setAppId("7151478");
    this.b.setApiKey("cvRzOnrh71fLySlHPLo4lynu", "arQgRGCcR4UqIyIbRdf4Szis3GnBv1K7");
    AuthInfo localAuthInfo = this.b.auth(TtsMode.MIX);
    if (localAuthInfo.isSuccess())
    {
      this.m = true;
      this.b.setParam(SpeechSynthesizer.PARAM_SPEAKER, "0");
      this.b.setParam(SpeechSynthesizer.PARAM_MIX_MODE, SpeechSynthesizer.MIX_MODE_HIGH_SPEED_SYNTHESIZE_WIFI);
      this.b.initTts(TtsMode.MIX);
      this.b.loadEnglishModel(this.c + "/" + "bd_etts_text_en.dat", this.c + "/" + "bd_etts_speech_female_en.dat");
      return;
    }
    this.m = false;
    localAuthInfo.getTtsError().getDetailMessage();
  }
  
  public void a()
  {
    if (!this.m)
    {
      g();
      h();
    }
  }
  
  public void a(a parama)
  {
    this.r = parama;
  }
  
  public void a(String paramString)
  {
    if ((paramString == null) || (this.b == null)) {
      return;
    }
    if ((this.n != null) && (this.o <= this.p) && (!this.q))
    {
      this.q = true;
      this.n.setStreamVolume(3, this.n.getStreamMaxVolume(3), 4);
    }
    try
    {
      if (a) {
        this.b.stop();
      }
      this.b.speak(paramString);
      return;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
  }
  
  public void a(boolean paramBoolean)
  {
    this.q = paramBoolean;
  }
  
  public void b()
  {
    if (this.b != null) {
      this.b.stop();
    }
  }
  
  public void b(String paramString)
  {
    this.b.setParam(SpeechSynthesizer.PARAM_SPEAKER, paramString);
  }
  
  public void c()
  {
    this.b.release();
  }
  
  public void c(String paramString)
  {
    this.b.setParam(SpeechSynthesizer.PARAM_VOLUME, paramString);
  }
  
  public void d(String paramString)
  {
    this.b.setParam(SpeechSynthesizer.PARAM_PITCH, paramString);
  }
  
  public boolean d()
  {
    return this.m;
  }
  
  public void e()
  {
    if (a) {
      this.b.stop();
    }
  }
  
  public boolean f()
  {
    return this.q;
  }
  
  public void onError(String paramString, SpeechError paramSpeechError) {}
  
  public void onSpeechFinish(String paramString)
  {
    a = false;
    if (this.r != null) {
      this.r.a(true);
    }
  }
  
  public void onSpeechProgressChanged(String paramString, int paramInt) {}
  
  public void onSpeechStart(String paramString)
  {
    a = true;
    if (this.r != null) {
      this.r.a(false);
    }
  }
  
  public void onSynthesizeDataArrived(String paramString, byte[] paramArrayOfByte, int paramInt) {}
  
  public void onSynthesizeFinish(String paramString) {}
  
  public void onSynthesizeStart(String paramString) {}
  
  public static abstract interface a
  {
    public abstract void a(boolean paramBoolean);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */