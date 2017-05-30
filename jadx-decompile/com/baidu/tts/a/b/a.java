package com.baidu.tts.a.b;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.baidu.tts.aop.tts.ITts;
import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.aop.tts.TtsFactory;
import com.baidu.tts.aop.ttslistener.TtsListener;
import com.baidu.tts.auth.AuthInfo;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.client.SpeechError;
import com.baidu.tts.client.SpeechSynthesizeBag;
import com.baidu.tts.client.SpeechSynthesizer;
import com.baidu.tts.client.SpeechSynthesizerListener;
import com.baidu.tts.client.TtsMode;
import com.baidu.tts.f.g;
import com.baidu.tts.f.l;
import com.baidu.tts.f.n;
import com.baidu.tts.m.e;
import com.baidu.tts.m.f;
import com.baidu.tts.m.h;
import com.baidu.tts.m.i;
import com.baidu.tts.tools.ResourceTools;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.AbortPolicy;
import java.util.concurrent.TimeUnit;

public class a {
    private ITts a = g();
    private SpeechSynthesizerListener b;
    private ThreadPoolExecutor c;
    private TtsListener d = new TtsListener(this) {
        final /* synthetic */ a a;

        {
            this.a = r1;
        }

        private boolean a(h hVar) {
            try {
                switch (hVar.f().getTtsErrorFlyweight().a()) {
                    case MIX_AUTH_INTERRUPTED_EXCEPTION:
                    case OFFLINE_AUTH_INTERRUPTED_EXCEPTION:
                    case ONLINE_AUTH_INTERRUPTED_EXCEPTION:
                        return true;
                    default:
                        return false;
                }
            } catch (Exception e) {
                LoggerProxy.d("SpeechSynthesizerAdapter", "isStopped exception=" + e.toString());
                return false;
            }
        }

        public void onError(h hVar) {
            if (this.a.b != null && !a(hVar)) {
                this.a.b.onError(this.a.a(hVar), this.a.b(hVar));
            }
        }

        public void onPlayFinished(h hVar) {
            if (this.a.b != null) {
                this.a.b.onSpeechFinish(this.a.a(hVar));
            }
        }

        public void onPlayProgressUpdate(h hVar) {
            if (this.a.b != null) {
                this.a.b.onSpeechProgressChanged(this.a.a(hVar), hVar.c());
            }
        }

        public void onPlayStart(h hVar) {
            if (this.a.b != null) {
                this.a.b.onSpeechStart(this.a.a(hVar));
            }
        }

        public void onSynthesizeDataArrived(h hVar) {
            if (this.a.b != null) {
                this.a.b.onSynthesizeDataArrived(this.a.a(hVar), hVar.d(), hVar.c());
            }
        }

        public void onSynthesizeFinished(h hVar) {
            if (this.a.b != null) {
                this.a.b.onSynthesizeFinish(this.a.a(hVar));
            }
        }

        public void onSynthesizeStart(h hVar) {
            if (this.a.b != null) {
                this.a.b.onSynthesizeStart(this.a.a(hVar));
            }
        }
    };

    private class a implements Callable<Void> {
        List<SpeechSynthesizeBag> a;
        final /* synthetic */ a b;

        public a(a aVar, List<SpeechSynthesizeBag> list) {
            this.b = aVar;
            this.a = list;
        }

        public Void a() {
            if (this.a != null) {
                int size = this.a.size();
                if (size > 0) {
                    for (int i = 0; i < size; i++) {
                        SpeechSynthesizeBag speechSynthesizeBag = (SpeechSynthesizeBag) this.a.get(i);
                        if (speechSynthesizeBag != null) {
                            String text = speechSynthesizeBag.getText();
                            CharSequence utteranceId = speechSynthesizeBag.getUtteranceId();
                            if (TextUtils.isEmpty(utteranceId)) {
                                utteranceId = String.valueOf(i);
                                speechSynthesizeBag.setUtteranceId(utteranceId);
                            }
                            CharSequence charSequence = utteranceId;
                            if (Thread.currentThread().isInterrupted()) {
                                break;
                            }
                            i iVar = new i(text, charSequence);
                            iVar.a(com.baidu.tts.f.i.SPEAK);
                            this.b.a.speak(iVar);
                        }
                    }
                }
            }
            return null;
        }

        public /* synthetic */ Object call() {
            return a();
        }
    }

    private class b implements Callable<Void> {
        final /* synthetic */ a a;
        private String b;
        private String c;

        public b(a aVar, String str, String str2) {
            this.a = aVar;
            this.b = str;
            this.c = str2;
        }

        public Void a() {
            i iVar = new i(this.b, this.c);
            iVar.a(com.baidu.tts.f.i.SPEAK);
            this.a.a.speak(iVar);
            return null;
        }

        public /* synthetic */ Object call() {
            return a();
        }
    }

    private class c implements Callable<Void> {
        final /* synthetic */ a a;
        private String b;
        private String c;

        public c(a aVar, String str, String str2) {
            this.a = aVar;
            this.b = str;
            this.c = str2;
        }

