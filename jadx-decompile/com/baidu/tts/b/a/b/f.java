package com.baidu.tts.b.a.b;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.f.g;
import com.baidu.tts.f.l;
import com.baidu.tts.f.n;
import com.baidu.tts.f.o;
import com.baidu.tts.loopj.ResponseHandlerInterface;
import com.baidu.tts.loopj.SyncHttpClient;
import com.baidu.tts.m.e;
import com.baidu.tts.m.h;
import com.baidu.tts.m.i;
import com.baidu.tts.tools.CommonUtility;
import com.baidu.tts.tools.StringTool;
import com.xiaomi.mipush.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.message.BasicNameValuePair;

public class f extends a {
    private b b;

    private class a implements Callable<h> {
        final /* synthetic */ f a;
        private int b;
        private c c;
        private i d;
        private b e;
        private h f;
        private SyncHttpClient g;

        public a(f fVar, int i, c cVar, i iVar, b bVar, h hVar) {
            this.a = fVar;
            this.b = i;
            this.c = cVar;
            this.d = iVar;
            this.e = bVar;
            this.f = hVar;
        }

        public h a() {
            try {
                HttpEntity a = this.a.a(this.b, this.c.a, this.d, this.e);
                this.g = new SyncHttpClient();
                this.g.setMaxRetriesAndTimeout(this.e.m(), this.e.n());
                int o = this.e.o();
                LoggerProxy.d("OnlineSynthesizer", "timeout=" + o);
                this.g.setTimeout(o);
                ResponseHandlerInterface hVar = new h(this.f);
                hVar.a(this.e);
                if (this.b == 1) {
                    this.c.b = o.TTS_SERVER.b();
                    LoggerProxy.d("OnlineSynthesizer", "serverIp=" + this.c.b);
                }
                if (this.c.b == null) {
                    this.f.a(com.baidu.tts.h.a.c.a().b(n.ONLINE_ENGINE_SERVER_IP_IS_NULL));
                } else if (!Thread.currentThread().isInterrupted()) {
                    LoggerProxy.d("OnlineSynthesizer", "before post");
                    this.g.post(null, this.c.b, a, null, hVar);
                    LoggerProxy.d("OnlineSynthesizer", "after post");
                }
                return this.f;
            } catch (com.baidu.tts.q.a e) {
                this.f.a(com.baidu.tts.h.a.c.a().b(n.ONLINE_TOKEN_IS_NULL));
                return this.f;
            }
        }

        public void b() {
            if (this.g != null) {
                this.g.stop();
            }
        }

        public /* synthetic */ Object call() {
            return a();
        }
    }

    public static class b extends com.baidu.tts.m.d<b> {
        private static Set<String> p = new HashSet();
        private String a;
        private com.baidu.tts.f.b b = com.baidu.tts.f.b.AMR;
        private com.baidu.tts.f.c c = com.baidu.tts.f.c.AMR_15K85;
        private String d = "0";
        private String e;
        private String f;
        private String g;
        private String h;
        private String i;
        private String j;
        private String k;
        private String l;
        private int m = 5;
        private int n = 1000;
        private int o = l.DEFAULT.b();

        static {
            p.add(g.SPEED.b());
        }

        public int a(com.baidu.tts.f.b bVar) {
            if (bVar == null) {
                return n.TTS_PARAMETER_INVALID.b();
            }
            this.b = bVar;
            return 0;
        }

        public String a() {
            return this.k;
        }

        public void a(int i) {
            this.m = i;
        }

        public void a(com.baidu.tts.f.c cVar) {
            this.c = cVar;
        }

        public void a(String str) {
            this.k = str;
        }

        public String b() {
            return this.l;
        }

        public void b(int i) {
            this.n = i;
        }

        public void b(String str) {
            this.l = str;
        }

        public String c() {
            return this.b.a();
        }

        public void c(int i) {
            this.o = i;
        }

