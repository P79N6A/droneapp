package a;

import a.c.a;
import android.content.Context;
import android.net.Uri;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.a.a.e;
import org.json.JSONArray;
import org.json.JSONObject;

public class m implements e {
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

    public m(Context context) {
        this.a = context;
    }

    private static Uri a(String str) {
        return str == null ? null : Uri.parse(str);
    }

    private static List<Map<String, Object>> a(Map<String, Object> map, String str) {
        List<Map<String, Object>> list = (List) map.get(str);
        return list == null ? Collections.emptyList() : list;
    }

    private static c b(Map<String, Object> map, Uri uri) {
        Uri uri2;
        List arrayList = new ArrayList();
        List list = (List) map.get("android");
        if (list == null) {
            list = Collections.emptyList();
        }
        for (Map map2 : r0) {
            Map map22;
            List a = a(map22, "url");
            List a2 = a(map22, h);
            List a3 = a(map22, g);
            List a4 = a(map22, "app_name");
            int max = Math.max(a.size(), Math.max(a2.size(), Math.max(a3.size(), a4.size())));
            int i = 0;
            while (i < max) {
                arrayList.add(new a((String) (a2.size() > i ? ((Map) a2.get(i)).get("value") : null), (String) (a3.size() > i ? ((Map) a3.get(i)).get("value") : null), a((String) (a.size() > i ? ((Map) a.get(i)).get("value") : null)), (String) (a4.size() > i ? ((Map) a4.get(i)).get("value") : null)));
                i++;
            }
        }
        list = (List) map.get(l);
        if (list == null || list.size() <= 0) {
            uri2 = uri;
        } else {
            map22 = (Map) list.get(0);
            List list2 = (List) map22.get("url");
            list = (List) map22.get(j);
            if (list != null && list.size() > 0) {
                if (Arrays.asList(new String[]{"no", "false", "0"}).contains(((String) ((Map) list.get(0)).get("value")).toLowerCase())) {
                    uri2 = null;
                    if (!(uri2 == null || list2 == null || list2.size() <= 0)) {
                        uri2 = a((String) ((Map) list2.get(0)).get("value"));
                    }
                }
            }
            uri2 = uri;
            uri2 = a((String) ((Map) list2.get(0)).get("value"));
        }
        return new c(uri, arrayList, uri2);
    }

    private static String b(URLConnection uRLConnection) {
        InputStream inputStream;
        int i = 0;
        if (uRLConnection instanceof HttpURLConnection) {
            InputStream inputStream2;
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
            try {
                inputStream2 = uRLConnection.getInputStream();
            } catch (Exception e) {
                inputStream2 = httpURLConnection.getErrorStream();
            }
            inputStream = inputStream2;
        } else {
            inputStream = uRLConnection.getInputStream();
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            String contentEncoding = uRLConnection.getContentEncoding();
            if (contentEncoding == null) {
                String[] split = uRLConnection.getContentType().split(";");
                int length = split.length;
                while (i < length) {
                    String trim = split[i].trim();
                    if (trim.startsWith("charset=")) {
                        contentEncoding = trim.substring("charset=".length());
                        break;
                    }
                    i++;
                }
                if (contentEncoding == null) {
                    contentEncoding = "UTF-8";
                }
            }
            String str = new String(byteArrayOutputStream.toByteArray(), contentEncoding);
            return str;
        } finally {
            inputStream.close();
        }
    }

