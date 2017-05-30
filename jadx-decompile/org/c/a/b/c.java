package org.c.a.b;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import org.c.e.j;

public class c implements Serializable {
    private static final long serialVersionUID = 1;
    private final Map<String, Long> a = new HashMap();
    private final Map<String, Long> b = new HashMap();
    private final File c;

    private final class a extends org.c.e.b.b {
        final /* synthetic */ c a;
        private long b;
        private Map<org.c.e.c, Long> c;

        private a(c cVar) {
            this.a = cVar;
            this.b = System.currentTimeMillis();
            this.c = new HashMap();
        }

        public void a(org.c.e.b.a aVar) {
            this.a.a(aVar.b(), this.b);
        }

        public void a(org.c.e.c cVar) {
            this.a.b(cVar, System.nanoTime() - ((Long) this.c.get(cVar)).longValue());
        }

        public void a(j jVar) {
            this.a.c();
        }

        public void b(org.c.e.c cVar) {
            this.c.put(cVar, Long.valueOf(System.nanoTime()));
        }
    }

    private class b implements Comparator<org.c.e.c> {
        final /* synthetic */ c a;

        private b(c cVar) {
            this.a = cVar;
        }

        private Long a(org.c.e.c cVar) {
            Long a = this.a.a(cVar);
            return a == null ? Long.valueOf(0) : a;
        }

        public int a(org.c.e.c cVar, org.c.e.c cVar2) {
            if (this.a.b(cVar)) {
                return -1;
            }
            if (this.a.b(cVar2)) {
                return 1;
            }
            int compareTo = a(cVar2).compareTo(a(cVar));
            return compareTo == 0 ? this.a.c(cVar).compareTo(this.a.c(cVar2)) : compareTo;
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return a((org.c.e.c) obj, (org.c.e.c) obj2);
        }
    }

    private c(File file) {
        this.c = file;
    }

    public static c a(File file) {
        if (file.exists()) {
            try {
                return b(file);
            } catch (a e) {
                e.printStackTrace();
                file.delete();
            }
        }
        return new c(file);
    }

    private static c b(File file) {
        ObjectInputStream objectInputStream;
        try {
            InputStream fileInputStream = new FileInputStream(file);
            try {
                objectInputStream = new ObjectInputStream(fileInputStream);
                c cVar = (c) objectInputStream.readObject();
                objectInputStream.close();
                fileInputStream.close();
                return cVar;
            } catch (Throwable th) {
                fileInputStream.close();
            }
        } catch (Throwable e) {
            throw new a(e);
        }
    }

    private void c() {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(this.c));
        objectOutputStream.writeObject(this);
        objectOutputStream.close();
    }

    Long a(org.c.e.c cVar) {
        return (Long) this.b.get(cVar.toString());
    }

    public org.c.e.b.b a() {
        return new a();
    }

    void a(org.c.e.c cVar, long j) {
        this.b.put(cVar.toString(), Long.valueOf(j));
    }

    public Comparator<org.c.e.c> b() {
        return new b();
    }

    void b(org.c.e.c cVar, long j) {
        this.a.put(cVar.toString(), Long.valueOf(j));
    }

    boolean b(org.c.e.c cVar) {
        return !this.a.containsKey(cVar.toString());
    }

    Long c(org.c.e.c cVar) {
        return (Long) this.a.get(cVar.toString());
    }
}
