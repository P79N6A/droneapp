package org.c.e;

import java.io.ObjectInputStream;
import java.io.ObjectInputStream.GetField;
import java.io.ObjectOutputStream;
import java.io.ObjectOutputStream.PutField;
import java.io.ObjectStreamClass;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.c.e.b.a;

public class j implements Serializable {
    private static final ObjectStreamField[] serialPersistentFields = ObjectStreamClass.lookup(b.class).getFields();
    private static final long serialVersionUID = 1;
    private final AtomicInteger a;
    private final AtomicInteger b;
    private final CopyOnWriteArrayList<a> c;
    private final AtomicLong d;
    private final AtomicLong e;
    private b f;

    private static class b implements Serializable {
        private static final long serialVersionUID = 1;
        private final AtomicInteger a;
        private final AtomicInteger b;
        private final List<a> c;
        private final long d;
        private final long e;

        private b(GetField getField) {
            this.a = (AtomicInteger) getField.get("fCount", null);
            this.b = (AtomicInteger) getField.get("fIgnoreCount", null);
            this.c = (List) getField.get("fFailures", null);
            this.d = getField.get("fRunTime", 0);
            this.e = getField.get("fStartTime", 0);
        }

        public b(j jVar) {
            this.a = jVar.a;
            this.b = jVar.b;
            this.c = Collections.synchronizedList(new ArrayList(jVar.c));
            this.d = jVar.d.longValue();
            this.e = jVar.e.longValue();
        }

        public static b a(ObjectInputStream objectInputStream) {
            return new b(objectInputStream.readFields());
        }

        public void a(ObjectOutputStream objectOutputStream) {
            PutField putFields = objectOutputStream.putFields();
            putFields.put("fCount", this.a);
            putFields.put("fIgnoreCount", this.b);
            putFields.put("fFailures", this.c);
            putFields.put("fRunTime", this.d);
            putFields.put("fStartTime", this.e);
            objectOutputStream.writeFields();
        }
    }

    public j() {
        this.a = new AtomicInteger();
        this.b = new AtomicInteger();
        this.c = new CopyOnWriteArrayList();
        this.d = new AtomicLong();
        this.e = new AtomicLong();
    }

    private j(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = new CopyOnWriteArrayList(bVar.c);
        this.d = new AtomicLong(bVar.d);
        this.e = new AtomicLong(bVar.e);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.f = b.a(objectInputStream);
    }

    private Object readResolve() {
        return new j(this.f);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        new b(this).a(objectOutputStream);
    }

    public int a() {
        return this.a.get();
    }

    public int b() {
        return this.c.size();
    }

    public long c() {
        return this.d.get();
    }

    public List<a> d() {
        return this.c;
    }

    public int e() {
        return this.b.get();
    }

    public boolean f() {
        return b() == 0;
    }

    public org.c.e.b.b g() {
        return new a(this, null);
    }
}
