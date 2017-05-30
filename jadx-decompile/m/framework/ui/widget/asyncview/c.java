package m.framework.ui.widget.asyncview;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;
import java.util.WeakHashMap;
import m.framework.a.g;
import m.framework.a.h;
import m.framework.b.f;

public class c {
    private static final int a = 5;
    private static final int b = 200;
    private static final int c = 40;
    private static final int d = 50;
    private static c e;
    private WeakHashMap<String, Bitmap> f = new WeakHashMap();
    private boolean g;
    private Vector<a> h = new Vector();
    private File i;
    private d[] j = new d[5];
    private Vector<a> k = new Vector();

    public static class a {
        private String a;
        private b b;
        private d c;
        private long d = System.currentTimeMillis();
        private Bitmap e;

        private void a(Bitmap bitmap) {
            this.e = bitmap;
            if (this.b != null) {
                this.b.a(this.a, this.e);
            }
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("url=").append(this.a);
            stringBuilder.append("time=").append(this.d);
            stringBuilder.append("worker=").append(this.c.getName()).append(" (").append(this.c.getId()).append("");
            return stringBuilder.toString();
        }
    }

    private static class b extends Timer {
        private c a;

        public b(c cVar) {
            this.a = cVar;
            schedule(new TimerTask(this) {
                final /* synthetic */ b a;
                private int b;

                {
                    this.a = r1;
                }

                public void run() {
                    if (this.a.a.g) {
                        this.b--;
                        if (this.b <= 0) {
                            this.b = 100;
                            this.a.a();
                        }
                    }
                }
            }, 0, 200);
        }

        private void a() {
            if (this.a.g) {
                long currentTimeMillis = System.currentTimeMillis();
                int i = 0;
                while (i < this.a.j.length) {
                    if (this.a.j[i] == null) {
                        this.a.j[i] = new d(this.a);
                        this.a.j[i].setName("worker " + i);
                        this.a.j[i].c = i == 0;
                        this.a.j[i].start();
                    } else if (currentTimeMillis - this.a.j[i].b > 20000) {
                        this.a.j[i].interrupt();
                        boolean b = this.a.j[i].c;
                        this.a.j[i] = new d(this.a);
                        this.a.j[i].setName("worker " + i);
                        this.a.j[i].c = b;
                        this.a.j[i].start();
                    }
                    i++;
                }
            }
        }
    }

    private static class c extends FilterInputStream {
        InputStream a;

        protected c(InputStream inputStream) {
            super(inputStream);
            this.a = inputStream;
        }

        public long skip(long j) {
            long j2 = 0;
            while (j2 < j) {
                long skip = this.a.skip(j - j2);
                if (skip == 0) {
                    break;
                }
                j2 += skip;
            }
            return j2;
        }
    }

    private static class d extends Thread {
        private c a;
        private long b = System.currentTimeMillis();
        private boolean c;
        private a d;

        public d(c cVar) {
            this.a = cVar;
        }

        private void a() {
            int size = this.a.h.size();
            a aVar = size > 0 ? (a) this.a.h.remove(size - 1) : null;
            if (aVar != null) {
                Bitmap bitmap = (Bitmap) this.a.f.get(aVar.a);
                if (bitmap != null) {
                    this.d = aVar;
                    this.d.c = this;
                    aVar.a(bitmap);
                } else if (new File(this.a.i, m.framework.b.a.c(aVar.a)).exists()) {
                    a(aVar);
                    this.b = System.currentTimeMillis();
                    return;
                } else {
                    if (this.a.k.size() > 40) {
                        while (this.a.h.size() > 0) {
                            this.a.h.remove(0);
                        }
                        this.a.k.remove(0);
                    }
                    this.a.k.add(aVar);
                }
                this.b = System.currentTimeMillis();
                return;
            }
            this.b = System.currentTimeMillis();
            Thread.sleep(30);
        }