        public void c(String str) {
            this.a = str;
        }

        public String d() {
            return this.a;
        }

        public void d(String str) {
            this.d = str;
        }

        public String e() {
            return this.c.a();
        }

        public void e(String str) {
            this.g = str;
        }

        public String f() {
            return this.d;
        }

        public void f(String str) {
            this.h = str;
        }

        public String g() {
            return this.e;
        }

        public void g(String str) {
            this.i = str;
        }

        public String h() {
            return this.f;
        }

        public void h(String str) {
            this.j = str;
        }

        public String i() {
            return this.g;
        }

        public String j() {
            return this.h;
        }

        public String k() {
            return this.i;
        }

        public String l() {
            return this.j;
        }

        public int m() {
            return this.m;
        }

        public int n() {
            return this.n;
        }

        public int o() {
            return this.o;
        }
    }

    private class c {
        String a = CommonUtility.generateSerialNumber();
        String b;
        final /* synthetic */ f c;

        public c(f fVar) {
            this.c = fVar;
        }
    }

    private class d implements Callable<TtsError> {
        final /* synthetic */ f a;
        private i b;
        private c c;

        public d(f fVar, i iVar) {
            this.a = fVar;
            this.b = iVar;
            this.c = new c(fVar);
        }

        private boolean a(h hVar) {
            return hVar != null && hVar.f() == null && hVar.a() == 0;
        }

        private boolean b(h hVar) {
            return !a(hVar) || hVar.b() < 0;
        }

        public TtsError a() {
            h a;
            int i = 0;
            do {
                i++;
                LoggerProxy.d("OnlineSynthesizer", "count=" + i);
                a = this.a.a(i, this.c, this.b);
                if (a(a)) {
                    this.a.a(a);
                }
            } while (!b(a));
            return a == null ? com.baidu.tts.h.a.c.a().b(n.ONLINE_ENGINE_CALL_EXCEPTION) : a.f();
        }

        public /* synthetic */ Object call() {
            return a();
        }
    }