    private static Map<String, Object> b(JSONArray jSONArray) {
        Map hashMap = new HashMap();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String[] split = jSONObject.getString("property").split(":");
            if (split[0].equals(d)) {
                int i2 = 1;
                Map map = hashMap;
                while (i2 < split.length) {
                    List list;
                    List list2 = (List) map.get(split[i2]);
                    if (list2 == null) {
                        ArrayList arrayList = new ArrayList();
                        map.put(split[i2], arrayList);
                        list = arrayList;
                    } else {
                        list = list2;
                    }
                    Map map2 = list.size() > 0 ? (Map) list.get(list.size() - 1) : null;
                    if (map2 == null || i2 == split.length - 1) {
                        HashMap hashMap2 = new HashMap();
                        list.add(hashMap2);
                        map = hashMap2;
                    } else {
                        map = map2;
                    }
                    i2++;
                }
                if (jSONObject.has("content")) {
                    if (jSONObject.isNull("content")) {
                        map.put("value", null);
                    } else {
                        map.put("value", jSONObject.getString("content"));
                    }
                }
            }
        }
        return hashMap;
    }

    public l<c> a(final Uri uri) {
        final i iVar = new i();
        final i iVar2 = new i();
        return l.a(new Callable<Void>(this) {
            final /* synthetic */ m d;

            public Void a() {
                URL url = new URL(uri.toString());
                URLConnection uRLConnection = null;
                while (url != null) {
                    URLConnection openConnection = url.openConnection();
                    if (openConnection instanceof HttpURLConnection) {
                        ((HttpURLConnection) openConnection).setInstanceFollowRedirects(true);
                    }
                    openConnection.setRequestProperty(m.c, m.d);
                    openConnection.connect();
                    if (openConnection instanceof HttpURLConnection) {
                        URL url2;
                        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                        if (httpURLConnection.getResponseCode() < 300 || httpURLConnection.getResponseCode() >= 400) {
                            Object obj = null;
                        } else {
                            URL url3 = new URL(httpURLConnection.getHeaderField(e.H));
                            httpURLConnection.disconnect();
                            url2 = url3;
                        }
                        URLConnection uRLConnection2 = openConnection;
                        url = url2;
                        uRLConnection = uRLConnection2;
                    } else {
                        uRLConnection = openConnection;
                        url = null;
                    }
                }
                try {
                    iVar.a(m.b(uRLConnection));
                    iVar2.a(uRLConnection.getContentType());
                    return null;
                } finally {
                    if (uRLConnection instanceof HttpURLConnection) {
                        ((HttpURLConnection) uRLConnection).disconnect();
                    }
                }
            }

            public /* synthetic */ Object call() {
                return a();
            }
        }).d(new j<Void, l<JSONArray>>(this) {
            final /* synthetic */ m d;

            public l<JSONArray> a(l<Void> lVar) {
                final l.a a = l.a();
                WebView webView = new WebView(this.d.a);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.setNetworkAvailable(false);
                webView.setWebViewClient(new WebViewClient(this) {
                    final /* synthetic */ AnonymousClass2 a;
                    private boolean b = false;

                    {
                        this.a = r2;
                    }

                    private void a(WebView webView) {
                        if (!this.b) {
                            this.b = true;
                            webView.loadUrl(m.b);
                        }
                    }

                    public void onLoadResource(WebView webView, String str) {
                        super.onLoadResource(webView, str);
                        a(webView);
                    }

                    public void onPageFinished(WebView webView, String str) {
                        super.onPageFinished(webView, str);
                        a(webView);
                    }
                });
                webView.addJavascriptInterface(new Object(this) {
                    final /* synthetic */ AnonymousClass2 b;

                    @JavascriptInterface
                    public void setValue(String str) {
                        try {
                            a.a(new JSONArray(str));
                        } catch (Exception e) {
                            a.a(e);
                        }
                    }
                }, "boltsWebViewAppLinkResolverResult");
                webView.loadDataWithBaseURL(uri.toString(), (String) iVar.a(), iVar2.a() != null ? ((String) iVar2.a()).split(";")[0] : null, null, null);
                return a.a();
            }

            public /* synthetic */ Object then(l lVar) {
                return a(lVar);
            }
        }, l.b).c(new j<JSONArray, c>(this) {
            final /* synthetic */ m b;

            public c a(l<JSONArray> lVar) {
                return m.b(m.b((JSONArray) lVar.e()), uri);
            }

            public /* synthetic */ Object then(l lVar) {
                return a(lVar);
            }
        });
    }
}
