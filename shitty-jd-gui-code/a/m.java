package a;

import android.content.Context;
import android.net.Uri;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class m
  implements e
{
  private static final String b = "javascript:boltsWebViewAppLinkResolverResult.setValue((function() {  var metaTags = document.getElementsByTagName('meta');  var results = [];  for (var i = 0; i < metaTags.length; i++) {    var property = metaTags[i].getAttribute('property');    if (property && property.substring(0, 'al:'.length) === 'al:') {      var tag = { \"property\": metaTags[i].getAttribute('property') };      if (metaTags[i].hasAttribute('content')) {        tag['content'] = metaTags[i].getAttribute('content');      }      results.push(tag);    }  }  return JSON.stringify(results);})())";
  private static final String c = "Prefer-Html-Meta-Tags";
  private static final String d = "al";
  private static final String e = "value";
  private static final String f = "app_name";
  private static final String g = "class";
  private static final String h = "package";
  private static final String i = "url";
  private static final String j = "should_fallback";
  private static final String k = "url";
  private static final String l = "web";
  private static final String m = "android";
  private final Context a;
  
  public m(Context paramContext)
  {
    this.a = paramContext;
  }
  
  private static Uri a(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    return Uri.parse(paramString);
  }
  
  private static List<Map<String, Object>> a(Map<String, Object> paramMap, String paramString)
  {
    paramString = (List)paramMap.get(paramString);
    paramMap = paramString;
    if (paramString == null) {
      paramMap = Collections.emptyList();
    }
    return paramMap;
  }
  
  private static c b(Map<String, Object> paramMap, Uri paramUri)
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject2 = (List)paramMap.get("android");
    Object localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = Collections.emptyList();
    }
    localObject2 = ((List)localObject1).iterator();
    if (((Iterator)localObject2).hasNext())
    {
      localObject1 = (Map)((Iterator)localObject2).next();
      List localList1 = a((Map)localObject1, "url");
      List localList2 = a((Map)localObject1, "package");
      List localList3 = a((Map)localObject1, "class");
      List localList4 = a((Map)localObject1, "app_name");
      int i1 = Math.max(localList1.size(), Math.max(localList2.size(), Math.max(localList3.size(), localList4.size())));
      int n = 0;
      label143:
      label179:
      Uri localUri;
      label223:
      String str1;
      label264:
      String str2;
      if (n < i1)
      {
        if (localList1.size() <= n) {
          break label341;
        }
        localObject1 = ((Map)localList1.get(n)).get("value");
        localUri = a((String)localObject1);
        if (localList2.size() <= n) {
          break label347;
        }
        localObject1 = ((Map)localList2.get(n)).get("value");
        str1 = (String)localObject1;
        if (localList3.size() <= n) {
          break label353;
        }
        localObject1 = ((Map)localList3.get(n)).get("value");
        str2 = (String)localObject1;
        if (localList4.size() <= n) {
          break label359;
        }
      }
      label341:
      label347:
      label353:
      label359:
      for (localObject1 = ((Map)localList4.get(n)).get("value");; localObject1 = null)
      {
        localArrayList.add(new c.a(str1, str2, localUri, (String)localObject1));
        n += 1;
        break label143;
        break;
        localObject1 = null;
        break label179;
        localObject1 = null;
        break label223;
        localObject1 = null;
        break label264;
      }
    }
    paramMap = (List)paramMap.get("web");
    if ((paramMap != null) && (paramMap.size() > 0))
    {
      paramMap = (Map)paramMap.get(0);
      localObject2 = (List)paramMap.get("url");
      paramMap = (List)paramMap.get("should_fallback");
      if ((paramMap != null) && (paramMap.size() > 0))
      {
        paramMap = (String)((Map)paramMap.get(0)).get("value");
        if (Arrays.asList(new String[] { "no", "false", "0" }).contains(paramMap.toLowerCase()))
        {
          paramMap = null;
          localObject1 = paramMap;
          if (paramMap != null)
          {
            localObject1 = paramMap;
            if (localObject2 != null)
            {
              localObject1 = paramMap;
              if (((List)localObject2).size() <= 0) {}
            }
          }
        }
      }
    }
    for (localObject1 = a((String)((Map)((List)localObject2).get(0)).get("value"));; localObject1 = paramUri)
    {
      return new c(paramUri, localArrayList, (Uri)localObject1);
      paramMap = paramUri;
      break;
    }
  }
  
  /* Error */
  private static String b(URLConnection paramURLConnection)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aload_0
    //   3: instanceof 168
    //   6: ifeq +73 -> 79
    //   9: aload_0
    //   10: checkcast 168	java/net/HttpURLConnection
    //   13: astore 4
    //   15: aload_0
    //   16: invokevirtual 174	java/net/URLConnection:getInputStream	()Ljava/io/InputStream;
    //   19: astore_3
    //   20: aload_3
    //   21: astore 4
    //   23: new 176	java/io/ByteArrayOutputStream
    //   26: dup
    //   27: invokespecial 177	java/io/ByteArrayOutputStream:<init>	()V
    //   30: astore 6
    //   32: sipush 1024
    //   35: newarray <illegal type>
    //   37: astore_3
    //   38: aload 4
    //   40: aload_3
    //   41: invokevirtual 183	java/io/InputStream:read	([B)I
    //   44: istore_2
    //   45: iload_2
    //   46: iconst_m1
    //   47: if_icmpeq +41 -> 88
    //   50: aload 6
    //   52: aload_3
    //   53: iconst_0
    //   54: iload_2
    //   55: invokevirtual 187	java/io/ByteArrayOutputStream:write	([BII)V
    //   58: goto -20 -> 38
    //   61: astore_0
    //   62: aload 4
    //   64: invokevirtual 190	java/io/InputStream:close	()V
    //   67: aload_0
    //   68: athrow
    //   69: astore_3
    //   70: aload 4
    //   72: invokevirtual 193	java/net/HttpURLConnection:getErrorStream	()Ljava/io/InputStream;
    //   75: astore_3
    //   76: goto -56 -> 20
    //   79: aload_0
    //   80: invokevirtual 174	java/net/URLConnection:getInputStream	()Ljava/io/InputStream;
    //   83: astore 4
    //   85: goto -62 -> 23
    //   88: aload_0
    //   89: invokevirtual 196	java/net/URLConnection:getContentEncoding	()Ljava/lang/String;
    //   92: astore 5
    //   94: aload 5
    //   96: astore_3
    //   97: aload 5
    //   99: ifnonnull +53 -> 152
    //   102: aload_0
    //   103: invokevirtual 199	java/net/URLConnection:getContentType	()Ljava/lang/String;
    //   106: ldc -55
    //   108: invokevirtual 205	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   111: astore_3
    //   112: aload_3
    //   113: arraylength
    //   114: istore_2
    //   115: aload 5
    //   117: astore_0
    //   118: iload_1
    //   119: iload_2
    //   120: if_icmpge +60 -> 180
    //   123: aload_3
    //   124: iload_1
    //   125: aaload
    //   126: invokevirtual 208	java/lang/String:trim	()Ljava/lang/String;
    //   129: astore_0
    //   130: aload_0
    //   131: ldc -46
    //   133: invokevirtual 214	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   136: ifeq +37 -> 173
    //   139: aload_0
    //   140: ldc -46
    //   142: invokevirtual 217	java/lang/String:length	()I
    //   145: invokevirtual 221	java/lang/String:substring	(I)Ljava/lang/String;
    //   148: astore_0
    //   149: goto +31 -> 180
    //   152: new 128	java/lang/String
    //   155: dup
    //   156: aload 6
    //   158: invokevirtual 225	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   161: aload_3
    //   162: invokespecial 228	java/lang/String:<init>	([BLjava/lang/String;)V
    //   165: astore_0
    //   166: aload 4
    //   168: invokevirtual 190	java/io/InputStream:close	()V
    //   171: aload_0
    //   172: areturn
    //   173: iload_1
    //   174: iconst_1
    //   175: iadd
    //   176: istore_1
    //   177: goto -62 -> 115
    //   180: aload_0
    //   181: astore_3
    //   182: aload_0
    //   183: ifnonnull -31 -> 152
    //   186: ldc -26
    //   188: astore_3
    //   189: goto -37 -> 152
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	192	0	paramURLConnection	URLConnection
    //   1	176	1	n	int
    //   44	77	2	i1	int
    //   19	34	3	localObject1	Object
    //   69	1	3	localException	Exception
    //   75	114	3	localObject2	Object
    //   13	154	4	localObject3	Object
    //   92	24	5	str	String
    //   30	127	6	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    // Exception table:
    //   from	to	target	type
    //   23	38	61	finally
    //   38	45	61	finally
    //   50	58	61	finally
    //   88	94	61	finally
    //   102	115	61	finally
    //   123	149	61	finally
    //   152	166	61	finally
    //   15	20	69	java/lang/Exception
  }
  
  private static Map<String, Object> b(JSONArray paramJSONArray)
  {
    HashMap localHashMap = new HashMap();
    int n = 0;
    JSONObject localJSONObject;
    String[] arrayOfString;
    int i1;
    Object localObject1;
    label64:
    Object localObject2;
    for (;;)
    {
      if (n < paramJSONArray.length())
      {
        localJSONObject = paramJSONArray.getJSONObject(n);
        arrayOfString = localJSONObject.getString("property").split(":");
        if (!arrayOfString[0].equals("al"))
        {
          n += 1;
        }
        else
        {
          i1 = 1;
          localObject1 = localHashMap;
          if (i1 < arrayOfString.length)
          {
            localObject2 = (List)((Map)localObject1).get(arrayOfString[i1]);
            if (localObject2 != null) {
              break label246;
            }
            localObject2 = new ArrayList();
            ((Map)localObject1).put(arrayOfString[i1], localObject2);
          }
        }
      }
    }
    label143:
    label243:
    label246:
    for (;;)
    {
      if (((List)localObject2).size() > 0)
      {
        localObject1 = (Map)((List)localObject2).get(((List)localObject2).size() - 1);
        if ((localObject1 != null) && (i1 != arrayOfString.length - 1)) {
          break label243;
        }
        localObject1 = new HashMap();
        ((List)localObject2).add(localObject1);
      }
      for (;;)
      {
        i1 += 1;
        break label64;
        localObject1 = null;
        break label143;
        if (!localJSONObject.has("content")) {
          break;
        }
        if (localJSONObject.isNull("content"))
        {
          ((Map)localObject1).put("value", null);
          break;
        }
        ((Map)localObject1).put("value", localJSONObject.getString("content"));
        break;
        return localHashMap;
      }
    }
  }
  
  public l<c> a(final Uri paramUri)
  {
    final i locali1 = new i();
    final i locali2 = new i();
    l.a(new Callable()
    {
      public Void a()
      {
        Object localObject2 = new URL(paramUri.toString());
        Object localObject1 = null;
        while (localObject2 != null)
        {
          localObject2 = ((URL)localObject2).openConnection();
          if ((localObject2 instanceof HttpURLConnection)) {
            ((HttpURLConnection)localObject2).setInstanceFollowRedirects(true);
          }
          ((URLConnection)localObject2).setRequestProperty("Prefer-Html-Meta-Tags", "al");
          ((URLConnection)localObject2).connect();
          if ((localObject2 instanceof HttpURLConnection))
          {
            Object localObject4 = (HttpURLConnection)localObject2;
            if ((((HttpURLConnection)localObject4).getResponseCode() >= 300) && (((HttpURLConnection)localObject4).getResponseCode() < 400))
            {
              localObject1 = new URL(((HttpURLConnection)localObject4).getHeaderField("Location"));
              ((HttpURLConnection)localObject4).disconnect();
            }
            for (;;)
            {
              localObject4 = localObject1;
              localObject1 = localObject2;
              localObject2 = localObject4;
              break;
              localObject1 = null;
            }
          }
          localObject1 = localObject2;
          localObject2 = null;
        }
        try
        {
          locali1.a(m.a((URLConnection)localObject1));
          locali2.a(((URLConnection)localObject1).getContentType());
          return null;
        }
        finally
        {
          if ((localObject1 instanceof HttpURLConnection)) {
            ((HttpURLConnection)localObject1).disconnect();
          }
        }
      }
    }).d(new j()
    {
      public l<JSONArray> a(l<Void> paramAnonymousl)
      {
        final l.a locala = l.a();
        WebView localWebView = new WebView(m.a(m.this));
        localWebView.getSettings().setJavaScriptEnabled(true);
        localWebView.setNetworkAvailable(false);
        localWebView.setWebViewClient(new WebViewClient()
        {
          private boolean b = false;
          
          private void a(WebView paramAnonymous2WebView)
          {
            if (!this.b)
            {
              this.b = true;
              paramAnonymous2WebView.loadUrl("javascript:boltsWebViewAppLinkResolverResult.setValue((function() {  var metaTags = document.getElementsByTagName('meta');  var results = [];  for (var i = 0; i < metaTags.length; i++) {    var property = metaTags[i].getAttribute('property');    if (property && property.substring(0, 'al:'.length) === 'al:') {      var tag = { \"property\": metaTags[i].getAttribute('property') };      if (metaTags[i].hasAttribute('content')) {        tag['content'] = metaTags[i].getAttribute('content');      }      results.push(tag);    }  }  return JSON.stringify(results);})())");
            }
          }
          
          public void onLoadResource(WebView paramAnonymous2WebView, String paramAnonymous2String)
          {
            super.onLoadResource(paramAnonymous2WebView, paramAnonymous2String);
            a(paramAnonymous2WebView);
          }
          
          public void onPageFinished(WebView paramAnonymous2WebView, String paramAnonymous2String)
          {
            super.onPageFinished(paramAnonymous2WebView, paramAnonymous2String);
            a(paramAnonymous2WebView);
          }
        });
        localWebView.addJavascriptInterface(new Object()
        {
          @JavascriptInterface
          public void setValue(String paramAnonymous2String)
          {
            try
            {
              locala.a(new JSONArray(paramAnonymous2String));
              return;
            }
            catch (JSONException paramAnonymous2String)
            {
              locala.a(paramAnonymous2String);
            }
          }
        }, "boltsWebViewAppLinkResolverResult");
        if (locali2.a() != null) {}
        for (paramAnonymousl = ((String)locali2.a()).split(";")[0];; paramAnonymousl = null)
        {
          localWebView.loadDataWithBaseURL(paramUri.toString(), (String)locali1.a(), paramAnonymousl, null, null);
          return locala.a();
        }
      }
    }, l.b).c(new j()
    {
      public c a(l<JSONArray> paramAnonymousl)
      {
        return m.a(m.a((JSONArray)paramAnonymousl.e()), paramUri);
      }
    });
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/a/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */