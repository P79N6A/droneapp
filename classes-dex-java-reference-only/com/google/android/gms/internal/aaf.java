package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.graphics.Color;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug.MemoryInfo;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.SearchAdRequestParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.request.CapabilityParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@aaa
public final class aaf
{
  private static final SimpleDateFormat a = new SimpleDateFormat("yyyyMMdd", Locale.US);
  
  private static Bundle a(Bundle paramBundle)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("runtime_free", Long.toString(paramBundle.getLong("runtime_free_memory", -1L)));
    localBundle.putString("runtime_max", Long.toString(paramBundle.getLong("runtime_max_memory", -1L)));
    localBundle.putString("runtime_total", Long.toString(paramBundle.getLong("runtime_total_memory", -1L)));
    paramBundle = (Debug.MemoryInfo)paramBundle.getParcelable("debug_memory_info");
    if (paramBundle != null)
    {
      localBundle.putString("debug_info_dalvik_private_dirty", Integer.toString(paramBundle.dalvikPrivateDirty));
      localBundle.putString("debug_info_dalvik_pss", Integer.toString(paramBundle.dalvikPss));
      localBundle.putString("debug_info_dalvik_shared_dirty", Integer.toString(paramBundle.dalvikSharedDirty));
      localBundle.putString("debug_info_native_private_dirty", Integer.toString(paramBundle.nativePrivateDirty));
      localBundle.putString("debug_info_native_pss", Integer.toString(paramBundle.nativePss));
      localBundle.putString("debug_info_native_shared_dirty", Integer.toString(paramBundle.nativeSharedDirty));
      localBundle.putString("debug_info_other_private_dirty", Integer.toString(paramBundle.otherPrivateDirty));
      localBundle.putString("debug_info_other_pss", Integer.toString(paramBundle.otherPss));
      localBundle.putString("debug_info_other_shared_dirty", Integer.toString(paramBundle.otherSharedDirty));
    }
    return localBundle;
  }
  
  /* Error */
  public static AdResponseParcel a(Context paramContext, AdRequestInfoParcel paramAdRequestInfoParcel, String paramString)
  {
    // Byte code:
    //   0: new 123	org/json/JSONObject
    //   3: dup
    //   4: aload_2
    //   5: invokespecial 126	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   8: astore 28
    //   10: aload 28
    //   12: ldc -128
    //   14: aconst_null
    //   15: invokevirtual 132	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   18: astore 24
    //   20: aload 28
    //   22: ldc -122
    //   24: aconst_null
    //   25: invokevirtual 132	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   28: astore 25
    //   30: aload 28
    //   32: ldc -120
    //   34: aconst_null
    //   35: invokevirtual 132	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   38: astore 29
    //   40: aload 28
    //   42: ldc -118
    //   44: aload 29
    //   46: invokevirtual 132	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   49: astore 30
    //   51: aload_1
    //   52: ifnull +809 -> 861
    //   55: aload_1
    //   56: getfield 143	com/google/android/gms/ads/internal/request/AdRequestInfoParcel:m	I
    //   59: ifeq +802 -> 861
    //   62: iconst_1
    //   63: istore 5
    //   65: aload 28
    //   67: ldc -111
    //   69: aconst_null
    //   70: invokevirtual 132	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   73: astore_2
    //   74: aload_2
    //   75: astore 23
    //   77: aload_2
    //   78: ifnonnull +13 -> 91
    //   81: aload 28
    //   83: ldc -109
    //   85: aconst_null
    //   86: invokevirtual 132	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   89: astore 23
    //   91: aload 23
    //   93: astore_2
    //   94: aload 23
    //   96: ifnonnull +12 -> 108
    //   99: aload 28
    //   101: ldc -107
    //   103: aconst_null
    //   104: invokevirtual 132	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   107: astore_2
    //   108: ldc2_w 36
    //   111: lstore 17
    //   113: aload 28
    //   115: ldc -105
    //   117: aconst_null
    //   118: invokevirtual 132	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   121: astore 31
    //   123: aload 28
    //   125: ldc -103
    //   127: aconst_null
    //   128: invokevirtual 132	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   131: astore 32
    //   133: aload 28
    //   135: ldc -101
    //   137: invokevirtual 159	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   140: ifeq +727 -> 867
    //   143: aload 28
    //   145: ldc -101
    //   147: invokevirtual 163	org/json/JSONObject:getDouble	(Ljava/lang/String;)D
    //   150: ldc2_w 164
    //   153: dmul
    //   154: d2l
    //   155: lstore 15
    //   157: aload 28
    //   159: ldc -89
    //   161: aconst_null
    //   162: invokevirtual 132	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   165: astore 23
    //   167: iconst_m1
    //   168: istore_3
    //   169: ldc -87
    //   171: aload 23
    //   173: invokevirtual 175	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   176: ifeq +82 -> 258
    //   179: invokestatic 181	com/google/android/gms/ads/internal/u:g	()Lcom/google/android/gms/internal/abw;
    //   182: invokevirtual 187	com/google/android/gms/internal/abw:b	()I
    //   185: istore_3
    //   186: aconst_null
    //   187: astore 26
    //   189: aload_2
    //   190: invokestatic 193	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   193: ifeq +659 -> 852
    //   196: aload 25
    //   198: invokestatic 193	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   201: ifne +651 -> 852
    //   204: aload_1
    //   205: aload_0
    //   206: aload_1
    //   207: getfield 197	com/google/android/gms/ads/internal/request/AdRequestInfoParcel:k	Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;
    //   210: getfield 202	com/google/android/gms/ads/internal/util/client/VersionInfoParcel:b	Ljava/lang/String;
    //   213: aload 25
    //   215: aconst_null
    //   216: aconst_null
    //   217: aconst_null
    //   218: aconst_null
    //   219: invokestatic 207	com/google/android/gms/internal/aae:a	(Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/aaj;Lcom/google/android/gms/internal/un;Lcom/google/android/gms/internal/aad;)Lcom/google/android/gms/ads/internal/request/AdResponseParcel;
    //   222: astore 26
    //   224: aload 26
    //   226: getfield 210	com/google/android/gms/ads/internal/request/AdResponseParcel:b	Ljava/lang/String;
    //   229: astore_2
    //   230: aload 26
    //   232: getfield 213	com/google/android/gms/ads/internal/request/AdResponseParcel:c	Ljava/lang/String;
    //   235: astore 23
    //   237: aload 26
    //   239: getfield 217	com/google/android/gms/ads/internal/request/AdResponseParcel:n	J
    //   242: lstore 17
    //   244: aload 23
    //   246: ifnonnull +32 -> 278
    //   249: new 209	com/google/android/gms/ads/internal/request/AdResponseParcel
    //   252: dup
    //   253: iconst_0
    //   254: invokespecial 220	com/google/android/gms/ads/internal/request/AdResponseParcel:<init>	(I)V
    //   257: areturn
    //   258: ldc -34
    //   260: aload 23
    //   262: invokevirtual 175	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   265: ifeq -79 -> 186
    //   268: invokestatic 181	com/google/android/gms/ads/internal/u:g	()Lcom/google/android/gms/internal/abw;
    //   271: invokevirtual 224	com/google/android/gms/internal/abw:a	()I
    //   274: istore_3
    //   275: goto -89 -> 186
    //   278: aload 28
    //   280: ldc -30
    //   282: invokevirtual 230	org/json/JSONObject:optJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   285: astore 25
    //   287: aload 26
    //   289: ifnonnull +516 -> 805
    //   292: aconst_null
    //   293: astore_0
    //   294: aload_0
    //   295: astore 24
    //   297: aload 25
    //   299: ifnull +11 -> 310
    //   302: aload 25
    //   304: aload_0
    //   305: invokestatic 233	com/google/android/gms/internal/aaf:a	(Lorg/json/JSONArray;Ljava/util/List;)Ljava/util/List;
    //   308: astore 24
    //   310: aload 28
    //   312: ldc -21
    //   314: invokevirtual 230	org/json/JSONObject:optJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   317: astore 27
    //   319: aload 26
    //   321: ifnonnull +493 -> 814
    //   324: aconst_null
    //   325: astore_0
    //   326: aload_0
    //   327: astore 25
    //   329: aload 27
    //   331: ifnull +11 -> 342
    //   334: aload 27
    //   336: aload_0
    //   337: invokestatic 233	com/google/android/gms/internal/aaf:a	(Lorg/json/JSONArray;Ljava/util/List;)Ljava/util/List;
    //   340: astore 25
    //   342: aload 28
    //   344: ldc -19
    //   346: invokevirtual 230	org/json/JSONObject:optJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   349: astore 33
    //   351: aload 26
    //   353: ifnonnull +470 -> 823
    //   356: aconst_null
    //   357: astore_0
    //   358: aload_0
    //   359: astore 27
    //   361: aload 33
    //   363: ifnull +11 -> 374
    //   366: aload 33
    //   368: aload_0
    //   369: invokestatic 233	com/google/android/gms/internal/aaf:a	(Lorg/json/JSONArray;Ljava/util/List;)Ljava/util/List;
    //   372: astore 27
    //   374: iload_3
    //   375: istore 4
    //   377: aload 26
    //   379: ifnull +467 -> 846
    //   382: aload 26
    //   384: getfield 240	com/google/android/gms/ads/internal/request/AdResponseParcel:l	I
    //   387: iconst_m1
    //   388: if_icmpeq +9 -> 397
    //   391: aload 26
    //   393: getfield 240	com/google/android/gms/ads/internal/request/AdResponseParcel:l	I
    //   396: istore_3
    //   397: iload_3
    //   398: istore 4
    //   400: aload 26
    //   402: getfield 242	com/google/android/gms/ads/internal/request/AdResponseParcel:g	J
    //   405: lconst_0
    //   406: lcmp
    //   407: ifle +439 -> 846
    //   410: aload 26
    //   412: getfield 242	com/google/android/gms/ads/internal/request/AdResponseParcel:g	J
    //   415: lstore 15
    //   417: aload 28
    //   419: ldc -12
    //   421: invokevirtual 247	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   424: astore 26
    //   426: aconst_null
    //   427: astore_0
    //   428: aload 28
    //   430: ldc -7
    //   432: iconst_0
    //   433: invokevirtual 253	org/json/JSONObject:optBoolean	(Ljava/lang/String;Z)Z
    //   436: istore 6
    //   438: iload 6
    //   440: ifeq +12 -> 452
    //   443: aload 28
    //   445: ldc -1
    //   447: aconst_null
    //   448: invokevirtual 132	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   451: astore_0
    //   452: aload 28
    //   454: ldc_w 257
    //   457: iconst_0
    //   458: invokevirtual 253	org/json/JSONObject:optBoolean	(Ljava/lang/String;Z)Z
    //   461: istore 7
    //   463: aload 28
    //   465: ldc_w 259
    //   468: iconst_0
    //   469: invokevirtual 253	org/json/JSONObject:optBoolean	(Ljava/lang/String;Z)Z
    //   472: istore 8
    //   474: aload 28
    //   476: ldc_w 261
    //   479: iconst_1
    //   480: invokevirtual 253	org/json/JSONObject:optBoolean	(Ljava/lang/String;Z)Z
    //   483: istore 9
    //   485: aload 28
    //   487: ldc_w 263
    //   490: iconst_0
    //   491: invokevirtual 253	org/json/JSONObject:optBoolean	(Ljava/lang/String;Z)Z
    //   494: istore 10
    //   496: aload 28
    //   498: ldc_w 265
    //   501: ldc2_w 36
    //   504: invokevirtual 268	org/json/JSONObject:optLong	(Ljava/lang/String;J)J
    //   507: lstore 19
    //   509: aload 28
    //   511: ldc_w 270
    //   514: ldc2_w 36
    //   517: invokevirtual 268	org/json/JSONObject:optLong	(Ljava/lang/String;J)J
    //   520: lstore 21
    //   522: aload 28
    //   524: ldc_w 272
    //   527: ldc_w 274
    //   530: invokevirtual 132	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   533: astore 33
    //   535: ldc_w 276
    //   538: aload 28
    //   540: ldc_w 278
    //   543: ldc_w 274
    //   546: invokevirtual 132	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   549: invokevirtual 175	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   552: istore 11
    //   554: aload 28
    //   556: ldc_w 280
    //   559: iconst_0
    //   560: invokevirtual 253	org/json/JSONObject:optBoolean	(Ljava/lang/String;Z)Z
    //   563: istore 12
    //   565: aload 28
    //   567: ldc_w 282
    //   570: invokevirtual 230	org/json/JSONObject:optJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   573: aconst_null
    //   574: invokestatic 233	com/google/android/gms/internal/aaf:a	(Lorg/json/JSONArray;Ljava/util/List;)Ljava/util/List;
    //   577: astore 34
    //   579: aload 28
    //   581: ldc_w 284
    //   584: invokevirtual 230	org/json/JSONObject:optJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   587: aconst_null
    //   588: invokestatic 233	com/google/android/gms/internal/aaf:a	(Lorg/json/JSONArray;Ljava/util/List;)Ljava/util/List;
    //   591: astore 35
    //   593: aload 28
    //   595: ldc_w 286
    //   598: invokevirtual 230	org/json/JSONObject:optJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   601: invokestatic 291	com/google/android/gms/ads/internal/reward/mediation/client/RewardItemParcel:a	(Lorg/json/JSONArray;)Lcom/google/android/gms/ads/internal/reward/mediation/client/RewardItemParcel;
    //   604: astore 36
    //   606: aload 28
    //   608: ldc_w 293
    //   611: iconst_0
    //   612: invokevirtual 253	org/json/JSONObject:optBoolean	(Ljava/lang/String;Z)Z
    //   615: istore 13
    //   617: aload 28
    //   619: ldc_w 295
    //   622: invokevirtual 299	org/json/JSONObject:optJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   625: invokestatic 304	com/google/android/gms/ads/internal/request/AutoClickProtectionConfigurationParcel:a	(Lorg/json/JSONObject;)Lcom/google/android/gms/ads/internal/request/AutoClickProtectionConfigurationParcel;
    //   628: astore 37
    //   630: aload 28
    //   632: ldc_w 306
    //   635: ldc_w 274
    //   638: invokevirtual 132	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   641: astore 38
    //   643: aload 28
    //   645: ldc_w 308
    //   648: invokevirtual 230	org/json/JSONObject:optJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   651: aconst_null
    //   652: invokestatic 233	com/google/android/gms/internal/aaf:a	(Lorg/json/JSONArray;Ljava/util/List;)Ljava/util/List;
    //   655: astore 39
    //   657: aload 28
    //   659: ldc_w 310
    //   662: invokevirtual 299	org/json/JSONObject:optJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   665: invokestatic 315	com/google/android/gms/ads/internal/safebrowsing/SafeBrowsingConfigParcel:a	(Lorg/json/JSONObject;)Lcom/google/android/gms/ads/internal/safebrowsing/SafeBrowsingConfigParcel;
    //   668: astore 40
    //   670: aload 28
    //   672: ldc_w 317
    //   675: aload_1
    //   676: getfield 321	com/google/android/gms/ads/internal/request/AdRequestInfoParcel:M	Z
    //   679: invokevirtual 253	org/json/JSONObject:optBoolean	(Ljava/lang/String;Z)Z
    //   682: istore 14
    //   684: new 209	com/google/android/gms/ads/internal/request/AdResponseParcel
    //   687: dup
    //   688: aload_1
    //   689: aload_2
    //   690: aload 23
    //   692: aload 24
    //   694: aload 25
    //   696: lload 15
    //   698: iload 7
    //   700: lload 21
    //   702: aload 27
    //   704: lload 19
    //   706: iload_3
    //   707: aload 29
    //   709: lload 17
    //   711: aload 31
    //   713: iload 6
    //   715: aload_0
    //   716: aload 26
    //   718: iload 8
    //   720: iload 5
    //   722: aload_1
    //   723: getfield 324	com/google/android/gms/ads/internal/request/AdRequestInfoParcel:p	Z
    //   726: iload 9
    //   728: iload 10
    //   730: aload 33
    //   732: iload 11
    //   734: iload 12
    //   736: aload 36
    //   738: aload 34
    //   740: aload 35
    //   742: iload 13
    //   744: aload 37
    //   746: aload_1
    //   747: getfield 326	com/google/android/gms/ads/internal/request/AdRequestInfoParcel:I	Z
    //   750: aload 38
    //   752: aload 39
    //   754: iload 14
    //   756: aload 30
    //   758: aload 40
    //   760: aload 32
    //   762: invokespecial 329	com/google/android/gms/ads/internal/request/AdResponseParcel:<init>	(Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JZJLjava/util/List;JILjava/lang/String;JLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZZZZLjava/lang/String;ZZLcom/google/android/gms/ads/internal/reward/mediation/client/RewardItemParcel;Ljava/util/List;Ljava/util/List;ZLcom/google/android/gms/ads/internal/request/AutoClickProtectionConfigurationParcel;ZLjava/lang/String;Ljava/util/List;ZLjava/lang/String;Lcom/google/android/gms/ads/internal/safebrowsing/SafeBrowsingConfigParcel;Ljava/lang/String;)V
    //   765: astore_0
    //   766: aload_0
    //   767: areturn
    //   768: astore_0
    //   769: aload_0
    //   770: invokevirtual 333	org/json/JSONException:getMessage	()Ljava/lang/String;
    //   773: invokestatic 337	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   776: astore_0
    //   777: aload_0
    //   778: invokevirtual 340	java/lang/String:length	()I
    //   781: ifeq +51 -> 832
    //   784: ldc_w 342
    //   787: aload_0
    //   788: invokevirtual 345	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   791: astore_0
    //   792: aload_0
    //   793: invokestatic 350	com/google/android/gms/internal/abr:d	(Ljava/lang/String;)V
    //   796: new 209	com/google/android/gms/ads/internal/request/AdResponseParcel
    //   799: dup
    //   800: iconst_0
    //   801: invokespecial 220	com/google/android/gms/ads/internal/request/AdResponseParcel:<init>	(I)V
    //   804: areturn
    //   805: aload 26
    //   807: getfield 353	com/google/android/gms/ads/internal/request/AdResponseParcel:d	Ljava/util/List;
    //   810: astore_0
    //   811: goto -517 -> 294
    //   814: aload 26
    //   816: getfield 356	com/google/android/gms/ads/internal/request/AdResponseParcel:f	Ljava/util/List;
    //   819: astore_0
    //   820: goto -494 -> 326
    //   823: aload 26
    //   825: getfield 359	com/google/android/gms/ads/internal/request/AdResponseParcel:j	Ljava/util/List;
    //   828: astore_0
    //   829: goto -471 -> 358
    //   832: new 171	java/lang/String
    //   835: dup
    //   836: ldc_w 342
    //   839: invokespecial 360	java/lang/String:<init>	(Ljava/lang/String;)V
    //   842: astore_0
    //   843: goto -51 -> 792
    //   846: iload 4
    //   848: istore_3
    //   849: goto -432 -> 417
    //   852: aload_2
    //   853: astore 23
    //   855: aload 24
    //   857: astore_2
    //   858: goto -614 -> 244
    //   861: iconst_0
    //   862: istore 5
    //   864: goto -799 -> 65
    //   867: ldc2_w 36
    //   870: lstore 15
    //   872: goto -715 -> 157
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	875	0	paramContext	Context
    //   0	875	1	paramAdRequestInfoParcel	AdRequestInfoParcel
    //   0	875	2	paramString	String
    //   168	681	3	i	int
    //   375	472	4	j	int
    //   63	800	5	bool1	boolean
    //   436	278	6	bool2	boolean
    //   461	238	7	bool3	boolean
    //   472	247	8	bool4	boolean
    //   483	244	9	bool5	boolean
    //   494	235	10	bool6	boolean
    //   552	181	11	bool7	boolean
    //   563	172	12	bool8	boolean
    //   615	128	13	bool9	boolean
    //   682	73	14	bool10	boolean
    //   155	716	15	l1	long
    //   111	599	17	l2	long
    //   507	198	19	l3	long
    //   520	181	21	l4	long
    //   75	779	23	str1	String
    //   18	838	24	localObject1	Object
    //   28	667	25	localObject2	Object
    //   187	637	26	localObject3	Object
    //   317	386	27	localObject4	Object
    //   8	663	28	localJSONObject	JSONObject
    //   38	670	29	str2	String
    //   49	708	30	str3	String
    //   121	591	31	str4	String
    //   131	630	32	str5	String
    //   349	382	33	localObject5	Object
    //   577	162	34	localList1	List
    //   591	150	35	localList2	List
    //   604	133	36	localRewardItemParcel	RewardItemParcel
    //   628	117	37	localAutoClickProtectionConfigurationParcel	com.google.android.gms.ads.internal.request.AutoClickProtectionConfigurationParcel
    //   641	110	38	str6	String
    //   655	98	39	localList3	List
    //   668	91	40	localSafeBrowsingConfigParcel	com.google.android.gms.ads.internal.safebrowsing.SafeBrowsingConfigParcel
    // Exception table:
    //   from	to	target	type
    //   0	51	768	org/json/JSONException
    //   55	62	768	org/json/JSONException
    //   65	74	768	org/json/JSONException
    //   81	91	768	org/json/JSONException
    //   99	108	768	org/json/JSONException
    //   113	157	768	org/json/JSONException
    //   157	167	768	org/json/JSONException
    //   169	186	768	org/json/JSONException
    //   189	244	768	org/json/JSONException
    //   249	258	768	org/json/JSONException
    //   258	275	768	org/json/JSONException
    //   278	287	768	org/json/JSONException
    //   302	310	768	org/json/JSONException
    //   310	319	768	org/json/JSONException
    //   334	342	768	org/json/JSONException
    //   342	351	768	org/json/JSONException
    //   366	374	768	org/json/JSONException
    //   382	397	768	org/json/JSONException
    //   400	417	768	org/json/JSONException
    //   417	426	768	org/json/JSONException
    //   428	438	768	org/json/JSONException
    //   443	452	768	org/json/JSONException
    //   452	766	768	org/json/JSONException
    //   805	811	768	org/json/JSONException
    //   814	820	768	org/json/JSONException
    //   823	829	768	org/json/JSONException
  }
  
  private static Integer a(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i = 1;; i = 0) {
      return Integer.valueOf(i);
    }
  }
  
  private static String a(int paramInt)
  {
    return String.format(Locale.US, "#%06x", new Object[] { Integer.valueOf(0xFFFFFF & paramInt) });
  }
  
  private static String a(NativeAdOptionsParcel paramNativeAdOptionsParcel)
  {
    if (paramNativeAdOptionsParcel != null) {}
    for (int i = paramNativeAdOptionsParcel.c;; i = 0) {
      switch (i)
      {
      default: 
        return "any";
      }
    }
    return "portrait";
    return "landscape";
  }
  
  @Nullable
  private static List<String> a(@Nullable JSONArray paramJSONArray, @Nullable List<String> paramList)
  {
    if (paramJSONArray == null)
    {
      paramList = null;
      return paramList;
    }
    Object localObject = paramList;
    if (paramList == null) {
      localObject = new LinkedList();
    }
    int i = 0;
    for (;;)
    {
      paramList = (List<String>)localObject;
      if (i >= paramJSONArray.length()) {
        break;
      }
      ((List)localObject).add(paramJSONArray.getString(i));
      i += 1;
    }
  }
  
  @Nullable
  static JSONArray a(List<String> paramList)
  {
    JSONArray localJSONArray = new JSONArray();
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localJSONArray.put((String)paramList.next());
    }
    return localJSONArray;
  }
  
  @Nullable
  public static JSONObject a(Context paramContext, aab paramaab)
  {
    paramContext = paramaab.h;
    Location localLocation = paramaab.d;
    aak localaak = paramaab.i;
    Bundle localBundle = paramaab.a;
    JSONObject localJSONObject = paramaab.j;
    for (;;)
    {
      HashMap localHashMap;
      Object localObject;
      int m;
      int i;
      int j;
      AdSizeParcel localAdSizeParcel;
      int k;
      try
      {
        localHashMap = new HashMap();
        localHashMap.put("extra_caps", uf.bE.c());
        if (paramaab.c.size() > 0) {
          localHashMap.put("eid", TextUtils.join(",", paramaab.c));
        }
        if (paramContext.b != null) {
          localHashMap.put("ad_pos", paramContext.b);
        }
        a(localHashMap, paramContext.c);
        AdSizeParcel[] arrayOfAdSizeParcel;
        if (paramContext.d.h == null)
        {
          localHashMap.put("format", paramContext.d.b);
          if (paramContext.d.j) {
            localHashMap.put("fluid", "height");
          }
          if (paramContext.d.f == -1) {
            localHashMap.put("smart_w", "full");
          }
          if (paramContext.d.c == -2) {
            localHashMap.put("smart_h", "auto");
          }
          if (paramContext.d.h == null) {
            break label564;
          }
          localObject = new StringBuilder();
          arrayOfAdSizeParcel = paramContext.d.h;
          m = arrayOfAdSizeParcel.length;
          i = 0;
          j = 0;
          if (i >= m) {
            break label521;
          }
          localAdSizeParcel = arrayOfAdSizeParcel[i];
          if (localAdSizeParcel.j)
          {
            j = 1;
            break label1567;
          }
        }
        else
        {
          localObject = paramContext.d.h;
          int n = localObject.length;
          j = 0;
          m = 0;
          i = 0;
          if (i >= n) {
            continue;
          }
          arrayOfAdSizeParcel = localObject[i];
          k = m;
          if (!arrayOfAdSizeParcel.j)
          {
            k = m;
            if (m == 0)
            {
              localHashMap.put("format", arrayOfAdSizeParcel.b);
              k = 1;
            }
          }
          m = j;
          if (!arrayOfAdSizeParcel.j) {
            break label1574;
          }
          m = j;
          if (j != 0) {
            break label1574;
          }
          localHashMap.put("fluid", "height");
          m = 1;
          break label1574;
        }
        if (((StringBuilder)localObject).length() != 0) {
          ((StringBuilder)localObject).append("|");
        }
        if (localAdSizeParcel.f == -1)
        {
          k = (int)(localAdSizeParcel.g / localaak.r);
          ((StringBuilder)localObject).append(k);
          ((StringBuilder)localObject).append("x");
          if (localAdSizeParcel.c != -2) {
            break label511;
          }
          k = (int)(localAdSizeParcel.d / localaak.r);
          label460:
          ((StringBuilder)localObject).append(k);
        }
      }
      catch (JSONException paramContext)
      {
        paramContext = String.valueOf(paramContext.getMessage());
        if (paramContext.length() == 0) {}
      }
      for (paramContext = "Problem serializing ad request to JSON: ".concat(paramContext);; paramContext = new String("Problem serializing ad request to JSON: "))
      {
        abr.d(paramContext);
        return null;
        k = localAdSizeParcel.f;
        break;
        label511:
        k = localAdSizeParcel.c;
        break label460;
        label521:
        if (j != 0)
        {
          if (((StringBuilder)localObject).length() != 0) {
            ((StringBuilder)localObject).insert(0, "|");
          }
          ((StringBuilder)localObject).insert(0, "320x50");
        }
        localHashMap.put("sz", localObject);
        label564:
        if (paramContext.m != 0)
        {
          localHashMap.put("native_version", Integer.valueOf(paramContext.m));
          localHashMap.put("native_templates", paramContext.n);
          localHashMap.put("native_image_orientation", a(paramContext.z));
          if (!paramContext.A.isEmpty()) {
            localHashMap.put("native_custom_templates", paramContext.A);
          }
        }
        if (paramContext.d.k) {
          localHashMap.put("ene", Boolean.valueOf(true));
        }
        localHashMap.put("slotname", paramContext.e);
        localHashMap.put("pn", paramContext.f.packageName);
        if (paramContext.g != null) {
          localHashMap.put("vc", Integer.valueOf(paramContext.g.versionCode));
        }
        localHashMap.put("ms", paramaab.g);
        localHashMap.put("seq_num", paramContext.i);
        localHashMap.put("session_id", paramContext.j);
        localHashMap.put("js", paramContext.k.b);
        a(localHashMap, localaak, paramaab.e, paramContext.O, paramaab.b);
        a(localHashMap, paramaab.f);
        localHashMap.put("platform", Build.MANUFACTURER);
        localHashMap.put("submodel", Build.MODEL);
        if (localLocation != null) {
          a(localHashMap, localLocation);
        }
        for (;;)
        {
          if (paramContext.a >= 2) {
            localHashMap.put("quality_signals", paramContext.l);
          }
          if ((paramContext.a >= 4) && (paramContext.p)) {
            localHashMap.put("forceHttps", Boolean.valueOf(paramContext.p));
          }
          if (localBundle != null) {
            localHashMap.put("content_info", localBundle);
          }
          label962:
          boolean bool;
          if (paramContext.a >= 5)
          {
            localHashMap.put("u_sd", Float.valueOf(paramContext.t));
            localHashMap.put("sh", Integer.valueOf(paramContext.s));
            localHashMap.put("sw", Integer.valueOf(paramContext.r));
            if (paramContext.a >= 6)
            {
              bool = TextUtils.isEmpty(paramContext.u);
              if (bool) {}
            }
          }
          try
          {
            localHashMap.put("view_hierarchy", new JSONObject(paramContext.u));
            localHashMap.put("correlation_id", Long.valueOf(paramContext.v));
            if (paramContext.a >= 7) {
              localHashMap.put("request_id", paramContext.w);
            }
            if ((paramContext.a >= 11) && (paramContext.C != null)) {
              localHashMap.put("capability", paramContext.C.a());
            }
            if ((paramContext.a >= 12) && (!TextUtils.isEmpty(paramContext.D))) {
              localHashMap.put("anchor", paramContext.D);
            }
            if (paramContext.a >= 13) {
              localHashMap.put("android_app_volume", Float.valueOf(paramContext.E));
            }
            if (paramContext.a >= 18) {
              localHashMap.put("android_app_muted", Boolean.valueOf(paramContext.K));
            }
            if ((paramContext.a >= 14) && (paramContext.F > 0)) {
              localHashMap.put("target_api", Integer.valueOf(paramContext.F));
            }
            if (paramContext.a >= 15)
            {
              if (paramContext.G == -1)
              {
                i = -1;
                localHashMap.put("scroll_index", Integer.valueOf(i));
              }
            }
            else
            {
              if (paramContext.a >= 16) {
                localHashMap.put("_activity_context", Boolean.valueOf(paramContext.H));
              }
              if (paramContext.a >= 18)
              {
                bool = TextUtils.isEmpty(paramContext.L);
                if (bool) {}
              }
            }
          }
          catch (JSONException paramaab)
          {
            try
            {
              for (;;)
              {
                localHashMap.put("app_settings", new JSONObject(paramContext.L));
                localHashMap.put("render_in_browser", Boolean.valueOf(paramContext.M));
                if (paramContext.a >= 18) {
                  localHashMap.put("android_num_video_cache_tasks", Integer.valueOf(paramContext.N));
                }
                a(localHashMap);
                localHashMap.put("cache_state", localJSONObject);
                if (paramContext.a >= 19) {
                  localHashMap.put("gct", paramContext.P);
                }
                if (abr.a(2))
                {
                  paramContext = String.valueOf(u.e().a(localHashMap).toString(2));
                  if (paramContext.length() == 0) {
                    break label1539;
                  }
                  paramContext = "Ad Request JSON: ".concat(paramContext);
                  abr.e(paramContext);
                }
                return u.e().a(localHashMap);
                if ((paramContext.c.a < 2) || (paramContext.c.k == null)) {
                  break;
                }
                a(localHashMap, paramContext.c.k);
                break;
                localHashMap.put("u_sd", Float.valueOf(localaak.r));
                localHashMap.put("sh", Integer.valueOf(localaak.t));
                localHashMap.put("sw", Integer.valueOf(localaak.s));
                break label962;
                paramaab = paramaab;
                abr.d("Problem serializing view hierarchy to JSON", paramaab);
              }
              i = paramContext.G;
            }
            catch (JSONException paramaab)
            {
              for (;;)
              {
                abr.d("Problem creating json from app settings", paramaab);
                continue;
                label1539:
                paramContext = new String("Ad Request JSON: ");
              }
            }
          }
        }
      }
      label1567:
      i += 1;
      continue;
      label1574:
      if ((k == 0) || (m == 0))
      {
        i += 1;
        j = m;
        m = k;
      }
    }
  }
  
  public static JSONObject a(AdResponseParcel paramAdResponseParcel)
  {
    JSONObject localJSONObject = new JSONObject();
    if (paramAdResponseParcel.b != null) {
      localJSONObject.put("ad_base_url", paramAdResponseParcel.b);
    }
    if (paramAdResponseParcel.m != null) {
      localJSONObject.put("ad_size", paramAdResponseParcel.m);
    }
    localJSONObject.put("native", paramAdResponseParcel.t);
    if (paramAdResponseParcel.t)
    {
      localJSONObject.put("ad_json", paramAdResponseParcel.c);
      if (paramAdResponseParcel.o != null) {
        localJSONObject.put("debug_dialog", paramAdResponseParcel.o);
      }
      if (paramAdResponseParcel.N != null) {
        localJSONObject.put("debug_signals", paramAdResponseParcel.N);
      }
      if (paramAdResponseParcel.g != -1L) {
        localJSONObject.put("interstitial_timeout", paramAdResponseParcel.g / 1000.0D);
      }
      if (paramAdResponseParcel.l != u.g().b()) {
        break label535;
      }
      localJSONObject.put("orientation", "portrait");
      label159:
      if (paramAdResponseParcel.d != null) {
        localJSONObject.put("click_urls", a(paramAdResponseParcel.d));
      }
      if (paramAdResponseParcel.f != null) {
        localJSONObject.put("impression_urls", a(paramAdResponseParcel.f));
      }
      if (paramAdResponseParcel.j != null) {
        localJSONObject.put("manual_impression_urls", a(paramAdResponseParcel.j));
      }
      if (paramAdResponseParcel.r != null) {
        localJSONObject.put("active_view", paramAdResponseParcel.r);
      }
      localJSONObject.put("ad_is_javascript", paramAdResponseParcel.p);
      if (paramAdResponseParcel.q != null) {
        localJSONObject.put("ad_passback_url", paramAdResponseParcel.q);
      }
      localJSONObject.put("mediation", paramAdResponseParcel.h);
      localJSONObject.put("custom_render_allowed", paramAdResponseParcel.s);
      localJSONObject.put("content_url_opted_out", paramAdResponseParcel.v);
      localJSONObject.put("prefetch", paramAdResponseParcel.w);
      if (paramAdResponseParcel.k != -1L) {
        localJSONObject.put("refresh_interval_milliseconds", paramAdResponseParcel.k);
      }
      if (paramAdResponseParcel.i != -1L) {
        localJSONObject.put("mediation_config_cache_time_milliseconds", paramAdResponseParcel.i);
      }
      if (!TextUtils.isEmpty(paramAdResponseParcel.z)) {
        localJSONObject.put("gws_query_id", paramAdResponseParcel.z);
      }
      if (!paramAdResponseParcel.A) {
        break label560;
      }
    }
    label535:
    label560:
    for (String str = "height";; str = "")
    {
      localJSONObject.put("fluid", str);
      localJSONObject.put("native_express", paramAdResponseParcel.B);
      if (paramAdResponseParcel.D != null) {
        localJSONObject.put("video_start_urls", a(paramAdResponseParcel.D));
      }
      if (paramAdResponseParcel.E != null) {
        localJSONObject.put("video_complete_urls", a(paramAdResponseParcel.E));
      }
      if (paramAdResponseParcel.C != null) {
        localJSONObject.put("rewards", paramAdResponseParcel.C.a());
      }
      localJSONObject.put("use_displayed_impression", paramAdResponseParcel.F);
      localJSONObject.put("auto_protection_configuration", paramAdResponseParcel.G);
      localJSONObject.put("render_in_browser", paramAdResponseParcel.K);
      return localJSONObject;
      localJSONObject.put("ad_html", paramAdResponseParcel.c);
      break;
      if (paramAdResponseParcel.l != u.g().a()) {
        break label159;
      }
      localJSONObject.put("orientation", "landscape");
      break label159;
    }
  }
  
  private static void a(HashMap<String, Object> paramHashMap)
  {
    Bundle localBundle1 = new Bundle();
    Bundle localBundle2 = new Bundle();
    localBundle2.putString("cl", "133155058");
    localBundle2.putString("rapid_rc", "dev");
    localBundle2.putString("rapid_rollup", "HEAD");
    localBundle1.putBundle("build_meta", localBundle2);
    localBundle1.putString("mf", Boolean.toString(((Boolean)uf.bG.c()).booleanValue()));
    paramHashMap.put("sdk_env", localBundle1);
  }
  
  private static void a(HashMap<String, Object> paramHashMap, Location paramLocation)
  {
    HashMap localHashMap = new HashMap();
    float f = paramLocation.getAccuracy();
    long l1 = paramLocation.getTime();
    long l2 = (paramLocation.getLatitude() * 1.0E7D);
    long l3 = (paramLocation.getLongitude() * 1.0E7D);
    localHashMap.put("radius", Float.valueOf(f * 1000.0F));
    localHashMap.put("lat", Long.valueOf(l2));
    localHashMap.put("long", Long.valueOf(l3));
    localHashMap.put("time", Long.valueOf(l1 * 1000L));
    paramHashMap.put("uule", localHashMap);
  }
  
  private static void a(HashMap<String, Object> paramHashMap, AdRequestParcel paramAdRequestParcel)
  {
    String str = abp.a();
    if (str != null) {
      paramHashMap.put("abf", str);
    }
    if (paramAdRequestParcel.b != -1L) {
      paramHashMap.put("cust_age", a.format(new Date(paramAdRequestParcel.b)));
    }
    if (paramAdRequestParcel.c != null) {
      paramHashMap.put("extras", paramAdRequestParcel.c);
    }
    if (paramAdRequestParcel.d != -1) {
      paramHashMap.put("cust_gender", Integer.valueOf(paramAdRequestParcel.d));
    }
    if (paramAdRequestParcel.e != null) {
      paramHashMap.put("kw", paramAdRequestParcel.e);
    }
    if (paramAdRequestParcel.g != -1) {
      paramHashMap.put("tag_for_child_directed_treatment", Integer.valueOf(paramAdRequestParcel.g));
    }
    if (paramAdRequestParcel.f) {
      paramHashMap.put("adtest", "on");
    }
    if (paramAdRequestParcel.a >= 2)
    {
      if (paramAdRequestParcel.h) {
        paramHashMap.put("d_imp_hdr", Integer.valueOf(1));
      }
      if (!TextUtils.isEmpty(paramAdRequestParcel.i)) {
        paramHashMap.put("ppid", paramAdRequestParcel.i);
      }
      if (paramAdRequestParcel.j != null) {
        a(paramHashMap, paramAdRequestParcel.j);
      }
    }
    if ((paramAdRequestParcel.a >= 3) && (paramAdRequestParcel.l != null)) {
      paramHashMap.put("url", paramAdRequestParcel.l);
    }
    if (paramAdRequestParcel.a >= 5)
    {
      if (paramAdRequestParcel.n != null) {
        paramHashMap.put("custom_targeting", paramAdRequestParcel.n);
      }
      if (paramAdRequestParcel.o != null) {
        paramHashMap.put("category_exclusions", paramAdRequestParcel.o);
      }
      if (paramAdRequestParcel.p != null) {
        paramHashMap.put("request_agent", paramAdRequestParcel.p);
      }
    }
    if ((paramAdRequestParcel.a >= 6) && (paramAdRequestParcel.q != null)) {
      paramHashMap.put("request_pkg", paramAdRequestParcel.q);
    }
    if (paramAdRequestParcel.a >= 7) {
      paramHashMap.put("is_designed_for_families", Boolean.valueOf(paramAdRequestParcel.r));
    }
  }
  
  private static void a(HashMap<String, Object> paramHashMap, SearchAdRequestParcel paramSearchAdRequestParcel)
  {
    Object localObject2 = null;
    if (Color.alpha(paramSearchAdRequestParcel.b) != 0) {
      paramHashMap.put("acolor", a(paramSearchAdRequestParcel.b));
    }
    if (Color.alpha(paramSearchAdRequestParcel.c) != 0) {
      paramHashMap.put("bgcolor", a(paramSearchAdRequestParcel.c));
    }
    if ((Color.alpha(paramSearchAdRequestParcel.d) != 0) && (Color.alpha(paramSearchAdRequestParcel.e) != 0))
    {
      paramHashMap.put("gradientto", a(paramSearchAdRequestParcel.d));
      paramHashMap.put("gradientfrom", a(paramSearchAdRequestParcel.e));
    }
    if (Color.alpha(paramSearchAdRequestParcel.f) != 0) {
      paramHashMap.put("bcolor", a(paramSearchAdRequestParcel.f));
    }
    paramHashMap.put("bthick", Integer.toString(paramSearchAdRequestParcel.g));
    Object localObject1;
    switch (paramSearchAdRequestParcel.h)
    {
    default: 
      localObject1 = null;
      if (localObject1 != null) {
        paramHashMap.put("btype", localObject1);
      }
      switch (paramSearchAdRequestParcel.i)
      {
      default: 
        localObject1 = localObject2;
      }
      break;
    }
    for (;;)
    {
      if (localObject1 != null) {
        paramHashMap.put("callbuttoncolor", localObject1);
      }
      if (paramSearchAdRequestParcel.j != null) {
        paramHashMap.put("channel", paramSearchAdRequestParcel.j);
      }
      if (Color.alpha(paramSearchAdRequestParcel.k) != 0) {
        paramHashMap.put("dcolor", a(paramSearchAdRequestParcel.k));
      }
      if (paramSearchAdRequestParcel.l != null) {
        paramHashMap.put("font", paramSearchAdRequestParcel.l);
      }
      if (Color.alpha(paramSearchAdRequestParcel.m) != 0) {
        paramHashMap.put("hcolor", a(paramSearchAdRequestParcel.m));
      }
      paramHashMap.put("headersize", Integer.toString(paramSearchAdRequestParcel.n));
      if (paramSearchAdRequestParcel.o != null) {
        paramHashMap.put("q", paramSearchAdRequestParcel.o);
      }
      return;
      localObject1 = "none";
      break;
      localObject1 = "dashed";
      break;
      localObject1 = "dotted";
      break;
      localObject1 = "solid";
      break;
      localObject1 = "dark";
      continue;
      localObject1 = "light";
      continue;
      localObject1 = "medium";
    }
  }
  
  private static void a(HashMap<String, Object> paramHashMap, aak paramaak, aao.a parama, Bundle paramBundle1, Bundle paramBundle2)
  {
    paramHashMap.put("am", Integer.valueOf(paramaak.a));
    paramHashMap.put("cog", a(paramaak.b));
    paramHashMap.put("coh", a(paramaak.c));
    if (!TextUtils.isEmpty(paramaak.d)) {
      paramHashMap.put("carrier", paramaak.d);
    }
    paramHashMap.put("gl", paramaak.e);
    if (paramaak.f) {
      paramHashMap.put("simulator", Integer.valueOf(1));
    }
    if (paramaak.g) {
      paramHashMap.put("is_sidewinder", Integer.valueOf(1));
    }
    paramHashMap.put("ma", a(paramaak.h));
    paramHashMap.put("sp", a(paramaak.i));
    paramHashMap.put("hl", paramaak.j);
    if (!TextUtils.isEmpty(paramaak.k)) {
      paramHashMap.put("mv", paramaak.k);
    }
    paramHashMap.put("muv", Integer.valueOf(paramaak.l));
    if (paramaak.m != -2) {
      paramHashMap.put("cnt", Integer.valueOf(paramaak.m));
    }
    paramHashMap.put("gnt", Integer.valueOf(paramaak.n));
    paramHashMap.put("pt", Integer.valueOf(paramaak.o));
    paramHashMap.put("rm", Integer.valueOf(paramaak.p));
    paramHashMap.put("riv", Integer.valueOf(paramaak.q));
    Bundle localBundle1 = new Bundle();
    localBundle1.putString("build", paramaak.y);
    Bundle localBundle2 = new Bundle();
    localBundle2.putBoolean("is_charging", paramaak.v);
    localBundle2.putDouble("battery_level", paramaak.u);
    localBundle1.putBundle("battery", localBundle2);
    localBundle2 = new Bundle();
    localBundle2.putInt("active_network_state", paramaak.x);
    localBundle2.putBoolean("active_network_metered", paramaak.w);
    if (parama != null)
    {
      parama = new Bundle();
      parama.putInt("predicted_latency_micros", 0);
      parama.putLong("predicted_down_throughput_bps", 0L);
      parama.putLong("predicted_up_throughput_bps", 0L);
      localBundle2.putBundle("predictions", parama);
    }
    localBundle1.putBundle("network", localBundle2);
    parama = new Bundle();
    parama.putBoolean("is_browser_custom_tabs_capable", paramaak.z);
    localBundle1.putBundle("browser", parama);
    if (paramBundle1 != null) {
      localBundle1.putBundle("android_mem_info", a(paramBundle1));
    }
    paramaak = new Bundle();
    paramaak.putBundle("parental_controls", paramBundle2);
    localBundle1.putBundle("play_store", paramaak);
    paramHashMap.put("device", localBundle1);
  }
  
  private static void a(HashMap<String, Object> paramHashMap, String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("doritos", paramString);
    paramHashMap.put("pii", localBundle);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/aaf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */