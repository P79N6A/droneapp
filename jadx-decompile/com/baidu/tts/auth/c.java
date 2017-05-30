package com.baidu.tts.auth;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.f.n;
import com.baidu.tts.k.b;
import com.baidu.tts.tools.StringTool;
import com.tencent.connect.common.Constants;
import java.util.LinkedList;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class c implements b<c, a> {
    private String a;
    private String b;
    private String c;

    public static class a implements com.baidu.tts.k.a {
        private String a;
        private String b;
        private long c;
        private TtsError d;

        public String a() {
            return this.b;
        }

        public void a(long j) {
            this.c = j;
        }

        public void a(TtsError ttsError) {
            if (ttsError != null) {
                LoggerProxy.d("OnlineAuth", "this=" + this + "--error=" + ttsError.getDetailMessage());
            }
            this.d = ttsError;
        }

        public void a(String str) {
            this.a = str;
        }

        public TtsError b() {
            return this.d;
        }

        public void b(String str) {
            this.b = str;
        }

        public boolean g() {
            return StringTool.isEmpty(this.a) ? this.b != null && System.currentTimeMillis() < this.c : true;
        }
    }

    private boolean a(String str, String str2) {
        return (StringTool.isEmpty(str) || StringTool.isEmpty(str2)) ? false : true;
    }

    private String b(String str, String str2) {
        List linkedList = new LinkedList();
        linkedList.add(new BasicNameValuePair("grant_type", "client_credentials"));
        linkedList.add(new BasicNameValuePair(Constants.PARAM_CLIENT_ID, str));
        linkedList.add(new BasicNameValuePair("client_secret", str2));
        return "https://openapi.baidu.com/oauth/2.0/token?" + URLEncodedUtils.format(linkedList, "utf-8");
    }

    public int a(c cVar) {
        String a = cVar.a();
        if (StringTool.isEmpty(this.a)) {
            a = cVar.b();
            String c = cVar.c();
            LoggerProxy.d("OnlineAuth", "mAK=" + this.b + "--mSK=" + this.c + "--ak2=" + a + "--sk2=" + c);
            return (StringTool.isEqual(this.b, a) && StringTool.isEqual(this.c, c)) ? 0 : 1;
        } else {
            LoggerProxy.d("OnlineAuth", "mProductId=" + this.a + "--productId2=" + a);
            return a != null ? this.a.compareTo(a) : 1;
        }
    }

    public String a() {
        return this.a;
    }

    public void a(String str) {
        this.a = str;
    }

    public String b() {
        return this.b;
    }

    public void b(String str) {
        this.b = str;
    }

    public String c() {
        return this.c;
    }

    public void c(String str) {
        this.c = str;
    }

    public /* synthetic */ Object call() {
        return d();
    }

    public /* synthetic */ int compareTo(Object obj) {
        return a((c) obj);
    }

    public a d() {
        LoggerProxy.d("OnlineAuth", "enter online auth");
        a aVar = new a();
        if (StringTool.isEmpty(this.a)) {
            try {
                HttpClient defaultHttpClient = new DefaultHttpClient();
                if (a(this.b, this.c)) {
                    String b = b(this.b, this.c);
                    LoggerProxy.d("OnlineAuth", "url=" + b);
                    HttpResponse execute = defaultHttpClient.execute(new HttpPost(b));
                    b = EntityUtils.toString(execute.getEntity());
                    int statusCode = execute.getStatusLine().getStatusCode();
                    LoggerProxy.d("OnlineAuth", "body=" + b + "--code=" + statusCode);
                    if (statusCode == 200) {
                        JSONObject jSONObject = new JSONObject(b);
                        if (jSONObject.has("access_token")) {
                            aVar.b(jSONObject.getString("access_token"));
                        } else {
                            aVar.a(com.baidu.tts.h.a.c.a().b(n.ONLINE_ENGINE_AUTH_FAILURE));
                        }
                        if (jSONObject.has("expires_in")) {
                            aVar.a(System.nanoTime() + (Math.min((long) jSONObject.getInt("expires_in"), 86400) * 1000000000));
                        }
                    } else {
                        aVar.a(com.baidu.tts.h.a.c.a().b(n.ONLINE_ENGINE_AUTH_FAILURE));
                    }
                } else {
                    aVar.a(com.baidu.tts.h.a.c.a().b(n.TTS_PARAMETER_INVALID));
                }
            } catch (Throwable e) {
                aVar.a(com.baidu.tts.h.a.c.a().a(n.ONLINE_ENGINE_AUTH_FAILURE, e));
            }
        } else {
            aVar.a(this.a);
        }
        LoggerProxy.d("OnlineAuth", "end online auth");
        return aVar;
    }
}
