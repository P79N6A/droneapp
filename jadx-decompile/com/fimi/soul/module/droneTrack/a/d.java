package com.fimi.soul.module.droneTrack.a;

import android.os.Handler;
import com.fimi.soul.module.droneTrack.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class d {
    private e a;
    private e b;
    private e c;
    private e d;
    private e e;
    private Handler f = new Handler();
    private Runnable g = new Runnable(this) {
        final /* synthetic */ d a;

        {
            this.a = r1;
        }

        public void run() {
            if (this.a.a.a() && this.a.b.a() && this.a.c.a() && this.a.d.a()) {
                HashMap b = b.a().b();
                this.a.a.b().size();
                this.a.b.b().size();
                this.a.c.b().size();
                this.a.d.b().size();
                b.putAll(this.a.a.b());
                this.a.a(b, this.a.b.b());
                this.a.a(b, this.a.c.b());
                this.a.a(b, this.a.d.b());
                Collections.sort(new ArrayList(b.entrySet()), new Comparator<Entry<Integer, List<Object>>>(this) {
                    final /* synthetic */ AnonymousClass1 a;

                    {
                        this.a = r1;
                    }

                    public int a(Entry<Integer, List<Object>> entry, Entry<Integer, List<Object>> entry2) {
                        return ((Integer) entry.getKey()).intValue() - ((Integer) entry2.getKey()).intValue();
                    }

                    public /* synthetic */ int compare(Object obj, Object obj2) {
                        return a((Entry) obj, (Entry) obj2);
                    }
                });
                if (this.a.e != null) {
                    this.a.e.a();
                    return;
                }
                return;
            }
            this.a.f.postDelayed(this, 1000);
        }
    };

    public d(e eVar) {
        this.e = eVar;
        this.a = new e();
        this.b = new e();
        this.c = new e();
        this.d = new e();
    }

    private void a(HashMap<Integer, List<Object>> hashMap, HashMap<Integer, List<Object>> hashMap2) {
        int size = hashMap.size();
        for (Entry entry : hashMap2.entrySet()) {
            hashMap.put(Integer.valueOf(((Integer) entry.getKey()).intValue() + size), entry.getValue());
        }
    }

    public e a() {
        return this.d;
    }

    public e b() {
        return this.c;
    }

    public e c() {
        return this.b;
    }

    public e d() {
        return this.a;
    }

    public void e() {
        this.f.post(this.g);
    }
}