        public Void a() {
            i iVar = new i(this.b, this.c);
            iVar.a(com.baidu.tts.f.i.SYNTHESIZE);
            this.a.a.synthesize(iVar);
            return null;
        }

        public /* synthetic */ Object call() {
            return a();
        }
    }

    public a() {
        this.a.setTtsListener(this.d);
    }

    private int a(String str, Callable<Void> callable) {
        n isTextValid = ResourceTools.isTextValid(str);
        return isTextValid == null ? a((Callable) callable) : isTextValid.b();
    }

    private int a(Callable<Void> callable) {
        try {
            h().submit(callable);
            return 0;
        } catch (RejectedExecutionException e) {
            Log.e("bdtts-Queue", " count=" + ((ThreadPoolExecutor) h()).getQueue().size());
            return SpeechSynthesizer.ERROR_QUEUE_IS_FULL;
        }
    }

    private String a(h hVar) {
        if (hVar != null) {
            i e = hVar.e();
            if (e != null) {
                return e.f();
            }
        }
        LoggerProxy.d("SpeechSynthesizerAdapter", "getUtteranceId null");
        return null;
    }

    private SpeechError b(h hVar) {
        SpeechError speechError;
        if (hVar != null) {
            TtsError f = hVar.f();
            if (f != null) {
                int detailCode = f.getDetailCode();
                String detailMessage = f.getDetailMessage();
                speechError = new SpeechError();
                speechError.code = detailCode;
                speechError.description = detailMessage;
                return speechError;
            }
            LoggerProxy.d("SpeechSynthesizerAdapter", "ttsError is null");
        }
        speechError = new SpeechError();
        speechError.code = n.TTS_ERROR_UNKNOW.b();
        speechError.description = n.TTS_ERROR_UNKNOW.c();
        return speechError;
    }

    private ITts g() {
        return (ITts) new TtsFactory().makeProxy();
    }

    private synchronized ExecutorService h() {
        if (this.c == null) {
            this.c = new com.baidu.tts.c.a(1000, "SpeechSynthesizerPoolThread", new AbortPolicy());
        }
        return this.c;
    }

    private void i() {
        if (this.c != null) {
            if (!this.c.isShutdown()) {
                this.c.shutdownNow();
            }
            try {
                LoggerProxy.d("SpeechSynthesizerAdapter", "isTerminated=" + this.c.awaitTermination(l.DEFAULT.a(), TimeUnit.MILLISECONDS));
            } catch (InterruptedException e) {
                LoggerProxy.d("SpeechSynthesizerAdapter", "InterruptedException");
            }
            this.c = null;
        }
    }

    public int a(float f, float f2) {
        return this.a.setStereoVolume(f, f2);
    }

    public int a(int i) {
        return this.a.setAudioStreamType(i);
    }

    public int a(String str) {
        e eVar = new e();
        eVar.a(str);
        return this.a.loadCustomResource(eVar);
    }

    public int a(String str, String str2) {
        try {
            return this.a.setParam(g.valueOf(str), str2);
        } catch (Exception e) {
            return n.TTS_PARAMETER_INVALID.b();
        }
    }

    public int a(String str, String str2, Bundle bundle) {
        return a(str, new b(this, str, str2));
    }

    public int a(List<SpeechSynthesizeBag> list) {
        return list.size() <= 100 ? a(new a(this, list)) : SpeechSynthesizer.ERROR_LIST_IS_TOO_LONG;
    }

    public TtsError a(TtsMode ttsMode) {
        this.a.setMode(ttsMode.getTtsEnum());
        return this.a.b();
    }

    public String a() {
        return com.baidu.tts.h.b.b.a().j();
    }

    public void a(Context context) {
        this.a.setContext(context);
    }

    public void a(SpeechSynthesizerListener speechSynthesizerListener) {
        if (this.b != speechSynthesizerListener) {
            this.b = speechSynthesizerListener;
        }
    }

    public int b() {
        if (this.a != null) {
            this.a.d();
        }
        return 0;
    }

    public int b(String str, String str2) {
        com.baidu.tts.m.g gVar = new com.baidu.tts.m.g();
        gVar.b(str);
        gVar.a(str2);
        return this.a.loadModel(gVar);
    }

    public int b(String str, String str2, Bundle bundle) {
        return a(str, new c(this, str, str2));
    }

    public AuthInfo b(TtsMode ttsMode) {
        return this.a.auth(ttsMode.getTtsEnum());
    }

    public int c() {
        if (this.a != null) {
            this.a.c();
        }
        return 0;
    }

    public int c(String str, String str2) {
        f fVar = new f();
        fVar.a(str);
        fVar.b(str2);
        return this.a.loadEnglishModel(fVar);
    }

    public int d() {
        i();
        if (this.a != null) {
            this.a.e();
        }
        return 0;
    }

    public int e() {
        i();
        if (this.a != null) {
            this.a.f();
            this.a = null;
        }
        return 0;
    }

    public int f() {
        return this.a.freeCustomResource(null);
    }
}