        private void a(Bitmap bitmap, File file) {
            try {
                if (file.exists()) {
                    file.delete();
                }
                if (!file.getParentFile().exists()) {
                    file.getParentFile().mkdirs();
                }
                file.createNewFile();
                CompressFormat compressFormat = CompressFormat.JPEG;
                String c = f.c(file.getAbsolutePath());
                if (c != null && (c.endsWith("png") || c.endsWith("gif"))) {
                    compressFormat = CompressFormat.PNG;
                }
                OutputStream fileOutputStream = new FileOutputStream(file);
                bitmap.compress(compressFormat, 100, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (Throwable th) {
                if (file.exists()) {
                    file.delete();
                }
            }
        }

        private void a(final a aVar) {
            Bitmap b;
            this.d = aVar;
            this.d.c = this;
            final File file = new File(this.a.i, m.framework.b.a.c(aVar.a));
            if (file.exists()) {
                b = f.b(file.getAbsolutePath());
                if (b != null) {
                    this.a.f.put(aVar.a, b);
                    aVar.a(b);
                }
                this.d = null;
            } else {
                new g().a(aVar.a, new h(this) {
                    final /* synthetic */ d a;

                    public void a(InputStream inputStream) {
                        Bitmap a = f.a(new c(inputStream));
                        if (a == null || a.isRecycled()) {
                            this.a.d = null;
                            return;
                        }
                        this.a.a(a, file);
                        if (a != null) {
                            this.a.a.f.put(aVar.a, a);
                            aVar.a(a);
                        }
                        this.a.d = null;
                    }
                });
                b = null;
            }
            if (b != null) {
                this.a.f.put(aVar.a, b);
                aVar.a(b);
            }
            this.d = null;
        }

        private void b() {
            a aVar;
            Bitmap bitmap;
            a aVar2 = null;
            if (this.a.k.size() > 0) {
                aVar2 = (a) this.a.k.remove(0);
            }
            if (aVar2 == null) {
                int size = this.a.h.size();
                if (size > 0) {
                    aVar = (a) this.a.h.remove(size - 1);
                    if (aVar == null) {
                        bitmap = (Bitmap) this.a.f.get(aVar.a);
                        if (bitmap == null) {
                            this.d = aVar;
                            this.d.c = this;
                            aVar.a(bitmap);
                        } else {
                            a(aVar);
                        }
                        this.b = System.currentTimeMillis();
                    }
                    this.b = System.currentTimeMillis();
                    Thread.sleep(30);
                    return;
                }
            }
            aVar = aVar2;
            if (aVar == null) {
                this.b = System.currentTimeMillis();
                Thread.sleep(30);
                return;
            }
            bitmap = (Bitmap) this.a.f.get(aVar.a);
            if (bitmap == null) {
                a(aVar);
            } else {
                this.d = aVar;
                this.d.c = this;
                aVar.a(bitmap);
            }
            this.b = System.currentTimeMillis();
        }

        public void interrupt() {
            try {
                super.interrupt();
            } catch (Throwable th) {
            }
        }

        public void run() {
            while (this.a.g) {
                try {
                    if (this.c) {
                        a();
                    } else {
                        b();
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    private c(String str) {
        this.i = new File(str);
        if (!this.i.exists()) {
            this.i.mkdirs();
        }
        b bVar = new b(this);
    }

    public static void a() {
        if (e == null) {
            throw new RuntimeException("Call BitmapProcessor.prepare(String) before start");
        }
        e.g = true;
    }

    public static synchronized void a(String str) {
        synchronized (c.class) {
            if (e == null) {
                e = new c(str);
            }
        }
    }

    public static void a(String str, b bVar) {
        if (e == null) {
            throw new RuntimeException("Call BitmapProcessor.prepare(String) before start");
        } else if (str != null) {
            a aVar = new a();
            aVar.a = str;
            aVar.b = bVar;
            e.h.add(aVar);
            if (e.h.size() > 50) {
                while (e.h.size() > 40) {
                    e.h.remove(0);
                }
            }
            a();
        }
    }

    public static Bitmap b(String str) {
        if (e != null) {
            return (Bitmap) e.f.get(str);
        }
        throw new RuntimeException("Call BitmapProcessor.prepare(String) before start");
    }

    public static void b() {
        int i = 0;
        if (e != null) {
            e.g = false;
            e.h.clear();
            while (i < e.j.length) {
                if (e.j[i] != null) {
                    e.j[i].interrupt();
                }
                i++;
            }
            e = null;
        }
    }
}