    private h a(int i, c cVar, i iVar) {
        h b = h.b(iVar);
        b bVar = (b) this.b.A();
        a aVar = new a(this, i, cVar, iVar, bVar, b);
        FutureTask futureTask = new FutureTask(aVar);
        new Thread(futureTask).start();
        try {
            return (h) futureTask.get((long) bVar.o(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            futureTask.cancel(true);
            aVar.b();
            throw e;
        } catch (ExecutionException e2) {
            b.a(com.baidu.tts.h.a.c.a().a(n.ONLINE_ENGINE_GET_EXECUTION_EXCEPTION, e2.getCause()));
            return b;
        } catch (Throwable e3) {
            LoggerProxy.d("OnlineSynthesizer", "startOnceHttpRequest timeout");
            futureTask.cancel(true);
            aVar.b();
            b.a(com.baidu.tts.h.a.c.a().a(n.ONLINE_ENGINE_GET_TIMEOUT, e3));
            return b;
        }
    }

    private HttpEntity a(int i, String str, i iVar, b bVar) {
        if (bVar == null) {
            return null;
        }
        UrlEncodedFormEntity urlEncodedFormEntity;
        List<NameValuePair> arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair(g.INDEX.a(), String.valueOf(i)));
        arrayList.add(new BasicNameValuePair(g.SERIAL_NUMBER.a(), str));
        arrayList.add(new BasicNameValuePair(g.PLATFORM.b(), "Android"));
        com.baidu.tts.h.b.b a = com.baidu.tts.h.b.b.a();
        arrayList.add(new BasicNameValuePair(g.VERSION.a(), a.j()));
        String d = bVar.d();
        if (!StringTool.isEmpty(d)) {
            arrayList.add(new BasicNameValuePair(g.PRODUCT_ID.a(), d));
        }
        iVar.c(bVar.p());
        String d2 = iVar.d();
        if (i == 1) {
            try {
                arrayList.add(new BasicNameValuePair(g.TEXT.a(), URLEncoder.encode(iVar.c(), d2)));
                arrayList.add(new BasicNameValuePair(g.CTP.a(), a.a(g.CTP.a())));
                String i2 = a.i();
                if (i2 != null) {
                    arrayList.add(new BasicNameValuePair(g.CUID.a(), i2));
                }
                if (StringTool.isEmpty(d)) {
                    LoggerProxy.d("OnlineSynthesizer", "before online auth");
                    com.baidu.tts.auth.c.a a2 = com.baidu.tts.auth.a.a().a(bVar);
                    LoggerProxy.d("OnlineSynthesizer", "after online auth");
                    if (a2.g()) {
                        arrayList.add(new BasicNameValuePair(g.TOKEN.a(), a2.a()));
                    } else {
                        throw new com.baidu.tts.q.a();
                    }
                }
                arrayList.add(new BasicNameValuePair(g.TEXT_ENCODE.a(), bVar.q()));
                arrayList.add(new BasicNameValuePair(g.AUDIO_ENCODE.a(), bVar.c()));
                arrayList.add(new BasicNameValuePair(g.BITRATE.a(), bVar.e()));
                arrayList.add(new BasicNameValuePair(g.SPEAKER.a(), bVar.f()));
                arrayList.add(new BasicNameValuePair(g.NUMBER.a(), bVar.g()));
                arrayList.add(new BasicNameValuePair(g.ENGINE.a(), bVar.h()));
                arrayList.add(new BasicNameValuePair(g.STYLE.a(), bVar.i()));
                arrayList.add(new BasicNameValuePair(g.BACKGROUND.a(), bVar.j()));
                arrayList.add(new BasicNameValuePair(g.TERRITORY.a(), bVar.k()));
                arrayList.add(new BasicNameValuePair(g.PUNCTUATION.a(), bVar.l()));
                arrayList.add(new BasicNameValuePair(g.LANGUAGE.a(), bVar.r()));
                arrayList.add(new BasicNameValuePair(g.SPEED.a(), bVar.u()));
                arrayList.add(new BasicNameValuePair(g.PITCH.a(), bVar.v()));
                arrayList.add(new BasicNameValuePair(g.VOLUME.a(), bVar.w()));
                arrayList.add(new BasicNameValuePair(g.OPEN_XML.a(), bVar.s()));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        try {
            StringBuffer stringBuffer = new StringBuffer();
            for (NameValuePair nameValuePair : arrayList) {
                stringBuffer.append(nameValuePair.getName());
                stringBuffer.append("=");
                stringBuffer.append(nameValuePair.getValue());
                stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            LoggerProxy.d("OnlineSynthesizer", "request params: " + stringBuffer);
            urlEncodedFormEntity = new UrlEncodedFormEntity(arrayList, d2);
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
            urlEncodedFormEntity = null;
        }
        return urlEncodedFormEntity;
    }

    public int a(e eVar) {
        return n.ONLINE_UNSUPPORTED_OPERATION.b();
    }

    public int a(com.baidu.tts.m.f fVar) {
        return n.ONLINE_UNSUPPORTED_OPERATION.b();
    }

    public int a(com.baidu.tts.m.g gVar) {
        return n.ONLINE_UNSUPPORTED_OPERATION.b();
    }

    public TtsError a(i iVar) {
        try {
            return new d(this, iVar).a();
        } catch (InterruptedException e) {
            throw e;
        } catch (Throwable e2) {
            return com.baidu.tts.h.a.c.a().a(n.ONLINE_ENGINE_CALL_EXCEPTION, e2);
        }
    }

    public <OnlineSynthesizerParams> void a(OnlineSynthesizerParams onlineSynthesizerParams) {
        this.b = (b) onlineSynthesizerParams;
    }

    public int b(e eVar) {
        return n.ONLINE_UNSUPPORTED_OPERATION.b();
    }
}
