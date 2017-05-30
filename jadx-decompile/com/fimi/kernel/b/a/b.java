package com.fimi.kernel.b.a;

import android.os.Message;
import android.util.Log;
import it.a.a.k;
import java.io.File;

public class b extends com.fimi.kernel.b implements d {
    private static b b;
    private final String a;
    private it.a.a.b c;
    private c d;
    private com.fimi.kernel.b.c.b e;
    private a f;
    private String g;
    private String h;
    private File i;

    private enum a {
        ConnectServer,
        DownloadFile,
        UploadFile
    }

    private b() {
        this.a = b.class.getName();
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.c = new it.a.a.b();
        this.d = new c();
    }

    private boolean a(String str, int i, String str2, String str3, boolean z) {
        try {
            this.c.a(z);
            if (this.c.l()) {
                return true;
            }
            this.c.a(str, i);
            this.c.a(str2, str3);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static synchronized b b() {
        b bVar;
        synchronized (b.class) {
            b = new b();
            bVar = b;
        }
        return bVar;
    }

    protected void a(Message message) {
        boolean z = true;
        if (message.what == a.ConnectServer.ordinal()) {
            if (message.arg1 != 1) {
                z = false;
            }
            if (this.e != null) {
                this.e.a(z, "SUCCESS");
            }
        }
        if ((message.what == a.DownloadFile.ordinal() || message.what == a.UploadFile.ordinal()) && this.f != null) {
            this.f.a(com.fimi.kernel.b.a.a.a.values()[message.arg1], message.arg2);
        }
    }

    public void a(c cVar) {
        this.d = cVar;
    }

    public void a(com.fimi.kernel.b.c.b bVar) {
        this.e = bVar;
        a(new Runnable(this) {
            final /* synthetic */ b a;

            {
                this.a = r1;
            }

            public void run() {
                Message message = new Message();
                message.what = a.ConnectServer.ordinal();
                if (this.a.e()) {
                    message.arg1 = 1;
                } else {
                    message.arg1 = 0;
                }
                this.a.a().sendMessage(message);
            }
        });
    }

    public void a(File file, a aVar) {
        try {
            this.c.a(file, (k) aVar);
        } catch (Exception e) {
            Log.d(this.a, e.toString());
        }
    }

    public void a(String str, int i, com.fimi.kernel.b.c.b bVar) {
        this.d.a(str);
        this.d.a(i);
        a(bVar);
    }

    public void a(String str, a aVar) {
        File file = new File(str);
        if (aVar != null) {
            try {
                this.c.a(file, (k) aVar);
                return;
            } catch (Exception e) {
                Log.d(this.a, e.toString());
                return;
            }
        }
        this.c.a(file);
    }

    public void a(String str, com.fimi.kernel.b.c.b bVar) {
        this.d.a(str);
        a(bVar);
    }

    public void a(String str, String str2, a aVar) {
        try {
            this.c.a(str, new File(str2), (k) aVar);
        } catch (Exception e) {
            Log.d(this.a, e.toString());
        }
    }

    public boolean a(String str) {
        return a(str, this.d.b(), this.d.c(), this.d.d(), this.d.e());
    }

    public boolean a(String str, int i) {
        return a(str, i, this.d.c(), this.d.d(), this.d.e());
    }

    public boolean a(String str, String str2) {
        try {
            this.c.b(str, str2);
            return true;
        } catch (Exception e) {
            Log.d(this.a, e.toString());
            return false;
        }
    }

    public void b(File file, a aVar) {
        this.i = file;
        this.f = aVar;
        a(new Runnable(this) {
            final /* synthetic */ b a;

            {
                this.a = r1;
            }

            public void run() {
                try {
                    if (this.a.i.isFile()) {
                        this.a.c.a(this.a.i, new a(this) {
                            final /* synthetic */ AnonymousClass3 a;

                            {
                                this.a = r1;
                            }

                            public void a(com.fimi.kernel.b.a.a.a aVar, int i) {
                                Message message = new Message();
                                message.what = a.UploadFile.ordinal();
                                message.arg1 = aVar.ordinal();
                                message.arg2 = i;
                                this.a.a.a().sendMessage(message);
                            }
                        });
                    }
                } catch (Exception e) {
                    Log.d(this.a.a, e.toString());
                }
            }
        });
    }

    public void b(String str, a aVar) {
        this.f = aVar;
        if (new File(str).isFile()) {
            b(this.i, aVar);
        }
    }

    public void b(String str, String str2, a aVar) {
        this.f = aVar;
        this.g = str;
        this.h = str2;
        a(new Runnable(this) {
            final /* synthetic */ b a;

            {
                this.a = r1;
            }

            public void run() {
                try {
                    this.a.c.a(this.a.g, new File(this.a.h), new a(this) {
                        final /* synthetic */ AnonymousClass2 a;

                        {
                            this.a = r1;
                        }

                        public void a(com.fimi.kernel.b.a.a.a aVar, int i) {
                            Message message = new Message();
                            message.what = a.DownloadFile.ordinal();
                            message.arg1 = aVar.ordinal();
                            message.arg2 = i;
                            this.a.a.a().sendMessage(message);
                        }
                    });
                } catch (Exception e) {
                }
            }
        });
    }

    public boolean b(String str) {
        try {
            this.c.e(str);
            return true;
        } catch (Exception e) {
            Log.d(this.a, e.toString());
            return false;
        }
    }

    public c c() {
        return this.d;
    }

    public boolean d() {
        return this.c.l();
    }

    public boolean e() {
        return a(this.d.a(), this.d.b(), this.d.c(), this.d.d(), this.d.e());
    }

    public String f() {
        try {
            return this.c.y();
        } catch (Exception e) {
            Log.d(this.a, e.toString());
            return null;
        }
    }

    public String[] g() {
        try {
            return this.c.D();
        } catch (Exception e) {
            Log.d(this.a, e.toString());
            return null;
        }
    }

    public void h() {
        try {
            this.c.c(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
