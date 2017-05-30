package com.baidu.tts.e;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.h.b.b;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class a
{
  private static List<Integer> a(JSONObject paramJSONObject, Cursor paramCursor, int paramInt1, int paramInt2)
  {
    if (paramCursor == null) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    JSONArray localJSONArray = new JSONArray();
    int i = 0;
    boolean bool = paramCursor.moveToPosition(paramInt1);
    paramInt1 = i;
    for (;;)
    {
      String str1;
      int j;
      int k;
      int m;
      String str2;
      JSONObject localJSONObject;
      if (bool)
      {
        i = paramCursor.getInt(paramCursor.getColumnIndex("_id"));
        str1 = paramCursor.getString(paramCursor.getColumnIndex("time"));
        j = paramCursor.getInt(paramCursor.getColumnIndex("code"));
        k = paramCursor.getInt(paramCursor.getColumnIndex("cmd_type"));
        m = paramCursor.getInt(paramCursor.getColumnIndex("cmd_id"));
        str2 = paramCursor.getString(paramCursor.getColumnIndex("result"));
        localArrayList.add(Integer.valueOf(i));
        localJSONObject = new JSONObject();
      }
      try
      {
        localJSONObject.put("time", Long.parseLong(str1));
        localJSONObject.put("error_code", j);
        if (j == 0)
        {
          localJSONObject.put("cmd_type", k);
          localJSONObject.put("cmd_id", m);
          localJSONObject.put("voice_to_text_result", str2);
        }
        localJSONArray.put(localJSONObject);
      }
      catch (JSONException localJSONException)
      {
        for (;;)
        {
          LoggerProxy.d("StatHelper", "je:" + localJSONException);
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        for (;;)
        {
          LoggerProxy.d("StatHelper", "e " + localNumberFormatException);
        }
        bool = paramCursor.moveToNext();
      }
      paramInt1 += 1;
      if (paramInt1 >= paramInt2) {
        try
        {
          paramJSONObject.put("recog_results", localJSONArray);
          return localArrayList;
        }
        catch (JSONException paramJSONObject)
        {
          LoggerProxy.d("StatHelper", "je:" + paramJSONObject);
          return localArrayList;
        }
      }
    }
  }
  
  /* Error */
  private static org.apache.http.client.entity.UrlEncodedFormEntity a(String paramString)
  {
    // Byte code:
    //   0: new 12	java/util/ArrayList
    //   3: dup
    //   4: invokespecial 16	java/util/ArrayList:<init>	()V
    //   7: astore_1
    //   8: aload_1
    //   9: new 127	org/apache/http/message/BasicNameValuePair
    //   12: dup
    //   13: ldc -127
    //   15: aload_0
    //   16: invokespecial 131	org/apache/http/message/BasicNameValuePair:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   19: invokeinterface 61 2 0
    //   24: pop
    //   25: new 133	org/apache/http/client/entity/UrlEncodedFormEntity
    //   28: dup
    //   29: aload_1
    //   30: ldc -121
    //   32: invokespecial 138	org/apache/http/client/entity/UrlEncodedFormEntity:<init>	(Ljava/util/List;Ljava/lang/String;)V
    //   35: astore_0
    //   36: aload_0
    //   37: ldc -116
    //   39: invokevirtual 144	org/apache/http/client/entity/UrlEncodedFormEntity:setContentType	(Ljava/lang/String;)V
    //   42: aload_0
    //   43: areturn
    //   44: astore_1
    //   45: aconst_null
    //   46: astore_0
    //   47: aload_1
    //   48: invokevirtual 147	java/io/UnsupportedEncodingException:printStackTrace	()V
    //   51: aload_0
    //   52: areturn
    //   53: astore_1
    //   54: goto -7 -> 47
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	57	0	paramString	String
    //   7	23	1	localArrayList	ArrayList
    //   44	4	1	localUnsupportedEncodingException1	java.io.UnsupportedEncodingException
    //   53	1	1	localUnsupportedEncodingException2	java.io.UnsupportedEncodingException
    // Exception table:
    //   from	to	target	type
    //   25	36	44	java/io/UnsupportedEncodingException
    //   36	42	53	java/io/UnsupportedEncodingException
  }
  
  /* Error */
  public static void a(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: aload_0
    //   4: invokestatic 154	com/baidu/android/common/net/ConnectManager:isNetworkConnected	(Landroid/content/Context;)Z
    //   7: ifeq +178 -> 185
    //   10: aload_0
    //   11: invokestatic 159	com/baidu/tts/e/d:a	(Landroid/content/Context;)J
    //   14: lstore 5
    //   16: aload_0
    //   17: invokestatic 163	com/baidu/tts/e/d:b	(Landroid/content/Context;)I
    //   20: istore_2
    //   21: ldc2_w 164
    //   24: lstore_3
    //   25: iload_2
    //   26: ifle +6 -> 32
    //   29: iload_2
    //   30: i2l
    //   31: lstore_3
    //   32: ldc 91
    //   34: new 93	java/lang/StringBuilder
    //   37: dup
    //   38: invokespecial 94	java/lang/StringBuilder:<init>	()V
    //   41: ldc -89
    //   43: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   46: lload 5
    //   48: invokevirtual 170	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   51: ldc -84
    //   53: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   56: invokestatic 178	java/lang/System:currentTimeMillis	()J
    //   59: invokevirtual 170	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   62: ldc -76
    //   64: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: iload_2
    //   68: invokevirtual 183	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   71: invokevirtual 107	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   74: invokestatic 113	com/baidu/tts/chainofresponsibility/logger/LoggerProxy:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   77: invokestatic 178	java/lang/System:currentTimeMillis	()J
    //   80: lstore 7
    //   82: new 185	java/util/Date
    //   85: dup
    //   86: lload 5
    //   88: invokespecial 188	java/util/Date:<init>	(J)V
    //   91: astore 9
    //   93: new 185	java/util/Date
    //   96: dup
    //   97: lload 7
    //   99: invokespecial 188	java/util/Date:<init>	(J)V
    //   102: astore 10
    //   104: lload 7
    //   106: lload 5
    //   108: lsub
    //   109: lload_3
    //   110: lcmp
    //   111: ifge +78 -> 189
    //   114: ldc 91
    //   116: new 93	java/lang/StringBuilder
    //   119: dup
    //   120: invokespecial 94	java/lang/StringBuilder:<init>	()V
    //   123: ldc -89
    //   125: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   128: lload 5
    //   130: invokevirtual 170	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   133: ldc -84
    //   135: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   138: invokestatic 178	java/lang/System:currentTimeMillis	()J
    //   141: invokevirtual 170	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   144: invokevirtual 107	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   147: invokestatic 113	com/baidu/tts/chainofresponsibility/logger/LoggerProxy:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   150: ldc 91
    //   152: new 93	java/lang/StringBuilder
    //   155: dup
    //   156: invokespecial 94	java/lang/StringBuilder:<init>	()V
    //   159: ldc -66
    //   161: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   164: aload 9
    //   166: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   169: ldc -64
    //   171: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   174: aload 10
    //   176: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   179: invokevirtual 107	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   182: invokestatic 113	com/baidu/tts/chainofresponsibility/logger/LoggerProxy:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   185: ldc 2
    //   187: monitorexit
    //   188: return
    //   189: aload_0
    //   190: aload_1
    //   191: invokestatic 195	com/baidu/tts/e/a:b	(Landroid/content/Context;Ljava/lang/String;)Z
    //   194: ifeq -9 -> 185
    //   197: aload_0
    //   198: aload_1
    //   199: invokestatic 198	com/baidu/tts/e/a:c	(Landroid/content/Context;Ljava/lang/String;)Z
    //   202: pop
    //   203: goto -18 -> 185
    //   206: astore_0
    //   207: ldc 2
    //   209: monitorexit
    //   210: aload_0
    //   211: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	212	0	paramContext	Context
    //   0	212	1	paramString	String
    //   20	48	2	i	int
    //   24	86	3	l1	long
    //   14	115	5	l2	long
    //   80	25	7	l3	long
    //   91	74	9	localDate1	java.util.Date
    //   102	73	10	localDate2	java.util.Date
    // Exception table:
    //   from	to	target	type
    //   3	21	206	finally
    //   32	104	206	finally
    //   114	185	206	finally
    //   189	203	206	finally
  }
  
  /* Error */
  private static boolean a(Context paramContext, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 4
    //   3: new 207	com/baidu/android/common/net/ProxyHttpClient
    //   6: dup
    //   7: aload_0
    //   8: invokespecial 210	com/baidu/android/common/net/ProxyHttpClient:<init>	(Landroid/content/Context;)V
    //   11: astore 6
    //   13: aload_0
    //   14: aload_1
    //   15: invokestatic 213	com/baidu/tts/e/a:d	(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   18: astore_0
    //   19: ldc 91
    //   21: new 93	java/lang/StringBuilder
    //   24: dup
    //   25: invokespecial 94	java/lang/StringBuilder:<init>	()V
    //   28: ldc -41
    //   30: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   33: aload_0
    //   34: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   37: invokevirtual 107	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   40: invokestatic 113	com/baidu/tts/chainofresponsibility/logger/LoggerProxy:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   43: new 217	org/apache/http/client/methods/HttpPost
    //   46: dup
    //   47: aload_0
    //   48: invokespecial 219	org/apache/http/client/methods/HttpPost:<init>	(Ljava/lang/String;)V
    //   51: astore_0
    //   52: aload_0
    //   53: ldc -35
    //   55: ldc -116
    //   57: invokevirtual 224	org/apache/http/client/methods/HttpPost:addHeader	(Ljava/lang/String;Ljava/lang/String;)V
    //   60: aload_0
    //   61: aload_2
    //   62: invokestatic 226	com/baidu/tts/e/a:a	(Ljava/lang/String;)Lorg/apache/http/client/entity/UrlEncodedFormEntity;
    //   65: invokevirtual 230	org/apache/http/client/methods/HttpPost:setEntity	(Lorg/apache/http/HttpEntity;)V
    //   68: aload 6
    //   70: aload_0
    //   71: invokevirtual 234	com/baidu/android/common/net/ProxyHttpClient:execute	(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    //   74: astore_0
    //   75: ldc 91
    //   77: new 93	java/lang/StringBuilder
    //   80: dup
    //   81: invokespecial 94	java/lang/StringBuilder:<init>	()V
    //   84: ldc -20
    //   86: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   89: aload_0
    //   90: invokeinterface 242 1 0
    //   95: invokeinterface 248 1 0
    //   100: invokevirtual 183	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   103: invokevirtual 107	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   106: invokestatic 113	com/baidu/tts/chainofresponsibility/logger/LoggerProxy:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   109: iload 4
    //   111: istore_3
    //   112: aload_0
    //   113: invokeinterface 242 1 0
    //   118: invokeinterface 248 1 0
    //   123: sipush 200
    //   126: if_icmpne +86 -> 212
    //   129: aload_0
    //   130: invokeinterface 252 1 0
    //   135: ldc -121
    //   137: invokestatic 257	org/apache/http/util/EntityUtils:toString	(Lorg/apache/http/HttpEntity;Ljava/lang/String;)Ljava/lang/String;
    //   140: astore_0
    //   141: ldc 91
    //   143: new 93	java/lang/StringBuilder
    //   146: dup
    //   147: invokespecial 94	java/lang/StringBuilder:<init>	()V
    //   150: ldc_w 259
    //   153: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   156: aload_0
    //   157: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   160: invokevirtual 107	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   163: invokestatic 113	com/baidu/tts/chainofresponsibility/logger/LoggerProxy:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   166: aload_0
    //   167: invokestatic 265	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   170: istore 5
    //   172: iload 4
    //   174: istore_3
    //   175: iload 5
    //   177: ifne +35 -> 212
    //   180: ldc_w 267
    //   183: new 63	org/json/JSONObject
    //   186: dup
    //   187: aload_0
    //   188: invokespecial 268	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   191: ldc_w 270
    //   194: invokevirtual 274	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   197: invokevirtual 279	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   200: istore 5
    //   202: iload 4
    //   204: istore_3
    //   205: iload 5
    //   207: ifeq +5 -> 212
    //   210: iconst_1
    //   211: istore_3
    //   212: aload 6
    //   214: invokevirtual 282	com/baidu/android/common/net/ProxyHttpClient:close	()V
    //   217: iload_3
    //   218: ireturn
    //   219: astore_0
    //   220: ldc 91
    //   222: new 93	java/lang/StringBuilder
    //   225: dup
    //   226: invokespecial 94	java/lang/StringBuilder:<init>	()V
    //   229: ldc_w 284
    //   232: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   235: aload_0
    //   236: invokevirtual 285	org/json/JSONException:toString	()Ljava/lang/String;
    //   239: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   242: invokevirtual 107	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   245: invokestatic 113	com/baidu/tts/chainofresponsibility/logger/LoggerProxy:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   248: iload 4
    //   250: istore_3
    //   251: goto -39 -> 212
    //   254: astore_0
    //   255: aload_0
    //   256: invokevirtual 286	org/apache/http/client/ClientProtocolException:printStackTrace	()V
    //   259: aload 6
    //   261: invokevirtual 282	com/baidu/android/common/net/ProxyHttpClient:close	()V
    //   264: iconst_0
    //   265: ireturn
    //   266: astore_0
    //   267: ldc 91
    //   269: new 93	java/lang/StringBuilder
    //   272: dup
    //   273: invokespecial 94	java/lang/StringBuilder:<init>	()V
    //   276: ldc_w 284
    //   279: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   282: aload_0
    //   283: invokevirtual 287	java/lang/Exception:toString	()Ljava/lang/String;
    //   286: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   289: invokevirtual 107	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   292: invokestatic 113	com/baidu/tts/chainofresponsibility/logger/LoggerProxy:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   295: iload 4
    //   297: istore_3
    //   298: goto -86 -> 212
    //   301: astore_0
    //   302: aload_0
    //   303: invokevirtual 288	java/io/IOException:printStackTrace	()V
    //   306: aload 6
    //   308: invokevirtual 282	com/baidu/android/common/net/ProxyHttpClient:close	()V
    //   311: iconst_0
    //   312: ireturn
    //   313: astore_0
    //   314: aload 6
    //   316: invokevirtual 282	com/baidu/android/common/net/ProxyHttpClient:close	()V
    //   319: aload_0
    //   320: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	321	0	paramContext	Context
    //   0	321	1	paramString1	String
    //   0	321	2	paramString2	String
    //   111	187	3	bool1	boolean
    //   1	295	4	bool2	boolean
    //   170	36	5	bool3	boolean
    //   11	304	6	localProxyHttpClient	com.baidu.android.common.net.ProxyHttpClient
    // Exception table:
    //   from	to	target	type
    //   180	202	219	org/json/JSONException
    //   68	109	254	org/apache/http/client/ClientProtocolException
    //   112	172	254	org/apache/http/client/ClientProtocolException
    //   180	202	254	org/apache/http/client/ClientProtocolException
    //   220	248	254	org/apache/http/client/ClientProtocolException
    //   267	295	254	org/apache/http/client/ClientProtocolException
    //   180	202	266	java/lang/Exception
    //   68	109	301	java/io/IOException
    //   112	172	301	java/io/IOException
    //   180	202	301	java/io/IOException
    //   220	248	301	java/io/IOException
    //   267	295	301	java/io/IOException
    //   68	109	313	finally
    //   112	172	313	finally
    //   180	202	313	finally
    //   220	248	313	finally
    //   255	259	313	finally
    //   267	295	313	finally
    //   302	306	313	finally
  }
  
  private static boolean b(Context paramContext, String paramString)
  {
    Cursor localCursor;
    synchronized (c.a(paramContext))
    {
      if (!???.d())
      {
        localCursor = ???.b();
        if (localCursor == null) {
          break label346;
        }
      }
    }
    for (;;)
    {
      try
      {
        int i = localCursor.getCount();
        if (i >= 1)
        {
          LoggerProxy.d("StatHelper", "cursor.getCount: " + localCursor.getCount());
          int j;
          boolean bool1;
          List localList;
          if (localCursor.getCount() % 500 == 0)
          {
            i = localCursor.getCount() / 500;
            j = 0;
            bool1 = false;
            bool2 = bool1;
            if (j >= i) {
              continue;
            }
            Object localObject = new JSONObject();
            localList = a((JSONObject)localObject, localCursor, j * 500, 500);
            LoggerProxy.d("StatHelper", "jsonObj all: " + ((JSONObject)localObject).toString());
            localObject = d.a(((JSONObject)localObject).toString());
            if (localObject.length >= 2)
            {
              localObject[0] = 117;
              localObject[1] = 123;
            }
            localObject = d.a((byte[])localObject);
            LoggerProxy.d("StatHelper", " postContent:" + (String)localObject);
            bool2 = bool1;
            if (!a(paramContext, paramString, (String)localObject)) {}
          }
          try
          {
            if (!???.d())
            {
              ???.a(localList);
              d.a(paramContext, System.currentTimeMillis());
              bool1 = true;
            }
            bool2 = bool1;
            j += 1;
            bool1 = bool2;
            continue;
          }
          finally {}
          return false;
          paramContext = finally;
          throw paramContext;
          i = localCursor.getCount() / 500 + 1;
          continue;
        }
        else
        {
          bool2 = false;
        }
        localCursor.close();
        return bool2;
      }
      catch (SQLiteException paramContext)
      {
        return false;
      }
      catch (Exception paramContext)
      {
        return false;
      }
      label346:
      boolean bool2 = false;
    }
  }
  
  /* Error */
  private static boolean c(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 4
    //   3: new 207	com/baidu/android/common/net/ProxyHttpClient
    //   6: dup
    //   7: aload_0
    //   8: invokespecial 210	com/baidu/android/common/net/ProxyHttpClient:<init>	(Landroid/content/Context;)V
    //   11: astore 5
    //   13: aload_0
    //   14: aload_1
    //   15: invokestatic 330	com/baidu/tts/e/a:e	(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   18: astore_1
    //   19: ldc 91
    //   21: new 93	java/lang/StringBuilder
    //   24: dup
    //   25: invokespecial 94	java/lang/StringBuilder:<init>	()V
    //   28: ldc -41
    //   30: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   33: aload_1
    //   34: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   37: invokevirtual 107	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   40: invokestatic 113	com/baidu/tts/chainofresponsibility/logger/LoggerProxy:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   43: new 332	org/apache/http/client/methods/HttpGet
    //   46: dup
    //   47: aload_1
    //   48: invokespecial 333	org/apache/http/client/methods/HttpGet:<init>	(Ljava/lang/String;)V
    //   51: astore_1
    //   52: aload 5
    //   54: aload_1
    //   55: invokevirtual 234	com/baidu/android/common/net/ProxyHttpClient:execute	(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    //   58: astore_1
    //   59: ldc 91
    //   61: new 93	java/lang/StringBuilder
    //   64: dup
    //   65: invokespecial 94	java/lang/StringBuilder:<init>	()V
    //   68: ldc -20
    //   70: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   73: aload_1
    //   74: invokeinterface 242 1 0
    //   79: invokeinterface 248 1 0
    //   84: invokevirtual 183	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   87: invokevirtual 107	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   90: invokestatic 113	com/baidu/tts/chainofresponsibility/logger/LoggerProxy:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   93: aload_1
    //   94: invokeinterface 242 1 0
    //   99: invokeinterface 248 1 0
    //   104: sipush 200
    //   107: if_icmpne +156 -> 263
    //   110: aload_1
    //   111: invokeinterface 252 1 0
    //   116: ldc -121
    //   118: invokestatic 257	org/apache/http/util/EntityUtils:toString	(Lorg/apache/http/HttpEntity;Ljava/lang/String;)Ljava/lang/String;
    //   121: astore_1
    //   122: ldc 91
    //   124: new 93	java/lang/StringBuilder
    //   127: dup
    //   128: invokespecial 94	java/lang/StringBuilder:<init>	()V
    //   131: ldc_w 259
    //   134: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   137: aload_1
    //   138: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   141: invokevirtual 107	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   144: invokestatic 113	com/baidu/tts/chainofresponsibility/logger/LoggerProxy:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   147: aload_1
    //   148: invokestatic 265	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   151: istore 4
    //   153: iload 4
    //   155: ifne +105 -> 260
    //   158: new 63	org/json/JSONObject
    //   161: dup
    //   162: aload_1
    //   163: invokespecial 268	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   166: ldc_w 335
    //   169: invokevirtual 339	org/json/JSONObject:optJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   172: astore_1
    //   173: aload_1
    //   174: ifnull +86 -> 260
    //   177: aload_1
    //   178: ldc_w 341
    //   181: invokevirtual 344	org/json/JSONObject:optInt	(Ljava/lang/String;)I
    //   184: istore_2
    //   185: ldc 91
    //   187: new 93	java/lang/StringBuilder
    //   190: dup
    //   191: invokespecial 94	java/lang/StringBuilder:<init>	()V
    //   194: ldc_w 346
    //   197: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   200: iload_2
    //   201: invokevirtual 183	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   204: invokevirtual 107	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   207: invokestatic 113	com/baidu/tts/chainofresponsibility/logger/LoggerProxy:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   210: iload_2
    //   211: sipush 1000
    //   214: imul
    //   215: istore_2
    //   216: iload_2
    //   217: ifle +43 -> 260
    //   220: aload_0
    //   221: invokestatic 163	com/baidu/tts/e/d:b	(Landroid/content/Context;)I
    //   224: istore_3
    //   225: ldc 91
    //   227: new 93	java/lang/StringBuilder
    //   230: dup
    //   231: invokespecial 94	java/lang/StringBuilder:<init>	()V
    //   234: ldc_w 348
    //   237: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   240: iload_3
    //   241: invokevirtual 183	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   244: invokevirtual 107	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   247: invokestatic 113	com/baidu/tts/chainofresponsibility/logger/LoggerProxy:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   250: iload_2
    //   251: iload_3
    //   252: if_icmpeq +8 -> 260
    //   255: aload_0
    //   256: iload_2
    //   257: invokestatic 351	com/baidu/tts/e/d:a	(Landroid/content/Context;I)V
    //   260: iconst_1
    //   261: istore 4
    //   263: aload 5
    //   265: invokevirtual 282	com/baidu/android/common/net/ProxyHttpClient:close	()V
    //   268: iload 4
    //   270: ireturn
    //   271: astore_0
    //   272: ldc 91
    //   274: new 93	java/lang/StringBuilder
    //   277: dup
    //   278: invokespecial 94	java/lang/StringBuilder:<init>	()V
    //   281: ldc_w 284
    //   284: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   287: aload_0
    //   288: invokevirtual 285	org/json/JSONException:toString	()Ljava/lang/String;
    //   291: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   294: invokevirtual 107	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   297: invokestatic 113	com/baidu/tts/chainofresponsibility/logger/LoggerProxy:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   300: goto -40 -> 260
    //   303: astore_0
    //   304: aload_0
    //   305: invokevirtual 286	org/apache/http/client/ClientProtocolException:printStackTrace	()V
    //   308: aload 5
    //   310: invokevirtual 282	com/baidu/android/common/net/ProxyHttpClient:close	()V
    //   313: iconst_0
    //   314: ireturn
    //   315: astore_0
    //   316: ldc 91
    //   318: new 93	java/lang/StringBuilder
    //   321: dup
    //   322: invokespecial 94	java/lang/StringBuilder:<init>	()V
    //   325: ldc_w 284
    //   328: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   331: aload_0
    //   332: invokevirtual 287	java/lang/Exception:toString	()Ljava/lang/String;
    //   335: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   338: invokevirtual 107	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   341: invokestatic 113	com/baidu/tts/chainofresponsibility/logger/LoggerProxy:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   344: goto -84 -> 260
    //   347: astore_0
    //   348: aload_0
    //   349: invokevirtual 288	java/io/IOException:printStackTrace	()V
    //   352: aload 5
    //   354: invokevirtual 282	com/baidu/android/common/net/ProxyHttpClient:close	()V
    //   357: iconst_0
    //   358: ireturn
    //   359: astore_0
    //   360: aload 5
    //   362: invokevirtual 282	com/baidu/android/common/net/ProxyHttpClient:close	()V
    //   365: aload_0
    //   366: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	367	0	paramContext	Context
    //   0	367	1	paramString	String
    //   184	73	2	i	int
    //   224	29	3	j	int
    //   1	268	4	bool	boolean
    //   11	350	5	localProxyHttpClient	com.baidu.android.common.net.ProxyHttpClient
    // Exception table:
    //   from	to	target	type
    //   158	173	271	org/json/JSONException
    //   177	210	271	org/json/JSONException
    //   220	250	271	org/json/JSONException
    //   255	260	271	org/json/JSONException
    //   52	93	303	org/apache/http/client/ClientProtocolException
    //   93	153	303	org/apache/http/client/ClientProtocolException
    //   158	173	303	org/apache/http/client/ClientProtocolException
    //   177	210	303	org/apache/http/client/ClientProtocolException
    //   220	250	303	org/apache/http/client/ClientProtocolException
    //   255	260	303	org/apache/http/client/ClientProtocolException
    //   272	300	303	org/apache/http/client/ClientProtocolException
    //   316	344	303	org/apache/http/client/ClientProtocolException
    //   158	173	315	java/lang/Exception
    //   177	210	315	java/lang/Exception
    //   220	250	315	java/lang/Exception
    //   255	260	315	java/lang/Exception
    //   52	93	347	java/io/IOException
    //   93	153	347	java/io/IOException
    //   158	173	347	java/io/IOException
    //   177	210	347	java/io/IOException
    //   220	250	347	java/io/IOException
    //   255	260	347	java/io/IOException
    //   272	300	347	java/io/IOException
    //   316	344	347	java/io/IOException
    //   52	93	359	finally
    //   93	153	359	finally
    //   158	173	359	finally
    //   177	210	359	finally
    //   220	250	359	finally
    //   255	260	359	finally
    //   272	300	359	finally
    //   304	308	359	finally
    //   316	344	359	finally
    //   348	352	359	finally
  }
  
  private static String d(Context paramContext, String paramString)
  {
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.add(new BasicNameValuePair("wise_cuid", b.a().i()));
    localLinkedList.add(new BasicNameValuePair("sdk_version", d.a()));
    localLinkedList.add(new BasicNameValuePair("app_name", d.c(paramContext)));
    localLinkedList.add(new BasicNameValuePair("platform", d.d(paramContext)));
    localLinkedList.add(new BasicNameValuePair("os", d.b()));
    localLinkedList.add(new BasicNameValuePair("net_type", d.e(paramContext) + ""));
    localLinkedList.add(new BasicNameValuePair("appid", paramString));
    localLinkedList.add(new BasicNameValuePair("screen", d.f(paramContext)));
    localLinkedList.add(new BasicNameValuePair("sdk_name", d.c()));
    localLinkedList.add(new BasicNameValuePair("app_signature", d.g(paramContext)));
    paramContext = URLEncodedUtils.format(localLinkedList, "utf-8");
    return "http://yuyin.baidu.com/voice?osname=voiceopen&action=usereventflow&" + paramContext;
  }
  
  private static String e(Context paramContext, String paramString)
  {
    paramContext = new LinkedList();
    paramContext.add(new BasicNameValuePair("appid", paramString));
    paramContext = URLEncodedUtils.format(paramContext, "utf-8");
    return "http://uil.cbs.baidu.com/voiceLog/getconfig?" + paramContext;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/baidu/tts/e/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */