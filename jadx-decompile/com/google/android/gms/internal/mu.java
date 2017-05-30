package com.google.android.gms.internal;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.mz.a;
import com.google.android.gms.internal.mz.b;
import com.google.android.gms.internal.mz.c;
import com.google.android.gms.internal.mz.d;
import com.google.android.gms.internal.mz.e;
import com.google.android.gms.internal.mz.f;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class mu implements Runnable {
    public final Context a;
    public final mv b;
    public final mv c;
    public final mv d;
    public final my e;

    public mu(Context context, mv mvVar, mv mvVar2, mv mvVar3, my myVar) {
        this.a = context;
        this.b = mvVar;
        this.c = mvVar2;
        this.d = mvVar3;
        this.e = myVar;
    }

    private a a(mv mvVar) {
        a aVar = new a();
        if (mvVar.a() != null) {
            Map a = mvVar.a();
            List arrayList = new ArrayList();
            for (String str : a.keySet()) {
                List arrayList2 = new ArrayList();
                Map map = (Map) a.get(str);
                for (String str2 : map.keySet()) {
                    b bVar = new b();
                    bVar.a = str2;
                    bVar.b = (byte[]) map.get(str2);
                    arrayList2.add(bVar);
                }
                d dVar = new d();
                dVar.a = str;
                dVar.b = (b[]) arrayList2.toArray(new b[arrayList2.size()]);
                arrayList.add(dVar);
            }
            aVar.a = (d[]) arrayList.toArray(new d[arrayList.size()]);
        }
        aVar.b = mvVar.c();
        return aVar;
    }

    public void run() {
        rd eVar = new e();
        if (this.b != null) {
            eVar.a = a(this.b);
        }
        if (this.c != null) {
            eVar.b = a(this.c);
        }
        if (this.d != null) {
            eVar.c = a(this.d);
        }
        if (this.e != null) {
            c cVar = new c();
            cVar.a = this.e.a();
            cVar.b = this.e.b();
            eVar.d = cVar;
        }
        if (!(this.e == null || this.e.c() == null)) {
            List arrayList = new ArrayList();
            Map c = this.e.c();
            for (String str : c.keySet()) {
                if (c.get(str) != null) {
                    f fVar = new f();
                    fVar.c = str;
                    fVar.b = ((mt) c.get(str)).b();
                    fVar.a = ((mt) c.get(str)).a();
                    arrayList.add(fVar);
                }
            }
            eVar.e = (f[]) arrayList.toArray(new f[arrayList.size()]);
        }
        byte[] a = rd.a(eVar);
        try {
            FileOutputStream openFileOutput = this.a.openFileOutput("persisted_config", 0);
            openFileOutput.write(a);
            openFileOutput.close();
        } catch (Throwable e) {
            Log.e("AsyncPersisterTask", "Could not persist config.", e);
        }
    }
}
