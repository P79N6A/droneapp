package com.fimi.soul.media.player;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import java.util.Map;

public class FimiMediaCodecInfo
{
  public static int RANK_ACCEPTABLE = 0;
  public static int RANK_LAST_CHANCE = 0;
  public static int RANK_MAX = 1000;
  public static int RANK_NON_STANDARD = 100;
  public static int RANK_NO_SENSE = 0;
  public static int RANK_SECURE = 0;
  public static int RANK_SOFTWARE = 0;
  public static int RANK_TESTED = 800;
  private static final String TAG = "FimiMediaCodecInfo";
  private static Map<String, Integer> sKnownCodecList;
  public MediaCodecInfo mCodecInfo;
  public String mMimeType;
  public int mRank = 0;
  
  static
  {
    RANK_ACCEPTABLE = 700;
    RANK_LAST_CHANCE = 600;
    RANK_SECURE = 300;
    RANK_SOFTWARE = 200;
  }
  
  /* Error */
  private static Map<String, Integer> getKnownCodecList()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 53	com/fimi/soul/media/player/FimiMediaCodecInfo:sKnownCodecList	Ljava/util/Map;
    //   6: ifnull +12 -> 18
    //   9: getstatic 53	com/fimi/soul/media/player/FimiMediaCodecInfo:sKnownCodecList	Ljava/util/Map;
    //   12: astore_0
    //   13: ldc 2
    //   15: monitorexit
    //   16: aload_0
    //   17: areturn
    //   18: new 55	java/util/TreeMap
    //   21: dup
    //   22: getstatic 61	java/lang/String:CASE_INSENSITIVE_ORDER	Ljava/util/Comparator;
    //   25: invokespecial 64	java/util/TreeMap:<init>	(Ljava/util/Comparator;)V
    //   28: putstatic 53	com/fimi/soul/media/player/FimiMediaCodecInfo:sKnownCodecList	Ljava/util/Map;
    //   31: getstatic 53	com/fimi/soul/media/player/FimiMediaCodecInfo:sKnownCodecList	Ljava/util/Map;
    //   34: ldc 66
    //   36: getstatic 31	com/fimi/soul/media/player/FimiMediaCodecInfo:RANK_TESTED	I
    //   39: invokestatic 72	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   42: invokeinterface 78 3 0
    //   47: pop
    //   48: getstatic 53	com/fimi/soul/media/player/FimiMediaCodecInfo:sKnownCodecList	Ljava/util/Map;
    //   51: ldc 80
    //   53: getstatic 37	com/fimi/soul/media/player/FimiMediaCodecInfo:RANK_SECURE	I
    //   56: invokestatic 72	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   59: invokeinterface 78 3 0
    //   64: pop
    //   65: getstatic 53	com/fimi/soul/media/player/FimiMediaCodecInfo:sKnownCodecList	Ljava/util/Map;
    //   68: ldc 82
    //   70: getstatic 31	com/fimi/soul/media/player/FimiMediaCodecInfo:RANK_TESTED	I
    //   73: iconst_1
    //   74: iadd
    //   75: invokestatic 72	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   78: invokeinterface 78 3 0
    //   83: pop
    //   84: getstatic 53	com/fimi/soul/media/player/FimiMediaCodecInfo:sKnownCodecList	Ljava/util/Map;
    //   87: ldc 84
    //   89: getstatic 31	com/fimi/soul/media/player/FimiMediaCodecInfo:RANK_TESTED	I
    //   92: invokestatic 72	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   95: invokeinterface 78 3 0
    //   100: pop
    //   101: getstatic 53	com/fimi/soul/media/player/FimiMediaCodecInfo:sKnownCodecList	Ljava/util/Map;
    //   104: ldc 86
    //   106: getstatic 31	com/fimi/soul/media/player/FimiMediaCodecInfo:RANK_TESTED	I
    //   109: invokestatic 72	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   112: invokeinterface 78 3 0
    //   117: pop
    //   118: getstatic 53	com/fimi/soul/media/player/FimiMediaCodecInfo:sKnownCodecList	Ljava/util/Map;
    //   121: ldc 88
    //   123: getstatic 43	com/fimi/soul/media/player/FimiMediaCodecInfo:RANK_NO_SENSE	I
    //   126: invokestatic 72	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   129: invokeinterface 78 3 0
    //   134: pop
    //   135: getstatic 53	com/fimi/soul/media/player/FimiMediaCodecInfo:sKnownCodecList	Ljava/util/Map;
    //   138: ldc 90
    //   140: getstatic 31	com/fimi/soul/media/player/FimiMediaCodecInfo:RANK_TESTED	I
    //   143: invokestatic 72	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   146: invokeinterface 78 3 0
    //   151: pop
    //   152: getstatic 53	com/fimi/soul/media/player/FimiMediaCodecInfo:sKnownCodecList	Ljava/util/Map;
    //   155: ldc 92
    //   157: getstatic 31	com/fimi/soul/media/player/FimiMediaCodecInfo:RANK_TESTED	I
    //   160: iconst_1
    //   161: isub
    //   162: invokestatic 72	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   165: invokeinterface 78 3 0
    //   170: pop
    //   171: getstatic 53	com/fimi/soul/media/player/FimiMediaCodecInfo:sKnownCodecList	Ljava/util/Map;
    //   174: ldc 94
    //   176: getstatic 31	com/fimi/soul/media/player/FimiMediaCodecInfo:RANK_TESTED	I
    //   179: iconst_2
    //   180: isub
    //   181: invokestatic 72	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   184: invokeinterface 78 3 0
    //   189: pop
    //   190: getstatic 53	com/fimi/soul/media/player/FimiMediaCodecInfo:sKnownCodecList	Ljava/util/Map;
    //   193: ldc 96
    //   195: getstatic 39	com/fimi/soul/media/player/FimiMediaCodecInfo:RANK_SOFTWARE	I
    //   198: invokestatic 72	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   201: invokeinterface 78 3 0
    //   206: pop
    //   207: getstatic 53	com/fimi/soul/media/player/FimiMediaCodecInfo:sKnownCodecList	Ljava/util/Map;
    //   210: ldc 98
    //   212: getstatic 31	com/fimi/soul/media/player/FimiMediaCodecInfo:RANK_TESTED	I
    //   215: invokestatic 72	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   218: invokeinterface 78 3 0
    //   223: pop
    //   224: getstatic 53	com/fimi/soul/media/player/FimiMediaCodecInfo:sKnownCodecList	Ljava/util/Map;
    //   227: ldc 100
    //   229: getstatic 31	com/fimi/soul/media/player/FimiMediaCodecInfo:RANK_TESTED	I
    //   232: iconst_1
    //   233: isub
    //   234: invokestatic 72	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   237: invokeinterface 78 3 0
    //   242: pop
    //   243: getstatic 53	com/fimi/soul/media/player/FimiMediaCodecInfo:sKnownCodecList	Ljava/util/Map;
    //   246: ldc 102
    //   248: getstatic 31	com/fimi/soul/media/player/FimiMediaCodecInfo:RANK_TESTED	I
    //   251: invokestatic 72	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   254: invokeinterface 78 3 0
    //   259: pop
    //   260: getstatic 53	com/fimi/soul/media/player/FimiMediaCodecInfo:sKnownCodecList	Ljava/util/Map;
    //   263: ldc 104
    //   265: getstatic 31	com/fimi/soul/media/player/FimiMediaCodecInfo:RANK_TESTED	I
    //   268: invokestatic 72	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   271: invokeinterface 78 3 0
    //   276: pop
    //   277: getstatic 53	com/fimi/soul/media/player/FimiMediaCodecInfo:sKnownCodecList	Ljava/util/Map;
    //   280: ldc 106
    //   282: getstatic 31	com/fimi/soul/media/player/FimiMediaCodecInfo:RANK_TESTED	I
    //   285: invokestatic 72	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   288: invokeinterface 78 3 0
    //   293: pop
    //   294: getstatic 53	com/fimi/soul/media/player/FimiMediaCodecInfo:sKnownCodecList	Ljava/util/Map;
    //   297: ldc 108
    //   299: getstatic 31	com/fimi/soul/media/player/FimiMediaCodecInfo:RANK_TESTED	I
    //   302: invokestatic 72	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   305: invokeinterface 78 3 0
    //   310: pop
    //   311: getstatic 53	com/fimi/soul/media/player/FimiMediaCodecInfo:sKnownCodecList	Ljava/util/Map;
    //   314: ldc 110
    //   316: getstatic 31	com/fimi/soul/media/player/FimiMediaCodecInfo:RANK_TESTED	I
    //   319: invokestatic 72	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   322: invokeinterface 78 3 0
    //   327: pop
    //   328: getstatic 53	com/fimi/soul/media/player/FimiMediaCodecInfo:sKnownCodecList	Ljava/util/Map;
    //   331: ldc 112
    //   333: getstatic 31	com/fimi/soul/media/player/FimiMediaCodecInfo:RANK_TESTED	I
    //   336: invokestatic 72	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   339: invokeinterface 78 3 0
    //   344: pop
    //   345: getstatic 53	com/fimi/soul/media/player/FimiMediaCodecInfo:sKnownCodecList	Ljava/util/Map;
    //   348: ldc 114
    //   350: getstatic 39	com/fimi/soul/media/player/FimiMediaCodecInfo:RANK_SOFTWARE	I
    //   353: invokestatic 72	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   356: invokeinterface 78 3 0
    //   361: pop
    //   362: getstatic 53	com/fimi/soul/media/player/FimiMediaCodecInfo:sKnownCodecList	Ljava/util/Map;
    //   365: ldc 116
    //   367: invokeinterface 120 2 0
    //   372: pop
    //   373: getstatic 53	com/fimi/soul/media/player/FimiMediaCodecInfo:sKnownCodecList	Ljava/util/Map;
    //   376: ldc 122
    //   378: invokeinterface 120 2 0
    //   383: pop
    //   384: getstatic 53	com/fimi/soul/media/player/FimiMediaCodecInfo:sKnownCodecList	Ljava/util/Map;
    //   387: ldc 124
    //   389: invokeinterface 120 2 0
    //   394: pop
    //   395: getstatic 53	com/fimi/soul/media/player/FimiMediaCodecInfo:sKnownCodecList	Ljava/util/Map;
    //   398: ldc 126
    //   400: invokeinterface 120 2 0
    //   405: pop
    //   406: getstatic 53	com/fimi/soul/media/player/FimiMediaCodecInfo:sKnownCodecList	Ljava/util/Map;
    //   409: ldc -128
    //   411: invokeinterface 120 2 0
    //   416: pop
    //   417: getstatic 53	com/fimi/soul/media/player/FimiMediaCodecInfo:sKnownCodecList	Ljava/util/Map;
    //   420: ldc -126
    //   422: invokeinterface 120 2 0
    //   427: pop
    //   428: getstatic 53	com/fimi/soul/media/player/FimiMediaCodecInfo:sKnownCodecList	Ljava/util/Map;
    //   431: ldc -124
    //   433: invokeinterface 120 2 0
    //   438: pop
    //   439: getstatic 53	com/fimi/soul/media/player/FimiMediaCodecInfo:sKnownCodecList	Ljava/util/Map;
    //   442: ldc -122
    //   444: invokeinterface 120 2 0
    //   449: pop
    //   450: getstatic 53	com/fimi/soul/media/player/FimiMediaCodecInfo:sKnownCodecList	Ljava/util/Map;
    //   453: ldc -120
    //   455: invokeinterface 120 2 0
    //   460: pop
    //   461: getstatic 53	com/fimi/soul/media/player/FimiMediaCodecInfo:sKnownCodecList	Ljava/util/Map;
    //   464: ldc -118
    //   466: invokeinterface 120 2 0
    //   471: pop
    //   472: getstatic 53	com/fimi/soul/media/player/FimiMediaCodecInfo:sKnownCodecList	Ljava/util/Map;
    //   475: ldc -116
    //   477: invokeinterface 120 2 0
    //   482: pop
    //   483: getstatic 53	com/fimi/soul/media/player/FimiMediaCodecInfo:sKnownCodecList	Ljava/util/Map;
    //   486: ldc -114
    //   488: getstatic 39	com/fimi/soul/media/player/FimiMediaCodecInfo:RANK_SOFTWARE	I
    //   491: invokestatic 72	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   494: invokeinterface 78 3 0
    //   499: pop
    //   500: getstatic 53	com/fimi/soul/media/player/FimiMediaCodecInfo:sKnownCodecList	Ljava/util/Map;
    //   503: ldc -112
    //   505: getstatic 39	com/fimi/soul/media/player/FimiMediaCodecInfo:RANK_SOFTWARE	I
    //   508: invokestatic 72	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   511: invokeinterface 78 3 0
    //   516: pop
    //   517: getstatic 53	com/fimi/soul/media/player/FimiMediaCodecInfo:sKnownCodecList	Ljava/util/Map;
    //   520: ldc -110
    //   522: getstatic 39	com/fimi/soul/media/player/FimiMediaCodecInfo:RANK_SOFTWARE	I
    //   525: invokestatic 72	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   528: invokeinterface 78 3 0
    //   533: pop
    //   534: getstatic 53	com/fimi/soul/media/player/FimiMediaCodecInfo:sKnownCodecList	Ljava/util/Map;
    //   537: ldc -108
    //   539: getstatic 39	com/fimi/soul/media/player/FimiMediaCodecInfo:RANK_SOFTWARE	I
    //   542: invokestatic 72	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   545: invokeinterface 78 3 0
    //   550: pop
    //   551: getstatic 53	com/fimi/soul/media/player/FimiMediaCodecInfo:sKnownCodecList	Ljava/util/Map;
    //   554: astore_0
    //   555: goto -542 -> 13
    //   558: astore_0
    //   559: ldc 2
    //   561: monitorexit
    //   562: aload_0
    //   563: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   12	543	0	localMap	Map
    //   558	5	0	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   3	13	558	finally
    //   18	555	558	finally
  }
  
  public static String getLevelName(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return "0";
    case 1: 
      return "1";
    case 2: 
      return "1b";
    case 4: 
      return "11";
    case 8: 
      return "12";
    case 16: 
      return "13";
    case 32: 
      return "2";
    case 64: 
      return "21";
    case 128: 
      return "22";
    case 256: 
      return "3";
    case 512: 
      return "31";
    case 1024: 
      return "32";
    case 2048: 
      return "4";
    case 4096: 
      return "41";
    case 8192: 
      return "42";
    case 16384: 
      return "5";
    case 32768: 
      return "51";
    }
    return "52";
  }
  
  public static String getProfileLevelName(int paramInt1, int paramInt2)
  {
    return String.format(Locale.US, " %s Profile Level %s (%d,%d)", new Object[] { getProfileName(paramInt1), getLevelName(paramInt2), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
  }
  
  public static String getProfileName(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return "Unknown";
    case 1: 
      return "Baseline";
    case 2: 
      return "Main";
    case 4: 
      return "Extends";
    case 8: 
      return "High";
    case 16: 
      return "High10";
    case 32: 
      return "High422";
    }
    return "High444";
  }
  
  @TargetApi(16)
  public static FimiMediaCodecInfo setupCandidate(MediaCodecInfo paramMediaCodecInfo, String paramString)
  {
    if ((paramMediaCodecInfo == null) || (Build.VERSION.SDK_INT < 16)) {}
    do
    {
      return null;
      localObject = paramMediaCodecInfo.getName();
    } while (TextUtils.isEmpty((CharSequence)localObject));
    Object localObject = ((String)localObject).toLowerCase(Locale.US);
    int i = RANK_NO_SENSE;
    if (!((String)localObject).startsWith("omx.")) {
      i = RANK_NON_STANDARD;
    }
    for (;;)
    {
      localObject = new FimiMediaCodecInfo();
      ((FimiMediaCodecInfo)localObject).mCodecInfo = paramMediaCodecInfo;
      ((FimiMediaCodecInfo)localObject).mRank = i;
      ((FimiMediaCodecInfo)localObject).mMimeType = paramString;
      return (FimiMediaCodecInfo)localObject;
      if (((String)localObject).startsWith("omx.pv"))
      {
        i = RANK_SOFTWARE;
      }
      else if (((String)localObject).startsWith("omx.google."))
      {
        i = RANK_SOFTWARE;
      }
      else if (((String)localObject).startsWith("omx.ffmpeg."))
      {
        i = RANK_SOFTWARE;
      }
      else if (((String)localObject).startsWith("omx.k3.ffmpeg."))
      {
        i = RANK_SOFTWARE;
      }
      else if (((String)localObject).startsWith("omx.avcodec."))
      {
        i = RANK_SOFTWARE;
      }
      else if (((String)localObject).startsWith("omx.ittiam."))
      {
        i = RANK_NO_SENSE;
      }
      else if (((String)localObject).startsWith("omx.mtk."))
      {
        if (Build.VERSION.SDK_INT < 18) {
          i = RANK_NO_SENSE;
        } else {
          i = RANK_TESTED;
        }
      }
      else
      {
        localObject = (Integer)getKnownCodecList().get(localObject);
        if (localObject != null) {
          i = ((Integer)localObject).intValue();
        } else {
          try
          {
            if (paramMediaCodecInfo.getCapabilitiesForType(paramString) != null) {
              i = RANK_ACCEPTABLE;
            } else {
              i = RANK_LAST_CHANCE;
            }
          }
          catch (Throwable localThrowable)
          {
            i = RANK_LAST_CHANCE;
          }
        }
      }
    }
  }
  
  @TargetApi(16)
  public void dumpProfileLevels(String paramString)
  {
    int i = 0;
    int m = 0;
    if (Build.VERSION.SDK_INT < 16) {
      return;
    }
    int i1;
    int k;
    Object localObject;
    try
    {
      paramString = this.mCodecInfo.getCapabilitiesForType(paramString);
      if ((paramString == null) || (paramString.profileLevels == null)) {
        break label148;
      }
      paramString = paramString.profileLevels;
      i1 = paramString.length;
      k = 0;
      j = 0;
    }
    catch (Throwable paramString)
    {
      Log.i("FimiMediaCodecInfo", "profile-level: exception");
      return;
    }
    int j = Math.max(j, ((MediaCodecInfo.CodecProfileLevel)localObject).profile);
    i = Math.max(i, ((MediaCodecInfo.CodecProfileLevel)localObject).level);
    for (;;)
    {
      label74:
      Log.i("FimiMediaCodecInfo", String.format(Locale.US, "%s", new Object[] { getProfileLevelName(n, m) }));
      return;
      for (;;)
      {
        m = i;
        n = j;
        if (k >= i1) {
          break label74;
        }
        localObject = paramString[k];
        if (localObject != null) {
          break;
        }
        k += 1;
      }
      label148:
      int n = 0;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/media/player/FimiMediaCodecInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */