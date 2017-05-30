package com.baidu.tts.b.a.b;

import android.text.TextUtils;
import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.f.f;
import com.baidu.tts.f.n;
import com.baidu.tts.jni.EmbeddedSynthesizerEngine;
import com.baidu.tts.jni.EmbeddedSynthesizerEngine.OnNewDataListener;
import com.baidu.tts.m.d;
import com.baidu.tts.m.g;
import com.baidu.tts.m.h;
import com.baidu.tts.m.i;
import com.baidu.tts.tools.DataTool;
import com.baidu.tts.tools.ResourceTools;
import java.util.concurrent.Callable;

public class e extends a {
    private b b;
    private long[] c = new long[1];
    private com.baidu.tts.e.c d;

    private class a extends Thread {
        final /* synthetic */ e a;
        private int b;

        public a(e eVar, int i) {
            this.a = eVar;
            this.b = i;
        }

        public void run() {
            try {
                synchronized (this.a.d) {
                    if (!this.a.d.d()) {
                        this.a.d.a(System.currentTimeMillis(), this.b, 0, 0, "");
                    }
                }
            } catch (Exception e) {
                LoggerProxy.d("OfflineSynthesizer", "AddPVResultsToDB exception=" + e.toString());
            }
        }
    }

    public static class b extends d<b> {
        private String a = "0";
        private String b = "0";
        private String c = "0";
        private String d;
        private String e;
        private String f;
        private String g;

        public int a(String str) {
            if (!DataTool.isLong(str)) {
                return n.TTS_PARAMETER_INVALID.b();
            }
            this.a = str;
            return 0;
        }

        public long a() {
            long j = 0;
            try {
                j = Long.parseLong(this.a);
            } catch (Exception e) {
            }
            return j;
        }

        public long b() {
            long j = 0;
            try {
                j = Long.parseLong(this.b);
            } catch (Exception e) {
            }
            return j;
        }

        public void b(String str) {
            this.b = str;
        }

        public int c(String str) {
            if (!DataTool.isLong(str)) {
                return n.TTS_PARAMETER_INVALID.b();
            }
            this.c = str;
            return 0;
        }

        public long c() {
            long j = 0;
            try {
                j = Long.parseLong(this.c);
            } catch (Exception e) {
            }
            return j;
        }

        public String d() {
            return this.d;
        }

        public void d(String str) {
            this.d = str;
        }

        public String e() {
            return this.e;
        }

        public void e(String str) {
            this.e = str;
        }

        public String f() {
            return this.f;
        }

        public void f(String str) {
            this.f = str;
        }

        public String g() {
            return this.g;
        }

        public void g(String str) {
            this.g = str;
        }
    }

    private class c implements OnNewDataListener, Callable<TtsError> {
        final /* synthetic */ e a;
        private i b;
        private int c = 0;

        public c(e eVar, i iVar) {
            this.a = eVar;
            this.b = iVar;
        }

        public TtsError a() {
            com.baidu.tts.auth.b.a a = com.baidu.tts.auth.a.a().a(this.a.b);
            if (a == null) {
                return com.baidu.tts.h.a.c.a().b(n.OFFLINE_ENGINE_AUTH_NULL);
            }
            if (!a.g()) {
                return a.b();
            }
            LoggerProxy.d("OfflineSynthesizer", "engineResult = " + EmbeddedSynthesizerEngine.bdTTSSetParam(this.a.c[0], 0, 0));
            EmbeddedSynthesizerEngine.bdTTSSetParam(this.a.c[0], 5, this.a.b.x());
            EmbeddedSynthesizerEngine.bdTTSSetParam(this.a.c[0], 6, this.a.b.y());
            EmbeddedSynthesizerEngine.bdTTSSetParam(this.a.c[0], 7, this.a.b.z());
            EmbeddedSynthesizerEngine.bdTTSSetParam(this.a.c[0], 17, this.a.b.a());
            EmbeddedSynthesizerEngine.bdTTSSetParam(this.a.c[0], 18, this.a.b.b());
            EmbeddedSynthesizerEngine.bdTTSSetParam(this.a.c[0], 19, this.a.b.c());
            EmbeddedSynthesizerEngine.bdTTSSetParam(this.a.c[0], 9, this.a.b.t());
            EmbeddedSynthesizerEngine.setOnNewDataListener(this);
            this.b.c(com.baidu.tts.f.d.GBK.a());
            byte[] e = this.b.e();
            LoggerProxy.d("OfflineSynthesizer", "before bdttssynthesis");
            int bdTTSSynthesis = EmbeddedSynthesizerEngine.bdTTSSynthesis(this.a.c[0], e, e.length);
            LoggerProxy.d("OfflineSynthesizer", "after bdttssynthesis result = " + bdTTSSynthesis);
            try {
                new a(this.a, bdTTSSynthesis).start();
            } catch (Exception e2) {
                LoggerProxy.d("OfflineSynthesizer", "AddPVResultsToDB start exception=" + e2.toString());
            }
            return bdTTSSynthesis == 0 ? null : com.baidu.tts.h.a.c.a().a(n.OFFLINE_ENGINE_SYNTHESIZE_ERROR, bdTTSSynthesis);
        }

        public /* synthetic */ Object call() {
            return a();
        }

        public int onNewData(byte[] bArr, int i) {
            h b = h.b(this.b);
            b.d(f.OFFLINE.a());
            b.a(com.baidu.tts.f.a.PCM);
            b.a(bArr);
            b.c(i);
            this.c++;
            b.b(this.c);
            this.a.a(b);
            if (!Thread.currentThread().isInterrupted()) {
                return 0;
            }
            LoggerProxy.d("OfflineSynthesizer", "interrupted to interrupt syn");
            return -1;
        }
    }

    public int a(com.baidu.tts.m.e eVar) {
        return EmbeddedSynthesizerEngine.bdTTSDomainDataInit(ResourceTools.stringToByteArrayAddNull(eVar.a()), this.c[0]);
    }

    public int a(com.baidu.tts.m.f fVar) {
        Object b = fVar.b();
        Object a = fVar.a();
        boolean isEmpty = TextUtils.isEmpty(b);
        if (TextUtils.isEmpty(a) || isEmpty) {
            return n.TTS_PARAMETER_INVALID.b();
        }
        int loadEnglishEngine = EmbeddedSynthesizerEngine.loadEnglishEngine(ResourceTools.stringToByteArrayAddNull(a), ResourceTools.stringToByteArrayAddNull(b), this.c[0]);
        LoggerProxy.d("OfflineSynthesizer", "loadEnglishModel ret=" + loadEnglishEngine);
        return loadEnglishEngine;
    }

    public int a(g gVar) {
        int i = 0;
        Object b = gVar.b();
        Object a = gVar.a();
        boolean isEmpty = TextUtils.isEmpty(b);
        boolean isEmpty2 = TextUtils.isEmpty(a);
        if (isEmpty && isEmpty2) {
            return n.TTS_PARAMETER_INVALID.b();
        }
        int bdTTSReInitData = !isEmpty ? EmbeddedSynthesizerEngine.bdTTSReInitData(ResourceTools.stringToByteArrayAddNull(b), this.c[0]) : 0;
        if (!isEmpty2) {
            i = EmbeddedSynthesizerEngine.bdTTSReInitData(ResourceTools.stringToByteArrayAddNull(a), this.c[0]);
        }
        return i + bdTTSReInitData;
    }

    public TtsError a() {
        try {
            this.d = com.baidu.tts.e.c.a(com.baidu.tts.h.b.b.a().h());
            this.d.a();
        } catch (Exception e) {
            LoggerProxy.d("OfflineSynthesizer", "embedded statistics open exception=" + e.toString());
        }
        if (this.b == null) {
            this.b = new b();
        }
        com.baidu.tts.auth.b.a a = com.baidu.tts.auth.a.a().a(this.b);
        if (!a.g()) {
            return a.b();
        }
        String d = this.b.d();
        String e2 = this.b.e();
        byte[] stringToByteArrayAddNull = ResourceTools.stringToByteArrayAddNull(d);
        byte[] stringToByteArrayAddNull2 = ResourceTools.stringToByteArrayAddNull(e2);
        LoggerProxy.d("OfflineSynthesizer", "before bdTTSEngineInit");
        int bdTTSEngineInit = EmbeddedSynthesizerEngine.bdTTSEngineInit(stringToByteArrayAddNull, stringToByteArrayAddNull2, this.c);
        LoggerProxy.d("OfflineSynthesizer", "engine init ret = " + bdTTSEngineInit);
        return bdTTSEngineInit == 0 ? null : com.baidu.tts.h.a.c.a().a(n.OFFLINE_ENGINE_INIT_FAILED, bdTTSEngineInit, "bdTTSEngineInit result not 0");
    }

    public TtsError a(i iVar) {
        try {
            return new c(this, iVar).a();
        } catch (InterruptedException e) {
            throw e;
        } catch (Throwable e2) {
            return com.baidu.tts.h.a.c.a().a(n.OFFLINE_ENGINE_CALL_EXCEPTION, e2);
        }
    }

    public <OfflineSynthesizerParams> void a(OfflineSynthesizerParams offlineSynthesizerParams) {
        this.b = (b) offlineSynthesizerParams;
    }

    public int b(com.baidu.tts.m.e eVar) {
        return EmbeddedSynthesizerEngine.bdTTSDomainDataUninit(this.c[0]);
    }

    public TtsError b() {
        EmbeddedSynthesizerEngine.bdTTSEngineUninit(this.c[0]);
        try {
            synchronized (this.d) {
                if (!this.d.d()) {
                    this.d.c();
                    com.baidu.tts.e.c.e();
                }
            }
        } catch (Exception e) {
            LoggerProxy.d("OfflineSynthesizer", "embedded statistics release exception=" + e.toString());
        }
        return null;
    }
}
