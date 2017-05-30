package com.baidu.tts.d.a;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.client.model.ModelFileBags;
import com.baidu.tts.f.l;
import com.baidu.tts.f.n;
import com.baidu.tts.h.a.c;
import com.baidu.tts.loopj.ResponseHandlerInterface;
import com.baidu.tts.loopj.SyncHttpClient;
import com.baidu.tts.tools.FileTools;
import com.baidu.tts.tools.StringTool;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.apache.http.Header;

public class b extends com.baidu.tts.j.a {
    private volatile a a = this.b;
    private i b = new i(this);
    private f c = new f(this);
    private d f = new d(this);
    private h g = new h(this);
    private ThreadPoolExecutor h;
    private com.baidu.tts.l.a i;

    public class a implements Callable<Void> {
        final /* synthetic */ b a;
        private c b;
        private SyncHttpClient c;

        public a(b bVar, c cVar) {
            this.a = bVar;
            this.b = cVar;
        }

        public Void a() {
            this.b.d();
            final String a = this.b.a();
            LoggerProxy.d("DownloadEngine", "DownloadWork start fileId=" + a);
            if (StringTool.isEmpty(a)) {
                this.b.a(c.a().a(n.MODEL_REQUEST_ERROR, "fileId is null"));
            } else {
                Set hashSet = new HashSet();
                hashSet.add(a);
                ModelFileBags modelFileBags = (ModelFileBags) this.a.i.a(hashSet).get();
                if (modelFileBags != null) {
                    String url = modelFileBags.getUrl(0);
                    if (url != null) {
                        this.c = new SyncHttpClient();
                        this.c.setURLEncodingEnabled(false);
                        this.c.setTimeout(l.DEFAULT.b());
                        this.c.setMaxRetriesAndTimeout(5, 1500);
                        ResponseHandlerInterface anonymousClass1 = new g(this, FileTools.getFile(this.b.b()), this.b) {
                            final /* synthetic */ a b;

                            public void onFailure(int i, Header[] headerArr, Throwable th, File file) {
                                LoggerProxy.d("DownloadEngine", "1isInterrupted=" + Thread.currentThread().isInterrupted());
                                if (this.b.a.C()) {
                                    super.onFailure(i, headerArr, th, file);
                                }
                            }

                            public void onProgress(long j, long j2) {
                                if (this.b.a.C()) {
                                    super.onProgress(j, j2);
                                }
                            }

                            public void onSuccess(int i, Header[] headerArr, File file) {
                                LoggerProxy.d("DownloadEngine", "2isInterrupted=" + Thread.currentThread().isInterrupted() + "--fileId=" + a);
                                if (this.b.a.C()) {
                                    super.onSuccess(i, headerArr, file);
                                }
                            }
                        };
                        anonymousClass1.setUseSynchronousMode(true);
                        LoggerProxy.d("DownloadEngine", "before get fileId=" + a);
                        this.c.get(url, anonymousClass1);
                    } else {
                        this.b.a(c.a().a(n.MODEL_REQUEST_ERROR, "url is null"));
                    }
                } else {
                    this.b.a(c.a().a(n.MODEL_REQUEST_ERROR, "urlbags is null"));
                }
            }
            LoggerProxy.d("DownloadEngine", "DownloadWork end");
            return null;
        }

        public void b() {
            if (this.c != null) {
                this.c.stop();
            }
        }

        public c c() {
            return this.b;
        }

        public /* synthetic */ Object call() {
            return a();
        }
    }

    public b() {
        b();
    }

    public a a() {
        return this.a;
    }

    public e a(c cVar) {
        return this.a.a(cVar);
    }

    public void a(a aVar) {
        this.a = aVar;
    }

    public void a(com.baidu.tts.l.a aVar) {
        this.i = aVar;
    }

    e b(c cVar) {
        a aVar = new a(this, cVar);
        cVar.c();
        LoggerProxy.d("DownloadEngine", "before submit");
        Future future = null;
        try {
            future = this.h.submit(aVar);
        } catch (Throwable e) {
            LoggerProxy.d("DownloadEngine", "submit exception");
            cVar.a(c.a().a(n.MODEL_FILE_DOWNLOAD_EXCEPTION, e));
        }
        e eVar = new e();
        eVar.a(future);
        eVar.a(aVar);
        return eVar;
    }

    protected TtsError g() {
        return this.a.b();
    }

    protected void h() {
        this.a.a();
    }

    protected void i() {
        this.a.c();
    }

    protected void j() {
        this.a.d();
    }

    protected void k() {
        this.a.e();
    }

    protected void l() {
        this.a.f();
    }

    public boolean m() {
        return this.a == this.g;
    }

    public boolean n() {
        return Thread.currentThread().isInterrupted() || this.a == this.c;
    }

    public i o() {
        return this.b;
    }

    public f p() {
        return this.c;
    }

    public d q() {
        return this.f;
    }

    public h r() {
        return this.g;
    }

    void s() {
        this.h = (ThreadPoolExecutor) Executors.newFixedThreadPool(5, new com.baidu.tts.g.a.a("downloadPoolThread"));
    }

    void t() {
        LoggerProxy.d("DownloadEngine", "enter stop");
        if (this.h != null) {
            if (!this.h.isShutdown()) {
                this.h.shutdownNow();
            }
            try {
                LoggerProxy.d("DownloadEngine", "before awaitTermination");
                LoggerProxy.d("DownloadEngine", "after awaitTermination isTermination=" + this.h.awaitTermination(l.DEFAULT.a(), TimeUnit.MILLISECONDS));
            } catch (InterruptedException e) {
            }
            this.h = null;
        }
        LoggerProxy.d("DownloadEngine", "end stop");
    }
}
