package com.fimi.kernel.b.d;

import android.os.Message;
import com.fimi.kernel.b;
import com.fimi.kernel.b.c.a;
import com.fimi.kernel.b.c.d;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class c extends b implements a {
    private static c f = null;
    boolean a = true;
    private d b = new d();
    private Socket c = null;
    private DataOutputStream d;
    private DataInputStream e;
    private List<d> g = new ArrayList();
    private List<a> h = new ArrayList();
    private boolean i = true;
    private StringBuffer j = new StringBuffer();

    public static synchronized c c() {
        c cVar;
        synchronized (c.class) {
            if (f == null) {
                f = new c();
            }
            cVar = f;
        }
        return cVar;
    }

    private void c(String str) {
        this.a = false;
        Message message = new Message();
        message.obj = str;
        a().sendMessage(message);
    }

    protected void a(Message message) {
        if (message != null && message.obj != null) {
            for (d a : this.g) {
                a.a(message.obj.toString());
            }
        }
    }

    public void a(a aVar) {
        if (this.h.contains(aVar)) {
            this.h.remove(aVar);
        }
    }

    public void a(d dVar) {
        if (this.g.contains(dVar)) {
            this.g.remove(dVar);
        }
    }

    public void a(d dVar) {
        this.b = dVar;
    }

    public void a(byte[] bArr) {
        try {
            if (this.i && this.b.c()) {
                h();
            }
            if (this.d != null) {
                this.d.write(bArr);
                this.d.flush();
            }
        } catch (IOException e) {
            this.i = true;
            e.printStackTrace();
        }
    }

    public void a(byte[] bArr, int i, int i2) {
        try {
            if (this.i && this.b.c()) {
                h();
            }
            this.d.write(bArr, i, i2);
            this.d.flush();
        } catch (IOException e) {
            this.i = true;
        }
    }

    public boolean a(String str) {
        this.b.a(str);
        return d();
    }

    public boolean a(String str, int i) {
        this.b.a(str);
        this.b.a(i);
        return d();
    }

    public void b(a aVar) {
        if (aVar != null) {
            this.h.add(aVar);
        }
    }

    public void b(d dVar) {
        if (dVar != null) {
            this.g.add(dVar);
        }
    }

    public void b(String str) {
        a(str.getBytes());
    }

    public boolean b() {
        return this.c == null ? false : this.c.isConnected();
    }

    public boolean d() {
        try {
            this.c = new Socket(this.b.a(), this.b.b());
            this.c.setSoLinger(true, 0);
            this.d = new DataOutputStream(this.c.getOutputStream());
            this.e = new DataInputStream(this.c.getInputStream());
            a(new Runnable(this) {
                final /* synthetic */ c a;

                {
                    this.a = r1;
                }

                public void run() {
                    byte[] bArr = new byte[this.a.b.e()];
                    do {
                        if (this.a.c.isConnected()) {
                            while (true) {
                                this.a.i = false;
                                int read = this.a.e.read(bArr);
                                if (read == -1) {
                                    break;
                                } else if (this.a.h.size() > 0) {
                                    for (a a : this.a.h) {
                                        a.a(read, bArr);
                                    }
                                } else {
                                    try {
                                        String str = new String(bArr, 0, read, this.a.b.f());
                                        if (this.a.b.d()) {
                                            this.a.c(str);
                                        } else {
                                            String replace = str.replace(" ", "");
                                            if (replace.startsWith("{\"rval\":") || replace.startsWith("{\"msg_id\"")) {
                                                this.a.j.delete(0, this.a.j.length());
                                                this.a.a = true;
                                            }
                                            if (this.a.a) {
                                                this.a.j.append(str);
                                                if (this.a.j.toString().contains(":1282") && (this.a.j.length() > 50000 || str.endsWith("]}"))) {
                                                    str = this.a.j.toString();
                                                    if (str.length() > 50000) {
                                                        str = str.substring(0, 50000);
                                                        str = str.substring(0, str.lastIndexOf("}") + 1) + "]}";
                                                    }
                                                    this.a.c(str);
                                                    this.a.j.delete(0, this.a.j.length());
                                                } else if (!this.a.j.toString().contains(":1282") && str.endsWith("}")) {
                                                    this.a.c(this.a.j.toString());
                                                    this.a.j.delete(0, this.a.j.length());
                                                }
                                            }
                                        }
                                    } catch (Exception e) {
                                        this.a.i = true;
                                        e.printStackTrace();
                                        return;
                                    }
                                }
                            }
                        }
                    } while (!this.a.i);
                }
            });
            return true;
        } catch (Exception e) {
            this.i = true;
            e.printStackTrace();
            return false;
        }
    }

    public boolean e() {
        return this.i;
    }

    public d f() {
        return this.b;
    }

    public void g() {
        try {
            this.d.close();
            this.d = null;
        } catch (Exception e) {
        }
        try {
            this.e.close();
            this.e = null;
        } catch (Exception e2) {
        }
        try {
            this.c.close();
        } catch (Exception e3) {
        }
        this.i = true;
    }

    protected boolean h() {
        g();
        d();
        return false;
    }
}
